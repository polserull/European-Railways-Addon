package gb.polserull.britishrail.fabric;

import gb.polserull.britishrail.MainClient;
import net.fabricmc.api.ClientModInitializer;

public class MainFabricClient implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		MainClient.init();
	}

}