package gb.polserull.britishrail.Blocks;

import gb.polserull.britishrail.MyBlockEntityTypes;
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

public class CrossingBarrier extends BlockSignalSemaphoreBase {

    public CrossingBarrier(Properties settings) {
        super(settings);
    }

    @Override
    public BlockEntityMapper createBlockEntity(BlockPos pos, BlockState state) {
        return new TileEntitySignalSemaphoreShunt(pos, state);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, BlockGetter blockGetter, List<Component> tooltip, TooltipFlag tooltipFlag) {
        tooltip.add(Text.translatable("tooltip.crossing_barrier").setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)));
    }

    public static class TileEntitySignalSemaphoreShunt extends TileEntitySignalSemaphoreBase {

        public TileEntitySignalSemaphoreShunt(BlockPos pos, BlockState state) {
            super(MyBlockEntityTypes.CROSSING_BARRIER.get(), pos, state);
        }
    }
}