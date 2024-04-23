package net.gecko95.oresmod.entity.client;

import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.entity.custom.SilverpedeEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class SilverpedeRenderer extends MobEntityRenderer<SilverpedeEntity, SilverpedeModel<SilverpedeEntity>> {
    private static final Identifier TEXTURE = new Identifier(OresMod.MOD_ID,"textures/entity/silverpede.png");
    public SilverpedeRenderer(EntityRendererFactory.Context context) {
        super(context, new SilverpedeModel<>(context.getPart(ModModelLayers.SILVERPEDE)),0.4f);
    }

    @Override
    public Identifier getTexture(SilverpedeEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(SilverpedeEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {

        if (mobEntity.isBaby()){
            matrixStack.scale(0.5f,0.5f,0.5f);
        } else {
            matrixStack.scale(1.5f,1.5f,1.5f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
