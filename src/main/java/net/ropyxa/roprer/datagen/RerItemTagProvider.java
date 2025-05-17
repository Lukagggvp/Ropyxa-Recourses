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
					 .add(RerMaterials.TIN_NUGGET.get())
					 .add(RerMaterials.APATITE_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/tin")))
					 .add(RerMaterials.TIN_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/apatite")))
					 .add(RerMaterials.APATITE_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.TIN_PLATE.get())
					 .add(RerMaterials.APATITE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/tin")))
					 .add(RerMaterials.TIN_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/apatite")))
					 .add(RerMaterials.APATITE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.TIN_LARGE_PLATE.get())
					 .add(RerMaterials.APATITE_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/tin")))
					 .add(RerMaterials.TIN_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/apatite")))
					 .add(RerMaterials.APATITE_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.TIN_ROD.get())
					 .add(RerMaterials.APATITE_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/tin")))
					 .add(RerMaterials.TIN_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/apatite")))
					 .add(RerMaterials.APATITE_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.TIN_WIRE.get())
					 .add(RerMaterials.APATITE_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/tin")))
					 .add(RerMaterials.TIN_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/apatite")))
					 .add(RerMaterials.APATITE_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.TIN_GEAR.get())
					 .add(RerMaterials.APATITE_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/tin")))
					 .add(RerMaterials.TIN_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/apatite")))
					 .add(RerMaterials.APATITE_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.TIN_DUST.get())
					 .add(RerMaterials.APATITE_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/tin")))
					 .add(RerMaterials.TIN_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/apatite")))
					 .add(RerMaterials.APATITE_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.TIN_TINY_DUST.get())
					 .add(RerMaterials.APATITE_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/tin")))
					 .add(RerMaterials.TIN_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/apatite")))
					 .add(RerMaterials.APATITE_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.TIN_RING.get())
					 .add(RerMaterials.APATITE_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/tin")))
					 .add(RerMaterials.TIN_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/apatite")))
					 .add(RerMaterials.APATITE_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.TIN_BOLT.get())
					 .add(RerMaterials.APATITE_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/tin")))
					 .add(RerMaterials.TIN_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/apatite")))
					 .add(RerMaterials.APATITE_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.TIN_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/tin")))
					 .add(RerMaterials.TIN_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems")))
					 .add(RerMaterials.APATITE_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems/apatite")))
					 .add(RerMaterials.APATITE_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.TIN_CURVED_PLATE.get())
					 .add(RerMaterials.APATITE_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/tin")))
					 .add(RerMaterials.TIN_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/apatite")))
					 .add(RerMaterials.APATITE_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores")))
					 .add(RerMaterials.CRUSHED_TIN_ORE.get())
					 .add(RerMaterials.CRUSHED_APATITE_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores/tin")))
					 .add(RerMaterials.CRUSHED_TIN_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores/apatite")))
					 .add(RerMaterials.CRUSHED_APATITE_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.TIN_CHUNK.get())
					 .add(RerMaterials.APATITE_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/tin")))
					 .add(RerMaterials.TIN_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/apatite")))
					 .add(RerMaterials.APATITE_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.TIN_CLUSTER.get())
					 .add(RerMaterials.APATITE_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/tin")))
					 .add(RerMaterials.TIN_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/apatite")))
					 .add(RerMaterials.APATITE_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals")))
					 .add(RerMaterials.TIN_CRYSTAL.get())
					 .add(RerMaterials.APATITE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals/tin")))
					 .add(RerMaterials.TIN_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals/apatite")))
					 .add(RerMaterials.APATITE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards")))
					 .add(RerMaterials.TIN_SHARD.get())
					 .add(RerMaterials.APATITE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards/tin")))
					 .add(RerMaterials.TIN_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards/apatite")))
					 .add(RerMaterials.APATITE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps")))
					 .add(RerMaterials.TIN_CLUMP.get())
					 .add(RerMaterials.APATITE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps/tin")))
					 .add(RerMaterials.TIN_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps/apatite")))
					 .add(RerMaterials.APATITE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts")))
					 .add(RerMaterials.TIN_DIRTY_DUST.get())
					 .add(RerMaterials.APATITE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts/tin")))
					 .add(RerMaterials.TIN_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts/apatite")))
					 .add(RerMaterials.APATITE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals")))
					 .add(RerMaterials.TIN_CRYSTAL.get())
					 .add(RerMaterials.APATITE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals/tin")))
					 .add(RerMaterials.TIN_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals/apatite")))
					 .add(RerMaterials.APATITE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards")))
					 .add(RerMaterials.TIN_SHARD.get())
					 .add(RerMaterials.APATITE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards/tin")))
					 .add(RerMaterials.TIN_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards/apatite")))
					 .add(RerMaterials.APATITE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps")))
					 .add(RerMaterials.TIN_CLUMP.get())
					 .add(RerMaterials.APATITE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps/tin")))
					 .add(RerMaterials.TIN_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps/apatite")))
					 .add(RerMaterials.APATITE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts")))
					 .add(RerMaterials.TIN_DIRTY_DUST.get())
					 .add(RerMaterials.APATITE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts/tin")))
					 .add(RerMaterials.TIN_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts/apatite")))
					 .add(RerMaterials.APATITE_DIRTY_DUST.get());



		  //BLOCKS

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
