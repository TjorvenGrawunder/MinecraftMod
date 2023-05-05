package com.tjorven.util;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRegistry {
    public static void registerSmelting(){
        GameRegistry.addSmelting(new ItemStack(Blocks.DIRT), new ItemStack(Items.DIAMOND), 12.0F);
    }
}
