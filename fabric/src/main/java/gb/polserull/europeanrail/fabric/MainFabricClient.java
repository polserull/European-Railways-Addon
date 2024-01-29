package gb.polserull.europeanrail.fabric;

import gb.polserull.europeanrail.MainClient;
import net.fabricmc.api.ClientModInitializer;

public class MainFabricClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		MainClient.init();
	}

}