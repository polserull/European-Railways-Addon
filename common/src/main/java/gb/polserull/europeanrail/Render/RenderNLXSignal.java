package gb.polserull.europeanrail.Render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import mtr.block.BlockSignalSemaphoreBase;
import mtr.client.IDrawing;
import mtr.render.MoreRenderLayers;
import mtr.render.RenderSignalBase;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class RenderNLXSignal<T extends BlockSignalSemaphoreBase.TileEntitySignalSemaphoreBase> extends RenderSignalBase<T> {

    public RenderNLXSignal(BlockEntityRenderDispatcher dispatcher, boolean isSingleSided) {
        super(dispatcher, isSingleSided, 4);
    }

    @Override
    protected void render(PoseStack matrices, MultiBufferSource vertexConsumers, VertexConsumer vertexConsumer, T entity, float tickDelta, Direction facing, int occupiedAspect, boolean isBackSide) {
        final Level world = entity.getLevel();

        matrices.translate(0.250, 0.525, -0.125); //d: Left/Right e: Up/Down f: Forward/Backward
        if (world != null && occupiedAspect == 3) { // Activates on a pl-caution aspect
            long currentTime = System.currentTimeMillis();

            final VertexConsumer vertexConsumer2 = vertexConsumers.getBuffer(MoreRenderLayers.getExterior(new ResourceLocation("europeanrail:textures/block/theatre/nl_x_active.png")));

            if (currentTime % 1000 < 500) {
                IDrawing.drawTexture(matrices, vertexConsumer2, -0.705F, -0.5F, -0.13375F, 0.295F, 0.5F, -0.13375F, facing.getOpposite(), ARGB_WHITE, MAX_LIGHT_GLOWING);
            }
        }
    }
}
