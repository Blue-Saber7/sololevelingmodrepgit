package net.mcreator.sololeveling.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.sololeveling.entity.GateblueEntity;

public class GateblueModel extends GeoModel<GateblueEntity> {
	@Override
	public ResourceLocation getAnimationResource(GateblueEntity entity) {
		return new ResourceLocation("sololeveling", "animations/gate_bluefix1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GateblueEntity entity) {
		return new ResourceLocation("sololeveling", "geo/gate_bluefix1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GateblueEntity entity) {
		return new ResourceLocation("sololeveling", "textures/entities/" + entity.getTexture() + ".png");
	}

}
