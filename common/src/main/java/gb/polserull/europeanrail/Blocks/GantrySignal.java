package gb.polserull.europeanrail.Blocks;

import gb.polserull.europeanrail.MyBlockEntityTypes;
import mtr.block.BlockSignalLightBase;
import mtr.block.IBlock;
import mtr.mappings.BlockDirectionalMapper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class GantrySignal extends BlockSignalLightBase {
    public GantrySignal(Properties settings) {
        super(settings, 2, 14);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter blockGetter, BlockPos pos, CollisionContext collisionContext) {
        VoxelShape i1 =  IBlock.getVoxelShapeByDirection(8, -9, 0, 19, 9, 16, IBlock.getStatePropertySafe(state, FACING));
        return Shapes.or(i1);
    }

    @Override
    public mtr.mappings.BlockEntityMapper createBlockEntity(BlockPos pos, BlockState state) {
        return new GantrySignal.TileEntityGantrySignal(pos, state);
    }

    public static class TileEntityGantrySignal extends mtr.mappings.BlockEntityMapper {
        public TileEntityGantrySignal(BlockPos pos, BlockState state) {
            super(MyBlockEntityTypes.GANTRY_SIGNAL_TWO.get(), pos, state);
        }
    }
}
