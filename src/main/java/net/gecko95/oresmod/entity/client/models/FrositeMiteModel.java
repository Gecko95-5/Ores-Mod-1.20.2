// Made with Blockbench 4.10.0
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package net.gecko95.oresmod.entity.client.models;

import net.gecko95.oresmod.entity.custom.mite.FrositeMiteEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class FrositeMiteModel<T extends FrositeMiteEntity> extends SinglePartEntityModel<T> {
	private final ModelPart sprite;
	private final ModelPart head;
	public FrositeMiteModel(ModelPart root) {
		this.sprite = root.getChild("sprite");
		this.head = sprite.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData sprite = modelPartData.addChild("sprite", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData head = sprite.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-2.5F, -14.0F, -2.5F, 5.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData body = sprite.addChild("body", ModelPartBuilder.create().uv(0, 10).cuboid(-2.0F, -9.0F, -1.0F, 4.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData rightarm = body.addChild("rightarm", ModelPartBuilder.create().uv(16, 10).cuboid(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(2.5F, -6.0F, 0.0F));

		ModelPartData leftarm = body.addChild("leftarm", ModelPartBuilder.create().uv(12, 10).cuboid(-0.5F, -3.0F, -0.5F, 1.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.5F, -6.0F, 0.0F));

		ModelPartData rightleg = body.addChild("rightleg", ModelPartBuilder.create().uv(0, 0).cuboid(-0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, -2.0F, 0.0F));

		ModelPartData leftleg = body.addChild("leftleg", ModelPartBuilder.create().uv(15, 0).cuboid(0.5F, -2.0F, -0.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -2.0F, 0.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void setAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		sprite.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return sprite;
	}
}