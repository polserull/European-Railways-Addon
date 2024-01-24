package gb.polserull.britishrail.Blocks;

import gb.polserull.britishrail.MyBlockEntityTypes;
import mtr.mappings.BlockEntityMapper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class OFFDispatcherSignal extends TheatreSignalDoubleLetter {

    public OFFDispatcherSignal(Properties settings) {
        super(settings);
    }

    @Override
    public BlockEntityMapper createBlockEntity(BlockPos pos, BlockState state) {
        return new TileEntityTheatreSignalDoubleLetter1(pos, state);
    }

    public static class TileEntityTheatreSignalDoubleLetter1 extends TheatreSignalDoubleLetter.TileEntityTheatreSignalDoubleLetter {
        public TileEntityTheatreSignalDoubleLetter1(BlockPos pos, BlockState state) {
            super(MyBlockEntityTypes.OFF_DISPATCHER_SIGNAL.get(), pos, state);
        }
    }
}