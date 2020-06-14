package yaboichips.modname.client.entity.render;

        import net.minecraft.client.renderer.entity.EntityRendererManager;
        import net.minecraft.client.renderer.entity.MobRenderer;
        import net.minecraft.util.ResourceLocation;
        import yaboichips.modname.ModName;
        import yaboichips.modname.client.entity.model.MooseModel;
        import yaboichips.modname.entities.MooseEntity;

public class MooseRender extends MobRenderer<MooseEntity, MooseModel<MooseEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(ModName.MODID, "textures/entity/moose.png");

    public MooseRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MooseModel<MooseEntity>(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(MooseEntity entity) {
        return TEXTURE;
    }
}
