package net.gecko95.oresmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.util.ModTags;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ModTags.Blocks.DRILL_MINEABLE)
                .forceAddTag(BlockTags.PICKAXE_MINEABLE)
                .forceAddTag(BlockTags.SHOVEL_MINEABLE);

        getOrCreateTagBuilder(ModTags.Blocks.CHAINSAW_MINEABLE)
                .forceAddTag(BlockTags.AXE_MINEABLE)
                .forceAddTag(BlockTags.HOE_MINEABLE);

        getOrCreateTagBuilder(ModTags.Blocks.MULTI_TOOL_MINEABLE)
                .forceAddTag(BlockTags.PICKAXE_MINEABLE)
                .forceAddTag(BlockTags.SHOVEL_MINEABLE)
                .forceAddTag(BlockTags.AXE_MINEABLE)
                .forceAddTag(BlockTags.HOE_MINEABLE);

        getOrCreateTagBuilder(ModTags.Blocks.MANDIBLE_MINEABLE)
                .forceAddTag(BlockTags.SHOVEL_MINEABLE)
                .add(Blocks.COBBLESTONE)
                .add(Blocks.COBBLED_DEEPSLATE)
                .add(Blocks.BLACKSTONE)
                .add(Blocks.BASALT)
                .add(Blocks.NETHERRACK)
                .add(Blocks.COBBLED_DEEPSLATE)
                .add(ModBlocks.COBBLESTONE_COAL_ORE)
                .add(ModBlocks.COBBLESTONE_IRON_ORE)
                .add(ModBlocks.COBBLESTONE_COPPER_ORE)
                .add(ModBlocks.COBBLESTONE_LAPIS_ORE)
                .add(ModBlocks.COBBLESTONE_GOLD_ORE)
                .add(ModBlocks.COBBLESTONE_REDSTONE_ORE)
                .add(ModBlocks.COBBLESTONE_DIAMOND_ORE)
                .add(ModBlocks.COBBLESTONE_EMERALD_ORE)
                .add(ModBlocks.COBBLESTONE_ALUMINUM_ORE)
                .add(ModBlocks.COBBLESTONE_NICKEL_ORE)
                .add(ModBlocks.COBBLESTONE_TITANIUM_ORE)
                .add(ModBlocks.COBBLESTONE_QUARTZ_ORE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SALT_ORE)
                .add(ModBlocks.FROSITE_ORE)
                .add(ModBlocks.ICE_FROSITE_ORE)
                .add(ModBlocks.ALUMINUM_BLOCK)
                .add(ModBlocks.RAW_ALUMINUM_BLOCK)
                .add(ModBlocks.ALUMINUM_ORE)
                .add(ModBlocks.DEEPSLATE_ALUMINUM_ORE)
                .add(ModBlocks.ALUMINUM_DOOR)
                .add(ModBlocks.ALUMINUM_TRAPDOOR)
                .add(ModBlocks.ALUMINUM_BARS)
                .add(ModBlocks.ALUMINUM_PRESSURE_PLATE)
                .add(ModBlocks.NICKEL_BLOCK)
                .add(ModBlocks.RAW_NICKEL_BLOCK)
                .add(ModBlocks.NICKEL_ORE)
                .add(ModBlocks.DEEPSLATE_NICKEL_ORE)
                .add(ModBlocks.STEEL_BLOCK)
                .add(ModBlocks.RAW_STEEL_BLOCK)
                .add(ModBlocks.SMOOTH_STEEL_BLOCK)
                .add(ModBlocks.CUT_STEEL)
                .add(ModBlocks.SMOOTH_STEEL_SLAB)
                .add(ModBlocks.CUT_STEEL_STAIRS)
                .add(ModBlocks.CUT_STEEL_SLAB)
                .add(ModBlocks.STEEL_DOOR)
                .add(ModBlocks.STEEL_TRAPDOOR)
                .add(ModBlocks.STEEL_BARS)
                .add(ModBlocks.STEEL_PRESSURE_PLATE)
                .add(ModBlocks.NICKEL_PRESSURE_PLATE)
                .add(ModBlocks.STEEL_LAMP)
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ModBlocks.TITANIUM_BLOCK)
                .add(ModBlocks.RAW_TITANIUM_BLOCK)
                .add(ModBlocks.NETHER_TUNGSTEN_ORE)
                .add(ModBlocks.TUNGSTEN_BLOCK)
                .add(ModBlocks.LAVA_TANK)
                .add(ModBlocks.WATER_TANK)
                .add(ModBlocks.AWKWARD_WATER_TANK)
                .forceAddTag(ModTags.Blocks.POTION_TANKS)
                .add(ModBlocks.MILK_TANK)
                .add(ModBlocks.TITANIUM_ALLOY_BLOCK)
                .add(ModBlocks.NETHER_COBALT_ORE)
                .add(ModBlocks.COBALT_BLOCK)
                .add(ModBlocks.WHITE_SANDSTONE)
                .add(ModBlocks.WHITE_SANDSTONE_STAIRS)
                .add(ModBlocks.WHITE_SANDSTONE_SLAB)
                .add(ModBlocks.WHITE_SANDSTONE_WALL)
                .add(ModBlocks.CUT_WHITE_SANDSTONE)
                .add(ModBlocks.CUT_WHITE_SANDSTONE_SLAB)
                .add(ModBlocks.SMOOTH_WHITE_SANDSTONE)
                .add(ModBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS)
                .add(ModBlocks.SMOOTH_WHITE_SANDSTONE_SLAB)
                .add(ModBlocks.CHISELED_WHITE_SANDSTONE)
                .add(ModBlocks.BLACK_SANDSTONE)
                .add(ModBlocks.BLACK_SANDSTONE_STAIRS)
                .add(ModBlocks.BLACK_SANDSTONE_SLAB)
                .add(ModBlocks.BLACK_SANDSTONE_WALL)
                .add(ModBlocks.CUT_BLACK_SANDSTONE)
                .add(ModBlocks.CUT_BLACK_SANDSTONE_SLAB)
                .add(ModBlocks.SMOOTH_BLACK_SANDSTONE)
                .add(ModBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS)
                .add(ModBlocks.SMOOTH_BLACK_SANDSTONE_SLAB)
                .add(ModBlocks.CHISELED_BLACK_SANDSTONE)
                .add(ModBlocks.TERRACOTTA_GOLD_ORE)
                .add(ModBlocks.DRIPSTONE_COPPER_ORE)
                .add(ModBlocks.TUFF_IRON_ORE)
                .add(ModBlocks.FAKE_BEDROCK)
                .add(ModBlocks.CRACKED_BEDROCK)
                .add(ModBlocks.POLISHED_BEDROCK)
                .add(ModBlocks.POLISHED_BEDROCK_STAIRS)
                .add(ModBlocks.POLISHED_BEDROCK_SLAB)
                .add(ModBlocks.POLISHED_BEDROCK_WALL)
                .add(ModBlocks.POLISHED_BEDROCK_BRICKS)
                .add(ModBlocks.POLISHED_BEDROCK_BRICKS_STAIRS)
                .add(ModBlocks.POLISHED_BEDROCK_BRICKS_SLAB)
                .add(ModBlocks.POLISHED_BEDROCK_BRICKS_WALL)
                .add(ModBlocks.CHISELED_POLISHED_BEDROCK)
                .add(ModBlocks.IRON_SPIKES)
                .add(ModBlocks.ALUMINUM_SPIKES)
                .add(ModBlocks.STEEL_SPIKES)
                .add(ModBlocks.SANDITE_ORE)
                .add(ModBlocks.SANDSTONE_SANDITE_ORE)
                .add(ModBlocks.RED_SANDSTONE_SANDITE_ORE)
                .add(ModBlocks.COBBLESTONE_COAL_ORE)
                .add(ModBlocks.COBBLESTONE_IRON_ORE)
                .add(ModBlocks.COBBLESTONE_COPPER_ORE)
                .add(ModBlocks.COBBLESTONE_LAPIS_ORE)
                .add(ModBlocks.COBBLESTONE_GOLD_ORE)
                .add(ModBlocks.COBBLESTONE_REDSTONE_ORE)
                .add(ModBlocks.COBBLESTONE_DIAMOND_ORE)
                .add(ModBlocks.COBBLESTONE_EMERALD_ORE)
                .add(ModBlocks.COBBLESTONE_ALUMINUM_ORE)
                .add(ModBlocks.COBBLESTONE_NICKEL_ORE)
                .add(ModBlocks.COBBLESTONE_TITANIUM_ORE)
                .add(ModBlocks.COBBLESTONE_QUARTZ_ORE)
                .add(ModBlocks.MARBLE)
                .add(ModBlocks.MARBLE_STAIRS)
                .add(ModBlocks.MARBLE_SLAB)
                .add(ModBlocks.MARBLE_WALL)
                .add(ModBlocks.MARBLE_BRICKS)
                .add(ModBlocks.MARBLE_BRICK_STAIRS)
                .add(ModBlocks.MARBLE_BRICK_SLAB)
                .add(ModBlocks.MARBLE_BRICK_WALL)
                .add(ModBlocks.CHISELED_MARBLE)
                .add(ModBlocks.GILDED_MARBLE)
                .add(ModBlocks.GILDED_MARBLE_BRICKS)
                .add(ModBlocks.POLISHED_ANDESITE_BRICKS)
                .add(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS)
                .add(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB)
                .add(ModBlocks.POLISHED_ANDESITE_BRICK_WALL)
                .add(ModBlocks.POLISHED_DIORITE_BRICKS)
                .add(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS)
                .add(ModBlocks.POLISHED_DIORITE_BRICK_SLAB)
                .add(ModBlocks.POLISHED_DIORITE_BRICK_WALL)
                .add(ModBlocks.POLISHED_GRANITE_BRICKS)
                .add(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS)
                .add(ModBlocks.POLISHED_GRANITE_BRICK_SLAB)
                .add(ModBlocks.POLISHED_GRANITE_BRICK_WALL)
                .add(ModBlocks.SILVER_SCALES)
                .add(ModBlocks.SILVER_SCALE_CORE)
                .add(ModBlocks.SILVER_SCALE_FACE)
                .add(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK)
                .add(ModBlocks.LIGHTY_RUSTED_STEEL_SLAB)
                .add(ModBlocks.LIGHTY_RUSTED_CUT_STEEL)
                .add(ModBlocks.LIGHTY_RUSTED_CUT_STEEL_STAIRS)
                .add(ModBlocks.LIGHTY_RUSTED_CUT_STEEL_SLAB)
                .add(ModBlocks.RUSTED_STEEL_BLOCK)
                .add(ModBlocks.RUSTED_STEEL_SLAB)
                .add(ModBlocks.RUSTED_CUT_STEEL)
                .add(ModBlocks.RUSTED_CUT_STEEL_STAIRS)
                .add(ModBlocks.RUSTED_CUT_STEEL_SLAB)
                .add(ModBlocks.LIGHTY_RUSTED_STEEL_BARS)
                .add(ModBlocks.RUSTED_STEEL_BARS)
                .add(ModBlocks.LIGHTY_RUSTED_STEEL_LAMP)
                .add(ModBlocks.RUSTED_STEEL_LAMP)
                .add(ModBlocks.PLATINUM_BLOCK)
                .add(ModBlocks.PLATINUM_ORE)
                .add(ModBlocks.PLATINUM_CLUSTER_ORE)
                .add(ModBlocks.VOID_STONE)
                .add(ModBlocks.VOID_STONE_BRICKS)
                .add(ModBlocks.VOID_STONE_BRICK_STAIRS)
                .add(ModBlocks.VOID_STONE_BRICK_SLAB)
                .add(ModBlocks.VOID_STONE_BRICK_WALL)
                .add(ModBlocks.ICE_BRICKS)
                .add(ModBlocks.ICE_PILLAR)
                .add(ModBlocks.ICE_BRICK_STAIRS)
                .add(ModBlocks.ICE_BRICK_SLAB)
                .add(ModBlocks.ICE_BRICK_WALL)
                .add(ModBlocks.END_ITE_ORE)
                .forceAddTag(ModTags.Blocks.ITE_BLOCKS);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.SALT_BLOCK)
                .add(ModBlocks.STONEBARK_LEAVES)
                .add(ModBlocks.DEEPSLATE_LEAVES)
                .add(ModBlocks.LEAFITE_LEAVES)
                .add(ModBlocks.LEAFITE_LEAVES_ORE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.STONEBARK_PLANKS)
                .add(ModBlocks.STONEBARK_LOG)
                .add(ModBlocks.STONEBARK_WOOD)
                .add(ModBlocks.STRIPPED_STONEBARK_LOG)
                .add(ModBlocks.STRIPPED_STONEBARK_WOOD)
                .add(ModBlocks.STONEBARK_SLAB)
                .add(ModBlocks.STONEBARK_STAIRS)
                .add(ModBlocks.STONEBARK_FENCE)
                .add(ModBlocks.STONEBARK_FENCE_GATE)
                .add(ModBlocks.STONEBARK_BUTTON)
                .add(ModBlocks.STONEBARK_PRESSURE_PLATE)
                .add(ModBlocks.STONEBARK_DOOR)
                .add(ModBlocks.STONEBARK_TRAPDOOR)
                .add(ModBlocks.STANDING_STONEBARK_SIGN)
                .add(ModBlocks.WALL_STONEBARK_SIGN)
                .add(ModBlocks.HANGING_STONEBARK_SIGN)
                .add(ModBlocks.WALL_HANGING_STONEBARK_SIGN)
                .add(ModBlocks.DEEPSLATE_PLANKS)
                .add(ModBlocks.DEEPSLATE_LOG)
                .add(ModBlocks.DEEPSLATE_WOOD)
                .add(ModBlocks.STRIPPED_DEEPSLATE_LOG)
                .add(ModBlocks.STRIPPED_DEEPSLATE_WOOD)
                .add(ModBlocks.DEEPBARK_SLAB)
                .add(ModBlocks.DEEPBARK_STAIRS)
                .add(ModBlocks.DEEPBARK_FENCE)
                .add(ModBlocks.DEEPBARK_FENCE_GATE)
                .add(ModBlocks.DEEPBARK_BUTTON)
                .add(ModBlocks.DEEPBARK_PRESSURE_PLATE)
                .add(ModBlocks.DEEPBARK_DOOR)
                .add(ModBlocks.DEEPBARK_TRAPDOOR)
                .add(ModBlocks.STANDING_DEEPBARK_SIGN)
                .add(ModBlocks.WALL_DEEPBARK_SIGN)
                .add(ModBlocks.HANGING_DEEPBARK_SIGN)
                .add(ModBlocks.WALL_HANGING_DEEPBARK_SIGN)
                .add(ModBlocks.FLINT_SPIKES)
                .add(ModBlocks.LEAFITE_PLANKS)
                .add(ModBlocks.LEAFITE_LOG)
                .add(ModBlocks.LEAFITE_WOOD)
                .add(ModBlocks.STRIPPED_LEAFITE_LOG)
                .add(ModBlocks.STRIPPED_LEAFITE_WOOD)
                .add(ModBlocks.LEAFITE_PLANKS_SLAB)
                .add(ModBlocks.LEAFITE_PLANKS_STAIRS)
                .add(ModBlocks.LEAFITE_PLANKS_FENCE)
                .add(ModBlocks.LEAFITE_PLANKS_FENCE_GATE)
                .add(ModBlocks.LEAFITE_PLANKS_BUTTON)
                .add(ModBlocks.LEAFITE_PLANKS_PRESSURE_PLATE)
                .add(ModBlocks.LEAFITE_DOOR)
                .add(ModBlocks.LEAFITE_TRAPDOOR)
                .add(ModBlocks.STANDING_LEAFITE_SIGN)
                .add(ModBlocks.WALL_LEAFITE_SIGN)
                .add(ModBlocks.HANGING_LEAFITE_SIGN)
                .add(ModBlocks.WALL_HANGING_LEAFITE_SIGN);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.WHITE_SAND)
                .add(ModBlocks.GRAVEL_COAL_ORE)
                .add(ModBlocks.SUSPICIOUS_WHITE_SAND)
                .add(ModBlocks.BLACK_SAND);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.ALUMINUM_BLOCK)
                .add(ModBlocks.RAW_ALUMINUM_BLOCK)
                .add(ModBlocks.ALUMINUM_ORE)
                .add(ModBlocks.DEEPSLATE_ALUMINUM_ORE)
                .add(ModBlocks.ALUMINUM_DOOR)
                .add(ModBlocks.ALUMINUM_TRAPDOOR)
                .add(ModBlocks.ALUMINUM_BARS)
                .add(ModBlocks.ALUMINUM_PRESSURE_PLATE)
                .add(ModBlocks.NICKEL_BLOCK)
                .add(ModBlocks.RAW_NICKEL_BLOCK)
                .add(ModBlocks.NICKEL_PRESSURE_PLATE)
                .add(ModBlocks.NICKEL_ORE)
                .add(ModBlocks.DEEPSLATE_NICKEL_ORE)
                .add(ModBlocks.DRIPSTONE_COPPER_ORE)
                .add(ModBlocks.TUFF_IRON_ORE)
                .add(ModBlocks.IRON_SPIKES)
                .add(ModBlocks.ALUMINUM_SPIKES)
                .add(ModBlocks.COBBLESTONE_IRON_ORE)
                .add(ModBlocks.COBBLESTONE_COPPER_ORE)
                .add(ModBlocks.COBBLESTONE_LAPIS_ORE)
                .add(ModBlocks.COBBLESTONE_ALUMINUM_ORE)
                .add(ModBlocks.COBBLESTONE_NICKEL_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.FROSITE_ORE)
                .add(ModBlocks.ICE_FROSITE_ORE)
                .forceAddTag(ModTags.Blocks.ITE_BLOCKS)
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ModBlocks.TITANIUM_BLOCK)
                .add(ModBlocks.RAW_TITANIUM_BLOCK)
                .add(ModBlocks.NETHER_TUNGSTEN_ORE)
                .add(ModBlocks.TUNGSTEN_BLOCK)
                .add(ModBlocks.LAVA_TANK)
                .add(ModBlocks.WATER_TANK)
                .add(ModBlocks.AWKWARD_WATER_TANK)
                .forceAddTag(ModTags.Blocks.POTION_TANKS)
                .add(ModBlocks.MILK_TANK)
                .add(ModBlocks.NETHER_COBALT_ORE)
                .add(ModBlocks.COBALT_BLOCK)
                .add(ModBlocks.TERRACOTTA_GOLD_ORE)
                .add(ModBlocks.SANDITE_ORE)
                .add(ModBlocks.SANDSTONE_SANDITE_ORE)
                .add(ModBlocks.RED_SANDSTONE_SANDITE_ORE)
                .add(ModBlocks.COBBLESTONE_GOLD_ORE)
                .add(ModBlocks.COBBLESTONE_REDSTONE_ORE)
                .add(ModBlocks.COBBLESTONE_DIAMOND_ORE)
                .add(ModBlocks.COBBLESTONE_EMERALD_ORE)
                .add(ModBlocks.COBBLESTONE_TITANIUM_ORE)
                .add(ModBlocks.GILDED_MARBLE)
                .add(ModBlocks.GILDED_MARBLE_BRICKS)
                .add(ModBlocks.SILVER_SCALES)
                .add(ModBlocks.SILVER_SCALE_CORE)
                .add(ModBlocks.END_ITE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.STEEL_BLOCK)
                .add(ModBlocks.RAW_STEEL_BLOCK)
                .add(ModBlocks.SMOOTH_STEEL_BLOCK)
                .add(ModBlocks.CUT_STEEL)
                .add(ModBlocks.SMOOTH_STEEL_SLAB)
                .add(ModBlocks.CUT_STEEL_STAIRS)
                .add(ModBlocks.CUT_STEEL_SLAB)
                .add(ModBlocks.STEEL_DOOR)
                .add(ModBlocks.STEEL_TRAPDOOR)
                .add(ModBlocks.STEEL_BARS)
                .add(ModBlocks.STEEL_PRESSURE_PLATE)
                .add(ModBlocks.STEEL_LAMP)
                .add(ModBlocks.TITANIUM_ALLOY_BLOCK)
                .add(ModBlocks.STEEL_SPIKES)
                .add(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK)
                .add(ModBlocks.LIGHTY_RUSTED_STEEL_SLAB)
                .add(ModBlocks.LIGHTY_RUSTED_CUT_STEEL)
                .add(ModBlocks.LIGHTY_RUSTED_CUT_STEEL_STAIRS)
                .add(ModBlocks.LIGHTY_RUSTED_CUT_STEEL_SLAB)
                .add(ModBlocks.RUSTED_STEEL_BLOCK)
                .add(ModBlocks.RUSTED_STEEL_SLAB)
                .add(ModBlocks.RUSTED_CUT_STEEL)
                .add(ModBlocks.RUSTED_CUT_STEEL_STAIRS)
                .add(ModBlocks.RUSTED_CUT_STEEL_SLAB)
                .add(ModBlocks.LIGHTY_RUSTED_STEEL_DOOR)
                .add(ModBlocks.LIGHTY_RUSTED_STEEL_TRAPDOOR)
                .add(ModBlocks.RUSTED_STEEL_DOOR)
                .add(ModBlocks.RUSTED_STEEL_TRAPDOOR)
                .add(ModBlocks.LIGHTY_RUSTED_STEEL_BARS)
                .add(ModBlocks.RUSTED_STEEL_BARS)
                .add(ModBlocks.LIGHTY_RUSTED_STEEL_LAMP)
                .add(ModBlocks.RUSTED_STEEL_LAMP)
                .add(ModBlocks.PLATINUM_BLOCK)
                .add(ModBlocks.PLATINUM_ORE)
                .add(ModBlocks.PLATINUM_CLUSTER_ORE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.FAKE_BEDROCK)
                .add(ModBlocks.CRACKED_BEDROCK)
                .add(ModBlocks.POLISHED_BEDROCK)
                .add(ModBlocks.POLISHED_BEDROCK_STAIRS)
                .add(ModBlocks.POLISHED_BEDROCK_SLAB)
                .add(ModBlocks.POLISHED_BEDROCK_WALL)
                .add(ModBlocks.POLISHED_BEDROCK_BRICKS)
                .add(ModBlocks.POLISHED_BEDROCK_BRICKS_STAIRS)
                .add(ModBlocks.POLISHED_BEDROCK_BRICKS_SLAB)
                .add(ModBlocks.POLISHED_BEDROCK_BRICKS_WALL)
                .add(ModBlocks.CHISELED_POLISHED_BEDROCK);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.FROSITE_BRICK_WALL)
                .add(ModBlocks.FROSITE_TILE_WALL)
                .add(ModBlocks.WHITE_SANDSTONE_WALL)
                .add(ModBlocks.BLACK_SANDSTONE_WALL)
                .add(ModBlocks.POLISHED_BEDROCK_WALL)
                .add(ModBlocks.POLISHED_BEDROCK_BRICKS_WALL)
                .add(ModBlocks.SANDITE_BRICK_WALL)
                .add(ModBlocks.SANDITE_TILE_WALL)
                .add(ModBlocks.LEAFITE_BRICK_WALL)
                .add(ModBlocks.LEAFITE_TILE_WALL)
                .add(ModBlocks.MARBLE_WALL)
                .add(ModBlocks.MARBLE_BRICK_WALL)
                .add(ModBlocks.POLISHED_ANDESITE_BRICK_WALL)
                .add(ModBlocks.POLISHED_DIORITE_BRICK_WALL)
                .add(ModBlocks.POLISHED_GRANITE_BRICK_WALL)
                .add(ModBlocks.VOID_STONE_BRICK_WALL)
                .add(ModBlocks.END_ITE_BRICK_WALL)
                .add(ModBlocks.END_ITE_TILE_WALL)
                .add(ModBlocks.LIGHT_FROSITE_BRICK_WALL)
                .add(ModBlocks.LIGHT_FROSITE_TILE_WALL)
                .add(ModBlocks.DARKEN_FROSITE_BRICK_WALL)
                .add(ModBlocks.DARKEN_FROSITE_TILE_WALL)
                .add(ModBlocks.LIGHT_SANDITE_BRICK_WALL)
                .add(ModBlocks.LIGHT_SANDITE_TILE_WALL)
                .add(ModBlocks.DARKEN_SANDITE_BRICK_WALL)
                .add(ModBlocks.DARKEN_SANDITE_TILE_WALL)
                .add(ModBlocks.LIGHT_LEAFITE_BRICK_WALL)
                .add(ModBlocks.LIGHT_LEAFITE_TILE_WALL)
                .add(ModBlocks.DARKEN_LEAFITE_BRICK_WALL)
                .add(ModBlocks.DARKEN_LEAFITE_TILE_WALL)
                .add(ModBlocks.LIGHT_END_ITE_BRICK_WALL)
                .add(ModBlocks.LIGHT_END_ITE_TILE_WALL)
                .add(ModBlocks.DARKEN_END_ITE_BRICK_WALL)
                .add(ModBlocks.DARKEN_END_ITE_TILE_WALL)
                .add(ModBlocks.ICE_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.STONEBARK_FENCE)
                .add(ModBlocks.DEEPBARK_FENCE)
                .add(ModBlocks.LEAFITE_PLANKS_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.STONEBARK_FENCE_GATE)
                .add(ModBlocks.DEEPBARK_FENCE_GATE)
                .add(ModBlocks.LEAFITE_PLANKS_FENCE_GATE);

        getOrCreateTagBuilder(ModTags.Blocks.STONEBARK_PLACEABLE)
                .add(Blocks.STONE)
                .add(Blocks.DIORITE)
                .add(Blocks.ANDESITE)
                .add(Blocks.GRANITE)
                .add(Blocks.COBBLESTONE)
                .add(Blocks.MOSSY_COBBLESTONE)
                .add(Blocks.MOSS_BLOCK)
                .add(Blocks.DRIPSTONE_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.DEEPBARK_PLACEABLE)
                .add(Blocks.DEEPSLATE)
                .add(Blocks.COBBLED_DEEPSLATE)
                .add(Blocks.TUFF)
                .add(Blocks.SCULK)
                .add(Blocks.DRIPSTONE_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.POTION_TANKS)
                .add(ModBlocks.FIRE_RESISTANCE_POTION_TANK)
                .add(ModBlocks.HEALING_POTION_TANK)
                .add(ModBlocks.REGENERATION_POTION_TANK)
                .add(ModBlocks.STRENGTH_POTION_TANK)
                .add(ModBlocks.SWIFTNESS_POTION_TANK)
                .add(ModBlocks.NIGHT_VISION_POTION_TANK)
                .add(ModBlocks.INVISIBILITY_POTION_TANK)
                .add(ModBlocks.WATER_BREATHING_POTION_TANK)
                .add(ModBlocks.LEAPING_POTION_TANK)
                .add(ModBlocks.SLOW_FALLING_POTION_TANK)
                .add(ModBlocks.POISON_POTION_TANK)
                .add(ModBlocks.WEAKNESS_POTION_TANK)
                .add(ModBlocks.HARMING_POTION_TANK)
                .add(ModBlocks.SLOWNESS_POTION_TANK)
                .add(ModBlocks.TURTLE_MASTER_POTION_TANK)
                .add(ModBlocks.FROSTBITE_POTION_TANK)
                .add(ModBlocks.HEAT_STROKE_POTION_TANK)
                .add(ModBlocks.FATAL_POISON_POTION_TANK)
                .add(ModBlocks.VOID_SICKNESS_POTION_TANK);

        getOrCreateTagBuilder(BlockTags.SAND)
                .add(ModBlocks.WHITE_SAND)
                .add(ModBlocks.BLACK_SAND);

        getOrCreateTagBuilder(ModTags.Blocks.ITE_BLOCKS)
                .add(ModBlocks.FROSITE_BLOCK)
                .add(ModBlocks.FROSITE_BRICKS)
                .add(ModBlocks.FROSITE_BRICK_STAIRS)
                .add(ModBlocks.FROSITE_BRICK_SLAB)
                .add(ModBlocks.FROSITE_BRICK_WALL)
                .add(ModBlocks.FROSITE_TILES)
                .add(ModBlocks.FROSITE_TILE_STAIRS)
                .add(ModBlocks.FROSITE_TILE_SLAB)
                .add(ModBlocks.FROSITE_TILE_WALL)
                .add(ModBlocks.CHISELED_FROSITE)
                .add(ModBlocks.FROSITE_PRESSURE_PLATE)
                .add(ModBlocks.FROSITE_BUTTON)
                .add(ModBlocks.LIGHT_FROSITE_BLOCK)
                .add(ModBlocks.DARKEN_FROSITE_BLOCK)
                .add(ModBlocks.REINFORCED_FROSITE_BLOCK)
                .add(ModBlocks.LIGHT_REINFORCED_FROSITE_BLOCK)
                .add(ModBlocks.DARKEN_REINFORCED_FROSITE_BLOCK)
                .add(ModBlocks.SANDITE_BLOCK)
                .add(ModBlocks.SANDITE_BRICKS)
                .add(ModBlocks.SANDITE_BRICK_STAIRS)
                .add(ModBlocks.SANDITE_BRICK_SLAB)
                .add(ModBlocks.SANDITE_BRICK_WALL)
                .add(ModBlocks.SANDITE_TILES)
                .add(ModBlocks.SANDITE_TILE_STAIRS)
                .add(ModBlocks.SANDITE_TILE_SLAB)
                .add(ModBlocks.SANDITE_TILE_WALL)
                .add(ModBlocks.CHISELED_SANDITE)
                .add(ModBlocks.LIGHT_SANDITE_BLOCK)
                .add(ModBlocks.DARKEN_SANDITE_BLOCK)
                .add(ModBlocks.LEAFITE_BLOCK)
                .add(ModBlocks.LEAFITE_BRICKS)
                .add(ModBlocks.LEAFITE_TILES)
                .add(ModBlocks.CHISELED_LEAFITE)
                .add(ModBlocks.LEAFITE_BRICK_STAIRS)
                .add(ModBlocks.LEAFITE_BRICK_SLAB)
                .add(ModBlocks.LEAFITE_BRICK_WALL)
                .add(ModBlocks.LEAFITE_TILE_STAIRS)
                .add(ModBlocks.LEAFITE_TILE_SLAB)
                .add(ModBlocks.LEAFITE_TILE_WALL)
                .add(ModBlocks.LIGHT_LEAFITE_BLOCK)
                .add(ModBlocks.DARKEN_LEAFITE_BLOCK)
                .add(ModBlocks.END_ITE_BLOCK)
                .add(ModBlocks.END_ITE_BRICKS)
                .add(ModBlocks.END_ITE_BRICK_STAIRS)
                .add(ModBlocks.END_ITE_BRICK_SLAB)
                .add(ModBlocks.END_ITE_BRICK_WALL)
                .add(ModBlocks.END_ITE_TILES)
                .add(ModBlocks.END_ITE_TILE_STAIRS)
                .add(ModBlocks.END_ITE_TILE_SLAB)
                .add(ModBlocks.END_ITE_TILE_WALL)
                .add(ModBlocks.CHISELED_END_ITE)
                .add(ModBlocks.LIGHT_END_ITE_BLOCK)
                .add(ModBlocks.DARKEN_END_ITE_BLOCK)
                .add(ModBlocks.LIGHT_FROSITE_BRICKS)
                .add(ModBlocks.LIGHT_FROSITE_BRICK_STAIRS)
                .add(ModBlocks.LIGHT_FROSITE_BRICK_SLAB)
                .add(ModBlocks.LIGHT_FROSITE_BRICK_WALL)
                .add(ModBlocks.LIGHT_FROSITE_TILES)
                .add(ModBlocks.LIGHT_FROSITE_TILE_STAIRS)
                .add(ModBlocks.LIGHT_FROSITE_TILE_SLAB)
                .add(ModBlocks.LIGHT_FROSITE_TILE_WALL)
                .add(ModBlocks.LIGHT_FROSITE_PRESSURE_PLATE)
                .add(ModBlocks.LIGHT_FROSITE_BUTTON)
                .add(ModBlocks.DARKEN_FROSITE_BRICKS)
                .add(ModBlocks.DARKEN_FROSITE_BRICK_STAIRS)
                .add(ModBlocks.DARKEN_FROSITE_BRICK_SLAB)
                .add(ModBlocks.DARKEN_FROSITE_BRICK_WALL)
                .add(ModBlocks.DARKEN_FROSITE_TILES)
                .add(ModBlocks.DARKEN_FROSITE_TILE_STAIRS)
                .add(ModBlocks.DARKEN_FROSITE_TILE_SLAB)
                .add(ModBlocks.DARKEN_FROSITE_TILE_WALL)
                .add(ModBlocks.DARKEN_FROSITE_PRESSURE_PLATE)
                .add(ModBlocks.DARKEN_FROSITE_BUTTON)
                .add(ModBlocks.LIGHT_SANDITE_BRICKS)
                .add(ModBlocks.LIGHT_SANDITE_BRICK_STAIRS)
                .add(ModBlocks.LIGHT_SANDITE_BRICK_SLAB)
                .add(ModBlocks.LIGHT_SANDITE_BRICK_WALL)
                .add(ModBlocks.LIGHT_SANDITE_TILES)
                .add(ModBlocks.LIGHT_SANDITE_TILE_STAIRS)
                .add(ModBlocks.LIGHT_SANDITE_TILE_SLAB)
                .add(ModBlocks.LIGHT_SANDITE_TILE_WALL)
                .add(ModBlocks.DARKEN_SANDITE_BRICKS)
                .add(ModBlocks.DARKEN_SANDITE_BRICK_STAIRS)
                .add(ModBlocks.DARKEN_SANDITE_BRICK_SLAB)
                .add(ModBlocks.DARKEN_SANDITE_BRICK_WALL)
                .add(ModBlocks.DARKEN_SANDITE_TILES)
                .add(ModBlocks.DARKEN_SANDITE_TILE_STAIRS)
                .add(ModBlocks.DARKEN_SANDITE_TILE_SLAB)
                .add(ModBlocks.DARKEN_SANDITE_TILE_WALL)
                .add(ModBlocks.LIGHT_LEAFITE_BRICKS)
                .add(ModBlocks.LIGHT_LEAFITE_BRICK_STAIRS)
                .add(ModBlocks.LIGHT_LEAFITE_BRICK_SLAB)
                .add(ModBlocks.LIGHT_LEAFITE_BRICK_WALL)
                .add(ModBlocks.LIGHT_LEAFITE_TILES)
                .add(ModBlocks.LIGHT_LEAFITE_TILE_STAIRS)
                .add(ModBlocks.LIGHT_LEAFITE_TILE_SLAB)
                .add(ModBlocks.LIGHT_LEAFITE_TILE_WALL)
                .add(ModBlocks.DARKEN_LEAFITE_BRICKS)
                .add(ModBlocks.DARKEN_LEAFITE_BRICK_STAIRS)
                .add(ModBlocks.DARKEN_LEAFITE_BRICK_SLAB)
                .add(ModBlocks.DARKEN_LEAFITE_BRICK_WALL)
                .add(ModBlocks.DARKEN_LEAFITE_TILES)
                .add(ModBlocks.DARKEN_LEAFITE_TILE_STAIRS)
                .add(ModBlocks.DARKEN_LEAFITE_TILE_SLAB)
                .add(ModBlocks.DARKEN_LEAFITE_TILE_WALL)
                .add(ModBlocks.LIGHT_END_ITE_BRICKS)
                .add(ModBlocks.LIGHT_END_ITE_BRICK_STAIRS)
                .add(ModBlocks.LIGHT_END_ITE_BRICK_SLAB)
                .add(ModBlocks.LIGHT_END_ITE_BRICK_WALL)
                .add(ModBlocks.LIGHT_END_ITE_TILES)
                .add(ModBlocks.LIGHT_END_ITE_TILE_STAIRS)
                .add(ModBlocks.LIGHT_END_ITE_TILE_SLAB)
                .add(ModBlocks.LIGHT_END_ITE_TILE_WALL)
                .add(ModBlocks.DARKEN_END_ITE_BRICKS)
                .add(ModBlocks.DARKEN_END_ITE_BRICK_STAIRS)
                .add(ModBlocks.DARKEN_END_ITE_BRICK_SLAB)
                .add(ModBlocks.DARKEN_END_ITE_BRICK_WALL)
                .add(ModBlocks.DARKEN_END_ITE_TILES)
                .add(ModBlocks.DARKEN_END_ITE_TILE_STAIRS)
                .add(ModBlocks.DARKEN_END_ITE_TILE_SLAB)
                .add(ModBlocks.DARKEN_END_ITE_TILE_WALL);

        getOrCreateTagBuilder(BlockTags.SIGNS)
                .add(ModBlocks.WALL_STONEBARK_SIGN)
                .add(ModBlocks.WALL_DEEPBARK_SIGN)
                .add(ModBlocks.WALL_LEAFITE_SIGN);

        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(ModBlocks.STANDING_STONEBARK_SIGN)
                .add(ModBlocks.STANDING_DEEPBARK_SIGN)
                .add(ModBlocks.STANDING_LEAFITE_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(ModBlocks.WALL_HANGING_STONEBARK_SIGN)
                .add(ModBlocks.WALL_HANGING_DEEPBARK_SIGN)
                .add(ModBlocks.WALL_HANGING_LEAFITE_SIGN);

        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(ModBlocks.HANGING_STONEBARK_SIGN)
                .add(ModBlocks.HANGING_DEEPBARK_SIGN)
                .add(ModBlocks.HANGING_LEAFITE_SIGN);

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.FROSITE_BUTTON)
                .add(ModBlocks.LIGHT_FROSITE_BUTTON)
                .add(ModBlocks.DARKEN_FROSITE_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.STONEBARK_BUTTON)
                .add(ModBlocks.DEEPBARK_BUTTON)
                .add(ModBlocks.LEAFITE_PLANKS_BUTTON);

        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.ALUMINUM_PRESSURE_PLATE)
                .add(ModBlocks.NICKEL_PRESSURE_PLATE)
                .add(ModBlocks.STEEL_PRESSURE_PLATE)
                .add(ModBlocks.FROSITE_PRESSURE_PLATE)
                .add(ModBlocks.LIGHT_FROSITE_PRESSURE_PLATE)
                .add(ModBlocks.DARKEN_FROSITE_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.STONEBARK_PRESSURE_PLATE)
                .add(ModBlocks.DEEPBARK_PRESSURE_PLATE)
                .add(ModBlocks.LEAFITE_PLANKS_PRESSURE_PLATE);
    }
}
