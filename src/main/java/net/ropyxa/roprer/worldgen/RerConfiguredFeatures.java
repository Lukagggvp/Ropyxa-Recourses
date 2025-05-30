package net.ropyxa.roprer.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.ropyxa.roprer.RopRer;
import net.ropyxa.roprer.block.RerMaterialsBlocks;

import java.util.List;

public class RerConfiguredFeatures {

	 public static final ResourceKey<ConfiguredFeature<?, ?>> TIN_ORE_KEY = registerKey("tin_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_TIN_ORE_KEY = registerKey("netherrack_tin_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_TIN_ORE_KEY = registerKey("end_stone_tin_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> COBALT_ORE_KEY = registerKey("cobalt_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_COBALT_ORE_KEY = registerKey("netherrack_cobalt_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_COBALT_ORE_KEY = registerKey("end_stone_cobalt_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> BITUMEN_ORE_KEY = registerKey("bitumen_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_BITUMEN_ORE_KEY = registerKey("netherrack_bitumen_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_BITUMEN_ORE_KEY = registerKey("end_stone_bitumen_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> AQUITE_ORE_KEY = registerKey("aquite_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_AQUITE_ORE_KEY = registerKey("netherrack_aquite_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_AQUITE_ORE_KEY = registerKey("end_stone_aquite_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> IRIDIUM_ORE_KEY = registerKey("iridium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_IRIDIUM_ORE_KEY = registerKey("netherrack_iridium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_IRIDIUM_ORE_KEY = registerKey("end_stone_iridium_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> LEAD_ORE_KEY = registerKey("lead_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_LEAD_ORE_KEY = registerKey("netherrack_lead_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_LEAD_ORE_KEY = registerKey("end_stone_lead_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> CARMINITE_ORE_KEY = registerKey("carminite_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_CARMINITE_ORE_KEY = registerKey("netherrack_carminite_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_CARMINITE_ORE_KEY = registerKey("end_stone_carminite_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> CERTUS_QUARTZ_ORE_KEY = registerKey("certus_quartz_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_CERTUS_QUARTZ_ORE_KEY = registerKey("netherrack_certus_quartz_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_CERTUS_QUARTZ_ORE_KEY = registerKey("end_stone_certus_quartz_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> CHARGED_CERTUS_QUARTZ_ORE_KEY = registerKey("charged_certus_quartz_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE_KEY = registerKey("netherrack_charged_certus_quartz_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_CHARGED_CERTUS_QUARTZ_ORE_KEY = registerKey("end_stone_charged_certus_quartz_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> CHAROITE_ORE_KEY = registerKey("charoite_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_CHAROITE_ORE_KEY = registerKey("netherrack_charoite_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_CHAROITE_ORE_KEY = registerKey("end_stone_charoite_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> NICKEL_ORE_KEY = registerKey("nickel_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_NICKEL_ORE_KEY = registerKey("netherrack_nickel_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_NICKEL_ORE_KEY = registerKey("end_stone_nickel_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> OSMIUM_ORE_KEY = registerKey("osmium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_OSMIUM_ORE_KEY = registerKey("netherrack_osmium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_OSMIUM_ORE_KEY = registerKey("end_stone_osmium_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> ARCANE_ORE_KEY = registerKey("arcane_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_ARCANE_ORE_KEY = registerKey("netherrack_arcane_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_ARCANE_ORE_KEY = registerKey("end_stone_arcane_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> ALUMINUM_ORE_KEY = registerKey("aluminum_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_ALUMINUM_ORE_KEY = registerKey("netherrack_aluminum_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_ALUMINUM_ORE_KEY = registerKey("end_stone_aluminum_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> APATITE_ORE_KEY = registerKey("apatite_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_APATITE_ORE_KEY = registerKey("netherrack_apatite_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_APATITE_ORE_KEY = registerKey("end_stone_apatite_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> CINNABAR_ORE_KEY = registerKey("cinnabar_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_CINNABAR_ORE_KEY = registerKey("netherrack_cinnabar_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_CINNABAR_ORE_KEY = registerKey("end_stone_cinnabar_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> UTHERIUM_ORE_KEY = registerKey("utherium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_UTHERIUM_ORE_KEY = registerKey("netherrack_utherium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_UTHERIUM_ORE_KEY = registerKey("end_stone_utherium_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> THALLASIUM_ORE_KEY = registerKey("thallasium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_THALLASIUM_ORE_KEY = registerKey("netherrack_thallasium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_THALLASIUM_ORE_KEY = registerKey("end_stone_thallasium_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> NEBU_ORE_KEY = registerKey("nebu_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_NEBU_ORE_KEY = registerKey("netherrack_nebu_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_NEBU_ORE_KEY = registerKey("end_stone_nebu_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> REGALIUM_ORE_KEY = registerKey("regalium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_REGALIUM_ORE_KEY = registerKey("netherrack_regalium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_REGALIUM_ORE_KEY = registerKey("end_stone_regalium_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> FROSTSTEEL_ORE_KEY = registerKey("froststeel_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_FROSTSTEEL_ORE_KEY = registerKey("netherrack_froststeel_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_FROSTSTEEL_ORE_KEY = registerKey("end_stone_froststeel_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> VENTIUM_ORE_KEY = registerKey("ventium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_VENTIUM_ORE_KEY = registerKey("netherrack_ventium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_VENTIUM_ORE_KEY = registerKey("end_stone_ventium_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> TUNGSTEN_ORE_KEY = registerKey("tungsten_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_TUNGSTEN_ORE_KEY = registerKey("netherrack_tungsten_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_TUNGSTEN_ORE_KEY = registerKey("end_stone_tungsten_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> IESNIUM_ORE_KEY = registerKey("iesnium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_IESNIUM_ORE_KEY = registerKey("netherrack_iesnium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_IESNIUM_ORE_KEY = registerKey("end_stone_iesnium_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> HORIZONITE_ORE_KEY = registerKey("horizonite_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_HORIZONITE_ORE_KEY = registerKey("netherrack_horizonite_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_HORIZONITE_ORE_KEY = registerKey("end_stone_horizonite_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> FALSITE_ORE_KEY = registerKey("falsite_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_FALSITE_ORE_KEY = registerKey("netherrack_falsite_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_FALSITE_ORE_KEY = registerKey("end_stone_falsite_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> PLATINUM_ORE_KEY = registerKey("platinum_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_PLATINUM_ORE_KEY = registerKey("netherrack_platinum_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_PLATINUM_ORE_KEY = registerKey("end_stone_platinum_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> URANIUM_ORE_KEY = registerKey("uranium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_URANIUM_ORE_KEY = registerKey("netherrack_uranium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_URANIUM_ORE_KEY = registerKey("end_stone_uranium_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> SILVER_ORE_KEY = registerKey("silver_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_SILVER_ORE_KEY = registerKey("netherrack_silver_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_SILVER_ORE_KEY = registerKey("end_stone_silver_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> TITANIUM_ORE_KEY = registerKey("titanium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_TITANIUM_ORE_KEY = registerKey("netherrack_titanium_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_TITANIUM_ORE_KEY = registerKey("end_stone_titanium_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> ZINC_ORE_KEY = registerKey("zinc_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_ZINC_ORE_KEY = registerKey("netherrack_zinc_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_ZINC_ORE_KEY = registerKey("end_stone_zinc_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_SAPPHIRE_ORE_KEY = registerKey("netherrack_sapphire_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_SAPPHIRE_ORE_KEY = registerKey("end_stone_sapphire_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> DIMENSIONAL_ORE_KEY = registerKey("dimensional_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_DIMENSIONAL_ORE_KEY = registerKey("netherrack_dimensional_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_DIMENSIONAL_ORE_KEY = registerKey("end_stone_dimensional_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> MOONSTONE_ORE_KEY = registerKey("moonstone_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_MOONSTONE_ORE_KEY = registerKey("netherrack_moonstone_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_MOONSTONE_ORE_KEY = registerKey("end_stone_moonstone_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> PERIDOT_ORE_KEY = registerKey("peridot_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_PERIDOT_ORE_KEY = registerKey("netherrack_peridot_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_PERIDOT_ORE_KEY = registerKey("end_stone_peridot_ore");

	 public static final ResourceKey<ConfiguredFeature<?, ?>> PYROPE_ORE_KEY = registerKey("pyrope_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> NETHERRACK_PYROPE_ORE_KEY = registerKey("netherrack_pyrope_ore");
	 public static final ResourceKey<ConfiguredFeature<?, ?>> END_STONE_PYROPE_ORE_KEY = registerKey("end_stone_pyrope_ore");

	 public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
		  RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
		  RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
		  RuleTest end_stoneReplaceables = new BlockMatchTest(Blocks.END_STONE);
		  RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

		  List<OreConfiguration.TargetBlockState> SapphireOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()));

		  register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(SapphireOre, 9));
		  register(context, NETHERRACK_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_SAPPHIRE_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_SAPPHIRE_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> DimensionalOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.DIMENSIONAL_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_DIMENSIONAL_ORE.get().defaultBlockState()));

		  register(context, DIMENSIONAL_ORE_KEY, Feature.ORE, new OreConfiguration(DimensionalOre, 9));
		  register(context, NETHERRACK_DIMENSIONAL_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_DIMENSIONAL_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_DIMENSIONAL_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_DIMENSIONAL_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> MoonstoneOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.MOONSTONE_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_MOONSTONE_ORE.get().defaultBlockState()));

		  register(context, MOONSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(MoonstoneOre, 9));
		  register(context, NETHERRACK_MOONSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_MOONSTONE_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_MOONSTONE_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_MOONSTONE_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> PeridotOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.PERIDOT_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_PERIDOT_ORE.get().defaultBlockState()));

		  register(context, PERIDOT_ORE_KEY, Feature.ORE, new OreConfiguration(PeridotOre, 9));
		  register(context, NETHERRACK_PERIDOT_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_PERIDOT_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_PERIDOT_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_PERIDOT_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> PyropeOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.PYROPE_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_PYROPE_ORE.get().defaultBlockState()));

		  register(context, PYROPE_ORE_KEY, Feature.ORE, new OreConfiguration(PyropeOre, 9));
		  register(context, NETHERRACK_PYROPE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_PYROPE_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_PYROPE_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_PYROPE_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> TinOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.TIN_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState()));

		  register(context, TIN_ORE_KEY, Feature.ORE, new OreConfiguration(TinOre, 9));
		  register(context, NETHERRACK_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_TIN_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_TIN_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_TIN_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> CobaltOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.COBALT_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_COBALT_ORE.get().defaultBlockState()));

		  register(context, COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(CobaltOre, 9));
		  register(context, NETHERRACK_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_COBALT_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_COBALT_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_COBALT_ORE.get().defaultBlockState(), 9));


		  List<OreConfiguration.TargetBlockState> ApatiteOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.APATITE_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_APATITE_ORE.get().defaultBlockState()));

		  register(context, APATITE_ORE_KEY, Feature.ORE, new OreConfiguration(ApatiteOre, 9));
		  register(context, NETHERRACK_APATITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_APATITE_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_APATITE_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_APATITE_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> CinnabarOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.CINNABAR_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE.get().defaultBlockState()));

		  register(context, CINNABAR_ORE_KEY, Feature.ORE, new OreConfiguration(CinnabarOre, 9));
		  register(context, NETHERRACK_CINNABAR_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_CINNABAR_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_CINNABAR_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> AluminumOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.ALUMINUM_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_ALUMINUM_ORE.get().defaultBlockState()));

		  register(context, ALUMINUM_ORE_KEY, Feature.ORE, new OreConfiguration(AluminumOre, 9));
		  register(context, NETHERRACK_ALUMINUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_ALUMINUM_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_ALUMINUM_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_ALUMINUM_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> AquiteOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.AQUITE_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_AQUITE_ORE.get().defaultBlockState()));

		  register(context, AQUITE_ORE_KEY, Feature.ORE, new OreConfiguration(AquiteOre, 9));
		  register(context, NETHERRACK_AQUITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_AQUITE_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_AQUITE_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_AQUITE_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> BitumenOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.BITUMEN_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_BITUMEN_ORE.get().defaultBlockState()));

		  register(context, BITUMEN_ORE_KEY, Feature.ORE, new OreConfiguration(BitumenOre, 9));
		  register(context, NETHERRACK_BITUMEN_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_BITUMEN_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_BITUMEN_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_BITUMEN_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> ArcaneOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.ARCANE_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_ARCANE_ORE.get().defaultBlockState()));

		  register(context, ARCANE_ORE_KEY, Feature.ORE, new OreConfiguration(ArcaneOre, 9));
		  register(context, NETHERRACK_ARCANE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_ARCANE_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_ARCANE_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_ARCANE_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> IridiumOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.IRIDIUM_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_IRIDIUM_ORE.get().defaultBlockState()));

		  register(context, IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(IridiumOre, 9));
		  register(context, NETHERRACK_IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_IRIDIUM_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_IRIDIUM_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_IRIDIUM_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> LeadOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.LEAD_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_LEAD_ORE.get().defaultBlockState()));

		  register(context, LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(LeadOre, 9));
		  register(context, NETHERRACK_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_LEAD_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_LEAD_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_LEAD_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> NickelOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.NICKEL_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_NICKEL_ORE.get().defaultBlockState()));

		  register(context, NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(NickelOre, 9));
		  register(context, NETHERRACK_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_NICKEL_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_NICKEL_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_NICKEL_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> OsmiumOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.OSMIUM_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_OSMIUM_ORE.get().defaultBlockState()));

		  register(context, OSMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(OsmiumOre, 9));
		  register(context, NETHERRACK_OSMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_OSMIUM_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_OSMIUM_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_OSMIUM_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> CharoiteOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.CHAROITE_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_CHAROITE_ORE.get().defaultBlockState()));

		  register(context, CHAROITE_ORE_KEY, Feature.ORE, new OreConfiguration(CharoiteOre, 9));
		  register(context, NETHERRACK_CHAROITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_CHAROITE_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_CHAROITE_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_CHAROITE_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> Charged_certus_quartzOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE.get().defaultBlockState()));

		  register(context, CHARGED_CERTUS_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(Charged_certus_quartzOre, 9));
		  register(context, NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_CHARGED_CERTUS_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_CHARGED_CERTUS_QUARTZ_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> Certus_quartzOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.CERTUS_QUARTZ_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE.get().defaultBlockState()));

		  register(context, CERTUS_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(Certus_quartzOre, 9));
		  register(context, NETHERRACK_CERTUS_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_CERTUS_QUARTZ_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_CERTUS_QUARTZ_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_CERTUS_QUARTZ_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> CarminiteOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.CARMINITE_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_CARMINITE_ORE.get().defaultBlockState()));

		  register(context, CARMINITE_ORE_KEY, Feature.ORE, new OreConfiguration(CarminiteOre, 9));
		  register(context, NETHERRACK_CARMINITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_CARMINITE_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_CARMINITE_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_CARMINITE_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> FroststeelOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.FROSTSTEEL_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_FROSTSTEEL_ORE.get().defaultBlockState()));

		  register(context, FROSTSTEEL_ORE_KEY, Feature.ORE, new OreConfiguration(FroststeelOre, 9));
		  register(context, NETHERRACK_FROSTSTEEL_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_FROSTSTEEL_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_FROSTSTEEL_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_FROSTSTEEL_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> RegaliumOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.REGALIUM_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_REGALIUM_ORE.get().defaultBlockState()));

		  register(context, REGALIUM_ORE_KEY, Feature.ORE, new OreConfiguration(RegaliumOre, 9));
		  register(context, NETHERRACK_REGALIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_REGALIUM_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_REGALIUM_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_REGALIUM_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> NebuOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.NEBU_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_NEBU_ORE.get().defaultBlockState()));

		  register(context, NEBU_ORE_KEY, Feature.ORE, new OreConfiguration(NebuOre, 9));
		  register(context, NETHERRACK_NEBU_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_NEBU_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_NEBU_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_NEBU_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> ThallasiumOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.THALLASIUM_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_THALLASIUM_ORE.get().defaultBlockState()));

		  register(context, THALLASIUM_ORE_KEY, Feature.ORE, new OreConfiguration(ThallasiumOre, 9));
		  register(context, NETHERRACK_THALLASIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_THALLASIUM_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_THALLASIUM_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_THALLASIUM_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> UtheriumOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.UTHERIUM_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_UTHERIUM_ORE.get().defaultBlockState()));

		  register(context, UTHERIUM_ORE_KEY, Feature.ORE, new OreConfiguration(UtheriumOre, 9));
		  register(context, NETHERRACK_UTHERIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_UTHERIUM_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_UTHERIUM_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_UTHERIUM_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> FalsiteOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.FALSITE_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_FALSITE_ORE.get().defaultBlockState()));

		  register(context, FALSITE_ORE_KEY, Feature.ORE, new OreConfiguration(FalsiteOre, 9));
		  register(context, NETHERRACK_FALSITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_FALSITE_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_FALSITE_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_FALSITE_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> HorizoniteOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.HORIZONITE_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_HORIZONITE_ORE.get().defaultBlockState()));

		  register(context, HORIZONITE_ORE_KEY, Feature.ORE, new OreConfiguration(HorizoniteOre, 9));
		  register(context, NETHERRACK_HORIZONITE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_HORIZONITE_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_HORIZONITE_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_HORIZONITE_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> IesniumOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.IESNIUM_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_IESNIUM_ORE.get().defaultBlockState()));

		  register(context, IESNIUM_ORE_KEY, Feature.ORE, new OreConfiguration(IesniumOre, 9));
		  register(context, NETHERRACK_IESNIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_IESNIUM_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_IESNIUM_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_IESNIUM_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> TungstenOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.TUNGSTEN_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_TUNGSTEN_ORE.get().defaultBlockState()));

		  register(context, TUNGSTEN_ORE_KEY, Feature.ORE, new OreConfiguration(TungstenOre, 9));
		  register(context, NETHERRACK_TUNGSTEN_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_TUNGSTEN_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_TUNGSTEN_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_TUNGSTEN_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> VentiumOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.VENTIUM_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_VENTIUM_ORE.get().defaultBlockState()));

		  register(context, VENTIUM_ORE_KEY, Feature.ORE, new OreConfiguration(VentiumOre, 9));
		  register(context, NETHERRACK_VENTIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_VENTIUM_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_VENTIUM_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_VENTIUM_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> ZincOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.ZINC_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_ZINC_ORE.get().defaultBlockState()));

		  register(context, ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(ZincOre, 9));
		  register(context, NETHERRACK_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_ZINC_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_ZINC_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_ZINC_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> TitaniumOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.TITANIUM_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_TITANIUM_ORE.get().defaultBlockState()));

		  register(context, TITANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(TitaniumOre, 9));
		  register(context, NETHERRACK_TITANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_TITANIUM_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_TITANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_TITANIUM_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> SilverOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.SILVER_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState()));

		  register(context, SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(SilverOre, 9));
		  register(context, NETHERRACK_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_SILVER_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_SILVER_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_SILVER_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> UraniumOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.URANIUM_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_URANIUM_ORE.get().defaultBlockState()));

		  register(context, URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(UraniumOre, 9));
		  register(context, NETHERRACK_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_URANIUM_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_URANIUM_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_URANIUM_ORE.get().defaultBlockState(), 9));

		  List<OreConfiguration.TargetBlockState> PlatinumOre = List.of(
					 OreConfiguration.target(stoneReplaceables, RerMaterialsBlocks.PLATINUM_ORE.get().defaultBlockState()),
					 OreConfiguration.target(deepslateReplaceables, RerMaterialsBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState()));

		  register(context, PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(PlatinumOre, 9));
		  register(context, NETHERRACK_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables, RerMaterialsBlocks.NETHERRACK_PLATINUM_ORE.get().defaultBlockState(), 9));
		  register(context, END_STONE_PLATINUM_ORE_KEY, Feature.ORE, new OreConfiguration(end_stoneReplaceables, RerMaterialsBlocks.END_STONE_PLATINUM_ORE.get().defaultBlockState(), 9));
	 }

	 public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		  return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(RopRer.MOD_ID, name));
	 }

	 private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
																														ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
		  context.register(key, new ConfiguredFeature<>(feature, configuration));
	 }
}