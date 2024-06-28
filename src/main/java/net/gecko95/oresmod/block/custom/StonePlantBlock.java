package net.gecko95.oresmod.block.custom;

import net.gecko95.oresmod.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class StonePlantBlock extends PlantBlock {
    public StonePlantBlock(Settings settings) {
        super(settings);
    }
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(ModTags.Blocks.STONEBARK_PLACEABLE);
    }
}
