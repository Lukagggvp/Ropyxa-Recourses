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
	 }
}
