package net.gecko95.oresmod.item.custom;


import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;


public class MandibleAxeItem
        extends MandibleItem
        implements Vanishable {
    public MandibleAxeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.disablesShield();
        target.damageShield(168);
        attacker.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH,200,0));
        return true;
    }
}
