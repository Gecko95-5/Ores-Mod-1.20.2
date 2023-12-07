package net.gecko95.oresmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ORES_MOD_ORES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OresMod.MOD_ID, "ores_mod_ores"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ores_mod_ores"))
                    .icon(() -> new ItemStack(ModBlocks.ALUMINUM_ORE)).entries((displayContext, entries) -> {
                        entries.add(Items.COAL);
                        entries.add(Items.COAL_ORE);
                        entries.add(Items.DEEPSLATE_COAL_ORE);
                        entries.add(ModBlocks.GRAVEL_COAL_ORE);
                        entries.add(Items.IRON_INGOT);
                        entries.add(Items.IRON_NUGGET);
                        entries.add(Items.RAW_IRON);
                        entries.add(Items.IRON_ORE);
                        entries.add(Items.DEEPSLATE_IRON_ORE);
                        entries.add(ModBlocks.TUFF_IRON_ORE);
                        entries.add(Items.COPPER_INGOT);
                        entries.add(Items.RAW_COPPER);
                        entries.add(Items.COPPER_ORE);
                        entries.add(Items.DEEPSLATE_COPPER_ORE);
                        entries.add(ModBlocks.DRIPSTONE_COPPER_ORE);
                        entries.add(Items.GOLD_INGOT);
                        entries.add(Items.GOLD_NUGGET);
                        entries.add(Items.RAW_GOLD);
                        entries.add(Items.GOLD_ORE);
                        entries.add(Items.DEEPSLATE_GOLD_ORE);
                        entries.add(Items.NETHER_GOLD_ORE);
                        entries.add(ModBlocks.TERRACOTTA_GOLD_ORE);
                        entries.add(Items.REDSTONE);
                        entries.add(Items.REDSTONE_ORE);
                        entries.add(Items.DEEPSLATE_REDSTONE_ORE);
                        entries.add(Items.EMERALD);
                        entries.add(Items.EMERALD_ORE);
                        entries.add(Items.DEEPSLATE_EMERALD_ORE);
                        entries.add(Items.LAPIS_LAZULI);
                        entries.add(Items.LAPIS_ORE);
                        entries.add(Items.DEEPSLATE_LAPIS_ORE);
                        entries.add(Items.DIAMOND);
                        entries.add(Items.DIAMOND_ORE);
                        entries.add(Items.DEEPSLATE_DIAMOND_ORE);
                        entries.add(Items.QUARTZ);
                        entries.add(Items.NETHER_QUARTZ_ORE);
                        entries.add(Items.NETHERITE_INGOT);
                        entries.add(Items.NETHERITE_SCRAP);
                        entries.add(Items.ANCIENT_DEBRIS);
                        entries.add(ModItems.POWDERED_SALT);
                        entries.add(ModItems.RAW_SALT);
                        entries.add(ModBlocks.SALT_ORE);
                        entries.add(ModBlocks.SUSPICIOUS_WHITE_SAND);
                        entries.add(ModItems.FROSITE);
                        entries.add(ModBlocks.FROSITE_ORE);
                        entries.add(ModBlocks.ICE_FROSITE_ORE);
                        entries.add(ModItems.ALUMINUM_INGOT);
                        entries.add(ModItems.ALUMINUM_NUGGET);
                        entries.add(ModItems.RAW_ALUMINUM);
                        entries.add(ModBlocks.ALUMINUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ALUMINUM_ORE);
                        entries.add(ModItems.NICKEL_INGOT);
                        entries.add(ModItems.NICKEL_NUGGET);
                        entries.add(ModItems.RAW_NICKEL);
                        entries.add(ModBlocks.NICKEL_ORE);
                        entries.add(ModBlocks.DEEPSLATE_NICKEL_ORE);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.RAW_STEEL);
                        entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModBlocks.NETHER_TUNGSTEN_ORE);
                        entries.add(ModItems.TUNGSTEN_INGOT);
                        entries.add(ModItems.TUNGSTEN_NUGGET);
                        entries.add(ModItems.TITANIUM_ALLOY_INGOT);
                        entries.add(ModItems.TITANIUM_ALLOY_SCRAP);
                        entries.add(ModBlocks.NETHER_COBALT_ORE);
                        entries.add(ModItems.COBALT_INGOT);
                        entries.add(ModItems.COBALT_NUGGET);
                    }).build());
    public static final ItemGroup ORES_MOD_COMPOUND_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OresMod.MOD_ID, "ores_mod_compounds"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ores_mod_compounds"))
                    .icon(() -> new ItemStack(ModItems.STEEL_COMPOUND)).entries((displayContext, entries) -> {
                        entries.add(Items.NETHERITE_SCRAP);
                        entries.add(Items.NETHERITE_INGOT);
                        entries.add(ModItems.STEEL_COMPOUND_COPPER);
                        entries.add(ModItems.STEEL_COMPOUND_ALUMINUM);
                        entries.add(ModItems.STEEL_COMPOUND_NICKEL);
                        entries.add(ModItems.STEEL_COMPOUND_ALUCKEL);
                        entries.add(ModItems.STEEL_COMPOUND_ALUPPER);
                        entries.add(ModItems.STEEL_COMPOUND_NICKINUM);
                        entries.add(ModItems.STEEL_COMPOUND_NICKOPPER);
                        entries.add(ModItems.STEEL_COMPOUND_COPPINUM);
                        entries.add(ModItems.STEEL_COMPOUND_COPPEL);
                        entries.add(ModItems.STEEL_COMPOUND_ALUNICKOPPER);
                        entries.add(ModItems.STEEL_COMPOUND_ALUPPEREL);
                        entries.add(ModItems.STEEL_COMPOUND_NICKOPPINUM);
                        entries.add(ModItems.STEEL_COMPOUND_NICKINUPPER);
                        entries.add(ModItems.STEEL_COMPOUND_COPPINUCKEL);
                        entries.add(ModItems.STEEL_COMPOUND_COPPELUNUM);
                        entries.add(ModItems.STEEL_COMPOUND);
                        entries.add(ModItems.RAW_STEEL);
                        entries.add(ModItems.STEEL_INGOT);
                        entries.add(ModItems.TITANIUM_ALLOY_SCRAP);
                        entries.add(ModItems.TITANIUM_ALLOY_INGOT);
                        entries.add(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(ModItems.TITANIUM_ALLOY_UPGRADE_SMITHING_TEMPLATE);
                    }).build());
    public static final ItemGroup ORES_MOD_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OresMod.MOD_ID, "ores_mod_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ores_mod_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.COBALT_BLOCK)).entries((displayContext, entries) -> {
                        entries.add(Items.COAL_BLOCK);
                        entries.add(Items.IRON_BLOCK);
                        entries.add(Items.RAW_IRON_BLOCK);
                        entries.add(Items.COPPER_BLOCK);
                        entries.add(Items.RAW_COPPER_BLOCK);
                        entries.add(Items.GOLD_BLOCK);
                        entries.add(Items.RAW_GOLD_BLOCK);
                        entries.add(Items.REDSTONE_BLOCK);
                        entries.add(Items.EMERALD_BLOCK);
                        entries.add(Items.LAPIS_BLOCK);
                        entries.add(Items.DIAMOND_BLOCK);
                        entries.add(Items.NETHERITE_BLOCK);
                        entries.add(ModBlocks.SALT_BLOCK);
                        entries.add(ModBlocks.RAW_SALT_BLOCK);
                        entries.add(ModBlocks.FROSITE_BLOCK);
                        entries.add(ModBlocks.ALUMINUM_BLOCK);
                        entries.add(ModBlocks.RAW_ALUMINUM_BLOCK);
                        entries.add(ModBlocks.NICKEL_BLOCK);
                        entries.add(ModBlocks.RAW_NICKEL_BLOCK);
                        entries.add(ModBlocks.STEEL_BLOCK);
                        entries.add(ModBlocks.RAW_STEEL_BLOCK);
                        entries.add(ModBlocks.TITANIUM_BLOCK);
                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                        entries.add(ModBlocks.TUNGSTEN_BLOCK);
                        entries.add(ModBlocks.TITANIUM_ALLOY_BLOCK);
                        entries.add(ModBlocks.COBALT_BLOCK);
                    }).build());
    public static final ItemGroup ORES_MOD_TOOLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OresMod.MOD_ID, "ores_mod_tools"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ores_mod_tools"))
                    .icon(() -> new ItemStack(ModItems.NICKEL_DRILL)).entries((displayContext, entries) -> {
                        entries.add(Items.IRON_PICKAXE);
                        entries.add(Items.IRON_AXE);
                        entries.add(Items.IRON_SHOVEL);
                        entries.add(Items.IRON_HOE);
                        entries.add(ModItems.IRON_DRILL);
                        entries.add(ModItems.IRON_CHAINSAW);
                        entries.add(ModItems.COPPER_PICKAXE);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_SHOVEL);
                        entries.add(ModItems.COPPER_HOE);
                        entries.add(ModItems.COPPER_DRILL);
                        entries.add(ModItems.COPPER_CHAINSAW);
                        entries.add(Items.GOLDEN_PICKAXE);
                        entries.add(Items.GOLDEN_AXE);
                        entries.add(Items.GOLDEN_SHOVEL);
                        entries.add(Items.GOLDEN_HOE);
                        entries.add(ModItems.GOLDEN_DRILL);
                        entries.add(ModItems.GOLDEN_CHAINSAW);
                        entries.add(Items.DIAMOND_PICKAXE);
                        entries.add(Items.DIAMOND_AXE);
                        entries.add(Items.DIAMOND_SHOVEL);
                        entries.add(Items.DIAMOND_HOE);
                        entries.add(ModItems.DIAMOND_DRILL);
                        entries.add(ModItems.DIAMOND_CHAINSAW);
                        entries.add(Items.NETHERITE_PICKAXE);
                        entries.add(Items.NETHERITE_AXE);
                        entries.add(Items.NETHERITE_SHOVEL);
                        entries.add(Items.NETHERITE_HOE);
                        entries.add(ModItems.NETHERITE_DRILL);
                        entries.add(ModItems.NETHERITE_CHAINSAW);
                        entries.add(ModItems.FROSITE_PICKAXE);
                        entries.add(ModItems.FROSITE_AXE);
                        entries.add(ModItems.FROSITE_SHOVEL);
                        entries.add(ModItems.FROSITE_HOE);
                        entries.add(ModItems.FROSITE_DRILL);
                        entries.add(ModItems.FROSITE_CHAINSAW);
                        entries.add(ModItems.ALUMINUM_PICKAXE);
                        entries.add(ModItems.ALUMINUM_AXE);
                        entries.add(ModItems.ALUMINUM_SHOVEL);
                        entries.add(ModItems.ALUMINUM_HOE);
                        entries.add(ModItems.ALUMINUM_DRILL);
                        entries.add(ModItems.ALUMINUM_CHAINSAW);
                        entries.add(ModItems.FLINT_AND_ALUMINUM);
                        entries.add(ModItems.NICKEL_PICKAXE);
                        entries.add(ModItems.NICKEL_AXE);
                        entries.add(ModItems.NICKEL_SHOVEL);
                        entries.add(ModItems.NICKEL_HOE);
                        entries.add(ModItems.NICKEL_DRILL);
                        entries.add(ModItems.NICKEL_CHAINSAW);
                        entries.add(ModItems.STEEL_PICKAXE);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_SHOVEL);
                        entries.add(ModItems.STEEL_HOE);
                        entries.add(ModItems.STEEL_DRILL);
                        entries.add(ModItems.STEEL_CHAINSAW);
                        entries.add(ModItems.TITANIUM_PICKAXE);
                        entries.add(ModItems.TITANIUM_AXE);
                        entries.add(ModItems.TITANIUM_SHOVEL);
                        entries.add(ModItems.TITANIUM_HOE);
                        entries.add(ModItems.TITANIUM_DRILL);
                        entries.add(ModItems.TITANIUM_CHAINSAW);
                        entries.add(ModItems.TUNGSTEN_PICKAXE);
                        entries.add(ModItems.TUNGSTEN_AXE);
                        entries.add(ModItems.TUNGSTEN_SHOVEL);
                        entries.add(ModItems.TUNGSTEN_HOE);
                        entries.add(ModItems.TUNGSTEN_DRILL);
                        entries.add(ModItems.TUNGSTEN_CHAINSAW);
                        entries.add(ModItems.TITANIUM_ALLOY_PICKAXE);
                        entries.add(ModItems.TITANIUM_ALLOY_AXE);
                        entries.add(ModItems.TITANIUM_ALLOY_SHOVEL);
                        entries.add(ModItems.TITANIUM_ALLOY_HOE);
                        entries.add(ModItems.TITANIUM_ALLOY_DRILL);
                        entries.add(ModItems.TITANIUM_ALLOY_CHAINSAW);
                        entries.add(ModItems.COBALT_PICKAXE);
                        entries.add(ModItems.COBALT_AXE);
                        entries.add(ModItems.COBALT_SHOVEL);
                        entries.add(ModItems.COBALT_HOE);
                        entries.add(ModItems.COBALT_DRILL);
                        entries.add(ModItems.COBALT_CHAINSAW);
                    }).build());
    public static final ItemGroup ORES_MOD_WEAPONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OresMod.MOD_ID, "ores_mod_weapons"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ores_mod_weapons"))
                    .icon(() -> new ItemStack(ModItems.FROSITE_SWORD)).entries((displayContext, entries) -> {
                        entries.add(Items.IRON_SWORD);
                        entries.add(Items.IRON_AXE);
                        entries.add(Items.IRON_HELMET);
                        entries.add(Items.IRON_CHESTPLATE);
                        entries.add(Items.IRON_LEGGINGS);
                        entries.add(Items.IRON_BOOTS);
                        entries.add(ModItems.COPPER_SWORD);
                        entries.add(ModItems.COPPER_AXE);
                        entries.add(ModItems.COPPER_HELMET);
                        entries.add(ModItems.COPPER_CHESTPLATE);
                        entries.add(ModItems.COPPER_LEGGINGS);
                        entries.add(ModItems.COPPER_BOOTS);
                        entries.add(Items.GOLDEN_SWORD);
                        entries.add(Items.GOLDEN_AXE);
                        entries.add(Items.GOLDEN_HELMET);
                        entries.add(Items.GOLDEN_CHESTPLATE);
                        entries.add(Items.GOLDEN_LEGGINGS);
                        entries.add(Items.GOLDEN_BOOTS);
                        entries.add(Items.DIAMOND_SWORD);
                        entries.add(Items.DIAMOND_AXE);
                        entries.add(Items.DIAMOND_HELMET);
                        entries.add(Items.DIAMOND_CHESTPLATE);
                        entries.add(Items.DIAMOND_LEGGINGS);
                        entries.add(Items.DIAMOND_BOOTS);
                        entries.add(Items.NETHERITE_SWORD);
                        entries.add(Items.NETHERITE_AXE);
                        entries.add(Items.NETHERITE_HELMET);
                        entries.add(Items.NETHERITE_CHESTPLATE);
                        entries.add(Items.NETHERITE_LEGGINGS);
                        entries.add(Items.NETHERITE_BOOTS);
                        entries.add(ModItems.FROSITE_SWORD);
                        entries.add(ModItems.FROSITE_AXE);
                        entries.add(ModItems.FROSITE_HELMET);
                        entries.add(ModItems.FROSITE_CHESTPLATE);
                        entries.add(ModItems.FROSITE_LEGGINGS);
                        entries.add(ModItems.FROSITE_BOOTS);
                        entries.add(ModItems.ALUMINUM_SWORD);
                        entries.add(ModItems.ALUMINUM_AXE);
                        entries.add(ModItems.ALUMINUM_HELMET);
                        entries.add(ModItems.ALUMINUM_CHESTPLATE);
                        entries.add(ModItems.ALUMINUM_LEGGINGS);
                        entries.add(ModItems.ALUMINUM_BOOTS);
                        entries.add(ModItems.NICKEL_SWORD);
                        entries.add(ModItems.NICKEL_AXE);
                        entries.add(ModItems.NICKEL_HELMET);
                        entries.add(ModItems.NICKEL_CHESTPLATE);
                        entries.add(ModItems.NICKEL_LEGGINGS);
                        entries.add(ModItems.NICKEL_BOOTS);
                        entries.add(ModItems.STEEL_SWORD);
                        entries.add(ModItems.STEEL_AXE);
                        entries.add(ModItems.STEEL_HELMET);
                        entries.add(ModItems.STEEL_CHESTPLATE);
                        entries.add(ModItems.STEEL_LEGGINGS);
                        entries.add(ModItems.STEEL_BOOTS);
                        entries.add(ModItems.TITANIUM_SWORD);
                        entries.add(ModItems.TITANIUM_AXE);
                        entries.add(ModItems.TITANIUM_HELMET);
                        entries.add(ModItems.TITANIUM_CHESTPLATE);
                        entries.add(ModItems.TITANIUM_LEGGINGS);
                        entries.add(ModItems.TITANIUM_BOOTS);
                        entries.add(ModItems.TUNGSTEN_SWORD);
                        entries.add(ModItems.TUNGSTEN_AXE);
                        entries.add(ModItems.TUNGSTEN_HELMET);
                        entries.add(ModItems.TUNGSTEN_CHESTPLATE);
                        entries.add(ModItems.TUNGSTEN_LEGGINGS);
                        entries.add(ModItems.TUNGSTEN_BOOTS);
                        entries.add(ModItems.TITANIUM_ALLOY_SWORD);
                        entries.add(ModItems.TITANIUM_ALLOY_AXE);
                        entries.add(ModItems.TITANIUM_ALLOY_HELMET);
                        entries.add(ModItems.TITANIUM_ALLOY_CHESTPLATE);
                        entries.add(ModItems.TITANIUM_ALLOY_LEGGINGS);
                        entries.add(ModItems.TITANIUM_ALLOY_BOOTS);
                        entries.add(ModItems.COBALT_SWORD);
                        entries.add(ModItems.COBALT_AXE);
                        entries.add(ModItems.COBALT_HELMET);
                        entries.add(ModItems.COBALT_CHESTPLATE);
                        entries.add(ModItems.COBALT_LEGGINGS);
                        entries.add(ModItems.COBALT_BOOTS);
                    }).build());
    public static final ItemGroup ORES_MOD_OTHER_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OresMod.MOD_ID, "ores_mod_other"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ores_mod_other"))
                    .icon(() -> new ItemStack(ModItems.RAW_FLESH)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_FLESH);
                        entries.add(ModItems.COOKED_FLESH);
                        entries.add(ModItems.NICKEL_APPLE);
                        entries.add(ModItems.NICKEL_BEETROOT);
                        entries.add(ModItems.STEEL_APPLE);
                        entries.add(ModItems.STEEL_BEETROOT);
                        entries.add(ModItems.IRON_BALL);
                        entries.add(ModItems.COPPER_HANDLE);
                        entries.add(ModItems.COBALT_HANDLE);
                        entries.add(ModItems.COPPER_DRIVE);
                        entries.add(ModItems.POWER_DRIVE);
                        entries.add(ModItems.DUEL_POWER_DRIVE);
                        entries.add(ModItems.HANDLED_POWER_DRIVE);
                        entries.add(ModItems.DUEL_HANDLED_POWER_DRIVE);
                    }).build());

    public static final ItemGroup ORES_MOD_OTHER_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OresMod.MOD_ID, "ores_mod_other_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ores_mod_other_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.STEEL_LAMP)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.FROSITE_BRICKS);
                        entries.add(ModBlocks.FROSITE_BRICK_STAIRS);
                        entries.add(ModBlocks.FROSITE_BRICK_SLAB);
                        entries.add(ModBlocks.FROSITE_BRICK_WALL);
                        entries.add(ModBlocks.FROSITE_TILES);
                        entries.add(ModBlocks.FROSITE_TILE_STAIRS);
                        entries.add(ModBlocks.FROSITE_TILE_SLAB);
                        entries.add(ModBlocks.FROSITE_TILE_WALL);
                        entries.add(ModBlocks.CHISELED_FROSITE);
                        entries.add(ModBlocks.ALUMINUM_DOOR);
                        entries.add(ModBlocks.ALUMINUM_TRAPDOOR);
                        entries.add(ModBlocks.ALUMINUM_BARS);
                        entries.add(ModBlocks.ALUMINUM_PRESSURE_PLATE);
                        entries.add(ModBlocks.NICKEL_PRESSURE_PLATE);
                        entries.add(ModBlocks.SMOOTH_STEEL_BLOCK);
                        entries.add(ModBlocks.SMOOTH_STEEL_SLAB);
                        entries.add(ModBlocks.CUT_STEEL);
                        entries.add(ModBlocks.CUT_STEEL_STAIRS);
                        entries.add(ModBlocks.CUT_STEEL_SLAB);
                        entries.add(ModBlocks.STEEL_DOOR);
                        entries.add(ModBlocks.STEEL_TRAPDOOR);
                        entries.add(ModBlocks.STEEL_BARS);
                        entries.add(ModBlocks.STEEL_PRESSURE_PLATE);
                        entries.add(ModBlocks.STEEL_LAMP);
                        entries.add(ModBlocks.STONEBARK_PLANKS);
                        entries.add(ModBlocks.STONEBARK_STAIRS);
                        entries.add(ModBlocks.STONEBARK_SLAB);
                        entries.add(ModBlocks.STONEBARK_FENCE);
                        entries.add(ModBlocks.STONEBARK_FENCE_GATE);
                        entries.add(ModBlocks.STONEBARK_BUTTON);
                        entries.add(ModBlocks.STONEBARK_PRESSURE_PLATE);
                        entries.add(ModBlocks.STONEBARK_DOOR);
                        entries.add(ModBlocks.STONEBARK_TRAPDOOR);
                        entries.add(ModItems.STONEBARK_SIGN);
                        entries.add(ModItems.STONEBARK_HANGING_SIGN);
                        entries.add(ModBlocks.STONEBARK_LOG);
                        entries.add(ModBlocks.STONEBARK_WOOD);
                        entries.add(ModBlocks.STRIPPED_STONEBARK_LOG);
                        entries.add(ModBlocks.STRIPPED_STONEBARK_WOOD);
                        entries.add(ModBlocks.STONEBARK_LEAVES);
                        entries.add(ModBlocks.STONEBARK_SAPLING);
                        entries.add(ModBlocks.DEEPSLATE_PLANKS);
                        entries.add(ModBlocks.DEEPBARK_STAIRS);
                        entries.add(ModBlocks.DEEPBARK_SLAB);
                        entries.add(ModBlocks.DEEPBARK_FENCE);
                        entries.add(ModBlocks.DEEPBARK_FENCE_GATE);
                        entries.add(ModBlocks.DEEPBARK_BUTTON);
                        entries.add(ModBlocks.DEEPBARK_PRESSURE_PLATE);
                        entries.add(ModBlocks.DEEPBARK_DOOR);
                        entries.add(ModBlocks.DEEPBARK_TRAPDOOR);
                        entries.add(ModItems.DEEPBARK_SIGN);
                        entries.add(ModItems.DEEPBARK_HANGING_SIGN);
                        entries.add(ModBlocks.DEEPSLATE_LOG);
                        entries.add(ModBlocks.DEEPSLATE_WOOD);
                        entries.add(ModBlocks.STRIPPED_DEEPSLATE_LOG);
                        entries.add(ModBlocks.STRIPPED_DEEPSLATE_WOOD);
                        entries.add(ModBlocks.DEEPSLATE_LEAVES);
                        entries.add(ModBlocks.DEEPBARK_SAPLING);
                        entries.add(ModBlocks.WHITE_SAND);
                        entries.add(ModBlocks.WHITE_SANDSTONE);
                        entries.add(ModBlocks.WHITE_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.WHITE_SANDSTONE_SLAB);
                        entries.add(ModBlocks.WHITE_SANDSTONE_WALL);
                        entries.add(ModBlocks.CUT_WHITE_SANDSTONE);
                        entries.add(ModBlocks.SMOOTH_WHITE_SANDSTONE);
                        entries.add(ModBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.SMOOTH_WHITE_SANDSTONE_SLAB);
                        entries.add(ModBlocks.CHISELED_WHITE_SANDSTONE);
                        entries.add(ModBlocks.BLACK_SAND);
                        entries.add(ModBlocks.BLACK_SANDSTONE);
                        entries.add(ModBlocks.BLACK_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.BLACK_SANDSTONE_SLAB);
                        entries.add(ModBlocks.BLACK_SANDSTONE_WALL);
                        entries.add(ModBlocks.CUT_BLACK_SANDSTONE);
                        entries.add(ModBlocks.SMOOTH_BLACK_SANDSTONE);
                        entries.add(ModBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS);
                        entries.add(ModBlocks.SMOOTH_BLACK_SANDSTONE_SLAB);
                        entries.add(ModBlocks.CHISELED_BLACK_SANDSTONE);
                    }).build());

    public static final ItemGroup ORES_MOD_LIQUIDS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(OresMod.MOD_ID, "ores_mod_liquids"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ores_mod_liquids"))
                    .icon(() -> new ItemStack(ModBlocks.WATER_TANK)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.LAVA_TANK);
                        entries.add(ModBlocks.MILK_TANK);
                        entries.add(ModBlocks.WATER_TANK);
                        entries.add(ModBlocks.AWKWARD_WATER_TANK);
                    }).build());
    public static void registerItemGroups(){
        OresMod.LOGGER.info("Registering Item Groups for " + OresMod.MOD_ID);
    }
}
