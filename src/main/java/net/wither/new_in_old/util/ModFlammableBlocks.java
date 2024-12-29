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
    }
}
