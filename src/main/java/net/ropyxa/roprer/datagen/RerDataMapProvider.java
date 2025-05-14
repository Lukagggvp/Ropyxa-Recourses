package net.ropyxa.roprer.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.FurnaceFuel;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.ropyxa.roprer.item.RerMaterials;

import java.util.concurrent.CompletableFuture;

public class RerDataMapProvider extends DataMapProvider {
	 protected RerDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
		  super(packOutput, lookupProvider);
	 }

	 @Override
	 protected void gather(HolderLookup.Provider provider) {
		  this.builder(NeoForgeDataMaps.FURNACE_FUELS)
					 .add(RerMaterials.TIN_INGOT.getId(), new FurnaceFuel(12000), false);
	 }
}