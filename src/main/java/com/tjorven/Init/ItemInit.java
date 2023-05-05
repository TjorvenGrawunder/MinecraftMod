package com.tjorven.Init;

import com.tjorven.Items.ItemRaw;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item SPECIAL_INGOT = new ItemRaw("ingot_special");
    public static final Item TRADERS_BOWL = new ItemRaw("item_trader");
    public static final Item GREEN_APPLE = new ItemRaw("food_gapple");
}
