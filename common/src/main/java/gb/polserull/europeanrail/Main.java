package gb.polserull.europeanrail;

import mtr.CreativeModeTabs;
import mtr.RegistryObject;
import mtr.mappings.BlockEntityMapper;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.BiConsumer;

public class Main {

	public static final String MOD_ID = "europeanrail";

	public static void init(
			RegisterBlockItem registerBlockItem,
			BiConsumer<String, RegistryObject<? extends BlockEntityType<? extends BlockEntityMapper>>> registerBlockEntityType,
			BiConsumer<String, SoundEvent> registerSoundEvent
	)
	{
			// SIGNALS
			registerBlockItem.accept("shunt_signal", MyBlocks.SHUNT_SIGNAL, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("limit_of_shunt_signal", MyBlocks.LIMIT_OF_SHUNT_SIGNAL, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("crossing_signal", MyBlocks.CROSSING_SIGNAL, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("gate_crossing", MyBlocks.CROSSING_BARRIER, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("caution_semaphore", MyBlocks.CAUTION_SEMAPHORE, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("short_semaphore", MyBlocks.SHORT_SEMAPHORE, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("shunt_semaphore", MyBlocks.SHUNT_SEMAPHORE, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("off_dispatch_signal", MyBlocks.OFF_DISPATCHER_SIGNAL, MyItems.UK_RAILWAYS);
			//registerBlockItem.accept("double_banner_repeater", MyBlocks.DOUBLE_BANNER_REPEATER, MyItems.UK_RAILWAYS);

			// SPEED BOARDS STANDARD
			registerBlockItem.accept("speed_board_five", MyBlocks.SPEED_BOARD_FIVE, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("speed_board_ten", MyBlocks.SPEED_BOARD_TEN, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("speed_board_fifteen", MyBlocks.SPEED_BOARD_FIFTEEN, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("speed_board_twenty", MyBlocks.SPEED_BOARD_TWENTY, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("speed_board_twenty_five", MyBlocks.SPEED_BOARD_TWENTY_FIVE, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("speed_board_thirty", MyBlocks.SPEED_BOARD_THIRTY, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("speed_board_forty", MyBlocks.SPEED_BOARD_FORTY, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("speed_board_forty_five", MyBlocks.SPEED_BOARD_FORTY_FIVE, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("speed_board_fifty", MyBlocks.SPEED_BOARD_FIFTY, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("speed_board_sixty", MyBlocks.SPEED_BOARD_SIXTY, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("speed_board_seventy", MyBlocks.SPEED_BOARD_SEVENTY, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("speed_board_seventy_five", MyBlocks.SPEED_BOARD_SEVENTY_FIVE, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("speed_board_eighty", MyBlocks.SPEED_BOARD_EIGHTY, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("speed_board_hundred", MyBlocks.SPEED_BOARD_HUNDRED, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("speed_board_one_twenty_five", MyBlocks.SPEED_BOARD_ONE_TWENTY_FIVE, MyItems.UK_RAILWAYS);

			// STOP MARKERS
			registerBlockItem.accept("stop_marker", MyBlocks.STOP_MARKER, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("stop_marker_2", MyBlocks.STOP_MARKER_TWO, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("stop_marker_3", MyBlocks.STOP_MARKER_THREE, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("stop_marker_4", MyBlocks.STOP_MARKER_FOUR, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("stop_marker_5", MyBlocks.STOP_MARKER_FIVE, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("stop_marker_6", MyBlocks.STOP_MARKER_SIX, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("stop_marker_7", MyBlocks.STOP_MARKER_SEVEN, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("stop_marker_8", MyBlocks.STOP_MARKER_EIGHT, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("stop_marker_9", MyBlocks.STOP_MARKER_NINE, MyItems.UK_RAILWAYS);

			// SIGNS
			registerBlockItem.accept("whistle_board", MyBlocks.WHISTLE_BOARD, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("advance_warning_sign_crossing", MyBlocks.ADVANCED_CROSSING_SIGN, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("overhead_neutral_section", MyBlocks.OVERHEAD_NEUTRAL_SECTION, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("cbtc_block_marker", MyBlocks.CBTC_BLOCK_MARKER, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("aws_cancel_sign", MyBlocks.AWS_CANCEL_SIGN, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("change_current_collection_sign", MyBlocks.CHANGE_CURRENT_COLLECTION_SIGN, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("overhead_neutral_section_end", MyBlocks.OVERHEAD_NEUTRAL_SECTION_END, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("speedboard_arrow_both", MyBlocks.SPEEDBOARD_ARROW_BOTH, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("speedboard_arrow_left", MyBlocks.SPEEDBOARD_ARROW_LEFT, MyItems.UK_RAILWAYS);
			registerBlockItem.accept("speedboard_arrow_right", MyBlocks.SPEEDBOARD_ARROW_RIGHT, MyItems.UK_RAILWAYS);

			// Ticket Barriers
			//registerBlockItem.accept("ticket_barrier_entrance_1", MyBlocks.BR_TICKET_BARRIER_ENTRANCE, MyItems.UK_RAILWAYS);
			//registerBlockItem.accept("ticket_barrier_exit_1", MyBlocks.BR_TICKET_BARRIER_EXIT, MyItems.UK_RAILWAYS);
			//registerBlockItem.accept("ticket_machine", MyBlocks.BR_TICKET_MACHINE, MyItems.UK_RAILWAYS);

			// Register Entity
		    registerBlockEntityType.accept("shunt_signal", MyBlockEntityTypes.SHUNT_SIGNAL);
			registerBlockEntityType.accept("crossing_signal", MyBlockEntityTypes.CROSSING_SIGNAL);
			registerBlockEntityType.accept("caution_semaphore", MyBlockEntityTypes.CAUTION_SEMAPHORE);
			registerBlockEntityType.accept("short_semaphore", MyBlockEntityTypes.SHORT_SEMAPHORE);
			registerBlockEntityType.accept("limit_of_shunt_signal", MyBlockEntityTypes.LIMIT_OF_SHUNT_SIGNAL);
			registerBlockEntityType.accept("off_dispatch_signal", MyBlockEntityTypes.OFF_DISPATCHER_SIGNAL);
		    registerBlockEntityType.accept("shunt_semaphore", MyBlockEntityTypes.SHUNT_SEMAPHORE);
			registerBlockEntityType.accept("gate_crossing", MyBlockEntityTypes.CROSSING_BARRIER);
		    //registerBlockEntityType.accept("double_banner_repeater", MyBlockEntityTypes.DOUBLE_BANNER_REPEATER);
	}

	@FunctionalInterface
	public interface RegisterBlockItem {
		void accept(String string, RegistryObject<Block> block, CreativeModeTabs.Wrapper tab);
	}
}
