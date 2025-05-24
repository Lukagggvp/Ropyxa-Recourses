package net.ropyxa.roprer.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.ropyxa.roprer.RopRer;

import java.util.List;

import static net.ropyxa.roprer.Config.*;

public class RerPlacedFeatures {
	 public static final ResourceKey<PlacedFeature> TIN_ORE_PLACED_KEY = registerKey("tin_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_TIN_ORE_PLACED_KEY = registerKey("netherrack_tin_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_TIN_ORE_PLACED_KEY = registerKey("end_stone_tin_ore_placed");

	 public static final ResourceKey<PlacedFeature> COBALT_ORE_PLACED_KEY = registerKey("cobalt_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_COBALT_ORE_PLACED_KEY = registerKey("netherrack_cobalt_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_COBALT_ORE_PLACED_KEY = registerKey("end_stone_cobalt_ore_placed");

	 public static final ResourceKey<PlacedFeature> BITUMEN_ORE_PLACED_KEY = registerKey("bitumen_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_BITUMEN_ORE_PLACED_KEY = registerKey("netherrack_bitumen_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_BITUMEN_ORE_PLACED_KEY = registerKey("end_stone_bitumen_ore_placed");

	 public static final ResourceKey<PlacedFeature> ARCANE_ORE_PLACED_KEY = registerKey("arcane_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_ARCANE_ORE_PLACED_KEY = registerKey("netherrack_arcane_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_ARCANE_ORE_PLACED_KEY = registerKey("end_stone_arcane_ore_placed");

	 public static final ResourceKey<PlacedFeature> AQUITE_ORE_PLACED_KEY = registerKey("aquite_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_AQUITE_ORE_PLACED_KEY = registerKey("netherrack_aquite_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_AQUITE_ORE_PLACED_KEY = registerKey("end_stone_aquite_ore_placed");

	 public static final ResourceKey<PlacedFeature> ALUMINUM_ORE_PLACED_KEY = registerKey("aluminum_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_ALUMINUM_ORE_PLACED_KEY = registerKey("netherrack_aluminum_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_ALUMINUM_ORE_PLACED_KEY = registerKey("end_stone_aluminum_ore_placed");

	 public static final ResourceKey<PlacedFeature> IRIDIUM_ORE_PLACED_KEY = registerKey("iridium_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_IRIDIUM_ORE_PLACED_KEY = registerKey("netherrack_iridium_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_IRIDIUM_ORE_PLACED_KEY = registerKey("end_stone_iridium_ore_placed");

	 public static final ResourceKey<PlacedFeature> LEAD_ORE_PLACED_KEY = registerKey("lead_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_LEAD_ORE_PLACED_KEY = registerKey("netherrack_lead_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_LEAD_ORE_PLACED_KEY = registerKey("end_stone_lead_ore_placed");

	 public static final ResourceKey<PlacedFeature> NICKEL_ORE_PLACED_KEY = registerKey("nickel_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_NICKEL_ORE_PLACED_KEY = registerKey("netherrack_nickel_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_NICKEL_ORE_PLACED_KEY = registerKey("end_stone_nickel_ore_placed");

	 public static final ResourceKey<PlacedFeature> OSMIUM_ORE_PLACED_KEY = registerKey("osmium_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_OSMIUM_ORE_PLACED_KEY = registerKey("netherrack_osmium_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_OSMIUM_ORE_PLACED_KEY = registerKey("end_stone_osmium_ore_placed");

	 public static final ResourceKey<PlacedFeature> APATITE_ORE_PLACED_KEY = registerKey("apatite_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_APATITE_ORE_PLACED_KEY = registerKey("netherrack_apatite_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_APATITE_ORE_PLACED_KEY = registerKey("end_stone_apatite_ore_placed");

	 public static final ResourceKey<PlacedFeature> CINNABAR_ORE_PLACED_KEY = registerKey("cinnabar_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_CINNABAR_ORE_PLACED_KEY = registerKey("netherrack_cinnabar_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_CINNABAR_ORE_PLACED_KEY = registerKey("end_stone_cinnabar_ore_placed");

	 public static void bootstrap(BootstrapContext<PlacedFeature> context) {
		  var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

		  register(context, TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.TIN_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_TIN_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_TIN_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, COBALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.COBALT_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_COBALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_COBALT_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_COBALT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_COBALT_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));


		  register(context, APATITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.APATITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_APATITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_APATITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_APATITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_APATITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, CINNABAR_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.CINNABAR_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_CINNABAR_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_CINNABAR_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_CINNABAR_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_CINNABAR_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, ALUMINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.ALUMINUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_ALUMINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_ALUMINUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_ALUMINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_ALUMINUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, AQUITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.AQUITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_AQUITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_AQUITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_AQUITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_AQUITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, BITUMEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.BITUMEN_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_BITUMEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_BITUMEN_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_BITUMEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_BITUMEN_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, ARCANE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.ARCANE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_ARCANE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_ARCANE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_ARCANE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_ARCANE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, OSMIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.OSMIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_OSMIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_OSMIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_OSMIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_OSMIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, NICKEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NICKEL_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_NICKEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_NICKEL_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_NICKEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_NICKEL_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, LEAD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.LEAD_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_LEAD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_LEAD_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_LEAD_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_LEAD_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, IRIDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.IRIDIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_IRIDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_IRIDIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_IRIDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_IRIDIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));
	 }

	 private static ResourceKey<PlacedFeature> registerKey(String name) {
		  return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(RopRer.MOD_ID, name));
	 }

	 private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
											List<PlacementModifier> modifiers) {
		  context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
	 }
}