package gb.polserull.britishrail.fabric;

import gb.polserull.britishrail.Main;
import net.fabricmc.api.ModInitializer;

public class MainFabric implements ModInitializer {

	@Override
	public void onInitialize() {
		Main.init(new RegistriesWrapperImpl());
	}

}
