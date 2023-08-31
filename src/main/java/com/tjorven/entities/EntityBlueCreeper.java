package com.tjorven.entities;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;


public class EntityBlueCreeper extends EntityCreeper {
    private int explosionRadius = 5;
    boolean ignited = false;
    public EntityBlueCreeper(World worldIn) {
        super(worldIn);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return super.getAmbientSound();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return super.getHurtSound(damageSourceIn);
    }

    @Override
    protected SoundEvent getDeathSound() {
        return super.getDeathSound();
    }

    @Override
    public void onUpdate() {
        if(super.hasIgnited() && !ignited){
            ignited = true;
            super.onUpdate();
            boolean flag = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.world, this);
            float f = this.getPowered() ? 2.0F : 1.0F;
            this.world.createExplosion(this, this.posX, this.posY, this.posZ, (float)this.explosionRadius * f, flag);
        }else {
            super.onUpdate();
        }

    }
}
