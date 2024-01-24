package gb.polserull.britishrail.item;

import gb.polserull.britishrail.MyItems;
import mtr.block.IBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class advanceTicket extends Item {
    public advanceTicket(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, BlockGetter blockGetter, List<Component> tooltip, TooltipFlag tooltipFlag) {
        tooltip.add(Text.translatable("tooltip.mtr.railway_sign_length", length).setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)));
        tooltip.add(Text.translatable(isOdd ? "tooltip.mtr.railway_sign_odd" : "tooltip.mtr.railway_sign_even").setStyle(Style.EMPTY.withColor(ChatFormatting.GRAY)));
    }

    public static ItemStack addNBTData(ItemStack stack, String stationone, String stationtwo, Integer dayExpiry) {
        CompoundTag tag = stack.getOrCreateTag();
        tag.putString("stationone", stationone);
        tag.putString("stationtwo", stationtwo);
        tag.putInt("expiry", dayExpiry);
        stack.setTag(tag);
        return stack;
    }

    public void createTicket(String stationone, String stationtwo, Integer dayExpiry) {
        ItemStack ticketItemStack = new ItemStack(MyItems.ADVANCE_TICKET.get());
        advanceTicket.addNBTData(ticketItemStack, stationone, stationtwo, dayExpiry);
    }
}
