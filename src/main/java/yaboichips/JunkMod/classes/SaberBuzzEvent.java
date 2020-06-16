package yaboichips.JunkMod.classes;

import net.minecraft.client.audio.TickableSound;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundCategory;
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
        if (this.player.getHeldItemMainhand().getItem() != ItemList.blue_lightsaber) {
            this.donePlaying = true;
        }
        if (this.player.getHeldItemMainhand().getItem() != ItemList.red_lightsaber) {
            this.donePlaying = true;
        }
        if (this.player.getHeldItemMainhand().getItem() != ItemList.green_lightsaber) {
            this.donePlaying = true;
        }
        if (this.player.getHeldItemMainhand().getItem() != ItemList.purple_lightsaber) {
            this.donePlaying = true;
        }
    }
}