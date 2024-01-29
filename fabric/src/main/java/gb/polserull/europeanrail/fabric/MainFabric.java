package gb.polserull.europeanrail.fabric;

import gb.polserull.europeanrail.Main;
import net.fabricmc.api.ModInitializer;

public class MainFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		Main.init(new RegistriesWrapperImpl());
	}
}

