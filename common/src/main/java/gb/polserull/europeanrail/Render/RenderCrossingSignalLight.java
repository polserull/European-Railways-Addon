package gb.polserull.europeanrail.Render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import gb.polserull.europeanrail.MySoundEvents;
import mtr.client.IDrawing;
import mtr.mappings.BlockEntityMapper;
import mtr.mappings.Utilities;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;

public class RenderCrossingSignalLight<T extends BlockEntityMapper> extends testrender<T> {

	boolean aspect = false;
	final boolean redOnTop;
	final int proceedColor;
	final int amberColor;
	private final boolean isRedLight1Active;

	public RenderCrossingSignalLight(BlockEntityRenderDispatcher dispatcher, boolean isSingleSided, boolean redOnTop, int proceedColor, int amberColor) {
		super(dispatcher, isSingleSided, 3);
		this.redOnTop = redOnTop;
		this.proceedColor = proceedColor;
		this.amberColor = amberColor;
		this.isRedLight1Active = true;
	}

	@Override
	protected void render(PoseStack matrices, MultiBufferSource vertexConsumers, VertexConsumer vertexConsumer, T entity, float tickDelta, Direction facing, int occupiedAspect, boolean isBackSide) {
		final int color;
		float cs = 0F;
		float cy = 0F;
		switch (occupiedAspect) {
			case 1:
				cs = 0.30F;
				cy = 0.55F;
				color = 0xFFFF0000; // Red
				break;
			case 2:
				cs = -0.09F;
				cy = 0.20F;
				color = 0xFFFFAA00; // Amber
				break;
			default:
				color = 0xFF00FF00; // Green
				break;
		}
		final float y = occupiedAspect > 0 == redOnTop ? 0.20F : cy;
		final float x = occupiedAspect > 0 == redOnTop ? -0.15F : cs; // GREEN -> RED
		final float z = occupiedAspect > 0 == redOnTop ? -0.20F : -0.40F;

		if (occupiedAspect == 1) {
			long currentTime = System.currentTimeMillis();

			float blinkX1 = -0.55F;
			float blinkY1 = 0.53F;
			float blinkZ1 = -0.40F;

			float blinkX2 = 0.40F;
			float blinkY2 = 0.53F;
			float blinkZ2 = -0.40F;

			playCrossingSound(entity);

			if (currentTime % 1000 < 500) {
				IDrawing.drawTexture(matrices, vertexConsumer, blinkX1, blinkY1, blinkZ1, blinkX1 + 0.1875F, blinkY1 + 0.1875F, blinkZ1 + 0.0001F, facing, isRedLight1Active ? 0xFFFF0000 : 0, MAX_LIGHT_GLOWING);
			} else {
				IDrawing.drawTexture(matrices, vertexConsumer, blinkX2, blinkY2, blinkZ2, blinkX2 + 0.1875F, blinkY2 + 0.1875F, blinkZ2 + 0.0001F, facing, isRedLight1Active ? 0xFFFF0000 : 0, MAX_LIGHT_GLOWING);
			}
		} else {
			IDrawing.drawTexture(matrices, vertexConsumer, x, y, z, x + 0.1875F, y + 0.1875F, z + 0.0001F, facing.getOpposite(), color, MAX_LIGHT_GLOWING);
		}
	}

	// TODO: More Testing
	private void playCrossingSound(T entity) {
		java.util.Timer t = new Timer();

		if(aspect) {
			return;
		} else {
			aspect=true;
			Objects.requireNonNull(entity.getLevel()).playLocalSound(entity.getBlockPos(), MySoundEvents.GATE_CROSSING_SOUND, SoundSource.BLOCKS, 1, 1, false);
			System.out.println("Crossing Signal Sound Activated!");
			t.schedule(new TimerTask() {
				@Override
				public void run() {
					aspect=false;
					System.out.println("Set Aspect To: False!");
				}
			}, 8 * 1000);
		}
	}
}

