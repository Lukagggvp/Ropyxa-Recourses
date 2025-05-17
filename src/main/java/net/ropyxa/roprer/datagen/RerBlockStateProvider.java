package net.ropyxa.roprer.datagen;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.ItemDisplayContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.client.model.generators.loaders.CompositeModelBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.ropyxa.roprer.RopRer;
import net.ropyxa.roprer.block.RerMaterialsBlocks;

import java.util.HashMap;
import java.util.Map;

public class RerBlockStateProvider extends BlockStateProvider {
	 public RerBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper){
		  super(output, RopRer.MOD_ID, exFileHelper);
	 }

	 @Override
	 protected void registerStatesAndModels() {
		  blockWithItem(RerMaterialsBlocks.TIN_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_TIN_BLOCK);
		  OreWithItem(RerMaterialsBlocks.TIN_ORE, "stone","tin_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_TIN_ORE, "netherrack","tin_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_TIN_ORE, "end_stone","tin_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_TIN_ORE, "deepslate","tin_ore");

		  blockWithItem(RerMaterialsBlocks.APATITE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.APATITE_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.APATITE_ORE, "stone","apatite_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_APATITE_ORE, "netherrack","apatite_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_APATITE_ORE, "end_stone","apatite_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE, "deepslate","apatite_ore");
	 }

	 private void blockWithItem(DeferredBlock<?> deferredBlock) {
		  simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
	 }

	 private void OreWithItem(DeferredBlock<?> block, String baseType, String textureName) {
		  String path = block.getId().getPath();

		  BlockModelBuilder baseModel = models()
					 .nested().parent(new ModelFile.UncheckedModelFile(mcLoc("block/block")))
					 .renderType("solid")
					 .texture("base", mcLoc("block/" + baseType))
					 .element()
					 .from(0, 0, 0)
					 .to(16, 16, 16)
					 .cube("#base")
					 .allFaces((dir, uv) -> uv.tintindex(-1))
					 .end();

		  BlockModelBuilder overlayModel = models()
					 .nested().parent(new ModelFile.UncheckedModelFile(mcLoc("block/block")))
					 .renderType("translucent")
					 .texture("overlay", modLoc("block/" +textureName))
					 .element()
					 .from(0, 0, 0)
					 .to(16, 16, 16)
					 .cube("#overlay")
					 .allFaces((dir, uv) -> uv.tintindex(-1))
					 .end();

		  ModelFile model = models().getBuilder(path)
					 .texture("particle", mcLoc("block/" + baseType))
					 .transforms()
					 .transform(ItemDisplayContext.THIRD_PERSON_LEFT_HAND)
					 .rotation(75F, 45F, 0F)
					 .translation(0F, 2.5F, 0)
					 .scale(0.375F, 0.375F, 0.375F)
					 .end()
					 .transform(ItemDisplayContext.THIRD_PERSON_RIGHT_HAND)
					 .rotation(75F, 45F, 0F)
					 .translation(0F, 2.5F, 0)
					 .scale(0.375F, 0.375F, 0.375F)
					 .end()
					 .transform(ItemDisplayContext.FIRST_PERSON_LEFT_HAND)
					 .rotation(0F, 225F, 0F)
					 .translation(0F, 0F, 0)
					 .scale(0.4F, 0.4F, 0.4F)
					 .end()
					 .transform(ItemDisplayContext.FIRST_PERSON_RIGHT_HAND)
					 .rotation(0F, 45F, 0F)
					 .translation(0F, 0F, 0)
					 .scale(0.4F, 0.4F, 0.4F)
					 .end()
					 .transform(ItemDisplayContext.GUI)
					 .rotation(30F, 225F, 0F)
					 .translation(0F, 0F, 0)
					 .scale(0.625F, 0.625F, 0.625F)
					 .end()
					 .transform(ItemDisplayContext.GROUND)
					 .rotation(0F, 0F, 0F)
					 .translation(0F, 3F, 0F)
					 .scale(0.25F, 0.25F, 0.25F)
					 .end()
					 .transform(ItemDisplayContext.FIXED)
					 .rotation(0F, 0F, 0F)
					 .translation(0F, 0F, 0F)
					 .scale(0.5F, 0.5F, 0.5F)
					 .end()
					 .end()
					 .customLoader(CompositeModelBuilder::begin)
					 .child("overlay", overlayModel)
					 .child("base", baseModel)
					 .itemRenderOrder("base", "overlay")
					 .end();

		  simpleBlockWithItem(block.get(), model);
	 }
}