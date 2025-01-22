package net.wither.new_in_old.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.MossBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.UndergroundConfiguredFeatures;
import net.wither.new_in_old.world.feature.ModConfiguredFeatures;

public class PaleMossBlock extends MossBlock {
    public PaleMossBlock(Settings settings) {
        super(settings);
    }
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return world.getBlockState(pos.up()).isAir();
    }

    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        ModConfiguredFeatures.UndergroundConfiguredFeatures.PALE_MOSS_PATCH_BONEMEAL.value()
                .generate(world, world.getChunkManager().getChunkGenerator(), random, pos.up());

    }
}
