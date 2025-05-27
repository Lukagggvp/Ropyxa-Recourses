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

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.COBALT_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.COBALT_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/cobalt")))
					 .add(RerMaterials.COBALT_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.COBALT_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/cobalt")))
					 .add(RerMaterials.COBALT_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials")))
					 .add(RerMaterials.RAW_COBALT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/cobalt")))
					 .add(RerMaterials.RAW_COBALT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.COBALT_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/cobalt")))
					 .add(RerMaterials.COBALT_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.COBALT_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/cobalt")))
					 .add(RerMaterials.COBALT_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.COBALT_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/cobalt")))
					 .add(RerMaterials.COBALT_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.COBALT_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/cobalt")))
					 .add(RerMaterials.COBALT_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.COBALT_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/cobalt")))
					 .add(RerMaterials.COBALT_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.COBALT_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/cobalt")))
					 .add(RerMaterials.COBALT_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.COBALT_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/cobalt")))
					 .add(RerMaterials.COBALT_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.COBALT_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/cobalt")))
					 .add(RerMaterials.COBALT_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.COBALT_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/cobalt")))
					 .add(RerMaterials.COBALT_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.COBALT_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/cobalt")))
					 .add(RerMaterials.COBALT_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores")))
					 .add(RerMaterials.CRUSHED_COBALT_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores/cobalt")))
					 .add(RerMaterials.CRUSHED_COBALT_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.COBALT_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/cobalt")))
					 .add(RerMaterials.COBALT_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.COBALT_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/cobalt")))
					 .add(RerMaterials.COBALT_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals")))
					 .add(RerMaterials.COBALT_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals/cobalt")))
					 .add(RerMaterials.COBALT_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals")))
					 .add(RerMaterials.COBALT_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals/cobalt")))
					 .add(RerMaterials.COBALT_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards")))
					 .add(RerMaterials.COBALT_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards/cobalt")))
					 .add(RerMaterials.COBALT_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards")))
					 .add(RerMaterials.COBALT_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards/cobalt")))
					 .add(RerMaterials.COBALT_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps")))
					 .add(RerMaterials.COBALT_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps/cobalt")))
					 .add(RerMaterials.COBALT_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps")))
					 .add(RerMaterials.COBALT_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps/cobalt")))
					 .add(RerMaterials.COBALT_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts")))
					 .add(RerMaterials.COBALT_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts/cobalt")))
					 .add(RerMaterials.COBALT_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts")))
					 .add(RerMaterials.COBALT_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts/cobalt")))
					 .add(RerMaterials.COBALT_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.COBALT_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/cobalt")))
					 .add(RerMaterials.COBALT_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.CINNABAR_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems")))
					 .add(RerMaterials.CINNABAR_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems/cinnabar")))
					 .add(RerMaterials.CINNABAR_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.CINNABAR_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/cinnabar")))
					 .add(RerMaterials.CINNABAR_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials")))
					 .add(RerMaterials.CINNABAR_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/cinnabar")))
					 .add(RerMaterials.CINNABAR_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.CINNABAR_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/cinnabar")))
					 .add(RerMaterials.CINNABAR_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.CINNABAR_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/cinnabar")))
					 .add(RerMaterials.CINNABAR_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.CINNABAR_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/cinnabar")))
					 .add(RerMaterials.CINNABAR_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.CINNABAR_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/cinnabar")))
					 .add(RerMaterials.CINNABAR_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.CINNABAR_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/cinnabar")))
					 .add(RerMaterials.CINNABAR_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.CINNABAR_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/cinnabar")))
					 .add(RerMaterials.CINNABAR_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.CINNABAR_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/cinnabar")))
					 .add(RerMaterials.CINNABAR_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.CINNABAR_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/cinnabar")))
					 .add(RerMaterials.CINNABAR_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems")))
					 .add(RerMaterials.CINNABAR_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems/cinnabar")))
					 .add(RerMaterials.CINNABAR_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.CINNABAR_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/cinnabar")))
					 .add(RerMaterials.CINNABAR_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores")))
					 .add(RerMaterials.CRUSHED_CINNABAR_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores/cinnabar")))
					 .add(RerMaterials.CRUSHED_CINNABAR_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.CINNABAR_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/cinnabar")))
					 .add(RerMaterials.CINNABAR_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.CINNABAR_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/cinnabar")))
					 .add(RerMaterials.CINNABAR_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals")))
					 .add(RerMaterials.CINNABAR_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals/cinnabar")))
					 .add(RerMaterials.CINNABAR_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals")))
					 .add(RerMaterials.CINNABAR_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals/cinnabar")))
					 .add(RerMaterials.CINNABAR_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards")))
					 .add(RerMaterials.CINNABAR_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards/cinnabar")))
					 .add(RerMaterials.CINNABAR_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards")))
					 .add(RerMaterials.CINNABAR_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards/cinnabar")))
					 .add(RerMaterials.CINNABAR_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps")))
					 .add(RerMaterials.CINNABAR_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps/cinnabar")))
					 .add(RerMaterials.CINNABAR_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps")))
					 .add(RerMaterials.CINNABAR_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps/cinnabar")))
					 .add(RerMaterials.CINNABAR_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts")))
					 .add(RerMaterials.CINNABAR_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts/cinnabar")))
					 .add(RerMaterials.CINNABAR_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts")))
					 .add(RerMaterials.CINNABAR_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts/cinnabar")))
					 .add(RerMaterials.CINNABAR_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.CINNABAR_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/cinnabar")))
					 .add(RerMaterials.CINNABAR_RING.get());

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

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.BRASS_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.BRASS_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/brass")))
					 .add(RerMaterials.BRASS_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.BRASS_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/brass")))
					 .add(RerMaterials.BRASS_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.BRASS_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/brass")))
					 .add(RerMaterials.BRASS_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.BRASS_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/brass")))
					 .add(RerMaterials.BRASS_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.BRASS_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/brass")))
					 .add(RerMaterials.BRASS_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.BRASS_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/brass")))
					 .add(RerMaterials.BRASS_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.BRASS_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/brass")))
					 .add(RerMaterials.BRASS_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.BRASS_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/brass")))
					 .add(RerMaterials.BRASS_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.BRASS_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/brass")))
					 .add(RerMaterials.BRASS_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.BRASS_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/brass")))
					 .add(RerMaterials.BRASS_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.BRASS_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/brass")))
					 .add(RerMaterials.BRASS_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.BRASS_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/brass")))
					 .add(RerMaterials.BRASS_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.BRASS_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/brass")))
					 .add(RerMaterials.BRASS_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.BRASS_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/brass")))
					 .add(RerMaterials.BRASS_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.BRASS_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/brass")))
					 .add(RerMaterials.BRASS_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.BRONZE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.BRONZE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/bronze")))
					 .add(RerMaterials.BRONZE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.BRONZE_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/bronze")))
					 .add(RerMaterials.BRONZE_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.BRONZE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/bronze")))
					 .add(RerMaterials.BRONZE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.BRONZE_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/bronze")))
					 .add(RerMaterials.BRONZE_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.BRONZE_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/bronze")))
					 .add(RerMaterials.BRONZE_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.BRONZE_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/bronze")))
					 .add(RerMaterials.BRONZE_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.BRONZE_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/bronze")))
					 .add(RerMaterials.BRONZE_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.BRONZE_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/bronze")))
					 .add(RerMaterials.BRONZE_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.BRONZE_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/bronze")))
					 .add(RerMaterials.BRONZE_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.BRONZE_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/bronze")))
					 .add(RerMaterials.BRONZE_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.BRONZE_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/bronze")))
					 .add(RerMaterials.BRONZE_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.BRONZE_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/bronze")))
					 .add(RerMaterials.BRONZE_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.BRONZE_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/bronze")))
					 .add(RerMaterials.BRONZE_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.BRONZE_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/bronze")))
					 .add(RerMaterials.BRONZE_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.BRONZE_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/bronze")))
					 .add(RerMaterials.BRONZE_RING.get());

		  //GEM_BLOCK_ITEM_TAG_GEN
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CINNABAR_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cinnabar")))
					 .add(RerMaterialsBlocks.CINNABAR_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CINNABAR_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_cinnabar")))
					 .add(RerMaterialsBlocks.CINNABAR_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.CINNABAR_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_CINNABAR_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cinnabar")))
					 .add(RerMaterialsBlocks.CINNABAR_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cinnabar")))
					 .add(RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cinnabar")))
					 .add(RerMaterialsBlocks.END_STONE_CINNABAR_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cinnabar")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.CINNABAR_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_CINNABAR_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.CINNABAR_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_CINNABAR_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE.get().asItem());


		  //BLOCK_ITEM_TAG_GEN
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.COBALT_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cobalt")))
					 .add(RerMaterialsBlocks.COBALT_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_COBALT_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_cobalt")))
					 .add(RerMaterialsBlocks.RAW_COBALT_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.COBALT_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_COBALT_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_COBALT_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_COBALT_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cobalt")))
					 .add(RerMaterialsBlocks.COBALT_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cobalt")))
					 .add(RerMaterialsBlocks.NETHERRACK_COBALT_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cobalt")))
					 .add(RerMaterialsBlocks.END_STONE_COBALT_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/cobalt")))
					 .add(RerMaterialsBlocks.DEEPSLATE_COBALT_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.COBALT_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_COBALT_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_COBALT_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_COBALT_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.COBALT_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_COBALT_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_COBALT_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_COBALT_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.BRASS_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/brass")))
					 .add(RerMaterialsBlocks.BRASS_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.BRONZE_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/bronze")))
					 .add(RerMaterialsBlocks.BRONZE_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CAST_IRON_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cast_iron")))
					 .add(RerMaterialsBlocks.CAST_IRON_BLOCK.get().asItem());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.CAST_IRON_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.CAST_IRON_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/cast_iron")))
					 .add(RerMaterials.CAST_IRON_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.CAST_IRON_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/cast_iron")))
					 .add(RerMaterials.CAST_IRON_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.CAST_IRON_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/cast_iron")))
					 .add(RerMaterials.CAST_IRON_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.CAST_IRON_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/cast_iron")))
					 .add(RerMaterials.CAST_IRON_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.CAST_IRON_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/cast_iron")))
					 .add(RerMaterials.CAST_IRON_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.CAST_IRON_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/cast_iron")))
					 .add(RerMaterials.CAST_IRON_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.CAST_IRON_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/cast_iron")))
					 .add(RerMaterials.CAST_IRON_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.CAST_IRON_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/cast_iron")))
					 .add(RerMaterials.CAST_IRON_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.CAST_IRON_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/cast_iron")))
					 .add(RerMaterials.CAST_IRON_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.CAST_IRON_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/cast_iron")))
					 .add(RerMaterials.CAST_IRON_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.CAST_IRON_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/cast_iron")))
					 .add(RerMaterials.CAST_IRON_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.CAST_IRON_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/cast_iron")))
					 .add(RerMaterials.CAST_IRON_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.CAST_IRON_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/cast_iron")))
					 .add(RerMaterials.CAST_IRON_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.CAST_IRON_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/cast_iron")))
					 .add(RerMaterials.CAST_IRON_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.CAST_IRON_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/cast_iron")))
					 .add(RerMaterials.CAST_IRON_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.SOUL_STEEL_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/soul_steel")))
					 .add(RerMaterialsBlocks.SOUL_STEEL_BLOCK.get().asItem());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.SOUL_STEEL_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.SOUL_STEEL_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/soul_steel")))
					 .add(RerMaterials.SOUL_STEEL_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.SOUL_STEEL_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/soul_steel")))
					 .add(RerMaterials.SOUL_STEEL_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.SOUL_STEEL_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/soul_steel")))
					 .add(RerMaterials.SOUL_STEEL_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.SOUL_STEEL_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/soul_steel")))
					 .add(RerMaterials.SOUL_STEEL_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.SOUL_STEEL_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/soul_steel")))
					 .add(RerMaterials.SOUL_STEEL_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.SOUL_STEEL_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/soul_steel")))
					 .add(RerMaterials.SOUL_STEEL_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.SOUL_STEEL_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/soul_steel")))
					 .add(RerMaterials.SOUL_STEEL_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.SOUL_STEEL_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/soul_steel")))
					 .add(RerMaterials.SOUL_STEEL_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.SOUL_STEEL_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/soul_steel")))
					 .add(RerMaterials.SOUL_STEEL_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.SOUL_STEEL_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/soul_steel")))
					 .add(RerMaterials.SOUL_STEEL_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.SOUL_STEEL_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/soul_steel")))
					 .add(RerMaterials.SOUL_STEEL_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.SOUL_STEEL_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/soul_steel")))
					 .add(RerMaterials.SOUL_STEEL_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.SOUL_STEEL_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/soul_steel")))
					 .add(RerMaterials.SOUL_STEEL_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.SOUL_STEEL_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/soul_steel")))
					 .add(RerMaterials.SOUL_STEEL_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.SOUL_STEEL_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/soul_steel")))
					 .add(RerMaterials.SOUL_STEEL_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.STEEL_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/steel")))
					 .add(RerMaterialsBlocks.STEEL_BLOCK.get().asItem());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.STEEL_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.STEEL_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/steel")))
					 .add(RerMaterials.STEEL_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.STEEL_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/steel")))
					 .add(RerMaterials.STEEL_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.STEEL_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/steel")))
					 .add(RerMaterials.STEEL_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.STEEL_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/steel")))
					 .add(RerMaterials.STEEL_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.STEEL_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/steel")))
					 .add(RerMaterials.STEEL_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.STEEL_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/steel")))
					 .add(RerMaterials.STEEL_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.STEEL_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/steel")))
					 .add(RerMaterials.STEEL_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.STEEL_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/steel")))
					 .add(RerMaterials.STEEL_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.STEEL_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/steel")))
					 .add(RerMaterials.STEEL_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.STEEL_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/steel")))
					 .add(RerMaterials.STEEL_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.STEEL_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/steel")))
					 .add(RerMaterials.STEEL_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.STEEL_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/steel")))
					 .add(RerMaterials.STEEL_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.STEEL_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/steel")))
					 .add(RerMaterials.STEEL_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.STEEL_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/steel")))
					 .add(RerMaterials.STEEL_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.STEEL_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/steel")))
					 .add(RerMaterials.STEEL_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.ALUMINUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.ALUMINUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/aluminum")))
					 .add(RerMaterials.ALUMINUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.ALUMINUM_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/aluminum")))
					 .add(RerMaterials.ALUMINUM_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials")))
					 .add(RerMaterials.RAW_ALUMINUM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/aluminum")))
					 .add(RerMaterials.RAW_ALUMINUM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.ALUMINUM_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/aluminum")))
					 .add(RerMaterials.ALUMINUM_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.ALUMINUM_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/aluminum")))
					 .add(RerMaterials.ALUMINUM_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.ALUMINUM_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/aluminum")))
					 .add(RerMaterials.ALUMINUM_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.ALUMINUM_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/aluminum")))
					 .add(RerMaterials.ALUMINUM_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.ALUMINUM_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/aluminum")))
					 .add(RerMaterials.ALUMINUM_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.ALUMINUM_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/aluminum")))
					 .add(RerMaterials.ALUMINUM_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.ALUMINUM_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/aluminum")))
					 .add(RerMaterials.ALUMINUM_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.ALUMINUM_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/aluminum")))
					 .add(RerMaterials.ALUMINUM_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.ALUMINUM_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/aluminum")))
					 .add(RerMaterials.ALUMINUM_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.ALUMINUM_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/aluminum")))
					 .add(RerMaterials.ALUMINUM_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores")))
					 .add(RerMaterials.CRUSHED_ALUMINUM_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores/aluminum")))
					 .add(RerMaterials.CRUSHED_ALUMINUM_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.ALUMINUM_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/aluminum")))
					 .add(RerMaterials.ALUMINUM_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.ALUMINUM_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/aluminum")))
					 .add(RerMaterials.ALUMINUM_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals")))
					 .add(RerMaterials.ALUMINUM_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals/aluminum")))
					 .add(RerMaterials.ALUMINUM_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals")))
					 .add(RerMaterials.ALUMINUM_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals/aluminum")))
					 .add(RerMaterials.ALUMINUM_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards")))
					 .add(RerMaterials.ALUMINUM_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards/aluminum")))
					 .add(RerMaterials.ALUMINUM_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards")))
					 .add(RerMaterials.ALUMINUM_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards/aluminum")))
					 .add(RerMaterials.ALUMINUM_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps")))
					 .add(RerMaterials.ALUMINUM_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps/aluminum")))
					 .add(RerMaterials.ALUMINUM_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps")))
					 .add(RerMaterials.ALUMINUM_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps/aluminum")))
					 .add(RerMaterials.ALUMINUM_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts")))
					 .add(RerMaterials.ALUMINUM_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts/aluminum")))
					 .add(RerMaterials.ALUMINUM_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts")))
					 .add(RerMaterials.ALUMINUM_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts/aluminum")))
					 .add(RerMaterials.ALUMINUM_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.ALUMINUM_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/aluminum")))
					 .add(RerMaterials.ALUMINUM_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.ALUMINUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/aluminum")))
					 .add(RerMaterialsBlocks.ALUMINUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_ALUMINUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_aluminum")))
					 .add(RerMaterialsBlocks.RAW_ALUMINUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.ALUMINUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_ALUMINUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_ALUMINUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ALUMINUM_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/aluminum")))
					 .add(RerMaterialsBlocks.ALUMINUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/aluminum")))
					 .add(RerMaterialsBlocks.NETHERRACK_ALUMINUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/aluminum")))
					 .add(RerMaterialsBlocks.END_STONE_ALUMINUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/aluminum")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ALUMINUM_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.ALUMINUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_ALUMINUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_ALUMINUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ALUMINUM_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.ALUMINUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_ALUMINUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_ALUMINUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ALUMINUM_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.AQUITE_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/aquite")))
					 .add(RerMaterialsBlocks.AQUITE_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.AQUITE_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_aquite")))
					 .add(RerMaterialsBlocks.AQUITE_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.AQUITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_AQUITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_AQUITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_AQUITE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/aquite")))
					 .add(RerMaterialsBlocks.AQUITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/aquite")))
					 .add(RerMaterialsBlocks.NETHERRACK_AQUITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/aquite")))
					 .add(RerMaterialsBlocks.END_STONE_AQUITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/aquite")))
					 .add(RerMaterialsBlocks.DEEPSLATE_AQUITE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.AQUITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_AQUITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_AQUITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_AQUITE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.AQUITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_AQUITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_AQUITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_AQUITE_ORE.get().asItem());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.AQUITE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems")))
					 .add(RerMaterials.AQUITE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems/aquite")))
					 .add(RerMaterials.AQUITE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.AQUITE_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/aquite")))
					 .add(RerMaterials.AQUITE_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials")))
					 .add(RerMaterials.AQUITE_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/aquite")))
					 .add(RerMaterials.AQUITE_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.AQUITE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/aquite")))
					 .add(RerMaterials.AQUITE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.AQUITE_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/aquite")))
					 .add(RerMaterials.AQUITE_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.AQUITE_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/aquite")))
					 .add(RerMaterials.AQUITE_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.AQUITE_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/aquite")))
					 .add(RerMaterials.AQUITE_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.AQUITE_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/aquite")))
					 .add(RerMaterials.AQUITE_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.AQUITE_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/aquite")))
					 .add(RerMaterials.AQUITE_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.AQUITE_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/aquite")))
					 .add(RerMaterials.AQUITE_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.AQUITE_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/aquite")))
					 .add(RerMaterials.AQUITE_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems")))
					 .add(RerMaterials.AQUITE_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems/aquite")))
					 .add(RerMaterials.AQUITE_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.AQUITE_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/aquite")))
					 .add(RerMaterials.AQUITE_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores")))
					 .add(RerMaterials.CRUSHED_AQUITE_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores/aquite")))
					 .add(RerMaterials.CRUSHED_AQUITE_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.AQUITE_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/aquite")))
					 .add(RerMaterials.AQUITE_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.AQUITE_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/aquite")))
					 .add(RerMaterials.AQUITE_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals")))
					 .add(RerMaterials.AQUITE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals/aquite")))
					 .add(RerMaterials.AQUITE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals")))
					 .add(RerMaterials.AQUITE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals/aquite")))
					 .add(RerMaterials.AQUITE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards")))
					 .add(RerMaterials.AQUITE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards/aquite")))
					 .add(RerMaterials.AQUITE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards")))
					 .add(RerMaterials.AQUITE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards/aquite")))
					 .add(RerMaterials.AQUITE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps")))
					 .add(RerMaterials.AQUITE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps/aquite")))
					 .add(RerMaterials.AQUITE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps")))
					 .add(RerMaterials.AQUITE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps/aquite")))
					 .add(RerMaterials.AQUITE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts")))
					 .add(RerMaterials.AQUITE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts/aquite")))
					 .add(RerMaterials.AQUITE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts")))
					 .add(RerMaterials.AQUITE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts/aquite")))
					 .add(RerMaterials.AQUITE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.AQUITE_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/aquite")))
					 .add(RerMaterials.AQUITE_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.BITUMEN_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems")))
					 .add(RerMaterials.BITUMEN_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems/bitumen")))
					 .add(RerMaterials.BITUMEN_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.BITUMEN_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/bitumen")))
					 .add(RerMaterials.BITUMEN_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials")))
					 .add(RerMaterials.BITUMEN_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/bitumen")))
					 .add(RerMaterials.BITUMEN_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.BITUMEN_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/bitumen")))
					 .add(RerMaterials.BITUMEN_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.BITUMEN_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/bitumen")))
					 .add(RerMaterials.BITUMEN_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.BITUMEN_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/bitumen")))
					 .add(RerMaterials.BITUMEN_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.BITUMEN_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/bitumen")))
					 .add(RerMaterials.BITUMEN_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.BITUMEN_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/bitumen")))
					 .add(RerMaterials.BITUMEN_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.BITUMEN_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/bitumen")))
					 .add(RerMaterials.BITUMEN_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.BITUMEN_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/bitumen")))
					 .add(RerMaterials.BITUMEN_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.BITUMEN_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/bitumen")))
					 .add(RerMaterials.BITUMEN_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems")))
					 .add(RerMaterials.BITUMEN_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems/bitumen")))
					 .add(RerMaterials.BITUMEN_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.BITUMEN_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/bitumen")))
					 .add(RerMaterials.BITUMEN_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores")))
					 .add(RerMaterials.CRUSHED_BITUMEN_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores/bitumen")))
					 .add(RerMaterials.CRUSHED_BITUMEN_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.BITUMEN_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/bitumen")))
					 .add(RerMaterials.BITUMEN_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.BITUMEN_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/bitumen")))
					 .add(RerMaterials.BITUMEN_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals")))
					 .add(RerMaterials.BITUMEN_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals/bitumen")))
					 .add(RerMaterials.BITUMEN_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals")))
					 .add(RerMaterials.BITUMEN_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals/bitumen")))
					 .add(RerMaterials.BITUMEN_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards")))
					 .add(RerMaterials.BITUMEN_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards/bitumen")))
					 .add(RerMaterials.BITUMEN_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards")))
					 .add(RerMaterials.BITUMEN_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards/bitumen")))
					 .add(RerMaterials.BITUMEN_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps")))
					 .add(RerMaterials.BITUMEN_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps/bitumen")))
					 .add(RerMaterials.BITUMEN_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps")))
					 .add(RerMaterials.BITUMEN_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps/bitumen")))
					 .add(RerMaterials.BITUMEN_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts")))
					 .add(RerMaterials.BITUMEN_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts/bitumen")))
					 .add(RerMaterials.BITUMEN_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts")))
					 .add(RerMaterials.BITUMEN_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts/bitumen")))
					 .add(RerMaterials.BITUMEN_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.BITUMEN_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/bitumen")))
					 .add(RerMaterials.BITUMEN_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.BITUMEN_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/bitumen")))
					 .add(RerMaterialsBlocks.BITUMEN_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.BITUMEN_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_bitumen")))
					 .add(RerMaterialsBlocks.BITUMEN_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.BITUMEN_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_BITUMEN_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_BITUMEN_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_BITUMEN_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/bitumen")))
					 .add(RerMaterialsBlocks.BITUMEN_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/bitumen")))
					 .add(RerMaterialsBlocks.NETHERRACK_BITUMEN_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/bitumen")))
					 .add(RerMaterialsBlocks.END_STONE_BITUMEN_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/bitumen")))
					 .add(RerMaterialsBlocks.DEEPSLATE_BITUMEN_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.BITUMEN_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_BITUMEN_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_BITUMEN_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_BITUMEN_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.BITUMEN_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_BITUMEN_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_BITUMEN_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_BITUMEN_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.ARCANE_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/arcane")))
					 .add(RerMaterialsBlocks.ARCANE_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.ARCANE_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_arcane")))
					 .add(RerMaterialsBlocks.ARCANE_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.ARCANE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_ARCANE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_ARCANE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ARCANE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/arcane")))
					 .add(RerMaterialsBlocks.ARCANE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/arcane")))
					 .add(RerMaterialsBlocks.NETHERRACK_ARCANE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/arcane")))
					 .add(RerMaterialsBlocks.END_STONE_ARCANE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/arcane")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ARCANE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.ARCANE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_ARCANE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_ARCANE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ARCANE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.ARCANE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_ARCANE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_ARCANE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_ARCANE_ORE.get().asItem());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.ARCANE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems")))
					 .add(RerMaterials.ARCANE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems/arcane")))
					 .add(RerMaterials.ARCANE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.ARCANE_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/arcane")))
					 .add(RerMaterials.ARCANE_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials")))
					 .add(RerMaterials.ARCANE_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/arcane")))
					 .add(RerMaterials.ARCANE_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.ARCANE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/arcane")))
					 .add(RerMaterials.ARCANE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.ARCANE_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/arcane")))
					 .add(RerMaterials.ARCANE_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.ARCANE_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/arcane")))
					 .add(RerMaterials.ARCANE_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.ARCANE_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/arcane")))
					 .add(RerMaterials.ARCANE_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.ARCANE_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/arcane")))
					 .add(RerMaterials.ARCANE_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.ARCANE_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/arcane")))
					 .add(RerMaterials.ARCANE_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.ARCANE_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/arcane")))
					 .add(RerMaterials.ARCANE_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.ARCANE_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/arcane")))
					 .add(RerMaterials.ARCANE_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems")))
					 .add(RerMaterials.ARCANE_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems/arcane")))
					 .add(RerMaterials.ARCANE_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.ARCANE_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/arcane")))
					 .add(RerMaterials.ARCANE_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores")))
					 .add(RerMaterials.CRUSHED_ARCANE_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores/arcane")))
					 .add(RerMaterials.CRUSHED_ARCANE_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.ARCANE_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/arcane")))
					 .add(RerMaterials.ARCANE_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.ARCANE_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/arcane")))
					 .add(RerMaterials.ARCANE_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals")))
					 .add(RerMaterials.ARCANE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals/arcane")))
					 .add(RerMaterials.ARCANE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals")))
					 .add(RerMaterials.ARCANE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals/arcane")))
					 .add(RerMaterials.ARCANE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards")))
					 .add(RerMaterials.ARCANE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards/arcane")))
					 .add(RerMaterials.ARCANE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards")))
					 .add(RerMaterials.ARCANE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards/arcane")))
					 .add(RerMaterials.ARCANE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps")))
					 .add(RerMaterials.ARCANE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps/arcane")))
					 .add(RerMaterials.ARCANE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps")))
					 .add(RerMaterials.ARCANE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps/arcane")))
					 .add(RerMaterials.ARCANE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts")))
					 .add(RerMaterials.ARCANE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts/arcane")))
					 .add(RerMaterials.ARCANE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts")))
					 .add(RerMaterials.ARCANE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts/arcane")))
					 .add(RerMaterials.ARCANE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.ARCANE_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/arcane")))
					 .add(RerMaterials.ARCANE_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.ENDERIUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/enderium")))
					 .add(RerMaterialsBlocks.ENDERIUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.ELECTRUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/electrum")))
					 .add(RerMaterialsBlocks.ELECTRUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.LUMIUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/lumium")))
					 .add(RerMaterialsBlocks.LUMIUM_BLOCK.get().asItem());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.ENDERIUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.ENDERIUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/enderium")))
					 .add(RerMaterials.ENDERIUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.ENDERIUM_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/enderium")))
					 .add(RerMaterials.ENDERIUM_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.ENDERIUM_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/enderium")))
					 .add(RerMaterials.ENDERIUM_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.ENDERIUM_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/enderium")))
					 .add(RerMaterials.ENDERIUM_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.ENDERIUM_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/enderium")))
					 .add(RerMaterials.ENDERIUM_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.ENDERIUM_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/enderium")))
					 .add(RerMaterials.ENDERIUM_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.ENDERIUM_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/enderium")))
					 .add(RerMaterials.ENDERIUM_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.ENDERIUM_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/enderium")))
					 .add(RerMaterials.ENDERIUM_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.ENDERIUM_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/enderium")))
					 .add(RerMaterials.ENDERIUM_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.ENDERIUM_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/enderium")))
					 .add(RerMaterials.ENDERIUM_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.ENDERIUM_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/enderium")))
					 .add(RerMaterials.ENDERIUM_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.ENDERIUM_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/enderium")))
					 .add(RerMaterials.ENDERIUM_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.ENDERIUM_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/enderium")))
					 .add(RerMaterials.ENDERIUM_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.ENDERIUM_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/enderium")))
					 .add(RerMaterials.ENDERIUM_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.ENDERIUM_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/enderium")))
					 .add(RerMaterials.ENDERIUM_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.ELECTRUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.ELECTRUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/electrum")))
					 .add(RerMaterials.ELECTRUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.ELECTRUM_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/electrum")))
					 .add(RerMaterials.ELECTRUM_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.ELECTRUM_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/electrum")))
					 .add(RerMaterials.ELECTRUM_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.ELECTRUM_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/electrum")))
					 .add(RerMaterials.ELECTRUM_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.ELECTRUM_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/electrum")))
					 .add(RerMaterials.ELECTRUM_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.ELECTRUM_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/electrum")))
					 .add(RerMaterials.ELECTRUM_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.ELECTRUM_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/electrum")))
					 .add(RerMaterials.ELECTRUM_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.ELECTRUM_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/electrum")))
					 .add(RerMaterials.ELECTRUM_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.ELECTRUM_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/electrum")))
					 .add(RerMaterials.ELECTRUM_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.ELECTRUM_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/electrum")))
					 .add(RerMaterials.ELECTRUM_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.ELECTRUM_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/electrum")))
					 .add(RerMaterials.ELECTRUM_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.ELECTRUM_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/electrum")))
					 .add(RerMaterials.ELECTRUM_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.ELECTRUM_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/electrum")))
					 .add(RerMaterials.ELECTRUM_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.ELECTRUM_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/electrum")))
					 .add(RerMaterials.ELECTRUM_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.ELECTRUM_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/electrum")))
					 .add(RerMaterials.ELECTRUM_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.LUMIUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.LUMIUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/lumium")))
					 .add(RerMaterials.LUMIUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.LUMIUM_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/lumium")))
					 .add(RerMaterials.LUMIUM_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.LUMIUM_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/lumium")))
					 .add(RerMaterials.LUMIUM_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.LUMIUM_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/lumium")))
					 .add(RerMaterials.LUMIUM_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.LUMIUM_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/lumium")))
					 .add(RerMaterials.LUMIUM_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.LUMIUM_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/lumium")))
					 .add(RerMaterials.LUMIUM_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.LUMIUM_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/lumium")))
					 .add(RerMaterials.LUMIUM_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.LUMIUM_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/lumium")))
					 .add(RerMaterials.LUMIUM_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.LUMIUM_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/lumium")))
					 .add(RerMaterials.LUMIUM_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.LUMIUM_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/lumium")))
					 .add(RerMaterials.LUMIUM_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.LUMIUM_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/lumium")))
					 .add(RerMaterials.LUMIUM_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.LUMIUM_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/lumium")))
					 .add(RerMaterials.LUMIUM_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.LUMIUM_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/lumium")))
					 .add(RerMaterials.LUMIUM_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.LUMIUM_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/lumium")))
					 .add(RerMaterials.LUMIUM_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.LUMIUM_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/lumium")))
					 .add(RerMaterials.LUMIUM_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.FIERY_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.FIERY_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/fiery")))
					 .add(RerMaterials.FIERY_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.FIERY_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/fiery")))
					 .add(RerMaterials.FIERY_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.FIERY_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/fiery")))
					 .add(RerMaterials.FIERY_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.FIERY_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/fiery")))
					 .add(RerMaterials.FIERY_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.FIERY_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/fiery")))
					 .add(RerMaterials.FIERY_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.FIERY_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/fiery")))
					 .add(RerMaterials.FIERY_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.FIERY_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/fiery")))
					 .add(RerMaterials.FIERY_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.FIERY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/fiery")))
					 .add(RerMaterials.FIERY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.FIERY_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/fiery")))
					 .add(RerMaterials.FIERY_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.FIERY_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/fiery")))
					 .add(RerMaterials.FIERY_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.FIERY_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/fiery")))
					 .add(RerMaterials.FIERY_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.FIERY_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/fiery")))
					 .add(RerMaterials.FIERY_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.FIERY_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/fiery")))
					 .add(RerMaterials.FIERY_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.FIERY_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/fiery")))
					 .add(RerMaterials.FIERY_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.FIERY_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/fiery")))
					 .add(RerMaterials.FIERY_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.FIERY_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/fiery")))
					 .add(RerMaterialsBlocks.FIERY_BLOCK.get().asItem());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.IRIDIUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.IRIDIUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/iridium")))
					 .add(RerMaterials.IRIDIUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.IRIDIUM_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/iridium")))
					 .add(RerMaterials.IRIDIUM_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials")))
					 .add(RerMaterials.RAW_IRIDIUM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/iridium")))
					 .add(RerMaterials.RAW_IRIDIUM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.IRIDIUM_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/iridium")))
					 .add(RerMaterials.IRIDIUM_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.IRIDIUM_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/iridium")))
					 .add(RerMaterials.IRIDIUM_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.IRIDIUM_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/iridium")))
					 .add(RerMaterials.IRIDIUM_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.IRIDIUM_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/iridium")))
					 .add(RerMaterials.IRIDIUM_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.IRIDIUM_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/iridium")))
					 .add(RerMaterials.IRIDIUM_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.IRIDIUM_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/iridium")))
					 .add(RerMaterials.IRIDIUM_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.IRIDIUM_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/iridium")))
					 .add(RerMaterials.IRIDIUM_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.IRIDIUM_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/iridium")))
					 .add(RerMaterials.IRIDIUM_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.IRIDIUM_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/iridium")))
					 .add(RerMaterials.IRIDIUM_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.IRIDIUM_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/iridium")))
					 .add(RerMaterials.IRIDIUM_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores")))
					 .add(RerMaterials.CRUSHED_IRIDIUM_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores/iridium")))
					 .add(RerMaterials.CRUSHED_IRIDIUM_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.IRIDIUM_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/iridium")))
					 .add(RerMaterials.IRIDIUM_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.IRIDIUM_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/iridium")))
					 .add(RerMaterials.IRIDIUM_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals")))
					 .add(RerMaterials.IRIDIUM_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals/iridium")))
					 .add(RerMaterials.IRIDIUM_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals")))
					 .add(RerMaterials.IRIDIUM_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals/iridium")))
					 .add(RerMaterials.IRIDIUM_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards")))
					 .add(RerMaterials.IRIDIUM_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards/iridium")))
					 .add(RerMaterials.IRIDIUM_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards")))
					 .add(RerMaterials.IRIDIUM_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards/iridium")))
					 .add(RerMaterials.IRIDIUM_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps")))
					 .add(RerMaterials.IRIDIUM_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps/iridium")))
					 .add(RerMaterials.IRIDIUM_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps")))
					 .add(RerMaterials.IRIDIUM_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps/iridium")))
					 .add(RerMaterials.IRIDIUM_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts")))
					 .add(RerMaterials.IRIDIUM_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts/iridium")))
					 .add(RerMaterials.IRIDIUM_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts")))
					 .add(RerMaterials.IRIDIUM_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts/iridium")))
					 .add(RerMaterials.IRIDIUM_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.IRIDIUM_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/iridium")))
					 .add(RerMaterials.IRIDIUM_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.LEAD_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.LEAD_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/lead")))
					 .add(RerMaterials.LEAD_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.LEAD_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/lead")))
					 .add(RerMaterials.LEAD_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials")))
					 .add(RerMaterials.RAW_LEAD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/lead")))
					 .add(RerMaterials.RAW_LEAD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.LEAD_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/lead")))
					 .add(RerMaterials.LEAD_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.LEAD_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/lead")))
					 .add(RerMaterials.LEAD_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.LEAD_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/lead")))
					 .add(RerMaterials.LEAD_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.LEAD_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/lead")))
					 .add(RerMaterials.LEAD_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.LEAD_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/lead")))
					 .add(RerMaterials.LEAD_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.LEAD_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/lead")))
					 .add(RerMaterials.LEAD_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.LEAD_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/lead")))
					 .add(RerMaterials.LEAD_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.LEAD_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/lead")))
					 .add(RerMaterials.LEAD_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.LEAD_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/lead")))
					 .add(RerMaterials.LEAD_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.LEAD_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/lead")))
					 .add(RerMaterials.LEAD_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores")))
					 .add(RerMaterials.CRUSHED_LEAD_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores/lead")))
					 .add(RerMaterials.CRUSHED_LEAD_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.LEAD_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/lead")))
					 .add(RerMaterials.LEAD_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.LEAD_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/lead")))
					 .add(RerMaterials.LEAD_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals")))
					 .add(RerMaterials.LEAD_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals/lead")))
					 .add(RerMaterials.LEAD_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals")))
					 .add(RerMaterials.LEAD_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals/lead")))
					 .add(RerMaterials.LEAD_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards")))
					 .add(RerMaterials.LEAD_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards/lead")))
					 .add(RerMaterials.LEAD_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards")))
					 .add(RerMaterials.LEAD_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards/lead")))
					 .add(RerMaterials.LEAD_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps")))
					 .add(RerMaterials.LEAD_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps/lead")))
					 .add(RerMaterials.LEAD_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps")))
					 .add(RerMaterials.LEAD_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps/lead")))
					 .add(RerMaterials.LEAD_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts")))
					 .add(RerMaterials.LEAD_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts/lead")))
					 .add(RerMaterials.LEAD_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts")))
					 .add(RerMaterials.LEAD_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts/lead")))
					 .add(RerMaterials.LEAD_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.LEAD_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/lead")))
					 .add(RerMaterials.LEAD_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.NICKEL_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.NICKEL_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/nickel")))
					 .add(RerMaterials.NICKEL_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.NICKEL_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/nickel")))
					 .add(RerMaterials.NICKEL_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials")))
					 .add(RerMaterials.RAW_NICKEL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/nickel")))
					 .add(RerMaterials.RAW_NICKEL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.NICKEL_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/nickel")))
					 .add(RerMaterials.NICKEL_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.NICKEL_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/nickel")))
					 .add(RerMaterials.NICKEL_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.NICKEL_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/nickel")))
					 .add(RerMaterials.NICKEL_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.NICKEL_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/nickel")))
					 .add(RerMaterials.NICKEL_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.NICKEL_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/nickel")))
					 .add(RerMaterials.NICKEL_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.NICKEL_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/nickel")))
					 .add(RerMaterials.NICKEL_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.NICKEL_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/nickel")))
					 .add(RerMaterials.NICKEL_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.NICKEL_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/nickel")))
					 .add(RerMaterials.NICKEL_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.NICKEL_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/nickel")))
					 .add(RerMaterials.NICKEL_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.NICKEL_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/nickel")))
					 .add(RerMaterials.NICKEL_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores")))
					 .add(RerMaterials.CRUSHED_NICKEL_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores/nickel")))
					 .add(RerMaterials.CRUSHED_NICKEL_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.NICKEL_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/nickel")))
					 .add(RerMaterials.NICKEL_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.NICKEL_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/nickel")))
					 .add(RerMaterials.NICKEL_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals")))
					 .add(RerMaterials.NICKEL_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals/nickel")))
					 .add(RerMaterials.NICKEL_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals")))
					 .add(RerMaterials.NICKEL_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals/nickel")))
					 .add(RerMaterials.NICKEL_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards")))
					 .add(RerMaterials.NICKEL_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards/nickel")))
					 .add(RerMaterials.NICKEL_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards")))
					 .add(RerMaterials.NICKEL_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards/nickel")))
					 .add(RerMaterials.NICKEL_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps")))
					 .add(RerMaterials.NICKEL_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps/nickel")))
					 .add(RerMaterials.NICKEL_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps")))
					 .add(RerMaterials.NICKEL_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps/nickel")))
					 .add(RerMaterials.NICKEL_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts")))
					 .add(RerMaterials.NICKEL_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts/nickel")))
					 .add(RerMaterials.NICKEL_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts")))
					 .add(RerMaterials.NICKEL_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts/nickel")))
					 .add(RerMaterials.NICKEL_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.NICKEL_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/nickel")))
					 .add(RerMaterials.NICKEL_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.OSMIUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.OSMIUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/osmium")))
					 .add(RerMaterials.OSMIUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.OSMIUM_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/osmium")))
					 .add(RerMaterials.OSMIUM_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials")))
					 .add(RerMaterials.RAW_OSMIUM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/osmium")))
					 .add(RerMaterials.RAW_OSMIUM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.OSMIUM_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/osmium")))
					 .add(RerMaterials.OSMIUM_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.OSMIUM_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/osmium")))
					 .add(RerMaterials.OSMIUM_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.OSMIUM_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/osmium")))
					 .add(RerMaterials.OSMIUM_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.OSMIUM_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/osmium")))
					 .add(RerMaterials.OSMIUM_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.OSMIUM_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/osmium")))
					 .add(RerMaterials.OSMIUM_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.OSMIUM_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/osmium")))
					 .add(RerMaterials.OSMIUM_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.OSMIUM_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/osmium")))
					 .add(RerMaterials.OSMIUM_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.OSMIUM_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/osmium")))
					 .add(RerMaterials.OSMIUM_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.OSMIUM_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/osmium")))
					 .add(RerMaterials.OSMIUM_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.OSMIUM_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/osmium")))
					 .add(RerMaterials.OSMIUM_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores")))
					 .add(RerMaterials.CRUSHED_OSMIUM_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores/osmium")))
					 .add(RerMaterials.CRUSHED_OSMIUM_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.OSMIUM_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/osmium")))
					 .add(RerMaterials.OSMIUM_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.OSMIUM_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/osmium")))
					 .add(RerMaterials.OSMIUM_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals")))
					 .add(RerMaterials.OSMIUM_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals/osmium")))
					 .add(RerMaterials.OSMIUM_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals")))
					 .add(RerMaterials.OSMIUM_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals/osmium")))
					 .add(RerMaterials.OSMIUM_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards")))
					 .add(RerMaterials.OSMIUM_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards/osmium")))
					 .add(RerMaterials.OSMIUM_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards")))
					 .add(RerMaterials.OSMIUM_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards/osmium")))
					 .add(RerMaterials.OSMIUM_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps")))
					 .add(RerMaterials.OSMIUM_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps/osmium")))
					 .add(RerMaterials.OSMIUM_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps")))
					 .add(RerMaterials.OSMIUM_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps/osmium")))
					 .add(RerMaterials.OSMIUM_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts")))
					 .add(RerMaterials.OSMIUM_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts/osmium")))
					 .add(RerMaterials.OSMIUM_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts")))
					 .add(RerMaterials.OSMIUM_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts/osmium")))
					 .add(RerMaterials.OSMIUM_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.OSMIUM_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/osmium")))
					 .add(RerMaterials.OSMIUM_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.IRIDIUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/iridium")))
					 .add(RerMaterialsBlocks.IRIDIUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_IRIDIUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_iridium")))
					 .add(RerMaterialsBlocks.RAW_IRIDIUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.IRIDIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_IRIDIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_IRIDIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_IRIDIUM_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/iridium")))
					 .add(RerMaterialsBlocks.IRIDIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/iridium")))
					 .add(RerMaterialsBlocks.NETHERRACK_IRIDIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/iridium")))
					 .add(RerMaterialsBlocks.END_STONE_IRIDIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/iridium")))
					 .add(RerMaterialsBlocks.DEEPSLATE_IRIDIUM_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.IRIDIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_IRIDIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_IRIDIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_IRIDIUM_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.IRIDIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_IRIDIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_IRIDIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_IRIDIUM_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.LEAD_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/lead")))
					 .add(RerMaterialsBlocks.LEAD_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_LEAD_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_lead")))
					 .add(RerMaterialsBlocks.RAW_LEAD_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.LEAD_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_LEAD_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_LEAD_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_LEAD_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/lead")))
					 .add(RerMaterialsBlocks.LEAD_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/lead")))
					 .add(RerMaterialsBlocks.NETHERRACK_LEAD_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/lead")))
					 .add(RerMaterialsBlocks.END_STONE_LEAD_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/lead")))
					 .add(RerMaterialsBlocks.DEEPSLATE_LEAD_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.LEAD_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_LEAD_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_LEAD_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_LEAD_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.LEAD_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_LEAD_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_LEAD_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_LEAD_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.NICKEL_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/nickel")))
					 .add(RerMaterialsBlocks.NICKEL_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_NICKEL_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_nickel")))
					 .add(RerMaterialsBlocks.RAW_NICKEL_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NICKEL_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_NICKEL_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_NICKEL_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_NICKEL_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/nickel")))
					 .add(RerMaterialsBlocks.NICKEL_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/nickel")))
					 .add(RerMaterialsBlocks.NETHERRACK_NICKEL_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/nickel")))
					 .add(RerMaterialsBlocks.END_STONE_NICKEL_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/nickel")))
					 .add(RerMaterialsBlocks.DEEPSLATE_NICKEL_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NICKEL_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_NICKEL_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_NICKEL_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_NICKEL_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.NICKEL_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_NICKEL_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_NICKEL_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_NICKEL_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.OSMIUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/osmium")))
					 .add(RerMaterialsBlocks.OSMIUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.RAW_OSMIUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_osmium")))
					 .add(RerMaterialsBlocks.RAW_OSMIUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.OSMIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_OSMIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_OSMIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_OSMIUM_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/osmium")))
					 .add(RerMaterialsBlocks.OSMIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/osmium")))
					 .add(RerMaterialsBlocks.NETHERRACK_OSMIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/osmium")))
					 .add(RerMaterialsBlocks.END_STONE_OSMIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/osmium")))
					 .add(RerMaterialsBlocks.DEEPSLATE_OSMIUM_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.OSMIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_OSMIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_OSMIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_OSMIUM_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.OSMIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_OSMIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_OSMIUM_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_OSMIUM_ORE.get().asItem());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.CARMINITE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems")))
					 .add(RerMaterials.CARMINITE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems/carminite")))
					 .add(RerMaterials.CARMINITE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.CARMINITE_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/carminite")))
					 .add(RerMaterials.CARMINITE_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials")))
					 .add(RerMaterials.CARMINITE_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/carminite")))
					 .add(RerMaterials.CARMINITE_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.CARMINITE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/carminite")))
					 .add(RerMaterials.CARMINITE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.CARMINITE_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/carminite")))
					 .add(RerMaterials.CARMINITE_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.CARMINITE_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/carminite")))
					 .add(RerMaterials.CARMINITE_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.CARMINITE_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/carminite")))
					 .add(RerMaterials.CARMINITE_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.CARMINITE_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/carminite")))
					 .add(RerMaterials.CARMINITE_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.CARMINITE_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/carminite")))
					 .add(RerMaterials.CARMINITE_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.CARMINITE_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/carminite")))
					 .add(RerMaterials.CARMINITE_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.CARMINITE_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/carminite")))
					 .add(RerMaterials.CARMINITE_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems")))
					 .add(RerMaterials.CARMINITE_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems/carminite")))
					 .add(RerMaterials.CARMINITE_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.CARMINITE_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/carminite")))
					 .add(RerMaterials.CARMINITE_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores")))
					 .add(RerMaterials.CRUSHED_CARMINITE_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores/carminite")))
					 .add(RerMaterials.CRUSHED_CARMINITE_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.CARMINITE_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/carminite")))
					 .add(RerMaterials.CARMINITE_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.CARMINITE_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/carminite")))
					 .add(RerMaterials.CARMINITE_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals")))
					 .add(RerMaterials.CARMINITE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals/carminite")))
					 .add(RerMaterials.CARMINITE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals")))
					 .add(RerMaterials.CARMINITE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals/carminite")))
					 .add(RerMaterials.CARMINITE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards")))
					 .add(RerMaterials.CARMINITE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards/carminite")))
					 .add(RerMaterials.CARMINITE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards")))
					 .add(RerMaterials.CARMINITE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards/carminite")))
					 .add(RerMaterials.CARMINITE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps")))
					 .add(RerMaterials.CARMINITE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps/carminite")))
					 .add(RerMaterials.CARMINITE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps")))
					 .add(RerMaterials.CARMINITE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps/carminite")))
					 .add(RerMaterials.CARMINITE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts")))
					 .add(RerMaterials.CARMINITE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts/carminite")))
					 .add(RerMaterials.CARMINITE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts")))
					 .add(RerMaterials.CARMINITE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts/carminite")))
					 .add(RerMaterials.CARMINITE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.CARMINITE_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/carminite")))
					 .add(RerMaterials.CARMINITE_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.CERTUS_QUARTZ_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems")))
					 .add(RerMaterials.CERTUS_QUARTZ_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.CERTUS_QUARTZ_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials")))
					 .add(RerMaterials.CERTUS_QUARTZ_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.CERTUS_QUARTZ_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.CERTUS_QUARTZ_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.CERTUS_QUARTZ_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.CERTUS_QUARTZ_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.CERTUS_QUARTZ_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.CERTUS_QUARTZ_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.CERTUS_QUARTZ_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.CERTUS_QUARTZ_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems")))
					 .add(RerMaterials.CERTUS_QUARTZ_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.CERTUS_QUARTZ_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores")))
					 .add(RerMaterials.CRUSHED_CERTUS_QUARTZ_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores/certus_quartz")))
					 .add(RerMaterials.CRUSHED_CERTUS_QUARTZ_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.CERTUS_QUARTZ_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.CERTUS_QUARTZ_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals")))
					 .add(RerMaterials.CERTUS_QUARTZ_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals")))
					 .add(RerMaterials.CERTUS_QUARTZ_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards")))
					 .add(RerMaterials.CERTUS_QUARTZ_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards")))
					 .add(RerMaterials.CERTUS_QUARTZ_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps")))
					 .add(RerMaterials.CERTUS_QUARTZ_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps")))
					 .add(RerMaterials.CERTUS_QUARTZ_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts")))
					 .add(RerMaterials.CERTUS_QUARTZ_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts")))
					 .add(RerMaterials.CERTUS_QUARTZ_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.CERTUS_QUARTZ_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/certus_quartz")))
					 .add(RerMaterials.CERTUS_QUARTZ_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores")))
					 .add(RerMaterials.CRUSHED_CHARGED_CERTUS_QUARTZ_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores/charged_certus_quartz")))
					 .add(RerMaterials.CRUSHED_CHARGED_CERTUS_QUARTZ_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/charged_certus_quartz")))
					 .add(RerMaterials.CHARGED_CERTUS_QUARTZ_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.CHAROITE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems")))
					 .add(RerMaterials.CHAROITE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gems/charoite")))
					 .add(RerMaterials.CHAROITE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.CHAROITE_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/charoite")))
					 .add(RerMaterials.CHAROITE_FRAGMENT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials")))
					 .add(RerMaterials.CHAROITE_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "raw_materials/charoite")))
					 .add(RerMaterials.CHAROITE_CLUSTER_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.CHAROITE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/charoite")))
					 .add(RerMaterials.CHAROITE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.CHAROITE_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/charoite")))
					 .add(RerMaterials.CHAROITE_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.CHAROITE_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/charoite")))
					 .add(RerMaterials.CHAROITE_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.CHAROITE_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/charoite")))
					 .add(RerMaterials.CHAROITE_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.CHAROITE_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/charoite")))
					 .add(RerMaterials.CHAROITE_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.CHAROITE_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/charoite")))
					 .add(RerMaterials.CHAROITE_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.CHAROITE_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/charoite")))
					 .add(RerMaterials.CHAROITE_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.CHAROITE_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/charoite")))
					 .add(RerMaterials.CHAROITE_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems")))
					 .add(RerMaterials.CHAROITE_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_gems/charoite")))
					 .add(RerMaterials.CHAROITE_DOUBLE_GEM.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.CHAROITE_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/charoite")))
					 .add(RerMaterials.CHAROITE_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores")))
					 .add(RerMaterials.CRUSHED_CHAROITE_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crushed_ores/charoite")))
					 .add(RerMaterials.CRUSHED_CHAROITE_ORE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.CHAROITE_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/charoite")))
					 .add(RerMaterials.CHAROITE_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.CHAROITE_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/charoite")))
					 .add(RerMaterials.CHAROITE_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals")))
					 .add(RerMaterials.CHAROITE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "crystals/charoite")))
					 .add(RerMaterials.CHAROITE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals")))
					 .add(RerMaterials.CHAROITE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "crystals/charoite")))
					 .add(RerMaterials.CHAROITE_CRYSTAL.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards")))
					 .add(RerMaterials.CHAROITE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "shards/charoite")))
					 .add(RerMaterials.CHAROITE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards")))
					 .add(RerMaterials.CHAROITE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "shards/charoite")))
					 .add(RerMaterials.CHAROITE_SHARD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps")))
					 .add(RerMaterials.CHAROITE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clumps/charoite")))
					 .add(RerMaterials.CHAROITE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps")))
					 .add(RerMaterials.CHAROITE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "clumps/charoite")))
					 .add(RerMaterials.CHAROITE_CLUMP.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts")))
					 .add(RerMaterials.CHAROITE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dirty_dusts/charoite")))
					 .add(RerMaterials.CHAROITE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts")))
					 .add(RerMaterials.CHAROITE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("mekanism", "dirty_dusts/charoite")))
					 .add(RerMaterials.CHAROITE_DIRTY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.CHAROITE_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/charoite")))
					 .add(RerMaterials.CHAROITE_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CARMINITE_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/carminite")))
					 .add(RerMaterialsBlocks.CARMINITE_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CARMINITE_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_carminite")))
					 .add(RerMaterialsBlocks.CARMINITE_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.CARMINITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_CARMINITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_CARMINITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CARMINITE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/carminite")))
					 .add(RerMaterialsBlocks.CARMINITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/carminite")))
					 .add(RerMaterialsBlocks.NETHERRACK_CARMINITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/carminite")))
					 .add(RerMaterialsBlocks.END_STONE_CARMINITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/carminite")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CARMINITE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.CARMINITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_CARMINITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_CARMINITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CARMINITE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.CARMINITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_CARMINITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_CARMINITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CARMINITE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/certus_quartz")))
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_certus_quartz")))
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/certus_quartz")))
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/certus_quartz")))
					 .add(RerMaterialsBlocks.NETHERRACK_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/certus_quartz")))
					 .add(RerMaterialsBlocks.END_STONE_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/certus_quartz")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/charged_certus_quartz")))
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_charged_certus_quartz")))
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_CHARGED_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/charged_certus_quartz")))
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/charged_certus_quartz")))
					 .add(RerMaterialsBlocks.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/charged_certus_quartz")))
					 .add(RerMaterialsBlocks.END_STONE_CHARGED_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/charged_certus_quartz")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_CHARGED_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_CHARGED_CERTUS_QUARTZ_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CHAROITE_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/charoite")))
					 .add(RerMaterialsBlocks.CHAROITE_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CHAROITE_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/cluster_charoite")))
					 .add(RerMaterialsBlocks.CHAROITE_CLUSTER_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.CHAROITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.NETHERRACK_CHAROITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.END_STONE_CHAROITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CHAROITE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/charoite")))
					 .add(RerMaterialsBlocks.CHAROITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/charoite")))
					 .add(RerMaterialsBlocks.NETHERRACK_CHAROITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/charoite")))
					 .add(RerMaterialsBlocks.END_STONE_CHAROITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores/charoite")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CHAROITE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.CHAROITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.NETHERRACK_CHAROITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.END_STONE_CHAROITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ore_rates/singular")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CHAROITE_ORE.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone")))
					 .add(RerMaterialsBlocks.CHAROITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack")))
					 .add(RerMaterialsBlocks.NETHERRACK_CHAROITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone")))
					 .add(RerMaterialsBlocks.END_STONE_CHAROITE_ORE.get().asItem());
		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate")))
					 .add(RerMaterialsBlocks.DEEPSLATE_CHAROITE_ORE.get().asItem());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.SIGNALUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.SIGNALUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/signalum")))
					 .add(RerMaterials.SIGNALUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.SIGNALUM_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/signalum")))
					 .add(RerMaterials.SIGNALUM_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.SIGNALUM_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/signalum")))
					 .add(RerMaterials.SIGNALUM_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.SIGNALUM_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/signalum")))
					 .add(RerMaterials.SIGNALUM_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.SIGNALUM_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/signalum")))
					 .add(RerMaterials.SIGNALUM_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.SIGNALUM_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/signalum")))
					 .add(RerMaterials.SIGNALUM_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.SIGNALUM_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/signalum")))
					 .add(RerMaterials.SIGNALUM_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.SIGNALUM_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/signalum")))
					 .add(RerMaterials.SIGNALUM_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.SIGNALUM_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/signalum")))
					 .add(RerMaterials.SIGNALUM_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.SIGNALUM_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/signalum")))
					 .add(RerMaterials.SIGNALUM_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.SIGNALUM_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/signalum")))
					 .add(RerMaterials.SIGNALUM_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.SIGNALUM_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/signalum")))
					 .add(RerMaterials.SIGNALUM_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.SIGNALUM_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/signalum")))
					 .add(RerMaterials.SIGNALUM_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.SIGNALUM_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/signalum")))
					 .add(RerMaterials.SIGNALUM_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.SIGNALUM_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/signalum")))
					 .add(RerMaterials.SIGNALUM_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.INVAR_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.INVAR_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/invar")))
					 .add(RerMaterials.INVAR_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.INVAR_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/invar")))
					 .add(RerMaterials.INVAR_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.INVAR_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/invar")))
					 .add(RerMaterials.INVAR_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.INVAR_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/invar")))
					 .add(RerMaterials.INVAR_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.INVAR_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/invar")))
					 .add(RerMaterials.INVAR_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.INVAR_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/invar")))
					 .add(RerMaterials.INVAR_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.INVAR_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/invar")))
					 .add(RerMaterials.INVAR_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.INVAR_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/invar")))
					 .add(RerMaterials.INVAR_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.INVAR_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/invar")))
					 .add(RerMaterials.INVAR_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.INVAR_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/invar")))
					 .add(RerMaterials.INVAR_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.INVAR_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/invar")))
					 .add(RerMaterials.INVAR_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.INVAR_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/invar")))
					 .add(RerMaterials.INVAR_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.INVAR_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/invar")))
					 .add(RerMaterials.INVAR_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.INVAR_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/invar")))
					 .add(RerMaterials.INVAR_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.INVAR_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/invar")))
					 .add(RerMaterials.INVAR_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.GRAPHITE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.GRAPHITE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/graphite")))
					 .add(RerMaterials.GRAPHITE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.GRAPHITE_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/graphite")))
					 .add(RerMaterials.GRAPHITE_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.GRAPHITE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/graphite")))
					 .add(RerMaterials.GRAPHITE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.GRAPHITE_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/graphite")))
					 .add(RerMaterials.GRAPHITE_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.GRAPHITE_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/graphite")))
					 .add(RerMaterials.GRAPHITE_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.GRAPHITE_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/graphite")))
					 .add(RerMaterials.GRAPHITE_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.GRAPHITE_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/graphite")))
					 .add(RerMaterials.GRAPHITE_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.GRAPHITE_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/graphite")))
					 .add(RerMaterials.GRAPHITE_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.GRAPHITE_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/graphite")))
					 .add(RerMaterials.GRAPHITE_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.GRAPHITE_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/graphite")))
					 .add(RerMaterials.GRAPHITE_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.GRAPHITE_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/graphite")))
					 .add(RerMaterials.GRAPHITE_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.GRAPHITE_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/graphite")))
					 .add(RerMaterials.GRAPHITE_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.GRAPHITE_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/graphite")))
					 .add(RerMaterials.GRAPHITE_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.GRAPHITE_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/graphite")))
					 .add(RerMaterials.GRAPHITE_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.GRAPHITE_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/graphite")))
					 .add(RerMaterials.GRAPHITE_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.CONSTANTAN_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.CONSTANTAN_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/constantan")))
					 .add(RerMaterials.CONSTANTAN_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.CONSTANTAN_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/constantan")))
					 .add(RerMaterials.CONSTANTAN_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.CONSTANTAN_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/constantan")))
					 .add(RerMaterials.CONSTANTAN_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.CONSTANTAN_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/constantan")))
					 .add(RerMaterials.CONSTANTAN_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.CONSTANTAN_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/constantan")))
					 .add(RerMaterials.CONSTANTAN_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.CONSTANTAN_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/constantan")))
					 .add(RerMaterials.CONSTANTAN_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.CONSTANTAN_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/constantan")))
					 .add(RerMaterials.CONSTANTAN_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.CONSTANTAN_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/constantan")))
					 .add(RerMaterials.CONSTANTAN_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.CONSTANTAN_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/constantan")))
					 .add(RerMaterials.CONSTANTAN_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.CONSTANTAN_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/constantan")))
					 .add(RerMaterials.CONSTANTAN_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.CONSTANTAN_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/constantan")))
					 .add(RerMaterials.CONSTANTAN_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.CONSTANTAN_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/constantan")))
					 .add(RerMaterials.CONSTANTAN_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.CONSTANTAN_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/constantan")))
					 .add(RerMaterials.CONSTANTAN_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.CONSTANTAN_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/constantan")))
					 .add(RerMaterials.CONSTANTAN_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.CONSTANTAN_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/constantan")))
					 .add(RerMaterials.CONSTANTAN_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.SIGNALUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/signalum")))
					 .add(RerMaterialsBlocks.SIGNALUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.INVAR_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/invar")))
					 .add(RerMaterialsBlocks.INVAR_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.GRAPHITE_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/graphite")))
					 .add(RerMaterialsBlocks.GRAPHITE_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.CONSTANTAN_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/constantan")))
					 .add(RerMaterialsBlocks.CONSTANTAN_BLOCK.get().asItem());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.REFINED_OBSIDIAN_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.REFINED_OBSIDIAN_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/refined_obsidian")))
					 .add(RerMaterials.REFINED_OBSIDIAN_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.REFINED_OBSIDIAN_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/refined_obsidian")))
					 .add(RerMaterials.REFINED_OBSIDIAN_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.REFINED_OBSIDIAN_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/refined_obsidian")))
					 .add(RerMaterials.REFINED_OBSIDIAN_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.REFINED_OBSIDIAN_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/refined_obsidian")))
					 .add(RerMaterials.REFINED_OBSIDIAN_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.REFINED_OBSIDIAN_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/refined_obsidian")))
					 .add(RerMaterials.REFINED_OBSIDIAN_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.REFINED_OBSIDIAN_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/refined_obsidian")))
					 .add(RerMaterials.REFINED_OBSIDIAN_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.REFINED_OBSIDIAN_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/refined_obsidian")))
					 .add(RerMaterials.REFINED_OBSIDIAN_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.REFINED_OBSIDIAN_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/refined_obsidian")))
					 .add(RerMaterials.REFINED_OBSIDIAN_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.REFINED_OBSIDIAN_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/refined_obsidian")))
					 .add(RerMaterials.REFINED_OBSIDIAN_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.REFINED_OBSIDIAN_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/refined_obsidian")))
					 .add(RerMaterials.REFINED_OBSIDIAN_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.REFINED_OBSIDIAN_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/refined_obsidian")))
					 .add(RerMaterials.REFINED_OBSIDIAN_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.REFINED_OBSIDIAN_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/refined_obsidian")))
					 .add(RerMaterials.REFINED_OBSIDIAN_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.REFINED_OBSIDIAN_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/refined_obsidian")))
					 .add(RerMaterials.REFINED_OBSIDIAN_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.REFINED_OBSIDIAN_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/refined_obsidian")))
					 .add(RerMaterials.REFINED_OBSIDIAN_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.REFINED_OBSIDIAN_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/refined_obsidian")))
					 .add(RerMaterials.REFINED_OBSIDIAN_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.REFINED_GLOWSTONE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.REFINED_GLOWSTONE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/refined_glowstone")))
					 .add(RerMaterials.REFINED_GLOWSTONE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.REFINED_GLOWSTONE_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/refined_glowstone")))
					 .add(RerMaterials.REFINED_GLOWSTONE_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.REFINED_GLOWSTONE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/refined_glowstone")))
					 .add(RerMaterials.REFINED_GLOWSTONE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.REFINED_GLOWSTONE_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/refined_glowstone")))
					 .add(RerMaterials.REFINED_GLOWSTONE_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.REFINED_GLOWSTONE_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/refined_glowstone")))
					 .add(RerMaterials.REFINED_GLOWSTONE_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.REFINED_GLOWSTONE_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/refined_glowstone")))
					 .add(RerMaterials.REFINED_GLOWSTONE_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.REFINED_GLOWSTONE_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/refined_glowstone")))
					 .add(RerMaterials.REFINED_GLOWSTONE_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.REFINED_GLOWSTONE_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/refined_glowstone")))
					 .add(RerMaterials.REFINED_GLOWSTONE_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.REFINED_GLOWSTONE_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/refined_glowstone")))
					 .add(RerMaterials.REFINED_GLOWSTONE_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.REFINED_GLOWSTONE_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/refined_glowstone")))
					 .add(RerMaterials.REFINED_GLOWSTONE_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.REFINED_GLOWSTONE_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/refined_glowstone")))
					 .add(RerMaterials.REFINED_GLOWSTONE_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.REFINED_GLOWSTONE_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/refined_glowstone")))
					 .add(RerMaterials.REFINED_GLOWSTONE_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.REFINED_GLOWSTONE_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/refined_glowstone")))
					 .add(RerMaterials.REFINED_GLOWSTONE_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.REFINED_GLOWSTONE_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/refined_glowstone")))
					 .add(RerMaterials.REFINED_GLOWSTONE_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.REFINED_GLOWSTONE_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/refined_glowstone")))
					 .add(RerMaterials.REFINED_GLOWSTONE_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.ORICHALCUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.ORICHALCUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/orichalcum")))
					 .add(RerMaterials.ORICHALCUM_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.ORICHALCUM_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/orichalcum")))
					 .add(RerMaterials.ORICHALCUM_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.ORICHALCUM_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/orichalcum")))
					 .add(RerMaterials.ORICHALCUM_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.ORICHALCUM_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/orichalcum")))
					 .add(RerMaterials.ORICHALCUM_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.ORICHALCUM_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/orichalcum")))
					 .add(RerMaterials.ORICHALCUM_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.ORICHALCUM_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/orichalcum")))
					 .add(RerMaterials.ORICHALCUM_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.ORICHALCUM_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/orichalcum")))
					 .add(RerMaterials.ORICHALCUM_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.ORICHALCUM_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/orichalcum")))
					 .add(RerMaterials.ORICHALCUM_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.ORICHALCUM_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/orichalcum")))
					 .add(RerMaterials.ORICHALCUM_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.ORICHALCUM_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/orichalcum")))
					 .add(RerMaterials.ORICHALCUM_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.ORICHALCUM_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/orichalcum")))
					 .add(RerMaterials.ORICHALCUM_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.ORICHALCUM_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/orichalcum")))
					 .add(RerMaterials.ORICHALCUM_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.ORICHALCUM_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/orichalcum")))
					 .add(RerMaterials.ORICHALCUM_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.ORICHALCUM_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/orichalcum")))
					 .add(RerMaterials.ORICHALCUM_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.ORICHALCUM_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/orichalcum")))
					 .add(RerMaterials.ORICHALCUM_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.ROSE_GOLD_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.ROSE_GOLD_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/rose_gold")))
					 .add(RerMaterials.ROSE_GOLD_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.ROSE_GOLD_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/rose_gold")))
					 .add(RerMaterials.ROSE_GOLD_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.ROSE_GOLD_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/rose_gold")))
					 .add(RerMaterials.ROSE_GOLD_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.ROSE_GOLD_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/rose_gold")))
					 .add(RerMaterials.ROSE_GOLD_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.ROSE_GOLD_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/rose_gold")))
					 .add(RerMaterials.ROSE_GOLD_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.ROSE_GOLD_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/rose_gold")))
					 .add(RerMaterials.ROSE_GOLD_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.ROSE_GOLD_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/rose_gold")))
					 .add(RerMaterials.ROSE_GOLD_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.ROSE_GOLD_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/rose_gold")))
					 .add(RerMaterials.ROSE_GOLD_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.ROSE_GOLD_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/rose_gold")))
					 .add(RerMaterials.ROSE_GOLD_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.ROSE_GOLD_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/rose_gold")))
					 .add(RerMaterials.ROSE_GOLD_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.ROSE_GOLD_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/rose_gold")))
					 .add(RerMaterials.ROSE_GOLD_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.ROSE_GOLD_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/rose_gold")))
					 .add(RerMaterials.ROSE_GOLD_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.ROSE_GOLD_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/rose_gold")))
					 .add(RerMaterials.ROSE_GOLD_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.ROSE_GOLD_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/rose_gold")))
					 .add(RerMaterials.ROSE_GOLD_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.ROSE_GOLD_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/rose_gold")))
					 .add(RerMaterials.ROSE_GOLD_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.REFINED_OBSIDIAN_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/refined_obsidian")))
					 .add(RerMaterialsBlocks.REFINED_OBSIDIAN_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.REFINED_GLOWSTONE_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/refined_glowstone")))
					 .add(RerMaterialsBlocks.REFINED_GLOWSTONE_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.ORICHALCUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/orichalcum")))
					 .add(RerMaterialsBlocks.ORICHALCUM_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.ROSE_GOLD_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/rose_gold")))
					 .add(RerMaterialsBlocks.ROSE_GOLD_BLOCK.get().asItem());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.KNIGHTMETAL_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.KNIGHTMETAL_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/knightmetal")))
					 .add(RerMaterials.KNIGHTMETAL_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.KNIGHTMETAL_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/knightmetal")))
					 .add(RerMaterials.KNIGHTMETAL_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.KNIGHTMETAL_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/knightmetal")))
					 .add(RerMaterials.KNIGHTMETAL_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.KNIGHTMETAL_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/knightmetal")))
					 .add(RerMaterials.KNIGHTMETAL_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.KNIGHTMETAL_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/knightmetal")))
					 .add(RerMaterials.KNIGHTMETAL_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.KNIGHTMETAL_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/knightmetal")))
					 .add(RerMaterials.KNIGHTMETAL_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.KNIGHTMETAL_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/knightmetal")))
					 .add(RerMaterials.KNIGHTMETAL_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.KNIGHTMETAL_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/knightmetal")))
					 .add(RerMaterials.KNIGHTMETAL_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.KNIGHTMETAL_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/knightmetal")))
					 .add(RerMaterials.KNIGHTMETAL_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.KNIGHTMETAL_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/knightmetal")))
					 .add(RerMaterials.KNIGHTMETAL_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.KNIGHTMETAL_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/knightmetal")))
					 .add(RerMaterials.KNIGHTMETAL_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.KNIGHTMETAL_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/knightmetal")))
					 .add(RerMaterials.KNIGHTMETAL_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.KNIGHTMETAL_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/knightmetal")))
					 .add(RerMaterials.KNIGHTMETAL_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.KNIGHTMETAL_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/knightmetal")))
					 .add(RerMaterials.KNIGHTMETAL_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.KNIGHTMETAL_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/knightmetal")))
					 .add(RerMaterials.KNIGHTMETAL_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.SKY_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.SKY_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/sky")))
					 .add(RerMaterials.SKY_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.SKY_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/sky")))
					 .add(RerMaterials.SKY_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.SKY_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/sky")))
					 .add(RerMaterials.SKY_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.SKY_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/sky")))
					 .add(RerMaterials.SKY_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.SKY_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/sky")))
					 .add(RerMaterials.SKY_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.SKY_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/sky")))
					 .add(RerMaterials.SKY_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.SKY_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/sky")))
					 .add(RerMaterials.SKY_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.SKY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/sky")))
					 .add(RerMaterials.SKY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.SKY_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/sky")))
					 .add(RerMaterials.SKY_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.SKY_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/sky")))
					 .add(RerMaterials.SKY_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.SKY_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/sky")))
					 .add(RerMaterials.SKY_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.SKY_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/sky")))
					 .add(RerMaterials.SKY_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.SKY_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/sky")))
					 .add(RerMaterials.SKY_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.SKY_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/sky")))
					 .add(RerMaterials.SKY_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.SKY_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/sky")))
					 .add(RerMaterials.SKY_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.IRONWOOD_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.IRONWOOD_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/ironwood")))
					 .add(RerMaterials.IRONWOOD_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.IRONWOOD_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/ironwood")))
					 .add(RerMaterials.IRONWOOD_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.IRONWOOD_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/ironwood")))
					 .add(RerMaterials.IRONWOOD_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.IRONWOOD_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/ironwood")))
					 .add(RerMaterials.IRONWOOD_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.IRONWOOD_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/ironwood")))
					 .add(RerMaterials.IRONWOOD_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.IRONWOOD_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/ironwood")))
					 .add(RerMaterials.IRONWOOD_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.IRONWOOD_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/ironwood")))
					 .add(RerMaterials.IRONWOOD_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.IRONWOOD_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/ironwood")))
					 .add(RerMaterials.IRONWOOD_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.IRONWOOD_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/ironwood")))
					 .add(RerMaterials.IRONWOOD_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.IRONWOOD_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/ironwood")))
					 .add(RerMaterials.IRONWOOD_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.IRONWOOD_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/ironwood")))
					 .add(RerMaterials.IRONWOOD_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.IRONWOOD_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/ironwood")))
					 .add(RerMaterials.IRONWOOD_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.IRONWOOD_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/ironwood")))
					 .add(RerMaterials.IRONWOOD_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.IRONWOOD_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/ironwood")))
					 .add(RerMaterials.IRONWOOD_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.IRONWOOD_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/ironwood")))
					 .add(RerMaterials.IRONWOOD_RING.get());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.TAINED_GOLD_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.TAINED_GOLD_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/tained_gold")))
					 .add(RerMaterials.TAINED_GOLD_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.TAINED_GOLD_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/tained_gold")))
					 .add(RerMaterials.TAINED_GOLD_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.TAINED_GOLD_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/tained_gold")))
					 .add(RerMaterials.TAINED_GOLD_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.TAINED_GOLD_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/tained_gold")))
					 .add(RerMaterials.TAINED_GOLD_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.TAINED_GOLD_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/tained_gold")))
					 .add(RerMaterials.TAINED_GOLD_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.TAINED_GOLD_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/tained_gold")))
					 .add(RerMaterials.TAINED_GOLD_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.TAINED_GOLD_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/tained_gold")))
					 .add(RerMaterials.TAINED_GOLD_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.TAINED_GOLD_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/tained_gold")))
					 .add(RerMaterials.TAINED_GOLD_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.TAINED_GOLD_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/tained_gold")))
					 .add(RerMaterials.TAINED_GOLD_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.TAINED_GOLD_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/tained_gold")))
					 .add(RerMaterials.TAINED_GOLD_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.TAINED_GOLD_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/tained_gold")))
					 .add(RerMaterials.TAINED_GOLD_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.TAINED_GOLD_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/tained_gold")))
					 .add(RerMaterials.TAINED_GOLD_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.TAINED_GOLD_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/tained_gold")))
					 .add(RerMaterials.TAINED_GOLD_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.TAINED_GOLD_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/tained_gold")))
					 .add(RerMaterials.TAINED_GOLD_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.TAINED_GOLD_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/tained_gold")))
					 .add(RerMaterials.TAINED_GOLD_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.KNIGHTMETAL_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/knightmetal")))
					 .add(RerMaterialsBlocks.KNIGHTMETAL_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.SKY_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/sky")))
					 .add(RerMaterialsBlocks.SKY_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.IRONWOOD_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/ironwood")))
					 .add(RerMaterialsBlocks.IRONWOOD_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.TAINED_GOLD_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/tained_gold")))
					 .add(RerMaterialsBlocks.TAINED_GOLD_BLOCK.get().asItem());

		  tag(ItemTags.BEACON_PAYMENT_ITEMS)
					 .add(RerMaterials.INFUSED_IRON_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots")))
					 .add(RerMaterials.INFUSED_IRON_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "ingots/infused_iron")))
					 .add(RerMaterials.INFUSED_IRON_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets")))
					 .add(RerMaterials.INFUSED_IRON_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "nuggets/infused_iron")))
					 .add(RerMaterials.INFUSED_IRON_NUGGET.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates")))
					 .add(RerMaterials.INFUSED_IRON_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "plates/infused_iron")))
					 .add(RerMaterials.INFUSED_IRON_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates")))
					 .add(RerMaterials.INFUSED_IRON_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "large_plates/infused_iron")))
					 .add(RerMaterials.INFUSED_IRON_LARGE_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")))
					 .add(RerMaterials.INFUSED_IRON_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods/infused_iron")))
					 .add(RerMaterials.INFUSED_IRON_ROD.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires")))
					 .add(RerMaterials.INFUSED_IRON_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "wires/infused_iron")))
					 .add(RerMaterials.INFUSED_IRON_WIRE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears")))
					 .add(RerMaterials.INFUSED_IRON_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "gears/infused_iron")))
					 .add(RerMaterials.INFUSED_IRON_GEAR.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts")))
					 .add(RerMaterials.INFUSED_IRON_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "dusts/infused_iron")))
					 .add(RerMaterials.INFUSED_IRON_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts")))
					 .add(RerMaterials.INFUSED_IRON_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "tiny_dusts/infused_iron")))
					 .add(RerMaterials.INFUSED_IRON_TINY_DUST.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts")))
					 .add(RerMaterials.INFUSED_IRON_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "bolts/infused_iron")))
					 .add(RerMaterials.INFUSED_IRON_BOLT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots")))
					 .add(RerMaterials.INFUSED_IRON_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "double_ingots/infused_iron")))
					 .add(RerMaterials.INFUSED_IRON_DOUBLE_INGOT.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates")))
					 .add(RerMaterials.INFUSED_IRON_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "curved_plates/infused_iron")))
					 .add(RerMaterials.INFUSED_IRON_CURVED_PLATE.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks")))
					 .add(RerMaterials.INFUSED_IRON_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "chunks/infused_iron")))
					 .add(RerMaterials.INFUSED_IRON_CHUNK.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters")))
					 .add(RerMaterials.INFUSED_IRON_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "clusters/infused_iron")))
					 .add(RerMaterials.INFUSED_IRON_CLUSTER.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings")))
					 .add(RerMaterials.INFUSED_IRON_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rings/infused_iron")))
					 .add(RerMaterials.INFUSED_IRON_RING.get());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks")))
					 .add(RerMaterialsBlocks.INFUSED_IRON_BLOCK.get().asItem());

		  tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/infused_iron")))
					 .add(RerMaterialsBlocks.INFUSED_IRON_BLOCK.get().asItem());
	 }
}
