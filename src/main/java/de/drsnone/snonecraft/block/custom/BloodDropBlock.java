package de.drsnone.snonecraft.block.custom;

import de.drsnone.snonecraft.Snonecraft;
import de.drsnone.snonecraft.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BloodDropBlock extends Block {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_1;
    private static final VoxelShape SHAPE = BushBlock.box(4.0D, 4.0D, 4.0D, 12.0D, 16.0D, 12.0D);

    public BloodDropBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0));
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    // Prüft, ob der Block an der Decke (unter den Blättern) hängen darf
    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos abovePos = pos.above();
        BlockState aboveState = level.getBlockState(abovePos);
        // Ersetze 'net.minecraft.world.level.block.Blocks.OAK_LEAVES' später gerne durch deine eigenen Vampire-Leaves!
        return aboveState.is(de.drsnone.snonecraft.block.ModBlocks.VAMPIRE_LEAVES.get());
    }

    // Rechtsklick zum Ernten
    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        int age = state.getValue(AGE);

        // Da du nur stage0 und stage1 hast, ist der Tropfen bei Stufe 1 reif!
        if (age == 1) {
            if (!level.isClientSide()) {
                // Drop das Item in der Welt
                Block.popResource(level, pos, new ItemStack(ModItems.BLOOD_DROP_ITEM.get()));

                // Sound abspielen (Beeren pflücken)
                level.playSound(null, pos, net.minecraft.sounds.SoundEvents.SWEET_BERRY_BUSH_PICK_BERRIES,
                        net.minecraft.sounds.SoundSource.BLOCKS, 1.0F, 0.8F + level.getRandom().nextFloat() * 0.4F);

                // Setzt den Tropfen wieder auf die Stufe 0 (blood_drop_stage0) zurück
                level.setBlock(pos, state.setValue(AGE, 0), 3);
            }

            // Signalisiert den Erfolg in NeoForge 26.2
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }


    // Zufälliges Wachstum über Zeit
    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        // Wenn der Tropfen noch unreif (Stufe 0) ist, altert er zu Stufe 1 (erntereif)
        if (state.getValue(AGE) == 0) {
            // Eine 1 zu 5 Chance pro Tick, reif zu werden
            if (random.nextInt(5) == 0) {
                level.setBlock(pos, state.setValue(AGE, 1), 2);
            }
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<net.minecraft.world.level.block.Block, BlockState> builder) {
        builder.add(AGE);
    }
}

