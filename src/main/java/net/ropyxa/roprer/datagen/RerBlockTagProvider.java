package net.ropyxa.roprer.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.ropyxa.roprer.RopRer;
import net.ropyxa.roprer.block.RerMaterialsBlocks;
import net.ropyxa.roprer.item.RerMaterials;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class RerBlockTagProvider extends BlockTagsProvider {
	 public RerBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
		  super(output, lookupProvider, RopRer.MOD_ID, existingFileHelper);
	 }

	 private void Platinum_Uranium_Silver_Titanium_Zinc_Blocks(HolderLookup.Provider provider) {
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.PLATINUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.PLATINUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.PLATINUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.PLATINUM_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.PLATINUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.PLATINUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/platinum")))
					 .add(RerMaterialsBlocks.PLATINUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_PLATINUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_PLATINUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_PLATINUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_PLATINUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_PLATINUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_platinum")))
					 .add(RerMaterialsBlocks.RAW_PLATINUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.PLATINUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_PLATINUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_PLATINUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_PLATINUM_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.PLATINUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_PLATINUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_PLATINUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_PLATINUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.PLATINUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_PLATINUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_PLATINUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_PLATINUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.PLATINUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_PLATINUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_PLATINUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_PLATINUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.PLATINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_PLATINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_PLATINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_PLATINUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/platinum")))
					 .add(RerMaterialsBlocks.PLATINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/platinum")))
					 .add(RerMaterialsBlocks.NETHERRACK_PLATINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/platinum")))
					 .add(RerMaterialsBlocks.END_STONE_PLATINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/platinum")))
					 .add(RerMaterialsBlocks.DEEPSLATE_PLATINUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.PLATINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_PLATINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_PLATINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_PLATINUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.PLATINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_PLATINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_PLATINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_PLATINUM_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.URANIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.URANIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.URANIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.URANIUM_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.URANIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.URANIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/uranium")))
					 .add(RerMaterialsBlocks.URANIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_URANIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_URANIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_URANIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_URANIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_URANIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_uranium")))
					 .add(RerMaterialsBlocks.RAW_URANIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.URANIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_URANIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_URANIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_URANIUM_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.URANIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_URANIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_URANIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_URANIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.URANIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_URANIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_URANIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_URANIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.URANIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_URANIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_URANIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_URANIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.URANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_URANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_URANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_URANIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/uranium")))
					 .add(RerMaterialsBlocks.URANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/uranium")))
					 .add(RerMaterialsBlocks.NETHERRACK_URANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/uranium")))
					 .add(RerMaterialsBlocks.END_STONE_URANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/uranium")))
					 .add(RerMaterialsBlocks.DEEPSLATE_URANIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.URANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_URANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_URANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_URANIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.URANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_URANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_URANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_URANIUM_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.SILVER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.SILVER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.SILVER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.SILVER_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.SILVER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.SILVER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/silver")))
					 .add(RerMaterialsBlocks.SILVER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_SILVER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_SILVER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_SILVER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_SILVER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_SILVER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_silver")))
					 .add(RerMaterialsBlocks.RAW_SILVER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.SILVER_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_SILVER_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_SILVER_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_SILVER_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.SILVER_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_SILVER_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_SILVER_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_SILVER_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.SILVER_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_SILVER_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_SILVER_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_SILVER_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.SILVER_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_SILVER_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_SILVER_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_SILVER_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.SILVER_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_SILVER_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_SILVER_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_SILVER_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/silver")))
					 .add(RerMaterialsBlocks.SILVER_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/silver")))
					 .add(RerMaterialsBlocks.NETHERRACK_SILVER_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/silver")))
					 .add(RerMaterialsBlocks.END_STONE_SILVER_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/silver")))
					 .add(RerMaterialsBlocks.DEEPSLATE_SILVER_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.SILVER_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_SILVER_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_SILVER_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_SILVER_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.SILVER_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_SILVER_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_SILVER_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_SILVER_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.TITANIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.TITANIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.TITANIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.TITANIUM_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.TITANIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.TITANIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/titanium")))
					 .add(RerMaterialsBlocks.TITANIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_TITANIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_TITANIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_TITANIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_TITANIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_TITANIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_titanium")))
					 .add(RerMaterialsBlocks.RAW_TITANIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.TITANIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_TITANIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_TITANIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_TITANIUM_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.TITANIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_TITANIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_TITANIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_TITANIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.TITANIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_TITANIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_TITANIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_TITANIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.TITANIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_TITANIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_TITANIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_TITANIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.TITANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_TITANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_TITANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_TITANIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/titanium")))
					 .add(RerMaterialsBlocks.TITANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/titanium")))
					 .add(RerMaterialsBlocks.NETHERRACK_TITANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/titanium")))
					 .add(RerMaterialsBlocks.END_STONE_TITANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/titanium")))
					 .add(RerMaterialsBlocks.DEEPSLATE_TITANIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.TITANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_TITANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_TITANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_TITANIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.TITANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_TITANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_TITANIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_TITANIUM_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.ZINC_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.ZINC_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.ZINC_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.ZINC_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.ZINC_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.ZINC_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/zinc")))
					 .add(RerMaterialsBlocks.ZINC_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_ZINC_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_ZINC_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_ZINC_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_ZINC_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_ZINC_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_zinc")))
					 .add(RerMaterialsBlocks.RAW_ZINC_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.ZINC_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_ZINC_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_ZINC_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_ZINC_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.ZINC_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_ZINC_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_ZINC_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_ZINC_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.ZINC_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_ZINC_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_ZINC_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_ZINC_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.ZINC_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_ZINC_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_ZINC_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_ZINC_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.ZINC_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_ZINC_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_ZINC_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ZINC_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/zinc")))
					 .add(RerMaterialsBlocks.ZINC_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/zinc")))
					 .add(RerMaterialsBlocks.NETHERRACK_ZINC_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/zinc")))
					 .add(RerMaterialsBlocks.END_STONE_ZINC_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/zinc")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ZINC_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.ZINC_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_ZINC_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_ZINC_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ZINC_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.ZINC_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_ZINC_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_ZINC_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ZINC_ORE.get());
	 }

	 private void Dimensional_Moonstone_Peridot_Pyrope_Sapphire_Blocks(HolderLookup.Provider provider) {
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.SAPPHIRE_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.SAPPHIRE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.SAPPHIRE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.SAPPHIRE_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.SAPPHIRE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.SAPPHIRE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/sapphire")))
					 .add(RerMaterialsBlocks.SAPPHIRE_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.SAPPHIRE_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.SAPPHIRE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.SAPPHIRE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.SAPPHIRE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.SAPPHIRE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_sapphire")))
					 .add(RerMaterialsBlocks.SAPPHIRE_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.SAPPHIRE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_SAPPHIRE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_SAPPHIRE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.SAPPHIRE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_SAPPHIRE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_SAPPHIRE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.SAPPHIRE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_SAPPHIRE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_SAPPHIRE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.SAPPHIRE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_SAPPHIRE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_SAPPHIRE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.SAPPHIRE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_SAPPHIRE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_SAPPHIRE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/sapphire")))
					 .add(RerMaterialsBlocks.SAPPHIRE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/sapphire")))
					 .add(RerMaterialsBlocks.NETHERRACK_SAPPHIRE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/sapphire")))
					 .add(RerMaterialsBlocks.END_STONE_SAPPHIRE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/sapphire")))
					 .add(RerMaterialsBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.SAPPHIRE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_SAPPHIRE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_SAPPHIRE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.SAPPHIRE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_SAPPHIRE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_SAPPHIRE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_SAPPHIRE_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DIMENSIONAL_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DIMENSIONAL_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DIMENSIONAL_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DIMENSIONAL_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.DIMENSIONAL_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.DIMENSIONAL_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/dimensional")))
					 .add(RerMaterialsBlocks.DIMENSIONAL_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DIMENSIONAL_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DIMENSIONAL_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DIMENSIONAL_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DIMENSIONAL_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.DIMENSIONAL_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_dimensional")))
					 .add(RerMaterialsBlocks.DIMENSIONAL_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DIMENSIONAL_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_DIMENSIONAL_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_DIMENSIONAL_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_DIMENSIONAL_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DIMENSIONAL_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_DIMENSIONAL_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_DIMENSIONAL_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_DIMENSIONAL_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DIMENSIONAL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_DIMENSIONAL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_DIMENSIONAL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_DIMENSIONAL_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DIMENSIONAL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_DIMENSIONAL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_DIMENSIONAL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_DIMENSIONAL_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DIMENSIONAL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_DIMENSIONAL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_DIMENSIONAL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_DIMENSIONAL_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/dimensional")))
					 .add(RerMaterialsBlocks.DIMENSIONAL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/dimensional")))
					 .add(RerMaterialsBlocks.NETHERRACK_DIMENSIONAL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/dimensional")))
					 .add(RerMaterialsBlocks.END_STONE_DIMENSIONAL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/dimensional")))
					 .add(RerMaterialsBlocks.DEEPSLATE_DIMENSIONAL_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DIMENSIONAL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_DIMENSIONAL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_DIMENSIONAL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_DIMENSIONAL_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.DIMENSIONAL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_DIMENSIONAL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_DIMENSIONAL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_DIMENSIONAL_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.MOONSTONE_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.MOONSTONE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.MOONSTONE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.MOONSTONE_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.MOONSTONE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.MOONSTONE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/moonstone")))
					 .add(RerMaterialsBlocks.MOONSTONE_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.MOONSTONE_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.MOONSTONE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.MOONSTONE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.MOONSTONE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.MOONSTONE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_moonstone")))
					 .add(RerMaterialsBlocks.MOONSTONE_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.MOONSTONE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_MOONSTONE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_MOONSTONE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_MOONSTONE_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.MOONSTONE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_MOONSTONE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_MOONSTONE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_MOONSTONE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.MOONSTONE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_MOONSTONE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_MOONSTONE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_MOONSTONE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.MOONSTONE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_MOONSTONE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_MOONSTONE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_MOONSTONE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.MOONSTONE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_MOONSTONE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_MOONSTONE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_MOONSTONE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/moonstone")))
					 .add(RerMaterialsBlocks.MOONSTONE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/moonstone")))
					 .add(RerMaterialsBlocks.NETHERRACK_MOONSTONE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/moonstone")))
					 .add(RerMaterialsBlocks.END_STONE_MOONSTONE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/moonstone")))
					 .add(RerMaterialsBlocks.DEEPSLATE_MOONSTONE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.MOONSTONE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_MOONSTONE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_MOONSTONE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_MOONSTONE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.MOONSTONE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_MOONSTONE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_MOONSTONE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_MOONSTONE_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.PERIDOT_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.PERIDOT_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.PERIDOT_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.PERIDOT_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.PERIDOT_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.PERIDOT_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/peridot")))
					 .add(RerMaterialsBlocks.PERIDOT_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.PERIDOT_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.PERIDOT_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.PERIDOT_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.PERIDOT_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.PERIDOT_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_peridot")))
					 .add(RerMaterialsBlocks.PERIDOT_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.PERIDOT_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_PERIDOT_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_PERIDOT_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_PERIDOT_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.PERIDOT_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_PERIDOT_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_PERIDOT_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_PERIDOT_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.PERIDOT_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_PERIDOT_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_PERIDOT_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_PERIDOT_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.PERIDOT_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_PERIDOT_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_PERIDOT_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_PERIDOT_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.PERIDOT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_PERIDOT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_PERIDOT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_PERIDOT_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/peridot")))
					 .add(RerMaterialsBlocks.PERIDOT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/peridot")))
					 .add(RerMaterialsBlocks.NETHERRACK_PERIDOT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/peridot")))
					 .add(RerMaterialsBlocks.END_STONE_PERIDOT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/peridot")))
					 .add(RerMaterialsBlocks.DEEPSLATE_PERIDOT_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.PERIDOT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_PERIDOT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_PERIDOT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_PERIDOT_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.PERIDOT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_PERIDOT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_PERIDOT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_PERIDOT_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.PYROPE_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.PYROPE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.PYROPE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.PYROPE_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.PYROPE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.PYROPE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/pyrope")))
					 .add(RerMaterialsBlocks.PYROPE_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.PYROPE_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.PYROPE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.PYROPE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.PYROPE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.PYROPE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_pyrope")))
					 .add(RerMaterialsBlocks.PYROPE_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.PYROPE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_PYROPE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_PYROPE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_PYROPE_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.PYROPE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_PYROPE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_PYROPE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_PYROPE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.PYROPE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_PYROPE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_PYROPE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_PYROPE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.PYROPE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_PYROPE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_PYROPE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_PYROPE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.PYROPE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_PYROPE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_PYROPE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_PYROPE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/pyrope")))
					 .add(RerMaterialsBlocks.PYROPE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/pyrope")))
					 .add(RerMaterialsBlocks.NETHERRACK_PYROPE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/pyrope")))
					 .add(RerMaterialsBlocks.END_STONE_PYROPE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/pyrope")))
					 .add(RerMaterialsBlocks.DEEPSLATE_PYROPE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.PYROPE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_PYROPE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_PYROPE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_PYROPE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.PYROPE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_PYROPE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_PYROPE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_PYROPE_ORE.get());
	 }

	 private void Diopside_Fluorite_Potassium_Ruby_Sulfur_Blocks(HolderLookup.Provider provider) {
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DIOPSIDE_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DIOPSIDE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DIOPSIDE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DIOPSIDE_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.DIOPSIDE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.DIOPSIDE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/diopside")))
					 .add(RerMaterialsBlocks.DIOPSIDE_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DIOPSIDE_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DIOPSIDE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DIOPSIDE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DIOPSIDE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.DIOPSIDE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_diopside")))
					 .add(RerMaterialsBlocks.DIOPSIDE_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DIOPSIDE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_DIOPSIDE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_DIOPSIDE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_DIOPSIDE_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DIOPSIDE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_DIOPSIDE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_DIOPSIDE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_DIOPSIDE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DIOPSIDE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_DIOPSIDE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_DIOPSIDE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_DIOPSIDE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DIOPSIDE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_DIOPSIDE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_DIOPSIDE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_DIOPSIDE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DIOPSIDE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_DIOPSIDE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_DIOPSIDE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_DIOPSIDE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/diopside")))
					 .add(RerMaterialsBlocks.DIOPSIDE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/diopside")))
					 .add(RerMaterialsBlocks.NETHERRACK_DIOPSIDE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/diopside")))
					 .add(RerMaterialsBlocks.END_STONE_DIOPSIDE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/diopside")))
					 .add(RerMaterialsBlocks.DEEPSLATE_DIOPSIDE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DIOPSIDE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_DIOPSIDE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_DIOPSIDE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_DIOPSIDE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.DIOPSIDE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_DIOPSIDE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_DIOPSIDE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_DIOPSIDE_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.SULFUR_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.SULFUR_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.SULFUR_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.SULFUR_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.SULFUR_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.SULFUR_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/sulfur")))
					 .add(RerMaterialsBlocks.SULFUR_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.SULFUR_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.SULFUR_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.SULFUR_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.SULFUR_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.SULFUR_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_sulfur")))
					 .add(RerMaterialsBlocks.SULFUR_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.SULFUR_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_SULFUR_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_SULFUR_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_SULFUR_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.SULFUR_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_SULFUR_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_SULFUR_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_SULFUR_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.SULFUR_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_SULFUR_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_SULFUR_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_SULFUR_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.SULFUR_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_SULFUR_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_SULFUR_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_SULFUR_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.SULFUR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_SULFUR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_SULFUR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_SULFUR_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/sulfur")))
					 .add(RerMaterialsBlocks.SULFUR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/sulfur")))
					 .add(RerMaterialsBlocks.NETHERRACK_SULFUR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/sulfur")))
					 .add(RerMaterialsBlocks.END_STONE_SULFUR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/sulfur")))
					 .add(RerMaterialsBlocks.DEEPSLATE_SULFUR_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.SULFUR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_SULFUR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_SULFUR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_SULFUR_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.SULFUR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_SULFUR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_SULFUR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_SULFUR_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RUBY_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RUBY_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RUBY_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RUBY_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.RUBY_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RUBY_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/ruby")))
					 .add(RerMaterialsBlocks.RUBY_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RUBY_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RUBY_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RUBY_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RUBY_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RUBY_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_ruby")))
					 .add(RerMaterialsBlocks.RUBY_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RUBY_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_RUBY_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_RUBY_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_RUBY_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RUBY_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_RUBY_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_RUBY_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_RUBY_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RUBY_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_RUBY_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_RUBY_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_RUBY_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RUBY_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_RUBY_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_RUBY_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_RUBY_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.RUBY_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_RUBY_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_RUBY_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_RUBY_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/ruby")))
					 .add(RerMaterialsBlocks.RUBY_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/ruby")))
					 .add(RerMaterialsBlocks.NETHERRACK_RUBY_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/ruby")))
					 .add(RerMaterialsBlocks.END_STONE_RUBY_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/ruby")))
					 .add(RerMaterialsBlocks.DEEPSLATE_RUBY_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.RUBY_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_RUBY_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_RUBY_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_RUBY_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.RUBY_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_RUBY_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_RUBY_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_RUBY_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/potassium_nitrate")))
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_potassium_nitrate")))
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_POTASSIUM_NITRATE_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_POTASSIUM_NITRATE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_POTASSIUM_NITRATE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_POTASSIUM_NITRATE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_POTASSIUM_NITRATE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/potassium_nitrate")))
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/potassium_nitrate")))
					 .add(RerMaterialsBlocks.NETHERRACK_POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/potassium_nitrate")))
					 .add(RerMaterialsBlocks.END_STONE_POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/potassium_nitrate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_POTASSIUM_NITRATE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_POTASSIUM_NITRATE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_POTASSIUM_NITRATE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_POTASSIUM_NITRATE_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.FLUORITE_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.FLUORITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.FLUORITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.FLUORITE_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.FLUORITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.FLUORITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/fluorite")))
					 .add(RerMaterialsBlocks.FLUORITE_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.FLUORITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.FLUORITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.FLUORITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.FLUORITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.FLUORITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_fluorite")))
					 .add(RerMaterialsBlocks.FLUORITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.FLUORITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_FLUORITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_FLUORITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_FLUORITE_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.FLUORITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_FLUORITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_FLUORITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_FLUORITE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.FLUORITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_FLUORITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_FLUORITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_FLUORITE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.FLUORITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_FLUORITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_FLUORITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_FLUORITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.FLUORITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_FLUORITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_FLUORITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_FLUORITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/fluorite")))
					 .add(RerMaterialsBlocks.FLUORITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/fluorite")))
					 .add(RerMaterialsBlocks.NETHERRACK_FLUORITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/fluorite")))
					 .add(RerMaterialsBlocks.END_STONE_FLUORITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/fluorite")))
					 .add(RerMaterialsBlocks.DEEPSLATE_FLUORITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.FLUORITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_FLUORITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_FLUORITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_FLUORITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.FLUORITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_FLUORITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_FLUORITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_FLUORITE_ORE.get());
	 }

	 private void Cloggrum_Blocks(HolderLookup.Provider provider) {
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CLOGGRUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CLOGGRUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CLOGGRUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CLOGGRUM_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.CLOGGRUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CLOGGRUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cloggrum")))
					 .add(RerMaterialsBlocks.CLOGGRUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_CLOGGRUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_CLOGGRUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_CLOGGRUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_CLOGGRUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_CLOGGRUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_cloggrum")))
					 .add(RerMaterialsBlocks.RAW_CLOGGRUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CLOGGRUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_CLOGGRUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_CLOGGRUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_CLOGGRUM_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CLOGGRUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CLOGGRUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CLOGGRUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CLOGGRUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CLOGGRUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CLOGGRUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CLOGGRUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CLOGGRUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CLOGGRUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CLOGGRUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CLOGGRUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CLOGGRUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.CLOGGRUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_CLOGGRUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_CLOGGRUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CLOGGRUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cloggrum")))
					 .add(RerMaterialsBlocks.CLOGGRUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cloggrum")))
					 .add(RerMaterialsBlocks.NETHERRACK_CLOGGRUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cloggrum")))
					 .add(RerMaterialsBlocks.END_STONE_CLOGGRUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cloggrum")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CLOGGRUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.CLOGGRUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_CLOGGRUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_CLOGGRUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CLOGGRUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.CLOGGRUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_CLOGGRUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_CLOGGRUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CLOGGRUM_ORE.get());
	 }

	 @Override
	 protected void addTags(HolderLookup.Provider provider) {
		  Platinum_Uranium_Silver_Titanium_Zinc_Blocks(provider);
		  Dimensional_Moonstone_Peridot_Pyrope_Sapphire_Blocks(provider);
		  Diopside_Fluorite_Potassium_Ruby_Sulfur_Blocks(provider);
		  Cloggrum_Blocks(provider);
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.TIN_BLOCK.get())
					 .add(RerMaterialsBlocks.RAW_TIN_BLOCK.get())
					 .add(RerMaterialsBlocks.TIN_ORE.get())
					 .add(RerMaterialsBlocks.NETHERRACK_TIN_ORE.get())
					 .add(RerMaterialsBlocks.END_STONE_TIN_ORE.get())
					 .add(RerMaterialsBlocks.DEEPSLATE_TIN_ORE.get())
					 .add(RerMaterialsBlocks.APATITE_BLOCK.get())
					 .add(RerMaterialsBlocks.APATITE_CLUSTER_BLOCK.get())
					 .add(RerMaterialsBlocks.APATITE_ORE.get())
					 .add(RerMaterialsBlocks.NETHERRACK_APATITE_ORE.get())
					 .add(RerMaterialsBlocks.END_STONE_APATITE_ORE.get())
					 .add(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.TIN_BLOCK.get())
					 .add(RerMaterialsBlocks.RAW_TIN_BLOCK.get())
					 .add(RerMaterialsBlocks.TIN_ORE.get())
					 .add(RerMaterialsBlocks.NETHERRACK_TIN_ORE.get())
					 .add(RerMaterialsBlocks.END_STONE_TIN_ORE.get())
					 .add(RerMaterialsBlocks.DEEPSLATE_TIN_ORE.get())
					 .add(RerMaterialsBlocks.APATITE_BLOCK.get())
					 .add(RerMaterialsBlocks.APATITE_CLUSTER_BLOCK.get())
					 .add(RerMaterialsBlocks.APATITE_ORE.get())
					 .add(RerMaterialsBlocks.NETHERRACK_APATITE_ORE.get())
					 .add(RerMaterialsBlocks.END_STONE_APATITE_ORE.get())
					 .add(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.TIN_BLOCK.get())
					 .add(RerMaterialsBlocks.RAW_TIN_BLOCK.get())
					 .add(RerMaterialsBlocks.TIN_ORE.get())
					 .add(RerMaterialsBlocks.NETHERRACK_TIN_ORE.get())
					 .add(RerMaterialsBlocks.END_STONE_TIN_ORE.get())
					 .add(RerMaterialsBlocks.DEEPSLATE_TIN_ORE.get())
					 .add(RerMaterialsBlocks.APATITE_BLOCK.get())
					 .add(RerMaterialsBlocks.APATITE_CLUSTER_BLOCK.get())
					 .add(RerMaterialsBlocks.APATITE_ORE.get())
					 .add(RerMaterialsBlocks.NETHERRACK_APATITE_ORE.get())
					 .add(RerMaterialsBlocks.END_STONE_APATITE_ORE.get())
					 .add(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.TIN_BLOCK.get())
					 .add(RerMaterialsBlocks.RAW_TIN_BLOCK.get())
					 .add(RerMaterialsBlocks.TIN_ORE.get())
					 .add(RerMaterialsBlocks.NETHERRACK_TIN_ORE.get())
					 .add(RerMaterialsBlocks.END_STONE_TIN_ORE.get())
					 .add(RerMaterialsBlocks.DEEPSLATE_TIN_ORE.get())
					 .add(RerMaterialsBlocks.APATITE_BLOCK.get())
					 .add(RerMaterialsBlocks.APATITE_CLUSTER_BLOCK.get())
					 .add(RerMaterialsBlocks.APATITE_ORE.get())
					 .add(RerMaterialsBlocks.NETHERRACK_APATITE_ORE.get())
					 .add(RerMaterialsBlocks.END_STONE_APATITE_ORE.get())
					 .add(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.TIN_BLOCK.get())
					 .add(RerMaterialsBlocks.APATITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.TIN_BLOCK.get())
					 .add(RerMaterialsBlocks.RAW_TIN_BLOCK.get())
					 .add(RerMaterialsBlocks.APATITE_BLOCK.get())
					 .add(RerMaterialsBlocks.APATITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/tin")))
					 .add(RerMaterialsBlocks.TIN_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_tin")))
					 .add(RerMaterialsBlocks.RAW_TIN_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/apatite")))
					 .add(RerMaterialsBlocks.APATITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_apatite")))
					 .add(RerMaterialsBlocks.APATITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.TIN_ORE.get())
					 .add(RerMaterialsBlocks.NETHERRACK_TIN_ORE.get())
					 .add(RerMaterialsBlocks.END_STONE_TIN_ORE.get())
					 .add(RerMaterialsBlocks.DEEPSLATE_TIN_ORE.get())
					 .add(RerMaterialsBlocks.APATITE_ORE.get())
					 .add(RerMaterialsBlocks.NETHERRACK_APATITE_ORE.get())
					 .add(RerMaterialsBlocks.END_STONE_APATITE_ORE.get())
					 .add(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/tin")))
					 .add(RerMaterialsBlocks.TIN_ORE.get())
					 .add(RerMaterialsBlocks.NETHERRACK_TIN_ORE.get())
					 .add(RerMaterialsBlocks.END_STONE_TIN_ORE.get())
					 .add(RerMaterialsBlocks.DEEPSLATE_TIN_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/apatite")))
					 .add(RerMaterialsBlocks.APATITE_ORE.get())
					 .add(RerMaterialsBlocks.NETHERRACK_APATITE_ORE.get())
					 .add(RerMaterialsBlocks.END_STONE_APATITE_ORE.get())
					 .add(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.TIN_ORE.get())
					 .add(RerMaterialsBlocks.NETHERRACK_TIN_ORE.get())
					 .add(RerMaterialsBlocks.END_STONE_TIN_ORE.get())
					 .add(RerMaterialsBlocks.DEEPSLATE_TIN_ORE.get())
					 .add(RerMaterialsBlocks.APATITE_ORE.get())
					 .add(RerMaterialsBlocks.NETHERRACK_APATITE_ORE.get())
					 .add(RerMaterialsBlocks.END_STONE_APATITE_ORE.get())
					 .add(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.TIN_ORE.get())
					 .add(RerMaterialsBlocks.APATITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_TIN_ORE.get())
					 .add(RerMaterialsBlocks.NETHERRACK_APATITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_TIN_ORE.get())
					 .add(RerMaterialsBlocks.END_STONE_APATITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_TIN_ORE.get())
					 .add(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CINNABAR_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CINNABAR_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CINNABAR_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CINNABAR_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.CINNABAR_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CINNABAR_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cinnabar")))
					 .add(RerMaterialsBlocks.CINNABAR_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CINNABAR_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CINNABAR_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CINNABAR_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CINNABAR_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CINNABAR_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_cinnabar")))
					 .add(RerMaterialsBlocks.CINNABAR_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CINNABAR_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_CINNABAR_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CINNABAR_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CINNABAR_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CINNABAR_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CINNABAR_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CINNABAR_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CINNABAR_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.CINNABAR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_CINNABAR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cinnabar")))
					 .add(RerMaterialsBlocks.CINNABAR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cinnabar")))
					 .add(RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cinnabar")))
					 .add(RerMaterialsBlocks.END_STONE_CINNABAR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cinnabar")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.CINNABAR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_CINNABAR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.CINNABAR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_CINNABAR_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE.get());


		  //BLOCK_TAG_GEN
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.COBALT_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.COBALT_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.COBALT_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.COBALT_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.COBALT_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.COBALT_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cobalt")))
					 .add(RerMaterialsBlocks.COBALT_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_COBALT_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_COBALT_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_COBALT_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_COBALT_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_COBALT_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_cobalt")))
					 .add(RerMaterialsBlocks.RAW_COBALT_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.COBALT_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_COBALT_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_COBALT_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_COBALT_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.COBALT_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_COBALT_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_COBALT_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_COBALT_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.COBALT_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_COBALT_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_COBALT_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_COBALT_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.COBALT_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_COBALT_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_COBALT_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_COBALT_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.COBALT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_COBALT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_COBALT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_COBALT_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cobalt")))
					 .add(RerMaterialsBlocks.COBALT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cobalt")))
					 .add(RerMaterialsBlocks.NETHERRACK_COBALT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cobalt")))
					 .add(RerMaterialsBlocks.END_STONE_COBALT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cobalt")))
					 .add(RerMaterialsBlocks.DEEPSLATE_COBALT_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.COBALT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_COBALT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_COBALT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_COBALT_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.COBALT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_COBALT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_COBALT_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_COBALT_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.BRASS_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.BRASS_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.BRASS_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.BRASS_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.BRASS_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.BRASS_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/brass")))
					 .add(RerMaterialsBlocks.BRASS_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.BRONZE_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.BRONZE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.BRONZE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.BRONZE_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.BRONZE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.BRONZE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/bronze")))
					 .add(RerMaterialsBlocks.BRONZE_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CAST_IRON_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CAST_IRON_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CAST_IRON_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CAST_IRON_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.CAST_IRON_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CAST_IRON_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cast_iron")))
					 .add(RerMaterialsBlocks.CAST_IRON_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.SOUL_STEEL_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.SOUL_STEEL_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.SOUL_STEEL_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.SOUL_STEEL_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.SOUL_STEEL_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.SOUL_STEEL_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/soul_steel")))
					 .add(RerMaterialsBlocks.SOUL_STEEL_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.STEEL_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.STEEL_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.STEEL_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.STEEL_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.STEEL_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.STEEL_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/steel")))
					 .add(RerMaterialsBlocks.STEEL_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.ALUMINUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.ALUMINUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.ALUMINUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.ALUMINUM_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.ALUMINUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.ALUMINUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/aluminum")))
					 .add(RerMaterialsBlocks.ALUMINUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_ALUMINUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_ALUMINUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_ALUMINUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_ALUMINUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_ALUMINUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_aluminum")))
					 .add(RerMaterialsBlocks.RAW_ALUMINUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.ALUMINUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_ALUMINUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_ALUMINUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_ALUMINUM_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.ALUMINUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_ALUMINUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_ALUMINUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_ALUMINUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.ALUMINUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_ALUMINUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_ALUMINUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_ALUMINUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.ALUMINUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_ALUMINUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_ALUMINUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_ALUMINUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.ALUMINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_ALUMINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_ALUMINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ALUMINUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/aluminum")))
					 .add(RerMaterialsBlocks.ALUMINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/aluminum")))
					 .add(RerMaterialsBlocks.NETHERRACK_ALUMINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/aluminum")))
					 .add(RerMaterialsBlocks.END_STONE_ALUMINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/aluminum")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ALUMINUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.ALUMINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_ALUMINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_ALUMINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ALUMINUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.ALUMINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_ALUMINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_ALUMINUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ALUMINUM_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.AQUITE_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.AQUITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.AQUITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.AQUITE_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.AQUITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.AQUITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/aquite")))
					 .add(RerMaterialsBlocks.AQUITE_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.AQUITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.AQUITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.AQUITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.AQUITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.AQUITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_aquite")))
					 .add(RerMaterialsBlocks.AQUITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.AQUITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_AQUITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_AQUITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_AQUITE_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.AQUITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_AQUITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_AQUITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_AQUITE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.AQUITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_AQUITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_AQUITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_AQUITE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.AQUITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_AQUITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_AQUITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_AQUITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.AQUITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_AQUITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_AQUITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_AQUITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/aquite")))
					 .add(RerMaterialsBlocks.AQUITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/aquite")))
					 .add(RerMaterialsBlocks.NETHERRACK_AQUITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/aquite")))
					 .add(RerMaterialsBlocks.END_STONE_AQUITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/aquite")))
					 .add(RerMaterialsBlocks.DEEPSLATE_AQUITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.AQUITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_AQUITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_AQUITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_AQUITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.AQUITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_AQUITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_AQUITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_AQUITE_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.BITUMEN_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.BITUMEN_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.BITUMEN_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.BITUMEN_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.BITUMEN_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.BITUMEN_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/bitumen")))
					 .add(RerMaterialsBlocks.BITUMEN_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.BITUMEN_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.BITUMEN_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.BITUMEN_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.BITUMEN_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.BITUMEN_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_bitumen")))
					 .add(RerMaterialsBlocks.BITUMEN_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.BITUMEN_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_BITUMEN_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_BITUMEN_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_BITUMEN_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.BITUMEN_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_BITUMEN_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_BITUMEN_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_BITUMEN_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.BITUMEN_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_BITUMEN_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_BITUMEN_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_BITUMEN_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.BITUMEN_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_BITUMEN_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_BITUMEN_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_BITUMEN_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.BITUMEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_BITUMEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_BITUMEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_BITUMEN_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/bitumen")))
					 .add(RerMaterialsBlocks.BITUMEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/bitumen")))
					 .add(RerMaterialsBlocks.NETHERRACK_BITUMEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/bitumen")))
					 .add(RerMaterialsBlocks.END_STONE_BITUMEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/bitumen")))
					 .add(RerMaterialsBlocks.DEEPSLATE_BITUMEN_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.BITUMEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_BITUMEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_BITUMEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_BITUMEN_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.BITUMEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_BITUMEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_BITUMEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_BITUMEN_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.ARCANE_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.ARCANE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.ARCANE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.ARCANE_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.ARCANE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.ARCANE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/arcane")))
					 .add(RerMaterialsBlocks.ARCANE_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.ARCANE_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.ARCANE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.ARCANE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.ARCANE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.ARCANE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_arcane")))
					 .add(RerMaterialsBlocks.ARCANE_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.ARCANE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_ARCANE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_ARCANE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_ARCANE_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.ARCANE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_ARCANE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_ARCANE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_ARCANE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.ARCANE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_ARCANE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_ARCANE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_ARCANE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.ARCANE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_ARCANE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_ARCANE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_ARCANE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.ARCANE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_ARCANE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_ARCANE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ARCANE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/arcane")))
					 .add(RerMaterialsBlocks.ARCANE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/arcane")))
					 .add(RerMaterialsBlocks.NETHERRACK_ARCANE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/arcane")))
					 .add(RerMaterialsBlocks.END_STONE_ARCANE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/arcane")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ARCANE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.ARCANE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_ARCANE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_ARCANE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ARCANE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.ARCANE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_ARCANE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_ARCANE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ARCANE_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.ENDERIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.ENDERIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.ENDERIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.ENDERIUM_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.ENDERIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.ENDERIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/enderium")))
					 .add(RerMaterialsBlocks.ENDERIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.ELECTRUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.ELECTRUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.ELECTRUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.ELECTRUM_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.ELECTRUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.ELECTRUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/electrum")))
					 .add(RerMaterialsBlocks.ELECTRUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.LUMIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.LUMIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.LUMIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.LUMIUM_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.LUMIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.LUMIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/lumium")))
					 .add(RerMaterialsBlocks.LUMIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.FIERY_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.FIERY_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.FIERY_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.FIERY_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.FIERY_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.FIERY_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/fiery")))
					 .add(RerMaterialsBlocks.FIERY_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.IRIDIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.IRIDIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.IRIDIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.IRIDIUM_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.IRIDIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.IRIDIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/iridium")))
					 .add(RerMaterialsBlocks.IRIDIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_IRIDIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_IRIDIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_IRIDIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_IRIDIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_IRIDIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_iridium")))
					 .add(RerMaterialsBlocks.RAW_IRIDIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.IRIDIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_IRIDIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_IRIDIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_IRIDIUM_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.IRIDIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_IRIDIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_IRIDIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_IRIDIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.IRIDIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_IRIDIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_IRIDIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_IRIDIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.IRIDIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_IRIDIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_IRIDIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_IRIDIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.IRIDIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_IRIDIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_IRIDIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_IRIDIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/iridium")))
					 .add(RerMaterialsBlocks.IRIDIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/iridium")))
					 .add(RerMaterialsBlocks.NETHERRACK_IRIDIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/iridium")))
					 .add(RerMaterialsBlocks.END_STONE_IRIDIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/iridium")))
					 .add(RerMaterialsBlocks.DEEPSLATE_IRIDIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.IRIDIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_IRIDIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_IRIDIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_IRIDIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.IRIDIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_IRIDIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_IRIDIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_IRIDIUM_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.LEAD_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.LEAD_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.LEAD_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.LEAD_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.LEAD_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.LEAD_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/lead")))
					 .add(RerMaterialsBlocks.LEAD_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_LEAD_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_LEAD_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_LEAD_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_LEAD_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_LEAD_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_lead")))
					 .add(RerMaterialsBlocks.RAW_LEAD_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.LEAD_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_LEAD_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_LEAD_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_LEAD_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.LEAD_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_LEAD_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_LEAD_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_LEAD_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.LEAD_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_LEAD_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_LEAD_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_LEAD_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.LEAD_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_LEAD_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_LEAD_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_LEAD_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.LEAD_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_LEAD_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_LEAD_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_LEAD_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/lead")))
					 .add(RerMaterialsBlocks.LEAD_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/lead")))
					 .add(RerMaterialsBlocks.NETHERRACK_LEAD_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/lead")))
					 .add(RerMaterialsBlocks.END_STONE_LEAD_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/lead")))
					 .add(RerMaterialsBlocks.DEEPSLATE_LEAD_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.LEAD_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_LEAD_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_LEAD_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_LEAD_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.LEAD_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_LEAD_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_LEAD_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_LEAD_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NICKEL_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NICKEL_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NICKEL_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NICKEL_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.NICKEL_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.NICKEL_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/nickel")))
					 .add(RerMaterialsBlocks.NICKEL_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_NICKEL_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_NICKEL_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_NICKEL_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_NICKEL_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_NICKEL_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_nickel")))
					 .add(RerMaterialsBlocks.RAW_NICKEL_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NICKEL_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_NICKEL_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_NICKEL_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_NICKEL_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NICKEL_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_NICKEL_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_NICKEL_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_NICKEL_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NICKEL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_NICKEL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_NICKEL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_NICKEL_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NICKEL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_NICKEL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_NICKEL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_NICKEL_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NICKEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_NICKEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_NICKEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_NICKEL_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/nickel")))
					 .add(RerMaterialsBlocks.NICKEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/nickel")))
					 .add(RerMaterialsBlocks.NETHERRACK_NICKEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/nickel")))
					 .add(RerMaterialsBlocks.END_STONE_NICKEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/nickel")))
					 .add(RerMaterialsBlocks.DEEPSLATE_NICKEL_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NICKEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_NICKEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_NICKEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_NICKEL_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.NICKEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_NICKEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_NICKEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_NICKEL_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.OSMIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.OSMIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.OSMIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.OSMIUM_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.OSMIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.OSMIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/osmium")))
					 .add(RerMaterialsBlocks.OSMIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_OSMIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_OSMIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_OSMIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_OSMIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_OSMIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_osmium")))
					 .add(RerMaterialsBlocks.RAW_OSMIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.OSMIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_OSMIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_OSMIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_OSMIUM_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.OSMIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_OSMIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_OSMIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_OSMIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.OSMIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_OSMIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_OSMIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_OSMIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.OSMIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_OSMIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_OSMIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_OSMIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.OSMIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_OSMIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_OSMIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_OSMIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/osmium")))
					 .add(RerMaterialsBlocks.OSMIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/osmium")))
					 .add(RerMaterialsBlocks.NETHERRACK_OSMIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/osmium")))
					 .add(RerMaterialsBlocks.END_STONE_OSMIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/osmium")))
					 .add(RerMaterialsBlocks.DEEPSLATE_OSMIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.OSMIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_OSMIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_OSMIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_OSMIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.OSMIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_OSMIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_OSMIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_OSMIUM_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CARMINITE_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CARMINITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CARMINITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CARMINITE_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.CARMINITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CARMINITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/carminite")))
					 .add(RerMaterialsBlocks.CARMINITE_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CARMINITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CARMINITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CARMINITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CARMINITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CARMINITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_carminite")))
					 .add(RerMaterialsBlocks.CARMINITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CARMINITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_CARMINITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_CARMINITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_CARMINITE_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CARMINITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CARMINITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CARMINITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CARMINITE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CARMINITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CARMINITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CARMINITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CARMINITE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CARMINITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CARMINITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CARMINITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CARMINITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.CARMINITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_CARMINITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_CARMINITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CARMINITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/carminite")))
					 .add(RerMaterialsBlocks.CARMINITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/carminite")))
					 .add(RerMaterialsBlocks.NETHERRACK_CARMINITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/carminite")))
					 .add(RerMaterialsBlocks.END_STONE_CARMINITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/carminite")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CARMINITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.CARMINITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_CARMINITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_CARMINITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CARMINITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.CARMINITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_CARMINITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_CARMINITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CARMINITE_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/certus_quartz")))
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_certus_quartz")))
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/certus_quartz")))
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/certus_quartz")))
					 .add(RerMaterialsBlocks.NETHERRACK_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/certus_quartz")))
					 .add(RerMaterialsBlocks.END_STONE_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/certus_quartz")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/charged_certus_quartz")))
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_charged_certus_quartz")))
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/charged_certus_quartz")))
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/charged_certus_quartz")))
					 .add(RerMaterialsBlocks.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/charged_certus_quartz")))
					 .add(RerMaterialsBlocks.END_STONE_CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/charged_certus_quartz")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_CHARGED_CERTUS_QUARTZ_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CHAROITE_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CHAROITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CHAROITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CHAROITE_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.CHAROITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CHAROITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/charoite")))
					 .add(RerMaterialsBlocks.CHAROITE_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CHAROITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CHAROITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CHAROITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CHAROITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CHAROITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_charoite")))
					 .add(RerMaterialsBlocks.CHAROITE_CLUSTER_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CHAROITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_CHAROITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_CHAROITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_CHAROITE_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CHAROITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CHAROITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CHAROITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CHAROITE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CHAROITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CHAROITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CHAROITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CHAROITE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CHAROITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_CHAROITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_CHAROITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_CHAROITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.CHAROITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_CHAROITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_CHAROITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CHAROITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/charoite")))
					 .add(RerMaterialsBlocks.CHAROITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/charoite")))
					 .add(RerMaterialsBlocks.NETHERRACK_CHAROITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/charoite")))
					 .add(RerMaterialsBlocks.END_STONE_CHAROITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/charoite")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CHAROITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.CHAROITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_CHAROITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_CHAROITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CHAROITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.CHAROITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_CHAROITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_CHAROITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CHAROITE_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.SIGNALUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.SIGNALUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.SIGNALUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.SIGNALUM_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.SIGNALUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.SIGNALUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/signalum")))
					 .add(RerMaterialsBlocks.SIGNALUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.INVAR_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.INVAR_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.INVAR_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.INVAR_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.INVAR_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.INVAR_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/invar")))
					 .add(RerMaterialsBlocks.INVAR_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.GRAPHITE_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.GRAPHITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.GRAPHITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.GRAPHITE_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.GRAPHITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.GRAPHITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/graphite")))
					 .add(RerMaterialsBlocks.GRAPHITE_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.CONSTANTAN_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.CONSTANTAN_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.CONSTANTAN_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.CONSTANTAN_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.CONSTANTAN_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CONSTANTAN_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/constantan")))
					 .add(RerMaterialsBlocks.CONSTANTAN_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.REFINED_OBSIDIAN_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.REFINED_OBSIDIAN_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.REFINED_OBSIDIAN_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.REFINED_OBSIDIAN_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.REFINED_OBSIDIAN_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.REFINED_OBSIDIAN_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/refined_obsidian")))
					 .add(RerMaterialsBlocks.REFINED_OBSIDIAN_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.REFINED_GLOWSTONE_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.REFINED_GLOWSTONE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.REFINED_GLOWSTONE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.REFINED_GLOWSTONE_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.REFINED_GLOWSTONE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.REFINED_GLOWSTONE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/refined_glowstone")))
					 .add(RerMaterialsBlocks.REFINED_GLOWSTONE_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.ORICHALCUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.ORICHALCUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.ORICHALCUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.ORICHALCUM_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.ORICHALCUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.ORICHALCUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/orichalcum")))
					 .add(RerMaterialsBlocks.ORICHALCUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.ROSE_GOLD_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.ROSE_GOLD_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.ROSE_GOLD_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.ROSE_GOLD_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.ROSE_GOLD_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.ROSE_GOLD_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/rose_gold")))
					 .add(RerMaterialsBlocks.ROSE_GOLD_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.KNIGHTMETAL_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.KNIGHTMETAL_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.KNIGHTMETAL_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.KNIGHTMETAL_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.KNIGHTMETAL_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.KNIGHTMETAL_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/knightmetal")))
					 .add(RerMaterialsBlocks.KNIGHTMETAL_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.SKY_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.SKY_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.SKY_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.SKY_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.SKY_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.SKY_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/sky")))
					 .add(RerMaterialsBlocks.SKY_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.IRONWOOD_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.IRONWOOD_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.IRONWOOD_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.IRONWOOD_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.IRONWOOD_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.IRONWOOD_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/ironwood")))
					 .add(RerMaterialsBlocks.IRONWOOD_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.TAINED_GOLD_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.TAINED_GOLD_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.TAINED_GOLD_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.TAINED_GOLD_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.TAINED_GOLD_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.TAINED_GOLD_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/tained_gold")))
					 .add(RerMaterialsBlocks.TAINED_GOLD_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.INFUSED_IRON_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.INFUSED_IRON_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.INFUSED_IRON_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.INFUSED_IRON_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.INFUSED_IRON_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.INFUSED_IRON_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/infused_iron")))
					 .add(RerMaterialsBlocks.INFUSED_IRON_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.UTHERIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.UTHERIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.UTHERIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.UTHERIUM_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.UTHERIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.UTHERIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/utherium")))
					 .add(RerMaterialsBlocks.UTHERIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_UTHERIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_UTHERIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_UTHERIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_UTHERIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_UTHERIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_utherium")))
					 .add(RerMaterialsBlocks.RAW_UTHERIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.UTHERIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_UTHERIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_UTHERIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_UTHERIUM_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.UTHERIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_UTHERIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_UTHERIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_UTHERIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.UTHERIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_UTHERIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_UTHERIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_UTHERIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.UTHERIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_UTHERIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_UTHERIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_UTHERIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.UTHERIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_UTHERIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_UTHERIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_UTHERIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/utherium")))
					 .add(RerMaterialsBlocks.UTHERIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/utherium")))
					 .add(RerMaterialsBlocks.NETHERRACK_UTHERIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/utherium")))
					 .add(RerMaterialsBlocks.END_STONE_UTHERIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/utherium")))
					 .add(RerMaterialsBlocks.DEEPSLATE_UTHERIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.UTHERIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_UTHERIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_UTHERIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_UTHERIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.UTHERIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_UTHERIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_UTHERIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_UTHERIUM_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.THALLASIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.THALLASIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.THALLASIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.THALLASIUM_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.THALLASIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.THALLASIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/thallasium")))
					 .add(RerMaterialsBlocks.THALLASIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_THALLASIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_THALLASIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_THALLASIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_THALLASIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_THALLASIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_thallasium")))
					 .add(RerMaterialsBlocks.RAW_THALLASIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.THALLASIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_THALLASIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_THALLASIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_THALLASIUM_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.THALLASIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_THALLASIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_THALLASIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_THALLASIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.THALLASIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_THALLASIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_THALLASIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_THALLASIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.THALLASIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_THALLASIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_THALLASIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_THALLASIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.THALLASIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_THALLASIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_THALLASIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_THALLASIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/thallasium")))
					 .add(RerMaterialsBlocks.THALLASIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/thallasium")))
					 .add(RerMaterialsBlocks.NETHERRACK_THALLASIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/thallasium")))
					 .add(RerMaterialsBlocks.END_STONE_THALLASIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/thallasium")))
					 .add(RerMaterialsBlocks.DEEPSLATE_THALLASIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.THALLASIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_THALLASIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_THALLASIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_THALLASIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.THALLASIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_THALLASIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_THALLASIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_THALLASIUM_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NEBU_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NEBU_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NEBU_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NEBU_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.NEBU_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.NEBU_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/nebu")))
					 .add(RerMaterialsBlocks.NEBU_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_NEBU_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_NEBU_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_NEBU_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_NEBU_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_NEBU_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_nebu")))
					 .add(RerMaterialsBlocks.RAW_NEBU_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NEBU_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_NEBU_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_NEBU_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_NEBU_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NEBU_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_NEBU_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_NEBU_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_NEBU_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NEBU_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_NEBU_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_NEBU_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_NEBU_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NEBU_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_NEBU_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_NEBU_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_NEBU_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NEBU_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_NEBU_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_NEBU_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_NEBU_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/nebu")))
					 .add(RerMaterialsBlocks.NEBU_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/nebu")))
					 .add(RerMaterialsBlocks.NETHERRACK_NEBU_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/nebu")))
					 .add(RerMaterialsBlocks.END_STONE_NEBU_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/nebu")))
					 .add(RerMaterialsBlocks.DEEPSLATE_NEBU_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NEBU_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_NEBU_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_NEBU_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_NEBU_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.NEBU_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_NEBU_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_NEBU_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_NEBU_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.REGALIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.REGALIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.REGALIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.REGALIUM_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.REGALIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.REGALIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/regalium")))
					 .add(RerMaterialsBlocks.REGALIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_REGALIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_REGALIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_REGALIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_REGALIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_REGALIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_regalium")))
					 .add(RerMaterialsBlocks.RAW_REGALIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.REGALIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_REGALIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_REGALIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_REGALIUM_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.REGALIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_REGALIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_REGALIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_REGALIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.REGALIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_REGALIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_REGALIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_REGALIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.REGALIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_REGALIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_REGALIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_REGALIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.REGALIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_REGALIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_REGALIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_REGALIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/regalium")))
					 .add(RerMaterialsBlocks.REGALIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/regalium")))
					 .add(RerMaterialsBlocks.NETHERRACK_REGALIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/regalium")))
					 .add(RerMaterialsBlocks.END_STONE_REGALIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/regalium")))
					 .add(RerMaterialsBlocks.DEEPSLATE_REGALIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.REGALIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_REGALIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_REGALIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_REGALIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.REGALIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_REGALIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_REGALIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_REGALIUM_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.FROSTSTEEL_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.FROSTSTEEL_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.FROSTSTEEL_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.FROSTSTEEL_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.FROSTSTEEL_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.FROSTSTEEL_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/froststeel")))
					 .add(RerMaterialsBlocks.FROSTSTEEL_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_FROSTSTEEL_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_FROSTSTEEL_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_FROSTSTEEL_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_FROSTSTEEL_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_FROSTSTEEL_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_froststeel")))
					 .add(RerMaterialsBlocks.RAW_FROSTSTEEL_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.FROSTSTEEL_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_FROSTSTEEL_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_FROSTSTEEL_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_FROSTSTEEL_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.FROSTSTEEL_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_FROSTSTEEL_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_FROSTSTEEL_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_FROSTSTEEL_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.FROSTSTEEL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_FROSTSTEEL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_FROSTSTEEL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_FROSTSTEEL_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.FROSTSTEEL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_FROSTSTEEL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_FROSTSTEEL_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_FROSTSTEEL_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.FROSTSTEEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_FROSTSTEEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_FROSTSTEEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_FROSTSTEEL_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/froststeel")))
					 .add(RerMaterialsBlocks.FROSTSTEEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/froststeel")))
					 .add(RerMaterialsBlocks.NETHERRACK_FROSTSTEEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/froststeel")))
					 .add(RerMaterialsBlocks.END_STONE_FROSTSTEEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/froststeel")))
					 .add(RerMaterialsBlocks.DEEPSLATE_FROSTSTEEL_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.FROSTSTEEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_FROSTSTEEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_FROSTSTEEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_FROSTSTEEL_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.FROSTSTEEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_FROSTSTEEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_FROSTSTEEL_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_FROSTSTEEL_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.FALSITE_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.FALSITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.FALSITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.FALSITE_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.FALSITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.FALSITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/falsite")))
					 .add(RerMaterialsBlocks.FALSITE_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_FALSITE_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_FALSITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_FALSITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_FALSITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_FALSITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_falsite")))
					 .add(RerMaterialsBlocks.RAW_FALSITE_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.FALSITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_FALSITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_FALSITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_FALSITE_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.FALSITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_FALSITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_FALSITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_FALSITE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.FALSITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_FALSITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_FALSITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_FALSITE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.FALSITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_FALSITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_FALSITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_FALSITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.FALSITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_FALSITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_FALSITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_FALSITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/falsite")))
					 .add(RerMaterialsBlocks.FALSITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/falsite")))
					 .add(RerMaterialsBlocks.NETHERRACK_FALSITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/falsite")))
					 .add(RerMaterialsBlocks.END_STONE_FALSITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/falsite")))
					 .add(RerMaterialsBlocks.DEEPSLATE_FALSITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.FALSITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_FALSITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_FALSITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_FALSITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.FALSITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_FALSITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_FALSITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_FALSITE_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.HORIZONITE_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.HORIZONITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.HORIZONITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.HORIZONITE_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.HORIZONITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.HORIZONITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/horizonite")))
					 .add(RerMaterialsBlocks.HORIZONITE_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_HORIZONITE_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_HORIZONITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_HORIZONITE_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_HORIZONITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_HORIZONITE_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_horizonite")))
					 .add(RerMaterialsBlocks.RAW_HORIZONITE_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.HORIZONITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_HORIZONITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_HORIZONITE_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_HORIZONITE_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.HORIZONITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_HORIZONITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_HORIZONITE_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_HORIZONITE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.HORIZONITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_HORIZONITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_HORIZONITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_HORIZONITE_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.HORIZONITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_HORIZONITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_HORIZONITE_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_HORIZONITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.HORIZONITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_HORIZONITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_HORIZONITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_HORIZONITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/horizonite")))
					 .add(RerMaterialsBlocks.HORIZONITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/horizonite")))
					 .add(RerMaterialsBlocks.NETHERRACK_HORIZONITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/horizonite")))
					 .add(RerMaterialsBlocks.END_STONE_HORIZONITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/horizonite")))
					 .add(RerMaterialsBlocks.DEEPSLATE_HORIZONITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.HORIZONITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_HORIZONITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_HORIZONITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_HORIZONITE_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.HORIZONITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_HORIZONITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_HORIZONITE_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_HORIZONITE_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.IESNIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.IESNIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.IESNIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.IESNIUM_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.IESNIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.IESNIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/iesnium")))
					 .add(RerMaterialsBlocks.IESNIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_IESNIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_IESNIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_IESNIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_IESNIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_IESNIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_iesnium")))
					 .add(RerMaterialsBlocks.RAW_IESNIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.IESNIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_IESNIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_IESNIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_IESNIUM_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.IESNIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_IESNIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_IESNIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_IESNIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.IESNIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_IESNIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_IESNIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_IESNIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.IESNIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_IESNIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_IESNIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_IESNIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.IESNIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_IESNIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_IESNIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_IESNIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/iesnium")))
					 .add(RerMaterialsBlocks.IESNIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/iesnium")))
					 .add(RerMaterialsBlocks.NETHERRACK_IESNIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/iesnium")))
					 .add(RerMaterialsBlocks.END_STONE_IESNIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/iesnium")))
					 .add(RerMaterialsBlocks.DEEPSLATE_IESNIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.IESNIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_IESNIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_IESNIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_IESNIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.IESNIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_IESNIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_IESNIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_IESNIUM_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.TUNGSTEN_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.TUNGSTEN_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.TUNGSTEN_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.TUNGSTEN_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.TUNGSTEN_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.TUNGSTEN_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/tungsten")))
					 .add(RerMaterialsBlocks.TUNGSTEN_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_TUNGSTEN_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_TUNGSTEN_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_TUNGSTEN_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_TUNGSTEN_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_TUNGSTEN_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_tungsten")))
					 .add(RerMaterialsBlocks.RAW_TUNGSTEN_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.TUNGSTEN_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_TUNGSTEN_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_TUNGSTEN_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_TUNGSTEN_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.TUNGSTEN_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_TUNGSTEN_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_TUNGSTEN_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_TUNGSTEN_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.TUNGSTEN_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_TUNGSTEN_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_TUNGSTEN_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_TUNGSTEN_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.TUNGSTEN_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_TUNGSTEN_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_TUNGSTEN_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_TUNGSTEN_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.TUNGSTEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_TUNGSTEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_TUNGSTEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_TUNGSTEN_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/tungsten")))
					 .add(RerMaterialsBlocks.TUNGSTEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/tungsten")))
					 .add(RerMaterialsBlocks.NETHERRACK_TUNGSTEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/tungsten")))
					 .add(RerMaterialsBlocks.END_STONE_TUNGSTEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/tungsten")))
					 .add(RerMaterialsBlocks.DEEPSLATE_TUNGSTEN_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.TUNGSTEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_TUNGSTEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_TUNGSTEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_TUNGSTEN_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.TUNGSTEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_TUNGSTEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_TUNGSTEN_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_TUNGSTEN_ORE.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.VENTIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.VENTIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.VENTIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.VENTIUM_BLOCK.get());

		  tag(BlockTags.BEACON_BASE_BLOCKS)
					 .add(RerMaterialsBlocks.VENTIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.VENTIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/ventium")))
					 .add(RerMaterialsBlocks.VENTIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.RAW_VENTIUM_BLOCK.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.RAW_VENTIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.RAW_VENTIUM_BLOCK.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.RAW_VENTIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_VENTIUM_BLOCK.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_ventium")))
					 .add(RerMaterialsBlocks.RAW_VENTIUM_BLOCK.get());

		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.VENTIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.NETHERRACK_VENTIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.END_STONE_VENTIUM_ORE.get());
		  tag(BlockTags.MINEABLE_WITH_PICKAXE)
					 .add(RerMaterialsBlocks.DEEPSLATE_VENTIUM_ORE.get());

		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.VENTIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_VENTIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_VENTIUM_ORE.get());
		  tag(BlockTags.NEEDS_STONE_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_VENTIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.VENTIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_VENTIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_VENTIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_GOLD_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_VENTIUM_ORE.get());

		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.VENTIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.NETHERRACK_VENTIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.END_STONE_VENTIUM_ORE.get());
		  tag(BlockTags.INCORRECT_FOR_WOODEN_TOOL)
					 .add(RerMaterialsBlocks.DEEPSLATE_VENTIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.VENTIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_VENTIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_VENTIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_VENTIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/ventium")))
					 .add(RerMaterialsBlocks.VENTIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/ventium")))
					 .add(RerMaterialsBlocks.NETHERRACK_VENTIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/ventium")))
					 .add(RerMaterialsBlocks.END_STONE_VENTIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/ventium")))
					 .add(RerMaterialsBlocks.DEEPSLATE_VENTIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.VENTIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_VENTIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_VENTIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_VENTIUM_ORE.get());

		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.VENTIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_VENTIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_VENTIUM_ORE.get());
		  tag(BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_VENTIUM_ORE.get());
	 }
}
