package net.wither.new_in_old.mixin.client;

import net.minecraft.block.BlockState;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.color.world.GrassColors;
import net.minecraft.item.BlockItem;
import net.wither.new_in_old.block.ModBlocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemColors.class)
abstract class ItemColorsMixin {
    @Inject(method = "create", at = @At("RETURN"))
    private static void new_in_old$createItemColors(BlockColors blockColors, CallbackInfoReturnable<ItemColors> cir) {
        ItemColors itemColors = cir.getReturnValue();
        itemColors.register((stack, tintIndex) -> {
            BlockState blockState = ((BlockItem)stack.getItem()).getBlock().getDefaultState();
            return blockColors.getColor(blockState, null, null, tintIndex);
        }, ModBlocks.GRASS_SLAB);
    }
}

@Mixin(BlockColors.class)
abstract class BlockColorsMixin {
    @Inject(method = "create", at = @At("RETURN"))
    private static void new_in_old$createBlockColors(CallbackInfoReturnable<BlockColors> cir) {
        BlockColors blockColors = cir.getReturnValue();
        blockColors.registerColorProvider((state, world, pos, tintIndex) -> {
            if (world == null || pos == null) {
                return GrassColors.getColor(0.5, 1.0);
            }
            return BiomeColors.getGrassColor(world, pos);
        }, ModBlocks.GRASS_SLAB);
    }
}