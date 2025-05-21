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
	 }
}
