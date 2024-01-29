package gb.polserull.britishrail;

import mtr.CreativeModeTabs;
import mtr.RegistryObject;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import static gb.polserull.britishrail.Main.MOD_ID;

public interface MyItems {
    //RegistryObject<Item> ADVANCE_TICKET = new RegistryObject<>(() -> new advanceTicket(new Item.Properties()));
    CreativeModeTabs.Wrapper EUROPEAN_RAILWAYS = new CreativeModeTabs.Wrapper(new ResourceLocation(MOD_ID, "europe_railways_menu"), () -> new ItemStack(MyBlocks.ADVANCED_CROSSING_SIGN.get()));
    CreativeModeTabs.Wrapper UK_RAILWAYS = new CreativeModeTabs.Wrapper(new ResourceLocation(MOD_ID, "uk_railways_menu"), () -> new ItemStack(MyBlocks.ADVANCED_CROSSING_SIGN.get()));
    CreativeModeTabs.Wrapper DUTCH_RAILWAYS = new CreativeModeTabs.Wrapper(new ResourceLocation(MOD_ID, "dutch_railways_menu"), () -> new ItemStack(MyBlocks.ADVANCED_CROSSING_SIGN.get()));
}

