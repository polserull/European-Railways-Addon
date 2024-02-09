package gb.polserull.europeanrail.Blocks;

import gb.polserull.europeanrail.MyBlockEntityTypes;
import mtr.block.BlockSignalLightBase;
import mtr.block.IBlock;
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

public class LimitOfShuntSignal extends BlockSignalLightBase {
	public LimitOfShuntSignal(Properties settings) {
		super(settings, 2, 14);
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext collisionContext) {
		VoxelShape i1 =  IBlock.getVoxelShapeByDirection(6, 0, 6, 10, 16, 10, IBlock.getStatePropertySafe(state, FACING));
		VoxelShape i2 =  IBlock.getVoxelShapeByDirection(1, 2, 10, 15, 14, 14, IBlock.getStatePropertySafe(state, FACING));
		return Shapes.or(i1, i2);
	}

	@Override
	public mtr.mappings.BlockEntityMapper createBlockEntity(BlockPos pos, BlockState state) {
		return new TileEntitySignalLShunt(pos, state);
	}

	public static class TileEntitySignalLShunt extends mtr.mappings.BlockEntityMapper {

		public TileEntitySignalLShunt(BlockPos pos, BlockState state) {
			super(MyBlockEntityTypes.LIMIT_OF_SHUNT_SIGNAL.get(), pos, state);
		}
	}
}
