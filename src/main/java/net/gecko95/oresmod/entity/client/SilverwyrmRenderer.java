package net.gecko95.oresmod.entity.client;

import net.gecko95.oresmod.OresMod;
import net.gecko95.oresmod.entity.custom.SilverwyrmEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class SilverwyrmRenderer extends MobEntityRenderer<SilverwyrmEntity, SilverwyrmModel<SilverwyrmEntity>> {
    private static final Identifier TEXTURE = new Identifier(OresMod.MOD_ID,"textures/entity/silverwyrm.png");
    public SilverwyrmRenderer(EntityRendererFactory.Context context) {
        super(context, new SilverwyrmModel<>(context.getPart(ModModelLayers.SILVERWYRM)),0.6f);
    }

    @Override
    public Identifier getTexture(SilverwyrmEntity entity) {
        return TEXTURE;
    }

    
    @Override
    public void render(SilverwyrmEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
           if (mobEntity.isBaby()){
        matrixStack.scale(0.5f,0.5f,0.5f);
    } else {
        matrixStack.scale(1.5f,1.5f,1.5f);
    }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
