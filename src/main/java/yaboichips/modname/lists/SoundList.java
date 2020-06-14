package yaboichips.modname.lists;


import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import yaboichips.modname.ModName;

public class SoundList {
    public static final SoundEvent AMBIENT = new SoundEvent(new ResourceLocation(ModName.MODID, "mooseentitiy.ambient"));
    public static final SoundEvent DEATH = new SoundEvent(new ResourceLocation(ModName.MODID, "mooseentitiy.death"));
    public static final SoundEvent HURT = new SoundEvent(new ResourceLocation(ModName.MODID, "mooseentitiy.hurt"));
    public static final SoundEvent BUZZ = new SoundEvent(new ResourceLocation(ModName.MODID, "lightsaber.buzz"));
    public static final SoundEvent CLOSE = new SoundEvent(new ResourceLocation(ModName.MODID, "lightsaber.close"));
    public static final SoundEvent OPEN = new SoundEvent(new ResourceLocation(ModName.MODID, "lightsaber.open"));
}
