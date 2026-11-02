package de.drsnone.snonecraft.block.custom;

import com.mojang.serialization.MapCodec;
import de.drsnone.snonecraft.Snonecraft;
import de.drsnone.snonecraft.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CarvedPumpkinBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.phys.BlockHitResult;
import net.neoforged.neoforge.common.ItemAbilities;

public class VampirePumpkinBlock extends Block {

    public static final MapCodec<VampirePumpkinBlock> CODEC = simpleCodec(VampirePumpkinBlock::new);

    @Override
    public MapCodec<VampirePumpkinBlock> codec() {
        return CODEC;
    }

    public VampirePumpkinBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useItemOn(ItemStack itemStack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (!itemStack.canPerformAction(ItemAbilities.SHEARS_CARVE)) {
            return super.useItemOn(itemStack, state, level, pos, player, hand, hitResult);
        } else if (level instanceof ServerLevel serverLevel) {
            Direction clickedDirection = hitResult.getDirection();
            Direction direction = clickedDirection.getAxis() == Direction.Axis.Y ? player.getDirection().getOpposite() : clickedDirection;

            // Spawnt die Kürbiskerne auf dem Boden
            dropFromBlockInteractLootTable(serverLevel, BuiltInLootTables.CARVE_PUMPKIN, state, level.getBlockEntity(pos), itemStack, player, (ignored, pumpkinSeeds) -> {
                ItemEntity entity = new ItemEntity(level, (double)pos.getX() + 0.5 + (double)direction.getStepX() * 0.65, (double)pos.getY() + 0.1, (double)pos.getZ() + 0.5 + (double)direction.getStepZ() * 0.65, pumpkinSeeds);
                RandomSource random = level.getRandom();
                entity.setDeltaMovement(0.05 * (double)direction.getStepX() + random.nextDouble() * 0.02, 0.05, 0.05 * (double)direction.getStepZ() + random.nextDouble() * 0.02);
                level.addFreshEntity(entity);
            });

            level.playSound(null, pos, SoundEvents.PUMPKIN_CARVE, SoundSource.BLOCKS, 1.0F, 1.0F);

            // WICHTIG: Verwandelt den Block in DEINEN geschnitzten Vampir-Kürbis
            net.minecraft.world.level.block.Block carvedBlock = net.minecraft.core.registries.BuiltInRegistries.BLOCK
                    .get(net.minecraft.resources.Identifier.parse(Snonecraft.MOD_ID + ":carved_vampire_pumpkin"))
                    .map(net.minecraft.core.Holder::value) // Holt den Block aus dem Holder heraus
                    .orElse(net.minecraft.world.level.block.Blocks.PUMPKIN); // Fallback, falls etwas schiefgeht

            // 2. Den Block in der Welt setzen
            level.setBlock(pos, carvedBlock.defaultBlockState().setValue(CarvedPumpkinBlock.FACING, direction), 11);

            itemStack.hurtAndBreak(1, player, hand.asEquipmentSlot());
            level.gameEvent(player, GameEvent.SHEAR, pos);
            player.awardStat(Stats.ITEM_USED.get(Items.SHEARS));
            return InteractionResult.SUCCESS;
        } else {
            return InteractionResult.SUCCESS;
        }
    }
}

