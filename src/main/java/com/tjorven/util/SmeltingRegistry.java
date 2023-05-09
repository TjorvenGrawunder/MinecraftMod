package com.tjorven.util;

import com.tjorven.Init.BlockInit;
import com.tjorven.Init.ItemInit;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRegistry {
    public static void registerSmelting(){
        GameRegistry.addSmelting(new ItemStack(Blocks.DIRT), new ItemStack(Items.DIAMOND), 12.0F);
        GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_SPECIAL), new ItemStack(ItemInit.SPECIAL_INGOT), 10.0F);
    }
}
