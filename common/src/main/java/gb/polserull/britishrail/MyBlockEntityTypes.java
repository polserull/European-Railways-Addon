package gb.polserull.britishrail;

import mtr.RegistryObject;
import mtr.mappings.RegistryUtilities;
import gb.polserull.britishrail.Blocks.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
public interface MyBlockEntityTypes {
    RegistryObject<BlockEntityType<ShuntSignal.TileEntityTunnelSignalLight1>> SHUNT_SIGNAL = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(ShuntSignal.TileEntityTunnelSignalLight1::new, MyBlocks.SHUNT_SIGNAL.get()));
    RegistryObject<BlockEntityType<CrossingSignal.TileEntityTunnelSignalLight1>> CROSSING_SIGNAL = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(CrossingSignal.TileEntityTunnelSignalLight1::new, MyBlocks.CROSSING_SIGNAL.get()));
    RegistryObject<BlockEntityType<CautionSemaphore.TileEntitySignalSemaphoreCaut>> CAUTION_SEMAPHORE = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(CautionSemaphore.TileEntitySignalSemaphoreCaut::new, MyBlocks.CAUTION_SEMAPHORE.get()));
    RegistryObject<BlockEntityType<ShortSemaphore.TileEntitySignalSemaphoreShort>> SHORT_SEMAPHORE = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(ShortSemaphore.TileEntitySignalSemaphoreShort::new, MyBlocks.SHORT_SEMAPHORE.get()));
    RegistryObject<BlockEntityType<LimitOfShuntSignal.TileEntityTunnelSignalLight1>> LIMIT_OF_SHUNT_SIGNAL = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(LimitOfShuntSignal.TileEntityTunnelSignalLight1::new, MyBlocks.LIMIT_OF_SHUNT_SIGNAL.get()));
    RegistryObject<BlockEntityType<OFFDispatcherSignal.TileEntityTheatreSignalDoubleLetter1>> OFF_DISPATCHER_SIGNAL = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(OFFDispatcherSignal.TileEntityTheatreSignalDoubleLetter1::new, MyBlocks.OFF_DISPATCHER_SIGNAL.get()));

    //NYF
    //RegistryObject<BlockEntityType<OFFDispatcherSignal.TileEntityTheatreSignalDoubleLetter1>> OFF_THEATRE_INDICATOR = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(OFFDispatcherSignal.TileEntityTheatreSignalDoubleLetter1::new, MyBlocks.OFF_DISPATCHER_SIGNAL.get()));
    //RegistryObject<BlockEntityType<GateBarrier.TileEntitySignalSemaphore1>> GATE_BARRIER = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(GateBarrier.TileEntitySignalSemaphore1::new, MyBlocks.GATE_BARRIER.get()));
}
