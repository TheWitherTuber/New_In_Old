package net.wither.new_in_old.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.wither.new_in_old.block.ModBlocks;

public class ModStrippableBlocks {
    public static void registerStrippables(){
        StrippableBlockRegistry.register(ModBlocks.BLOCK_OF_BAMBOO, ModBlocks.STRIPPED_BLOCK_OF_BAMBOO);
        StrippableBlockRegistry.register(ModBlocks.CHERRY_LOG, ModBlocks.STRIPPED_CHERRY_LOG);
        StrippableBlockRegistry.register(ModBlocks.CHERRY_WOOD, ModBlocks.STRIPPED_CHERRY_WOOD);
        StrippableBlockRegistry.register(ModBlocks.PALE_OAK_WOOD, ModBlocks.STRIPPED_PALE_OAK_WOOD);
        StrippableBlockRegistry.register(ModBlocks.PALE_OAK_LOG, ModBlocks.STRIPPED_PALE_OAK_LOG);
    }
}
