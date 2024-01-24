package gb.polserull.britishrail.Blocks;

import gb.polserull.britishrail.MyBlockEntityTypes;
import mtr.block.BlockSignalSemaphoreBase;
import mtr.mappings.BlockEntityMapper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class CautionSemaphore extends BlockSignalSemaphoreBase {

    public CautionSemaphore(Properties settings) {
        super(settings);
    }

    @Override
    public BlockEntityMapper createBlockEntity(BlockPos pos, BlockState state) {
        return new TileEntitySignalSemaphoreCaut(pos, state);
    }

    public static class TileEntitySignalSemaphoreCaut extends BlockSignalSemaphoreBase.TileEntitySignalSemaphoreBase {

        public TileEntitySignalSemaphoreCaut(BlockPos pos, BlockState state) {
            super(MyBlockEntityTypes.CAUTION_SEMAPHORE.get(), pos, state);
        }
    }
}