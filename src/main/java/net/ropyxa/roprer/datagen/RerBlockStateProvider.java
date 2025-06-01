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
		  blockWithItem(RerMaterialsBlocks.SIGNALUM_BLOCK);
		  blockWithItem(RerMaterialsBlocks.INVAR_BLOCK);
		  blockWithItem(RerMaterialsBlocks.GRAPHITE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.CONSTANTAN_BLOCK);
		  blockWithItem(RerMaterialsBlocks.REFINED_OBSIDIAN_BLOCK);
		  blockWithItem(RerMaterialsBlocks.REFINED_GLOWSTONE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.ORICHALCUM_BLOCK);
		  blockWithItem(RerMaterialsBlocks.ROSE_GOLD_BLOCK);
		  blockWithItem(RerMaterialsBlocks.KNIGHTMETAL_BLOCK);
		  blockWithItem(RerMaterialsBlocks.SKY_BLOCK);
		  blockWithItem(RerMaterialsBlocks.IRONWOOD_BLOCK);
		  blockWithItem(RerMaterialsBlocks.TAINED_GOLD_BLOCK);
		  blockWithItem(RerMaterialsBlocks.INFUSED_IRON_BLOCK);

		  blockWithItem(RerMaterialsBlocks.APATITE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.APATITE_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.APATITE_ORE, "stone","apatite_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_APATITE_ORE, "netherrack","apatite_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_APATITE_ORE, "end_stone","apatite_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE, "deepslate","apatite_ore");

		  blockWithItem(RerMaterialsBlocks.UTHERIUM_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_UTHERIUM_BLOCK);
		  OreWithItem(RerMaterialsBlocks.UTHERIUM_ORE, "stone","utherium_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_UTHERIUM_ORE, "netherrack","utherium_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_UTHERIUM_ORE, "end_stone","utherium_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_UTHERIUM_ORE, "deepslate","utherium_ore");

		  blockWithItem(RerMaterialsBlocks.THALLASIUM_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_THALLASIUM_BLOCK);
		  OreWithItem(RerMaterialsBlocks.THALLASIUM_ORE, "stone","thallasium_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_THALLASIUM_ORE, "netherrack","thallasium_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_THALLASIUM_ORE, "end_stone","thallasium_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_THALLASIUM_ORE, "deepslate","thallasium_ore");

		  blockWithItem(RerMaterialsBlocks.NEBU_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_NEBU_BLOCK);
		  OreWithItem(RerMaterialsBlocks.NEBU_ORE, "stone","nebu_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_NEBU_ORE, "netherrack","nebu_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_NEBU_ORE, "end_stone","nebu_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_NEBU_ORE, "deepslate","nebu_ore");

		  blockWithItem(RerMaterialsBlocks.FALSITE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_FALSITE_BLOCK);
		  OreWithItem(RerMaterialsBlocks.FALSITE_ORE, "stone","falsite_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_FALSITE_ORE, "netherrack","falsite_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_FALSITE_ORE, "end_stone","falsite_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_FALSITE_ORE, "deepslate","falsite_ore");

		  blockWithItem(RerMaterialsBlocks.HORIZONITE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_HORIZONITE_BLOCK);
		  OreWithItem(RerMaterialsBlocks.HORIZONITE_ORE, "stone","horizonite_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_HORIZONITE_ORE, "netherrack","horizonite_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_HORIZONITE_ORE, "end_stone","horizonite_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_HORIZONITE_ORE, "deepslate","horizonite_ore");

		  blockWithItem(RerMaterialsBlocks.IESNIUM_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_IESNIUM_BLOCK);
		  OreWithItem(RerMaterialsBlocks.IESNIUM_ORE, "stone","iesnium_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_IESNIUM_ORE, "netherrack","iesnium_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_IESNIUM_ORE, "end_stone","iesnium_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_IESNIUM_ORE, "deepslate","iesnium_ore");

		  blockWithItem(RerMaterialsBlocks.PLATINUM_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_PLATINUM_BLOCK);
		  OreWithItem(RerMaterialsBlocks.PLATINUM_ORE, "stone","platinum_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_PLATINUM_ORE, "netherrack","platinum_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_PLATINUM_ORE, "end_stone","platinum_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_PLATINUM_ORE, "deepslate","platinum_ore");

		  blockWithItem(RerMaterialsBlocks.SAPPHIRE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.SAPPHIRE_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.SAPPHIRE_ORE, "stone","sapphire_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_SAPPHIRE_ORE, "netherrack","sapphire_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_SAPPHIRE_ORE, "end_stone","sapphire_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_SAPPHIRE_ORE, "deepslate","sapphire_ore");

		  blockWithItem(RerMaterialsBlocks.DIMENSIONAL_BLOCK);
		  blockWithItem(RerMaterialsBlocks.DIMENSIONAL_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.DIMENSIONAL_ORE, "stone","dimensional_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_DIMENSIONAL_ORE, "netherrack","dimensional_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_DIMENSIONAL_ORE, "end_stone","dimensional_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_DIMENSIONAL_ORE, "deepslate","dimensional_ore");

		  blockWithItem(RerMaterialsBlocks.MOONSTONE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.MOONSTONE_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.MOONSTONE_ORE, "stone","moonstone_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_MOONSTONE_ORE, "netherrack","moonstone_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_MOONSTONE_ORE, "end_stone","moonstone_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_MOONSTONE_ORE, "deepslate","moonstone_ore");

		  blockWithItem(RerMaterialsBlocks.PERIDOT_BLOCK);
		  blockWithItem(RerMaterialsBlocks.PERIDOT_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.PERIDOT_ORE, "stone","peridot_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_PERIDOT_ORE, "netherrack","peridot_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_PERIDOT_ORE, "end_stone","peridot_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_PERIDOT_ORE, "deepslate","peridot_ore");

		  blockWithItem(RerMaterialsBlocks.PYROPE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.PYROPE_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.PYROPE_ORE, "stone","pyrope_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_PYROPE_ORE, "netherrack","pyrope_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_PYROPE_ORE, "end_stone","pyrope_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_PYROPE_ORE, "deepslate","pyrope_ore");

		  blockWithItem(RerMaterialsBlocks.URANIUM_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_URANIUM_BLOCK);
		  OreWithItem(RerMaterialsBlocks.URANIUM_ORE, "stone","uranium_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_URANIUM_ORE, "netherrack","uranium_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_URANIUM_ORE, "end_stone","uranium_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_URANIUM_ORE, "deepslate","uranium_ore");

		  blockWithItem(RerMaterialsBlocks.SILVER_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_SILVER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.SILVER_ORE, "stone","silver_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_SILVER_ORE, "netherrack","silver_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_SILVER_ORE, "end_stone","silver_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_SILVER_ORE, "deepslate","silver_ore");

		  blockWithItem(RerMaterialsBlocks.TITANIUM_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_TITANIUM_BLOCK);
		  OreWithItem(RerMaterialsBlocks.TITANIUM_ORE, "stone","titanium_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_TITANIUM_ORE, "netherrack","titanium_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_TITANIUM_ORE, "end_stone","titanium_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_TITANIUM_ORE, "deepslate","titanium_ore");

		  blockWithItem(RerMaterialsBlocks.ZINC_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_ZINC_BLOCK);
		  OreWithItem(RerMaterialsBlocks.ZINC_ORE, "stone","zinc_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_ZINC_ORE, "netherrack","zinc_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_ZINC_ORE, "end_stone","zinc_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_ZINC_ORE, "deepslate","zinc_ore");

		  blockWithItem(RerMaterialsBlocks.TUNGSTEN_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_TUNGSTEN_BLOCK);
		  OreWithItem(RerMaterialsBlocks.TUNGSTEN_ORE, "stone","tungsten_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_TUNGSTEN_ORE, "netherrack","tungsten_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_TUNGSTEN_ORE, "end_stone","tungsten_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_TUNGSTEN_ORE, "deepslate","tungsten_ore");

		  blockWithItem(RerMaterialsBlocks.VENTIUM_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_VENTIUM_BLOCK);
		  OreWithItem(RerMaterialsBlocks.VENTIUM_ORE, "stone","ventium_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_VENTIUM_ORE, "netherrack","ventium_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_VENTIUM_ORE, "end_stone","ventium_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_VENTIUM_ORE, "deepslate","ventium_ore");

		  blockWithItem(RerMaterialsBlocks.REGALIUM_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_REGALIUM_BLOCK);
		  OreWithItem(RerMaterialsBlocks.REGALIUM_ORE, "stone","regalium_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_REGALIUM_ORE, "netherrack","regalium_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_REGALIUM_ORE, "end_stone","regalium_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_REGALIUM_ORE, "deepslate","regalium_ore");

		  blockWithItem(RerMaterialsBlocks.FROSTSTEEL_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_FROSTSTEEL_BLOCK);
		  OreWithItem(RerMaterialsBlocks.FROSTSTEEL_ORE, "stone","froststeel_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_FROSTSTEEL_ORE, "netherrack","froststeel_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_FROSTSTEEL_ORE, "end_stone","froststeel_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_FROSTSTEEL_ORE, "deepslate","froststeel_ore");

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

		  blockWithItem(RerMaterialsBlocks.DIOPSIDE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.DIOPSIDE_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.DIOPSIDE_ORE, "stone","diopside_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_DIOPSIDE_ORE, "netherrack","diopside_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_DIOPSIDE_ORE, "end_stone","diopside_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_DIOPSIDE_ORE, "deepslate","diopside_ore");

		  blockWithItem(RerMaterialsBlocks.CLOGGRUM_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RAW_CLOGGRUM_BLOCK);
		  OreWithItem(RerMaterialsBlocks.CLOGGRUM_ORE, "stone","cloggrum_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_CLOGGRUM_ORE, "netherrack","cloggrum_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_CLOGGRUM_ORE, "end_stone","cloggrum_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_CLOGGRUM_ORE, "deepslate","cloggrum_ore");

		  blockWithItem(RerMaterialsBlocks.SULFUR_BLOCK);
		  blockWithItem(RerMaterialsBlocks.SULFUR_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.SULFUR_ORE, "stone","sulfur_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_SULFUR_ORE, "netherrack","sulfur_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_SULFUR_ORE, "end_stone","sulfur_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_SULFUR_ORE, "deepslate","sulfur_ore");

		  blockWithItem(RerMaterialsBlocks.RUBY_BLOCK);
		  blockWithItem(RerMaterialsBlocks.RUBY_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.RUBY_ORE, "stone","ruby_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_RUBY_ORE, "netherrack","ruby_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_RUBY_ORE, "end_stone","ruby_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_RUBY_ORE, "deepslate","ruby_ore");

		  blockWithItem(RerMaterialsBlocks.POTASSIUM_NITRATE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.POTASSIUM_NITRATE_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.POTASSIUM_NITRATE_ORE, "stone","potassium_nitrate_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_POTASSIUM_NITRATE_ORE, "netherrack","potassium_nitrate_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_POTASSIUM_NITRATE_ORE, "end_stone","potassium_nitrate_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_POTASSIUM_NITRATE_ORE, "deepslate","potassium_nitrate_ore");

		  blockWithItem(RerMaterialsBlocks.FLUORITE_BLOCK);
		  blockWithItem(RerMaterialsBlocks.FLUORITE_CLUSTER_BLOCK);
		  OreWithItem(RerMaterialsBlocks.FLUORITE_ORE, "stone","fluorite_ore");
		  OreWithItem(RerMaterialsBlocks.NETHERRACK_FLUORITE_ORE, "netherrack","fluorite_ore");
		  OreWithItem(RerMaterialsBlocks.END_STONE_FLUORITE_ORE, "end_stone","fluorite_ore");
		  OreWithItem(RerMaterialsBlocks.DEEPSLATE_FLUORITE_ORE, "deepslate","fluorite_ore");
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