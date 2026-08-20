package net.entertheboi.sporeatr.client.models;// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.entertheboi.sporeatr.entities.basic_infected.InfPig;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class InfectedPigModel<T extends InfPig> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("sporeatr", "inf_pig"), "main");
	private final ModelPart pig;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart fungus;
	private final ModelPart jaw;
	private final ModelPart leg1;
	private final ModelPart leg2;
	private final ModelPart leg3;
	private final ModelPart leg4;

	public InfectedPigModel () {
		ModelPart root = createBodyLayer().bakeRoot();
		this.pig = root.getChild("pig");
		this.body = this.pig.getChild("body");
		this.head = this.pig.getChild("head");
		this.fungus = this.head.getChild("fungus");
		this.jaw = this.head.getChild("jaw");
		this.leg1 = this.pig.getChild("leg1");
		this.leg2 = this.pig.getChild("leg2");
		this.leg3 = this.pig.getChild("leg3");
		this.leg4 = this.pig.getChild("leg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition pig = partdefinition.addOrReplaceChild("pig", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = pig.addOrReplaceChild("body", CubeListBuilder.create().texOffs(29, 8).addBox(-4.5F, -9.0F, -7.5F, 9.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.4F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(33, 38).addBox(-4.0F, 0.5F, -5.5F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition head = pig.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -4.0F, -8.0F, 8.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(16, 38).addBox(-4.0F, 2.0F, -4.0F, 8.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(16, 16).addBox(-2.0F, 0.0F, -9.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(24, 0).addBox(-4.0F, 2.0F, -8.0F, 8.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, -6.0F));

		PartDefinition fungus = head.addOrReplaceChild("fungus", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -4.0F));

		PartDefinition cube_r2 = fungus.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(52, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -2.0F, 1.0F, 0.1745F, -0.3491F, 0.3054F));

		PartDefinition cube_r3 = fungus.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(52, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 1.0F, -1.0F, 0.4363F, 0.3054F, 0.1309F));

		PartDefinition cube_r4 = fungus.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(52, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -2.0F, -3.0F, 0.2182F, 0.48F, -0.3054F));

		PartDefinition cube_r5 = fungus.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(52, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, -3.0F, 3.0F, -0.48F, 0.5236F, -0.3491F));

		PartDefinition cube_r6 = fungus.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -2.0F, -4.0F, 0.2618F, -0.5236F, 0.1745F));

		PartDefinition cube_r7 = fungus.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(52, 0).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 0.0F, 0.0F, -0.2182F, -0.3054F, -0.2618F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(20, 32).addBox(-4.0F, -1.0F, -3.9F, 8.0F, 2.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offset(0.0F, 3.0F, -4.0F));

		PartDefinition leg1 = pig.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(1, 47).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.4F, -6.0F, 5.75F));

		PartDefinition leg2 = pig.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(1, 37).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.4F, -6.0F, 5.75F));

		PartDefinition leg3 = pig.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(1, 17).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.9F, -6.0F, -5.0F));

		PartDefinition leg4 = pig.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(1, 27).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.9F, -6.0F, -5.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T  entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int alpha) {
		pig.render(poseStack, vertexConsumer, packedLight, packedOverlay, alpha);
	}
}