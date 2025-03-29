package net.mcreator.sololeveling.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sololeveling.entity.GateredEntity;

public class GateredModel extends GeoModel<GateredEntity> {
	@Override
	public ResourceLocation getAnimationResource(GateredEntity entity) {
		return new ResourceLocation("sololeveling", "animations/gate_bluefix1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GateredEntity entity) {
		return new ResourceLocation("sololeveling", "geo/gate_bluefix1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GateredEntity entity) {
		return new ResourceLocation("sololeveling", "textures/entities/" + entity.getTexture() + ".png");
	}

}
