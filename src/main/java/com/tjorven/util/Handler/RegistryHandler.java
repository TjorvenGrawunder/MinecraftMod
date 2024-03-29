package com.tjorven.util.Handler;

import com.tjorven.Init.BiomeInit;
import com.tjorven.Init.BlockInit;
import com.tjorven.Init.EntityInit;
import com.tjorven.Init.ItemInit;
import com.tjorven.util.IHasModel;
import com.tjorven.world.gen.OreGen;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event){
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
    }
    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event){
        for(Item item : ItemInit.ITEMS){
            if(item instanceof IHasModel){
                ((IHasModel) item).registerModels();
            }
        }
        for(Block block : BlockInit.BLOCKS){
            if(block instanceof IHasModel){
                ((IHasModel) block).registerModels();
            }
        }

    }
    public static void preInitRegistries(){
        GameRegistry.registerWorldGenerator(new OreGen(), 0);
        EntityInit.registerEntities();
        RenderHandler.registerEntityRenders();
        BiomeInit.registerBiomes();
    }

}
