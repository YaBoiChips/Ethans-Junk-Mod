package yaboichips.JunkMod.classes;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import yaboichips.JunkMod.lists.ItemList;
import yaboichips.JunkMod.lists.SoundList;

public class LightsaberHandleClass extends Item {



    public LightsaberHandleClass(Properties properties) {
        super(properties);
    }

    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand handIn) {
        ItemStack item = player.getHeldItem(handIn);
        {
            if (player.getHeldItemMainhand().getItem() == ItemList.blue_lightsaber_hilt) {
                player.inventory.removeStackFromSlot(player.inventory.getSlotFor(item));
                player.inventory.addItemStackToInventory(new ItemStack(ItemList.blue_lightsaber));
                if(world.isRemote)
                player.playSound(SoundList.OPEN, 3.0f, 1.0f);
                Minecraft.getInstance().getSoundHandler().play(new SaberBuzzEvent(player));

            }
        }
        {
            if (player.getHeldItemMainhand().getItem() == ItemList.green_lightsaber_hilt) {
                player.inventory.removeStackFromSlot(player.inventory.getSlotFor(item));
                player.inventory.addItemStackToInventory(new ItemStack(ItemList.green_lightsaber));
                if(world.isRemote)
                player.playSound(SoundList.OPEN, 3.0f, 1.0f);
                Minecraft.getInstance().getSoundHandler().play(new SaberBuzzEvent(player));
            }
        }
        {
            if (player.getHeldItemMainhand().getItem() == ItemList.red_lightsaber_hilt) {
                player.inventory.removeStackFromSlot(player.inventory.getSlotFor(item));
                player.inventory.addItemStackToInventory(new ItemStack(ItemList.red_lightsaber));
                if(world.isRemote)
                player.playSound(SoundList.OPEN, 3.0f, 1.0f);
                Minecraft.getInstance().getSoundHandler().play(new SaberBuzzEvent(player));
            }
        }
        {
            if (player.getHeldItemMainhand().getItem() == ItemList.purple_lightsaber_hilt) {
                player.inventory.removeStackFromSlot(player.inventory.getSlotFor(item));
                player.inventory.addItemStackToInventory(new ItemStack(ItemList.purple_lightsaber));
                if(world.isRemote)
                player.playSound(SoundList.OPEN, 3.0f, 1.0f);
                Minecraft.getInstance().getSoundHandler().play(new SaberBuzzEvent(player));
            }
        }
        return new ActionResult<>(ActionResultType.SUCCESS, item);
    }
}
