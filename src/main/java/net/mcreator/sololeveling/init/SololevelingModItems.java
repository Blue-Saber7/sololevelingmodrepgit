
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sololeveling.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.sololeveling.SololevelingMod;

public class SololevelingModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SololevelingMod.MODID);
	public static final RegistryObject<Item> GATEBLUE_SPAWN_EGG = REGISTRY.register("gateblue_spawn_egg", () -> new ForgeSpawnEggItem(SololevelingModEntities.GATEBLUE, -16737844, -16711732, new Item.Properties()));
	public static final RegistryObject<Item> GATERED_SPAWN_EGG = REGISTRY.register("gatered_spawn_egg", () -> new ForgeSpawnEggItem(SololevelingModEntities.GATERED, -3407872, -3407719, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
