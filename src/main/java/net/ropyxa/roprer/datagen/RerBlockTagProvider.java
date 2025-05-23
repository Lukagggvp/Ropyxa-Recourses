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

	 @Override
	 protected void addTags(HolderLookup.Provider provider) {
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
	 }
}
