package com.tjorven.world.biomes;

import com.tjorven.entities.EntityFireCreeper;
import com.tjorven.entities.EntityWaterCreeper;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class BiomeCreeper extends Biome {
    public BiomeCreeper() {
        super(new BiomeProperties("creeper").setBaseHeight(2).setHeightVariation(4).setWaterColor(2532).setTemperature(1.5F));

        topBlock = Blocks.END_STONE.getDefaultState();
        fillerBlock = Blocks.SLIME_BLOCK.getDefaultState();

        this.decorator.bigMushroomsPerChunk = 2;

        this.spawnableCaveCreatureList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.spawnableWaterCreatureList.clear();

        this.spawnableCreatureList.add(new SpawnListEntry(EntityFireCreeper.class, 10, 1, 6));
        this.spawnableCreatureList.add(new SpawnListEntry(EntityWaterCreeper.class, 10, 1, 6));
    }
}
