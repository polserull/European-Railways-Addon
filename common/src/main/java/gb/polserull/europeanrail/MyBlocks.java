package gb.polserull.europeanrail;


import mtr.RegistryObject;
import gb.polserull.europeanrail.Blocks.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public interface MyBlocks {

    // Signals
    RegistryObject<Block> SHUNT_SIGNAL = new RegistryObject<>(()-> new ShuntSignal(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(2).noOcclusion()));
    RegistryObject<Block> LIMIT_OF_SHUNT_SIGNAL = new RegistryObject<>(()-> new LimitOfShuntSignal(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(2).noOcclusion()));
    RegistryObject<Block> CROSSING_SIGNAL = new RegistryObject<>(()-> new CrossingSignal(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(2).noOcclusion()));
    RegistryObject<Block> CAUTION_SEMAPHORE = new RegistryObject<>(() -> new CautionSemaphore(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(4)));
    RegistryObject<Block> SHORT_SEMAPHORE = new RegistryObject<>(() -> new ShortSemaphore(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(4)));
    RegistryObject<Block> SHUNT_SEMAPHORE = new RegistryObject<>(() -> new ShuntingSemaphore(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(4)));
    RegistryObject<Block> OFF_DISPATCHER_SIGNAL = new RegistryObject<>(() -> new OFFDispatcherSignal(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(4)));
    RegistryObject<Block> NL_X_INDICATOR = new RegistryObject<>(() -> new NLXSignal(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(4)));
    //RegistryObject<Block> DOUBLE_BANNER_REPEATER = new RegistryObject<>(() -> new DoubleBannerRepeater(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(4)) {
    //});

    // Speed Boards
    RegistryObject<Block> SPEED_BOARD_FIVE = new RegistryObject<>(() -> new SignBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> SPEED_BOARD_TEN = new RegistryObject<>(() -> new SignBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> SPEED_BOARD_FIFTEEN =new RegistryObject<>(()-> new SignBoard(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(2)));
    RegistryObject<Block> SPEED_BOARD_TWENTY = new RegistryObject<>(() -> new SignBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> SPEED_BOARD_TWENTY_FIVE = new RegistryObject<>(() -> new SignBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> SPEED_BOARD_THIRTY= new RegistryObject<>(() -> new SignBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> SPEED_BOARD_FORTY= new RegistryObject<>(() -> new SignBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> SPEED_BOARD_FORTY_FIVE = new RegistryObject<>(() -> new SignBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> SPEED_BOARD_FIFTY = new RegistryObject<>(() -> new SignBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> SPEED_BOARD_SIXTY= new RegistryObject<>(() -> new SignBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> SPEED_BOARD_SEVENTY = new RegistryObject<>(() -> new SignBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> SPEED_BOARD_SEVENTY_FIVE= new RegistryObject<>(() -> new SignBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> SPEED_BOARD_EIGHTY = new RegistryObject<>(() -> new SignBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> SPEED_BOARD_HUNDRED = new RegistryObject<>(() -> new SignBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> SPEED_BOARD_ONE_TWENTY_FIVE = new RegistryObject<>(() -> new SignBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));

    // STOP MARKERS
    RegistryObject<Block> STOP_MARKER = new RegistryObject<>(() -> new StopMarker(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> STOP_MARKER_TWO = new RegistryObject<>(() -> new StopMarker(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> STOP_MARKER_THREE = new RegistryObject<>(() -> new StopMarker(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> STOP_MARKER_FOUR = new RegistryObject<>(() -> new StopMarker(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> STOP_MARKER_FIVE = new RegistryObject<>(() -> new StopMarker(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> STOP_MARKER_SIX = new RegistryObject<>(() -> new StopMarker(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> STOP_MARKER_SEVEN = new RegistryObject<>(() -> new StopMarker(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> STOP_MARKER_EIGHT = new RegistryObject<>(() -> new StopMarker(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> STOP_MARKER_NINE = new RegistryObject<>(() -> new StopMarker(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));

    // Signs
    RegistryObject<Block> WHISTLE_BOARD = new RegistryObject<>(() -> new SignBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> ADVANCED_CROSSING_SIGN = new RegistryObject<>(() -> new NormalSigns(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> OVERHEAD_NEUTRAL_SECTION = new RegistryObject<>(() -> new NormalSigns(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> OVERHEAD_NEUTRAL_SECTION_END = new RegistryObject<>(() -> new NormalSigns(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> CBTC_BLOCK_MARKER = new RegistryObject<>(() -> new NormalSigns(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> AWS_CANCEL_SIGN = new RegistryObject<>(() -> new NormalSigns(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> CHANGE_CURRENT_COLLECTION_SIGN = new RegistryObject<>(() -> new NormalSigns(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> SPEEDBOARD_ARROW_BOTH = new RegistryObject<>(() -> new ArrowBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> SPEEDBOARD_ARROW_LEFT = new RegistryObject<>(() -> new ArrowBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> SPEEDBOARD_ARROW_RIGHT = new RegistryObject<>(() -> new ArrowBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    RegistryObject<Block> SHUTDOWN_BOARD = new RegistryObject<>(() -> new SignBoard(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));

    // Ticket Barrier Blocks
    //RegistryObject<Block> BR_TICKET_BARRIER_ENTRANCE = new RegistryObject<>(() -> new BRTicketBarrier(true));
    //RegistryObject<Block> BR_TICKET_BARRIER_EXIT = new RegistryObject<>(() -> new BRTicketBarrier(false));

    // NYF
    //RegistryObject<Block> SUPPORT_BEAM_OVERHEAD = new RegistryObject<>(() -> new SupportBeamOverhead(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    //RegistryObject<Block> SUPPORT_BEAM_COLOUM = new RegistryObject<>(() -> new SupportBeamColoum(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1)));
    //RegistryObject<Block> OFF_DISPATCHER_SIGNAL = new RegistryObject<>(() -> new OFFDispatcherSignal(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(4)));
    RegistryObject<Block> CROSSING_BARRIER = new RegistryObject<>(() -> new CrossingBarrier(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).strength(4)));

}
