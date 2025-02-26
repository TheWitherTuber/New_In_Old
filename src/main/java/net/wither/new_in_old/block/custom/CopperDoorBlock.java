package net.wither.new_in_old.block.custom;

import net.minecraft.block.DoorBlock;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.enums.DoubleBlockHalf;
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

public class CopperDoorBlock extends DoorBlock implements Oxidizable {
    private final OxidationLevel oxidationLevel;

    public CopperDoorBlock(OxidationLevel oxidationLevel, AbstractBlock.Settings settings) {
        super(settings);
        this.oxidationLevel = oxidationLevel;
    }

    @Override
    public OxidationLevel getDegradationLevel() {
        return this.oxidationLevel;
    }

    @SuppressWarnings("deprecation")
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }
    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
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
    @Override
    @SuppressWarnings("deprecation")
    public void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (!state.isOf(newState.getBlock()) && newState.getBlock() instanceof CopperDoorBlock) {
            replaceDoorWithOxidized(world, pos, newState);
        }
        super.onStateReplaced(state, world, pos, newState, moved);
    }


    public static void replaceDoorWithOxidized(World world, BlockPos pos, BlockState newState) {
        BlockState oldState = world.getBlockState(pos);

        if (!(oldState.getBlock() instanceof DoorBlock)) {
            return;
        }

        boolean isUpperHalf = oldState.get(DoorBlock.HALF) == DoubleBlockHalf.UPPER;
        BlockPos otherHalfPos = isUpperHalf ? pos.down() : pos.up();
        BlockState otherHalfState = world.getBlockState(otherHalfPos);

        if (!(otherHalfState.getBlock() instanceof DoorBlock)) {
            return;
        }

        BlockState newUpper = newState
                .with(DoorBlock.HALF, DoubleBlockHalf.UPPER)
                .with(DoorBlock.FACING, oldState.get(DoorBlock.FACING))
                .with(DoorBlock.OPEN, oldState.get(DoorBlock.OPEN))
                .with(DoorBlock.HINGE, oldState.get(DoorBlock.HINGE));

        BlockState newLower = newUpper.with(DoorBlock.HALF, DoubleBlockHalf.LOWER);

        world.setBlockState(pos, isUpperHalf ? newUpper : newLower, 3);
        world.setBlockState(otherHalfPos, isUpperHalf ? newLower : newUpper, 3);
    }
}
