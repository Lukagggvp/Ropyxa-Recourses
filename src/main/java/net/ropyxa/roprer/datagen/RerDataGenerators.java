package net.ropyxa.roprer.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.ropyxa.roprer.RopRer;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = RopRer.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class RerDataGenerators {
	 @SubscribeEvent
	 public static void gaterData(GatherDataEvent event) {
		  DataGenerator generator = event.getGenerator();
		  PackOutput packOutput = generator.getPackOutput();
		  ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
		  CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

		  generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
					 List.of(new LootTableProvider.SubProviderEntry(RerBlockLootProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
		  generator.addProvider(event.includeServer(), new RerRecipeProvider(packOutput, lookupProvider));

		  BlockTagsProvider blockTagsProvider = new RerBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
		  generator.addProvider(event.includeServer(), blockTagsProvider);
		  generator.addProvider(event.includeServer(), new RerItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));

		  generator.addProvider(event.includeServer(),  new RerDataMapProvider(packOutput, lookupProvider));

		  generator.addProvider(event.includeClient(), new RerItemModelProvider(packOutput, existingFileHelper));
		  generator.addProvider(event.includeClient(), new RerBlockStateProvider(packOutput, existingFileHelper));

	 }
}