package gb.polserull.britishrail;

import gb.polserull.britishrail.item.advanceTicket;
import mtr.CreativeModeTabs;
import mtr.RegistryObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static gb.polserull.britishrail.Main.MOD_ID;

public interface MyItems {
    RegistryObject<Item> ADVANCE_TICKET = new RegistryObject<>(() -> new advanceTicket(new Item.Properties()));
    CreativeModeTabs.Wrapper RAIL_SIGNALS = new CreativeModeTabs.Wrapper(new ResourceLocation(MOD_ID, "rail_signals"), () -> new ItemStack(MyBlocks.CROSSING_SIGNAL.get()));
    CreativeModeTabs.Wrapper RAIL_SIGNS = new CreativeModeTabs.Wrapper(new ResourceLocation(MOD_ID, "rail_signs"), () -> new ItemStack(MyBlocks.ADVANCED_CROSSING_SIGN.get()));
}

