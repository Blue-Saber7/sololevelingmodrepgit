package net.mcreator.sololeveling.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.EntityJoinLevelEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.sololeveling.entity.GateredEntity;
import net.mcreator.sololeveling.SololevelingMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GateredoninitialspawnProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("sololeveling:gatered")))) {
			if (entity instanceof GateredEntity) {
				((GateredEntity) entity).setAnimation("animation.model.portalspinfast");
			}
			SololevelingMod.queueServerWork(80, () -> {
				if (entity instanceof GateredEntity) {
					((GateredEntity) entity).setAnimation("empty");
				}
			});
		}
	}
}
