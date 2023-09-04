package com.tjorven.Init;

import com.tjorven.world.biomes.BiomeCreeper;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BiomeInit {
    public static final Biome TNT = new BiomeCreeper();
    public static void registerBiomes(){
        initBiome(TNT, "tnt", BiomeType.WARM, Type.BEACH, Type.DEAD);
    }
    private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types){
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addBiome(biomeType, new BiomeManager.BiomeEntry(biome, 10));
        BiomeManager.addSpawnBiome(biome);
        return biome;
    }
}
