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

	 public static final ResourceKey<BiomeModifier> BITUMEN_ORE_ADD = registerKey("bitumen_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_BITUMEN_ORE_ADD = registerKey("netherrack_bitumen_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_BITUMEN_ORE_ADD = registerKey("end_stone_bitumen_ore_add");

	 public static final ResourceKey<BiomeModifier> AQUITE_ORE_ADD = registerKey("aquite_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_AQUITE_ORE_ADD = registerKey("netherrack_aquite_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_AQUITE_ORE_ADD = registerKey("end_stone_aquite_ore_add");

	 public static final ResourceKey<BiomeModifier> ALUMINUM_ORE_ADD = registerKey("aluminum_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_ALUMINUM_ORE_ADD = registerKey("netherrack_aluminum_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_ALUMINUM_ORE_ADD = registerKey("end_stone_aluminum_ore_add");

	 public static final ResourceKey<BiomeModifier> IRIDIUM_ORE_ADD = registerKey("iridium_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_IRIDIUM_ORE_ADD = registerKey("netherrack_iridium_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_IRIDIUM_ORE_ADD = registerKey("end_stone_iridium_ore_add");

	 public static final ResourceKey<BiomeModifier> LEAD_ORE_ADD = registerKey("lead_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_LEAD_ORE_ADD = registerKey("netherrack_lead_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_LEAD_ORE_ADD = registerKey("end_stone_lead_ore_add");

	 public static final ResourceKey<BiomeModifier> CHAROITE_ORE_ADD = registerKey("charoite_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_CHAROITE_ORE_ADD = registerKey("netherrack_charoite_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_CHAROITE_ORE_ADD = registerKey("end_stone_charoite_ore_add");

	 public static final ResourceKey<BiomeModifier> CHARGED_CERTUS_QUARTZ_ORE_ADD = registerKey("charged_certus_quartz_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE_ADD = registerKey("netherrack_charged_certus_quartz_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_CHARGED_CERTUS_QUARTZ_ORE_ADD = registerKey("end_stone_charged_certus_quartz_ore_add");

	 public static final ResourceKey<BiomeModifier> CERTUS_QUARTZ_ORE_ADD = registerKey("certus_quartz_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_CERTUS_QUARTZ_ORE_ADD = registerKey("netherrack_certus_quartz_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_CERTUS_QUARTZ_ORE_ADD = registerKey("end_stone_certus_quartz_ore_add");

	 public static final ResourceKey<BiomeModifier> CARMINITE_ORE_ADD = registerKey("carminite_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_CARMINITE_ORE_ADD = registerKey("netherrack_carminite_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_CARMINITE_ORE_ADD = registerKey("end_stone_carminite_ore_add");

	 public static final ResourceKey<BiomeModifier> NICKEL_ORE_ADD = registerKey("nickel_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_NICKEL_ORE_ADD = registerKey("netherrack_nickel_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_NICKEL_ORE_ADD = registerKey("end_stone_nickel_ore_add");

	 public static final ResourceKey<BiomeModifier> OSMIUM_ORE_ADD = registerKey("osmium_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_OSMIUM_ORE_ADD = registerKey("netherrack_osmium_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_OSMIUM_ORE_ADD = registerKey("end_stone_osmium_ore_add");

	 public static final ResourceKey<BiomeModifier> ARCANE_ORE_ADD = registerKey("arcane_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_ARCANE_ORE_ADD = registerKey("netherrack_arcane_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_ARCANE_ORE_ADD = registerKey("end_stone_arcane_ore_add");

	 public static final ResourceKey<BiomeModifier> APATITE_ORE_ADD = registerKey("apatite_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_APATITE_ORE_ADD = registerKey("netherrack_apatite_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_APATITE_ORE_ADD = registerKey("end_stone_apatite_ore_add");

	 public static final ResourceKey<BiomeModifier> CINNABAR_ORE_ADD = registerKey("cinnabar_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_CINNABAR_ORE_ADD = registerKey("netherrack_cinnabar_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_CINNABAR_ORE_ADD = registerKey("end_stone_cinnabar_ore_add");

	 public static final ResourceKey<BiomeModifier> UTHERIUM_ORE_ADD = registerKey("utherium_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_UTHERIUM_ORE_ADD = registerKey("netherrack_utherium_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_UTHERIUM_ORE_ADD = registerKey("end_stone_utherium_ore_add");

	 public static final ResourceKey<BiomeModifier> THALLASIUM_ORE_ADD = registerKey("thallasium_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_THALLASIUM_ORE_ADD = registerKey("netherrack_thallasium_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_THALLASIUM_ORE_ADD = registerKey("end_stone_thallasium_ore_add");

	 public static final ResourceKey<BiomeModifier> NEBU_ORE_ADD = registerKey("nebu_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_NEBU_ORE_ADD = registerKey("netherrack_nebu_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_NEBU_ORE_ADD = registerKey("end_stone_nebu_ore_add");

	 public static final ResourceKey<BiomeModifier> REGALIUM_ORE_ADD = registerKey("regalium_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_REGALIUM_ORE_ADD = registerKey("netherrack_regalium_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_REGALIUM_ORE_ADD = registerKey("end_stone_regalium_ore_add");

	 public static final ResourceKey<BiomeModifier> FROSTSTEEL_ORE_ADD = registerKey("froststeel_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_FROSTSTEEL_ORE_ADD = registerKey("netherrack_froststeel_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_FROSTSTEEL_ORE_ADD = registerKey("end_stone_froststeel_ore_add");

	 public static final ResourceKey<BiomeModifier> FALSITE_ORE_ADD = registerKey("falsite_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_FALSITE_ORE_ADD = registerKey("netherrack_falsite_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_FALSITE_ORE_ADD = registerKey("end_stone_falsite_ore_add");

	 public static final ResourceKey<BiomeModifier> HORIZONITE_ORE_ADD = registerKey("horizonite_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_HORIZONITE_ORE_ADD = registerKey("netherrack_horizonite_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_HORIZONITE_ORE_ADD = registerKey("end_stone_horizonite_ore_add");

	 public static final ResourceKey<BiomeModifier> IESNIUM_ORE_ADD = registerKey("iesnium_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_IESNIUM_ORE_ADD = registerKey("netherrack_iesnium_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_IESNIUM_ORE_ADD = registerKey("end_stone_iesnium_ore_add");

	 public static final ResourceKey<BiomeModifier> TUNGSTEN_ORE_ADD = registerKey("tungsten_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_TUNGSTEN_ORE_ADD = registerKey("netherrack_tungsten_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_TUNGSTEN_ORE_ADD = registerKey("end_stone_tungsten_ore_add");

	 public static final ResourceKey<BiomeModifier> VENTIUM_ORE_ADD = registerKey("ventium_ore_add");
	 public static final ResourceKey<BiomeModifier> NETHERRACK_VENTIUM_ORE_ADD = registerKey("netherrack_ventium_ore_add");
	 public static final ResourceKey<BiomeModifier> END_STONE_VENTIUM_ORE_ADD = registerKey("end_stone_ventium_ore_add");

	 public static void bootstrap(BootstrapContext<BiomeModifier> context) {
		  var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
		  var biomes = context.lookup(Registries.BIOME);

		  context.register(FALSITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.FALSITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_FALSITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_FALSITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_FALSITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_FALSITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(HORIZONITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.HORIZONITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_HORIZONITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_HORIZONITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_HORIZONITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_HORIZONITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(IESNIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.IESNIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_IESNIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_IESNIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_IESNIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_IESNIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(TUNGSTEN_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.TUNGSTEN_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_TUNGSTEN_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_TUNGSTEN_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_TUNGSTEN_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_TUNGSTEN_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(VENTIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.VENTIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_VENTIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_VENTIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_VENTIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_VENTIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

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


		  context.register(ALUMINUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.ALUMINUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_ALUMINUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_ALUMINUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_ALUMINUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_ALUMINUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


		  context.register(AQUITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.AQUITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_AQUITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_AQUITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_AQUITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_AQUITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


		  context.register(BITUMEN_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.BITUMEN_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_BITUMEN_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_BITUMEN_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_BITUMEN_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_BITUMEN_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


		  context.register(ARCANE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.ARCANE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_ARCANE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_ARCANE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_ARCANE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_ARCANE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


		  context.register(OSMIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.OSMIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_OSMIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_OSMIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_OSMIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_OSMIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


		  context.register(NICKEL_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NICKEL_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_NICKEL_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_NICKEL_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_NICKEL_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_NICKEL_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


		  context.register(LEAD_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.LEAD_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_LEAD_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_LEAD_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_LEAD_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_LEAD_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


		  context.register(IRIDIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.IRIDIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_IRIDIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_IRIDIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_IRIDIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_IRIDIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


		  context.register(CARMINITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.CARMINITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_CARMINITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_CARMINITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_CARMINITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_CARMINITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


		  context.register(CERTUS_QUARTZ_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.CERTUS_QUARTZ_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_CERTUS_QUARTZ_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_CERTUS_QUARTZ_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_CERTUS_QUARTZ_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_CERTUS_QUARTZ_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


		  context.register(CHARGED_CERTUS_QUARTZ_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.CHARGED_CERTUS_QUARTZ_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_CHARGED_CERTUS_QUARTZ_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_CHARGED_CERTUS_QUARTZ_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


		  context.register(CHAROITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.CHAROITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_CHAROITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_CHAROITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_CHAROITE_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_CHAROITE_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


		  context.register(FROSTSTEEL_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.FROSTSTEEL_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_FROSTSTEEL_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_FROSTSTEEL_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_FROSTSTEEL_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_FROSTSTEEL_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


		  context.register(REGALIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.REGALIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_REGALIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_REGALIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_REGALIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_REGALIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


		  context.register(NEBU_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NEBU_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_NEBU_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_NEBU_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_NEBU_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_NEBU_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


		  context.register(THALLASIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.THALLASIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_THALLASIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_THALLASIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_THALLASIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_THALLASIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));


		  context.register(UTHERIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_OVERWORLD), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.UTHERIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(NETHERRACK_UTHERIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_NETHER), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.NETHERRACK_UTHERIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));

		  context.register(END_STONE_UTHERIUM_ORE_ADD, new BiomeModifiers.AddFeaturesBiomeModifier(biomes.getOrThrow(BiomeTags.IS_END), HolderSet.direct(placedFeatures.getOrThrow(
					 RerPlacedFeatures.END_STONE_UTHERIUM_ORE_PLACED_KEY)), GenerationStep.Decoration.UNDERGROUND_ORES));
	 }

	 private static ResourceKey<BiomeModifier> registerKey(String name) {
		  return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(RopRer.MOD_ID, name));
	 }
}
