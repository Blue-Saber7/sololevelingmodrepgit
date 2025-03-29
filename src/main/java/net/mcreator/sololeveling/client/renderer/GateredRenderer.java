
package net.mcreator.sololeveling.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.sololeveling.entity.model.GateredModel;
import net.mcreator.sololeveling.entity.layer.GateredLayer;
import net.mcreator.sololeveling.entity.GateredEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GateredRenderer extends GeoEntityRenderer<GateredEntity> {
	public GateredRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GateredModel());
		this.shadowRadius = 0f;
		this.addRenderLayer(new GateredLayer(this));
	}

	@Override
	public RenderType getRenderType(GateredEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, GateredEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(GateredEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
