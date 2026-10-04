package malicedev.lumber;

import net.fabricmc.api.ClientModInitializer;
import turniplabs.halplibe.event.defs.ClientEvents;
import turniplabs.halplibe.util.dependency.Key;

import static malicedev.lumber.Main.MOD_ID;
import static malicedev.lumber.Main.LOGGER;

public class ModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		LOGGER.info("Initializing Client Classes for "+MOD_ID+".");
		ClientEvents.BLOCK_MODEL_RELOAD.listen(Key.of(MOD_ID),(t)->new ModModels().initBlockModels(t));
		ClientEvents.ITEM_MODEL_RELOAD.listen(Key.of(MOD_ID),(t)->new ModModels().initItemModels(t));
	}
}
