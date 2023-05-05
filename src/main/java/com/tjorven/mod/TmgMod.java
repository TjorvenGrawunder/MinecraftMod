package com.tjorven.mod;

import com.tjorven.proxy.CommonProxy;
import com.tjorven.util.References;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.sql.Ref;

@Mod(modid = References.MODID, name = References.NAME, version = References.NAME)

public class TmgMod {
    @Instance
    public static TmgMod instance;

    @SidedProxy(clientSide = References.CLIENT, serverSide = References.COMMON)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event){

    }

    @EventHandler
    public static void init(FMLInitializationEvent event){
        GameRegistry.addSmelting(new ItemStack(Blocks.DIRT), new ItemStack(Items.DIAMOND), 12.0F);
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event){

    }

}
