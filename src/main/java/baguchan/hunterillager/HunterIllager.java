package baguchan.hunterillager;

import baguchan.hunterillager.init.HunterEntityRegistry;
import baguchan.hunterillager.init.HunterItems;
import baguchan.hunterillager.init.HunterSounds;
import baguchan.hunterillager.init.ModCreativeTabEvents;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HunterIllager implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MODID = "hunterillager";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		HunterSounds.init();
		HunterItems.init();
		HunterEntityRegistry.init();
		ModCreativeTabEvents.initModCreativeModeTabs();
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(MODID, path);
	}
}
