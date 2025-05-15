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

	 public static void bootstrap(BootstrapContext<PlacedFeature> context) {
		  var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

		  register(context, TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.TIN_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(veinsPerChunkOverworld, HeightRangePlacement.triangle(VerticalAnchor
								.absolute(minYoverworld), VerticalAnchor.absolute(maxYoverworld))));
		  register(context, NETHERRACK_TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_TIN_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(veinsPerChunkNether, HeightRangePlacement.uniform(VerticalAnchor
								.absolute(minYnether), VerticalAnchor.absolute(maxYnether))));
		  register(context, END_STONE_TIN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_TIN_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(veinsPerChunkEnd, HeightRangePlacement.uniform(VerticalAnchor
								.absolute(minYend), VerticalAnchor.absolute(maxYend))));
	 }

	 private static ResourceKey<PlacedFeature> registerKey(String name) {
		  return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(RopRer.MOD_ID, name));
	 }

	 private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
											List<PlacementModifier> modifiers) {
		  context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
	 }
}