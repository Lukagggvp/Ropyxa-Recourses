package net.ropyxa.roprer.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.ropyxa.roprer.RopRer;

public class RerBiomeModifiers {
	 public static final ResourceKey<BiomeModifier> TIN_ORE_ADD = registerKey("tin_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_TIN_ORE_ADD = registerKey("netherrack_tin_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_TIN_ORE_ADD = registerKey("end_stone_tin_ore_add");

	 public static final ResourceKey<BiomeModifier> COBALT_ORE_ADD = registerKey("cobalt_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_COBALT_ORE_ADD = registerKey("netherrack_cobalt_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_COBALT_ORE_ADD = registerKey("end_stone_cobalt_ore_add");


	 public static final ResourceKey<BiomeModifier> APATITE_ORE_ADD = registerKey("apatite_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_APATITE_ORE_ADD = registerKey("netherrack_apatite_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_APATITE_ORE_ADD = registerKey("end_stone_apatite_ore_add");

	 public static final ResourceKey<BiomeModifier> CINNABAR_ORE_ADD = registerKey("cinnabar_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_CINNABAR_ORE_ADD = registerKey("netherrack_cinnabar_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_CINNABAR_ORE_ADD = registerKey("end_stone_cinnabar_ore_add");

	 public static void bootstrap(BootstrapContext<BiomeModifier> context) {
		  var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
		  var biomes = context.lookup(Registries.BIOME);

		  context.register(TIN_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.TIN_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_TIN_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_TIN_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_TIN_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_TIN_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(COBALT_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.COBALT_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_COBALT_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_COBALT_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_COBALT_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_COBALT_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


		  context.register(APATITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.APATITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_APATITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_APATITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_APATITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_APATITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(CINNABAR_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.CINNABAR_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_CINNABAR_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_CINNABAR_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_CINNABAR_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_CINNABAR_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
	 }

	 private static ResourceKey<BiomeModifier> registerKey(String name) {
		  return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(RopRer.MOD_ID, name));
	 }
}
