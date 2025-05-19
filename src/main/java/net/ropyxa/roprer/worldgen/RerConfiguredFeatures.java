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
	 }

	 public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
		  return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(RopRer.MOD_ID, name));
	 }

	 private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
																														ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
		  context.register(key, new ConfiguredFeature<>(feature, configuration));
	 }
}