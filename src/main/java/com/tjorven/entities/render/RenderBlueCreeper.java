package com.tjorven.entities.render;

import com.tjorven.entities.EntityBlueCreeper;
import com.tjorven.util.References;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;


public class RenderBlueCreeper extends RenderLiving<EntityBlueCreeper> {

    public static final ResourceLocation TEXTURES = new ResourceLocation(References.MODID + ":textures/entity/blue_creeper.png");

    public RenderBlueCreeper(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelCreeper(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityBlueCreeper entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityBlueCreeper entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
