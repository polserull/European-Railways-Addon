package gb.polserull.europeanrail;

import gb.polserull.europeanrail.Render.*;
import mtr.RegistryClient;
import mtr.packet.IPacket;

public class MainClient implements IPacket {

	public static void init() {
		RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.OFF_DISPATCHER_SIGNAL.get(), dispatcher -> new RenderOFFSignal<>(dispatcher, true));
		RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.GANTRY_SIGNAL_TWO.get(), dispatcher -> new RenderGantrySignalTwo<>(dispatcher, true, false, 0xFF00FF00));
		RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.GANTRY_SIGNAL_THREE.get(), dispatcher -> new RenderGantrySignalThree<>(dispatcher, true, false, 0xFF00FF00));
		RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.SHUNT_SIGNAL.get(), dispatcher -> new RenderShuntSignalLight<>(dispatcher, true, false, 0xFF00FF00));
		RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.CROSSING_SIGNAL.get(), dispatcher -> new RenderCrossingSignalLight<>(dispatcher, true, false, 0xFF00FF00, 0xFF00FF00));
		RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.CAUTION_SEMAPHORE.get(), dispatcher -> new RenderSemaphoreCaut<>(dispatcher, true));
		RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.SHORT_SEMAPHORE.get(), dispatcher -> new RenderShortSemaphore<>(dispatcher, true));
		RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.SHUNT_SEMAPHORE.get(), dispatcher -> new RenderShuntSemaphore<>(dispatcher, true));
		RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.LIMIT_OF_SHUNT_SIGNAL.get(), dispatcher -> new RenderLimitOfShuntSignalLight<>(dispatcher, true, false, 0xFF00FF00));
		RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.CROSSING_BARRIER.get(), dispatcher -> new RenderGateBarrier<>(dispatcher, true));
		RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.NL_X_INDICATOR.get(), dispatcher -> new RenderNLXSignal<>(dispatcher, true));
	}
}
