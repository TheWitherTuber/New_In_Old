package net.wither.new_in_old;

import net.fabricmc.api.ModInitializer;
import net.wither.new_in_old.block.ModBlocks;
import net.wither.new_in_old.util.ModFlammableBlocks;
import net.wither.new_in_old.util.ModStrippableBlocks;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class New_In_Old implements ModInitializer {

	public static final String MOD_ID = "new_in_old";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModFlammableBlocks.registerFlammableBlocks();
		ModStrippableBlocks.registerStrippables();
	}
}
