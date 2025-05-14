package net.ropyxa.roprer.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.ropyxa.roprer.RopRer;
import net.ropyxa.roprer.block.RerMaterialsBlocks;

public class RerBlockStateProvider extends BlockStateProvider {
	 public RerBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper){
		  super(output, RopRer.MOD_ID, exFileHelper);
	 }

	 @Override
	 protected void registerStatesAndModels() {
		  blockWithItem(RerMaterialsBlocks.TIN_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_TIN_BLOCK);
		  blockWithItem(RerMaterialsBlocks.TIN_ORE);
		  blockWithItem(RerMaterialsBlocks.NETHERRACK_TIN_ORE);
		  blockWithItem(RerMaterialsBlocks.END_STONE_TIN_ORE);
		  blockWithItem(RerMaterialsBlocks.DEEPSLATE_TIN_ORE);
	 }

	 private void blockWithItem(DeferredBlock<?> deferredBlock) {
		  simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
	 }
}