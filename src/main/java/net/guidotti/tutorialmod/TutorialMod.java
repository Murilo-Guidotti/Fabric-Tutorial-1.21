package net.guidotti.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.guidotti.tutorialmod.block.ModBlocks;
import net.guidotti.tutorialmod.item.ModItemGroups;
import net.guidotti.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Comentario muito importante, CUIDADO
public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.resgisterModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
	}
}