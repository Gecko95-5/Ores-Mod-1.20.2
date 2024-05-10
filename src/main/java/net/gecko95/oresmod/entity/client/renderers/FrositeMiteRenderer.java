package net.gecko95.oresmod.entity.client.renderers;

import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.entity.client.ModModelLayers;
import net.gecko95.oresmod.entity.client.models.FrositeMiteModel;
import net.gecko95.oresmod.entity.custom.mite.FrositeMiteEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class FrositeMiteRenderer extends MobEntityRenderer<FrositeMiteEntity, FrositeMiteModel<FrositeMiteEntity>> {
    private static final Identifier TEXTURE = new Identifier(OresMod.MOD_ID,"textures/entity/mite/frosite_mite.png");
    public FrositeMiteRenderer(EntityRendererFactory.Context context) {
        super(context, new FrositeMiteModel<>(context.getPart(ModModelLayers.FROSITE_MITE)),0.4f);
    }

    @Override
    public Identifier getTexture(FrositeMiteEntity entity) {
        return TEXTURE;
    }
}
