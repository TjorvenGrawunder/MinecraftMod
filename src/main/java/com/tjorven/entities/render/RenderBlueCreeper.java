package com.tjorven.entities.render;

import com.tjorven.entities.EntityBlueCreeper;
import com.tjorven.util.References;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelCreeper;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.util.ResourceLocation;


public class RenderBlueCreeper extends RenderCreeper {

    public static final ResourceLocation TEXTURE = new ResourceLocation(References.MODID + ":textures/entity/blue_creeper.png");


    public RenderBlueCreeper(RenderManager renderManagerIn) {
        super(renderManagerIn);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityCreeper entity) {
        return TEXTURE;
    }
}
