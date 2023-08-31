package com.tjorven.Blocks;

import com.tjorven.Init.BlockInit;
import com.tjorven.Init.ItemInit;
import com.tjorven.mod.TmgMod;
import com.tjorven.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockRaw extends Block implements IHasModel {

    public BlockRaw(String name, Material material){
        super(material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(TmgMod.tmgtab);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        TmgMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
