package com.tjorven.tabs;

import com.tjorven.Init.ItemInit;
import com.tjorven.util.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TMGTab extends CreativeTabs {

    public TMGTab(String label){
        super(label);
    }
    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.SPECIAL_INGOT);
    }
}
