package com.tjorven.Items;

import net.minecraft.item.ItemStack;

public class ItemTrader extends ItemRaw{
    public ItemTrader(String name) {
        super(name);
        this.setContainerItem(this);
        this.setMaxStackSize(1);

    }

}
