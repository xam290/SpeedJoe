package net.xam.speedyjoe;

import net.fabricmc.api.ModInitializer;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.xam.speedyjoe.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpeedyJoe implements ModInitializer {
	public static final String MOD_ID = "speedyjoe";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();


	}
}
