package net.ropyxa.roprer.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.ropyxa.roprer.RopRer;
import net.ropyxa.roprer.item.RerMaterials;

public class RerItemModelProvider extends ItemModelProvider {
	 public RerItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		  super(output, RopRer.MOD_ID, existingFileHelper);
	 }

	 @Override
	 protected void registerModels() {
		  basicItem(RerMaterials.TIN_INGOT.get());
		  basicItem(RerMaterials.RAW_TIN.get());
		  basicItem(RerMaterials.TIN_NUGGET.get());
		  basicItem(RerMaterials.TIN_PLATE.get());
		  basicItem(RerMaterials.TIN_LARGE_PLATE.get());
		  basicItem(RerMaterials.TIN_ROD.get());
		  basicItem(RerMaterials.TIN_WIRE.get());
		  basicItem(RerMaterials.TIN_GEAR.get());
		  basicItem(RerMaterials.TIN_DUST.get());
		  basicItem(RerMaterials.TIN_TINY_DUST.get());
		  basicItem(RerMaterials.TIN_RING.get());
		  basicItem(RerMaterials.TIN_BOLT.get());
		  basicItem(RerMaterials.TIN_DOUBLE_INGOT.get());
		  basicItem(RerMaterials.TIN_CURVED_PLATE.get());
		  basicItem(RerMaterials.CRUSHED_TIN_ORE.get());
		  basicItem(RerMaterials.TIN_CHUNK.get());
		  basicItem(RerMaterials.TIN_CLUSTER.get());
		  basicItem(RerMaterials.TIN_CRYSTAL.get());
		  basicItem(RerMaterials.TIN_SHARD.get());
		  basicItem(RerMaterials.TIN_CLUMP.get());
		  basicItem(RerMaterials.TIN_DIRTY_DUST.get());

		  basicItem(RerMaterials.APATITE_GEM.get());
		  basicItem(RerMaterials.APATITE_CLUSTER_SHARD.get());
	 }
}
