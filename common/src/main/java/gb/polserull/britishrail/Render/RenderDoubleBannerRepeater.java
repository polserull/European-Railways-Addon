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

public class RenderDoubleBannerRepeater<T extends BlockSignalSemaphoreBase.TileEntitySignalSemaphoreBase> extends RenderSignalBase<T> {
    public boolean isRedAspect = false;

    public RenderDoubleBannerRepeater(BlockEntityRenderDispatcher dispatcher, boolean isSingleSided) {
        super(dispatcher, isSingleSided, 3);
    }

    @Override
    protected void render(PoseStack matrices, MultiBufferSource vertexConsumers, VertexConsumer vertexConsumer, T entity, float tickDelta, Direction facing, int occupiedAspect, boolean isBackSide) {
        isRedAspect = occupiedAspect == 1;
        final Level world = entity.getLevel();
        matrices.translate(isRedAspect ? 0.450 : 0, 0.525, 0.200); // RED = CLEAR
        if (world != null) {
            final BlockPos pos = entity.getBlockPos();
            final VertexConsumer vertexConsumer2 = vertexConsumers.getBuffer(MoreRenderLayers.getExterior(new ResourceLocation(isRedAspect ? "britishrail:textures/block/theatre/banner_repeater_danger.png" : "britishrail:textures/block/theatre/banner_repeater.png")));
            IDrawing.drawTexture(matrices, vertexConsumer2, -0.705F, -0.5F, -0.13375F, 0.295F, 0.5F, -0.13375F, facing.getOpposite(), ARGB_WHITE, MAX_LIGHT_GLOWING);
        }
    }
}