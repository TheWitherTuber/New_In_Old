package net.wither.new_in_old.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wither.new_in_old.New_In_Old;
import net.wither.new_in_old.block.ModBlocks;

public class ModItems {

    public static final Item BAMBOO_SIGN = registerItem("bamboo_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_BAMBOO_SIGN, ModBlocks.WALL_BAMBOO_SIGN));
    public static final Item CHERRY_SIGN = registerItem("cherry_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_CHERRY_SIGN, ModBlocks.WALL_CHERRY_SIGN));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(New_In_Old.MOD_ID, name), item);
    }

    public static void registerModItems(){
        New_In_Old.LOGGER.debug("Registering Mod Items for " + New_In_Old.MOD_ID);
    }
}
