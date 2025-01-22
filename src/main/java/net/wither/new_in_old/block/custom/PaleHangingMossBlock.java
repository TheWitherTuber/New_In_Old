package net.wither.new_in_old.block.custom;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.wither.new_in_old.block.ModBlocks;

public class PaleHangingMossBlock extends AbstractPlantStemBlock {
    private static final VoxelShape SHAPE = Block.createCuboidShape(3, 0, 3, 13, 16, 13);

    public PaleHangingMossBlock(AbstractBlock.Settings settings) {
        super(settings, Direction.DOWN, SHAPE, true, 1);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE; // The shape of the vine.
    }

    @Override
    protected Block getPlant() {
        Block plant = ModBlocks.PALE_HANGING_MOSS_PLANT;

        if (plant == null) {
            // Log error and provide a fallback to prevent crashes
            System.err.println("PALE_HANGING_MOSS_PLANT is null in getPlant()! Using Blocks.AIR as fallback.");
            return Blocks.AIR; // Return a safe fallback (Blocks.AIR) to prevent crashes
        }
        return plant;
    }





    @Override
    protected int getGrowthLength(Random random) {
        return 0;
    }

    @Override
    protected boolean chooseStemState(BlockState state) {
        return false;
    }
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockPos downPos = pos.down();
        BlockState downState = world.getBlockState(downPos);

        // Only grow if the block below is air and plant is valid
        if (downState.isAir() && canGrow(world, pos, state)) {
            System.out.println("Growing at: " + pos);
            world.setBlockState(downPos, this.getDefaultState(), 3);
        }
    }

    private boolean canGrow(World world, BlockPos pos, BlockState state) {
        // Ensure no invalid states or null plants cause issues
        return world.getBlockState(pos.down()).isAir() && this.getPlant() != null;
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        // If the block below is removed, ensure stability
        if (direction == Direction.DOWN && !neighborState.isOf(this)) {
            if (!state.canPlaceAt(world, pos)) {
                // Replace this block with air if it has no valid support
                return Blocks.AIR.getDefaultState();
            }
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }




    @Override
    public BlockState getRandomGrowthState(WorldAccess world) {
        Block plant = this.getPlant(); // Get the plant block from getPlant()

        // Make sure it's not null before using it
        if (plant == null) {
            System.err.println("The plant block is null. Returning default state.");
            return this.getDefaultState(); // Return the default state if there's an issue
        }

        return this.getDefaultState(); // Otherwise return the default state
    }



    @Override
    public void onBroken(WorldAccess world, BlockPos pos, BlockState state) {
        // Only break the PaleHangingMossBlock, no interactions with the plant above
        super.onBroken(world, pos, state);

    }









}
