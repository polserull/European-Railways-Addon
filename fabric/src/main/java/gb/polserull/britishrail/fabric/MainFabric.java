package gb.polserull.britishrail.fabric;

import gb.polserull.britishrail.mappings.FabricRegistryUtilities;
import gb.polserull.britishrail.Main;
import gb.polserull.britishrail.PanelCommand;
import mtr.CreativeModeTabs;
import mtr.RegistryObject;
import mtr.item.ItemWithCreativeTabBase;
import mtr.mappings.BlockEntityMapper;
import mtr.mappings.RegistryUtilities;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class MainFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		Main.init(new RegistriesWrapperImpl());
	}
}

