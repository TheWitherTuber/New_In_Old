package net.wither.new_in_old.world.feature;

import net.minecraft.block.*;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.VerticalSurfaceType;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.DarkOakFoliagePlacer;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.wither.new_in_old.NewInOldMain;
import net.wither.new_in_old.block.ModBlocks;

public class ModConfiguredFeatures {


    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> PALE_OAK_TREE =
            ConfiguredFeatures.register("pale_oak_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.PALE_OAK_LOG),
                    new DarkOakTrunkPlacer(6, 2, 1),
                    BlockStateProvider.of(ModBlocks.PALE_OAK_LEAVES),
                    new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                    new TwoLayersFeatureSize(1, 1, 2)).build());

    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> CHERRY_TREE =
            ConfiguredFeatures.register("cherry_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.CHERRY_LOG),
                    new ForkingTrunkPlacer(5, 2, 2),
                    BlockStateProvider.of(ModBlocks.CHERRY_LEAVES),
                    new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static class UndergroundConfiguredFeatures {
        public static RegistryEntry<ConfiguredFeature<SimpleBlockFeatureConfig, ?>> PALE_MOSS_VEGETATION;
        public static RegistryEntry<ConfiguredFeature<VegetationPatchFeatureConfig, ?>> PALE_MOSS_PATCH;
        public static RegistryEntry<ConfiguredFeature<VegetationPatchFeatureConfig, ?>> PALE_MOSS_PATCH_BONEMEAL;


        public static void registerUndergroundConfiguredFeatures() {
            PALE_MOSS_VEGETATION = ConfiguredFeatures.register("pale_moss_vegetation", Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(new WeightedBlockStateProvider(DataPool.<BlockState>builder().add(ModBlocks.PALE_MOSS_CARPET.getDefaultState(), 25).build())));
            PALE_MOSS_PATCH = ConfiguredFeatures.register("pale_moss_patch", Feature.VEGETATION_PATCH, new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE, BlockStateProvider.of(ModBlocks.PALE_MOSS_BLOCK), PlacedFeatures.createEntry(PALE_MOSS_VEGETATION, new PlacementModifier[0]), VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.8F, UniformIntProvider.create(4, 7), 0.3F));
            PALE_MOSS_PATCH_BONEMEAL = ConfiguredFeatures.register("pale_moss_patch_bonemeal", Feature.VEGETATION_PATCH, new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE, BlockStateProvider.of(ModBlocks.PALE_MOSS_BLOCK), PlacedFeatures.createEntry(PALE_MOSS_VEGETATION, new PlacementModifier[0]), VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F));}
    }
    public static void registerConfiguredFeatures() {
        NewInOldMain.LOGGER.debug("registering the ModConfiguredFeatures for " + NewInOldMain.MOD_ID);

    }
}
