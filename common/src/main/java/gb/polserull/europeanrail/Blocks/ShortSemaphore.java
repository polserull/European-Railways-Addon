package gb.polserull.europeanrail.Blocks;

import gb.polserull.europeanrail.MyBlockEntityTypes;
import mtr.block.BlockSignalSemaphoreBase;
import mtr.mappings.BlockEntityMapper;
import mtr.mappings.Text;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;

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