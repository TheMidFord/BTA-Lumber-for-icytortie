package malicedev.lumber;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.HalpLibe;
import turniplabs.halplibe.event.defs.CommonEvents;
import turniplabs.halplibe.util.ConfigHandler;
import turniplabs.halplibe.util.dependency.Key;

import java.util.Properties;

public class 	Main implements ModInitializer {
	public static final String MOD_ID = HalpLibe.registerMod("lumber", true);
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static int itemId;
	public static int blockId;
	static {
		Properties prop = new Properties();
		prop.setProperty("starting_block_id","9400");
		prop.setProperty("starting_item_id","31000");
		ConfigHandler config = new ConfigHandler(MOD_ID,prop);

		blockId = config.getInt("starting_block_id");
		itemId = config.getInt("starting_item_id");

		config.updateConfig();
	}
	@Override
	public void onInitialize() {
		CommonEvents.BEFORE_GAME_START.listen(Key.of(MOD_ID), this::beforeGameStart);
		CommonEvents.AFTER_GAME_START.listen(Key.of(MOD_ID), this::afterGameStart);
		CommonEvents.AFTER_BLOCK_INIT.listen(Key.of(MOD_ID), ModBlocks::init);
		CommonEvents.AFTER_ITEM_INIT.listen(Key.of(MOD_ID), ModItems::init);
		CommonEvents.RECIPES_NAMESPACE_INIT.listen(Key.of(MOD_ID), WorkbenchRecipes::initNamespaces);
		CommonEvents.RECIPES_READY.listen(Key.of(MOD_ID), WorkbenchRecipes::removeRecipes);
		CommonEvents.RECIPES_READY.listen(Key.of(MOD_ID), WorkbenchRecipes::addRecipes);
		LOGGER.info("Lumber initialized.");
	}


	public void beforeGameStart() {

	}

	public void afterGameStart() {

	}
}
