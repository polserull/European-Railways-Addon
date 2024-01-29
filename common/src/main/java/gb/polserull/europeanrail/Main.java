package gb.polserull.europeanrail;

import mtr.*;
import net.minecraft.world.level.block.Block;

public class Main {

	public static final String MOD_ID = "europeanrail";

	public static Blocks blocks;
	public static Items items;
	public static SoundEvents soundEvents;
	public static BlockEntityTypes blockEntityTypes;

	public static void init(RegistriesWrapper registries)
			//BiConsumer<String, RegistryObject<Item>> registerItem,
			//BiConsumer<String, RegistryObject<Block>> registerBlock,
			//RegisterBlockItem registries.registerBlockAndItem,
			//BiConsumer<String, RegistryObject<? extends BlockEntityType<? extends BlockEntityMapper>>> registerBlockEntityType,
			//BiConsumer<String, RegistryObject<? extends EntityType<? extends Entity>>> registerEntityType,
			//BiConsumer<String, SoundEvent> registerSoundEvent)
	{
			// SIGNALS
			registries.registerBlockAndItem("shunt_signal", MyBlocks.SHUNT_SIGNAL, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("limit_of_shunt_signal", MyBlocks.LIMIT_OF_SHUNT_SIGNAL, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("crossing_signal", MyBlocks.CROSSING_SIGNAL, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("gate_crossing", MyBlocks.CROSSING_BARRIER, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("caution_semaphore", MyBlocks.CAUTION_SEMAPHORE, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("short_semaphore", MyBlocks.SHORT_SEMAPHORE, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("shunt_semaphore", MyBlocks.SHUNT_SEMAPHORE, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("off_dispatch_signal", MyBlocks.OFF_DISPATCHER_SIGNAL, MyItems.UK_RAILWAYS);
			//registries.registerBlockAndItem("double_banner_repeater", MyBlocks.DOUBLE_BANNER_REPEATER, MyItems.UK_RAILWAYS);

			// SPEED BOARDS STANDARD
			registries.registerBlockAndItem("speed_board_five", MyBlocks.SPEED_BOARD_FIVE, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("speed_board_ten", MyBlocks.SPEED_BOARD_TEN, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("speed_board_fifteen", MyBlocks.SPEED_BOARD_FIFTEEN, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("speed_board_twenty", MyBlocks.SPEED_BOARD_TWENTY, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("speed_board_twenty_five", MyBlocks.SPEED_BOARD_TWENTY_FIVE, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("speed_board_thirty", MyBlocks.SPEED_BOARD_THIRTY, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("speed_board_forty", MyBlocks.SPEED_BOARD_FORTY, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("speed_board_forty_five", MyBlocks.SPEED_BOARD_FORTY_FIVE, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("speed_board_fifty", MyBlocks.SPEED_BOARD_FIFTY, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("speed_board_sixty", MyBlocks.SPEED_BOARD_SIXTY, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("speed_board_seventy", MyBlocks.SPEED_BOARD_SEVENTY, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("speed_board_seventy_five", MyBlocks.SPEED_BOARD_SEVENTY_FIVE, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("speed_board_eighty", MyBlocks.SPEED_BOARD_EIGHTY, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("speed_board_hundred", MyBlocks.SPEED_BOARD_HUNDRED, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("speed_board_one_twenty_five", MyBlocks.SPEED_BOARD_ONE_TWENTY_FIVE, MyItems.UK_RAILWAYS);

			// STOP MARKERS
			registries.registerBlockAndItem("stop_marker", MyBlocks.STOP_MARKER, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("stop_marker_2", MyBlocks.STOP_MARKER_TWO, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("stop_marker_3", MyBlocks.STOP_MARKER_THREE, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("stop_marker_4", MyBlocks.STOP_MARKER_FOUR, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("stop_marker_5", MyBlocks.STOP_MARKER_FIVE, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("stop_marker_6", MyBlocks.STOP_MARKER_SIX, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("stop_marker_7", MyBlocks.STOP_MARKER_SEVEN, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("stop_marker_8", MyBlocks.STOP_MARKER_EIGHT, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("stop_marker_9", MyBlocks.STOP_MARKER_NINE, MyItems.UK_RAILWAYS);

			// SIGNS
			registries.registerBlockAndItem("whistle_board", MyBlocks.WHISTLE_BOARD, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("advance_warning_sign_crossing", MyBlocks.ADVANCED_CROSSING_SIGN, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("overhead_neutral_section", MyBlocks.OVERHEAD_NEUTRAL_SECTION, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("cbtc_block_marker", MyBlocks.CBTC_BLOCK_MARKER, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("aws_cancel_sign", MyBlocks.AWS_CANCEL_SIGN, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("change_current_collection_sign", MyBlocks.CHANGE_CURRENT_COLLECTION_SIGN, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("overhead_neutral_section_end", MyBlocks.OVERHEAD_NEUTRAL_SECTION_END, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("speedboard_arrow_both", MyBlocks.SPEEDBOARD_ARROW_BOTH, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("speedboard_arrow_left", MyBlocks.SPEEDBOARD_ARROW_LEFT, MyItems.UK_RAILWAYS);
			registries.registerBlockAndItem("speedboard_arrow_right", MyBlocks.SPEEDBOARD_ARROW_RIGHT, MyItems.UK_RAILWAYS);

			// Ticket Barriers
			//registries.registerBlockAndItem("ticket_barrier_entrance_1", MyBlocks.BR_TICKET_BARRIER_ENTRANCE, MyItems.UK_RAILWAYS);
			//registries.registerBlockAndItem("ticket_barrier_exit_1", MyBlocks.BR_TICKET_BARRIER_EXIT, MyItems.UK_RAILWAYS);
			//registerItem("advance_ticket", MyItems.ADVANCE_TICKET);
			//registries.registerBlockAndItem("ticket_machine", MyBlocks.BR_TICKET_MACHINE, MyItems.UK_RAILWAYS);

			// Register Entity
			registries.registerBlockEntityType("shunt_signal", MyBlockEntityTypes.SHUNT_SIGNAL);
		    registries.registerBlockEntityType("crossing_signal", MyBlockEntityTypes.CROSSING_SIGNAL);
		    registries.registerBlockEntityType("caution_semaphore", MyBlockEntityTypes.CAUTION_SEMAPHORE);
		    registries.registerBlockEntityType("short_semaphore", MyBlockEntityTypes.SHORT_SEMAPHORE);
		    registries.registerBlockEntityType("limit_of_shunt_signal", MyBlockEntityTypes.LIMIT_OF_SHUNT_SIGNAL);
			registries.registerBlockEntityType("off_dispatch_signal", MyBlockEntityTypes.OFF_DISPATCHER_SIGNAL);
			//registerBlockEntityType("double_banner_repeater", MyBlockEntityTypes.DOUBLE_BANNER_REPEATER);
		    registries.registerBlockEntityType("shunt_semaphore", MyBlockEntityTypes.SHUNT_SEMAPHORE);
			registries.registerBlockEntityType("gate_crossing", MyBlockEntityTypes.CROSSING_BARRIER);
	}

	@FunctionalInterface
	public interface registerBlockAndItem {
		void accept(String string, RegistryObject<Block> block, CreativeModeTabs.Wrapper tab);
	}
}
