package yaboichips.JunkMod.classes;

import net.minecraft.client.audio.TickableSound;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.SoundCategory;
import yaboichips.JunkMod.JunkMod;
import yaboichips.JunkMod.lists.ItemList;
import yaboichips.JunkMod.lists.SoundList;

public class SaberBuzzEvent extends TickableSound {
    private final PlayerEntity player;

    public SaberBuzzEvent(PlayerEntity playerIn) {
        super(SoundList.BUZZ, SoundCategory.NEUTRAL);
        this.player = playerIn;
        this.repeat = true;
        this.repeatDelay = 0;
        this.volume = 0.1F;
        this.x = (float) playerIn.getPosX();
        this.y = (float) playerIn.getPosY();
        this.z = (float) playerIn.getPosZ();
    }

    public boolean canBeSilent() {
        return true;
    }

    public void tick() {
        Item heldItem = this.player.getHeldItemMainhand().getItem();
        if (heldItem != ItemList.blue_lightsaber && heldItem != ItemList.red_lightsaber && heldItem != ItemList.green_lightsaber && heldItem != ItemList.purple_lightsaber) {
            this.donePlaying = true;
        }
    }
}