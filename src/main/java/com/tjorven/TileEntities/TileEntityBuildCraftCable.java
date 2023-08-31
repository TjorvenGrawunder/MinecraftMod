package com.tjorven.TileEntities;
import buildcraft.api.power.IEngine;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;


public class TileEntityBuildCraftCable extends TileEntity implements IEngine {
    private float energyStored;
    private static final float MAX_ENERGY_STORED = 10000;



    @Override
    public boolean canReceiveFromEngine(EnumFacing enumFacing) {
        return false;
    }

    @Override
    public boolean receivePower(long l, boolean b) {
        return false;
    }
}
