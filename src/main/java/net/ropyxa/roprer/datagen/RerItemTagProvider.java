package net.ropyxa.roprer.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.ropyxa.roprer.RopRer;
import net.ropyxa.roprer.block.RerMaterialsBlocks;
import net.ropyxa.roprer.item.RerMaterials;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class RerItemTagProvider extends ItemTagsProvider {
	 public RerItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
		  super(output, lookupProvider, blockTags, RopRer.MOD_ID, existingFileHelper);
	 }

	 @Override
	 protected void addTags(HolderLookup.Provider provider) {
		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.TIN_INGOT.get())
					 .add(RerMaterials.APATITE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.TIN_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/tin")))
					 .add(RerMaterials.TIN_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems")))
					 .add(RerMaterials.APATITE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems/apatite")))
					 .add(RerMaterials.APATITE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials")))
					 .add(RerMaterials.RAW_TIN.get())
					 .add(RerMaterials.APATITE_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/tin")))
					 .add(RerMaterials.RAW_TIN.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/apatite")))
					 .add(RerMaterials.APATITE_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.TIN_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/tin")))
					 .add(RerMaterials.TIN_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.TIN_BLOCK.get().asItem())
					 .add(RerMaterialsBlocks.RAW_TIN_BLOCK.get().asItem())
					 .add(RerMaterialsBlocks.APATITE_BLOCK.get().asItem())
					 .add(RerMaterialsBlocks.APATITE_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/tin")))
					 .add(RerMaterialsBlocks.TIN_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_tin")))
					 .add(RerMaterialsBlocks.RAW_TIN_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/apatite")))
					 .add(RerMaterialsBlocks.APATITE_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_apatite")))
					 .add(RerMaterialsBlocks.APATITE_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.TIN_ORE.get().asItem())
					 .add(RerMaterialsBlocks.NETHERRACK_TIN_ORE.get().asItem())
					 .add(RerMaterialsBlocks.END_STONE_TIN_ORE.get().asItem())
					 .add(RerMaterialsBlocks.DEEPSLATE_TIN_ORE.get().asItem())
					 .add(RerMaterialsBlocks.APATITE_ORE.get().asItem())
					 .add(RerMaterialsBlocks.NETHERRACK_APATITE_ORE.get().asItem())
					 .add(RerMaterialsBlocks.END_STONE_APATITE_ORE.get().asItem())
					 .add(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/tin")))
					 .add(RerMaterialsBlocks.TIN_ORE.get().asItem())
					 .add(RerMaterialsBlocks.NETHERRACK_TIN_ORE.get().asItem())
					 .add(RerMaterialsBlocks.END_STONE_TIN_ORE.get().asItem())
					 .add(RerMaterialsBlocks.DEEPSLATE_TIN_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/apatite")))
					 .add(RerMaterialsBlocks.APATITE_ORE.get().asItem())
					 .add(RerMaterialsBlocks.NETHERRACK_APATITE_ORE.get().asItem())
					 .add(RerMaterialsBlocks.END_STONE_APATITE_ORE.get().asItem())
					 .add(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.TIN_ORE.get().asItem())
					 .add(RerMaterialsBlocks.NETHERRACK_TIN_ORE.get().asItem())
					 .add(RerMaterialsBlocks.END_STONE_TIN_ORE.get().asItem())
					 .add(RerMaterialsBlocks.DEEPSLATE_TIN_ORE.get().asItem())
					 .add(RerMaterialsBlocks.APATITE_ORE.get().asItem())
					 .add(RerMaterialsBlocks.NETHERRACK_APATITE_ORE.get().asItem())
					 .add(RerMaterialsBlocks.END_STONE_APATITE_ORE.get().asItem())
					 .add(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.TIN_ORE.get().asItem())
					 .add(RerMaterialsBlocks.APATITE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_TIN_ORE.get().asItem())
					 .add(RerMaterialsBlocks.NETHERRACK_APATITE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_TIN_ORE.get().asItem())
					 .add(RerMaterialsBlocks.END_STONE_APATITE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_TIN_ORE.get().asItem())
					 .add(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE.get().asItem());
	 }
}
