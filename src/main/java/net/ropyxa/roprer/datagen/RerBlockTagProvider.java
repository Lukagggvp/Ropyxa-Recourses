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
	 }
}
