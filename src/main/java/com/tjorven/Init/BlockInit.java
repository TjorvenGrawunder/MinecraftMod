package com.tjorven.Init;

import com.tjorven.Blocks.BlockRaw;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block ORE_SPECIAL = new BlockRaw("ore_special", Material.IRON);
}
