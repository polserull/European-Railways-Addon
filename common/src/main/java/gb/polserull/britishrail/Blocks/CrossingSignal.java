package gb.polserull.britishrail.Blocks;

import gb.polserull.britishrail.MyBlockEntityTypes;
import mtr.block.BlockSignalLightBase;
import mtr.block.IBlock;
import mtr.mappings.Text;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class CrossingSignal extends BlockSignalLightBase {
	public CrossingSignal(Properties settings) {
		super(settings, 2, 14);
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext collisionContext) {
		return IBlock.getVoxelShapeByDirection(0, 0, 0, 16, 16, 16, IBlock.getStatePropertySafe(state, FACING));
	}

	@Override
	public mtr.mappings.BlockEntityMapper createBlockEntity(BlockPos pos, BlockState state) {
		return new TileEntityTunnelSignalLight1(pos, state);
	}

	@Override
	public void appendHoverText(ItemStack itemStack, BlockGetter blockGetter, List<Component> tooltip, TooltipFlag tooltipFlag) {
		tooltip.add(Text.translatable("tooltip.crossing_signal").setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)));
	}

	public static class TileEntityTunnelSignalLight1 extends mtr.mappings.BlockEntityMapper {

		public TileEntityTunnelSignalLight1(BlockPos pos, BlockState state) {
			super(MyBlockEntityTypes.CROSSING_SIGNAL.get(), pos, state);
		}
	}
}
