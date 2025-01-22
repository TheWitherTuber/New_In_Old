package net.wither.new_in_old.world.feature;

import net.minecraft.block.*;
import net.minecraft.state.property.Properties;
import net.minecraft.structure.processor.StructureProcessorLists;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.VerticalSurfaceType;
import net.minecraft.util.math.floatprovider.ClampedNormalFloatProvider;
import net.minecraft.util.math.floatprovider.UniformFloatProvider;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.intprovider.WeightedListIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryEntryList;
import net.minecraft.world.gen.blockpredicate.BlockPredicate;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.EnvironmentScanPlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RandomOffsetPlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.RandomizedIntBlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.wither.new_in_old.New_In_Old;
import net.minecraft.util.collection.DataPool;
import net.wither.new_in_old.block.ModBlocks;
import java.util.List;

public class ModConfiguredFeatures {
    public static class UndergroundConfiguredFeatures {
        public static RegistryEntry<ConfiguredFeature<SimpleBlockFeatureConfig, ?>> PALE_MOSS_VEGETATION;
        public static RegistryEntry<ConfiguredFeature<VegetationPatchFeatureConfig, ?>> PALE_MOSS_PATCH;
        public static RegistryEntry<ConfiguredFeature<VegetationPatchFeatureConfig, ?>> PALE_MOSS_PATCH_BONEMEAL;


        public static void registerUndergroundConfiguredFeatures() {
            PALE_MOSS_VEGETATION = ConfiguredFeatures.register(
                    "pale_moss_vegetation",
                    Feature.SIMPLE_BLOCK,
                    new SimpleBlockFeatureConfig(
                            new WeightedBlockStateProvider(
                                    DataPool.<BlockState>builder()
                                            .add(ModBlocks.PALE_MOSS_CARPET.getDefaultState(), 25)
                                            .build()
                            )
                    )
            );

            PALE_MOSS_PATCH = ConfiguredFeatures.register("pale_moss_patch", Feature.VEGETATION_PATCH, new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE, BlockStateProvider.of(ModBlocks.PALE_MOSS_BLOCK), PlacedFeatures.createEntry(PALE_MOSS_VEGETATION, new PlacementModifier[0]), VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.8F, UniformIntProvider.create(4, 7), 0.3F));
            PALE_MOSS_PATCH_BONEMEAL = ConfiguredFeatures.register("pale_moss_patch_bonemeal", Feature.VEGETATION_PATCH, new VegetationPatchFeatureConfig(BlockTags.MOSS_REPLACEABLE, BlockStateProvider.of(ModBlocks.PALE_MOSS_BLOCK), PlacedFeatures.createEntry(PALE_MOSS_VEGETATION, new PlacementModifier[0]), VerticalSurfaceType.FLOOR, ConstantIntProvider.create(1), 0.0F, 5, 0.6F, UniformIntProvider.create(1, 2), 0.75F));
        }

    }
    public static void registerConfiguredFeatures() {
        New_In_Old.LOGGER.debug("registering the ModConfiguredFeatures for " + New_In_Old.MOD_ID);

    }
}
