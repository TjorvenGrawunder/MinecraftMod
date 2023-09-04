package com.tjorven.mod;

import com.tjorven.proxy.CommonProxy;
import com.tjorven.tabs.TMGTab;
import com.tjorven.util.Handler.RegistryHandler;
import com.tjorven.util.References;
import com.tjorven.util.SmeltingRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = References.MODID, name = References.NAME, version = References.NAME)

public class TmgMod {
    @Instance
    public static TmgMod instance;

    public static final CreativeTabs tmgtab = new TMGTab("TMG");

    @SidedProxy(clientSide = References.CLIENT, serverSide = References.COMMON)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event){
        RegistryHandler.preInitRegistries();
    }

    @EventHandler
    public static void init(FMLInitializationEvent event){

        SmeltingRegistry.registerSmelting();

    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event){

    }

}
