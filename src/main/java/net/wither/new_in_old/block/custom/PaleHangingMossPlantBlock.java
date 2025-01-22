package net.wither.new_in_old.block.custom;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractPlantBlock;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Block;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.wither.new_in_old.block.ModBlocks;

public class PaleHangingMossPlantBlock  extends AbstractPlantBlock {
    private static final VoxelShape SHAPE = Block.createCuboidShape(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
    public PaleHangingMossPlantBlock(AbstractBlock.Settings settings) {
        super(settings, Direction.DOWN, SHAPE,  true);
    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) ModBlocks.PALE_HANGING_MOSS;
    }

}
