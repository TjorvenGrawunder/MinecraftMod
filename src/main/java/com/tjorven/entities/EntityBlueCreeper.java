package com.tjorven.entities;

import com.tjorven.entities.base.EntityAbstractCreeper;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;


public class EntityBlueCreeper extends EntityAbstractCreeper {
    private int explosionRadius = 10;

    public EntityBlueCreeper(World worldIn) {
        super(worldIn);
        this.setExplosionRadius(explosionRadius);
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

}
