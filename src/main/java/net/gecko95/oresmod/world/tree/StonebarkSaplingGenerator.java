package net.gecko95.oresmod.world.tree;

import net.gecko95.oresmod.world.ModConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

public class StonebarkSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        if (random.nextInt(10) == 0) {
        return ModConfiguredFeatures.WOODED_STONEBARK_KEY;
        }
        return ModConfiguredFeatures.STONEBARK_KEY;
    }
}
