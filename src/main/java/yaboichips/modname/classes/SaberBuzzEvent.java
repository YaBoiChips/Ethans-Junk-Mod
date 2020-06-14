package yaboichips.modname.classes;

import net.minecraft.client.audio.TickableSound;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.minecart.AbstractMinecartEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.MathHelper;
import yaboichips.modname.lists.ItemList;
import yaboichips.modname.lists.SoundList;

public class SaberBuzzEvent extends TickableSound {
    private final PlayerEntity player;

    public SaberBuzzEvent(PlayerEntity playerIn) {
        super(SoundList.BUZZ, SoundCategory.NEUTRAL);
        this.player = playerIn;
        this.repeat = true;
        this.repeatDelay = 0;
        this.volume = 0.3F;
        this.x = (float)playerIn.getPosX();
        this.y = (float)playerIn.getPosY();
        this.z = (float)playerIn.getPosZ();
    }

    public boolean canBeSilent() {
        return true;
    }

    public void tick() {
        if (this.player.getHeldItemMainhand().getItem() == ItemList.blue_lightsaber_handle) {
            this.donePlaying = true;
            }

        }
    }

