package gb.polserull.britishrail.Blocks;

import mtr.block.IBlock;
import mtr.mappings.BlockDirectionalMapper;
import mtr.mappings.Text;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NormalSigns extends BlockDirectionalMapper {

	public final String tooltipID;

	public NormalSigns(Properties settings, String tooltipID) {
		super(settings);
		this.tooltipID = tooltipID;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
		return defaultBlockState().setValue(FACING, blockPlaceContext.getHorizontalDirection().getOpposite().getClockWise());
	}

	@Override
	public void appendHoverText(ItemStack itemStack, BlockGetter blockGetter, List<Component> tooltip, TooltipFlag tooltipFlag) {
		tooltip.add(Text.translatable(tooltipID).setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)));
	}

	@Override
	public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
		return IBlock.getVoxelShapeByDirection(0.01, 0.01, 0.01, 16, 16, 16, IBlock.getStatePropertySafe(blockState, FACING));
	}
}
