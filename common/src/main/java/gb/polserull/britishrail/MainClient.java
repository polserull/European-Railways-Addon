package gb.polserull.britishrail;

import gb.polserull.britishrail.Render.*;
import mtr.Blocks;
import mtr.RegistryClient;
import net.minecraft.client.renderer.RenderType;

public class MainClient {

	public static void init() {
		RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.SHUNT_SIGNAL.get(), dispatcher -> new RenderShuntSignalLight<>(dispatcher, true, false, 0xFF00FF00));
		RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.CROSSING_SIGNAL.get(), dispatcher -> new RenderCrossingSignalLight<>(dispatcher, true, false, 0xFF00FF00, 0xFF00FF00));
		RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.CAUTION_SEMAPHORE.get(), dispatcher -> new RenderSemaphore<>(dispatcher, true));
		RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.SHORT_SEMAPHORE.get(), dispatcher -> new RenderShortSemaphore<>(dispatcher, true));
		RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.LIMIT_OF_SHUNT_SIGNAL.get(), dispatcher -> new RenderLimitOfShuntSignalLight<>(dispatcher, true, false, 0xFF00FF00));
		RegistryClient.registerBlockRenderType(RenderType.cutout(), MyBlocks.BR_TICKET_BARRIER_ENTRANCE.get());
		RegistryClient.registerBlockRenderType(RenderType.cutout(), MyBlocks.BR_TICKET_BARRIER_EXIT.get());

		// NYF
		//RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.OFF_THEATRE_INDICATOR.get(), dispatcher -> new RenderOFFSignal<>(dispatcher, true));
		//RegistryClient.registerTileEntityRenderer(MyBlockEntityTypes.GATE_BARRIER.get(), dispatcher -> new RenderGateBarrier<>(dispatcher, true));
	}

}
