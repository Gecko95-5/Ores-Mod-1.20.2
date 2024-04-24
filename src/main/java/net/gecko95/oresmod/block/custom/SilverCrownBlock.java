package net.gecko95.oresmod.block.custom;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class SilverCrownBlock extends HorizontalFacingBlock {

    private static final VoxelShape SHAPE = Block.createCuboidShape(4, 0, 4, 12, 4, 12);
    public SilverCrownBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
