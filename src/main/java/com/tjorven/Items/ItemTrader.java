package com.tjorven.Items;

import com.tjorven.util.IHasModel;
import net.minecraft.item.ItemStack;

public class ItemTrader extends ItemRaw implements IHasModel {
    public ItemTrader(String name) {
        super(name);
        this.setContainerItem(this);
        this.setMaxStackSize(1);

    }

}
