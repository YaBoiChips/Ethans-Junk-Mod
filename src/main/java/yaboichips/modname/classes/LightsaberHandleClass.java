package yaboichips.modname.classes;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.MinecartTickableSound;
import net.minecraft.client.audio.TickableSound;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import yaboichips.modname.lists.ItemList;
import yaboichips.modname.lists.SoundList;

public class LightsaberHandleClass extends Item {



    public LightsaberHandleClass(Properties properties) {
        super(properties);
    }

    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand handIn) {
        ItemStack item = player.getHeldItem(handIn);
        {
            if(world.isRemote)
            if (player.getHeldItemMainhand().getItem() == ItemList.blue_lightsaber_handle) {
                player.inventory.removeStackFromSlot(player.inventory.getSlotFor(new ItemStack(ItemList.blue_lightsaber_handle)));
                player.inventory.addItemStackToInventory(new ItemStack(ItemList.blue_lightsaber));
                player.playSound(SoundList.OPEN, 3.0f, 1.0f);
                Minecraft.getInstance().getSoundHandler().play(new SaberBuzzEvent((PlayerEntity)player));

            }
        }
        {
            if (player.getHeldItemMainhand().getItem() == ItemList.green_lightsaber_handle) {
                player.inventory.removeStackFromSlot(player.inventory.getSlotFor(new ItemStack(ItemList.green_lightsaber_handle)));
                player.inventory.addItemStackToInventory(new ItemStack(ItemList.green_lightsaber));
                player.playSound(SoundList.OPEN, 3.0f, 1.0f);
            }
        }
        {
            if (player.getHeldItemMainhand().getItem() == ItemList.red_lightsaber_handle) {
                player.inventory.removeStackFromSlot(player.inventory.getSlotFor(new ItemStack(ItemList.red_lightsaber_handle)));
                player.inventory.addItemStackToInventory(new ItemStack(ItemList.red_lightsaber));
                player.playSound(SoundList.OPEN, 3.0f, 1.0f);
            }
        }
        {
            if (player.getHeldItemMainhand().getItem() == ItemList.purple_lightsaber_handle) {
                player.inventory.removeStackFromSlot(player.inventory.getSlotFor(new ItemStack(ItemList.purple_lightsaber_handle)));
                player.inventory.addItemStackToInventory(new ItemStack(ItemList.purple_lightsaber));
                player.playSound(SoundList.OPEN, 3.0f, 1.0f);
            }
        }
        return new ActionResult<ItemStack>(ActionResultType.SUCCESS, item);
    }
}
