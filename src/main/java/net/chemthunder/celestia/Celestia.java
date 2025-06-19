package net.chemthunder.celestia;

import net.chemthunder.celestia.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Celestia implements ModInitializer {
	public static final String MOD_ID = "celestia";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		LOGGER.info("Celestia is operational!");
	}
}