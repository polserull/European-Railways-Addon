package gb.polserull.britishrail.Blocks;

import gb.polserull.britishrail.MyBlockEntityTypes;
import mtr.block.BlockSignalSemaphoreBase;
import mtr.mappings.BlockEntityMapper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class ShortSemaphore extends BlockSignalSemaphoreBase {

    public ShortSemaphore(Properties settings) {
        super(settings);
    }

    @Override
    public BlockEntityMapper createBlockEntity(BlockPos pos, BlockState state) {
        return new TileEntitySignalSemaphoreShort (pos, state);
    }

    public static class TileEntitySignalSemaphoreShort extends TileEntitySignalSemaphoreBase {

        public TileEntitySignalSemaphoreShort(BlockPos pos, BlockState state) {
            super(MyBlockEntityTypes.SHORT_SEMAPHORE.get(), pos, state);
        }
    }
}