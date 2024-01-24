package gb.polserull.britishrail;

import mtr.*;
import mtr.mappings.BlockEntityMapper;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.BiConsumer;

public class Main {

	public static final String MOD_ID = "britishrail";

	public static Blocks blocks;
	public static Items items;
	public static SoundEvents soundEvents;
	public static BlockEntityTypes blockEntityTypes;

	public static void init(
			BiConsumer<String, RegistryObject<Item>> registerItem,
			BiConsumer<String, RegistryObject<Block>> registerBlock,
			RegisterBlockItem registerBlockItem,
			BiConsumer<String, RegistryObject<? extends BlockEntityType<? extends BlockEntityMapper>>> registerBlockEntityType,
			BiConsumer<String, RegistryObject<? extends EntityType<? extends Entity>>> registerEntityType,
			BiConsumer<String, SoundEvent> registerSoundEvent)
	{
		// SIGNALS
		registerBlockItem.accept("shunt_signal", MyBlocks.SHUNT_SIGNAL, MyItems.RAIL_SIGNALS);
		registerBlockItem.accept("limit_of_shunt_signal", MyBlocks.LIMIT_OF_SHUNT_SIGNAL, MyItems.RAIL_SIGNALS);
		registerBlockItem.accept("crossing_signal", MyBlocks.CROSSING_SIGNAL, MyItems.RAIL_SIGNALS);
		registerBlockItem.accept("caution_semaphore", MyBlocks.CAUTION_SEMAPHORE, MyItems.RAIL_SIGNALS);
		registerBlockItem.accept("short_semaphore", MyBlocks.SHORT_SEMAPHORE, MyItems.RAIL_SIGNALS);
		registerBlockItem.accept("off_dispatch_signal", MyBlocks.OFF_DISPATCHER_SIGNAL, MyItems.RAIL_SIGNALS);

		// SPEED BOARDS STANDARD
		registerBlockItem.accept("speed_board_five", MyBlocks.SPEED_BOARD_FIVE, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("speed_board_ten", MyBlocks.SPEED_BOARD_TEN, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("speed_board_fifteen", MyBlocks.SPEED_BOARD_FIFTEEN, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("speed_board_twenty", MyBlocks.SPEED_BOARD_TWENTY, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("speed_board_twenty_five", MyBlocks.SPEED_BOARD_TWENTY_FIVE, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("speed_board_thirty", MyBlocks.SPEED_BOARD_THIRTY, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("speed_board_forty", MyBlocks.SPEED_BOARD_FORTY, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("speed_board_forty_five", MyBlocks.SPEED_BOARD_FORTY_FIVE, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("speed_board_fifty", MyBlocks.SPEED_BOARD_FIFTY, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("speed_board_sixty", MyBlocks.SPEED_BOARD_SIXTY, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("speed_board_seventy", MyBlocks.SPEED_BOARD_SEVENTY, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("speed_board_seventy_five", MyBlocks.SPEED_BOARD_SEVENTY_FIVE, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("speed_board_eighty", MyBlocks.SPEED_BOARD_EIGHTY, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("speed_board_hundred", MyBlocks.SPEED_BOARD_HUNDRED, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("speed_board_one_twenty_five", MyBlocks.SPEED_BOARD_ONE_TWENTY_FIVE, MyItems.RAIL_SIGNS);

		// STOP MARKERS
		registerBlockItem.accept("stop_marker", MyBlocks.STOP_MARKER, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("stop_marker_2", MyBlocks.STOP_MARKER_TWO, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("stop_marker_3", MyBlocks.STOP_MARKER_THREE, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("stop_marker_4", MyBlocks.STOP_MARKER_FOUR, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("stop_marker_5", MyBlocks.STOP_MARKER_FIVE, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("stop_marker_6", MyBlocks.STOP_MARKER_SIX, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("stop_marker_7", MyBlocks.STOP_MARKER_SEVEN, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("stop_marker_8", MyBlocks.STOP_MARKER_EIGHT, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("stop_marker_9", MyBlocks.STOP_MARKER_NINE, MyItems.RAIL_SIGNS);

		// SIGNS
		registerBlockItem.accept("whistle_board", MyBlocks.WHISTLE_BOARD, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("advance_warning_sign_crossing", MyBlocks.ADVANCED_CROSSING_SIGN, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("overhead_neutral_section", MyBlocks.OVERHEAD_NEUTRAL_SECTION, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("speedboard_arrow_both", MyBlocks.SPEEDBOARD_ARROW_BOTH, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("speedboard_arrow_left", MyBlocks.SPEEDBOARD_ARROW_LEFT, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("speedboard_arrow_right", MyBlocks.SPEEDBOARD_ARROW_RIGHT, MyItems.RAIL_SIGNS);

		// Ticket Barriers
		registerBlockItem.accept("ticket_barrier_entrance_1", MyBlocks.BR_TICKET_BARRIER_ENTRANCE, MyItems.RAIL_SIGNS);
		registerBlockItem.accept("ticket_barrier_exit_1", MyBlocks.BR_TICKET_BARRIER_EXIT, MyItems.RAIL_SIGNS);

		registerItem.accept("advance_ticket", MyItems.ADVANCE_TICKET);

		// Register Entity
		registerBlockEntityType.accept("shunt_signal", MyBlockEntityTypes.SHUNT_SIGNAL);
		registerBlockEntityType.accept("crossing_signal", MyBlockEntityTypes.CROSSING_SIGNAL);
		registerBlockEntityType.accept("caution_semaphore", MyBlockEntityTypes.CAUTION_SEMAPHORE);
		registerBlockEntityType.accept("short_semaphore", MyBlockEntityTypes.SHORT_SEMAPHORE);
		registerBlockEntityType.accept("limit_of_shunt_signal", MyBlockEntityTypes.LIMIT_OF_SHUNT_SIGNAL);
		registerBlockEntityType.accept("off_dispatch_signal", MyBlockEntityTypes.OFF_DISPATCHER_SIGNAL);
	}

	@FunctionalInterface
	public interface RegisterBlockItem {
		void accept(String string, RegistryObject<Block> block, CreativeModeTabs.Wrapper tab);
	}
}
