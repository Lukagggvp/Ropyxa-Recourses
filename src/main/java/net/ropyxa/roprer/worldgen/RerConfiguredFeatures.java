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

	 public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
		  RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
		  RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
		  RuleTest end_stoneReplaceables = new BlockMatchTest(Blocks.END_STONE);
		  RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

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
	 }

	 public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		  return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(RopRer.MOD_ID, name));
	 }

	 private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
																														ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
		  context.register(key, new ConfiguredFeature<>(feature, configuration));
	 }
}