package yaboichips.modname.client.entity.render;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import yaboichips.modname.ModName;
import yaboichips.modname.entities.PebbleEntity;

public class PebbleRender extends EntityRenderer<PebbleEntity> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ModName.MODID, "textures/items/pebble.png");

    public PebbleRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn);
    }

    @Override
    public ResourceLocation getEntityTexture(PebbleEntity entity) {
        return TEXTURE;
    }
}