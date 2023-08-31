package com.tjorven.entities.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCreeper - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelCreeper extends ModelBase {
    public ModelRenderer CreeperBody;
    public ModelRenderer RearFootRight;
    public ModelRenderer FrontFootRight;
    public ModelRenderer FrontFoootLeft;
    public ModelRenderer Head;
    public ModelRenderer RearFootLeft;

    public ModelCreeper() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.FrontFoootLeft = new ModelRenderer(this, 0, 16);
        this.FrontFoootLeft.setRotationPoint(-2.0F, 18.0F, -4.0F);
        this.FrontFoootLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.RearFootLeft = new ModelRenderer(this, 0, 16);
        this.RearFootLeft.setRotationPoint(-2.0F, 18.0F, 4.0F);
        this.RearFootLeft.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.RearFootRight = new ModelRenderer(this, 0, 16);
        this.RearFootRight.setRotationPoint(2.0F, 18.0F, 4.0F);
        this.RearFootRight.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.FrontFootRight = new ModelRenderer(this, 0, 16);
        this.FrontFootRight.setRotationPoint(2.0F, 18.0F, -4.0F);
        this.FrontFootRight.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.CreeperBody = new ModelRenderer(this, 16, 16);
        this.CreeperBody.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.CreeperBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.FrontFoootLeft.render(f5);
        this.Head.render(f5);
        this.RearFootLeft.render(f5);
        this.RearFootRight.render(f5);
        this.FrontFootRight.render(f5);
        this.CreeperBody.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
