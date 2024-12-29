package net.wither.new_in_old.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.wither.new_in_old.New_In_Old;
import net.minecraft.util.registry.Registry;



public class ModBlocks {
    public static final Block BLOCK_OF_BAMBOO = registerBlock("block_of_bamboo",
            new PillarBlock(FabricBlockSettings.of(Material.BAMBOO_SAPLING).sounds(BlockSoundGroup.BAMBOO).hardness(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block STRIPPED_BLOCK_OF_BAMBOO = registerBlock("stripped_block_of_bamboo",
            new PillarBlock(FabricBlockSettings.of(Material.BAMBOO_SAPLING).sounds(BlockSoundGroup.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_PLANKS = registerBlock("bamboo_planks",
            new Block(FabricBlockSettings.of(Material.BAMBOO_SAPLING).sounds(BlockSoundGroup.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_BUTTON = registerBlock("bamboo_button",
            new WoodenButtonBlock(FabricBlockSettings.of(Material.BAMBOO_SAPLING).sounds(BlockSoundGroup.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_DOOR = registerBlock("bamboo_door",
            new DoorBlock(FabricBlockSettings.of(Material.BAMBOO_SAPLING).nonOpaque().sounds(BlockSoundGroup.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_FENCE = registerBlock("bamboo_fence",
            new FenceBlock(FabricBlockSettings.of(Material.BAMBOO_SAPLING).sounds(BlockSoundGroup.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_FENCE_GATE = registerBlock("bamboo_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.BAMBOO_SAPLING).sounds(BlockSoundGroup.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_MOSAIC = registerBlock("bamboo_mosaic",
            new Block(FabricBlockSettings.of(Material.BAMBOO_SAPLING).sounds(BlockSoundGroup.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_MOSAIC_SLAB = registerBlock("bamboo_mosaic_slab",
            new SlabBlock(FabricBlockSettings.of(Material.BAMBOO_SAPLING).sounds(BlockSoundGroup.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_MOSAIC_STAIR = registerBlock("bamboo_mosaic_stairs",
            new StairsBlock(ModBlocks.BLOCK_OF_BAMBOO.getDefaultState(), FabricBlockSettings.of(Material.BAMBOO_SAPLING).sounds(BlockSoundGroup.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
    //public static final Block BAMBOO_PRESSSURE_PLATE = registerBlock("bamboo_pressure_plate",
            //new PressurePlateBlock(FabricBlockSettings.of(Material.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_SLAB = registerBlock("bamboo_slab",
            new SlabBlock(FabricBlockSettings.of(Material.BAMBOO_SAPLING).sounds(BlockSoundGroup.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_TRAPDOOR = registerBlock("bamboo_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.of(Material.BAMBOO_SAPLING).nonOpaque().sounds(BlockSoundGroup.BAMBOO)), ItemGroup.BUILDING_BLOCKS);





    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(New_In_Old.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        Registry.register(Registry.ITEM, new Identifier(New_In_Old.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
        return null;
    }

    public static void registerModBlocks() {

    }
}







