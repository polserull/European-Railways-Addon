package gb.polserull.europeanrail.Render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import mtr.client.ClientData;
import mtr.client.IDrawing;
import mtr.render.RenderSignalBase;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.core.Direction;

public class RenderLimitOfShuntSignalLight<T extends mtr.mappings.BlockEntityMapper> extends RenderSignalBase<T> {

	final boolean redOnTop;
	final int proceedColor;

	public RenderLimitOfShuntSignalLight(BlockEntityRenderDispatcher dispatcher, boolean isSingleSided, boolean redOnTop, int proceedColor) {
		super(dispatcher, isSingleSided, 2);
		this.redOnTop = redOnTop;
		this.proceedColor = proceedColor;
	}

	@Override
	protected void render(PoseStack matrices, MultiBufferSource vertexConsumers, VertexConsumer vertexConsumer, T entity, float tickDelta, Direction facing, int occupiedAspect, boolean isBackSide) {
		IDrawing.drawTexture(matrices, vertexConsumer, -0.30F, 0.24F, -0.45F, -0.30F + 0.1875F, 0.24F + 0.1875F, -0.45F, Direction.NORTH, 0xFFFF0000, MAX_LIGHT_GLOWING);
		IDrawing.drawTexture(matrices, vertexConsumer, 0.15F,  0.24F, -0.45F, 0.15F + 0.1875F, 0.24F + 0.1875F, -0.45F, Direction.NORTH, 0xFFFF0000, MAX_LIGHT_GLOWING);
	}
}
