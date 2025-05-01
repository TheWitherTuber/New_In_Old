package net.wither.new_in_old.block;

import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.wither.new_in_old.NewInOldMain;
import net.minecraft.util.registry.Registry;
import net.wither.new_in_old.block.custom.*;
import net.wither.new_in_old.world.feature.tree.CherrySaplingGenerator;
import net.wither.new_in_old.world.feature.tree.PaleOakSaplingGenerator;


public class ModBlocks {
    //Bamboo Update//
    public static final Block BLOCK_OF_BAMBOO = registerBlock("block_of_bamboo",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.BAMBOO).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block STRIPPED_BLOCK_OF_BAMBOO = registerBlock("stripped_block_of_bamboo",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.BAMBOO).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_PLANKS = registerBlock("bamboo_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_BUTTON = registerBlock("bamboo_button",
            new WoodenButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON).sounds(BlockSoundGroup.BAMBOO)), ItemGroup.REDSTONE);
    public static final Block BAMBOO_DOOR = registerBlock("bamboo_door",
            new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR).sounds(BlockSoundGroup.BAMBOO)), ItemGroup.REDSTONE);
    public static final Block BAMBOO_FENCE = registerBlock("bamboo_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE).sounds(BlockSoundGroup.BAMBOO)), ItemGroup.DECORATIONS);
    public static final Block BAMBOO_FENCE_GATE = registerBlock("bamboo_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE).sounds(BlockSoundGroup.BAMBOO)), ItemGroup.REDSTONE);
    public static final Block BAMBOO_MOSAIC = registerBlock("bamboo_mosaic",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).sounds(BlockSoundGroup.BAMBOO)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_MOSAIC_SLAB = registerBlock("bamboo_mosaic_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.BAMBOO).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_MOSAIC_STAIRS = registerBlock("bamboo_mosaic_stairs",
            new StairsBlock(ModBlocks.BAMBOO_MOSAIC.getDefaultState(), FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.BAMBOO).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_PRESSSURE_PLATE = registerBlock("bamboo_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING , FabricBlockSettings.of(Material.BAMBOO).noCollision().sounds(BlockSoundGroup.BAMBOO).hardness(0.5f).resistance(0.5f)), ItemGroup.REDSTONE);
    public static final Block BAMBOO_SLAB = registerBlock("bamboo_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.BAMBOO).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_TRAPDOOR = registerBlock("bamboo_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().sounds(BlockSoundGroup.BAMBOO).hardness(3).resistance(3)), ItemGroup.REDSTONE);
    public static final Block BAMBOO_STAIRS = registerBlock("bamboo_stairs",
            new StairsBlock(ModBlocks.BAMBOO_MOSAIC.getDefaultState(), FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.BAMBOO).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);

    public static final Identifier BAMBOO_SIGN_TEXTURE = new Identifier(NewInOldMain.MOD_ID, "entity/signs/bamboo");

    public static final Block STANDING_BAMBOO_SIGN = registerBlock("standing_bamboo_sign",
            new TerraformSignBlock(BAMBOO_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN).hardness(0.5f).resistance(0.5f).noCollision()), ItemGroup.DECORATIONS);
    public static final Block WALL_BAMBOO_SIGN = registerBlock("wall_bamboo_sign",
            new TerraformWallSignBlock(BAMBOO_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).hardness(0.5f).resistance(0.5f).noCollision()));

    public static final BlockFamily BAMBOO_FAMILY = BlockFamilies.register(ModBlocks.BAMBOO_PLANKS)
            .sign(ModBlocks.STANDING_BAMBOO_SIGN, ModBlocks.WALL_BAMBOO_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    //Cherry Update//
    public static final Block CHERRY_BUTTON = registerBlock("cherry_button",
            new WoodenButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON)), ItemGroup.REDSTONE);
    public static final Block CHERRY_PLANKS = registerBlock("cherry_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHERRY_WOOD = registerBlock("cherry_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHERRY_LOG = registerBlock("cherry_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)), ItemGroup.BUILDING_BLOCKS);
    public static final Block STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)), ItemGroup.BUILDING_BLOCKS);
    public static final Block STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHERRY_DOOR = registerBlock("cherry_door",
            new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR)), ItemGroup.REDSTONE);
    public static final Block CHERRY_FENCE = registerBlock("cherry_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)), ItemGroup.DECORATIONS);
    public static final Block CHERRY_FENCE_GATE = registerBlock("cherry_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE)), ItemGroup.REDSTONE);
    public static final Block CHERRY_PRESSSURE_PLATE = registerBlock("cherry_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)), ItemGroup.REDSTONE);
    public static final Block CHERRY_SLAB = registerBlock("cherry_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR)), ItemGroup.REDSTONE);
    public static final Block CHERRY_STAIRS = registerBlock("cherry_stairs",
            new StairsBlock(ModBlocks.CHERRY_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHERRY_LEAVES = registerBlock("cherry_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ItemGroup.DECORATIONS);
    public static final Block CHERRY_LANTERN = registerBlock("cherry_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3).luminance(15).nonOpaque()), ItemGroup.DECORATIONS);
    public static final Block CHERRY_SAPLING = registerBlock("cherry_sapling",
            new SaplingBlock(new CherrySaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ItemGroup.DECORATIONS);

    public static final Identifier CHERRY_SIGN_TEXTURE = new Identifier(NewInOldMain.MOD_ID, "entity/signs/cherry");

    public static final Block STANDING_CHERRY_SIGN = registerBlock("standing_cherry_sign",
            new TerraformSignBlock(CHERRY_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN).hardness(0.5f).resistance(0.5f).noCollision()), ItemGroup.DECORATIONS);
    public static final Block WALL_CHERRY_SIGN = registerBlock("wall_cherry_sign",
            new TerraformWallSignBlock(CHERRY_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).hardness(0.5f).resistance(0.5f).noCollision()));

    public static final BlockFamily CHERRY_FAMILY = BlockFamilies.register(ModBlocks.CHERRY_PLANKS)
            .sign(ModBlocks.STANDING_CHERRY_SIGN, ModBlocks.WALL_CHERRY_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    //Trial Update//

    public static final Block COPPER_TRAPDOOR = registerBlock("copper_trapdoor",
            new CopperTrapdoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.IRON_TRAPDOOR).nonOpaque()), ItemGroup.REDSTONE);
    public static final Block EXPOSED_COPPER_TRAPDOOR = registerBlock("exposed_copper_trapdoor",
            new CopperTrapdoorBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.IRON_TRAPDOOR).nonOpaque()), ItemGroup.REDSTONE);
    public static final Block WEATHERED_COPPER_TRAPDOOR = registerBlock("weathered_copper_trapdoor",
            new CopperTrapdoorBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.IRON_TRAPDOOR).nonOpaque()), ItemGroup.REDSTONE);
    public static final Block OXIDIZED_COPPER_TRAPDOOR = registerBlock("oxidized_copper_trapdoor",
            new CopperTrapdoorBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.IRON_TRAPDOOR).nonOpaque()), ItemGroup.REDSTONE);
    public static final Block WAXED_COPPER_TRAPDOOR = registerBlock("waxed_copper_trapdoor",
            new CopperTrapdoorBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.IRON_TRAPDOOR).nonOpaque()), ItemGroup.REDSTONE);
    public static final Block WAXED_EXPOSED_COPPER_TRAPDOOR = registerBlock("waxed_exposed_copper_trapdoor",
            new CopperTrapdoorBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.IRON_TRAPDOOR).nonOpaque()), ItemGroup.REDSTONE);
    public static final Block WAXED_WEATHERED_COPPER_TRAPDOOR = registerBlock("waxed_weathered_copper_trapdoor",
            new CopperTrapdoorBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.IRON_TRAPDOOR).nonOpaque()), ItemGroup.REDSTONE);
    public static final Block WAXED_OXIDIZED_COPPER_TRAPDOOR = registerBlock("waxed_oxidized_copper_trapdoor",
            new CopperTrapdoorBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.IRON_TRAPDOOR).nonOpaque()), ItemGroup.REDSTONE);

    public static final Block COPPER_BULB = registerBlock("copper_bulb",
            new CopperBulbBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(Blocks.IRON_BLOCK)), ItemGroup.REDSTONE);
    public static final Block EXPOSED_COPPER_BULB = registerBlock("exposed_copper_bulb",
            new CopperBulbBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(Blocks.IRON_BLOCK)), ItemGroup.REDSTONE);
    public static final Block WEATHERED_COPPER_BULB = registerBlock("weathered_copper_bulb",
            new CopperBulbBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(Blocks.IRON_BLOCK)), ItemGroup.REDSTONE);
    public static final Block OXIDIZED_COPPER_BULB = registerBlock("oxidized_copper_bulb",
            new CopperBulbBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(Blocks.IRON_BLOCK)), ItemGroup.REDSTONE);
    public static final Block WAXED_COPPER_BULB = registerBlock("waxed_copper_bulb",
            new CopperBulbBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(Blocks.IRON_BLOCK)), ItemGroup.REDSTONE);
    public static final Block WAXED_EXPOSED_COPPER_BULB = registerBlock("waxed_exposed_copper_bulb",
            new CopperBulbBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(Blocks.IRON_BLOCK)), ItemGroup.REDSTONE);
    public static final Block WAXED_WEATHERED_COPPER_BULB = registerBlock("waxed_weathered_copper_bulb",
            new CopperBulbBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(Blocks.IRON_BLOCK)), ItemGroup.REDSTONE);
    public static final Block WAXED_OXIDIZED_COPPER_BULB = registerBlock("waxed_oxidized_copper_bulb",
            new CopperBulbBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(Blocks.IRON_BLOCK)), ItemGroup.REDSTONE);

    public static final Block COPPER_GRATE = registerBlock("copper_grate",
            new CopperGrateBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(Blocks.CHAIN).nonOpaque()), ItemGroup.BUILDING_BLOCKS);
    public static final Block EXPOSED_COPPER_GRATE = registerBlock("exposed_copper_grate",
            new CopperGrateBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(Blocks.CHAIN).nonOpaque()), ItemGroup.BUILDING_BLOCKS);
    public static final Block WEATHERED_COPPER_GRATE = registerBlock("weathered_copper_grate",
            new CopperGrateBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(Blocks.CHAIN).nonOpaque()), ItemGroup.BUILDING_BLOCKS);
    public static final Block OXIDIZED_COPPER_GRATE = registerBlock("oxidized_copper_grate",
            new CopperGrateBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(Blocks.CHAIN).nonOpaque()), ItemGroup.BUILDING_BLOCKS);
    public static final Block WAXED_COPPER_GRATE = registerBlock("waxed_copper_grate",
            new CopperGrateBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copy(Blocks.CHAIN).nonOpaque()), ItemGroup.BUILDING_BLOCKS);
    public static final Block WAXED_EXPOSED_COPPER_GRATE = registerBlock("waxed_exposed_copper_grate",
            new CopperGrateBlock(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copy(Blocks.CHAIN).nonOpaque()), ItemGroup.BUILDING_BLOCKS);
    public static final Block WAXED_WEATHERED_COPPER_GRATE = registerBlock("waxed_weathered_copper_grate",
            new CopperGrateBlock(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copy(Blocks.CHAIN).nonOpaque()), ItemGroup.BUILDING_BLOCKS);
    public static final Block WAXED_OXIDIZED_COPPER_GRATE = registerBlock("waxed_oxidized_copper_grate",
            new CopperGrateBlock(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copy(Blocks.CHAIN).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    //Custom Blocks//

    public static final Block MANGROVE_LANTERN = registerBlock("mangrove_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3).luminance(15).nonOpaque()), ItemGroup.DECORATIONS);
    public static final Block ALPHA_COBBLESTONE = registerBlock("alpha_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).hardness(2).resistance(3).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block ALPHA_COBBLESTONE_STAIRS = registerBlock("alpha_cobblestone_stairs",
            new StairsBlock(ModBlocks.ALPHA_COBBLESTONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).hardness(2).resistance(3).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block ALPHA_COBBLESTONE_SLAB = registerBlock("alpha_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).hardness(2).resistance(3).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block ALPHA_MOSSY_COBBLESTONE = registerBlock("alpha_mossy_cobblestone",
            new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).hardness(2).resistance(3).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block ALPHA_MOSSY_COBBLESTONE_STAIRS = registerBlock("alpha_mossy_cobblestone_stairs",
            new StairsBlock(ModBlocks.ALPHA_MOSSY_COBBLESTONE.getDefaultState(),FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).hardness(2).resistance(3).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block ALPHA_MOSSY_COBBLESTONE_SLAB = registerBlock("alpha_mossy_cobblestone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).hardness(2).resistance(3).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block ALPHA_MOSSY_COBBLESTONE_WALL = registerBlock("alpha_mossy_cobblestone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).hardness(2).resistance(3).requiresTool()), ItemGroup.DECORATIONS);
    public static final Block ALPHA_COBBLESTONE_WALL = registerBlock("alpha_cobblestone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).hardness(2).resistance(3).requiresTool()), ItemGroup.DECORATIONS);
    public static final Block ALPHA_GRAVEL = registerBlock("alpha_gravel",
            new GravelBlock(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.GRAVEL).hardness(1).resistance(1)), ItemGroup.BUILDING_BLOCKS);
    public static final Block DIRT_SLAB = registerBlock("dirt_slab",
            new SlabBlock(FabricBlockSettings.of(Material.SOIL).sounds(BlockSoundGroup.GRAVEL).hardness(1).resistance(1)), ItemGroup.BUILDING_BLOCKS);
    public static final Block COARSE_DIRT_SLAB = registerBlock("coarse_dirt_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.COARSE_DIRT)), ItemGroup.BUILDING_BLOCKS);
    public static final Block GRASS_SLAB = registerBlock("grass_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.GRASS_BLOCK)), ItemGroup.BUILDING_BLOCKS);
  //borads
    public static final Block acacia_boards = registerBlock("acacia_boards",
            new SlabBlock(FabricBlockSettings.copy(Blocks.ACACIA_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block bamboo_boards = registerBlock("bamboo_boards",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block birch_boards = registerBlock("birch_boards",
            new SlabBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block cherry_boards = registerBlock("cherry_boards",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block crimson_boards = registerBlock("crimson_boards",
            new SlabBlock(FabricBlockSettings.copy(Blocks.BIRCH_PLANKS)), ItemGroup.BUILDING_BLOCKS);
public static final Block dark_oak_boards = registerBlock("dark_oak_boards",
            new SlabBlock(FabricBlockSettings.copy(Blocks.DARK_OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS);
public static final Block jungle_boards = registerBlock("jungle_boards",
        new SlabBlock(FabricBlockSettings.copy(Blocks.JUNGLE_PLANKS)), ItemGroup.BUILDING_BLOCKS);
public static final Block mangrove_boards = registerBlock("mangrove_boards",
        new SlabBlock(FabricBlockSettings.copy(Blocks.MANGROVE_PLANKS)), ItemGroup.BUILDING_BLOCKS);
public static final Block oak_boards = registerBlock("oak_boards",
        new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS);
public static final Block warped_boards = registerBlock("warped_boards",
        new SlabBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS)), ItemGroup.BUILDING_BLOCKS);

    public static final Block OAK_LANTERN = registerBlock("oak_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3).luminance(15).nonOpaque()), ItemGroup.DECORATIONS);
    public static final Block ACACIA_LANTERN = registerBlock("acacia_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3).luminance(15).nonOpaque()), ItemGroup.DECORATIONS);
    public static final Block BIRCH_LANTERN = registerBlock("birch_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3).luminance(15).nonOpaque()), ItemGroup.DECORATIONS);
    public static final Block DARK_OAK_LANTERN = registerBlock("dark_oak_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3).luminance(15).nonOpaque()), ItemGroup.DECORATIONS);
    public static final Block JUNGLE_LANTERN = registerBlock("jungle_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3).luminance(15).nonOpaque()), ItemGroup.DECORATIONS);
    public static final Block SPRUCE_LANTERN = registerBlock("spruce_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3).luminance(15).nonOpaque()), ItemGroup.DECORATIONS);








    //Pale Update//
    public static final Block PALE_OAK_PLANKS = registerBlock("pale_oak_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_OAK_PRESSSURE_PLATE = registerBlock("pale_oak_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_OAK_BUTTON = registerBlock("pale_oak_button",
            new WoodenButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON)), ItemGroup.REDSTONE);
    public static final Block PALE_OAK_WOOD = registerBlock("pale_oak_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_OAK_LOG = registerBlock("pale_oak_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block STRIPPED_PALE_OAK_LOG = registerBlock("stripped_pale_oak_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block STRIPPED_PALE_OAK_WOOD = registerBlock("stripped_pale_oak_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_OAK_DOOR = registerBlock("pale_oak_door",
            new DoorBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().sounds(BlockSoundGroup.WOOD).hardness(3).resistance(3)), ItemGroup.REDSTONE);
    public static final Block PALE_OAK_FENCE = registerBlock("pale_oak_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3)), ItemGroup.DECORATIONS);
    public static final Block PALE_OAK_FENCE_GATE = registerBlock("pale_oak_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3)), ItemGroup.REDSTONE);
    public static final Block PALE_OAK_SLAB = registerBlock("pale_oak_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_OAK_TRAPDOOR = registerBlock("pale_oak_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().sounds(BlockSoundGroup.WOOD).hardness(3).resistance(3)), ItemGroup.REDSTONE);
    public static final Block PALE_OAK_STAIRS = registerBlock("pale_oak_stairs",
            new StairsBlock(ModBlocks.PALE_OAK_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_OAK_LEAVES = registerBlock("pale_oak_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)), ItemGroup.DECORATIONS);
    public static final Block PALE_OAK_SAPLING = registerBlock("pale_oak_sapling",
            new SaplingBlock(new PaleOakSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ItemGroup.DECORATIONS);
    public static final Block PALE_MOSS_CARPET = registerBlock("pale_moss_carpet",
            new CarpetBlock(FabricBlockSettings.of(Material.MOSS_BLOCK).sounds(BlockSoundGroup.MOSS_CARPET).nonOpaque().resistance(0.1f).hardness((0.1f))), ItemGroup.DECORATIONS);
    public static final Block PALE_MOSS_BLOCK = registerBlock("pale_moss_block",
            new PaleMossBlock(FabricBlockSettings.of(Material.MOSS_BLOCK).sounds(BlockSoundGroup.MOSS_BLOCK).nonOpaque().resistance(0.1f).hardness((0.1f))), ItemGroup.BUILDING_BLOCKS);
    public static final Block OPEN_EYEBLOSSOM = registerBlock("open_eyeblossom",
            new FlowerBlock(StatusEffects.BLINDNESS, 5, FabricBlockSettings.of(Material.MOSS_BLOCK).sounds(BlockSoundGroup.CROP).noCollision().luminance(5)), ItemGroup.DECORATIONS);
    public static final Block CLOSED_EYEBLOSSOM = registerBlock("closed_eyeblossom",
            new FlowerBlock(StatusEffects.NAUSEA, 5, FabricBlockSettings.of(Material.MOSS_BLOCK).sounds(BlockSoundGroup.CROP).noCollision()), ItemGroup.DECORATIONS);
    public static final Block POTTED_OPEN_EYEBLOSSOM = registerBlock("potted_open_eyeblossom",
            new FlowerPotBlock(ModBlocks.OPEN_EYEBLOSSOM, FabricBlockSettings.copy(Blocks.POTTED_DANDELION)));
    public static final Block POTTED_CLOSED_EYEBLOSSOM = registerBlock("potted_closed_eyeblossom",
            new FlowerPotBlock(ModBlocks.CLOSED_EYEBLOSSOM, FabricBlockSettings.copy(Blocks.POTTED_DANDELION)));
    public static final Block CREAKING_HEART = registerBlock("creaking_heart",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block ACTIVE_CREAKING_HEART = registerBlock("active_creaking_heart",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3).luminance(5)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_LANTERN = registerBlock("pale_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3).luminance(15).nonOpaque()), ItemGroup.DECORATIONS);
    public static final Block PALE_HANGING_MOSS_PLANT = registerBlock("pale_hanging_moss_plant",
            new PaleHangingMossPlantBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().nonOpaque().sounds(BlockSoundGroup.AZALEA_LEAVES)));
    public static final Block PALE_HANGING_MOSS = registerBlock("pale_hanging_moss",
            new PaleHangingMossBlock(AbstractBlock.Settings.of(Material.PLANT).noCollision().nonOpaque().sounds(BlockSoundGroup.AZALEA_LEAVES)), ItemGroup.DECORATIONS);
    public static final Block RESIN_BLOCK = registerBlock("resin_block",
            new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block RESIN_BRICKS = registerBlock("resin_bricks",
            new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.DEEPSLATE_BRICKS).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block RESIN_CLUMP = registerBlock("resin_clump",
            new GlowLichenBlock(FabricBlockSettings.of(Material.FROGSPAWN).sounds(BlockSoundGroup.STONE).hardness(0.1f).resistance(0.1f).noCollision().nonOpaque()), ItemGroup.DECORATIONS);


    public static final Identifier PALE_OAK_SIGN_TEXTURE = new Identifier(NewInOldMain.MOD_ID, "entity/signs/pale_oak");

    public static final Block STANDING_PALE_OAK_SIGN = registerBlock("standing_pale_oak_sign",
            new TerraformSignBlock(PALE_OAK_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN).hardness(0.5f).resistance(0.5f).noCollision()), ItemGroup.DECORATIONS);
    public static final Block WALL_PALE_OAK_SIGN = registerBlock("wall_pale_oak_sign",
            new TerraformWallSignBlock(PALE_OAK_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).hardness(0.5f).resistance(0.5f).noCollision()));


    public static final BlockFamily PALE_OAK_FAMILY = BlockFamilies.register(ModBlocks.PALE_OAK_PLANKS)
            .sign(ModBlocks.STANDING_PALE_OAK_SIGN, ModBlocks.WALL_PALE_OAK_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(NewInOldMain.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(NewInOldMain.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Registry.register(Registry.ITEM, new Identifier(NewInOldMain.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return null;
    }


    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        Registry.register(Registry.ITEM, new Identifier(NewInOldMain.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
        return null;
    }

    public static void registerModBlocks() {
        NewInOldMain.LOGGER.debug("registering the ModdedBlocks for " + NewInOldMain.MOD_ID);
    }
    public static void registerOxidation() {

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_TRAPDOOR, ModBlocks.EXPOSED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_TRAPDOOR, ModBlocks.WEATHERED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_TRAPDOOR, ModBlocks.OXIDIZED_COPPER_TRAPDOOR);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_BULB, ModBlocks.EXPOSED_COPPER_BULB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_BULB, ModBlocks.WEATHERED_COPPER_BULB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_BULB, ModBlocks.OXIDIZED_COPPER_BULB);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_GRATE, ModBlocks.EXPOSED_COPPER_GRATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.EXPOSED_COPPER_GRATE, ModBlocks.WEATHERED_COPPER_GRATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.WEATHERED_COPPER_GRATE, ModBlocks.OXIDIZED_COPPER_GRATE);
        NewInOldMain.LOGGER.debug("registering the OxidizableBlocks for " + NewInOldMain.MOD_ID);
           };
    public static void registerWaxing() {

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_TRAPDOOR, ModBlocks.WAXED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_TRAPDOOR, ModBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_TRAPDOOR, ModBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_TRAPDOOR, ModBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_BULB, ModBlocks.WAXED_COPPER_BULB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_BULB, ModBlocks.WAXED_EXPOSED_COPPER_BULB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_BULB, ModBlocks.WAXED_WEATHERED_COPPER_BULB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_BULB, ModBlocks.WAXED_OXIDIZED_COPPER_BULB);

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_GRATE, ModBlocks.WAXED_COPPER_GRATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.EXPOSED_COPPER_GRATE, ModBlocks.WAXED_EXPOSED_COPPER_GRATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.WEATHERED_COPPER_GRATE, ModBlocks.WAXED_WEATHERED_COPPER_GRATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.OXIDIZED_COPPER_GRATE, ModBlocks.WAXED_OXIDIZED_COPPER_GRATE);

     NewInOldMain.LOGGER.debug("registering the WaxAbleBlocks for " + NewInOldMain.MOD_ID);
     }
}







