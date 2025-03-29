
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sololeveling.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.sololeveling.entity.GateredEntity;
import net.mcreator.sololeveling.entity.GateblueEntity;
import net.mcreator.sololeveling.SololevelingMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SololevelingModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, SololevelingMod.MODID);
	public static final RegistryObject<EntityType<GateblueEntity>> GATEBLUE = register("gateblue",
			EntityType.Builder.<GateblueEntity>of(GateblueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GateblueEntity::new)

					.sized(4.375f, 5.625f));
	public static final RegistryObject<EntityType<GateredEntity>> GATERED = register("gatered",
			EntityType.Builder.<GateredEntity>of(GateredEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GateredEntity::new)

					.sized(4.375f, 5.625f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GateblueEntity.init();
			GateredEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GATEBLUE.get(), GateblueEntity.createAttributes().build());
		event.put(GATERED.get(), GateredEntity.createAttributes().build());
	}
}
