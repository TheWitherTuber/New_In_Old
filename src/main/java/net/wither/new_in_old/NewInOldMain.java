package net.wither.new_in_old;

import net.fabricmc.api.ModInitializer;
import net.wither.new_in_old.block.ModBlocks;
import net.wither.new_in_old.item.ModItems;
import net.wither.new_in_old.util.ModFlammableBlocks;
import net.wither.new_in_old.util.ModStrippableBlocks;
import net.wither.new_in_old.world.feature.ModConfiguredFeatures;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewInOldMain implements ModInitializer {

	public static final String MOD_ID = "new_in_old";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();
		ModConfiguredFeatures.UndergroundConfiguredFeatures.registerUndergroundConfiguredFeatures();
		ModBlocks.registerModBlocks();

		ModFlammableBlocks.registerFlammableBlocks();
		ModStrippableBlocks.registerStrippables();
		ModBlocks.registerWaxing();
		ModBlocks.registerOxidation();
		ModItems.registerModItems();
	}
}
