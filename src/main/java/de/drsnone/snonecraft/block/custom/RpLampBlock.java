package de.drsnone.snonecraft.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.core.Direction;
import javax.annotation.Nullable;

public class RpLampBlock extends Block {
    public static final BooleanProperty LIT = BlockStateProperties.LIT;
    private final boolean isInverted;

    public RpLampBlock(BlockBehaviour.Properties properties, boolean isInverted) {
        super(properties);
        this.isInverted = isInverted;
        // Normale Lampe startet AUS (false), Invertierte Lampe startet AN (true)
        this.registerDefaultState(this.stateDefinition.any().setValue(LIT, isInverted));
    }

    // Prüft direkt beim Platzieren, ob bereits Redstone anliegt
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        boolean hasSignal = context.getLevel().hasNeighborSignal(context.getClickedPos());
        // Wenn invertiert: Leuchtet, wenn KEIN Signal anliegt
        return this.defaultBlockState().setValue(LIT, isInverted ? !hasSignal : hasSignal);
    }

    // Reagiert auf Updates von Nachbarblöcken (z.B. wenn Redstone an/aus geht)
    @Override
    protected void neighborChanged(BlockState state, Level level, BlockPos pos, Block neighborBlock, @Nullable net.minecraft.world.level.redstone.Orientation orientation, boolean isMoving) {
        if (!level.isClientSide()) {
            boolean isLit = state.getValue(LIT);
            boolean hasSignal = level.hasNeighborSignal(pos);
            // Ziel-Zustand berechnen (Invertiert verhält sich spiegelverkehrt)
            boolean shouldBeLit = isInverted ? !hasSignal : hasSignal;

            if (isLit != shouldBeLit) {
                if (isLit) {
                    level.scheduleTick(pos, this, 4);
                } else {
                    level.setBlock(pos, state.setValue(LIT, true), 2);
                }
            }
        }
    }



    // Dieser Tick wird nach der Verzögerung aufgerufen, um die Lampe auszuschalten
    @Override
    protected void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        boolean hasSignal = level.hasNeighborSignal(pos);
        boolean shouldBeLit = isInverted ? !hasSignal : hasSignal;

        if (state.getValue(LIT) && !shouldBeLit) {
            level.setBlock(pos, state.setValue(LIT, false), 2);
        }
    }

    // Registriert die LIT-Eigenschaft im Blockstate des Blocks
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }
}
