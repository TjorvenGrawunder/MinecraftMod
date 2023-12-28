package com.tjorven.Blocks;

import net.minecraft.block.material.Material;

public class BlockGenerator extends BlockRaw{
    int power;
    public BlockGenerator(String name, Material material, int power) {
        super(name, material);
        this.power = power;
    }
}
