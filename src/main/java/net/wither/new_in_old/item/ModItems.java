package net.wither.new_in_old.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.item.v1.FabricItemStack;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.wither.new_in_old.New_In_Old;
import net.wither.new_in_old.block.ModBlocks;
import net.wither.new_in_old.sound.ModSounds;

public class ModItems {

    public static final Item BAMBOO_SIGN = registerItem("bamboo_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_BAMBOO_SIGN, ModBlocks.WALL_BAMBOO_SIGN));
    public static final Item CHERRY_SIGN = registerItem("cherry_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_CHERRY_SIGN, ModBlocks.WALL_CHERRY_SIGN));
    public static final Item PALE_OAK_SIGN = registerItem("pale_oak_sign",
            new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_PALE_OAK_SIGN, ModBlocks.WALL_PALE_OAK_SIGN));
    public static final Item MUSIC_DISC_RELIC = registerItem("music_disc_relic",
            new MusicDiscItem(7, ModSounds.RELIC, new FabricItemSettings().maxCount(1).group(ItemGroup.MISC).rarity(Rarity.RARE), 203));
    public static final Item MUSIC_DISC_PRECIPICE = registerItem("music_disc_precipice",
            new MusicDiscItem(7, ModSounds.PRECIPICE, new FabricItemSettings().maxCount(1).group(ItemGroup.MISC).rarity(Rarity.RARE), 203));
    public static final Item MUSIC_DISC_CREATOR = registerItem("music_disc_creator",
            new MusicDiscItem(7, ModSounds.CREATOR, new FabricItemSettings().maxCount(1).group(ItemGroup.MISC).rarity(Rarity.RARE), 203));
    public static final Item MUSIC_DISC_CREATOR_MUSIC_BOX = registerItem("music_disc_creator_music_box",
            new MusicDiscItem(7, ModSounds.CREATOR_MUSIC_BOX, new FabricItemSettings().maxCount(1).group(ItemGroup.MISC).rarity(Rarity.RARE), 203));
    public static final Item RESIN_BRICK = registerItem("resin_brick",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(New_In_Old.MOD_ID, name), item);

    }

    public static void registerModItems(){
        New_In_Old.LOGGER.debug("Registering Mod Items for " + New_In_Old.MOD_ID);
    }
}
