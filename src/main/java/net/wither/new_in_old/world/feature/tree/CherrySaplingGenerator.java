package net.wither.new_in_old.world.feature.tree;

import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;
import net.wither.new_in_old.world.feature.ModConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class CherrySaplingGenerator extends SaplingGenerator {

    @Override
    protected @Nullable RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.CHERRY_TREE;
    }
}
