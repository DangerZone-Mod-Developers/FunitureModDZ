package com.jtrent238.funituremod.model;

import org.lwjgl.util.vector.Matrix;

import dangerzone.ModelRenderer;
import dangerzone.entities.Entity;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class ModelChair {
	private final ModelRenderer group;
	private final ModelRenderer legs;

	public ModelChair() {
		//textureWidth = 64;
		//textureHeight = 64;

		group = new ModelRenderer(0, 0);
		group.setRotationPoint(-8.0F, 16.0F, 8.0F);
		group.setTextureSize(0, 0);
		group.setTextureSize(0, 18);

		legs = new ModelRenderer(0, 0);
		legs.setRotationPoint(0.0F, 0.0F, 0.0F);
		//group.addChild(legs);
		legs.setTextureSize(8, 18);
		legs.setTextureSize(0, 18);
		legs.setTextureSize(8, 0);
		legs.setTextureSize(0, 0);
	}

	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	public <IVertexBuilder> void render(Matrix matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		group.render(packedLight);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}