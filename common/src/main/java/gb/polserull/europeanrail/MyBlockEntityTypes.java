package gb.polserull.europeanrail;

import mtr.RegistryObject;
import mtr.mappings.RegistryUtilities;
import gb.polserull.europeanrail.Blocks.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
public interface MyBlockEntityTypes {
    RegistryObject<BlockEntityType<ShuntSignal.TileEntitySignalShunt>> SHUNT_SIGNAL = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(ShuntSignal.TileEntitySignalShunt::new, MyBlocks.SHUNT_SIGNAL.get()));
    RegistryObject<BlockEntityType<CrossingSignal.TileEntityCrossingSignal>> CROSSING_SIGNAL = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(CrossingSignal.TileEntityCrossingSignal::new, MyBlocks.CROSSING_SIGNAL.get()));
    RegistryObject<BlockEntityType<CautionSemaphore.TileEntitySignalSemaphoreCaut>> CAUTION_SEMAPHORE = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(CautionSemaphore.TileEntitySignalSemaphoreCaut::new, MyBlocks.CAUTION_SEMAPHORE.get()));
    RegistryObject<BlockEntityType<ShortSemaphore.TileEntitySignalSemaphoreShort>> SHORT_SEMAPHORE = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(ShortSemaphore.TileEntitySignalSemaphoreShort::new, MyBlocks.SHORT_SEMAPHORE.get()));
    RegistryObject<BlockEntityType<ShuntingSemaphore.TileEntitySignalSemaphoreShunt>> SHUNT_SEMAPHORE = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(ShuntingSemaphore.TileEntitySignalSemaphoreShunt::new, MyBlocks.SHUNT_SEMAPHORE.get()));
    RegistryObject<BlockEntityType<LimitOfShuntSignal.TileEntitySignalLShunt>> LIMIT_OF_SHUNT_SIGNAL = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(LimitOfShuntSignal.TileEntitySignalLShunt::new, MyBlocks.LIMIT_OF_SHUNT_SIGNAL.get()));
    RegistryObject<BlockEntityType<OFFDispatcherSignal.TileEntityTheatreSignalDoubleLetter1>> OFF_DISPATCHER_SIGNAL = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(OFFDispatcherSignal.TileEntityTheatreSignalDoubleLetter1::new, MyBlocks.OFF_DISPATCHER_SIGNAL.get()));
    //RegistryObject<BlockEntityType<DoubleBannerRepeater.TileEntityTheatreSignalDoubleLetter1>> DOUBLE_BANNER_REPEATER = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(DoubleBannerRepeater.TileEntityTheatreSignalDoubleLetter1::new, MyBlocks.DOUBLE_BANNER_REPEATER.get()));
    RegistryObject<BlockEntityType<CrossingBarrier.TileEntitySignalCrossingBarrier>> CROSSING_BARRIER = new RegistryObject<>(() -> RegistryUtilities.getBlockEntityType(CrossingBarrier.TileEntitySignalCrossingBarrier::new, MyBlocks.CROSSING_BARRIER.get()));
}

