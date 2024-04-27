package net.gecko95.oresmod.item.custom;

import net.gecko95.oresmod.util.ModTags;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;

public class MandibleItem extends MiningToolItem {
    public MandibleItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.MANDIBLE_MINEABLE, settings);
    }
}
