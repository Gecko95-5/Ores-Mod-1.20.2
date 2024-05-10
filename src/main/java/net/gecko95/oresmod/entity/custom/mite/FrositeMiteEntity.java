package net.gecko95.oresmod.entity.custom.mite;

import net.gecko95.oresmod.entity.custom.projectiles.IceProjectileEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.RangedAttackMob;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class FrositeMiteEntity extends MiteEntity implements RangedAttackMob {
    public FrositeMiteEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }
    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new SwimGoal(this));
        this.goalSelector.add(2, new FleeEntityGoal<>(this, BlazeEntity.class, 6.0f, 1.0, 1.2));
        this.goalSelector.add(3, new ProjectileAttackGoal(this, 1.0, 40, 20.0f));
        this.goalSelector.add(4, new WanderAroundGoal(this,1.0));
        this.goalSelector.add(5, new LookAroundGoal(this));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
        this.targetSelector.add(2, new RevengeGoal(this).setGroupRevenge());
    }

    @Override
    public void tickMovement() {
        super.tickMovement();
        if (!this.getWorld().isClient) {
            if (this.getWorld().getBiome(this.getBlockPos()).isIn(BiomeTags.SNOW_GOLEM_MELTS)) {
                this.damage(this.getDamageSources().onFire(), 1.0f);
            }
            if (this.getWorld().getBiome(this.getBlockPos()).isIn(BiomeTags.SPAWNS_COLD_VARIANT_FROGS)) {
                this.heal(1.0f);
            }
        }
    }

    @Override
    public void shootAt(LivingEntity target, float pullProgress) {
        IceProjectileEntity iceProjectileEntity = new IceProjectileEntity(this, this.getWorld());
        double d = target.getEyeY() - (double)1.1f;
        double e = target.getX() - this.getX();
        double f = d - iceProjectileEntity.getY();
        double g = target.getZ() - this.getZ();
        double h = Math.sqrt(e * e + g * g) * (double)0.2f;
        iceProjectileEntity.setVelocity(e, f + h, g, 1.6f, 12.0f);
        this.playSound(SoundEvents.ENTITY_SNOW_GOLEM_SHOOT, 1.0f, 0.4f / (this.getRandom().nextFloat() * 0.4f + 0.8f));
        this.getWorld().spawnEntity(iceProjectileEntity);
    }
}
