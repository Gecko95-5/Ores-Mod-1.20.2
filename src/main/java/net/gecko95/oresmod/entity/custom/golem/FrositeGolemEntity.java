package net.gecko95.oresmod.entity.custom.golem;

import net.gecko95.oresmod.effect.ModEffects;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class FrositeGolemEntity extends HostileEntity {
    public final AnimationState idleAnimtionState = new AnimationState();
    private int idleAnimtionTimeout = 0;
    public FrositeGolemEntity(EntityType<? extends HostileEntity> entityType, World world) {
        super(entityType, world);
    }

    private void setupAnimationStates(){
        if (this.idleAnimtionTimeout <= 0) {
            this.idleAnimtionTimeout = this.random.nextInt(40) + 80;
            this.idleAnimtionState.start(this.age);
        } else {
            --this.idleAnimtionTimeout;
        }
    }
    @Override
    protected void updateLimbs(float posDelta) {
        float f = this.getPose() == EntityPose.STANDING ? Math.min(posDelta * 6.0f, 1.0f) : 0.0f;
        this.limbAnimator.updateLimbs(f, 0.2f);
    }

    @Override
    public void tick() {
        super.tick();
        if (this.getWorld().isClient()){
            setupAnimationStates();
        }
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new MeleeAttackGoal(this, 1.0, true));
        this.goalSelector.add(2, new WanderAroundGoal(this,1.0));
        this.goalSelector.add(4, new LookAroundGoal(this));
        this.targetSelector.add(1, new RevengeGoal(this).setGroupRevenge());
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, BlazeEntity.class, true));
        this.targetSelector.add(3, new ActiveTargetGoal<>(this, PlayerEntity.class, true));
    }
    public static DefaultAttributeContainer.Builder createFrositeGolemAttributes(){
        return HostileEntity.createHostileAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH,50.0)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE,5.0)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 0.5)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2);
    }
    @Override
    protected int getNextAirUnderwater(int air) {
        return air;
    }

    @Override
    protected void pushAway(Entity entity) {
        if (entity instanceof Monster && !(entity instanceof CreeperEntity) && this.getRandom().nextInt(20) == 0) {
            this.setTarget((LivingEntity)entity);
        }
        super.pushAway(entity);
    }
    @Override
    public boolean tryAttack(Entity target) {
        if (super.tryAttack(target)) {
            if (target instanceof LivingEntity) {
                int i = 1;
                if (this.getWorld().getDifficulty() == Difficulty.NORMAL) {
                    i = 2;
                } else if (this.getWorld().getDifficulty() == Difficulty.HARD) {
                    i = 4;
                }
                ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, i * 100, 0), this);
            }
            return true;
        }
        return false;
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
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_IRON_GOLEM_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_IRON_GOLEM_DEATH;
    }
    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.ENTITY_IRON_GOLEM_STEP, 1.0f, 1.0f);
    }
}
