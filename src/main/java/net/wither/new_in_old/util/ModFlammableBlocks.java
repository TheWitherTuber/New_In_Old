package net.wither.new_in_old.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.wither.new_in_old.block.ModBlocks;

public class ModFlammableBlocks {
    public static void registerFlammableBlocks(){
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
        registry.add(ModBlocks.BLOCK_OF_BAMBOO, 5, 5);
        registry.add(ModBlocks.STRIPPED_BLOCK_OF_BAMBOO, 5, 5);
        registry.add(ModBlocks.BAMBOO_TRAPDOOR, 5, 5);
        registry.add(ModBlocks.BAMBOO_BUTTON, 5, 5);
        registry.add(ModBlocks.BAMBOO_DOOR, 5, 5);
        registry.add(ModBlocks.BAMBOO_FENCE, 5, 5);
        registry.add(ModBlocks.BAMBOO_FENCE_GATE, 5, 5);
        registry.add(ModBlocks.BAMBOO_MOSAIC, 5, 5);
        registry.add(ModBlocks.BAMBOO_MOSAIC_SLAB, 5, 5);
        registry.add(ModBlocks.BAMBOO_MOSAIC_STAIRS, 5, 5);
        registry.add(ModBlocks.BAMBOO_SLAB, 5, 5);
        registry.add(ModBlocks.BAMBOO_STAIRS, 5, 5);
        registry.add(ModBlocks.BAMBOO_PLANKS, 5, 5);
        registry.add(ModBlocks.BAMBOO_PRESSSURE_PLATE, 5, 5);
        registry.add(ModBlocks.CHERRY_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_CHERRY_LOG, 5, 5);
        registry.add(ModBlocks.CHERRY_TRAPDOOR, 5, 5);
        registry.add(ModBlocks.CHERRY_BUTTON, 5, 5);
        registry.add(ModBlocks.CHERRY_DOOR, 5, 5);
        registry.add(ModBlocks.CHERRY_FENCE, 5, 5);
        registry.add(ModBlocks.CHERRY_FENCE_GATE, 5, 5);
        registry.add(ModBlocks.CHERRY_WOOD, 5, 5);
        registry.add(ModBlocks.STRIPPED_CHERRY_WOOD, 5, 5);
        registry.add(ModBlocks.CHERRY_SLAB, 5, 5);
        registry.add(ModBlocks.CHERRY_STAIRS, 5, 5);
        registry.add(ModBlocks.CHERRY_PLANKS, 5, 5);
        registry.add(ModBlocks.CHERRY_PRESSSURE_PLATE, 5, 5);
        registry.add(ModBlocks.CHERRY_LEAVES, 5, 5);
    }
}
