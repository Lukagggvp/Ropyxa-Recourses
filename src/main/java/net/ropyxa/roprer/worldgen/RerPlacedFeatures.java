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

	 public static final ResourceKey<PlacedFeature> CARMINITE_ORE_PLACED_KEY = registerKey("carminite_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_CARMINITE_ORE_PLACED_KEY = registerKey("netherrack_carminite_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_CARMINITE_ORE_PLACED_KEY = registerKey("end_stone_carminite_ore_placed");

	 public static final ResourceKey<PlacedFeature> CERTUS_QUARTZ_ORE_PLACED_KEY = registerKey("certus_quartz_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_CERTUS_QUARTZ_ORE_PLACED_KEY = registerKey("netherrack_certus_quartz_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_CERTUS_QUARTZ_ORE_PLACED_KEY = registerKey("end_stone_certus_quartz_ore_placed");

	 public static final ResourceKey<PlacedFeature> CHARGED_CERTUS_QUARTZ_ORE_PLACED_KEY = registerKey("charged_certus_quartz_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE_PLACED_KEY = registerKey("netherrack_charged_certus_quartz_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_CHARGED_CERTUS_QUARTZ_ORE_PLACED_KEY = registerKey("end_stone_charged_certus_quartz_ore_placed");

	 public static final ResourceKey<PlacedFeature> CHAROITE_ORE_PLACED_KEY = registerKey("charoite_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_CHAROITE_ORE_PLACED_KEY = registerKey("netherrack_charoite_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_CHAROITE_ORE_PLACED_KEY = registerKey("end_stone_charoite_ore_placed");

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

	 public static final ResourceKey<PlacedFeature> UTHERIUM_ORE_PLACED_KEY = registerKey("utherium_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_UTHERIUM_ORE_PLACED_KEY = registerKey("netherrack_utherium_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_UTHERIUM_ORE_PLACED_KEY = registerKey("end_stone_utherium_ore_placed");

	 public static final ResourceKey<PlacedFeature> THALLASIUM_ORE_PLACED_KEY = registerKey("thallasium_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_THALLASIUM_ORE_PLACED_KEY = registerKey("netherrack_thallasium_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_THALLASIUM_ORE_PLACED_KEY = registerKey("end_stone_thallasium_ore_placed");

	 public static final ResourceKey<PlacedFeature> NEBU_ORE_PLACED_KEY = registerKey("nebu_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_NEBU_ORE_PLACED_KEY = registerKey("netherrack_nebu_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_NEBU_ORE_PLACED_KEY = registerKey("end_stone_nebu_ore_placed");

	 public static final ResourceKey<PlacedFeature> REGALIUM_ORE_PLACED_KEY = registerKey("regalium_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_REGALIUM_ORE_PLACED_KEY = registerKey("netherrack_regalium_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_REGALIUM_ORE_PLACED_KEY = registerKey("end_stone_regalium_ore_placed");

	 public static final ResourceKey<PlacedFeature> FROSTSTEEL_ORE_PLACED_KEY = registerKey("froststeel_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_FROSTSTEEL_ORE_PLACED_KEY = registerKey("netherrack_froststeel_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_FROSTSTEEL_ORE_PLACED_KEY = registerKey("end_stone_froststeel_ore_placed");

	 public static final ResourceKey<PlacedFeature> TUNGSTEN_ORE_PLACED_KEY = registerKey("tungsten_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_TUNGSTEN_ORE_PLACED_KEY = registerKey("netherrack_tungsten_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_TUNGSTEN_ORE_PLACED_KEY = registerKey("end_stone_tungsten_ore_placed");

	 public static final ResourceKey<PlacedFeature> VENTIUM_ORE_PLACED_KEY = registerKey("ventium_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_VENTIUM_ORE_PLACED_KEY = registerKey("netherrack_ventium_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_VENTIUM_ORE_PLACED_KEY = registerKey("end_stone_ventium_ore_placed");

	 public static final ResourceKey<PlacedFeature> IESNIUM_ORE_PLACED_KEY = registerKey("iesnium_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_IESNIUM_ORE_PLACED_KEY = registerKey("netherrack_iesnium_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_IESNIUM_ORE_PLACED_KEY = registerKey("end_stone_iesnium_ore_placed");

	 public static final ResourceKey<PlacedFeature> HORIZONITE_ORE_PLACED_KEY = registerKey("horizonite_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_HORIZONITE_ORE_PLACED_KEY = registerKey("netherrack_horizonite_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_HORIZONITE_ORE_PLACED_KEY = registerKey("end_stone_horizonite_ore_placed");

	 public static final ResourceKey<PlacedFeature> FALSITE_ORE_PLACED_KEY = registerKey("falsite_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_FALSITE_ORE_PLACED_KEY = registerKey("netherrack_falsite_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_FALSITE_ORE_PLACED_KEY = registerKey("end_stone_falsite_ore_placed");

	 public static final ResourceKey<PlacedFeature> PLATINUM_ORE_PLACED_KEY = registerKey("platinum_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_PLATINUM_ORE_PLACED_KEY = registerKey("netherrack_platinum_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_PLATINUM_ORE_PLACED_KEY = registerKey("end_stone_platinum_ore_placed");

	 public static final ResourceKey<PlacedFeature> URANIUM_ORE_PLACED_KEY = registerKey("uranium_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_URANIUM_ORE_PLACED_KEY = registerKey("netherrack_uranium_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_URANIUM_ORE_PLACED_KEY = registerKey("end_stone_uranium_ore_placed");

	 public static final ResourceKey<PlacedFeature> SILVER_ORE_PLACED_KEY = registerKey("silver_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_SILVER_ORE_PLACED_KEY = registerKey("netherrack_silver_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_SILVER_ORE_PLACED_KEY = registerKey("end_stone_silver_ore_placed");

	 public static final ResourceKey<PlacedFeature> TITANIUM_ORE_PLACED_KEY = registerKey("titanium_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_TITANIUM_ORE_PLACED_KEY = registerKey("netherrack_titanium_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_TITANIUM_ORE_PLACED_KEY = registerKey("end_stone_titanium_ore_placed");

	 public static final ResourceKey<PlacedFeature> ZINC_ORE_PLACED_KEY = registerKey("zinc_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_ZINC_ORE_PLACED_KEY = registerKey("netherrack_zinc_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_ZINC_ORE_PLACED_KEY = registerKey("end_stone_zinc_ore_placed");

	 public static final ResourceKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_SAPPHIRE_ORE_PLACED_KEY = registerKey("netherrack_sapphire_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_SAPPHIRE_ORE_PLACED_KEY = registerKey("end_stone_sapphire_ore_placed");

	 public static final ResourceKey<PlacedFeature> DIMENSIONAL_ORE_PLACED_KEY = registerKey("dimensional_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_DIMENSIONAL_ORE_PLACED_KEY = registerKey("netherrack_dimensional_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_DIMENSIONAL_ORE_PLACED_KEY = registerKey("end_stone_dimensional_ore_placed");

	 public static final ResourceKey<PlacedFeature> MOONSTONE_ORE_PLACED_KEY = registerKey("moonstone_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_MOONSTONE_ORE_PLACED_KEY = registerKey("netherrack_moonstone_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_MOONSTONE_ORE_PLACED_KEY = registerKey("end_stone_moonstone_ore_placed");

	 public static final ResourceKey<PlacedFeature> PERIDOT_ORE_PLACED_KEY = registerKey("peridot_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_PERIDOT_ORE_PLACED_KEY = registerKey("netherrack_peridot_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_PERIDOT_ORE_PLACED_KEY = registerKey("end_stone_peridot_ore_placed");

	 public static final ResourceKey<PlacedFeature> PYROPE_ORE_PLACED_KEY = registerKey("pyrope_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_PYROPE_ORE_PLACED_KEY = registerKey("netherrack_pyrope_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_PYROPE_ORE_PLACED_KEY = registerKey("end_stone_pyrope_ore_placed");

	 public static final ResourceKey<PlacedFeature> DIOPSIDE_ORE_PLACED_KEY = registerKey("diopside_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_DIOPSIDE_ORE_PLACED_KEY = registerKey("netherrack_diopside_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_DIOPSIDE_ORE_PLACED_KEY = registerKey("end_stone_diopside_ore_placed");

	 public static final ResourceKey<PlacedFeature> SULFUR_ORE_PLACED_KEY = registerKey("sulfur_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_SULFUR_ORE_PLACED_KEY = registerKey("netherrack_sulfur_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_SULFUR_ORE_PLACED_KEY = registerKey("end_stone_sulfur_ore_placed");

	 public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_RUBY_ORE_PLACED_KEY = registerKey("netherrack_ruby_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_RUBY_ORE_PLACED_KEY = registerKey("end_stone_ruby_ore_placed");

	 public static final ResourceKey<PlacedFeature> POTASSIUM_NITRATE_ORE_PLACED_KEY = registerKey("potassium_nitrate_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_POTASSIUM_NITRATE_ORE_PLACED_KEY = registerKey("netherrack_potassium_nitrate_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_POTASSIUM_NITRATE_ORE_PLACED_KEY = registerKey("end_stone_potassium_nitrate_ore_placed");

	 public static final ResourceKey<PlacedFeature> FLUORITE_ORE_PLACED_KEY = registerKey("fluorite_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_FLUORITE_ORE_PLACED_KEY = registerKey("netherrack_fluorite_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_FLUORITE_ORE_PLACED_KEY = registerKey("end_stone_fluorite_ore_placed");

	 public static final ResourceKey<PlacedFeature> CLOGGRUM_ORE_PLACED_KEY = registerKey("cloggrum_ore_placed");
	 public static final ResourceKey<PlacedFeature> NETHERRACK_CLOGGRUM_ORE_PLACED_KEY = registerKey("netherrack_cloggrum_ore_placed");
	 public static final ResourceKey<PlacedFeature> END_STONE_CLOGGRUM_ORE_PLACED_KEY = registerKey("end_stone_cloggrum_ore_placed");

	 public static void bootstrap(BootstrapContext<PlacedFeature> context) {
		  var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

		  register(context, CLOGGRUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.CLOGGRUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_CLOGGRUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_CLOGGRUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_CLOGGRUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_CLOGGRUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, DIOPSIDE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.DIOPSIDE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_DIOPSIDE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_DIOPSIDE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_DIOPSIDE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_DIOPSIDE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, SULFUR_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.SULFUR_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_SULFUR_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_SULFUR_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_SULFUR_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_SULFUR_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.RUBY_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_RUBY_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_RUBY_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, POTASSIUM_NITRATE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.POTASSIUM_NITRATE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_POTASSIUM_NITRATE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_POTASSIUM_NITRATE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_POTASSIUM_NITRATE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_POTASSIUM_NITRATE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, FLUORITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.FLUORITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_FLUORITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_FLUORITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_FLUORITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_FLUORITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, VENTIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.VENTIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_VENTIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_VENTIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_VENTIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_VENTIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, TUNGSTEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.TUNGSTEN_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_TUNGSTEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_TUNGSTEN_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_TUNGSTEN_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_TUNGSTEN_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, IESNIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.IESNIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_IESNIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_IESNIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_IESNIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_IESNIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, HORIZONITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.HORIZONITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_HORIZONITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_HORIZONITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_HORIZONITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_HORIZONITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, FALSITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.FALSITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_FALSITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_FALSITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_FALSITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_FALSITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

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

		  register(context, CHAROITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.CHAROITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_CHAROITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_CHAROITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_CHAROITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_CHAROITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, CHARGED_CERTUS_QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.CHARGED_CERTUS_QUARTZ_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_CHARGED_CERTUS_QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_CHARGED_CERTUS_QUARTZ_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, CERTUS_QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.CERTUS_QUARTZ_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_CERTUS_QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_CERTUS_QUARTZ_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_CERTUS_QUARTZ_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_CERTUS_QUARTZ_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, CARMINITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.CARMINITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_CARMINITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_CARMINITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_CARMINITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_CARMINITE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, FROSTSTEEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.FROSTSTEEL_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_FROSTSTEEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_FROSTSTEEL_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_FROSTSTEEL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_FROSTSTEEL_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, REGALIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.REGALIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_REGALIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_REGALIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_REGALIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_REGALIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, NEBU_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NEBU_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_NEBU_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_NEBU_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_NEBU_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_NEBU_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, THALLASIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.THALLASIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_THALLASIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_THALLASIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_THALLASIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_THALLASIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, UTHERIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.UTHERIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_UTHERIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_UTHERIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_UTHERIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_UTHERIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, ZINC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.ZINC_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_ZINC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_ZINC_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_ZINC_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_ZINC_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, TITANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.TITANIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_TITANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_TITANIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_TITANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_TITANIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.SILVER_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_SILVER_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_SILVER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_SILVER_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, URANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.URANIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_URANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_URANIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_URANIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_URANIUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, PLATINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.PLATINUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_PLATINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_PLATINUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_PLATINUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_PLATINUM_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, PYROPE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.PYROPE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_PYROPE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_PYROPE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_PYROPE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_PYROPE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, PERIDOT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.PERIDOT_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_PERIDOT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_PERIDOT_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_PERIDOT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_PERIDOT_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, MOONSTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.MOONSTONE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_MOONSTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_MOONSTONE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_MOONSTONE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_MOONSTONE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, DIMENSIONAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.DIMENSIONAL_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_DIMENSIONAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_DIMENSIONAL_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_DIMENSIONAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_DIMENSIONAL_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_END.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_END.get()), VerticalAnchor.absolute(MAX_Y_END.get()))));

		  register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.SAPPHIRE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_OVERWORLD.get(), HeightRangePlacement.triangle(VerticalAnchor
								.absolute(MIN_Y_OVERWORLD.get()), VerticalAnchor.absolute(MAX_Y_OVERWORLD.get()))));
		  register(context, NETHERRACK_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.NETHERRACK_SAPPHIRE_ORE_KEY),
					 RerOrePlacement.commonOrePlacement(VEINS_PER_CHUNK_NETHER.get(), HeightRangePlacement.uniform(VerticalAnchor
								.absolute(MIN_Y_NETHER.get()), VerticalAnchor.absolute(MAX_Y_NETHER.get()))));
		  register(context, END_STONE_SAPPHIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(RerConfiguredFeatures.END_STONE_SAPPHIRE_ORE_KEY),
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