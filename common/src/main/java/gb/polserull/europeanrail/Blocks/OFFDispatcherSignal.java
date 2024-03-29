package gb.polserull.europeanrail.Blocks;

import gb.polserull.europeanrail.MyBlockEntityTypes;
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
import net.minecraft.world.phys.shapes.Shapes;
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
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        VoxelShape i1 = IBlock.getVoxelShapeByDirection(2, 6, 0, 14, 16, 10, IBlock.getStatePropertySafe(blockState, FACING));
        return Shapes.or(i1);
    }



    public static class TileEntityTheatreSignalDoubleLetter1 extends TileEntitySignalSemaphoreBase {
        public TileEntityTheatreSignalDoubleLetter1(BlockPos pos, BlockState state) {
            super(MyBlockEntityTypes.OFF_DISPATCHER_SIGNAL.get(), pos, state);
        }
    }
}