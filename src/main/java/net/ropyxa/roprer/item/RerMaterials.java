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

	 public static final DeferredItem<Item> TIN_PLATE = ITEMS.register("tin_plate",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> TIN_LARGE_PLATE = ITEMS.register("tin_large_plate",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> TIN_ROD = ITEMS.register("tin_rod",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> TIN_WIRE = ITEMS.register("tin_wire",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> TIN_GEAR = ITEMS.register("tin_gear",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> TIN_DUST = ITEMS.register("tin_dust",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> TIN_TINY_DUST = ITEMS.register("tin_tiny_dust",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> TIN_RING = ITEMS.register("tin_ring",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> TIN_BOLT = ITEMS.register("tin_bolt",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> TIN_DOUBLE_INGOT = ITEMS.register("tin_double_ingot",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> TIN_CURVED_PLATE = ITEMS.register("tin_curved_plate",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> CRUSHED_TIN_ORE = ITEMS.register("crushed_tin_ore",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> TIN_CHUNK = ITEMS.register("tin_chunk",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> TIN_CLUSTER = ITEMS.register("tin_cluster",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> TIN_CRYSTAL = ITEMS.register("tin_crystal",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> TIN_SHARD = ITEMS.register("tin_shard",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> TIN_CLUMP = ITEMS.register("tin_clump",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> TIN_DIRTY_DUST = ITEMS.register("tin_dirty_dust",
				() -> new Item(new Item.Properties()));


	 public static final DeferredItem<Item> APATITE_GEM = ITEMS.register("apatite_gem",
				() -> new Item(new Item.Properties()));

	 public static final DeferredItem<Item> APATITE_CLUSTER_SHARD = ITEMS.register("apatite_cluster_shard",
				() -> new Item(new Item.Properties()));

	 public static void register(IEventBus eventBus) {
		  ITEMS.register(eventBus);
	 }
}