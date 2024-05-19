package net.gecko95.oresmod.world.biome.surface;

import com.google.common.collect.ImmutableList;
import net.gecko95.oresmod.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.noise.NoiseParametersKeys;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.minecraft.world.gen.surfacebuilder.VanillaSurfaceRules;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule COBBLESTONE = makeStateRule(Blocks.COBBLESTONE);
    private static final MaterialRules.MaterialRule DEEPSLATE = makeStateRule(Blocks.DEEPSLATE);
    private static final MaterialRules.MaterialRule BEDROCK = makeStateRule(Blocks.BEDROCK);
    public static MaterialRules.MaterialRule createModSurfaceRule() {
        return ModMaterialRules.makeRules(true, false, true);
    }
    public static MaterialRules.MaterialRule makeRules(boolean surface, boolean bedrockRoof, boolean bedrockFloor) {
        MaterialRules.MaterialRule quarry_floor = MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.QUARRY_BIOME),
                MaterialRules.condition(ModMaterialRules.surfaceNoiseThreshold(1.0), COBBLESTONE)));
        ImmutableList.Builder builder = ImmutableList.builder();
        if (bedrockRoof) {
            builder.add(MaterialRules.condition(MaterialRules.not(MaterialRules.verticalGradient("bedrock_roof", YOffset.belowTop(5), YOffset.getTop())), BEDROCK));
        }
        if (bedrockFloor) {
            builder.add(MaterialRules.condition(MaterialRules.verticalGradient("bedrock_floor", YOffset.getBottom(), YOffset.aboveBottom(5)), BEDROCK));
        }
        MaterialRules.MaterialRule deepslate = MaterialRules.condition(MaterialRules.surface(), quarry_floor);
        builder.add(surface ? deepslate : quarry_floor);
        builder.add(MaterialRules.condition(MaterialRules.verticalGradient("deepslate", YOffset.fixed(0), YOffset.fixed(8)), DEEPSLATE));
        return MaterialRules.sequence((MaterialRules.MaterialRule[])builder.build().toArray(MaterialRules.MaterialRule[]::new));

    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
    private static MaterialRules.MaterialCondition surfaceNoiseThreshold(double min) {
        return MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, min / 8.25, Double.MAX_VALUE);
    }
}
