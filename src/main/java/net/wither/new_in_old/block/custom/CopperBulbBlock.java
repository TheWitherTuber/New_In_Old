package net.wither.new_in_old.block.custom;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class CopperBulbBlock extends Block implements Oxidizable {
    public static final BooleanProperty LIT = BooleanProperty.of("lit");
    public static final BooleanProperty POWERED = Properties.POWERED;

    private final OxidationLevel oxidationLevel;

    public CopperBulbBlock(OxidationLevel oxidationLevel, Settings settings) {
        super(settings.luminance(state -> getLuminance(state)));
        this.oxidationLevel = oxidationLevel;
        setDefaultState(this.stateManager.getDefaultState().with(LIT, false).with(POWERED, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT, POWERED);
    }

    @Override
    @SuppressWarnings("deprecation")
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
        if (world.isClient) return;

        boolean hasDirectPower = world.getReceivedRedstonePower(pos) > 0;
        boolean isCurrentlyPowered = state.get(POWERED);

        if (!isCurrentlyPowered && hasDirectPower) {
            world.setBlockState(pos, state.with(LIT, !state.get(LIT)).with(POWERED, true));
        }

        else if (isCurrentlyPowered && !hasDirectPower) {
            world.setBlockState(pos, state.with(POWERED, false));
        }
    }

    @Override
    @SuppressWarnings("deprecation")
    public int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        return state.get(LIT) ? 15 : 0;
    }

    @Override
    @SuppressWarnings("deprecation")
    public boolean hasComparatorOutput(BlockState state) {
        return true;
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
        return this.oxidationLevel != null ? this.oxidationLevel : OxidationLevel.UNAFFECTED;
    }

    @Override
    public float getDegradationChanceMultiplier() {
        return 1.0f;
    }

    private static int getLuminance(BlockState state) {
        if (!state.get(LIT)) return 0;

        Block block = state.getBlock();
        if (block instanceof Oxidizable oxidizable) {
            OxidationLevel level = oxidizable.getDegradationLevel();
            if (level == null) level = OxidationLevel.UNAFFECTED;

            return switch (level) {
                case UNAFFECTED -> 15;
                case EXPOSED -> 10;
                case WEATHERED -> 5;
                case OXIDIZED -> 2;
            };
        }
        return 15;
    }
}
