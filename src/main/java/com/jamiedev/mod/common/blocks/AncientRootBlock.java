package com.jamiedev.mod.common.blocks;

import com.jamiedev.mod.fabric.init.JamiesModBlocks;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.Nullable;

public class AncientRootBlock  extends Block implements SimpleWaterloggedBlock {
    public static final MapCodec<AncientRootBlock> CODEC = simpleCodec(AncientRootBlock::new);
    public static final BooleanProperty WATERLOGGED;

    public MapCodec<AncientRootBlock> codec() {
        return CODEC;
    }

    public AncientRootBlock(BlockBehaviour.Properties settings) {
        super(settings);
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(WATERLOGGED, false));
    }

    protected boolean skipRendering(BlockState state, BlockState stateFrom, Direction direction) {
        return stateFrom.is(JamiesModBlocks.ANCIENT_ROOTS) && direction.getAxis() == Direction.Axis.Y;
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        FluidState fluidState = ctx.getLevel().getFluidState(ctx.getClickedPos());
        boolean bl = fluidState.getType() == Fluids.WATER;
        return (BlockState)super.getStateForPlacement(ctx).setValue(WATERLOGGED, bl);
    }

    protected BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor world, BlockPos pos, BlockPos neighborPos) {
        if ((Boolean)state.getValue(WATERLOGGED)) {
            world.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }

        return super.updateShape(state, direction, neighborState, world, pos, neighborPos);
    }

    protected FluidState getFluidState(BlockState state) {
        return (Boolean)state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{WATERLOGGED});
    }

    static {
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }
}
