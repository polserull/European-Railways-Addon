package gb.polserull.europeanrail.Blocks;

import gb.polserull.europeanrail.MyBlockEntityTypes;
import mtr.block.BlockSignalLightBase;
import mtr.block.IBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class GantrySignalThree extends BlockSignalLightBase {
    public GantrySignalThree(Properties settings) {
        super(settings, 2, 14);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext collisionContext) {
        VoxelShape i1 =  IBlock.getVoxelShapeByDirection(8, -9, 0, 19, 9, 16, IBlock.getStatePropertySafe(state, FACING));
        return Shapes.or(i1);
    }

    @Override
    public mtr.mappings.BlockEntityMapper createBlockEntity(BlockPos pos, BlockState state) {
        return new GantrySignalThree.TileEntityGantryThreeSignal(pos, state);
    }

    public static class TileEntityGantryThreeSignal extends mtr.mappings.BlockEntityMapper {
        public TileEntityGantryThreeSignal(BlockPos pos, BlockState state) {
            super(MyBlockEntityTypes.GANTRY_SIGNAL_THREE.get(), pos, state);
        }
    }
}
