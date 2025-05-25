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

		  blockWithItem(RerMaterialsBlocks.COBALT_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_COBALT_BLOCK);
		  OreWithItem(RerMaterialsBlocks.COBALT_ORE, "stone","cobalt_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_COBALT_ORE, "netherrack","cobalt_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_COBALT_ORE, "end_stone","cobalt_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_COBALT_ORE, "deepslate","cobalt_ore");

		  blockWithItem(RerMaterialsBlocks.IRIDIUM_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_IRIDIUM_BLOCK);
		  OreWithItem(RerMaterialsBlocks.IRIDIUM_ORE, "stone","iridium_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_IRIDIUM_ORE, "netherrack","iridium_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_IRIDIUM_ORE, "end_stone","iridium_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_IRIDIUM_ORE, "deepslate","iridium_ore");

		  blockWithItem(RerMaterialsBlocks.LEAD_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_LEAD_BLOCK);
		  OreWithItem(RerMaterialsBlocks.LEAD_ORE, "stone","lead_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_LEAD_ORE, "netherrack","lead_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_LEAD_ORE, "end_stone","lead_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_LEAD_ORE, "deepslate","lead_ore");

		  blockWithItem(RerMaterialsBlocks.NICKEL_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_NICKEL_BLOCK);
		  OreWithItem(RerMaterialsBlocks.NICKEL_ORE, "stone","nickel_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_NICKEL_ORE, "netherrack","nickel_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_NICKEL_ORE, "end_stone","nickel_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_NICKEL_ORE, "deepslate","nickel_ore");

		  blockWithItem(RerMaterialsBlocks.OSMIUM_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_OSMIUM_BLOCK);
		  OreWithItem(RerMaterialsBlocks.OSMIUM_ORE, "stone","osmium_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_OSMIUM_ORE, "netherrack","osmium_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_OSMIUM_ORE, "end_stone","osmium_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_OSMIUM_ORE, "deepslate","osmium_ore");

		  blockWithItem(RerMaterialsBlocks.CARMINITE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.CARMINITE_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.CARMINITE_ORE, "stone","carminite_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_CARMINITE_ORE, "netherrack","carminite_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_CARMINITE_ORE, "end_stone","carminite_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_CARMINITE_ORE, "deepslate","carminite_ore");

		  blockWithItem(RerMaterialsBlocks.CERTUS_QUARTZ_BLOCK);
		  blockWithItem(RerMaterialsBlocks.CERTUS_QUARTZ_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.CERTUS_QUARTZ_ORE, "stone","certus_quartz_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_CERTUS_QUARTZ_ORE, "netherrack","certus_quartz_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_CERTUS_QUARTZ_ORE, "end_stone","certus_quartz_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE, "deepslate","certus_quartz_ore");

		  blockWithItem(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_BLOCK);
		  blockWithItem(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_ORE, "stone","charged_certus_quartz_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE, "netherrack","charged_certus_quartz_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_CHARGED_CERTUS_QUARTZ_ORE, "end_stone","charged_certus_quartz_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE, "deepslate","charged_certus_quartz_ore");

		  blockWithItem(RerMaterialsBlocks.CHAROITE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.CHAROITE_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.CHAROITE_ORE, "stone","charoite_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_CHAROITE_ORE, "netherrack","charoite_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_CHAROITE_ORE, "end_stone","charoite_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_CHAROITE_ORE, "deepslate","charoite_ore");

		  blockWithItem(RerMaterialsBlocks.BRASS_BLOCK);
		  blockWithItem(RerMaterialsBlocks.BRONZE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.CAST_IRON_BLOCK);
		  blockWithItem(RerMaterialsBlocks.SOUL_STEEL_BLOCK);
		  blockWithItem(RerMaterialsBlocks.STEEL_BLOCK);
		  blockWithItem(RerMaterialsBlocks.ENDERIUM_BLOCK);
		  blockWithItem(RerMaterialsBlocks.ELECTRUM_BLOCK);
		  blockWithItem(RerMaterialsBlocks.LUMIUM_BLOCK);
		  blockWithItem(RerMaterialsBlocks.FIERY_BLOCK);

		  blockWithItem(RerMaterialsBlocks.APATITE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.APATITE_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.APATITE_ORE, "stone","apatite_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_APATITE_ORE, "netherrack","apatite_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_APATITE_ORE, "end_stone","apatite_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE, "deepslate","apatite_ore");

		  blockWithItem(RerMaterialsBlocks.CINNABAR_BLOCK);
		  blockWithItem(RerMaterialsBlocks.CINNABAR_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.CINNABAR_ORE, "stone","cinnabar_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE, "netherrack","cinnabar_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_CINNABAR_ORE, "end_stone","cinnabar_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE, "deepslate","cinnabar_ore");

		  blockWithItem(RerMaterialsBlocks.ALUMINUM_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_ALUMINUM_BLOCK);
		  OreWithItem(RerMaterialsBlocks.ALUMINUM_ORE, "stone","aluminum_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_ALUMINUM_ORE, "netherrack","aluminum_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_ALUMINUM_ORE, "end_stone","aluminum_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_ALUMINUM_ORE, "deepslate","aluminum_ore");

		  blockWithItem(RerMaterialsBlocks.AQUITE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.AQUITE_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.AQUITE_ORE, "stone","aquite_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_AQUITE_ORE, "netherrack","aquite_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_AQUITE_ORE, "end_stone","aquite_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_AQUITE_ORE, "deepslate","aquite_ore");

		  blockWithItem(RerMaterialsBlocks.BITUMEN_BLOCK);
		  blockWithItem(RerMaterialsBlocks.BITUMEN_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.BITUMEN_ORE, "stone","bitumen_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_BITUMEN_ORE, "netherrack","bitumen_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_BITUMEN_ORE, "end_stone","bitumen_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_BITUMEN_ORE, "deepslate","bitumen_ore");

		  blockWithItem(RerMaterialsBlocks.ARCANE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.ARCANE_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.ARCANE_ORE, "stone","arcane_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_ARCANE_ORE, "netherrack","arcane_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_ARCANE_ORE, "end_stone","arcane_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_ARCANE_ORE, "deepslate","arcane_ore");
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