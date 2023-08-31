package com.tjorven.util.Handler;

import com.tjorven.entities.EntityBlueCreeper;
import com.tjorven.entities.render.RenderBlueCreeper;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

    public static void registerEntityRenders(){
        RenderingRegistry.registerEntityRenderingHandler(EntityBlueCreeper.class, new IRenderFactory<EntityBlueCreeper>() {
            @Override
            public Render<? super EntityBlueCreeper> createRenderFor(RenderManager manager) {
                return new RenderBlueCreeper(manager);
            }
        });
    }
}
