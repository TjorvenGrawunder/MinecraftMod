package com.tjorven.entities;

import com.tjorven.entities.base.EntityAbstractCreeper;
import com.tjorven.util.types.CreeperTypeEnum;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityFireCreeper extends EntityAbstractCreeper {
    private int explosionRadius = 10;

    public EntityFireCreeper(World worldIn) {
        super(worldIn, CreeperTypeEnum.FIRE);
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
