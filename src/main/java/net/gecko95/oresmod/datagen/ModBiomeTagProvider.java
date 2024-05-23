package net.gecko95.oresmod.datagen;

import net.gecko95.oresmod.util.ModTags;
import net.gecko95.oresmod.world.biome.ModBiomes;
import net.minecraft.data.DataOutput;
import net.minecraft.data.server.tag.vanilla.VanillaBiomeTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.world.biome.BiomeKeys;

import java.util.concurrent.CompletableFuture;

public class ModBiomeTagProvider extends VanillaBiomeTagProvider {
    public ModBiomeTagProvider(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookupFuture) {
        super(output, registryLookupFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Biomes.HAS_FROSITE)
                .add(BiomeKeys.GROVE)
                .add(BiomeKeys.JAGGED_PEAKS)
                .add(BiomeKeys.FROZEN_PEAKS)
                .add(BiomeKeys.SNOWY_SLOPES);
        
        getOrCreateTagBuilder(ModTags.Biomes.HAS_ICY_FROSITE)
                .add(BiomeKeys.FROZEN_OCEAN)
                .add(BiomeKeys.DEEP_FROZEN_OCEAN)
                .add(BiomeKeys.ICE_SPIKES)
                .add(BiomeKeys.FROZEN_PEAKS);

        getOrCreateTagBuilder(ModTags.Biomes.IS_END_ISLANDS)
                .add(BiomeKeys.END_BARRENS)
                .add(BiomeKeys.END_HIGHLANDS)
                .add(BiomeKeys.END_MIDLANDS)
                .add(BiomeKeys.SMALL_END_ISLANDS);

        getOrCreateTagBuilder(ModTags.Biomes.FROSITE_COLD)
                .addTag(ModTags.Biomes.HAS_FROSITE)
                .addTag(ModTags.Biomes.HAS_ICY_FROSITE);

        getOrCreateTagBuilder(BiomeTags.IS_BEACH)
                .add(ModBiomes.BLACK_SAND_BEACH);

        getOrCreateTagBuilder(BiomeTags.IS_OVERWORLD)
                .add(ModBiomes.QUARRY)
                .add(ModBiomes.WHITE_DUNES)
                .add(ModBiomes.BLACK_SAND_BEACH);

        getOrCreateTagBuilder(BiomeTags.SPAWNS_WARM_VARIANT_FROGS)
                .add(ModBiomes.WHITE_DUNES);

        getOrCreateTagBuilder(BiomeTags.SNOW_GOLEM_MELTS)
                .add(ModBiomes.WHITE_DUNES);

        getOrCreateTagBuilder(BiomeTags.RUINED_PORTAL_DESERT_HAS_STRUCTURE)
                .add(ModBiomes.WHITE_DUNES);

        getOrCreateTagBuilder(BiomeTags.IS_HILL)
                .add(ModBiomes.QUARRY);
    }
}
