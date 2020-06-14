package yaboichips.modname.client.entity.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import yaboichips.modname.entities.MooseEntity;



@OnlyIn(Dist.CLIENT)
public class MooseModel<T extends MooseEntity> extends EntityModel<T> {
    private final ModelRenderer Body;
    private final ModelRenderer Legs;
    private final ModelRenderer Front;
    private final ModelRenderer Back;
    private final ModelRenderer Head;

    public MooseModel() {
        textureWidth = 32;
        textureHeight = 32;

        Body = new ModelRenderer(this);
        Body.setRotationPoint(0.0F, 24.0F, 0.0F);
        Body.setTextureOffset(2, 0).addBox(-5.0F, -7.0F, -3.0F, 9.0F, 3.0F, 6.0F, 0.0F, false);
        Body.setTextureOffset(10, 0).addBox(4.0F, -6.0F, -1.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

        Legs = new ModelRenderer(this);
        Legs.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.addChild(Legs);


        Front = new ModelRenderer(this);
        Front.setRotationPoint(0.0F, 0.0F, 0.0F);
        Legs.addChild(Front);
        Front.setTextureOffset(8, 10).addBox(-4.0F, -4.0F, 1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        Front.setTextureOffset(8, 10).addBox(-4.0F, -4.0F, -3.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        Back = new ModelRenderer(this);
        Back.setRotationPoint(0.0F, 0.0F, 0.0F);
        Legs.addChild(Back);
        Back.setTextureOffset(8, 10).addBox(2.0F, -4.0F, 1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        Back.setTextureOffset(8, 10).addBox(2.0F, -4.0F, -3.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        Head = new ModelRenderer(this);
        Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        Body.addChild(Head);
        Head.setTextureOffset(2, 0).addBox(-8.0F, -6.0F, -2.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
        Head.setTextureOffset(0, 12).addBox(-10.0F, -5.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        Head.setTextureOffset(0, 29).addBox(-6.0F, -9.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 30).addBox(-6.0F, -11.0F, 2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 30).addBox(-7.0F, -8.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 29).addBox(-7.0F, -11.0F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 29).addBox(-8.0F, -11.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 30).addBox(-6.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 30).addBox(-5.0F, -9.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 29).addBox(-6.0F, -10.0F, 5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 28).addBox(-7.0F, -12.0F, 5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 29).addBox(-7.0F, -10.0F, 4.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 28).addBox(-5.0F, -10.0F, 3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 25).addBox(-6.0F, -12.0F, 3.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 29).addBox(-7.0F, -7.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 30).addBox(-9.0F, -11.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 29).addBox(-7.0F, -10.0F, -6.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 28).addBox(-6.0F, -12.0F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 30).addBox(-6.0F, -8.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 30).addBox(-8.0F, -7.0F, -3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 30).addBox(-5.0F, -9.0F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 29).addBox(-5.0F, -11.0F, -5.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 28).addBox(-8.0F, -12.0F, -5.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 28).addBox(-8.0F, -11.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 29).addBox(-7.0F, -10.0F, -5.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 29).addBox(-6.0F, -10.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 28).addBox(-7.0F, -9.0F, -4.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 29).addBox(-7.0F, -7.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        Head.setTextureOffset(0, 30).addBox(-8.0F, -11.0F, 3.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }


    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        Body.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}