package com.tjorven.util.Handler;

import com.tjorven.entities.EntityWaterCreeper;
import com.tjorven.entities.render.RenderWaterCreeper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders(){
        RenderingRegistry.registerEntityRenderingHandler(EntityWaterCreeper.class, new IRenderFactory<EntityWaterCreeper>() {
            @Override
            public Render<? super EntityWaterCreeper> createRenderFor(RenderManager manager) {
                return new RenderWaterCreeper(manager);
            }
        });
    }
}
