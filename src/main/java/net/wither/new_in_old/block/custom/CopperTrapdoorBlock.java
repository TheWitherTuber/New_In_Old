package net.wither.new_in_old.block.custom;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class CopperTrapdoorBlock extends TrapdoorBlock implements Oxidizable {
    private final OxidationLevel oxidationLevel;

    public CopperTrapdoorBlock(OxidationLevel oxidationLevel, AbstractBlock.Settings settings) {
        super(settings);
        this.oxidationLevel = oxidationLevel;
    }

    public CopperTrapdoorBlock(Settings settings, OxidationLevel oxidationLevel) {
        super(settings);
        this.oxidationLevel = oxidationLevel;
    }
    @SuppressWarnings("deprecation")
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }
    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    @Override
    public OxidationLevel getDegradationLevel() {
        return this.oxidationLevel;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, net.minecraft.util.math.BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!this.material.isReplaceable()) {
            state = state.cycle(OPEN);
            world.setBlockState(pos, state, 10);

            // Play open/close sound
            world.playSound(
                    null,
                    pos,
                    state.get(OPEN) ? SoundEvents.BLOCK_IRON_DOOR_OPEN : SoundEvents.BLOCK_IRON_DOOR_CLOSE,
                    SoundCategory.BLOCKS,
                    1.0F,
                    1.0F
            );

            return ActionResult.SUCCESS;
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }

}
