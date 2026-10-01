package de.leander.customgoditems;

import de.leander.customgoditems.item.ModItems;
import net.fabricmc.api.ModInitializer;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomGodItems implements ModInitializer {
	public static final String MOD_ID = "customgoditems";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}