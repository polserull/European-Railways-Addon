package gb.polserull.europeanrail.Blocks;

import mtr.block.IBlock;
import mtr.mappings.BlockDirectionalMapper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class SignBoard extends BlockDirectionalMapper {

	public SignBoard(BlockBehaviour.Properties settings) {
		super(settings);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
		return defaultBlockState().setValue(FACING, blockPlaceContext.getHorizontalDirection().getOpposite());
	}

	@Override
	public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
		VoxelShape i1 =  IBlock.getVoxelShapeByDirection(6, 0, 6, 10, 16, 10, IBlock.getStatePropertySafe(blockState, FACING));
		VoxelShape i2 =  IBlock.getVoxelShapeByDirection(0, 0, 5, 16, 16, 6, IBlock.getStatePropertySafe(blockState, FACING));
		return Shapes.or(i1, i2);
	}
}
