package net.prangellplays.clownsword;

import net.fabricmc.api.ModInitializer;
import net.prangellplays.clownsword.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClownSword implements ModInitializer {
	public static final String MOD_ID = "clownsword";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
