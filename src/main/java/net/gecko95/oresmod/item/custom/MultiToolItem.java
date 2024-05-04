package net.gecko95.oresmod.item.custom;

import net.gecko95.oresmod.util.ModTags;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
public class MultiToolItem extends MiningToolItem {
    public MultiToolItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(attackDamage, attackSpeed, material, ModTags.Blocks.MULTI_TOOL_MINEABLE, settings);
    }
}