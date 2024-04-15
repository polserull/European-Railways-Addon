package gb.polserull.europeanrail.Blocks;

import gb.polserull.europeanrail.MyBlockEntityTypes;
import mtr.block.BlockSignalSemaphoreBase;
import mtr.block.IBlock;
import mtr.mappings.BlockEntityMapper;
import mtr.mappings.EntityBlockMapper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class NLXSignal extends BlockSignalSemaphoreBase implements EntityBlockMapper, IBlock {
    public NLXSignal(Properties settings) {
        super(settings);
    }

    @Override
    public BlockEntityMapper createBlockEntity(BlockPos pos, BlockState state) {
        return new NLXSignal.TileEntityXSignal(pos, state);
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        VoxelShape i1 =  IBlock.getVoxelShapeByDirection(6, 0, 6, 10, 16, 10, IBlock.getStatePropertySafe(blockState, FACING));
        VoxelShape i2 = IBlock.getVoxelShapeByDirection(3, 2, 6, 13, 15, 13, IBlock.getStatePropertySafe(blockState, FACING));
        return Shapes.or(i1, i2);
    }

    public static class TileEntityXSignal extends TileEntitySignalSemaphoreBase {
        public TileEntityXSignal(BlockPos pos, BlockState state) {
            super(MyBlockEntityTypes.NL_X_INDICATOR.get(), pos, state);
        }
    }
}
