package com.tjorven.Items;

import com.tjorven.Init.ItemInit;
import com.tjorven.mod.TmgMod;
import com.tjorven.proxy.ClientProxy;
import com.tjorven.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTest extends Item implements IHasModel {

    public ItemTest(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MISC);
        ItemInit.ITEMS.add(this);
    }
    @Override
    public void registerModels() {
        TmgMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
