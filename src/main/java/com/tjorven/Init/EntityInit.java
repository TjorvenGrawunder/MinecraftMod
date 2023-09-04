package com.tjorven.Init;

import com.tjorven.entities.EntityFireCreeper;
import com.tjorven.entities.EntityWaterCreeper;
import com.tjorven.mod.TmgMod;
import com.tjorven.util.References;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;



public class EntityInit {
    public static void registerEntities(){
        registerEntity("water_creeper", EntityWaterCreeper.class, References.ENTITY_WATER_CREEPER, 50, 255, 0);
        registerEntity("fire_creeper", EntityFireCreeper.class, References.ENTITY_FIRE_CREEPER, 50, 5046272, 0);
    }
    private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2){
        EntityRegistry.registerModEntity(new ResourceLocation(References.MODID + ":" + name), entity, name, id, TmgMod.instance, range, 1, true, color1, color2);
    }
}
