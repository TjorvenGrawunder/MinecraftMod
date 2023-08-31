package com.tjorven.Init;

import com.tjorven.entities.EntityBlueCreeper;
import com.tjorven.mod.TmgMod;
import com.tjorven.util.References;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;



public class EntityInit {
    public static void registerEntities(){
        registerEntity("blue_creeper", EntityBlueCreeper.class, References.ENTITY_BLUE_CREEPER, 50, 255, 0);
    }
    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2){
        EntityRegistry.registerModEntity(new ResourceLocation(References.MODID + ":" + name), entity, name, id, TmgMod.instance, range, 1, true, color1, color2);
    }
}
