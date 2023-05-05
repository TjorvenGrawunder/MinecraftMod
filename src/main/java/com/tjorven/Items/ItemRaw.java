package com.tjorven.Items;

import com.tjorven.Init.ItemInit;
import com.tjorven.mod.TmgMod;
import com.tjorven.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRaw extends Item implements IHasModel {

    public ItemRaw(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(TmgMod.tmgtab);
        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        TmgMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
