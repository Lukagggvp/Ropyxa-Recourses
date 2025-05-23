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
	 }
}
