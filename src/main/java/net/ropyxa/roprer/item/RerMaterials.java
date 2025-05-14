package net.ropyxa.roprer.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ropyxa.roprer.RopRer;

public class RerMaterials {
	 public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RopRer.MOD_ID);

	 public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> RAW_TIN = ITEMS.register("raw_tin",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
				() -> new Item(new Item.Properties()));


	 public static void register(IEventBus eventBus) {
		  ITEMS.register(eventBus);
	 }
}