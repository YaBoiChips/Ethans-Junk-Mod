package yaboichips.JunkMod.client.entity.render;

        import net.minecraft.client.renderer.entity.EntityRendererManager;
        import net.minecraft.client.renderer.entity.MobRenderer;
        import net.minecraft.util.ResourceLocation;
        import yaboichips.JunkMod.JunkMod;
        import yaboichips.JunkMod.client.entity.model.MooseModel;
        import yaboichips.JunkMod.entities.MooseEntity;

public class MooseRender extends MobRenderer<MooseEntity, MooseModel<MooseEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(JunkMod.JUNKMOD, "textures/entity/moose.png");

    public MooseRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MooseModel<MooseEntity>(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(MooseEntity entity) {
        return TEXTURE;
    }
}
