package net.gecko95.oresmod.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.entity.custom.SilverpedeEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<SilverpedeEntity> SILVERPEDE = Registry.register(Registries.ENTITY_TYPE,
            new Identifier(OresMod.MOD_ID,"silverpede"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, SilverpedeEntity::new)
                    .dimensions(EntityDimensions.fixed(0.7f,0.5f)).build());

}
