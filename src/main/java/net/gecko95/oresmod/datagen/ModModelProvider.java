package net.gecko95.oresmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.gecko95.oresmod.block.ModBlocks;
import net.gecko95.oresmod.item.ModItems;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SALT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SALT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_SALT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FROSITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_FROSITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FROSITE_BLOCK);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_FROSITE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_WHITE_SANDSTONE, TexturedModel.CUBE_BOTTOM_TOP);
        BlockStateModelGenerator.BlockTexturePool smoothwhitesandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_WHITE_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool whitesandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_SANDSTONE_TEXTURE);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_BLACK_SANDSTONE, TexturedModel.CUBE_BOTTOM_TOP);
        BlockStateModelGenerator.BlockTexturePool smoothblacksandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_BLACK_SANDSTONE);
        BlockStateModelGenerator.BlockTexturePool blacksandstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_SANDSTONE_TEXTURE);
        BlockStateModelGenerator.BlockTexturePool frostbrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FROSITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool frosttilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FROSITE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALUMINUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ALUMINUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ALUMINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_ALUMINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NICKEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_NICKEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NICKEL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_NICKEL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_STEEL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAVA_TANK);
        BlockStateModelGenerator.BlockTexturePool watertankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WATER_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MILK_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FIRE_RESISTANCE_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HEALING_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.REGENERATION_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STRENGTH_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SWIFTNESS_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NIGHT_VISION_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INVISIBILITY_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WATER_BREATHING_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAPING_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SLOW_FALLING_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POISON_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WEAKNESS_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HARMING_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SLOWNESS_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FROSTBITE_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HEAT_STROKE_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FATAL_POISON_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VOID_SICKNESS_POTION_TANK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TURTLE_MASTER_POTION_TANK);
        BlockStateModelGenerator.BlockTexturePool smoothsteelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_STEEL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool cutsteelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CUT_STEEL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEEL_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TITANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_TUNGSTEN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUNGSTEN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANIUM_ALLOY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_COBALT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBALT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_SAND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SUSPICIOUS_WHITE_SAND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TERRACOTTA_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRAVEL_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUFF_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DRIPSTONE_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_SAND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FAKE_BEDROCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_BEDROCK);
        BlockStateModelGenerator.BlockTexturePool polibedrockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_BEDROCK);
        BlockStateModelGenerator.BlockTexturePool brickbedrockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_BEDROCK_BRICKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_POLISHED_BEDROCK, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool sanditebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SANDITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool sanditetilePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SANDITE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SANDSTONE_SANDITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_SANDSTONE_SANDITE_ORE);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_SANDITE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_IRON_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_COPPER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_LAPIS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_GOLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_REDSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_DIAMOND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_EMERALD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_ALUMINUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_NICKEL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.COBBLESTONE_QUARTZ_ORE);
        BlockStateModelGenerator.BlockTexturePool marblePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MARBLE);
        BlockStateModelGenerator.BlockTexturePool marblebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MARBLE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GILDED_MARBLE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GILDED_MARBLE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SILVER_SCALES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FOSSILIZED_SILVER_SCALES);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_MARBLE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.SILVER_SCALE_CORE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.SILVER_SCALE_FACE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.FOSSILIZED_SILVER_SCALE_CORE, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.FOSSILIZED_SILVER_SCALE_FACE, TexturedModel.CUBE_BOTTOM_TOP);
        BlockStateModelGenerator.BlockTexturePool andesitebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_ANDESITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool dioritebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DIORITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool granitebrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.POLISHED_GRANITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool lrustedsteelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHTY_RUSTED_STEEL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool lrustedcutsteelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHTY_RUSTED_CUT_STEEL);
        BlockStateModelGenerator.BlockTexturePool rustedsteelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUSTED_STEEL_BLOCK);
        BlockStateModelGenerator.BlockTexturePool rustedcutsteelPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUSTED_CUT_STEEL);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHTY_RUSTED_STEEL_LAMP);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUSTED_STEEL_LAMP);

        blockStateModelGenerator.registerLog(ModBlocks.STONEBARK_LOG).log(ModBlocks.STONEBARK_LOG).wood(ModBlocks.STONEBARK_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_STONEBARK_LOG).log(ModBlocks.STRIPPED_STONEBARK_LOG).wood(ModBlocks.STRIPPED_STONEBARK_WOOD);
        BlockStateModelGenerator.BlockTexturePool stonebarkPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STONEBARK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONEBARK_LEAVES);

        blockStateModelGenerator.registerLog(ModBlocks.DEEPSLATE_LOG).log(ModBlocks.DEEPSLATE_LOG).wood(ModBlocks.DEEPSLATE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_DEEPSLATE_LOG).log(ModBlocks.STRIPPED_DEEPSLATE_LOG).wood(ModBlocks.STRIPPED_DEEPSLATE_WOOD);
        BlockStateModelGenerator.BlockTexturePool deepbarkPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_LEAVES);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.STONEBARK_SAPLING, ModBlocks.POTTED_STONEBARK_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DEEPBARK_SAPLING, ModBlocks.POTTED_DEEPBARK_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        frostbrickPool.stairs(ModBlocks.FROSITE_BRICK_STAIRS);
        frostbrickPool.slab(ModBlocks.FROSITE_BRICK_SLAB);
        frostbrickPool.wall(ModBlocks.FROSITE_BRICK_WALL);

        frosttilePool.stairs(ModBlocks.FROSITE_TILE_STAIRS);
        frosttilePool.slab(ModBlocks.FROSITE_TILE_SLAB);
        frosttilePool.wall(ModBlocks.FROSITE_TILE_WALL);

        polibedrockPool.stairs(ModBlocks.POLISHED_BEDROCK_STAIRS);
        polibedrockPool.slab(ModBlocks.POLISHED_BEDROCK_SLAB);
        polibedrockPool.wall(ModBlocks.POLISHED_BEDROCK_WALL);

        brickbedrockPool.stairs(ModBlocks.POLISHED_BEDROCK_BRICKS_STAIRS);
        brickbedrockPool.slab(ModBlocks.POLISHED_BEDROCK_BRICKS_SLAB);
        brickbedrockPool.wall(ModBlocks.POLISHED_BEDROCK_BRICKS_WALL);

        smoothsteelPool.slab(ModBlocks.SMOOTH_STEEL_SLAB);

        cutsteelPool.stairs(ModBlocks.CUT_STEEL_STAIRS);
        cutsteelPool.slab(ModBlocks.CUT_STEEL_SLAB);

        lrustedsteelPool.slab(ModBlocks.LIGHTY_RUSTED_STEEL_SLAB);

        lrustedcutsteelPool.stairs(ModBlocks.LIGHTY_RUSTED_CUT_STEEL_STAIRS);
        lrustedcutsteelPool.slab(ModBlocks.LIGHTY_RUSTED_CUT_STEEL_SLAB);

        rustedsteelPool.slab(ModBlocks.RUSTED_STEEL_SLAB);

        rustedcutsteelPool.stairs(ModBlocks.RUSTED_CUT_STEEL_STAIRS);
        rustedcutsteelPool.slab(ModBlocks.RUSTED_CUT_STEEL_SLAB);

        sanditebrickPool.stairs(ModBlocks.SANDITE_BRICK_STAIRS);
        sanditebrickPool.slab(ModBlocks.SANDITE_BRICK_SLAB);
        sanditebrickPool.wall(ModBlocks.SANDITE_BRICK_WALL);

        sanditetilePool.stairs(ModBlocks.SANDITE_TILE_STAIRS);
        sanditetilePool.slab(ModBlocks.SANDITE_TILE_SLAB);
        sanditetilePool.wall(ModBlocks.SANDITE_TILE_WALL);

        watertankPool.same(ModBlocks.AWKWARD_WATER_TANK);

        stonebarkPool.stairs(ModBlocks.STONEBARK_STAIRS);
        stonebarkPool.slab(ModBlocks.STONEBARK_SLAB);
        stonebarkPool.fence(ModBlocks.STONEBARK_FENCE);
        stonebarkPool.fenceGate(ModBlocks.STONEBARK_FENCE_GATE);
        stonebarkPool.button(ModBlocks.STONEBARK_BUTTON);
        stonebarkPool.pressurePlate(ModBlocks.STONEBARK_PRESSURE_PLATE);
        stonebarkPool.family(ModBlocks.STONEBARK_FAMILY);

        deepbarkPool.stairs(ModBlocks.DEEPBARK_STAIRS);
        deepbarkPool.slab(ModBlocks.DEEPBARK_SLAB);
        deepbarkPool.fence(ModBlocks.DEEPBARK_FENCE);
        deepbarkPool.fenceGate(ModBlocks.DEEPBARK_FENCE_GATE);
        deepbarkPool.button(ModBlocks.DEEPBARK_BUTTON);
        deepbarkPool.pressurePlate(ModBlocks.DEEPBARK_PRESSURE_PLATE);
        deepbarkPool.family(ModBlocks.DEEPBARK_FAMILY);

        smoothwhitesandstonePool.stairs(ModBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS);
        smoothwhitesandstonePool.slab(ModBlocks.SMOOTH_WHITE_SANDSTONE_SLAB);
        whitesandstonePool.wall(ModBlocks.WHITE_SANDSTONE_WALL);

        blacksandstonePool.wall(ModBlocks.BLACK_SANDSTONE_WALL);
        smoothblacksandstonePool.stairs(ModBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS);
        smoothblacksandstonePool.slab(ModBlocks.SMOOTH_BLACK_SANDSTONE_SLAB);

        marblePool.stairs(ModBlocks.MARBLE_STAIRS);
        marblePool.slab(ModBlocks.MARBLE_SLAB);
        marblePool.wall(ModBlocks.MARBLE_WALL);

        marblebrickPool.stairs(ModBlocks.MARBLE_BRICK_STAIRS);
        marblebrickPool.slab(ModBlocks.MARBLE_BRICK_SLAB);
        marblebrickPool.wall(ModBlocks.MARBLE_BRICK_WALL);

        andesitebrickPool.stairs(ModBlocks.POLISHED_ANDESITE_BRICK_STAIRS);
        andesitebrickPool.slab(ModBlocks.POLISHED_ANDESITE_BRICK_SLAB);
        andesitebrickPool.wall(ModBlocks.POLISHED_ANDESITE_BRICK_WALL);

        dioritebrickPool.stairs(ModBlocks.POLISHED_DIORITE_BRICK_STAIRS);
        dioritebrickPool.slab(ModBlocks.POLISHED_DIORITE_BRICK_SLAB);
        dioritebrickPool.wall(ModBlocks.POLISHED_DIORITE_BRICK_WALL);

        granitebrickPool.stairs(ModBlocks.POLISHED_GRANITE_BRICK_STAIRS);
        granitebrickPool.slab(ModBlocks.POLISHED_GRANITE_BRICK_SLAB);
        granitebrickPool.wall(ModBlocks.POLISHED_GRANITE_BRICK_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.ALUMINUM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ALUMINUM_TRAPDOOR);

        blockStateModelGenerator.registerDoor(ModBlocks.STEEL_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.STEEL_TRAPDOOR);

        blockStateModelGenerator.registerDoor(ModBlocks.LIGHTY_RUSTED_STEEL_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.LIGHTY_RUSTED_STEEL_TRAPDOOR);

        blockStateModelGenerator.registerDoor(ModBlocks.RUSTED_STEEL_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RUSTED_STEEL_TRAPDOOR);

        blockStateModelGenerator.registerDoor(ModBlocks.STONEBARK_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.STONEBARK_TRAPDOOR);

        blockStateModelGenerator.registerDoor(ModBlocks.DEEPBARK_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.DEEPBARK_TRAPDOOR);

        blockStateModelGenerator.registerSimpleState(ModBlocks.FLINT_SPIKES);
        blockStateModelGenerator.registerSimpleState(ModBlocks.IRON_SPIKES);
        blockStateModelGenerator.registerSimpleState(ModBlocks.ALUMINUM_SPIKES);
        blockStateModelGenerator.registerSimpleState(ModBlocks.STEEL_SPIKES);

        blockStateModelGenerator.registerSimpleState(ModBlocks.SILVER_CROWN);

        blockStateModelGenerator.registerSimpleState(ModBlocks.ENDER_DRAGON_TROPHY);
        blockStateModelGenerator.registerSimpleState(ModBlocks.WITHER_TROPHY);
        blockStateModelGenerator.registerSimpleState(ModBlocks.ELDER_GUARDIAN_TROPHY);
        blockStateModelGenerator.registerSimpleState(ModBlocks.WARDEN_TROPHY);
        blockStateModelGenerator.registerSimpleState(ModBlocks.SILVERWYRM_TROPHY);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.POWDERED_SALT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_SALT, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_FLESH, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_FLESH, Models.GENERATED);

        itemModelGenerator.register(ModItems.FROSITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.COPPER_HANDLE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_DRIVE, Models.GENERATED);
        itemModelGenerator.register(ModItems.POWER_DRIVE, Models.GENERATED);

        itemModelGenerator.register(ModItems.FROSITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FROSITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FROSITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FROSITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FROSITE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.FROSITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.FROSITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.FROSITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.FROSITE_BOOTS));

        itemModelGenerator.register(ModItems.ALUMINUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALUMINUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ALUMINUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.ALUMINUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALUMINUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALUMINUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALUMINUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.ALUMINUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.FLINT_AND_ALUMINUM, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.ALUMINUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.ALUMINUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.ALUMINUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.ALUMINUM_BOOTS));

        itemModelGenerator.register(ModItems.NICKEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.NICKEL_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_NICKEL, Models.GENERATED);

        itemModelGenerator.register(ModItems.NICKEL_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NICKEL_BEETROOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.NICKEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NICKEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NICKEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NICKEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NICKEL_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.NICKEL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.NICKEL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.NICKEL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.NICKEL_BOOTS));

        itemModelGenerator.register(ModItems.COPPER_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COPPER_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.COPPER_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.COPPER_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.COPPER_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.COPPER_BOOTS));

        itemModelGenerator.register(ModItems.IRON_BALL, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_COMPOUND_COPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_ALUMINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_NICKEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_ALUCKEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_ALUPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_NICKINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_NICKOPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_COPPINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_COPPEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_ALUNICKOPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_ALUPPEREL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_NICKOPPINUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_NICKINUPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_COPPINUCKEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_COMPOUND_COPPELUNUM, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_COMPOUND, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_STEEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.STEEL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STEEL_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.STEEL_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_BEETROOT, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.STEEL_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.STEEL_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.STEEL_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.STEEL_BOOTS));

        itemModelGenerator.register(ModItems.STONEBARK_HANGING_SIGN, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEEPBARK_HANGING_SIGN, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_TITANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.TUNGSTEN_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TUNGSTEN_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.TITANIUM_ALLOY_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_ALLOY_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_ALLOY_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.TITANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.TUNGSTEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.TITANIUM_ALLOY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_ALLOY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_ALLOY_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_ALLOY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_ALLOY_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TITANIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TITANIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TITANIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TITANIUM_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TUNGSTEN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TUNGSTEN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TUNGSTEN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TUNGSTEN_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TITANIUM_ALLOY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TITANIUM_ALLOY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TITANIUM_ALLOY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TITANIUM_ALLOY_BOOTS));

        itemModelGenerator.register(ModItems.COBALT_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.COBALT_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.COBALT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.COBALT_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.COBALT_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.COBALT_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.COBALT_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.COBALT_BOOTS));

        itemModelGenerator.register(ModItems.COBALT_HANDLE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DUEL_POWER_DRIVE, Models.GENERATED);

        itemModelGenerator.register(ModItems.BEDROCK_SHARD, Models.GENERATED);

        itemModelGenerator.register(ModItems.BEDROCK_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEDROCK_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEDROCK_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEDROCK_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BEDROCK_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BEDROCK_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BEDROCK_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BEDROCK_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BEDROCK_BOOTS));

        itemModelGenerator.register(ModItems.FLINT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.CLAY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.CLAY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.CLAY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.CLAY_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BLACK_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BLACK_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BLACK_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BLACK_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BLUE_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BLUE_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BLUE_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BLUE_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BROWN_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BROWN_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BROWN_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.BROWN_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.CYAN_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.CYAN_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.CYAN_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.CYAN_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.GRAY_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.GRAY_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.GRAY_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.GRAY_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.GREEN_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.GREEN_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.GREEN_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.GREEN_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIGHT_BLUE_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIGHT_BLUE_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIGHT_BLUE_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIGHT_BLUE_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIGHT_GRAY_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIGHT_GRAY_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIGHT_GRAY_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIGHT_GRAY_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIME_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIME_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIME_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.LIME_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.MAGENTA_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.MAGENTA_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.MAGENTA_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.MAGENTA_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.ORANGE_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.ORANGE_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.ORANGE_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.ORANGE_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PINK_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PINK_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PINK_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PINK_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PURPLE_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PURPLE_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PURPLE_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.PURPLE_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.RED_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.RED_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.RED_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.RED_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.WHITE_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.WHITE_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.WHITE_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.WHITE_TERRACOTTA_BOOTS));

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.YELLOW_TERRACOTTA_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.YELLOW_TERRACOTTA_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.YELLOW_TERRACOTTA_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.YELLOW_TERRACOTTA_BOOTS));

        itemModelGenerator.register(ModItems.SANDITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.SANDITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SANDITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SANDITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SANDITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SANDITE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem)ModItems.SANDITE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.SANDITE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.SANDITE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem)ModItems.SANDITE_BOOTS));

        itemModelGenerator.register(ModItems.SILVER_SCALE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SILVER_MANDIBLE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.RUSTED_STEEL_APPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUSTED_STEEL_BEETROOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.SILVERPEDE_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")),Optional.empty()));

        itemModelGenerator.register(ModItems.JUNGLE_SPIDER_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")),Optional.empty()));
    }
}
