package net.ropyxa.roprer.misc;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
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
							  output.accept((RerMaterialsBlocks.TIN_ORE));
							  output.accept((RerMaterialsBlocks.NETHERRACK_TIN_ORE));
							  output.accept((RerMaterialsBlocks.END_STONE_TIN_ORE));
							  output.accept((RerMaterialsBlocks.DEEPSLATE_TIN_ORE));
							  output.accept((RerMaterialsBlocks.RAW_TIN_BLOCK));
							  output.accept(RerMaterials.RAW_TIN);
							  output.accept((RerMaterialsBlocks.TIN_BLOCK));
							  output.accept(RerMaterials.TIN_INGOT);
						 }).build());



	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TAB.register(eventBus);
	}
}
