package com.tjorven.Init;

import com.tjorven.Items.ItemTest;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item TEST_ITEM = new ItemTest("item_test");
}
