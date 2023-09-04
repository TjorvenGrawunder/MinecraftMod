package com.tjorven.entities.render;

import com.tjorven.util.References;
import net.minecraft.client.renderer.entity.RenderCreeper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.util.ResourceLocation;

public class RenderFireCreeper extends RenderCreeper {
    public static final ResourceLocation TEXTURE = new ResourceLocation(References.MODID + ":textures/entity/fire_creeper.png");


    public RenderFireCreeper(RenderManager renderManagerIn) {
        super(renderManagerIn);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityCreeper entity) {
        return TEXTURE;
    }
}
