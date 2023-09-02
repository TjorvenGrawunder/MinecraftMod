package com.tjorven.util.Handler;

import com.tjorven.entities.EntityBlueCreeper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class EventHandler {
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onLivingDrops(LivingDropsEvent event) {
        if (event.getEntity() instanceof EntityBlueCreeper) {
            event.getDrops().clear();
            EntityItem diamondItem = new EntityItem(event.getEntity().world, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, new ItemStack(Items.DIAMOND, 5));
            event.getDrops().add(diamondItem);
            // Hier kannst du den Drop für deine Entity anpassen
            // Beispiel: event.getDrops().clear(); // Entfernt alle Standard-Drops
            // Beispiel: event.getDrops().add(new ItemStack(Items.DIAMOND, 2)); // Fügt 2 Diamanten hinzu
        }
    }
}
