package com.tjorven.Init;

import com.tjorven.Blocks.BlockRaw;
import com.tjorven.Blocks.BlockResourcePlant;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static final Block ORE_SPECIAL = new BlockRaw("ore_special", Material.IRON);
    public static final Block PLANT_IRON = new BlockResourcePlant("plant_iron", Items.IRON_NUGGET, ItemInit.SEEDS_IRON);
}
