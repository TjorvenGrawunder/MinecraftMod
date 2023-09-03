package com.tjorven.Init;

import com.tjorven.Items.ItemRaw;
import com.tjorven.Items.ItemRawFood;
import com.tjorven.Items.ItemSeeds;
import com.tjorven.Items.ItemTrader;
import com.tjorven.util.types.PlantTypeEnum;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item SPECIAL_INGOT = new ItemRaw("ingot_special");
    public static final Item TRADERS_BOWL = new ItemTrader("item_trader");
    public static final Item GREEN_APPLE = new ItemRawFood("food_gapple", 16, 8, false, new PotionEffect(MobEffects.HEALTH_BOOST, 1600, 4),new PotionEffect(MobEffects.STRENGTH, 1600, 4),new PotionEffect(MobEffects.REGENERATION, 1600, 4));
    public static final Item SEEDS_IRON = new ItemSeeds("seeds_iron", PlantTypeEnum.IRON);
}
