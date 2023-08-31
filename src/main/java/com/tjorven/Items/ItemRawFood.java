package com.tjorven.Items;

import com.tjorven.Init.ItemInit;
import com.tjorven.mod.TmgMod;
import com.tjorven.util.IHasModel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemRawFood extends ItemFood implements IHasModel {
    private final PotionEffect[] effects;
    public ItemRawFood(String name, int amount, float saturation, boolean isWolfFood, PotionEffect... effects) {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(TmgMod.tmgtab);
        ItemInit.ITEMS.add(this);
        this.effects = effects;
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        for (PotionEffect effect : effects){
            if (!worldIn.isRemote && effect != null) {
                player.addPotionEffect(effect);
            }
        }
    }

    @Override
    public void registerModels() {
        TmgMod.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
