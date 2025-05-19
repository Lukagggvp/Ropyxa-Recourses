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

		  basicItem(RerMaterials.COBALT_INGOT.get());
		  basicItem(RerMaterials.RAW_COBALT.get());
		  basicItem(RerMaterials.COBALT_NUGGET.get());
		  basicItem(RerMaterials.COBALT_PLATE.get());
		  basicItem(RerMaterials.COBALT_LARGE_PLATE.get());
		  basicItem(RerMaterials.COBALT_ROD.get());
		  basicItem(RerMaterials.COBALT_WIRE.get());
		  basicItem(RerMaterials.COBALT_GEAR.get());
		  basicItem(RerMaterials.COBALT_DUST.get());
		  basicItem(RerMaterials.COBALT_TINY_DUST.get());
		  basicItem(RerMaterials.COBALT_BOLT.get());
		  basicItem(RerMaterials.COBALT_DOUBLE_INGOT.get());
		  basicItem(RerMaterials.COBALT_CURVED_PLATE.get());
		  basicItem(RerMaterials.CRUSHED_COBALT_ORE.get());
		  basicItem(RerMaterials.COBALT_CHUNK.get());
		  basicItem(RerMaterials.COBALT_CLUSTER.get());
		  basicItem(RerMaterials.COBALT_CRYSTAL.get());
		  basicItem(RerMaterials.COBALT_SHARD.get());
		  basicItem(RerMaterials.COBALT_CLUMP.get());
		  basicItem(RerMaterials.COBALT_DIRTY_DUST.get());
		  basicItem(RerMaterials.COBALT_RING.get());

		  basicItem(RerMaterials.APATITE_GEM.get());
		  basicItem(RerMaterials.APATITE_CLUSTER_SHARD.get());
		  basicItem(RerMaterials.APATITE_FRAGMENT.get());
		  basicItem(RerMaterials.APATITE_PLATE.get());
		  basicItem(RerMaterials.APATITE_LARGE_PLATE.get());
		  basicItem(RerMaterials.APATITE_ROD.get());
		  basicItem(RerMaterials.APATITE_WIRE.get());
		  basicItem(RerMaterials.APATITE_GEAR.get());
		  basicItem(RerMaterials.APATITE_DUST.get());
		  basicItem(RerMaterials.APATITE_TINY_DUST.get());
		  basicItem(RerMaterials.APATITE_RING.get());
		  basicItem(RerMaterials.APATITE_BOLT.get());
		  basicItem(RerMaterials.APATITE_DOUBLE_GEM.get());
		  basicItem(RerMaterials.APATITE_CURVED_PLATE.get());
		  basicItem(RerMaterials.CRUSHED_APATITE_ORE.get());
		  basicItem(RerMaterials.APATITE_CHUNK.get());
		  basicItem(RerMaterials.APATITE_CLUSTER.get());
		  basicItem(RerMaterials.APATITE_CRYSTAL.get());
		  basicItem(RerMaterials.APATITE_SHARD.get());
		  basicItem(RerMaterials.APATITE_CLUMP.get());
		  basicItem(RerMaterials.APATITE_DIRTY_DUST.get());

		  basicItem(RerMaterials.CINNABAR_GEM.get());
		  basicItem(RerMaterials.CINNABAR_CLUSTER_SHARD.get());
		  basicItem(RerMaterials.CINNABAR_FRAGMENT.get());
		  basicItem(RerMaterials.CINNABAR_PLATE.get());
		  basicItem(RerMaterials.CINNABAR_LARGE_PLATE.get());
		  basicItem(RerMaterials.CINNABAR_ROD.get());
		  basicItem(RerMaterials.CINNABAR_WIRE.get());
		  basicItem(RerMaterials.CINNABAR_GEAR.get());
		  basicItem(RerMaterials.CINNABAR_DUST.get());
		  basicItem(RerMaterials.CINNABAR_TINY_DUST.get());
		  basicItem(RerMaterials.CINNABAR_BOLT.get());
		  basicItem(RerMaterials.CINNABAR_DOUBLE_GEM.get());
		  basicItem(RerMaterials.CINNABAR_CURVED_PLATE.get());
		  basicItem(RerMaterials.CRUSHED_CINNABAR_ORE.get());
		  basicItem(RerMaterials.CINNABAR_CHUNK.get());
		  basicItem(RerMaterials.CINNABAR_CLUSTER.get());
		  basicItem(RerMaterials.CINNABAR_CRYSTAL.get());
		  basicItem(RerMaterials.CINNABAR_SHARD.get());
		  basicItem(RerMaterials.CINNABAR_CLUMP.get());
		  basicItem(RerMaterials.CINNABAR_DIRTY_DUST.get());
		  basicItem(RerMaterials.CINNABAR_RING.get());
	 }
}
