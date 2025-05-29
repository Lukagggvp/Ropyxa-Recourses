package net.ropyxa.roprer.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.ropyxa.roprer.block.RerMaterialsBlocks;
import net.ropyxa.roprer.item.RerMaterials;

import java.util.List;
import java.util.Set;

public class RerBlockLootProvider extends BlockLootSubProvider {
	 protected RerBlockLootProvider(HolderLookup.Provider registries) {
		  super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
	 }

	 @Override
	 protected void generate() {
		  	List<Block> SELF_DROP_BLOCKS = List.of(
				RerMaterialsBlocks.TIN_BLOCK.get(),
				RerMaterialsBlocks.RAW_TIN_BLOCK.get(),
				RerMaterialsBlocks.COBALT_BLOCK.get(),
				RerMaterialsBlocks.RAW_COBALT_BLOCK.get(),
				RerMaterialsBlocks.APATITE_BLOCK.get(),
				RerMaterialsBlocks.CINNABAR_BLOCK.get(),
				RerMaterialsBlocks.CINNABAR_CLUSTER_BLOCK.get(),
				RerMaterialsBlocks.BRASS_BLOCK.get(),
				RerMaterialsBlocks.BRONZE_BLOCK.get(),
				RerMaterialsBlocks.CAST_IRON_BLOCK.get(),
				RerMaterialsBlocks.SOUL_STEEL_BLOCK.get(),
				RerMaterialsBlocks.STEEL_BLOCK.get(),
				RerMaterialsBlocks.ALUMINUM_BLOCK.get(),
				RerMaterialsBlocks.RAW_ALUMINUM_BLOCK.get(),
				RerMaterialsBlocks.AQUITE_BLOCK.get(),
				RerMaterialsBlocks.AQUITE_CLUSTER_BLOCK.get(),
				RerMaterialsBlocks.BITUMEN_BLOCK.get(),
				RerMaterialsBlocks.BITUMEN_CLUSTER_BLOCK.get(),
				RerMaterialsBlocks.ARCANE_BLOCK.get(),
				RerMaterialsBlocks.ARCANE_CLUSTER_BLOCK.get(),
				RerMaterialsBlocks.ENDERIUM_BLOCK.get(),
				RerMaterialsBlocks.ELECTRUM_BLOCK.get(),
				RerMaterialsBlocks.LUMIUM_BLOCK.get(),
				RerMaterialsBlocks.FIERY_BLOCK.get(),
				RerMaterialsBlocks.IRIDIUM_BLOCK.get(),
				RerMaterialsBlocks.RAW_IRIDIUM_BLOCK.get(),
				RerMaterialsBlocks.LEAD_BLOCK.get(),
				RerMaterialsBlocks.RAW_LEAD_BLOCK.get(),
				RerMaterialsBlocks.NICKEL_BLOCK.get(),
				RerMaterialsBlocks.RAW_NICKEL_BLOCK.get(),
				RerMaterialsBlocks.OSMIUM_BLOCK.get(),
				RerMaterialsBlocks.RAW_OSMIUM_BLOCK.get(),
				RerMaterialsBlocks.CARMINITE_BLOCK.get(),
				RerMaterialsBlocks.CARMINITE_CLUSTER_BLOCK.get(),
				RerMaterialsBlocks.CERTUS_QUARTZ_BLOCK.get(),
				RerMaterialsBlocks.CERTUS_QUARTZ_CLUSTER_BLOCK.get(),
				RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_BLOCK.get(),
				RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_CLUSTER_BLOCK.get(),
				RerMaterialsBlocks.CHAROITE_BLOCK.get(),
				RerMaterialsBlocks.CHAROITE_CLUSTER_BLOCK.get(),
				RerMaterialsBlocks.SIGNALUM_BLOCK.get(),
				RerMaterialsBlocks.INVAR_BLOCK.get(),
				RerMaterialsBlocks.GRAPHITE_BLOCK.get(),
				RerMaterialsBlocks.CONSTANTAN_BLOCK.get(),
				RerMaterialsBlocks.REFINED_OBSIDIAN_BLOCK.get(),
				RerMaterialsBlocks.REFINED_GLOWSTONE_BLOCK.get(),
				RerMaterialsBlocks.ORICHALCUM_BLOCK.get(),
				RerMaterialsBlocks.ROSE_GOLD_BLOCK.get(),
				RerMaterialsBlocks.KNIGHTMETAL_BLOCK.get(),
				RerMaterialsBlocks.SKY_BLOCK.get(),
				RerMaterialsBlocks.IRONWOOD_BLOCK.get(),
				RerMaterialsBlocks.TAINED_GOLD_BLOCK.get(),
				RerMaterialsBlocks.INFUSED_IRON_BLOCK.get(),
				RerMaterialsBlocks.UTHERIUM_BLOCK.get(),
				RerMaterialsBlocks.RAW_UTHERIUM_BLOCK.get(),
				RerMaterialsBlocks.THALLASIUM_BLOCK.get(),
				RerMaterialsBlocks.RAW_THALLASIUM_BLOCK.get(),
				RerMaterialsBlocks.NEBU_BLOCK.get(),
				RerMaterialsBlocks.RAW_NEBU_BLOCK.get(),
				RerMaterialsBlocks.REGALIUM_BLOCK.get(),
				RerMaterialsBlocks.RAW_REGALIUM_BLOCK.get(),
				RerMaterialsBlocks.FROSTSTEEL_BLOCK.get(),
				RerMaterialsBlocks.RAW_FROSTSTEEL_BLOCK.get(),
				RerMaterialsBlocks.FALSITE_BLOCK.get(),
				RerMaterialsBlocks.RAW_FALSITE_BLOCK.get(),
				RerMaterialsBlocks.HORIZONITE_BLOCK.get(),
				RerMaterialsBlocks.RAW_HORIZONITE_BLOCK.get(),
				RerMaterialsBlocks.IESNIUM_BLOCK.get(),
				RerMaterialsBlocks.RAW_IESNIUM_BLOCK.get(),
				RerMaterialsBlocks.TUNGSTEN_BLOCK.get(),
				RerMaterialsBlocks.RAW_TUNGSTEN_BLOCK.get(),
				RerMaterialsBlocks.VENTIUM_BLOCK.get(),
				RerMaterialsBlocks.RAW_VENTIUM_BLOCK.get(),
				RerMaterialsBlocks.PLATINUM_BLOCK.get(),
				RerMaterialsBlocks.RAW_PLATINUM_BLOCK.get(),
				RerMaterialsBlocks.URANIUM_BLOCK.get(),
				RerMaterialsBlocks.RAW_URANIUM_BLOCK.get(),
				RerMaterialsBlocks.SILVER_BLOCK.get(),
				RerMaterialsBlocks.RAW_SILVER_BLOCK.get(),
				RerMaterialsBlocks.TITANIUM_BLOCK.get(),
				RerMaterialsBlocks.RAW_TITANIUM_BLOCK.get(),
				RerMaterialsBlocks.ZINC_BLOCK.get(),
				RerMaterialsBlocks.RAW_ZINC_BLOCK.get(),
				RerMaterialsBlocks.APATITE_CLUSTER_BLOCK.get());

		   SELF_DROP_BLOCKS.forEach(this::dropSelf);

			add(RerMaterialsBlocks.TIN_ORE.get(),
					  block -> createOreDrop(RerMaterialsBlocks.TIN_ORE.get(), RerMaterials.RAW_TIN.get()));
		  	add(RerMaterialsBlocks.END_STONE_TIN_ORE.get(),
					  block -> createOreDrop(RerMaterialsBlocks.END_STONE_TIN_ORE.get(), RerMaterials.RAW_TIN.get()));
		  	add(RerMaterialsBlocks.NETHERRACK_TIN_ORE.get(),
					  block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_TIN_ORE.get(), RerMaterials.RAW_TIN.get()));
		  	add(RerMaterialsBlocks.DEEPSLATE_TIN_ORE.get(),
					  block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_TIN_ORE.get(), RerMaterials.RAW_TIN.get()));

		  add(RerMaterialsBlocks.ZINC_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.ZINC_ORE.get(), RerMaterials.RAW_ZINC.get()));
		  add(RerMaterialsBlocks.NETHERRACK_ZINC_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_ZINC_ORE.get(), RerMaterials.RAW_ZINC.get()));
		  add(RerMaterialsBlocks.END_STONE_ZINC_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_ZINC_ORE.get(), RerMaterials.RAW_ZINC.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_ZINC_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_ZINC_ORE.get(), RerMaterials.RAW_ZINC.get()));

		  add(RerMaterialsBlocks.TITANIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.TITANIUM_ORE.get(), RerMaterials.RAW_TITANIUM.get()));
		  add(RerMaterialsBlocks.NETHERRACK_TITANIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_TITANIUM_ORE.get(), RerMaterials.RAW_TITANIUM.get()));
		  add(RerMaterialsBlocks.END_STONE_TITANIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_TITANIUM_ORE.get(), RerMaterials.RAW_TITANIUM.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_TITANIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_TITANIUM_ORE.get(), RerMaterials.RAW_TITANIUM.get()));

		  add(RerMaterialsBlocks.SILVER_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.SILVER_ORE.get(), RerMaterials.RAW_SILVER.get()));
		  add(RerMaterialsBlocks.NETHERRACK_SILVER_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_SILVER_ORE.get(), RerMaterials.RAW_SILVER.get()));
		  add(RerMaterialsBlocks.END_STONE_SILVER_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_SILVER_ORE.get(), RerMaterials.RAW_SILVER.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_SILVER_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_SILVER_ORE.get(), RerMaterials.RAW_SILVER.get()));

		  add(RerMaterialsBlocks.URANIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.URANIUM_ORE.get(), RerMaterials.RAW_URANIUM.get()));
		  add(RerMaterialsBlocks.NETHERRACK_URANIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_URANIUM_ORE.get(), RerMaterials.RAW_URANIUM.get()));
		  add(RerMaterialsBlocks.END_STONE_URANIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_URANIUM_ORE.get(), RerMaterials.RAW_URANIUM.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_URANIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_URANIUM_ORE.get(), RerMaterials.RAW_URANIUM.get()));

		  add(RerMaterialsBlocks.PLATINUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.PLATINUM_ORE.get(), RerMaterials.RAW_PLATINUM.get()));
		  add(RerMaterialsBlocks.NETHERRACK_PLATINUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_PLATINUM_ORE.get(), RerMaterials.RAW_PLATINUM.get()));
		  add(RerMaterialsBlocks.END_STONE_PLATINUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_PLATINUM_ORE.get(), RerMaterials.RAW_PLATINUM.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_PLATINUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_PLATINUM_ORE.get(), RerMaterials.RAW_PLATINUM.get()));

		   add(RerMaterialsBlocks.COBALT_ORE.get(),
					  block -> createOreDrop(RerMaterialsBlocks.COBALT_ORE.get(), RerMaterials.RAW_COBALT.get()));
		   add(RerMaterialsBlocks.NETHERRACK_COBALT_ORE.get(),
					  block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_COBALT_ORE.get(), RerMaterials.RAW_COBALT.get()));
		   add(RerMaterialsBlocks.END_STONE_COBALT_ORE.get(),
					  block -> createOreDrop(RerMaterialsBlocks.END_STONE_COBALT_ORE.get(), RerMaterials.RAW_COBALT.get()));
		   add(RerMaterialsBlocks.DEEPSLATE_COBALT_ORE.get(),
				 	  block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_COBALT_ORE.get(), RerMaterials.RAW_COBALT.get()));

		  	add(RerMaterialsBlocks.APATITE_ORE.get(), block -> createMultipleOreDrops(
						      RerMaterialsBlocks.APATITE_ORE.get(), RerMaterials.APATITE_GEM.get(), 1, 2));
		  	add(RerMaterialsBlocks.NETHERRACK_APATITE_ORE.get(), block -> createMultipleOreDrops(
								RerMaterialsBlocks.NETHERRACK_APATITE_ORE.get(), RerMaterials.APATITE_GEM.get(), 1, 2));
		  	add(RerMaterialsBlocks.END_STONE_APATITE_ORE.get(), block -> createMultipleOreDrops(
								RerMaterialsBlocks.END_STONE_APATITE_ORE.get(), RerMaterials.APATITE_GEM.get(), 1, 2));
		  	add(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE.get(), block -> createMultipleOreDrops(
								RerMaterialsBlocks.DEEPSLATE_APATITE_ORE.get(), RerMaterials.APATITE_GEM.get(), 1, 2));

		   add(RerMaterialsBlocks.CINNABAR_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.CINNABAR_ORE.get(), RerMaterials.CINNABAR_GEM.get(), 1, 2));
		   add(RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE.get(), RerMaterials.CINNABAR_GEM.get(), 1, 2));
		   add(RerMaterialsBlocks.END_STONE_CINNABAR_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.END_STONE_CINNABAR_ORE.get(), RerMaterials.CINNABAR_GEM.get(), 1, 2));
		   add(RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE.get(), RerMaterials.CINNABAR_GEM.get(), 1, 2));

		  add(RerMaterialsBlocks.ALUMINUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.ALUMINUM_ORE.get(), RerMaterials.RAW_ALUMINUM.get()));
		  add(RerMaterialsBlocks.NETHERRACK_ALUMINUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_ALUMINUM_ORE.get(), RerMaterials.RAW_ALUMINUM.get()));
		  add(RerMaterialsBlocks.END_STONE_ALUMINUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_ALUMINUM_ORE.get(), RerMaterials.RAW_ALUMINUM.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_ALUMINUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_ALUMINUM_ORE.get(), RerMaterials.RAW_ALUMINUM.get()));

		  add(RerMaterialsBlocks.FROSTSTEEL_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.FROSTSTEEL_ORE.get(), RerMaterials.RAW_FROSTSTEEL.get()));
		  add(RerMaterialsBlocks.NETHERRACK_FROSTSTEEL_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_FROSTSTEEL_ORE.get(), RerMaterials.RAW_FROSTSTEEL.get()));
		  add(RerMaterialsBlocks.END_STONE_FROSTSTEEL_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_FROSTSTEEL_ORE.get(), RerMaterials.RAW_FROSTSTEEL.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_FROSTSTEEL_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_FROSTSTEEL_ORE.get(), RerMaterials.RAW_FROSTSTEEL.get()));

		  add(RerMaterialsBlocks.REGALIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.REGALIUM_ORE.get(), RerMaterials.RAW_REGALIUM.get()));
		  add(RerMaterialsBlocks.NETHERRACK_REGALIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_REGALIUM_ORE.get(), RerMaterials.RAW_REGALIUM.get()));
		  add(RerMaterialsBlocks.END_STONE_REGALIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_REGALIUM_ORE.get(), RerMaterials.RAW_REGALIUM.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_REGALIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_REGALIUM_ORE.get(), RerMaterials.RAW_REGALIUM.get()));

		  add(RerMaterialsBlocks.NEBU_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NEBU_ORE.get(), RerMaterials.RAW_NEBU.get()));
		  add(RerMaterialsBlocks.NETHERRACK_NEBU_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_NEBU_ORE.get(), RerMaterials.RAW_NEBU.get()));
		  add(RerMaterialsBlocks.END_STONE_NEBU_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_NEBU_ORE.get(), RerMaterials.RAW_NEBU.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_NEBU_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_NEBU_ORE.get(), RerMaterials.RAW_NEBU.get()));

		  add(RerMaterialsBlocks.THALLASIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.THALLASIUM_ORE.get(), RerMaterials.RAW_THALLASIUM.get()));
		  add(RerMaterialsBlocks.NETHERRACK_THALLASIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_THALLASIUM_ORE.get(), RerMaterials.RAW_THALLASIUM.get()));
		  add(RerMaterialsBlocks.END_STONE_THALLASIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_THALLASIUM_ORE.get(), RerMaterials.RAW_THALLASIUM.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_THALLASIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_THALLASIUM_ORE.get(), RerMaterials.RAW_THALLASIUM.get()));

		  add(RerMaterialsBlocks.UTHERIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.UTHERIUM_ORE.get(), RerMaterials.RAW_UTHERIUM.get()));
		  add(RerMaterialsBlocks.NETHERRACK_UTHERIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_UTHERIUM_ORE.get(), RerMaterials.RAW_UTHERIUM.get()));
		  add(RerMaterialsBlocks.END_STONE_UTHERIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_UTHERIUM_ORE.get(), RerMaterials.RAW_UTHERIUM.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_UTHERIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_UTHERIUM_ORE.get(), RerMaterials.RAW_UTHERIUM.get()));

		  add(RerMaterialsBlocks.AQUITE_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.AQUITE_ORE.get(), RerMaterials.AQUITE_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.NETHERRACK_AQUITE_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.NETHERRACK_AQUITE_ORE.get(), RerMaterials.AQUITE_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.END_STONE_AQUITE_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.END_STONE_AQUITE_ORE.get(), RerMaterials.AQUITE_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.DEEPSLATE_AQUITE_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.DEEPSLATE_AQUITE_ORE.get(), RerMaterials.AQUITE_GEM.get(), 1, 2));

		  add(RerMaterialsBlocks.BITUMEN_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.BITUMEN_ORE.get(), RerMaterials.BITUMEN_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.NETHERRACK_BITUMEN_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.NETHERRACK_BITUMEN_ORE.get(), RerMaterials.BITUMEN_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.END_STONE_BITUMEN_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.END_STONE_BITUMEN_ORE.get(), RerMaterials.BITUMEN_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.DEEPSLATE_BITUMEN_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.DEEPSLATE_BITUMEN_ORE.get(), RerMaterials.BITUMEN_GEM.get(), 1, 2));

		  add(RerMaterialsBlocks.ARCANE_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.ARCANE_ORE.get(), RerMaterials.ARCANE_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.NETHERRACK_ARCANE_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.NETHERRACK_ARCANE_ORE.get(), RerMaterials.ARCANE_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.END_STONE_ARCANE_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.END_STONE_ARCANE_ORE.get(), RerMaterials.ARCANE_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.DEEPSLATE_ARCANE_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.DEEPSLATE_ARCANE_ORE.get(), RerMaterials.ARCANE_GEM.get(), 1, 2));

		  add(RerMaterialsBlocks.IRIDIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.IRIDIUM_ORE.get(), RerMaterials.RAW_IRIDIUM.get()));
		  add(RerMaterialsBlocks.NETHERRACK_IRIDIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_IRIDIUM_ORE.get(), RerMaterials.RAW_IRIDIUM.get()));
		  add(RerMaterialsBlocks.END_STONE_IRIDIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_IRIDIUM_ORE.get(), RerMaterials.RAW_IRIDIUM.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_IRIDIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_IRIDIUM_ORE.get(), RerMaterials.RAW_IRIDIUM.get()));

		  add(RerMaterialsBlocks.LEAD_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.LEAD_ORE.get(), RerMaterials.RAW_LEAD.get()));
		  add(RerMaterialsBlocks.NETHERRACK_LEAD_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_LEAD_ORE.get(), RerMaterials.RAW_LEAD.get()));
		  add(RerMaterialsBlocks.END_STONE_LEAD_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_LEAD_ORE.get(), RerMaterials.RAW_LEAD.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_LEAD_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_LEAD_ORE.get(), RerMaterials.RAW_LEAD.get()));

		  add(RerMaterialsBlocks.NICKEL_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NICKEL_ORE.get(), RerMaterials.RAW_NICKEL.get()));
		  add(RerMaterialsBlocks.NETHERRACK_NICKEL_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_NICKEL_ORE.get(), RerMaterials.RAW_NICKEL.get()));
		  add(RerMaterialsBlocks.END_STONE_NICKEL_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_NICKEL_ORE.get(), RerMaterials.RAW_NICKEL.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_NICKEL_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_NICKEL_ORE.get(), RerMaterials.RAW_NICKEL.get()));

		  add(RerMaterialsBlocks.OSMIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.OSMIUM_ORE.get(), RerMaterials.RAW_OSMIUM.get()));
		  add(RerMaterialsBlocks.NETHERRACK_OSMIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_OSMIUM_ORE.get(), RerMaterials.RAW_OSMIUM.get()));
		  add(RerMaterialsBlocks.END_STONE_OSMIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_OSMIUM_ORE.get(), RerMaterials.RAW_OSMIUM.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_OSMIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_OSMIUM_ORE.get(), RerMaterials.RAW_OSMIUM.get()));

		  add(RerMaterialsBlocks.CHAROITE_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.CHAROITE_ORE.get(), RerMaterials.CHAROITE_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.NETHERRACK_CHAROITE_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.NETHERRACK_CHAROITE_ORE.get(), RerMaterials.CHAROITE_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.END_STONE_CHAROITE_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.END_STONE_CHAROITE_ORE.get(), RerMaterials.CHAROITE_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.DEEPSLATE_CHAROITE_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.DEEPSLATE_CHAROITE_ORE.get(), RerMaterials.CHAROITE_GEM.get(), 1, 2));

		  add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_ORE.get(), RerMaterials.CHARGED_CERTUS_QUARTZ_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE.get(), RerMaterials.CHARGED_CERTUS_QUARTZ_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.END_STONE_CHARGED_CERTUS_QUARTZ_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.END_STONE_CHARGED_CERTUS_QUARTZ_ORE.get(), RerMaterials.CHARGED_CERTUS_QUARTZ_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE.get(), RerMaterials.CHARGED_CERTUS_QUARTZ_GEM.get(), 1, 2));

		  add(RerMaterialsBlocks.CERTUS_QUARTZ_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.CERTUS_QUARTZ_ORE.get(), RerMaterials.CERTUS_QUARTZ_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.NETHERRACK_CERTUS_QUARTZ_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.NETHERRACK_CERTUS_QUARTZ_ORE.get(), RerMaterials.CERTUS_QUARTZ_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.END_STONE_CERTUS_QUARTZ_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.END_STONE_CERTUS_QUARTZ_ORE.get(), RerMaterials.CERTUS_QUARTZ_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE.get(), RerMaterials.CERTUS_QUARTZ_GEM.get(), 1, 2));

		  add(RerMaterialsBlocks.CARMINITE_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.CARMINITE_ORE.get(), RerMaterials.CARMINITE_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.NETHERRACK_CARMINITE_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.NETHERRACK_CARMINITE_ORE.get(), RerMaterials.CARMINITE_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.END_STONE_CARMINITE_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.END_STONE_CARMINITE_ORE.get(), RerMaterials.CARMINITE_GEM.get(), 1, 2));
		  add(RerMaterialsBlocks.DEEPSLATE_CARMINITE_ORE.get(), block -> createMultipleOreDrops(
					 RerMaterialsBlocks.DEEPSLATE_CARMINITE_ORE.get(), RerMaterials.CARMINITE_GEM.get(), 1, 2));

		  add(RerMaterialsBlocks.VENTIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.VENTIUM_ORE.get(), RerMaterials.RAW_VENTIUM.get()));
		  add(RerMaterialsBlocks.NETHERRACK_VENTIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_VENTIUM_ORE.get(), RerMaterials.RAW_VENTIUM.get()));
		  add(RerMaterialsBlocks.END_STONE_VENTIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_VENTIUM_ORE.get(), RerMaterials.RAW_VENTIUM.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_VENTIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_VENTIUM_ORE.get(), RerMaterials.RAW_VENTIUM.get()));

		  add(RerMaterialsBlocks.TUNGSTEN_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.TUNGSTEN_ORE.get(), RerMaterials.RAW_TUNGSTEN.get()));
		  add(RerMaterialsBlocks.NETHERRACK_TUNGSTEN_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_TUNGSTEN_ORE.get(), RerMaterials.RAW_TUNGSTEN.get()));
		  add(RerMaterialsBlocks.END_STONE_TUNGSTEN_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_TUNGSTEN_ORE.get(), RerMaterials.RAW_TUNGSTEN.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_TUNGSTEN_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), RerMaterials.RAW_TUNGSTEN.get()));

		  add(RerMaterialsBlocks.IESNIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.IESNIUM_ORE.get(), RerMaterials.RAW_IESNIUM.get()));
		  add(RerMaterialsBlocks.NETHERRACK_IESNIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_IESNIUM_ORE.get(), RerMaterials.RAW_IESNIUM.get()));
		  add(RerMaterialsBlocks.END_STONE_IESNIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_IESNIUM_ORE.get(), RerMaterials.RAW_IESNIUM.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_IESNIUM_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_IESNIUM_ORE.get(), RerMaterials.RAW_IESNIUM.get()));

		  add(RerMaterialsBlocks.HORIZONITE_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.HORIZONITE_ORE.get(), RerMaterials.RAW_HORIZONITE.get()));
		  add(RerMaterialsBlocks.NETHERRACK_HORIZONITE_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_HORIZONITE_ORE.get(), RerMaterials.RAW_HORIZONITE.get()));
		  add(RerMaterialsBlocks.END_STONE_HORIZONITE_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_HORIZONITE_ORE.get(), RerMaterials.RAW_HORIZONITE.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_HORIZONITE_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_HORIZONITE_ORE.get(), RerMaterials.RAW_HORIZONITE.get()));

		  add(RerMaterialsBlocks.FALSITE_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.FALSITE_ORE.get(), RerMaterials.RAW_FALSITE.get()));
		  add(RerMaterialsBlocks.NETHERRACK_FALSITE_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.NETHERRACK_FALSITE_ORE.get(), RerMaterials.RAW_FALSITE.get()));
		  add(RerMaterialsBlocks.END_STONE_FALSITE_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.END_STONE_FALSITE_ORE.get(), RerMaterials.RAW_FALSITE.get()));
		  add(RerMaterialsBlocks.DEEPSLATE_FALSITE_ORE.get(),
					 block -> createOreDrop(RerMaterialsBlocks.DEEPSLATE_FALSITE_ORE.get(), RerMaterials.RAW_FALSITE.get()));
	 }

	 protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
		  HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
		  return this.createSilkTouchDispatchTable(pBlock,
					 this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
								.apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
								.apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))));
	 }

	 @Override
	 protected Iterable<Block> getKnownBlocks() {
		  return RerMaterialsBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
	 }
}