package net.wither.new_in_old.block;

import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import jdk.jshell.Snippet;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Potion;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.wither.new_in_old.New_In_Old;
import net.minecraft.util.registry.Registry;




public class ModBlocks {
    //Bamboo Update//
    public static final Block BLOCK_OF_BAMBOO = registerBlock("block_of_bamboo",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.BAMBOO).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block STRIPPED_BLOCK_OF_BAMBOO = registerBlock("stripped_block_of_bamboo",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.BAMBOO).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_PLANKS = registerBlock("bamboo_planks",
            new Block(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.BAMBOO).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_BUTTON = registerBlock("bamboo_button",
            new WoodenButtonBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.BAMBOO).hardness(0.5f).resistance(0.5f).noCollision()), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_DOOR = registerBlock("bamboo_door",
            new DoorBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().sounds(BlockSoundGroup.BAMBOO).hardness(3).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_FENCE = registerBlock("bamboo_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.BAMBOO).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_FENCE_GATE = registerBlock("bamboo_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.BAMBOO).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_MOSAIC = registerBlock("bamboo_mosaic",
            new Block(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.BAMBOO).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_MOSAIC_SLAB = registerBlock("bamboo_mosaic_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.BAMBOO).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_MOSAIC_STAIRS = registerBlock("bamboo_mosaic_stairs",
            new StairsBlock(ModBlocks.BAMBOO_MOSAIC.getDefaultState(), FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.BAMBOO).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_PRESSSURE_PLATE = registerBlock("bamboo_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING , FabricBlockSettings.of(Material.BAMBOO).noCollision().sounds(BlockSoundGroup.BAMBOO).hardness(0.5f).resistance(0.5f)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_SLAB = registerBlock("bamboo_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.BAMBOO).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_TRAPDOOR = registerBlock("bamboo_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().sounds(BlockSoundGroup.BAMBOO).hardness(3).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block BAMBOO_STAIRS = registerBlock("bamboo_stairs",
            new StairsBlock(ModBlocks.BAMBOO_MOSAIC.getDefaultState(), FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.BAMBOO).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);

    public static final Identifier BAMBOO_SIGN_TEXTURE = new Identifier(New_In_Old.MOD_ID, "entity/signs/bamboo");

    public static final Block STANDING_BAMBOO_SIGN = registerBlock("standing_bamboo_sign",
            new TerraformSignBlock(BAMBOO_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN).hardness(0.5f).resistance(0.5f).noCollision()), ItemGroup.BUILDING_BLOCKS);
    public static final Block WALL_BAMBOO_SIGN = registerBlock("wall_bamboo_sign",
            new TerraformWallSignBlock(BAMBOO_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).hardness(0.5f).resistance(0.5f).noCollision()));

    public static final BlockFamily BAMBOO_FAMILY = BlockFamilies.register(ModBlocks.BAMBOO_PLANKS)
            .sign(ModBlocks.STANDING_BAMBOO_SIGN, ModBlocks.WALL_BAMBOO_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    //Cherry Update//
    public static final Block CHERRY_BUTTON = registerBlock("cherry_button",
            new WoodenButtonBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(0.5f).resistance(0.5f).noCollision()), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHERRY_PLANKS = registerBlock("cherry_planks",
            new Block(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHERRY_WOOD = registerBlock("cherry_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHERRY_LOG = registerBlock("cherry_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block STRIPPED_CHERRY_LOG = registerBlock("stripped_cherry_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block STRIPPED_CHERRY_WOOD = registerBlock("stripped_cherry_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHERRY_DOOR = registerBlock("cherry_door",
            new DoorBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().sounds(BlockSoundGroup.WOOD).hardness(3).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHERRY_FENCE = registerBlock("cherry_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHERRY_FENCE_GATE = registerBlock("cherry_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHERRY_PRESSSURE_PLATE = registerBlock("cherry_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING , FabricBlockSettings.of(Material.WOOD).noCollision().sounds(BlockSoundGroup.WOOD).hardness(0.5f).resistance(0.5f)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHERRY_SLAB = registerBlock("cherry_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHERRY_TRAPDOOR = registerBlock("cherry_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().sounds(BlockSoundGroup.WOOD).hardness(3).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHERRY_STAIRS = registerBlock("cherry_stairs",
            new StairsBlock(ModBlocks.CHERRY_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHERRY_LEAVES = registerBlock("cherry_leaves",
            new LeavesBlock(FabricBlockSettings.of(Material.LEAVES).sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque().resistance(0.2f).hardness((0.2f))), ItemGroup.BUILDING_BLOCKS);
    public static final Block CHERRY_LANTERN = registerBlock("cherry_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3).luminance(15).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Identifier CHERRY_SIGN_TEXTURE = new Identifier(New_In_Old.MOD_ID, "entity/signs/cherry");

    public static final Block STANDING_CHERRY_SIGN = registerBlock("standing_cherry_sign",
            new TerraformSignBlock(CHERRY_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN).hardness(0.5f).resistance(0.5f).noCollision()), ItemGroup.BUILDING_BLOCKS);
    public static final Block WALL_CHERRY_SIGN = registerBlock("wall_cherry_sign",
            new TerraformWallSignBlock(CHERRY_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).hardness(0.5f).resistance(0.5f).noCollision()));

    public static final BlockFamily CHERRY_FAMILY = BlockFamilies.register(ModBlocks.CHERRY_PLANKS)
            .sign(ModBlocks.STANDING_CHERRY_SIGN, ModBlocks.WALL_CHERRY_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();

    //Trial Update//

    //Pale Update//
    public static final Block PALE_OAK_PLANKS = registerBlock("pale_oak_planks",
            new Block(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_OAK_PRESSSURE_PLATE = registerBlock("pale_oak_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING , FabricBlockSettings.of(Material.WOOD).noCollision().sounds(BlockSoundGroup.WOOD).hardness(0.5f).resistance(0.5f)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_OAK_BUTTON = registerBlock("pale_oak_button",
            new WoodenButtonBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(0.5f).resistance(0.5f).noCollision()), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_OAK_WOOD = registerBlock("pale_oak_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_OAK_LOG = registerBlock("pale_oak_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block STRIPPED_PALE_OAK_LOG = registerBlock("stripped_pale_oak_log",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block STRIPPED_PALE_OAK_WOOD = registerBlock("stripped_pale_oak_wood",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_OAK_DOOR = registerBlock("pale_oak_door",
            new DoorBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().sounds(BlockSoundGroup.WOOD).hardness(3).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_OAK_FENCE = registerBlock("pale_oak_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_OAK_FENCE_GATE = registerBlock("pale_oak_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_OAK_SLAB = registerBlock("pale_oak_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(2)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_OAK_TRAPDOOR = registerBlock("pale_oak_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque().sounds(BlockSoundGroup.WOOD).hardness(3).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_OAK_STAIRS = registerBlock("pale_oak_stairs",
            new StairsBlock(ModBlocks.PALE_OAK_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_OAK_LEAVES = registerBlock("pale_oak_leaves",
            new LeavesBlock(FabricBlockSettings.of(Material.LEAVES).sounds(BlockSoundGroup.AZALEA_LEAVES).nonOpaque().resistance(0.2f).hardness((0.2f))), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_MOSS_CARPET = registerBlock("pale_moss_carpet",
            new CarpetBlock(FabricBlockSettings.of(Material.MOSS_BLOCK).sounds(BlockSoundGroup.MOSS_CARPET).nonOpaque().resistance(0.1f).hardness((0.1f))), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_MOSS_BLOCK = registerBlock("pale_moss_block",
            new MossBlock(FabricBlockSettings.of(Material.MOSS_BLOCK).sounds(BlockSoundGroup.MOSS_BLOCK).nonOpaque().resistance(0.1f).hardness((0.1f))), ItemGroup.BUILDING_BLOCKS);
    public static final Block OPEN_EYEBLOSSOM = registerBlock("open_eyeblossom",
            new FlowerBlock(StatusEffects.BLINDNESS, 5, FabricBlockSettings.of(Material.MOSS_BLOCK).sounds(BlockSoundGroup.CROP).noCollision().luminance(5)), ItemGroup.BUILDING_BLOCKS);
    public static final Block CLOSED_EYEBLOSSOM = registerBlock("closed_eyeblossom",
            new FlowerBlock(StatusEffects.NAUSEA, 5, FabricBlockSettings.of(Material.MOSS_BLOCK).sounds(BlockSoundGroup.CROP).noCollision()), ItemGroup.BUILDING_BLOCKS);
    public static final Block POTTED_OPEN_EYEBLOSSOM = registerBlock("potted_open_eyeblossom",
            new FlowerPotBlock(ModBlocks.OPEN_EYEBLOSSOM, FabricBlockSettings.copy(Blocks.POTTED_DANDELION)));
    public static final Block POTTED_CLOSED_EYEBLOSSOM = registerBlock("potted_closed_eyeblossom",
            new FlowerPotBlock(ModBlocks.CLOSED_EYEBLOSSOM, FabricBlockSettings.copy(Blocks.POTTED_DANDELION)));
    public static final Block CREAKING_HEART = registerBlock("creaking_heart",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3)), ItemGroup.BUILDING_BLOCKS);
    public static final Block ACTIVE_CREAKING_HEART = registerBlock("active_creaking_heart",
            new PillarBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3).luminance(5)), ItemGroup.BUILDING_BLOCKS);
    public static final Block PALE_LANTERN = registerBlock("pale_lantern",
            new LanternBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).hardness(2).resistance(3).luminance(15).nonOpaque()), ItemGroup.BUILDING_BLOCKS);

    public static final Identifier PALE_OAK_SIGN_TEXTURE = new Identifier(New_In_Old.MOD_ID, "entity/signs/pale_oak");

    public static final Block STANDING_PALE_OAK_SIGN = registerBlock("standing_pale_oak_sign",
            new TerraformSignBlock(PALE_OAK_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN).hardness(0.5f).resistance(0.5f).noCollision()), ItemGroup.BUILDING_BLOCKS);
    public static final Block WALL_PALE_OAK_SIGN = registerBlock("wall_pale_oak_sign",
            new TerraformWallSignBlock(PALE_OAK_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN).hardness(0.5f).resistance(0.5f).noCollision()));


    public static final BlockFamily PALE_OAK_FAMILY = BlockFamilies.register(ModBlocks.PALE_OAK_PLANKS)
            .sign(ModBlocks.STANDING_PALE_OAK_SIGN, ModBlocks.WALL_PALE_OAK_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(New_In_Old.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(New_In_Old.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Registry.register(Registry.ITEM, new Identifier(New_In_Old.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return null;
    }


    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        Registry.register(Registry.ITEM, new Identifier(New_In_Old.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
        return null;
    }

    public static void registerModBlocks() {

    }
}







