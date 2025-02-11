package com.jamiedev.mod.common.blocks;

import com.google.common.base.Predicates;
import com.jamiedev.mod.fabric.init.JamiesModBlocks;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.pattern.BlockInWorld;
import net.minecraft.world.level.block.state.pattern.BlockPattern;
import net.minecraft.world.level.block.state.pattern.BlockPatternBuilder;
import net.minecraft.world.level.block.state.predicate.BlockStatePredicate;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BygonePortalFrameBlock extends Block {
    public static final MapCodec<BygonePortalFrameBlock> CODEC = simpleCodec(BygonePortalFrameBlock::new);
    public static final DirectionProperty FACING;
    public static final BooleanProperty EYE;
    protected static final VoxelShape FRAME_SHAPE;
    protected static final VoxelShape EYE_SHAPE;
    protected static final VoxelShape FRAME_WITH_EYE_SHAPE;
    private static BlockPattern COMPLETED_FRAME;

    public MapCodec<BygonePortalFrameBlock> codec() {
        return CODEC;
    }

    public BygonePortalFrameBlock(BlockBehaviour.Properties settings) {
        super(settings);
        this.registerDefaultState((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH)).setValue(EYE, false));
    }

    protected boolean useShapeForLightOcclusion(BlockState state) {
        return true;
    }

    protected VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return (Boolean)state.getValue(EYE) ? FRAME_WITH_EYE_SHAPE : FRAME_SHAPE;
    }

    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return (BlockState)((BlockState)this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite())).setValue(EYE, false);
    }

    protected boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }

    protected int getAnalogOutputSignal(BlockState state, Level world, BlockPos pos) {
        return (Boolean)state.getValue(EYE) ? 15 : 0;
    }

    protected BlockState rotate(BlockState state, Rotation rotation) {
        return (BlockState)state.setValue(FACING, rotation.rotate((Direction)state.getValue(FACING)));
    }

    protected BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation((Direction)state.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING, EYE});
    }

    public static BlockPattern getCompletedFramePattern() {
        if (COMPLETED_FRAME == null) {
            COMPLETED_FRAME = BlockPatternBuilder.start().aisle(new String[]{"?vvv?", ">???<", ">???<", ">???<", "?^^^?"}).where('?', BlockInWorld.hasState(BlockStatePredicate.ANY)).where('^', BlockInWorld.hasState(BlockStatePredicate.forBlock(JamiesModBlocks.BYGONE_PORTAL_FRAME).where(EYE, Predicates.equalTo(true)).where(FACING, Predicates.equalTo(Direction.SOUTH)))).where('>', BlockInWorld.hasState(BlockStatePredicate.forBlock(JamiesModBlocks.BYGONE_PORTAL_FRAME).where(EYE, Predicates.equalTo(true)).where(FACING, Predicates.equalTo(Direction.WEST)))).where('v', BlockInWorld.hasState(BlockStatePredicate.forBlock(JamiesModBlocks.BYGONE_PORTAL_FRAME).where(EYE, Predicates.equalTo(true)).where(FACING, Predicates.equalTo(Direction.NORTH)))).where('<', BlockInWorld.hasState(BlockStatePredicate.forBlock(JamiesModBlocks.BYGONE_PORTAL_FRAME).where(EYE, Predicates.equalTo(true)).where(FACING, Predicates.equalTo(Direction.EAST)))).build();
        }

        return COMPLETED_FRAME;
    }

    protected boolean isPathfindable(BlockState state, PathComputationType type) {
        return false;
    }


    static {
        FACING = HorizontalDirectionalBlock.FACING;
        EYE = BlockStateProperties.EYE;
        FRAME_SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 13.0, 16.0);
        EYE_SHAPE = Block.box(4.0, 13.0, 4.0, 12.0, 16.0, 12.0);
        FRAME_WITH_EYE_SHAPE = Shapes.or(FRAME_SHAPE, EYE_SHAPE);
    }
}
