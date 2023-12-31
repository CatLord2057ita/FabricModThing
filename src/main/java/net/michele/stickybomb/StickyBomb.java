package net.michele.stickybomb;

import net.fabricmc.api.ModInitializer;
import net.michele.stickybomb.block.ModBlocks;
import net.michele.stickybomb.item.ModItemGroup;
import net.michele.stickybomb.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StickyBomb implements ModInitializer {
	public static final String MOD_ID = "stickybomb";
	public static final Logger LOGGER = LoggerFactory.getLogger("stickybomb");

	@Override
	public void onInitialize() {
        ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("Hello Fabric world!");
	}
}
