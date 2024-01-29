package gb.polserull.europeanrail.Render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import mtr.client.IDrawing;
import mtr.render.RenderSignalBase;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.core.Direction;

public class RenderShuntSignalLight<T extends mtr.mappings.BlockEntityMapper> extends RenderSignalBase<T> {

	final boolean redOnTop;
	final int proceedColor;

	public RenderShuntSignalLight(BlockEntityRenderDispatcher dispatcher, boolean isSingleSided, boolean redOnTop, int proceedColor) {
		super(dispatcher, isSingleSided, 2);
		this.redOnTop = redOnTop;
		this.proceedColor = proceedColor;
	}

	@Override
	protected void render(PoseStack matrices, MultiBufferSource vertexConsumers, VertexConsumer vertexConsumer, T entity, float tickDelta, Direction facing, int occupiedAspect, boolean isBackSide) {
		final float y = occupiedAspect > 0 == redOnTop ? 0.24F : 0.24F;
		final float x = occupiedAspect > 0 == redOnTop ? -0.30F : 0.15F;
		IDrawing.drawTexture(matrices, vertexConsumer, x, y, -0.45F, x + 0.1875F, y + 0.1875F, -0.45F, Direction.NORTH, occupiedAspect > 0 ? 0xFFFF0000 : 0xFFFFFFFF, MAX_LIGHT_GLOWING);
		final float yy = occupiedAspect > 0 == redOnTop ? 0.59F : 0.24F;
		final float xx = occupiedAspect > 0 == redOnTop ? -0F : -0.30F;
		IDrawing.drawTexture(matrices, vertexConsumer, xx, yy, -0.45F, xx + 0.1875F, yy + 0.1875F, -0.45F, Direction.NORTH, occupiedAspect > 0 ? 0xFFFF0000 : 0xFFFFFFFF, MAX_LIGHT_GLOWING);
	}
}
