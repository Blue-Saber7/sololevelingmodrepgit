
package net.mcreator.sololeveling.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.sololeveling.entity.model.GateblueModel;
import net.mcreator.sololeveling.entity.layer.GateblueLayer;
import net.mcreator.sololeveling.entity.GateblueEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GateblueRenderer extends GeoEntityRenderer<GateblueEntity> {
	public GateblueRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GateblueModel());
		this.shadowRadius = 0.8f;
		this.addRenderLayer(new GateblueLayer(this));
	}

	@Override
	public RenderType getRenderType(GateblueEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, GateblueEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(GateblueEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
