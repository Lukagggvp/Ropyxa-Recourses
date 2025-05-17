package net.ropyxa.roprer.misc;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ropyxa.roprer.RopRer;
import net.ropyxa.roprer.block.RerMaterialsBlocks;
import net.ropyxa.roprer.item.RerMaterials;

import java.util.function.Supplier;

public class RerCrativeModeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RopRer.MOD_ID);

	public static final Supplier<CreativeModeTab> RER_MATERIALS_TAB = CREATIVE_MODE_TAB.register("rer_materials_tab",
			  () -> CreativeModeTab.builder()
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

							  output.accept(RerMaterialsBlocks.APATITE_ORE);
							  output.accept(RerMaterialsBlocks.NETHERRACK_APATITE_ORE);
							  output.accept(RerMaterialsBlocks.END_STONE_APATITE_ORE);
							  output.accept(RerMaterialsBlocks.DEEPSLATE_APATITE_ORE);
							  output.accept(RerMaterialsBlocks.APATITE_CLUSTER_BLOCK);
							  output.accept(RerMaterials.APATITE_CLUSTER_SHARD);
							  output.accept(RerMaterialsBlocks.APATITE_BLOCK);
							  output.accept(RerMaterials.APATITE_GEM);
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
						 }).build());



	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TAB.register(eventBus);
	}
}
