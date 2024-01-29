package gb.polserull.britishrail.Render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import mtr.block.BlockSignalSemaphoreBase;
import mtr.client.IDrawing;
import mtr.mappings.UtilitiesClient;
import mtr.render.MoreRenderLayers;
import mtr.render.RenderSignalBase;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;

public class RenderGateBarrier<T extends BlockSignalSemaphoreBase.TileEntitySignalSemaphoreBase> extends testrender<T> {

    private static final int ANGLE = 55;
    private static final int SPEED = 4;

    public RenderGateBarrier(BlockEntityRenderDispatcher dispatcher, boolean isSingleSided) {
        super(dispatcher, isSingleSided, 3);
    }

    @Override
    protected void render(PoseStack matrices, MultiBufferSource vertexConsumers, VertexConsumer vertexConsumer, T entity, float tickDelta, Direction facing, int occupiedAspect, boolean isBackSide) {
        final float angle = isBackSide ? entity.angle2 : entity.angle1;
        //IDrawing.drawTexture(matrices, vertexConsumer, -0.0625F, 0.296875F, -0.190625F, 0.0625F, 0.453125F, -0.190625F, facing.getOpposite(), angle < ANGLE / 2F ? 0xFFFFAA00 : 0xFF00FF00, MAX_LIGHT_GLOWING);
        matrices.translate(0.1875, 0.375, 0);
        UtilitiesClient.rotateZDegrees(matrices, 0 - angle);

        final Level world = entity.getLevel();
        if (world != null) {
            final BlockPos pos = entity.getBlockPos();
            final VertexConsumer vertexConsumer2 = vertexConsumers.getBuffer(MoreRenderLayers.getExterior(new ResourceLocation("britishrail:textures/block/gate_crossing.png")));
            final int light = LightTexture.pack(world.getBrightness(LightLayer.BLOCK, pos), world.getBrightness(LightLayer.SKY, pos));
            IDrawing.drawTexture(matrices, vertexConsumer2, -5F, -0.5F, -0.19375F, 0.295F, 0.5F, -0.19375F, facing.getOpposite().getCounterClockWise(), ARGB_WHITE, light); // x - up
            IDrawing.drawTexture(matrices, vertexConsumer2, 0.295F, -0.5F, -0.19375F, -0.705F, 0.5F, -0.19375F, 1, 0, 0, 1, facing.getOpposite(), ARGB_WHITE, light);
        }

        final float newAngle;
        if (occupiedAspect == 1) {
            newAngle = Math.max(0, angle - SPEED * tickDelta);
        } else {
            newAngle = Math.min(ANGLE, angle + SPEED * tickDelta);
        }
        if (isBackSide) {
            entity.angle2 = newAngle;
        } else {
            entity.angle1 = newAngle;
        }
    }
}