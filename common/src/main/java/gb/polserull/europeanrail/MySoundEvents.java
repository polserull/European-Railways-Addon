package gb.polserull.europeanrail;

import mtr.mappings.RegistryUtilities;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public interface MySoundEvents {
        SoundEvent GATE_CROSSING_SOUND = RegistryUtilities.createSoundEvent(new ResourceLocation(Main.MOD_ID, "gatecrossing"));
}
