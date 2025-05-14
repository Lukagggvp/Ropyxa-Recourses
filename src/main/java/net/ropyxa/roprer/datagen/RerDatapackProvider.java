package net.ropyxa.roprer.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.ropyxa.roprer.RopRer;
import net.ropyxa.roprer.worldgen.RerBiomeModifiers;
import net.ropyxa.roprer.worldgen.RerConfiguredFeatures;
import net.ropyxa.roprer.worldgen.RerPlacedFeatures;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class RerDatapackProvider extends DatapackBuiltinEntriesProvider {
	 public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
				.add(Registries.CONFIGURED_FEATURE, RerConfiguredFeatures::bootstrap)
				.add(Registries.PLACED_FEATURE, RerPlacedFeatures::bootstrap)
				.add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, RerBiomeModifiers::bootstrap);


	 public RerDatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
		  super(output, registries, BUILDER, Set.of(RopRer.MOD_ID));
	 }
}