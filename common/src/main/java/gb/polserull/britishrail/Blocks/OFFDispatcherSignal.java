package gb.polserull.britishrail.Blocks;

import gb.polserull.britishrail.MyBlockEntityTypes;
import mtr.block.BlockSignalSemaphoreBase;
import mtr.block.IBlock;
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
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.List;

public class OFFDispatcherSignal extends BlockSignalSemaphoreBase {

    public OFFDispatcherSignal(Properties settings) {
        super(settings);
    }

    @Override
    public BlockEntityMapper createBlockEntity(BlockPos pos, BlockState state) {
        return new TileEntityTheatreSignalDoubleLetter1(pos, state);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, BlockGetter blockGetter, List<Component> tooltip, TooltipFlag tooltipFlag) {
        tooltip.add(Text.translatable("tooltip.off_signal").setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)));
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        return IBlock.getVoxelShapeByDirection(0.01, 0.01, 0.01, 6, 6, 6, IBlock.getStatePropertySafe(blockState, FACING));
    }



    public static class TileEntityTheatreSignalDoubleLetter1 extends TileEntitySignalSemaphoreBase {
        public TileEntityTheatreSignalDoubleLetter1(BlockPos pos, BlockState state) {
            super(MyBlockEntityTypes.OFF_DISPATCHER_SIGNAL.get(), pos, state);
        }
    }
}