package net.wither.new_in_old.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.wither.new_in_old.block.ModBlocks;

public class ModStrippableBlocks {
    public static void registerStrippables(){
        StrippableBlockRegistry.register(ModBlocks.BLOCK_OF_BAMBOO, ModBlocks.STRIPPED_BLOCK_OF_BAMBOO);
    }
}
