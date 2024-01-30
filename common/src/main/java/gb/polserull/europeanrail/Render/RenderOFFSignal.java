package gb.polserull.europeanrail.Render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import mtr.block.BlockSignalSemaphoreBase;
import mtr.client.IDrawing;
import mtr.render.MoreRenderLayers;
import mtr.render.RenderSignalBase;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class RenderOFFSignal<T extends BlockSignalSemaphoreBase.TileEntitySignalSemaphoreBase> extends RenderSignalBase<T> {

    public RenderOFFSignal(BlockEntityRenderDispatcher dispatcher, boolean isSingleSided) {
        super(dispatcher, isSingleSided, 3);
    }

    @Override
    protected void render(PoseStack matrices, MultiBufferSource vertexConsumers, VertexConsumer vertexConsumer, T entity, float tickDelta, Direction facing, int occupiedAspect, boolean isBackSide) {
        final Level world = entity.getLevel();
        matrices.translate(0.250, 0.525, 0.200);
        if (world != null) {
            final BlockPos pos = entity.getBlockPos();
            final VertexConsumer vertexConsumer2 = vertexConsumers.getBuffer(MoreRenderLayers.getExterior(new ResourceLocation("europeanrail:textures/block/theatre/off_dispatch.png")));
            IDrawing.drawTexture(matrices, vertexConsumer2, -0.705F, -0.5F, -0.13375F, 0.295F, 0.5F, -0.13375F, facing.getOpposite(), ARGB_WHITE, MAX_LIGHT_GLOWING);
        }
    }
}