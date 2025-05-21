package net.ropyxa.roprer.misc;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ropyxa.roprer.RopRer;
import net.ropyxa.roprer.block.RerMaterialsBlocks;
import net.ropyxa.roprer.item.RerMaterials;

import java.util.function.Supplier;

public class RerCrativeModeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RopRer.MOD_ID);

	 public static final Supplier<CreativeModeTab> RER_VANILLA_TAB = CREATIVE_MODE_TAB.register("rer_vanilla_tab",
				() -> CreativeModeTab.builder()
						  .icon(() -> new ItemStack(RerMaterials.TIN_INGOT.get()))
						  .title(Component.translatable("creativetab.rer_vanilla_tab"))
						  .displayItems((parameters, output) -> {
								output.accept(RerMaterialsBlocks.TIN_ORE);
						  }).build());

	public static final Supplier<CreativeModeTab> RER_MATERIALS_TAB = CREATIVE_MODE_TAB.register("rer_materials_tab",
			  () -> CreativeModeTab.builder()
						 .withTabsBefore(ResourceLocation.fromNamespaceAndPath(RopRer.MOD_ID, "rer_vanilla_tab"))
						 .icon(() -> new ItemStack(RerMaterials.TIN_INGOT.get()))
						 .title(Component.translatable("creativetab.rer_materials_tab"))
						 .displayItems((parameters, output) -> {
							  output.accept(RerMaterialsBlocks.TIN_ORE);
							  output.accept(RerMaterialsBlocks.NETHERRACK_TIN_ORE);
							  output.accept(RerMaterialsBlocks.END_STONE_TIN_ORE);
							  output.accept(RerMaterialsBlocks.DEEPSLATE_TIN_ORE);
							  output.accept(RerMaterialsBlocks.RAW_TIN_BLOCK);
							  output.accept(RerMaterials.RAW_TIN);
							  output.accept(RerMaterialsBlocks.TIN_BLOCK);
							  output.accept(RerMaterials.TIN_INGOT);
							  output.accept(RerMaterials.TIN_NUGGET);

							  output.accept(RerMaterialsBlocks.COBALT_ORE);
							  output.accept(RerMaterialsBlocks.NETHERRACK_COBALT_ORE);
							  output.accept(RerMaterialsBlocks.END_STONE_COBALT_ORE);
							  output.accept(RerMaterialsBlocks.DEEPSLATE_COBALT_ORE);
							  output.accept(RerMaterialsBlocks.RAW_COBALT_BLOCK);
							  output.accept(RerMaterials.RAW_COBALT);
							  output.accept(RerMaterialsBlocks.COBALT_BLOCK);
							  output.accept(RerMaterials.COBALT_INGOT);
							  output.accept(RerMaterials.COBALT_NUGGET);

							  output.accept(RerMaterialsBlocks.APATITE_ORE);
							  output.accept(RerMaterialsBlocks.NETHERRACK_APATITE_ORE);
							  output.accept(RerMaterialsBlocks.END_STONE_APATITE_ORE);
							  output.accept(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE);
							  output.accept(RerMaterialsBlocks.APATITE_CLUSTER_BLOCK);
							  output.accept(RerMaterials.APATITE_CLUSTER_SHARD);
							  output.accept(RerMaterialsBlocks.APATITE_BLOCK);
							  output.accept(RerMaterials.APATITE_GEM);
							  output.accept(RerMaterials.APATITE_FRAGMENT);

							  output.accept(RerMaterialsBlocks.CINNABAR_ORE);
							  output.accept(RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE);
							  output.accept(RerMaterialsBlocks.END_STONE_CINNABAR_ORE);
							  output.accept(RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE);
							  output.accept(RerMaterialsBlocks.CINNABAR_CLUSTER_BLOCK);
							  output.accept(RerMaterials.CINNABAR_CLUSTER_SHARD);
							  output.accept(RerMaterialsBlocks.CINNABAR_BLOCK);
							  output.accept(RerMaterials.CINNABAR_GEM);
							  output.accept(RerMaterials.CINNABAR_FRAGMENT);
						 }).build());

	public static final Supplier<CreativeModeTab> RER_DETAILS_TAB = CREATIVE_MODE_TAB.register("rer_details_tab",
			  () -> CreativeModeTab.builder()
						 .withTabsBefore(ResourceLocation.fromNamespaceAndPath(RopRer.MOD_ID, "rer_materials_tab"))
						 .icon(() -> new ItemStack(RerMaterials.TIN_GEAR.get()))
						 .title(Component.translatable("creativetab.rer_details_tab"))
						 .displayItems((parameters, output) -> {
							  output.accept(RerMaterials.TIN_PLATE);
							  output.accept(RerMaterials.TIN_LARGE_PLATE);
							  output.accept(RerMaterials.TIN_ROD);
							  output.accept(RerMaterials.TIN_WIRE);
							  output.accept(RerMaterials.TIN_GEAR);
							  output.accept(RerMaterials.TIN_DUST);
							  output.accept(RerMaterials.TIN_TINY_DUST);
							  output.accept(RerMaterials.TIN_RING);
							  output.accept(RerMaterials.TIN_BOLT);
							  output.accept(RerMaterials.TIN_DOUBLE_INGOT);
							  output.accept(RerMaterials.TIN_CURVED_PLATE);
							  output.accept(RerMaterials.CRUSHED_TIN_ORE);
							  output.accept(RerMaterials.TIN_CHUNK);
							  output.accept(RerMaterials.TIN_CLUSTER);
							  output.accept(RerMaterials.TIN_CRYSTAL);
							  output.accept(RerMaterials.TIN_SHARD);
							  output.accept(RerMaterials.TIN_CLUMP);
							  output.accept(RerMaterials.TIN_DIRTY_DUST);

							  output.accept(RerMaterials.COBALT_PLATE);
							  output.accept(RerMaterials.COBALT_LARGE_PLATE);
							  output.accept(RerMaterials.COBALT_ROD);
							  output.accept(RerMaterials.COBALT_WIRE);
							  output.accept(RerMaterials.COBALT_GEAR);
							  output.accept(RerMaterials.COBALT_DUST);
							  output.accept(RerMaterials.COBALT_TINY_DUST);
							  output.accept(RerMaterials.COBALT_RING);
							  output.accept(RerMaterials.COBALT_BOLT);
							  output.accept(RerMaterials.COBALT_DOUBLE_INGOT);
							  output.accept(RerMaterials.COBALT_CURVED_PLATE);
							  output.accept(RerMaterials.CRUSHED_COBALT_ORE);
							  output.accept(RerMaterials.COBALT_CHUNK);
							  output.accept(RerMaterials.COBALT_CLUSTER);
							  output.accept(RerMaterials.COBALT_CRYSTAL);
							  output.accept(RerMaterials.COBALT_SHARD);
							  output.accept(RerMaterials.COBALT_CLUMP);
							  output.accept(RerMaterials.COBALT_DIRTY_DUST);

							  output.accept(RerMaterials.APATITE_PLATE);
							  output.accept(RerMaterials.APATITE_LARGE_PLATE);
							  output.accept(RerMaterials.APATITE_ROD);
							  output.accept(RerMaterials.APATITE_WIRE);
							  output.accept(RerMaterials.APATITE_GEAR);
							  output.accept(RerMaterials.APATITE_DUST);
							  output.accept(RerMaterials.APATITE_TINY_DUST);
							  output.accept(RerMaterials.APATITE_RING);
							  output.accept(RerMaterials.APATITE_BOLT);
							  output.accept(RerMaterials.APATITE_DOUBLE_GEM);
							  output.accept(RerMaterials.APATITE_CURVED_PLATE);
							  output.accept(RerMaterials.CRUSHED_APATITE_ORE);
							  output.accept(RerMaterials.APATITE_CHUNK);
							  output.accept(RerMaterials.APATITE_CLUSTER);
							  output.accept(RerMaterials.APATITE_CRYSTAL);
							  output.accept(RerMaterials.APATITE_SHARD);
							  output.accept(RerMaterials.APATITE_CLUMP);
							  output.accept(RerMaterials.APATITE_DIRTY_DUST);

							  output.accept(RerMaterials.CINNABAR_PLATE);
							  output.accept(RerMaterials.CINNABAR_LARGE_PLATE);
							  output.accept(RerMaterials.CINNABAR_ROD);
							  output.accept(RerMaterials.CINNABAR_WIRE);
							  output.accept(RerMaterials.CINNABAR_GEAR);
							  output.accept(RerMaterials.CINNABAR_DUST);
							  output.accept(RerMaterials.CINNABAR_TINY_DUST);
							  output.accept(RerMaterials.CINNABAR_RING);
							  output.accept(RerMaterials.CINNABAR_BOLT);
							  output.accept(RerMaterials.CINNABAR_DOUBLE_GEM);
							  output.accept(RerMaterials.CINNABAR_CURVED_PLATE);
							  output.accept(RerMaterials.CRUSHED_CINNABAR_ORE);
							  output.accept(RerMaterials.CINNABAR_CHUNK);
							  output.accept(RerMaterials.CINNABAR_CLUSTER);
							  output.accept(RerMaterials.CINNABAR_CRYSTAL);
							  output.accept(RerMaterials.CINNABAR_SHARD);
							  output.accept(RerMaterials.CINNABAR_CLUMP);
							  output.accept(RerMaterials.CINNABAR_DIRTY_DUST);
						 }).build());

	 public static final Supplier<CreativeModeTab> RER_ALLOYS_TAB = CREATIVE_MODE_TAB.register("rer_alloys_tab",
				() -> CreativeModeTab.builder()
						  .withTabsBefore(ResourceLocation.fromNamespaceAndPath(RopRer.MOD_ID, "rer_details_tab"))
						  .icon(() -> new ItemStack(RerMaterials.BRASS_INGOT.get()))
						  .title(Component.translatable("creativetab.rer_alloys_tab"))
						  .displayItems((parameters, output) -> {
								output.accept(RerMaterialsBlocks.BRASS_BLOCK);
								output.accept(RerMaterials.BRASS_INGOT);
								output.accept(RerMaterials.BRASS_NUGGET);
								output.accept(RerMaterials.BRASS_PLATE);
								output.accept(RerMaterials.BRASS_LARGE_PLATE);
								output.accept(RerMaterials.BRASS_ROD);
								output.accept(RerMaterials.BRASS_WIRE);
								output.accept(RerMaterials.BRASS_GEAR);
								output.accept(RerMaterials.BRASS_DUST);
								output.accept(RerMaterials.BRASS_TINY_DUST);
								output.accept(RerMaterials.BRASS_RING);
								output.accept(RerMaterials.BRASS_BOLT);
								output.accept(RerMaterials.BRASS_DOUBLE_INGOT);
								output.accept(RerMaterials.BRASS_CURVED_PLATE);
								output.accept(RerMaterials.BRASS_CHUNK);
								output.accept(RerMaterials.BRASS_CLUSTER);
								output.accept(RerMaterials.NOTHING1);
								output.accept(RerMaterials.NOTHING2);

								output.accept(RerMaterialsBlocks.BRONZE_BLOCK);
								output.accept(RerMaterials.BRONZE_INGOT);
								output.accept(RerMaterials.BRONZE_NUGGET);
								output.accept(RerMaterials.BRONZE_PLATE);
								output.accept(RerMaterials.BRONZE_LARGE_PLATE);
								output.accept(RerMaterials.BRONZE_ROD);
								output.accept(RerMaterials.BRONZE_WIRE);
								output.accept(RerMaterials.BRONZE_GEAR);
								output.accept(RerMaterials.BRONZE_DUST);
								output.accept(RerMaterials.BRONZE_TINY_DUST);
								output.accept(RerMaterials.BRONZE_RING);
								output.accept(RerMaterials.BRONZE_BOLT);
								output.accept(RerMaterials.BRONZE_DOUBLE_INGOT);
								output.accept(RerMaterials.BRONZE_CURVED_PLATE);
								output.accept(RerMaterials.BRONZE_CHUNK);
								output.accept(RerMaterials.BRONZE_CLUSTER);
								output.accept(RerMaterials.NOTHING3);
								output.accept(RerMaterials.NOTHING4);

								output.accept(RerMaterialsBlocks.CAST_IRON_BLOCK);
								output.accept(RerMaterials.CAST_IRON_INGOT);
								output.accept(RerMaterials.CAST_IRON_NUGGET);
								output.accept(RerMaterials.CAST_IRON_PLATE);
								output.accept(RerMaterials.CAST_IRON_LARGE_PLATE);
								output.accept(RerMaterials.CAST_IRON_ROD);
								output.accept(RerMaterials.CAST_IRON_WIRE);
								output.accept(RerMaterials.CAST_IRON_GEAR);
								output.accept(RerMaterials.CAST_IRON_DUST);
								output.accept(RerMaterials.CAST_IRON_TINY_DUST);
								output.accept(RerMaterials.CAST_IRON_RING);
								output.accept(RerMaterials.CAST_IRON_BOLT);
								output.accept(RerMaterials.CAST_IRON_DOUBLE_INGOT);
								output.accept(RerMaterials.CAST_IRON_CURVED_PLATE);
								output.accept(RerMaterials.CAST_IRON_CHUNK);
								output.accept(RerMaterials.CAST_IRON_CLUSTER);
								output.accept(RerMaterials.NOTHING5);
								output.accept(RerMaterials.NOTHING6);

								output.accept(RerMaterialsBlocks.SOUL_STEEL_BLOCK);
								output.accept(RerMaterials.SOUL_STEEL_INGOT);
								output.accept(RerMaterials.SOUL_STEEL_NUGGET);
								output.accept(RerMaterials.SOUL_STEEL_PLATE);
								output.accept(RerMaterials.SOUL_STEEL_LARGE_PLATE);
								output.accept(RerMaterials.SOUL_STEEL_ROD);
								output.accept(RerMaterials.SOUL_STEEL_WIRE);
								output.accept(RerMaterials.SOUL_STEEL_GEAR);
								output.accept(RerMaterials.SOUL_STEEL_DUST);
								output.accept(RerMaterials.SOUL_STEEL_TINY_DUST);
								output.accept(RerMaterials.SOUL_STEEL_RING);
								output.accept(RerMaterials.SOUL_STEEL_BOLT);
								output.accept(RerMaterials.SOUL_STEEL_DOUBLE_INGOT);
								output.accept(RerMaterials.SOUL_STEEL_CURVED_PLATE);
								output.accept(RerMaterials.SOUL_STEEL_CHUNK);
								output.accept(RerMaterials.SOUL_STEEL_CLUSTER);
								output.accept(RerMaterials.NOTHING7);
								output.accept(RerMaterials.NOTHING8);

								output.accept(RerMaterialsBlocks.STEEL_BLOCK);
								output.accept(RerMaterials.STEEL_INGOT);
								output.accept(RerMaterials.STEEL_NUGGET);
								output.accept(RerMaterials.STEEL_PLATE);
								output.accept(RerMaterials.STEEL_LARGE_PLATE);
								output.accept(RerMaterials.STEEL_ROD);
								output.accept(RerMaterials.STEEL_WIRE);
								output.accept(RerMaterials.STEEL_GEAR);
								output.accept(RerMaterials.STEEL_DUST);
								output.accept(RerMaterials.STEEL_TINY_DUST);
								output.accept(RerMaterials.STEEL_RING);
								output.accept(RerMaterials.STEEL_BOLT);
								output.accept(RerMaterials.STEEL_DOUBLE_INGOT);
								output.accept(RerMaterials.STEEL_CURVED_PLATE);
								output.accept(RerMaterials.STEEL_CHUNK);
								output.accept(RerMaterials.STEEL_CLUSTER);
								output.accept(RerMaterials.NOTHING9);
								output.accept(RerMaterials.NOTHING10);
						  }).build());



	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TAB.register(eventBus);
	}
}
