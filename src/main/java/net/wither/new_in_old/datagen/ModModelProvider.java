package net.wither.new_in_old.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.BlockState;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.wither.new_in_old.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool bamboo_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BAMBOO_PLANKS);
        bamboo_pool.family(ModBlocks.BAMBOO_FAMILY);
        BlockStateModelGenerator.BlockTexturePool cherry_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHERRY_PLANKS);
        cherry_pool.family(ModBlocks.CHERRY_FAMILY);
        BlockStateModelGenerator.BlockTexturePool pale_oak_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALE_OAK_PLANKS);
        pale_oak_pool.family(ModBlocks.PALE_OAK_FAMILY);
    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
