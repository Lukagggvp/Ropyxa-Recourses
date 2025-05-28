package net.ropyxa.roprer.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.ropyxa.roprer.block.RerMaterialsBlocks;
import net.ropyxa.roprer.item.RerMaterials;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class RerRecipeProvider extends RecipeProvider implements IConditionBuilder {
	 public RerRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
		  super(output, registries);
	 }

	 @Override
	 protected void buildRecipes(RecipeOutput recipeOutput) {
		  List<ItemLike> TIN_SMELTABLES = List.of(
					 RerMaterials.RAW_TIN,
					 RerMaterialsBlocks.TIN_ORE,
					 RerMaterialsBlocks.NETHERRACK_TIN_ORE,
					 RerMaterialsBlocks.END_STONE_TIN_ORE,
					 RerMaterialsBlocks.DEEPSLATE_TIN_ORE,
					 RerMaterials.TIN_DUST);

		  List<ItemLike> APATITE_SMELTABLES = List.of(
					 RerMaterials.APATITE_CLUSTER_SHARD,
					 RerMaterialsBlocks.APATITE_ORE,
					 RerMaterialsBlocks.NETHERRACK_APATITE_ORE,
					 RerMaterialsBlocks.END_STONE_APATITE_ORE,
					 RerMaterialsBlocks.DEEPSLATE_APATITE_ORE,
					 RerMaterials.APATITE_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.TIN_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.TIN_BOLT.get())
					 .define('B', RerMaterials.TIN_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TIN))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.TIN_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.TIN_ROD.get())
					 .define('B', RerMaterials.TIN_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TIN))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.TIN_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.TIN_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TIN))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.TIN_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.TIN_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TIN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TIN_BOLT.get(), 2)
					 .requires(RerMaterials.TIN_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TIN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TIN_TINY_DUST.get(), 9)
					 .requires(RerMaterials.TIN_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TIN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TIN_DUST.get())
					 .requires(RerMaterials.TIN_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TIN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TIN_LARGE_PLATE.get())
					 .requires(RerMaterials.TIN_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TIN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TIN_CLUSTER.get())
					 .requires(RerMaterials.TIN_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TIN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.RAW_TIN.get(), 9)
					 .requires(RerMaterialsBlocks.RAW_TIN_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TIN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.TIN_BLOCK.get(), 1)
					 .requires(RerMaterials.TIN_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TIN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.RAW_TIN_BLOCK.get(), 1)
					 .requires(RerMaterials.RAW_TIN, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TIN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TIN_INGOT.get())
					 .requires(RerMaterials.TIN_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TIN))
					 .save(recipeOutput, "roprer:tin_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TIN_NUGGET.get(), 9)
					 .requires(RerMaterials.TIN_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TIN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TIN_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.TIN_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TIN))
					 .save(recipeOutput);


		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.APATITE_CLUSTER_SHARD.get(), 9)
					 .requires(RerMaterialsBlocks.APATITE_CLUSTER_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.APATITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.APATITE_CLUSTER_BLOCK.get(), 1)
					 .requires(RerMaterials.APATITE_CLUSTER_SHARD, 9)
					 .unlockedBy("has_raw", has(RerMaterials.APATITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.APATITE_BLOCK.get(), 1)
					 .requires(RerMaterials.APATITE_GEM, 9)
					 .unlockedBy("has_raw", has(RerMaterials.APATITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.APATITE_GEM.get(), 9)
					 .requires(RerMaterialsBlocks.APATITE_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.APATITE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.APATITE_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.APATITE_BOLT.get())
					 .define('B', RerMaterials.APATITE_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.APATITE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.APATITE_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.APATITE_ROD.get())
					 .define('B', RerMaterials.APATITE_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.APATITE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.APATITE_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.APATITE_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.APATITE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.APATITE_DOUBLE_GEM.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.APATITE_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.APATITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.APATITE_BOLT.get(), 2)
					 .requires(RerMaterials.APATITE_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.APATITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.APATITE_TINY_DUST.get(), 9)
					 .requires(RerMaterials.APATITE_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.APATITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.APATITE_DUST.get())
					 .requires(RerMaterials.APATITE_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.APATITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.APATITE_LARGE_PLATE.get())
					 .requires(RerMaterials.APATITE_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.APATITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.APATITE_CLUSTER.get())
					 .requires(RerMaterials.APATITE_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.APATITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.APATITE_GEM.get(), 1)
					 .requires(RerMaterials.APATITE_FRAGMENT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.APATITE_GEM))
					 .save(recipeOutput, "roprer:apatite_gem_from_fragment");

		  oreSmelting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, RerMaterials.TIN_INGOT.get(), 0.2f, 200, "tin");
		  oreBlasting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, RerMaterials.TIN_INGOT.get(), 0.2f, 100, "tin");
		  oreSmelting(recipeOutput, APATITE_SMELTABLES, RecipeCategory.MISC, RerMaterials.APATITE_GEM.get(), 0.2f, 200, "apatite");
		  oreBlasting(recipeOutput, APATITE_SMELTABLES, RecipeCategory.MISC, RerMaterials.APATITE_GEM.get(), 0.2f, 100, "apatite");

		  List<ItemLike> CINNABAR_SMELTABLES = List.of(
					 RerMaterials.CINNABAR_CLUSTER_SHARD,
					 RerMaterialsBlocks.CINNABAR_ORE,
					 RerMaterialsBlocks.NETHERRACK_CINNABAR_ORE,
					 RerMaterialsBlocks.END_STONE_CINNABAR_ORE,
					 RerMaterialsBlocks.DEEPSLATE_CINNABAR_ORE,
					 RerMaterials.CINNABAR_DUST);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CINNABAR_CLUSTER_SHARD.get(), 9)
					 .requires(RerMaterialsBlocks.CINNABAR_CLUSTER_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.CINNABAR_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.CINNABAR_CLUSTER_BLOCK.get(), 1)
					 .requires(RerMaterials.CINNABAR_CLUSTER_SHARD, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CINNABAR_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.CINNABAR_BLOCK.get(), 1)
					 .requires(RerMaterials.CINNABAR_GEM, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CINNABAR_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CINNABAR_GEM.get(), 9)
					 .requires(RerMaterialsBlocks.CINNABAR_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.CINNABAR_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CINNABAR_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.CINNABAR_BOLT.get())
					 .define('B', RerMaterials.CINNABAR_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.CINNABAR_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CINNABAR_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.CINNABAR_ROD.get())
					 .define('B', RerMaterials.CINNABAR_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.CINNABAR_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CINNABAR_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.CINNABAR_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.CINNABAR_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CINNABAR_DOUBLE_GEM.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.CINNABAR_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.CINNABAR_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CINNABAR_BOLT.get(), 2)
					 .requires(RerMaterials.CINNABAR_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.CINNABAR_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CINNABAR_TINY_DUST.get(), 9)
					 .requires(RerMaterials.CINNABAR_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.CINNABAR_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CINNABAR_DUST.get())
					 .requires(RerMaterials.CINNABAR_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CINNABAR_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CINNABAR_LARGE_PLATE.get())
					 .requires(RerMaterials.CINNABAR_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.CINNABAR_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CINNABAR_CLUSTER.get())
					 .requires(RerMaterials.CINNABAR_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.CINNABAR_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CINNABAR_GEM.get(), 1)
					 .requires(RerMaterials.CINNABAR_FRAGMENT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CINNABAR_GEM))
					 .save(recipeOutput, "roprer:cinnabar_gem_from_fragment");

		  oreSmelting(recipeOutput, CINNABAR_SMELTABLES, RecipeCategory.MISC, RerMaterials.CINNABAR_GEM.get(), 0.2f, 200, "cinnabar");
		  oreBlasting(recipeOutput, CINNABAR_SMELTABLES, RecipeCategory.MISC, RerMaterials.CINNABAR_GEM.get(), 0.2f, 100, "cinnabar");


		  List<ItemLike> COBALT_SMELTABLES = List.of(
					 RerMaterials.RAW_COBALT,
					 RerMaterialsBlocks.COBALT_ORE,
					 RerMaterialsBlocks.NETHERRACK_COBALT_ORE,
					 RerMaterialsBlocks.END_STONE_COBALT_ORE,
					 RerMaterialsBlocks.DEEPSLATE_COBALT_ORE,
					 RerMaterials.COBALT_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.COBALT_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.COBALT_BOLT.get())
					 .define('B', RerMaterials.COBALT_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_COBALT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.COBALT_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.COBALT_ROD.get())
					 .define('B', RerMaterials.COBALT_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_COBALT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.COBALT_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.COBALT_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_COBALT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.COBALT_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.COBALT_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_COBALT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.COBALT_BOLT.get(), 2)
					 .requires(RerMaterials.COBALT_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_COBALT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.COBALT_TINY_DUST.get(), 9)
					 .requires(RerMaterials.COBALT_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_COBALT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.COBALT_DUST.get())
					 .requires(RerMaterials.COBALT_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_COBALT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.COBALT_LARGE_PLATE.get())
					 .requires(RerMaterials.COBALT_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_COBALT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.COBALT_CLUSTER.get())
					 .requires(RerMaterials.COBALT_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_COBALT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.RAW_COBALT.get(), 9)
					 .requires(RerMaterialsBlocks.RAW_COBALT_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_COBALT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.COBALT_BLOCK.get(), 1)
					 .requires(RerMaterials.COBALT_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_COBALT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.RAW_COBALT_BLOCK.get(), 1)
					 .requires(RerMaterials.RAW_COBALT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_COBALT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.COBALT_INGOT.get())
					 .requires(RerMaterials.COBALT_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_COBALT))
					 .save(recipeOutput, "roprer:cobalt_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.COBALT_NUGGET.get(), 9)
					 .requires(RerMaterials.COBALT_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_COBALT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.COBALT_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.COBALT_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_COBALT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, COBALT_SMELTABLES, RecipeCategory.MISC, RerMaterials.COBALT_INGOT.get(), 0.2f, 200, "cobalt");
		  oreBlasting(recipeOutput, COBALT_SMELTABLES, RecipeCategory.MISC, RerMaterials.COBALT_INGOT.get(), 0.2f, 100, "cobalt");

		  List<ItemLike> BRASS_SMELTABLES = List.of(
					 RerMaterials.BRASS_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.BRASS_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.BRASS_BOLT.get())
					 .define('B', RerMaterials.BRASS_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.BRASS_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.BRASS_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.BRASS_ROD.get())
					 .define('B', RerMaterials.BRASS_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.BRASS_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.BRASS_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.BRASS_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.BRASS_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.BRASS_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.BRASS_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.BRASS_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BRASS_BOLT.get(), 2)
					 .requires(RerMaterials.BRASS_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.BRASS_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BRASS_TINY_DUST.get(), 9)
					 .requires(RerMaterials.BRASS_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.BRASS_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BRASS_DUST.get())
					 .requires(RerMaterials.BRASS_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.BRASS_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BRASS_LARGE_PLATE.get())
					 .requires(RerMaterials.BRASS_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.BRASS_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BRASS_CLUSTER.get())
					 .requires(RerMaterials.BRASS_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.BRASS_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.BRASS_BLOCK.get(), 1)
					 .requires(RerMaterials.BRASS_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.BRASS_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BRASS_INGOT.get())
					 .requires(RerMaterials.BRASS_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.BRASS_INGOT))
					 .save(recipeOutput, "roprer:brass_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BRASS_NUGGET.get(), 9)
					 .requires(RerMaterials.BRASS_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.BRASS_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BRASS_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.BRASS_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.BRASS_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, BRASS_SMELTABLES, RecipeCategory.MISC, RerMaterials.BRASS_INGOT.get(), 0.2f, 200, "brass");        oreBlasting(recipeOutput, BRASS_SMELTABLES, RecipeCategory.MISC, RerMaterials.BRASS_INGOT.get(), 0.2f, 100, "brass");
		  List<ItemLike> BRONZE_SMELTABLES = List.of(
					 RerMaterials.BRONZE_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.BRONZE_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.BRONZE_BOLT.get())
					 .define('B', RerMaterials.BRONZE_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.BRONZE_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.BRONZE_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.BRONZE_ROD.get())
					 .define('B', RerMaterials.BRONZE_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.BRONZE_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.BRONZE_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.BRONZE_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.BRONZE_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.BRONZE_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.BRONZE_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.BRONZE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BRONZE_BOLT.get(), 2)
					 .requires(RerMaterials.BRONZE_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.BRONZE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BRONZE_TINY_DUST.get(), 9)
					 .requires(RerMaterials.BRONZE_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.BRONZE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BRONZE_DUST.get())
					 .requires(RerMaterials.BRONZE_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.BRONZE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BRONZE_LARGE_PLATE.get())
					 .requires(RerMaterials.BRONZE_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.BRONZE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BRONZE_CLUSTER.get())
					 .requires(RerMaterials.BRONZE_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.BRONZE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.BRONZE_BLOCK.get(), 1)
					 .requires(RerMaterials.BRONZE_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.BRONZE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BRONZE_INGOT.get())
					 .requires(RerMaterials.BRONZE_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.BRONZE_INGOT))
					 .save(recipeOutput, "roprer:bronze_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BRONZE_NUGGET.get(), 9)
					 .requires(RerMaterials.BRONZE_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.BRONZE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BRONZE_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.BRONZE_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.BRONZE_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, BRONZE_SMELTABLES, RecipeCategory.MISC, RerMaterials.BRONZE_INGOT.get(), 0.2f, 200, "bronze");
		  oreBlasting(recipeOutput, BRONZE_SMELTABLES, RecipeCategory.MISC, RerMaterials.BRONZE_INGOT.get(), 0.2f, 100, "bronze");

		  List<ItemLike> CAST_IRON_SMELTABLES = List.of(
					 RerMaterials.CAST_IRON_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CAST_IRON_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.CAST_IRON_BOLT.get())
					 .define('B', RerMaterials.CAST_IRON_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.CAST_IRON_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CAST_IRON_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.CAST_IRON_ROD.get())
					 .define('B', RerMaterials.CAST_IRON_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.CAST_IRON_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CAST_IRON_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.CAST_IRON_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.CAST_IRON_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CAST_IRON_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.CAST_IRON_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.CAST_IRON_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CAST_IRON_BOLT.get(), 2)
					 .requires(RerMaterials.CAST_IRON_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.CAST_IRON_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CAST_IRON_TINY_DUST.get(), 9)
					 .requires(RerMaterials.CAST_IRON_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.CAST_IRON_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CAST_IRON_DUST.get())
					 .requires(RerMaterials.CAST_IRON_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CAST_IRON_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CAST_IRON_LARGE_PLATE.get())
					 .requires(RerMaterials.CAST_IRON_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.CAST_IRON_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CAST_IRON_CLUSTER.get())
					 .requires(RerMaterials.CAST_IRON_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.CAST_IRON_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.CAST_IRON_BLOCK.get(), 1)
					 .requires(RerMaterials.CAST_IRON_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CAST_IRON_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CAST_IRON_INGOT.get())
					 .requires(RerMaterials.CAST_IRON_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CAST_IRON_INGOT))
					 .save(recipeOutput, "roprer:cast_iron_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CAST_IRON_NUGGET.get(), 9)
					 .requires(RerMaterials.CAST_IRON_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.CAST_IRON_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CAST_IRON_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.CAST_IRON_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.CAST_IRON_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, CAST_IRON_SMELTABLES, RecipeCategory.MISC, RerMaterials.CAST_IRON_INGOT.get(), 0.2f, 200, "cast_iron");
		  oreBlasting(recipeOutput, CAST_IRON_SMELTABLES, RecipeCategory.MISC, RerMaterials.CAST_IRON_INGOT.get(), 0.2f, 100, "cast_iron");

		  List<ItemLike> SOUL_STEEL_SMELTABLES = List.of(
					 RerMaterials.SOUL_STEEL_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.SOUL_STEEL_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.SOUL_STEEL_BOLT.get())
					 .define('B', RerMaterials.SOUL_STEEL_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.SOUL_STEEL_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.SOUL_STEEL_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.SOUL_STEEL_ROD.get())
					 .define('B', RerMaterials.SOUL_STEEL_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.SOUL_STEEL_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.SOUL_STEEL_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.SOUL_STEEL_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.SOUL_STEEL_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.SOUL_STEEL_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.SOUL_STEEL_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.SOUL_STEEL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SOUL_STEEL_BOLT.get(), 2)
					 .requires(RerMaterials.SOUL_STEEL_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.SOUL_STEEL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SOUL_STEEL_TINY_DUST.get(), 9)
					 .requires(RerMaterials.SOUL_STEEL_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.SOUL_STEEL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SOUL_STEEL_DUST.get())
					 .requires(RerMaterials.SOUL_STEEL_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.SOUL_STEEL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SOUL_STEEL_LARGE_PLATE.get())
					 .requires(RerMaterials.SOUL_STEEL_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.SOUL_STEEL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SOUL_STEEL_CLUSTER.get())
					 .requires(RerMaterials.SOUL_STEEL_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.SOUL_STEEL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.SOUL_STEEL_BLOCK.get(), 1)
					 .requires(RerMaterials.SOUL_STEEL_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.SOUL_STEEL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SOUL_STEEL_INGOT.get())
					 .requires(RerMaterials.SOUL_STEEL_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.SOUL_STEEL_INGOT))
					 .save(recipeOutput, "roprer:soul_steel_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SOUL_STEEL_NUGGET.get(), 9)
					 .requires(RerMaterials.SOUL_STEEL_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.SOUL_STEEL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SOUL_STEEL_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.SOUL_STEEL_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.SOUL_STEEL_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, SOUL_STEEL_SMELTABLES, RecipeCategory.MISC, RerMaterials.SOUL_STEEL_INGOT.get(), 0.2f, 200, "soul_steel");
		  oreBlasting(recipeOutput, SOUL_STEEL_SMELTABLES, RecipeCategory.MISC, RerMaterials.SOUL_STEEL_INGOT.get(), 0.2f, 100, "soul_steel");

		  List<ItemLike> STEEL_SMELTABLES = List.of(
					 RerMaterials.STEEL_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.STEEL_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.STEEL_BOLT.get())
					 .define('B', RerMaterials.STEEL_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.STEEL_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.STEEL_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.STEEL_ROD.get())
					 .define('B', RerMaterials.STEEL_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.STEEL_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.STEEL_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.STEEL_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.STEEL_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.STEEL_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.STEEL_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.STEEL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.STEEL_BOLT.get(), 2)
					 .requires(RerMaterials.STEEL_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.STEEL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.STEEL_TINY_DUST.get(), 9)
					 .requires(RerMaterials.STEEL_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.STEEL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.STEEL_DUST.get())
					 .requires(RerMaterials.STEEL_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.STEEL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.STEEL_LARGE_PLATE.get())
					 .requires(RerMaterials.STEEL_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.STEEL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.STEEL_CLUSTER.get())
					 .requires(RerMaterials.STEEL_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.STEEL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.STEEL_BLOCK.get(), 1)
					 .requires(RerMaterials.STEEL_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.STEEL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.STEEL_INGOT.get())
					 .requires(RerMaterials.STEEL_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.STEEL_INGOT))
					 .save(recipeOutput, "roprer:steel_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.STEEL_NUGGET.get(), 9)
					 .requires(RerMaterials.STEEL_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.STEEL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.STEEL_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.STEEL_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.STEEL_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, STEEL_SMELTABLES, RecipeCategory.MISC, RerMaterials.STEEL_INGOT.get(), 0.2f, 200, "steel");
		  oreBlasting(recipeOutput, STEEL_SMELTABLES, RecipeCategory.MISC, RerMaterials.STEEL_INGOT.get(), 0.2f, 100, "steel");

		  List<ItemLike> ALUMINUM_SMELTABLES = List.of(
					 RerMaterials.RAW_ALUMINUM,
					 RerMaterialsBlocks.ALUMINUM_ORE,
					 RerMaterialsBlocks.NETHERRACK_ALUMINUM_ORE,
					 RerMaterialsBlocks.END_STONE_ALUMINUM_ORE,
					 RerMaterialsBlocks.DEEPSLATE_ALUMINUM_ORE,
					 RerMaterials.ALUMINUM_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ALUMINUM_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.ALUMINUM_BOLT.get())
					 .define('B', RerMaterials.ALUMINUM_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_ALUMINUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ALUMINUM_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.ALUMINUM_ROD.get())
					 .define('B', RerMaterials.ALUMINUM_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_ALUMINUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ALUMINUM_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.ALUMINUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_ALUMINUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ALUMINUM_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.ALUMINUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_ALUMINUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ALUMINUM_BOLT.get(), 2)
					 .requires(RerMaterials.ALUMINUM_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_ALUMINUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ALUMINUM_TINY_DUST.get(), 9)
					 .requires(RerMaterials.ALUMINUM_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_ALUMINUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ALUMINUM_DUST.get())
					 .requires(RerMaterials.ALUMINUM_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_ALUMINUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ALUMINUM_LARGE_PLATE.get())
					 .requires(RerMaterials.ALUMINUM_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_ALUMINUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ALUMINUM_CLUSTER.get())
					 .requires(RerMaterials.ALUMINUM_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_ALUMINUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.RAW_ALUMINUM.get(), 9)
					 .requires(RerMaterialsBlocks.RAW_ALUMINUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_ALUMINUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.ALUMINUM_BLOCK.get(), 1)
					 .requires(RerMaterials.ALUMINUM_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_ALUMINUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.RAW_ALUMINUM_BLOCK.get(), 1)
					 .requires(RerMaterials.RAW_ALUMINUM, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_ALUMINUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ALUMINUM_INGOT.get())
					 .requires(RerMaterials.ALUMINUM_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_ALUMINUM))
					 .save(recipeOutput, "roprer:aluminum_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ALUMINUM_NUGGET.get(), 9)
					 .requires(RerMaterials.ALUMINUM_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_ALUMINUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ALUMINUM_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.ALUMINUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_ALUMINUM))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, ALUMINUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.ALUMINUM_INGOT.get(), 0.2f, 200, "aluminum");
		  oreBlasting(recipeOutput, ALUMINUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.ALUMINUM_INGOT.get(), 0.2f, 100, "aluminum");

		  List<ItemLike> AQUITE_SMELTABLES = List.of(
					 RerMaterials.AQUITE_CLUSTER_SHARD,
					 RerMaterialsBlocks.AQUITE_ORE,
					 RerMaterialsBlocks.NETHERRACK_AQUITE_ORE,
					 RerMaterialsBlocks.END_STONE_AQUITE_ORE,
					 RerMaterialsBlocks.DEEPSLATE_AQUITE_ORE,
					 RerMaterials.AQUITE_DUST);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.AQUITE_CLUSTER_SHARD.get(), 9)
					 .requires(RerMaterialsBlocks.AQUITE_CLUSTER_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.AQUITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.AQUITE_CLUSTER_BLOCK.get(), 1)
					 .requires(RerMaterials.AQUITE_CLUSTER_SHARD, 9)
					 .unlockedBy("has_raw", has(RerMaterials.AQUITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.AQUITE_BLOCK.get(), 1)
					 .requires(RerMaterials.AQUITE_GEM, 9)
					 .unlockedBy("has_raw", has(RerMaterials.AQUITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.AQUITE_GEM.get(), 9)
					 .requires(RerMaterialsBlocks.AQUITE_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.AQUITE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.AQUITE_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.AQUITE_BOLT.get())
					 .define('B', RerMaterials.AQUITE_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.AQUITE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.AQUITE_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.AQUITE_ROD.get())
					 .define('B', RerMaterials.AQUITE_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.AQUITE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.AQUITE_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.AQUITE_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.AQUITE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.AQUITE_DOUBLE_GEM.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.AQUITE_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.AQUITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.AQUITE_BOLT.get(), 2)
					 .requires(RerMaterials.AQUITE_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.AQUITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.AQUITE_TINY_DUST.get(), 9)
					 .requires(RerMaterials.AQUITE_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.AQUITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.AQUITE_DUST.get())
					 .requires(RerMaterials.AQUITE_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.AQUITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.AQUITE_LARGE_PLATE.get())
					 .requires(RerMaterials.AQUITE_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.AQUITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.AQUITE_CLUSTER.get())
					 .requires(RerMaterials.AQUITE_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.AQUITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.AQUITE_GEM.get(), 1)
					 .requires(RerMaterials.AQUITE_FRAGMENT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.AQUITE_GEM))
					 .save(recipeOutput, "roprer:aquite_gem_from_fragment");

		  oreSmelting(recipeOutput, AQUITE_SMELTABLES, RecipeCategory.MISC, RerMaterials.AQUITE_GEM.get(), 0.2f, 200, "aquite");
		  oreBlasting(recipeOutput, AQUITE_SMELTABLES, RecipeCategory.MISC, RerMaterials.AQUITE_GEM.get(), 0.2f, 100, "aquite");

		  List<ItemLike> BITUMEN_SMELTABLES = List.of(
					 RerMaterials.BITUMEN_CLUSTER_SHARD,
					 RerMaterialsBlocks.BITUMEN_ORE,
					 RerMaterialsBlocks.NETHERRACK_BITUMEN_ORE,
					 RerMaterialsBlocks.END_STONE_BITUMEN_ORE,
					 RerMaterialsBlocks.DEEPSLATE_BITUMEN_ORE,
					 RerMaterials.BITUMEN_DUST);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BITUMEN_CLUSTER_SHARD.get(), 9)
					 .requires(RerMaterialsBlocks.BITUMEN_CLUSTER_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.BITUMEN_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.BITUMEN_CLUSTER_BLOCK.get(), 1)
					 .requires(RerMaterials.BITUMEN_CLUSTER_SHARD, 9)
					 .unlockedBy("has_raw", has(RerMaterials.BITUMEN_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.BITUMEN_BLOCK.get(), 1)
					 .requires(RerMaterials.BITUMEN_GEM, 9)
					 .unlockedBy("has_raw", has(RerMaterials.BITUMEN_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BITUMEN_GEM.get(), 9)
					 .requires(RerMaterialsBlocks.BITUMEN_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.BITUMEN_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.BITUMEN_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.BITUMEN_BOLT.get())
					 .define('B', RerMaterials.BITUMEN_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.BITUMEN_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.BITUMEN_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.BITUMEN_ROD.get())
					 .define('B', RerMaterials.BITUMEN_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.BITUMEN_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.BITUMEN_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.BITUMEN_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.BITUMEN_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.BITUMEN_DOUBLE_GEM.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.BITUMEN_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.BITUMEN_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BITUMEN_BOLT.get(), 2)
					 .requires(RerMaterials.BITUMEN_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.BITUMEN_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BITUMEN_TINY_DUST.get(), 9)
					 .requires(RerMaterials.BITUMEN_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.BITUMEN_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BITUMEN_DUST.get())
					 .requires(RerMaterials.BITUMEN_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.BITUMEN_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BITUMEN_LARGE_PLATE.get())
					 .requires(RerMaterials.BITUMEN_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.BITUMEN_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BITUMEN_CLUSTER.get())
					 .requires(RerMaterials.BITUMEN_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.BITUMEN_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.BITUMEN_GEM.get(), 1)
					 .requires(RerMaterials.BITUMEN_FRAGMENT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.BITUMEN_GEM))
					 .save(recipeOutput, "roprer:bitumen_gem_from_fragment");

		  oreSmelting(recipeOutput, BITUMEN_SMELTABLES, RecipeCategory.MISC, RerMaterials.BITUMEN_GEM.get(), 0.2f, 200, "bitumenn");
		  oreBlasting(recipeOutput, BITUMEN_SMELTABLES, RecipeCategory.MISC, RerMaterials.BITUMEN_GEM.get(), 0.2f, 100, "bitumenn");

		  List<ItemLike> ARCANE_SMELTABLES = List.of(
					 RerMaterials.ARCANE_CLUSTER_SHARD,
					 RerMaterialsBlocks.ARCANE_ORE,
					 RerMaterialsBlocks.NETHERRACK_ARCANE_ORE,
					 RerMaterialsBlocks.END_STONE_ARCANE_ORE,
					 RerMaterialsBlocks.DEEPSLATE_ARCANE_ORE,
					 RerMaterials.ARCANE_DUST);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ARCANE_CLUSTER_SHARD.get(), 9)
					 .requires(RerMaterialsBlocks.ARCANE_CLUSTER_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.ARCANE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.ARCANE_CLUSTER_BLOCK.get(), 1)
					 .requires(RerMaterials.ARCANE_CLUSTER_SHARD, 9)
					 .unlockedBy("has_raw", has(RerMaterials.ARCANE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.ARCANE_BLOCK.get(), 1)
					 .requires(RerMaterials.ARCANE_GEM, 9)
					 .unlockedBy("has_raw", has(RerMaterials.ARCANE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ARCANE_GEM.get(), 9)
					 .requires(RerMaterialsBlocks.ARCANE_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.ARCANE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ARCANE_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.ARCANE_BOLT.get())
					 .define('B', RerMaterials.ARCANE_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.ARCANE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ARCANE_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.ARCANE_ROD.get())
					 .define('B', RerMaterials.ARCANE_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.ARCANE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ARCANE_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.ARCANE_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.ARCANE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ARCANE_DOUBLE_GEM.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.ARCANE_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.ARCANE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ARCANE_BOLT.get(), 2)
					 .requires(RerMaterials.ARCANE_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.ARCANE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ARCANE_TINY_DUST.get(), 9)
					 .requires(RerMaterials.ARCANE_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.ARCANE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ARCANE_DUST.get())
					 .requires(RerMaterials.ARCANE_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.ARCANE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ARCANE_LARGE_PLATE.get())
					 .requires(RerMaterials.ARCANE_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.ARCANE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ARCANE_CLUSTER.get())
					 .requires(RerMaterials.ARCANE_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.ARCANE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ARCANE_GEM.get(), 1)
					 .requires(RerMaterials.ARCANE_FRAGMENT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.ARCANE_GEM))
					 .save(recipeOutput, "roprer:arcane_gem_from_fragment");

		  oreSmelting(recipeOutput, ARCANE_SMELTABLES, RecipeCategory.MISC, RerMaterials.ARCANE_GEM.get(), 0.2f, 200, "arcane");
		  oreBlasting(recipeOutput, ARCANE_SMELTABLES, RecipeCategory.MISC, RerMaterials.ARCANE_GEM.get(), 0.2f, 100, "arcane");

		  List<ItemLike> ENDERIUM_SMELTABLES = List.of(
					 RerMaterials.ENDERIUM_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ENDERIUM_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.ENDERIUM_BOLT.get())
					 .define('B', RerMaterials.ENDERIUM_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.ENDERIUM_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ENDERIUM_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.ENDERIUM_ROD.get())
					 .define('B', RerMaterials.ENDERIUM_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.ENDERIUM_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ENDERIUM_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.ENDERIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.ENDERIUM_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ENDERIUM_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.ENDERIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.ENDERIUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ENDERIUM_BOLT.get(), 2)
					 .requires(RerMaterials.ENDERIUM_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.ENDERIUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ENDERIUM_TINY_DUST.get(), 9)
					 .requires(RerMaterials.ENDERIUM_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.ENDERIUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ENDERIUM_DUST.get())
					 .requires(RerMaterials.ENDERIUM_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.ENDERIUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ENDERIUM_LARGE_PLATE.get())
					 .requires(RerMaterials.ENDERIUM_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.ENDERIUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ENDERIUM_CLUSTER.get())
					 .requires(RerMaterials.ENDERIUM_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.ENDERIUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.ENDERIUM_BLOCK.get(), 1)
					 .requires(RerMaterials.ENDERIUM_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.ENDERIUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ENDERIUM_INGOT.get())
					 .requires(RerMaterials.ENDERIUM_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.ENDERIUM_INGOT))
					 .save(recipeOutput, "roprer:enderium_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ENDERIUM_NUGGET.get(), 9)
					 .requires(RerMaterials.ENDERIUM_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.ENDERIUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ENDERIUM_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.ENDERIUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.ENDERIUM_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, ENDERIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.ENDERIUM_INGOT.get(), 0.2f, 200, "enderium");
		  oreBlasting(recipeOutput, ENDERIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.ENDERIUM_INGOT.get(), 0.2f, 100, "enderium");

		  List<ItemLike> ELECTRUM_SMELTABLES = List.of(
					 RerMaterials.ELECTRUM_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ELECTRUM_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.ELECTRUM_BOLT.get())
					 .define('B', RerMaterials.ELECTRUM_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.ELECTRUM_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ELECTRUM_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.ELECTRUM_ROD.get())
					 .define('B', RerMaterials.ELECTRUM_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.ELECTRUM_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ELECTRUM_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.ELECTRUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.ELECTRUM_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ELECTRUM_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.ELECTRUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.ELECTRUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ELECTRUM_BOLT.get(), 2)
					 .requires(RerMaterials.ELECTRUM_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.ELECTRUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ELECTRUM_TINY_DUST.get(), 9)
					 .requires(RerMaterials.ELECTRUM_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.ELECTRUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ELECTRUM_DUST.get())
					 .requires(RerMaterials.ELECTRUM_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.ELECTRUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ELECTRUM_LARGE_PLATE.get())
					 .requires(RerMaterials.ELECTRUM_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.ELECTRUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ELECTRUM_CLUSTER.get())
					 .requires(RerMaterials.ELECTRUM_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.ELECTRUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.ELECTRUM_BLOCK.get(), 1)
					 .requires(RerMaterials.ELECTRUM_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.ELECTRUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ELECTRUM_INGOT.get())
					 .requires(RerMaterials.ELECTRUM_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.ELECTRUM_INGOT))
					 .save(recipeOutput, "roprer:electrum_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ELECTRUM_NUGGET.get(), 9)
					 .requires(RerMaterials.ELECTRUM_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.ELECTRUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ELECTRUM_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.ELECTRUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.ELECTRUM_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, ELECTRUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.ELECTRUM_INGOT.get(), 0.2f, 200, "electrum");
		  oreBlasting(recipeOutput, ELECTRUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.ELECTRUM_INGOT.get(), 0.2f, 100, "electrum");

		  List<ItemLike> LUMIUM_SMELTABLES = List.of(
					 RerMaterials.LUMIUM_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.LUMIUM_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.LUMIUM_BOLT.get())
					 .define('B', RerMaterials.LUMIUM_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.LUMIUM_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.LUMIUM_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.LUMIUM_ROD.get())
					 .define('B', RerMaterials.LUMIUM_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.LUMIUM_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.LUMIUM_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.LUMIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.LUMIUM_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.LUMIUM_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.LUMIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.LUMIUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.LUMIUM_BOLT.get(), 2)
					 .requires(RerMaterials.LUMIUM_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.LUMIUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.LUMIUM_TINY_DUST.get(), 9)
					 .requires(RerMaterials.LUMIUM_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.LUMIUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.LUMIUM_DUST.get())
					 .requires(RerMaterials.LUMIUM_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.LUMIUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.LUMIUM_LARGE_PLATE.get())
					 .requires(RerMaterials.LUMIUM_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.LUMIUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.LUMIUM_CLUSTER.get())
					 .requires(RerMaterials.LUMIUM_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.LUMIUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.LUMIUM_BLOCK.get(), 1)
					 .requires(RerMaterials.LUMIUM_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.LUMIUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.LUMIUM_INGOT.get())
					 .requires(RerMaterials.LUMIUM_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.LUMIUM_INGOT))
					 .save(recipeOutput, "roprer:lumium_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.LUMIUM_NUGGET.get(), 9)
					 .requires(RerMaterials.LUMIUM_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.LUMIUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.LUMIUM_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.LUMIUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.LUMIUM_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, LUMIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.LUMIUM_INGOT.get(), 0.2f, 200, "lumium");
		  oreBlasting(recipeOutput, LUMIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.LUMIUM_INGOT.get(), 0.2f, 100, "lumium");

		  List<ItemLike> FIERY_SMELTABLES = List.of(
					 RerMaterials.FIERY_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.FIERY_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.FIERY_BOLT.get())
					 .define('B', RerMaterials.FIERY_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.FIERY_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.FIERY_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.FIERY_ROD.get())
					 .define('B', RerMaterials.FIERY_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.FIERY_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.FIERY_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.FIERY_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.FIERY_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.FIERY_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.FIERY_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.FIERY_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FIERY_BOLT.get(), 2)
					 .requires(RerMaterials.FIERY_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.FIERY_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FIERY_TINY_DUST.get(), 9)
					 .requires(RerMaterials.FIERY_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.FIERY_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FIERY_DUST.get())
					 .requires(RerMaterials.FIERY_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.FIERY_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FIERY_LARGE_PLATE.get())
					 .requires(RerMaterials.FIERY_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.FIERY_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FIERY_CLUSTER.get())
					 .requires(RerMaterials.FIERY_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.FIERY_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.FIERY_BLOCK.get(), 1)
					 .requires(RerMaterials.FIERY_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.FIERY_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FIERY_INGOT.get())
					 .requires(RerMaterials.FIERY_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.FIERY_INGOT))
					 .save(recipeOutput, "roprer:fiery_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FIERY_NUGGET.get(), 9)
					 .requires(RerMaterials.FIERY_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.FIERY_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FIERY_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.FIERY_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.FIERY_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, FIERY_SMELTABLES, RecipeCategory.MISC, RerMaterials.FIERY_INGOT.get(), 0.2f, 200, "fiery");
		  oreBlasting(recipeOutput, FIERY_SMELTABLES, RecipeCategory.MISC, RerMaterials.FIERY_INGOT.get(), 0.2f, 100, "fiery");

		  //RECIPE_GEN
		  List<ItemLike> IRIDIUM_SMELTABLES = List.of(
					 RerMaterials.RAW_IRIDIUM,
					 RerMaterialsBlocks.IRIDIUM_ORE,
					 RerMaterialsBlocks.NETHERRACK_IRIDIUM_ORE,
					 RerMaterialsBlocks.END_STONE_IRIDIUM_ORE,
					 RerMaterialsBlocks.DEEPSLATE_IRIDIUM_ORE,
					 RerMaterials.IRIDIUM_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.IRIDIUM_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.IRIDIUM_BOLT.get())
					 .define('B', RerMaterials.IRIDIUM_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IRIDIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.IRIDIUM_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.IRIDIUM_ROD.get())
					 .define('B', RerMaterials.IRIDIUM_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IRIDIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.IRIDIUM_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.IRIDIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IRIDIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.IRIDIUM_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.IRIDIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IRIDIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IRIDIUM_BOLT.get(), 2)
					 .requires(RerMaterials.IRIDIUM_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IRIDIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IRIDIUM_TINY_DUST.get(), 9)
					 .requires(RerMaterials.IRIDIUM_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IRIDIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IRIDIUM_DUST.get())
					 .requires(RerMaterials.IRIDIUM_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IRIDIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IRIDIUM_LARGE_PLATE.get())
					 .requires(RerMaterials.IRIDIUM_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IRIDIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IRIDIUM_CLUSTER.get())
					 .requires(RerMaterials.IRIDIUM_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IRIDIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.RAW_IRIDIUM.get(), 9)
					 .requires(RerMaterialsBlocks.RAW_IRIDIUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IRIDIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.IRIDIUM_BLOCK.get(), 1)
					 .requires(RerMaterials.IRIDIUM_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IRIDIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.RAW_IRIDIUM_BLOCK.get(), 1)
					 .requires(RerMaterials.RAW_IRIDIUM, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IRIDIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IRIDIUM_INGOT.get())
					 .requires(RerMaterials.IRIDIUM_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IRIDIUM))
					 .save(recipeOutput, "roprer:iridium_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IRIDIUM_NUGGET.get(), 9)
					 .requires(RerMaterials.IRIDIUM_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IRIDIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IRIDIUM_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.IRIDIUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IRIDIUM))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, IRIDIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.IRIDIUM_INGOT.get(), 0.2f, 200, "iridium");
		  oreBlasting(recipeOutput, IRIDIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.IRIDIUM_INGOT.get(), 0.2f, 100, "iridium");

		  List<ItemLike> LEAD_SMELTABLES = List.of(
					 RerMaterials.RAW_LEAD,
					 RerMaterialsBlocks.LEAD_ORE,
					 RerMaterialsBlocks.NETHERRACK_LEAD_ORE,
					 RerMaterialsBlocks.END_STONE_LEAD_ORE,
					 RerMaterialsBlocks.DEEPSLATE_LEAD_ORE,
					 RerMaterials.LEAD_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.LEAD_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.LEAD_BOLT.get())
					 .define('B', RerMaterials.LEAD_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_LEAD))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.LEAD_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.LEAD_ROD.get())
					 .define('B', RerMaterials.LEAD_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_LEAD))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.LEAD_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.LEAD_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_LEAD))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.LEAD_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.LEAD_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_LEAD))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.LEAD_BOLT.get(), 2)
					 .requires(RerMaterials.LEAD_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_LEAD))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.LEAD_TINY_DUST.get(), 9)
					 .requires(RerMaterials.LEAD_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_LEAD))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.LEAD_DUST.get())
					 .requires(RerMaterials.LEAD_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_LEAD))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.LEAD_LARGE_PLATE.get())
					 .requires(RerMaterials.LEAD_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_LEAD))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.LEAD_CLUSTER.get())
					 .requires(RerMaterials.LEAD_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_LEAD))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.RAW_LEAD.get(), 9)
					 .requires(RerMaterialsBlocks.RAW_LEAD_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_LEAD))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.LEAD_BLOCK.get(), 1)
					 .requires(RerMaterials.LEAD_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_LEAD))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.RAW_LEAD_BLOCK.get(), 1)
					 .requires(RerMaterials.RAW_LEAD, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_LEAD))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.LEAD_INGOT.get())
					 .requires(RerMaterials.LEAD_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_LEAD))
					 .save(recipeOutput, "roprer:lead_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.LEAD_NUGGET.get(), 9)
					 .requires(RerMaterials.LEAD_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_LEAD))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.LEAD_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.LEAD_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_LEAD))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, LEAD_SMELTABLES, RecipeCategory.MISC, RerMaterials.LEAD_INGOT.get(), 0.2f, 200, "lead");
		  oreBlasting(recipeOutput, LEAD_SMELTABLES, RecipeCategory.MISC, RerMaterials.LEAD_INGOT.get(), 0.2f, 100, "lead");

		  List<ItemLike> NICKEL_SMELTABLES = List.of(
					 RerMaterials.RAW_NICKEL,
					 RerMaterialsBlocks.NICKEL_ORE,
					 RerMaterialsBlocks.NETHERRACK_NICKEL_ORE,
					 RerMaterialsBlocks.END_STONE_NICKEL_ORE,
					 RerMaterialsBlocks.DEEPSLATE_NICKEL_ORE,
					 RerMaterials.NICKEL_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.NICKEL_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.NICKEL_BOLT.get())
					 .define('B', RerMaterials.NICKEL_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NICKEL))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.NICKEL_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.NICKEL_ROD.get())
					 .define('B', RerMaterials.NICKEL_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NICKEL))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.NICKEL_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.NICKEL_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NICKEL))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.NICKEL_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.NICKEL_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NICKEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.NICKEL_BOLT.get(), 2)
					 .requires(RerMaterials.NICKEL_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NICKEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.NICKEL_TINY_DUST.get(), 9)
					 .requires(RerMaterials.NICKEL_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NICKEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.NICKEL_DUST.get())
					 .requires(RerMaterials.NICKEL_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NICKEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.NICKEL_LARGE_PLATE.get())
					 .requires(RerMaterials.NICKEL_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NICKEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.NICKEL_CLUSTER.get())
					 .requires(RerMaterials.NICKEL_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NICKEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.RAW_NICKEL.get(), 9)
					 .requires(RerMaterialsBlocks.RAW_NICKEL_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NICKEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.NICKEL_BLOCK.get(), 1)
					 .requires(RerMaterials.NICKEL_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NICKEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.RAW_NICKEL_BLOCK.get(), 1)
					 .requires(RerMaterials.RAW_NICKEL, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NICKEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.NICKEL_INGOT.get())
					 .requires(RerMaterials.NICKEL_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NICKEL))
					 .save(recipeOutput, "roprer:nickel_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.NICKEL_NUGGET.get(), 9)
					 .requires(RerMaterials.NICKEL_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NICKEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.NICKEL_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.NICKEL_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NICKEL))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, NICKEL_SMELTABLES, RecipeCategory.MISC, RerMaterials.NICKEL_INGOT.get(), 0.2f, 200, "nickel");
		  oreBlasting(recipeOutput, NICKEL_SMELTABLES, RecipeCategory.MISC, RerMaterials.NICKEL_INGOT.get(), 0.2f, 100, "nickel");

		  List<ItemLike> OSMIUM_SMELTABLES = List.of(
					 RerMaterials.RAW_OSMIUM,
					 RerMaterialsBlocks.OSMIUM_ORE,
					 RerMaterialsBlocks.NETHERRACK_OSMIUM_ORE,
					 RerMaterialsBlocks.END_STONE_OSMIUM_ORE,
					 RerMaterialsBlocks.DEEPSLATE_OSMIUM_ORE,
					 RerMaterials.OSMIUM_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.OSMIUM_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.OSMIUM_BOLT.get())
					 .define('B', RerMaterials.OSMIUM_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_OSMIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.OSMIUM_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.OSMIUM_ROD.get())
					 .define('B', RerMaterials.OSMIUM_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_OSMIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.OSMIUM_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.OSMIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_OSMIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.OSMIUM_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.OSMIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_OSMIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.OSMIUM_BOLT.get(), 2)
					 .requires(RerMaterials.OSMIUM_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_OSMIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.OSMIUM_TINY_DUST.get(), 9)
					 .requires(RerMaterials.OSMIUM_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_OSMIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.OSMIUM_DUST.get())
					 .requires(RerMaterials.OSMIUM_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_OSMIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.OSMIUM_LARGE_PLATE.get())
					 .requires(RerMaterials.OSMIUM_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_OSMIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.OSMIUM_CLUSTER.get())
					 .requires(RerMaterials.OSMIUM_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_OSMIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.RAW_OSMIUM.get(), 9)
					 .requires(RerMaterialsBlocks.RAW_OSMIUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_OSMIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.OSMIUM_BLOCK.get(), 1)
					 .requires(RerMaterials.OSMIUM_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_OSMIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.RAW_OSMIUM_BLOCK.get(), 1)
					 .requires(RerMaterials.RAW_OSMIUM, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_OSMIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.OSMIUM_INGOT.get())
					 .requires(RerMaterials.OSMIUM_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_OSMIUM))
					 .save(recipeOutput, "roprer:osmium_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.OSMIUM_NUGGET.get(), 9)
					 .requires(RerMaterials.OSMIUM_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_OSMIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.OSMIUM_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.OSMIUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_OSMIUM))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, OSMIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.OSMIUM_INGOT.get(), 0.2f, 200, "osmium");
		  oreBlasting(recipeOutput, OSMIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.OSMIUM_INGOT.get(), 0.2f, 100, "osmium");

		  List<ItemLike> CARMINITE_SMELTABLES = List.of(
					 RerMaterials.CARMINITE_CLUSTER_SHARD,
					 RerMaterialsBlocks.CARMINITE_ORE,
					 RerMaterialsBlocks.NETHERRACK_CARMINITE_ORE,
					 RerMaterialsBlocks.END_STONE_CARMINITE_ORE,
					 RerMaterialsBlocks.DEEPSLATE_CARMINITE_ORE,
					 RerMaterials.CARMINITE_DUST);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CARMINITE_CLUSTER_SHARD.get(), 9)
					 .requires(RerMaterialsBlocks.CARMINITE_CLUSTER_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.CARMINITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.CARMINITE_CLUSTER_BLOCK.get(), 1)
					 .requires(RerMaterials.CARMINITE_CLUSTER_SHARD, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CARMINITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.CARMINITE_BLOCK.get(), 1)
					 .requires(RerMaterials.CARMINITE_GEM, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CARMINITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CARMINITE_GEM.get(), 9)
					 .requires(RerMaterialsBlocks.CARMINITE_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.CARMINITE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CARMINITE_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.CARMINITE_BOLT.get())
					 .define('B', RerMaterials.CARMINITE_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.CARMINITE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CARMINITE_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.CARMINITE_ROD.get())
					 .define('B', RerMaterials.CARMINITE_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.CARMINITE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CARMINITE_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.CARMINITE_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.CARMINITE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CARMINITE_DOUBLE_GEM.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.CARMINITE_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.CARMINITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CARMINITE_BOLT.get(), 2)
					 .requires(RerMaterials.CARMINITE_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.CARMINITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CARMINITE_TINY_DUST.get(), 9)
					 .requires(RerMaterials.CARMINITE_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.CARMINITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CARMINITE_DUST.get())
					 .requires(RerMaterials.CARMINITE_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CARMINITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CARMINITE_LARGE_PLATE.get())
					 .requires(RerMaterials.CARMINITE_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.CARMINITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CARMINITE_CLUSTER.get())
					 .requires(RerMaterials.CARMINITE_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.CARMINITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CARMINITE_GEM.get(), 1)
					 .requires(RerMaterials.CARMINITE_FRAGMENT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CARMINITE_GEM))
					 .save(recipeOutput, "roprer:carminite_gem_from_fragment");

		  oreSmelting(recipeOutput, CARMINITE_SMELTABLES, RecipeCategory.MISC, RerMaterials.CARMINITE_GEM.get(), 0.2f, 200, "carminite");

		  oreBlasting(recipeOutput, CARMINITE_SMELTABLES, RecipeCategory.MISC, RerMaterials.CARMINITE_GEM.get(), 0.2f, 100, "carminite");

		  List<ItemLike> CERTUS_QUARTZ_SMELTABLES = List.of(
					 RerMaterials.CERTUS_QUARTZ_CLUSTER_SHARD,
					 RerMaterialsBlocks.CERTUS_QUARTZ_ORE,
					 RerMaterialsBlocks.NETHERRACK_CERTUS_QUARTZ_ORE,
					 RerMaterialsBlocks.END_STONE_CERTUS_QUARTZ_ORE,
					 RerMaterialsBlocks.DEEPSLATE_CERTUS_QUARTZ_ORE,
					 RerMaterials.CERTUS_QUARTZ_DUST);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CERTUS_QUARTZ_CLUSTER_SHARD.get(), 9)
					 .requires(RerMaterialsBlocks.CERTUS_QUARTZ_CLUSTER_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.CERTUS_QUARTZ_CLUSTER_BLOCK.get(), 1)
					 .requires(RerMaterials.CERTUS_QUARTZ_CLUSTER_SHARD, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.CERTUS_QUARTZ_BLOCK.get(), 1)
					 .requires(RerMaterials.CERTUS_QUARTZ_GEM, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CERTUS_QUARTZ_GEM.get(), 9)
					 .requires(RerMaterialsBlocks.CERTUS_QUARTZ_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CERTUS_QUARTZ_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.CERTUS_QUARTZ_BOLT.get())
					 .define('B', RerMaterials.CERTUS_QUARTZ_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CERTUS_QUARTZ_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.CERTUS_QUARTZ_ROD.get())
					 .define('B', RerMaterials.CERTUS_QUARTZ_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CERTUS_QUARTZ_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.CERTUS_QUARTZ_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CERTUS_QUARTZ_DOUBLE_GEM.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.CERTUS_QUARTZ_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CERTUS_QUARTZ_BOLT.get(), 2)
					 .requires(RerMaterials.CERTUS_QUARTZ_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CERTUS_QUARTZ_TINY_DUST.get(), 9)
					 .requires(RerMaterials.CERTUS_QUARTZ_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CERTUS_QUARTZ_DUST.get())
					 .requires(RerMaterials.CERTUS_QUARTZ_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CERTUS_QUARTZ_LARGE_PLATE.get())
					 .requires(RerMaterials.CERTUS_QUARTZ_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CERTUS_QUARTZ_CLUSTER.get())
					 .requires(RerMaterials.CERTUS_QUARTZ_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CERTUS_QUARTZ_GEM.get(), 1)
					 .requires(RerMaterials.CERTUS_QUARTZ_FRAGMENT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CERTUS_QUARTZ_GEM))
					 .save(recipeOutput, "roprer:certus_quartz_gem_from_fragment");

		  oreSmelting(recipeOutput, CERTUS_QUARTZ_SMELTABLES, RecipeCategory.MISC, RerMaterials.CERTUS_QUARTZ_GEM.get(), 0.2f,
					 200, "certus_quartz");

		  oreBlasting(recipeOutput, CERTUS_QUARTZ_SMELTABLES, RecipeCategory.MISC, RerMaterials.CERTUS_QUARTZ_GEM.get(), 0.2f,
					 100, "certus_quartz");

		  List<ItemLike> CHARGED_CERTUS_QUARTZ_SMELTABLES = List.of(
					 RerMaterials.CHARGED_CERTUS_QUARTZ_CLUSTER_SHARD,
					 RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_ORE,
					 RerMaterialsBlocks.NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE,
					 RerMaterialsBlocks.END_STONE_CHARGED_CERTUS_QUARTZ_ORE,
					 RerMaterialsBlocks.DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE,
					 RerMaterials.CHARGED_CERTUS_QUARTZ_DUST);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CHARGED_CERTUS_QUARTZ_CLUSTER_SHARD.get(), 9)
					 .requires(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_CLUSTER_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_CLUSTER_BLOCK.get(), 1)
					 .requires(RerMaterials.CHARGED_CERTUS_QUARTZ_CLUSTER_SHARD, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_BLOCK.get(), 1)
					 .requires(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CHARGED_CERTUS_QUARTZ_GEM.get(), 9)
					 .requires(RerMaterialsBlocks.CHARGED_CERTUS_QUARTZ_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CHARGED_CERTUS_QUARTZ_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.CHARGED_CERTUS_QUARTZ_BOLT.get())
					 .define('B', RerMaterials.CHARGED_CERTUS_QUARTZ_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CHARGED_CERTUS_QUARTZ_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.CHARGED_CERTUS_QUARTZ_ROD.get())
					 .define('B', RerMaterials.CHARGED_CERTUS_QUARTZ_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CHARGED_CERTUS_QUARTZ_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.CHARGED_CERTUS_QUARTZ_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CHARGED_CERTUS_QUARTZ_DOUBLE_GEM.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.CHARGED_CERTUS_QUARTZ_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CHARGED_CERTUS_QUARTZ_BOLT.get(), 2)
					 .requires(RerMaterials.CHARGED_CERTUS_QUARTZ_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CHARGED_CERTUS_QUARTZ_TINY_DUST.get(), 9)
					 .requires(RerMaterials.CHARGED_CERTUS_QUARTZ_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CHARGED_CERTUS_QUARTZ_DUST.get())
					 .requires(RerMaterials.CHARGED_CERTUS_QUARTZ_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CHARGED_CERTUS_QUARTZ_LARGE_PLATE.get())
					 .requires(RerMaterials.CHARGED_CERTUS_QUARTZ_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CHARGED_CERTUS_QUARTZ_CLUSTER.get())
					 .requires(RerMaterials.CHARGED_CERTUS_QUARTZ_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CHARGED_CERTUS_QUARTZ_GEM.get(), 1)
					 .requires(RerMaterials.CHARGED_CERTUS_QUARTZ_FRAGMENT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CHARGED_CERTUS_QUARTZ_GEM))
					 .save(recipeOutput, "roprer:charged_certus_quartz_gem_from_fragment");

		  oreSmelting(recipeOutput, CHARGED_CERTUS_QUARTZ_SMELTABLES, RecipeCategory.MISC, RerMaterials.CHARGED_CERTUS_QUARTZ_GEM.get(), 0.2f, 200, "charged_certus_quartz");

		  oreBlasting(recipeOutput, CHARGED_CERTUS_QUARTZ_SMELTABLES, RecipeCategory.MISC, RerMaterials.CHARGED_CERTUS_QUARTZ_GEM.get(), 0.2f, 100, "charged_certus_quartz");

		  List<ItemLike> CHAROITE_SMELTABLES = List.of(
					 RerMaterials.CHAROITE_CLUSTER_SHARD,
					 RerMaterialsBlocks.CHAROITE_ORE,
					 RerMaterialsBlocks.NETHERRACK_CHAROITE_ORE,
					 RerMaterialsBlocks.END_STONE_CHAROITE_ORE,
					 RerMaterialsBlocks.DEEPSLATE_CHAROITE_ORE,
					 RerMaterials.CHAROITE_DUST);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CHAROITE_CLUSTER_SHARD.get(), 9)
					 .requires(RerMaterialsBlocks.CHAROITE_CLUSTER_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.CHAROITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.CHAROITE_CLUSTER_BLOCK.get(), 1)
					 .requires(RerMaterials.CHAROITE_CLUSTER_SHARD, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CHAROITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.CHAROITE_BLOCK.get(), 1)
					 .requires(RerMaterials.CHAROITE_GEM, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CHAROITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CHAROITE_GEM.get(), 9)
					 .requires(RerMaterialsBlocks.CHAROITE_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.CHAROITE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CHAROITE_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.CHAROITE_BOLT.get())
					 .define('B', RerMaterials.CHAROITE_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.CHAROITE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CHAROITE_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.CHAROITE_ROD.get())
					 .define('B', RerMaterials.CHAROITE_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.CHAROITE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CHAROITE_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.CHAROITE_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.CHAROITE_GEM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CHAROITE_DOUBLE_GEM.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.CHAROITE_GEM.get())
					 .unlockedBy("has_raw", has(RerMaterials.CHAROITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CHAROITE_BOLT.get(), 2)
					 .requires(RerMaterials.CHAROITE_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.CHAROITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CHAROITE_TINY_DUST.get(), 9)
					 .requires(RerMaterials.CHAROITE_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.CHAROITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CHAROITE_DUST.get())
					 .requires(RerMaterials.CHAROITE_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CHAROITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CHAROITE_LARGE_PLATE.get())
					 .requires(RerMaterials.CHAROITE_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.CHAROITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CHAROITE_CLUSTER.get())
					 .requires(RerMaterials.CHAROITE_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.CHAROITE_GEM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CHAROITE_GEM.get(), 1)
					 .requires(RerMaterials.CHAROITE_FRAGMENT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CHAROITE_GEM))
					 .save(recipeOutput, "roprer:charoite_gem_from_fragment");

		  oreSmelting(recipeOutput, CHAROITE_SMELTABLES, RecipeCategory.MISC, RerMaterials.CHAROITE_GEM.get(), 0.2f, 200, "charoite");

		  oreBlasting(recipeOutput, CHAROITE_SMELTABLES, RecipeCategory.MISC, RerMaterials.CHAROITE_GEM.get(), 0.2f, 100, "charoite");

		  List<ItemLike> SIGNALUM_SMELTABLES = List.of(
					 RerMaterials.SIGNALUM_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.SIGNALUM_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.SIGNALUM_BOLT.get())
					 .define('B', RerMaterials.SIGNALUM_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.SIGNALUM_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.SIGNALUM_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.SIGNALUM_ROD.get())
					 .define('B', RerMaterials.SIGNALUM_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.SIGNALUM_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.SIGNALUM_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.SIGNALUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.SIGNALUM_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.SIGNALUM_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.SIGNALUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.SIGNALUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SIGNALUM_BOLT.get(), 2)
					 .requires(RerMaterials.SIGNALUM_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.SIGNALUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SIGNALUM_TINY_DUST.get(), 9)
					 .requires(RerMaterials.SIGNALUM_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.SIGNALUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SIGNALUM_DUST.get())
					 .requires(RerMaterials.SIGNALUM_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.SIGNALUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SIGNALUM_LARGE_PLATE.get())
					 .requires(RerMaterials.SIGNALUM_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.SIGNALUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SIGNALUM_CLUSTER.get())
					 .requires(RerMaterials.SIGNALUM_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.SIGNALUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.SIGNALUM_BLOCK.get(), 1)
					 .requires(RerMaterials.SIGNALUM_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.SIGNALUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SIGNALUM_INGOT.get())
					 .requires(RerMaterials.SIGNALUM_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.SIGNALUM_INGOT))
					 .save(recipeOutput, "roprer:signalum_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SIGNALUM_NUGGET.get(), 9)
					 .requires(RerMaterials.SIGNALUM_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.SIGNALUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SIGNALUM_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.SIGNALUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.SIGNALUM_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, SIGNALUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.SIGNALUM_INGOT.get(), 0.2f, 200, "signalum");
		  oreBlasting(recipeOutput, SIGNALUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.SIGNALUM_INGOT.get(), 0.2f, 100, "signalum");

		  List<ItemLike> INVAR_SMELTABLES = List.of(
					 RerMaterials.INVAR_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.INVAR_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.INVAR_BOLT.get())
					 .define('B', RerMaterials.INVAR_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.INVAR_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.INVAR_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.INVAR_ROD.get())
					 .define('B', RerMaterials.INVAR_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.INVAR_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.INVAR_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.INVAR_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.INVAR_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.INVAR_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.INVAR_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.INVAR_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.INVAR_BOLT.get(), 2)
					 .requires(RerMaterials.INVAR_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.INVAR_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.INVAR_TINY_DUST.get(), 9)
					 .requires(RerMaterials.INVAR_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.INVAR_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.INVAR_DUST.get())
					 .requires(RerMaterials.INVAR_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.INVAR_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.INVAR_LARGE_PLATE.get())
					 .requires(RerMaterials.INVAR_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.INVAR_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.INVAR_CLUSTER.get())
					 .requires(RerMaterials.INVAR_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.INVAR_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.INVAR_BLOCK.get(), 1)
					 .requires(RerMaterials.INVAR_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.INVAR_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.INVAR_INGOT.get())
					 .requires(RerMaterials.INVAR_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.INVAR_INGOT))
					 .save(recipeOutput, "roprer:invar_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.INVAR_NUGGET.get(), 9)
					 .requires(RerMaterials.INVAR_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.INVAR_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.INVAR_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.INVAR_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.INVAR_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, INVAR_SMELTABLES, RecipeCategory.MISC, RerMaterials.INVAR_INGOT.get(), 0.2f, 200, "invar");        oreBlasting(recipeOutput, INVAR_SMELTABLES, RecipeCategory.MISC, RerMaterials.INVAR_INGOT.get(), 0.2f, 100, "invar");
		  List<ItemLike> GRAPHITE_SMELTABLES = List.of(
					 RerMaterials.GRAPHITE_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.GRAPHITE_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.GRAPHITE_BOLT.get())
					 .define('B', RerMaterials.GRAPHITE_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.GRAPHITE_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.GRAPHITE_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.GRAPHITE_ROD.get())
					 .define('B', RerMaterials.GRAPHITE_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.GRAPHITE_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.GRAPHITE_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.GRAPHITE_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.GRAPHITE_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.GRAPHITE_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.GRAPHITE_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.GRAPHITE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.GRAPHITE_BOLT.get(), 2)
					 .requires(RerMaterials.GRAPHITE_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.GRAPHITE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.GRAPHITE_TINY_DUST.get(), 9)
					 .requires(RerMaterials.GRAPHITE_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.GRAPHITE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.GRAPHITE_DUST.get())
					 .requires(RerMaterials.GRAPHITE_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.GRAPHITE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.GRAPHITE_LARGE_PLATE.get())
					 .requires(RerMaterials.GRAPHITE_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.GRAPHITE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.GRAPHITE_CLUSTER.get())
					 .requires(RerMaterials.GRAPHITE_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.GRAPHITE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.GRAPHITE_BLOCK.get(), 1)
					 .requires(RerMaterials.GRAPHITE_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.GRAPHITE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.GRAPHITE_INGOT.get())
					 .requires(RerMaterials.GRAPHITE_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.GRAPHITE_INGOT))
					 .save(recipeOutput, "roprer:graphite_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.GRAPHITE_NUGGET.get(), 9)
					 .requires(RerMaterials.GRAPHITE_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.GRAPHITE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.GRAPHITE_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.GRAPHITE_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.GRAPHITE_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, GRAPHITE_SMELTABLES, RecipeCategory.MISC, RerMaterials.GRAPHITE_INGOT.get(), 0.2f, 200, "graphite");
		  oreBlasting(recipeOutput, GRAPHITE_SMELTABLES, RecipeCategory.MISC, RerMaterials.GRAPHITE_INGOT.get(), 0.2f, 100, "graphite");

		  List<ItemLike> CONSTANTAN_SMELTABLES = List.of(
					 RerMaterials.CONSTANTAN_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CONSTANTAN_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.CONSTANTAN_BOLT.get())
					 .define('B', RerMaterials.CONSTANTAN_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.CONSTANTAN_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CONSTANTAN_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.CONSTANTAN_ROD.get())
					 .define('B', RerMaterials.CONSTANTAN_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.CONSTANTAN_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CONSTANTAN_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.CONSTANTAN_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.CONSTANTAN_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.CONSTANTAN_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.CONSTANTAN_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.CONSTANTAN_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CONSTANTAN_BOLT.get(), 2)
					 .requires(RerMaterials.CONSTANTAN_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.CONSTANTAN_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CONSTANTAN_TINY_DUST.get(), 9)
					 .requires(RerMaterials.CONSTANTAN_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.CONSTANTAN_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CONSTANTAN_DUST.get())
					 .requires(RerMaterials.CONSTANTAN_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CONSTANTAN_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CONSTANTAN_LARGE_PLATE.get())
					 .requires(RerMaterials.CONSTANTAN_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.CONSTANTAN_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CONSTANTAN_CLUSTER.get())
					 .requires(RerMaterials.CONSTANTAN_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.CONSTANTAN_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.CONSTANTAN_BLOCK.get(), 1)
					 .requires(RerMaterials.CONSTANTAN_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CONSTANTAN_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CONSTANTAN_INGOT.get())
					 .requires(RerMaterials.CONSTANTAN_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.CONSTANTAN_INGOT))
					 .save(recipeOutput, "roprer:constantan_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CONSTANTAN_NUGGET.get(), 9)
					 .requires(RerMaterials.CONSTANTAN_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.CONSTANTAN_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.CONSTANTAN_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.CONSTANTAN_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.CONSTANTAN_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, CONSTANTAN_SMELTABLES, RecipeCategory.MISC, RerMaterials.CONSTANTAN_INGOT.get(), 0.2f, 200, "constantan");
		  oreBlasting(recipeOutput, CONSTANTAN_SMELTABLES, RecipeCategory.MISC, RerMaterials.CONSTANTAN_INGOT.get(), 0.2f, 100, "constantan");

		  List<ItemLike> REFINED_OBSIDIAN_SMELTABLES = List.of(
					 RerMaterials.REFINED_OBSIDIAN_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.REFINED_OBSIDIAN_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.REFINED_OBSIDIAN_BOLT.get())
					 .define('B', RerMaterials.REFINED_OBSIDIAN_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_OBSIDIAN_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.REFINED_OBSIDIAN_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.REFINED_OBSIDIAN_ROD.get())
					 .define('B', RerMaterials.REFINED_OBSIDIAN_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_OBSIDIAN_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.REFINED_OBSIDIAN_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.REFINED_OBSIDIAN_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_OBSIDIAN_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.REFINED_OBSIDIAN_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.REFINED_OBSIDIAN_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_OBSIDIAN_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REFINED_OBSIDIAN_BOLT.get(), 2)
					 .requires(RerMaterials.REFINED_OBSIDIAN_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_OBSIDIAN_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REFINED_OBSIDIAN_TINY_DUST.get(), 9)
					 .requires(RerMaterials.REFINED_OBSIDIAN_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_OBSIDIAN_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REFINED_OBSIDIAN_DUST.get())
					 .requires(RerMaterials.REFINED_OBSIDIAN_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_OBSIDIAN_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REFINED_OBSIDIAN_LARGE_PLATE.get())
					 .requires(RerMaterials.REFINED_OBSIDIAN_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_OBSIDIAN_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REFINED_OBSIDIAN_CLUSTER.get())
					 .requires(RerMaterials.REFINED_OBSIDIAN_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_OBSIDIAN_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.REFINED_OBSIDIAN_BLOCK.get(), 1)
					 .requires(RerMaterials.REFINED_OBSIDIAN_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_OBSIDIAN_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REFINED_OBSIDIAN_INGOT.get())
					 .requires(RerMaterials.REFINED_OBSIDIAN_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_OBSIDIAN_INGOT))
					 .save(recipeOutput, "roprer:refined_obsidian_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REFINED_OBSIDIAN_NUGGET.get(), 9)
					 .requires(RerMaterials.REFINED_OBSIDIAN_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_OBSIDIAN_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REFINED_OBSIDIAN_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.REFINED_OBSIDIAN_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_OBSIDIAN_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, REFINED_OBSIDIAN_SMELTABLES, RecipeCategory.MISC, RerMaterials.REFINED_OBSIDIAN_INGOT.get(), 0.2f, 200, "refined_obsidian");
		  oreBlasting(recipeOutput, REFINED_OBSIDIAN_SMELTABLES, RecipeCategory.MISC, RerMaterials.REFINED_OBSIDIAN_INGOT.get(), 0.2f, 100, "refined_obsidian");

		  List<ItemLike> REFINED_GLOWSTONE_SMELTABLES = List.of(
					 RerMaterials.REFINED_GLOWSTONE_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.REFINED_GLOWSTONE_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.REFINED_GLOWSTONE_BOLT.get())
					 .define('B', RerMaterials.REFINED_GLOWSTONE_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_GLOWSTONE_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.REFINED_GLOWSTONE_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.REFINED_GLOWSTONE_ROD.get())
					 .define('B', RerMaterials.REFINED_GLOWSTONE_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_GLOWSTONE_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.REFINED_GLOWSTONE_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.REFINED_GLOWSTONE_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_GLOWSTONE_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.REFINED_GLOWSTONE_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.REFINED_GLOWSTONE_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_GLOWSTONE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REFINED_GLOWSTONE_BOLT.get(), 2)
					 .requires(RerMaterials.REFINED_GLOWSTONE_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_GLOWSTONE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REFINED_GLOWSTONE_TINY_DUST.get(), 9)
					 .requires(RerMaterials.REFINED_GLOWSTONE_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_GLOWSTONE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REFINED_GLOWSTONE_DUST.get())
					 .requires(RerMaterials.REFINED_GLOWSTONE_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_GLOWSTONE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REFINED_GLOWSTONE_LARGE_PLATE.get())
					 .requires(RerMaterials.REFINED_GLOWSTONE_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_GLOWSTONE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REFINED_GLOWSTONE_CLUSTER.get())
					 .requires(RerMaterials.REFINED_GLOWSTONE_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_GLOWSTONE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.REFINED_GLOWSTONE_BLOCK.get(), 1)
					 .requires(RerMaterials.REFINED_GLOWSTONE_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_GLOWSTONE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REFINED_GLOWSTONE_INGOT.get())
					 .requires(RerMaterials.REFINED_GLOWSTONE_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_GLOWSTONE_INGOT))
					 .save(recipeOutput, "roprer:refined_glowstone_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REFINED_GLOWSTONE_NUGGET.get(), 9)
					 .requires(RerMaterials.REFINED_GLOWSTONE_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_GLOWSTONE_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REFINED_GLOWSTONE_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.REFINED_GLOWSTONE_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.REFINED_GLOWSTONE_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, REFINED_GLOWSTONE_SMELTABLES, RecipeCategory.MISC, RerMaterials.REFINED_GLOWSTONE_INGOT.get(), 0.2f, 200, "refined_glowstone");
		  oreBlasting(recipeOutput, REFINED_GLOWSTONE_SMELTABLES, RecipeCategory.MISC, RerMaterials.REFINED_GLOWSTONE_INGOT.get(), 0.2f, 100, "refined_glowstone");

		  List<ItemLike> ORICHALCUM_SMELTABLES = List.of(
					 RerMaterials.ORICHALCUM_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ORICHALCUM_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.ORICHALCUM_BOLT.get())
					 .define('B', RerMaterials.ORICHALCUM_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.ORICHALCUM_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ORICHALCUM_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.ORICHALCUM_ROD.get())
					 .define('B', RerMaterials.ORICHALCUM_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.ORICHALCUM_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ORICHALCUM_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.ORICHALCUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.ORICHALCUM_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ORICHALCUM_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.ORICHALCUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.ORICHALCUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ORICHALCUM_BOLT.get(), 2)
					 .requires(RerMaterials.ORICHALCUM_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.ORICHALCUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ORICHALCUM_TINY_DUST.get(), 9)
					 .requires(RerMaterials.ORICHALCUM_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.ORICHALCUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ORICHALCUM_DUST.get())
					 .requires(RerMaterials.ORICHALCUM_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.ORICHALCUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ORICHALCUM_LARGE_PLATE.get())
					 .requires(RerMaterials.ORICHALCUM_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.ORICHALCUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ORICHALCUM_CLUSTER.get())
					 .requires(RerMaterials.ORICHALCUM_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.ORICHALCUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.ORICHALCUM_BLOCK.get(), 1)
					 .requires(RerMaterials.ORICHALCUM_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.ORICHALCUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ORICHALCUM_INGOT.get())
					 .requires(RerMaterials.ORICHALCUM_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.ORICHALCUM_INGOT))
					 .save(recipeOutput, "roprer:orichalcum_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ORICHALCUM_NUGGET.get(), 9)
					 .requires(RerMaterials.ORICHALCUM_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.ORICHALCUM_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ORICHALCUM_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.ORICHALCUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.ORICHALCUM_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, ORICHALCUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.ORICHALCUM_INGOT.get(), 0.2f, 200, "orichalcum");
		  oreBlasting(recipeOutput, ORICHALCUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.ORICHALCUM_INGOT.get(), 0.2f, 100, "orichalcum");

		  List<ItemLike> ROSE_GOLD_SMELTABLES = List.of(
					 RerMaterials.ROSE_GOLD_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ROSE_GOLD_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.ROSE_GOLD_BOLT.get())
					 .define('B', RerMaterials.ROSE_GOLD_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.ROSE_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ROSE_GOLD_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.ROSE_GOLD_ROD.get())
					 .define('B', RerMaterials.ROSE_GOLD_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.ROSE_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ROSE_GOLD_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.ROSE_GOLD_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.ROSE_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.ROSE_GOLD_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.ROSE_GOLD_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.ROSE_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ROSE_GOLD_BOLT.get(), 2)
					 .requires(RerMaterials.ROSE_GOLD_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.ROSE_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ROSE_GOLD_TINY_DUST.get(), 9)
					 .requires(RerMaterials.ROSE_GOLD_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.ROSE_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ROSE_GOLD_DUST.get())
					 .requires(RerMaterials.ROSE_GOLD_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.ROSE_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ROSE_GOLD_LARGE_PLATE.get())
					 .requires(RerMaterials.ROSE_GOLD_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.ROSE_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ROSE_GOLD_CLUSTER.get())
					 .requires(RerMaterials.ROSE_GOLD_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.ROSE_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.ROSE_GOLD_BLOCK.get(), 1)
					 .requires(RerMaterials.ROSE_GOLD_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.ROSE_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ROSE_GOLD_INGOT.get())
					 .requires(RerMaterials.ROSE_GOLD_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.ROSE_GOLD_INGOT))
					 .save(recipeOutput, "roprer:rose_gold_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ROSE_GOLD_NUGGET.get(), 9)
					 .requires(RerMaterials.ROSE_GOLD_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.ROSE_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.ROSE_GOLD_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.ROSE_GOLD_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.ROSE_GOLD_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, ROSE_GOLD_SMELTABLES, RecipeCategory.MISC, RerMaterials.ROSE_GOLD_INGOT.get(), 0.2f, 200, "rose_gold");
		  oreBlasting(recipeOutput, ROSE_GOLD_SMELTABLES, RecipeCategory.MISC, RerMaterials.ROSE_GOLD_INGOT.get(), 0.2f, 100, "rose_gold");

		  List<ItemLike> KNIGHTMETAL_SMELTABLES = List.of(
					 RerMaterials.KNIGHTMETAL_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.KNIGHTMETAL_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.KNIGHTMETAL_BOLT.get())
					 .define('B', RerMaterials.KNIGHTMETAL_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.KNIGHTMETAL_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.KNIGHTMETAL_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.KNIGHTMETAL_ROD.get())
					 .define('B', RerMaterials.KNIGHTMETAL_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.KNIGHTMETAL_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.KNIGHTMETAL_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.KNIGHTMETAL_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.KNIGHTMETAL_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.KNIGHTMETAL_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.KNIGHTMETAL_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.KNIGHTMETAL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.KNIGHTMETAL_BOLT.get(), 2)
					 .requires(RerMaterials.KNIGHTMETAL_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.KNIGHTMETAL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.KNIGHTMETAL_TINY_DUST.get(), 9)
					 .requires(RerMaterials.KNIGHTMETAL_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.KNIGHTMETAL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.KNIGHTMETAL_DUST.get())
					 .requires(RerMaterials.KNIGHTMETAL_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.KNIGHTMETAL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.KNIGHTMETAL_LARGE_PLATE.get())
					 .requires(RerMaterials.KNIGHTMETAL_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.KNIGHTMETAL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.KNIGHTMETAL_CLUSTER.get())
					 .requires(RerMaterials.KNIGHTMETAL_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.KNIGHTMETAL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.KNIGHTMETAL_BLOCK.get(), 1)
					 .requires(RerMaterials.KNIGHTMETAL_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.KNIGHTMETAL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.KNIGHTMETAL_INGOT.get())
					 .requires(RerMaterials.KNIGHTMETAL_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.KNIGHTMETAL_INGOT))
					 .save(recipeOutput, "roprer:knightmetal_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.KNIGHTMETAL_NUGGET.get(), 9)
					 .requires(RerMaterials.KNIGHTMETAL_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.KNIGHTMETAL_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.KNIGHTMETAL_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.KNIGHTMETAL_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.KNIGHTMETAL_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, KNIGHTMETAL_SMELTABLES, RecipeCategory.MISC, RerMaterials.KNIGHTMETAL_INGOT.get(), 0.2f, 200, "knightmetal");
		  oreBlasting(recipeOutput, KNIGHTMETAL_SMELTABLES, RecipeCategory.MISC, RerMaterials.KNIGHTMETAL_INGOT.get(), 0.2f, 100, "knightmetal");

		  List<ItemLike> SKY_SMELTABLES = List.of(
					 RerMaterials.SKY_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.SKY_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.SKY_BOLT.get())
					 .define('B', RerMaterials.SKY_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.SKY_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.SKY_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.SKY_ROD.get())
					 .define('B', RerMaterials.SKY_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.SKY_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.SKY_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.SKY_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.SKY_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.SKY_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.SKY_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.SKY_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SKY_BOLT.get(), 2)
					 .requires(RerMaterials.SKY_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.SKY_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SKY_TINY_DUST.get(), 9)
					 .requires(RerMaterials.SKY_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.SKY_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SKY_DUST.get())
					 .requires(RerMaterials.SKY_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.SKY_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SKY_LARGE_PLATE.get())
					 .requires(RerMaterials.SKY_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.SKY_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SKY_CLUSTER.get())
					 .requires(RerMaterials.SKY_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.SKY_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.SKY_BLOCK.get(), 1)
					 .requires(RerMaterials.SKY_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.SKY_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SKY_INGOT.get())
					 .requires(RerMaterials.SKY_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.SKY_INGOT))
					 .save(recipeOutput, "roprer:sky_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SKY_NUGGET.get(), 9)
					 .requires(RerMaterials.SKY_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.SKY_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.SKY_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.SKY_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.SKY_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, SKY_SMELTABLES, RecipeCategory.MISC, RerMaterials.SKY_INGOT.get(), 0.2f, 200, "sky");
		  oreBlasting(recipeOutput, SKY_SMELTABLES, RecipeCategory.MISC, RerMaterials.SKY_INGOT.get(), 0.2f, 100, "sky");

		  List<ItemLike> IRONWOOD_SMELTABLES = List.of(
					 RerMaterials.IRONWOOD_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.IRONWOOD_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.IRONWOOD_BOLT.get())
					 .define('B', RerMaterials.IRONWOOD_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.IRONWOOD_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.IRONWOOD_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.IRONWOOD_ROD.get())
					 .define('B', RerMaterials.IRONWOOD_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.IRONWOOD_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.IRONWOOD_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.IRONWOOD_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.IRONWOOD_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.IRONWOOD_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.IRONWOOD_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.IRONWOOD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IRONWOOD_BOLT.get(), 2)
					 .requires(RerMaterials.IRONWOOD_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.IRONWOOD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IRONWOOD_TINY_DUST.get(), 9)
					 .requires(RerMaterials.IRONWOOD_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.IRONWOOD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IRONWOOD_DUST.get())
					 .requires(RerMaterials.IRONWOOD_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.IRONWOOD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IRONWOOD_LARGE_PLATE.get())
					 .requires(RerMaterials.IRONWOOD_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.IRONWOOD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IRONWOOD_CLUSTER.get())
					 .requires(RerMaterials.IRONWOOD_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.IRONWOOD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.IRONWOOD_BLOCK.get(), 1)
					 .requires(RerMaterials.IRONWOOD_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.IRONWOOD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IRONWOOD_INGOT.get())
					 .requires(RerMaterials.IRONWOOD_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.IRONWOOD_INGOT))
					 .save(recipeOutput, "roprer:ironwood_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IRONWOOD_NUGGET.get(), 9)
					 .requires(RerMaterials.IRONWOOD_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.IRONWOOD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IRONWOOD_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.IRONWOOD_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.IRONWOOD_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, IRONWOOD_SMELTABLES, RecipeCategory.MISC, RerMaterials.IRONWOOD_INGOT.get(), 0.2f, 200, "ironwood");
		  oreBlasting(recipeOutput, IRONWOOD_SMELTABLES, RecipeCategory.MISC, RerMaterials.IRONWOOD_INGOT.get(), 0.2f, 100, "ironwood");

		  List<ItemLike> TAINED_GOLD_SMELTABLES = List.of(
					 RerMaterials.TAINED_GOLD_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.TAINED_GOLD_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.TAINED_GOLD_BOLT.get())
					 .define('B', RerMaterials.TAINED_GOLD_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.TAINED_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.TAINED_GOLD_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.TAINED_GOLD_ROD.get())
					 .define('B', RerMaterials.TAINED_GOLD_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.TAINED_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.TAINED_GOLD_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.TAINED_GOLD_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.TAINED_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.TAINED_GOLD_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.TAINED_GOLD_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.TAINED_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TAINED_GOLD_BOLT.get(), 2)
					 .requires(RerMaterials.TAINED_GOLD_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.TAINED_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TAINED_GOLD_TINY_DUST.get(), 9)
					 .requires(RerMaterials.TAINED_GOLD_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.TAINED_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TAINED_GOLD_DUST.get())
					 .requires(RerMaterials.TAINED_GOLD_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.TAINED_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TAINED_GOLD_LARGE_PLATE.get())
					 .requires(RerMaterials.TAINED_GOLD_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.TAINED_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TAINED_GOLD_CLUSTER.get())
					 .requires(RerMaterials.TAINED_GOLD_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.TAINED_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.TAINED_GOLD_BLOCK.get(), 1)
					 .requires(RerMaterials.TAINED_GOLD_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.TAINED_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TAINED_GOLD_INGOT.get())
					 .requires(RerMaterials.TAINED_GOLD_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.TAINED_GOLD_INGOT))
					 .save(recipeOutput, "roprer:tained_gold_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TAINED_GOLD_NUGGET.get(), 9)
					 .requires(RerMaterials.TAINED_GOLD_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.TAINED_GOLD_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TAINED_GOLD_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.TAINED_GOLD_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.TAINED_GOLD_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, TAINED_GOLD_SMELTABLES, RecipeCategory.MISC, RerMaterials.TAINED_GOLD_INGOT.get(), 0.2f, 200, "tained_gold");
		  oreBlasting(recipeOutput, TAINED_GOLD_SMELTABLES, RecipeCategory.MISC, RerMaterials.TAINED_GOLD_INGOT.get(), 0.2f, 100, "tained_gold");

		  List<ItemLike> INFUSED_IRON_SMELTABLES = List.of(
					 RerMaterials.INFUSED_IRON_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.INFUSED_IRON_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.INFUSED_IRON_BOLT.get())
					 .define('B', RerMaterials.INFUSED_IRON_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.INFUSED_IRON_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.INFUSED_IRON_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.INFUSED_IRON_ROD.get())
					 .define('B', RerMaterials.INFUSED_IRON_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.INFUSED_IRON_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.INFUSED_IRON_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.INFUSED_IRON_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.INFUSED_IRON_INGOT))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.INFUSED_IRON_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.INFUSED_IRON_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.INFUSED_IRON_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.INFUSED_IRON_BOLT.get(), 2)
					 .requires(RerMaterials.INFUSED_IRON_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.INFUSED_IRON_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.INFUSED_IRON_TINY_DUST.get(), 9)
					 .requires(RerMaterials.INFUSED_IRON_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.INFUSED_IRON_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.INFUSED_IRON_DUST.get())
					 .requires(RerMaterials.INFUSED_IRON_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.INFUSED_IRON_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.INFUSED_IRON_LARGE_PLATE.get())
					 .requires(RerMaterials.INFUSED_IRON_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.INFUSED_IRON_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.INFUSED_IRON_CLUSTER.get())
					 .requires(RerMaterials.INFUSED_IRON_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.INFUSED_IRON_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.INFUSED_IRON_BLOCK.get(), 1)
					 .requires(RerMaterials.INFUSED_IRON_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.INFUSED_IRON_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.INFUSED_IRON_INGOT.get())
					 .requires(RerMaterials.INFUSED_IRON_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.INFUSED_IRON_INGOT))
					 .save(recipeOutput, "roprer:infused_iron_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.INFUSED_IRON_NUGGET.get(), 9)
					 .requires(RerMaterials.INFUSED_IRON_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.INFUSED_IRON_INGOT))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.INFUSED_IRON_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.INFUSED_IRON_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.INFUSED_IRON_INGOT))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, INFUSED_IRON_SMELTABLES, RecipeCategory.MISC, RerMaterials.INFUSED_IRON_INGOT.get(), 0.2f, 200, "infused_iron");
		  oreBlasting(recipeOutput, INFUSED_IRON_SMELTABLES, RecipeCategory.MISC, RerMaterials.INFUSED_IRON_INGOT.get(), 0.2f, 100, "infused_iron");

		  List<ItemLike> UTHERIUM_SMELTABLES = List.of(
					 RerMaterials.RAW_UTHERIUM,
					 RerMaterialsBlocks.UTHERIUM_ORE,
					 RerMaterialsBlocks.NETHERRACK_UTHERIUM_ORE,
					 RerMaterialsBlocks.END_STONE_UTHERIUM_ORE,
					 RerMaterialsBlocks.DEEPSLATE_UTHERIUM_ORE,
					 RerMaterials.UTHERIUM_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.UTHERIUM_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.UTHERIUM_BOLT.get())
					 .define('B', RerMaterials.UTHERIUM_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_UTHERIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.UTHERIUM_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.UTHERIUM_ROD.get())
					 .define('B', RerMaterials.UTHERIUM_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_UTHERIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.UTHERIUM_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.UTHERIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_UTHERIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.UTHERIUM_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.UTHERIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_UTHERIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.UTHERIUM_BOLT.get(), 2)
					 .requires(RerMaterials.UTHERIUM_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_UTHERIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.UTHERIUM_TINY_DUST.get(), 9)
					 .requires(RerMaterials.UTHERIUM_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_UTHERIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.UTHERIUM_DUST.get())
					 .requires(RerMaterials.UTHERIUM_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_UTHERIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.UTHERIUM_LARGE_PLATE.get())
					 .requires(RerMaterials.UTHERIUM_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_UTHERIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.UTHERIUM_CLUSTER.get())
					 .requires(RerMaterials.UTHERIUM_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_UTHERIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.RAW_UTHERIUM.get(), 9)
					 .requires(RerMaterialsBlocks.RAW_UTHERIUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_UTHERIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.UTHERIUM_BLOCK.get(), 1)
					 .requires(RerMaterials.UTHERIUM_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_UTHERIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.RAW_UTHERIUM_BLOCK.get(), 1)
					 .requires(RerMaterials.RAW_UTHERIUM, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_UTHERIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.UTHERIUM_INGOT.get())
					 .requires(RerMaterials.UTHERIUM_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_UTHERIUM))
					 .save(recipeOutput, "roprer:utherium_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.UTHERIUM_NUGGET.get(), 9)
					 .requires(RerMaterials.UTHERIUM_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_UTHERIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.UTHERIUM_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.UTHERIUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_UTHERIUM))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, UTHERIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.UTHERIUM_INGOT.get(), 0.2f, 200, "utherium");
		  oreBlasting(recipeOutput, UTHERIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.UTHERIUM_INGOT.get(), 0.2f, 100, "utherium");

		  List<ItemLike> THALLASIUM_SMELTABLES = List.of(
					 RerMaterials.RAW_THALLASIUM,
					 RerMaterialsBlocks.THALLASIUM_ORE,
					 RerMaterialsBlocks.NETHERRACK_THALLASIUM_ORE,
					 RerMaterialsBlocks.END_STONE_THALLASIUM_ORE,
					 RerMaterialsBlocks.DEEPSLATE_THALLASIUM_ORE,
					 RerMaterials.THALLASIUM_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.THALLASIUM_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.THALLASIUM_BOLT.get())
					 .define('B', RerMaterials.THALLASIUM_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_THALLASIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.THALLASIUM_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.THALLASIUM_ROD.get())
					 .define('B', RerMaterials.THALLASIUM_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_THALLASIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.THALLASIUM_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.THALLASIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_THALLASIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.THALLASIUM_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.THALLASIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_THALLASIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.THALLASIUM_BOLT.get(), 2)
					 .requires(RerMaterials.THALLASIUM_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_THALLASIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.THALLASIUM_TINY_DUST.get(), 9)
					 .requires(RerMaterials.THALLASIUM_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_THALLASIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.THALLASIUM_DUST.get())
					 .requires(RerMaterials.THALLASIUM_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_THALLASIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.THALLASIUM_LARGE_PLATE.get())
					 .requires(RerMaterials.THALLASIUM_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_THALLASIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.THALLASIUM_CLUSTER.get())
					 .requires(RerMaterials.THALLASIUM_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_THALLASIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.RAW_THALLASIUM.get(), 9)
					 .requires(RerMaterialsBlocks.RAW_THALLASIUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_THALLASIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.THALLASIUM_BLOCK.get(), 1)
					 .requires(RerMaterials.THALLASIUM_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_THALLASIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.RAW_THALLASIUM_BLOCK.get(), 1)
					 .requires(RerMaterials.RAW_THALLASIUM, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_THALLASIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.THALLASIUM_INGOT.get())
					 .requires(RerMaterials.THALLASIUM_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_THALLASIUM))
					 .save(recipeOutput, "roprer:thallasium_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.THALLASIUM_NUGGET.get(), 9)
					 .requires(RerMaterials.THALLASIUM_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_THALLASIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.THALLASIUM_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.THALLASIUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_THALLASIUM))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, THALLASIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.THALLASIUM_INGOT.get(), 0.2f, 200, "thallasium");
		  oreBlasting(recipeOutput, THALLASIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.THALLASIUM_INGOT.get(), 0.2f, 100, "thallasium");

		  List<ItemLike> NEBU_SMELTABLES = List.of(
					 RerMaterials.RAW_NEBU,
					 RerMaterialsBlocks.NEBU_ORE,
					 RerMaterialsBlocks.NETHERRACK_NEBU_ORE,
					 RerMaterialsBlocks.END_STONE_NEBU_ORE,
					 RerMaterialsBlocks.DEEPSLATE_NEBU_ORE,
					 RerMaterials.NEBU_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.NEBU_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.NEBU_BOLT.get())
					 .define('B', RerMaterials.NEBU_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NEBU))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.NEBU_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.NEBU_ROD.get())
					 .define('B', RerMaterials.NEBU_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NEBU))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.NEBU_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.NEBU_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NEBU))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.NEBU_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.NEBU_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NEBU))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.NEBU_BOLT.get(), 2)
					 .requires(RerMaterials.NEBU_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NEBU))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.NEBU_TINY_DUST.get(), 9)
					 .requires(RerMaterials.NEBU_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NEBU))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.NEBU_DUST.get())
					 .requires(RerMaterials.NEBU_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NEBU))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.NEBU_LARGE_PLATE.get())
					 .requires(RerMaterials.NEBU_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NEBU))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.NEBU_CLUSTER.get())
					 .requires(RerMaterials.NEBU_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NEBU))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.RAW_NEBU.get(), 9)
					 .requires(RerMaterialsBlocks.RAW_NEBU_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NEBU))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.NEBU_BLOCK.get(), 1)
					 .requires(RerMaterials.NEBU_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NEBU))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.RAW_NEBU_BLOCK.get(), 1)
					 .requires(RerMaterials.RAW_NEBU, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NEBU))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.NEBU_INGOT.get())
					 .requires(RerMaterials.NEBU_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NEBU))
					 .save(recipeOutput, "roprer:nebu_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.NEBU_NUGGET.get(), 9)
					 .requires(RerMaterials.NEBU_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NEBU))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.NEBU_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.NEBU_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_NEBU))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, NEBU_SMELTABLES, RecipeCategory.MISC, RerMaterials.NEBU_INGOT.get(), 0.2f, 200, "nebu");
		  oreBlasting(recipeOutput, NEBU_SMELTABLES, RecipeCategory.MISC, RerMaterials.NEBU_INGOT.get(), 0.2f, 100, "nebu");

		  List<ItemLike> REGALIUM_SMELTABLES = List.of(
					 RerMaterials.RAW_REGALIUM,
					 RerMaterialsBlocks.REGALIUM_ORE,
					 RerMaterialsBlocks.NETHERRACK_REGALIUM_ORE,
					 RerMaterialsBlocks.END_STONE_REGALIUM_ORE,
					 RerMaterialsBlocks.DEEPSLATE_REGALIUM_ORE,
					 RerMaterials.REGALIUM_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.REGALIUM_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.REGALIUM_BOLT.get())
					 .define('B', RerMaterials.REGALIUM_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_REGALIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.REGALIUM_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.REGALIUM_ROD.get())
					 .define('B', RerMaterials.REGALIUM_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_REGALIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.REGALIUM_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.REGALIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_REGALIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.REGALIUM_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.REGALIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_REGALIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REGALIUM_BOLT.get(), 2)
					 .requires(RerMaterials.REGALIUM_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_REGALIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REGALIUM_TINY_DUST.get(), 9)
					 .requires(RerMaterials.REGALIUM_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_REGALIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REGALIUM_DUST.get())
					 .requires(RerMaterials.REGALIUM_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_REGALIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REGALIUM_LARGE_PLATE.get())
					 .requires(RerMaterials.REGALIUM_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_REGALIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REGALIUM_CLUSTER.get())
					 .requires(RerMaterials.REGALIUM_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_REGALIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.RAW_REGALIUM.get(), 9)
					 .requires(RerMaterialsBlocks.RAW_REGALIUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_REGALIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.REGALIUM_BLOCK.get(), 1)
					 .requires(RerMaterials.REGALIUM_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_REGALIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.RAW_REGALIUM_BLOCK.get(), 1)
					 .requires(RerMaterials.RAW_REGALIUM, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_REGALIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REGALIUM_INGOT.get())
					 .requires(RerMaterials.REGALIUM_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_REGALIUM))
					 .save(recipeOutput, "roprer:regalium_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REGALIUM_NUGGET.get(), 9)
					 .requires(RerMaterials.REGALIUM_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_REGALIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.REGALIUM_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.REGALIUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_REGALIUM))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, REGALIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.REGALIUM_INGOT.get(), 0.2f, 200, "regalium");
		  oreBlasting(recipeOutput, REGALIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.REGALIUM_INGOT.get(), 0.2f, 100, "regalium");

		  List<ItemLike> FROSTSTEEL_SMELTABLES = List.of(
					 RerMaterials.RAW_FROSTSTEEL,
					 RerMaterialsBlocks.FROSTSTEEL_ORE,
					 RerMaterialsBlocks.NETHERRACK_FROSTSTEEL_ORE,
					 RerMaterialsBlocks.END_STONE_FROSTSTEEL_ORE,
					 RerMaterialsBlocks.DEEPSLATE_FROSTSTEEL_ORE,
					 RerMaterials.FROSTSTEEL_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.FROSTSTEEL_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.FROSTSTEEL_BOLT.get())
					 .define('B', RerMaterials.FROSTSTEEL_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FROSTSTEEL))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.FROSTSTEEL_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.FROSTSTEEL_ROD.get())
					 .define('B', RerMaterials.FROSTSTEEL_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FROSTSTEEL))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.FROSTSTEEL_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.FROSTSTEEL_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FROSTSTEEL))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.FROSTSTEEL_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.FROSTSTEEL_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FROSTSTEEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FROSTSTEEL_BOLT.get(), 2)
					 .requires(RerMaterials.FROSTSTEEL_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FROSTSTEEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FROSTSTEEL_TINY_DUST.get(), 9)
					 .requires(RerMaterials.FROSTSTEEL_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FROSTSTEEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FROSTSTEEL_DUST.get())
					 .requires(RerMaterials.FROSTSTEEL_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FROSTSTEEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FROSTSTEEL_LARGE_PLATE.get())
					 .requires(RerMaterials.FROSTSTEEL_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FROSTSTEEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FROSTSTEEL_CLUSTER.get())
					 .requires(RerMaterials.FROSTSTEEL_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FROSTSTEEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.RAW_FROSTSTEEL.get(), 9)
					 .requires(RerMaterialsBlocks.RAW_FROSTSTEEL_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FROSTSTEEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.FROSTSTEEL_BLOCK.get(), 1)
					 .requires(RerMaterials.FROSTSTEEL_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FROSTSTEEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.RAW_FROSTSTEEL_BLOCK.get(), 1)
					 .requires(RerMaterials.RAW_FROSTSTEEL, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FROSTSTEEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FROSTSTEEL_INGOT.get())
					 .requires(RerMaterials.FROSTSTEEL_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FROSTSTEEL))
					 .save(recipeOutput, "roprer:froststeel_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FROSTSTEEL_NUGGET.get(), 9)
					 .requires(RerMaterials.FROSTSTEEL_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FROSTSTEEL))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FROSTSTEEL_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.FROSTSTEEL_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FROSTSTEEL))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, FROSTSTEEL_SMELTABLES, RecipeCategory.MISC, RerMaterials.FROSTSTEEL_INGOT.get(), 0.2f, 200, "froststeel");
		  oreBlasting(recipeOutput, FROSTSTEEL_SMELTABLES, RecipeCategory.MISC, RerMaterials.FROSTSTEEL_INGOT.get(), 0.2f, 100, "froststeel");

		  List<ItemLike> FALSITE_SMELTABLES = List.of(
					 RerMaterials.RAW_FALSITE,
					 RerMaterialsBlocks.FALSITE_ORE,
					 RerMaterialsBlocks.NETHERRACK_FALSITE_ORE,
					 RerMaterialsBlocks.END_STONE_FALSITE_ORE,
					 RerMaterialsBlocks.DEEPSLATE_FALSITE_ORE,
					 RerMaterials.FALSITE_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.FALSITE_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.FALSITE_BOLT.get())
					 .define('B', RerMaterials.FALSITE_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FALSITE))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.FALSITE_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.FALSITE_ROD.get())
					 .define('B', RerMaterials.FALSITE_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FALSITE))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.FALSITE_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.FALSITE_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FALSITE))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.FALSITE_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.FALSITE_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FALSITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FALSITE_BOLT.get(), 2)
					 .requires(RerMaterials.FALSITE_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FALSITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FALSITE_TINY_DUST.get(), 9)
					 .requires(RerMaterials.FALSITE_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FALSITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FALSITE_DUST.get())
					 .requires(RerMaterials.FALSITE_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FALSITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FALSITE_LARGE_PLATE.get())
					 .requires(RerMaterials.FALSITE_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FALSITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FALSITE_CLUSTER.get())
					 .requires(RerMaterials.FALSITE_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FALSITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.RAW_FALSITE.get(), 9)
					 .requires(RerMaterialsBlocks.RAW_FALSITE_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FALSITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.FALSITE_BLOCK.get(), 1)
					 .requires(RerMaterials.FALSITE_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FALSITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.RAW_FALSITE_BLOCK.get(), 1)
					 .requires(RerMaterials.RAW_FALSITE, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FALSITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FALSITE_INGOT.get())
					 .requires(RerMaterials.FALSITE_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FALSITE))
					 .save(recipeOutput, "roprer:falsite_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FALSITE_NUGGET.get(), 9)
					 .requires(RerMaterials.FALSITE_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FALSITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.FALSITE_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.FALSITE_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_FALSITE))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, FALSITE_SMELTABLES, RecipeCategory.MISC, RerMaterials.FALSITE_INGOT.get(), 0.2f, 200, "falsite");
		  oreBlasting(recipeOutput, FALSITE_SMELTABLES, RecipeCategory.MISC, RerMaterials.FALSITE_INGOT.get(), 0.2f, 100, "falsite");

		  List<ItemLike> HORIZONITE_SMELTABLES = List.of(
					 RerMaterials.RAW_HORIZONITE,
					 RerMaterialsBlocks.HORIZONITE_ORE,
					 RerMaterialsBlocks.NETHERRACK_HORIZONITE_ORE,
					 RerMaterialsBlocks.END_STONE_HORIZONITE_ORE,
					 RerMaterialsBlocks.DEEPSLATE_HORIZONITE_ORE,
					 RerMaterials.HORIZONITE_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.HORIZONITE_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.HORIZONITE_BOLT.get())
					 .define('B', RerMaterials.HORIZONITE_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_HORIZONITE))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.HORIZONITE_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.HORIZONITE_ROD.get())
					 .define('B', RerMaterials.HORIZONITE_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_HORIZONITE))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.HORIZONITE_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.HORIZONITE_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_HORIZONITE))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.HORIZONITE_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.HORIZONITE_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_HORIZONITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.HORIZONITE_BOLT.get(), 2)
					 .requires(RerMaterials.HORIZONITE_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_HORIZONITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.HORIZONITE_TINY_DUST.get(), 9)
					 .requires(RerMaterials.HORIZONITE_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_HORIZONITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.HORIZONITE_DUST.get())
					 .requires(RerMaterials.HORIZONITE_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_HORIZONITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.HORIZONITE_LARGE_PLATE.get())
					 .requires(RerMaterials.HORIZONITE_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_HORIZONITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.HORIZONITE_CLUSTER.get())
					 .requires(RerMaterials.HORIZONITE_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_HORIZONITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.RAW_HORIZONITE.get(), 9)
					 .requires(RerMaterialsBlocks.RAW_HORIZONITE_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_HORIZONITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.HORIZONITE_BLOCK.get(), 1)
					 .requires(RerMaterials.HORIZONITE_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_HORIZONITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.RAW_HORIZONITE_BLOCK.get(), 1)
					 .requires(RerMaterials.RAW_HORIZONITE, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_HORIZONITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.HORIZONITE_INGOT.get())
					 .requires(RerMaterials.HORIZONITE_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_HORIZONITE))
					 .save(recipeOutput, "roprer:horizonite_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.HORIZONITE_NUGGET.get(), 9)
					 .requires(RerMaterials.HORIZONITE_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_HORIZONITE))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.HORIZONITE_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.HORIZONITE_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_HORIZONITE))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, HORIZONITE_SMELTABLES, RecipeCategory.MISC, RerMaterials.HORIZONITE_INGOT.get(), 0.2f, 200, "horizonite");
		  oreBlasting(recipeOutput, HORIZONITE_SMELTABLES, RecipeCategory.MISC, RerMaterials.HORIZONITE_INGOT.get(), 0.2f, 100, "horizonite");

		  List<ItemLike> IESNIUM_SMELTABLES = List.of(
					 RerMaterials.RAW_IESNIUM,
					 RerMaterialsBlocks.IESNIUM_ORE,
					 RerMaterialsBlocks.NETHERRACK_IESNIUM_ORE,
					 RerMaterialsBlocks.END_STONE_IESNIUM_ORE,
					 RerMaterialsBlocks.DEEPSLATE_IESNIUM_ORE,
					 RerMaterials.IESNIUM_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.IESNIUM_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.IESNIUM_BOLT.get())
					 .define('B', RerMaterials.IESNIUM_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IESNIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.IESNIUM_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.IESNIUM_ROD.get())
					 .define('B', RerMaterials.IESNIUM_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IESNIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.IESNIUM_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.IESNIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IESNIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.IESNIUM_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.IESNIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IESNIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IESNIUM_BOLT.get(), 2)
					 .requires(RerMaterials.IESNIUM_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IESNIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IESNIUM_TINY_DUST.get(), 9)
					 .requires(RerMaterials.IESNIUM_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IESNIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IESNIUM_DUST.get())
					 .requires(RerMaterials.IESNIUM_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IESNIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IESNIUM_LARGE_PLATE.get())
					 .requires(RerMaterials.IESNIUM_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IESNIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IESNIUM_CLUSTER.get())
					 .requires(RerMaterials.IESNIUM_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IESNIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.RAW_IESNIUM.get(), 9)
					 .requires(RerMaterialsBlocks.RAW_IESNIUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IESNIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.IESNIUM_BLOCK.get(), 1)
					 .requires(RerMaterials.IESNIUM_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IESNIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.RAW_IESNIUM_BLOCK.get(), 1)
					 .requires(RerMaterials.RAW_IESNIUM, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IESNIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IESNIUM_INGOT.get())
					 .requires(RerMaterials.IESNIUM_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IESNIUM))
					 .save(recipeOutput, "roprer:iesnium_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IESNIUM_NUGGET.get(), 9)
					 .requires(RerMaterials.IESNIUM_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IESNIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.IESNIUM_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.IESNIUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_IESNIUM))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, IESNIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.IESNIUM_INGOT.get(), 0.2f, 200, "iesnium");
		  oreBlasting(recipeOutput, IESNIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.IESNIUM_INGOT.get(), 0.2f, 100, "iesnium");

		  List<ItemLike> TUNGSTEN_SMELTABLES = List.of(
					 RerMaterials.RAW_TUNGSTEN,
					 RerMaterialsBlocks.TUNGSTEN_ORE,
					 RerMaterialsBlocks.NETHERRACK_TUNGSTEN_ORE,
					 RerMaterialsBlocks.END_STONE_TUNGSTEN_ORE,
					 RerMaterialsBlocks.DEEPSLATE_TUNGSTEN_ORE,
					 RerMaterials.TUNGSTEN_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.TUNGSTEN_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.TUNGSTEN_BOLT.get())
					 .define('B', RerMaterials.TUNGSTEN_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TUNGSTEN))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.TUNGSTEN_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.TUNGSTEN_ROD.get())
					 .define('B', RerMaterials.TUNGSTEN_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TUNGSTEN))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.TUNGSTEN_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.TUNGSTEN_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TUNGSTEN))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.TUNGSTEN_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.TUNGSTEN_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TUNGSTEN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TUNGSTEN_BOLT.get(), 2)
					 .requires(RerMaterials.TUNGSTEN_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TUNGSTEN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TUNGSTEN_TINY_DUST.get(), 9)
					 .requires(RerMaterials.TUNGSTEN_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TUNGSTEN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TUNGSTEN_DUST.get())
					 .requires(RerMaterials.TUNGSTEN_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TUNGSTEN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TUNGSTEN_LARGE_PLATE.get())
					 .requires(RerMaterials.TUNGSTEN_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TUNGSTEN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TUNGSTEN_CLUSTER.get())
					 .requires(RerMaterials.TUNGSTEN_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TUNGSTEN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.RAW_TUNGSTEN.get(), 9)
					 .requires(RerMaterialsBlocks.RAW_TUNGSTEN_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TUNGSTEN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.TUNGSTEN_BLOCK.get(), 1)
					 .requires(RerMaterials.TUNGSTEN_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TUNGSTEN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.RAW_TUNGSTEN_BLOCK.get(), 1)
					 .requires(RerMaterials.RAW_TUNGSTEN, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TUNGSTEN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TUNGSTEN_INGOT.get())
					 .requires(RerMaterials.TUNGSTEN_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TUNGSTEN))
					 .save(recipeOutput, "roprer:tungsten_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TUNGSTEN_NUGGET.get(), 9)
					 .requires(RerMaterials.TUNGSTEN_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TUNGSTEN))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TUNGSTEN_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.TUNGSTEN_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_TUNGSTEN))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, RerMaterials.TUNGSTEN_INGOT.get(), 0.2f, 200, "tungsten");
		  oreBlasting(recipeOutput, TUNGSTEN_SMELTABLES, RecipeCategory.MISC, RerMaterials.TUNGSTEN_INGOT.get(), 0.2f, 100, "tungsten");

		  List<ItemLike> VENTIUM_SMELTABLES = List.of(
					 RerMaterials.RAW_VENTIUM,
					 RerMaterialsBlocks.VENTIUM_ORE,
					 RerMaterialsBlocks.NETHERRACK_VENTIUM_ORE,
					 RerMaterialsBlocks.END_STONE_VENTIUM_ORE,
					 RerMaterialsBlocks.DEEPSLATE_VENTIUM_ORE,
					 RerMaterials.VENTIUM_DUST);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.VENTIUM_GEAR.get())
					 .pattern(" A ")
					 .pattern("ABA")
					 .pattern(" A ")
					 .define('A', RerMaterials.VENTIUM_BOLT.get())
					 .define('B', RerMaterials.VENTIUM_RING.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_VENTIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.VENTIUM_RING.get(), 2)
					 .pattern("BAB")
					 .pattern("A A")
					 .pattern("BAB")
					 .define('A', RerMaterials.VENTIUM_ROD.get())
					 .define('B', RerMaterials.VENTIUM_BOLT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_VENTIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.VENTIUM_ROD.get(), 2)
					 .pattern(" A ")
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.VENTIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_VENTIUM))
					 .save(recipeOutput);

		  ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterials.VENTIUM_DOUBLE_INGOT.get())
					 .pattern(" A ")
					 .pattern(" A ")
					 .define('A', RerMaterials.VENTIUM_INGOT.get())
					 .unlockedBy("has_raw", has(RerMaterials.RAW_VENTIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.VENTIUM_BOLT.get(), 2)
					 .requires(RerMaterials.VENTIUM_ROD)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_VENTIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.VENTIUM_TINY_DUST.get(), 9)
					 .requires(RerMaterials.VENTIUM_DUST)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_VENTIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.VENTIUM_DUST.get())
					 .requires(RerMaterials.VENTIUM_TINY_DUST, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_VENTIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.VENTIUM_LARGE_PLATE.get())
					 .requires(RerMaterials.VENTIUM_PLATE, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_VENTIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.VENTIUM_CLUSTER.get())
					 .requires(RerMaterials.VENTIUM_CHUNK, 4)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_VENTIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.RAW_VENTIUM.get(), 9)
					 .requires(RerMaterialsBlocks.RAW_VENTIUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_VENTIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.VENTIUM_BLOCK.get(), 1)
					 .requires(RerMaterials.VENTIUM_INGOT, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_VENTIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterialsBlocks.RAW_VENTIUM_BLOCK.get(), 1)
					 .requires(RerMaterials.RAW_VENTIUM, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_VENTIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.VENTIUM_INGOT.get())
					 .requires(RerMaterials.VENTIUM_NUGGET, 9)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_VENTIUM))
					 .save(recipeOutput, "roprer:ventium_ingot_from_nugget");

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.VENTIUM_NUGGET.get(), 9)
					 .requires(RerMaterials.VENTIUM_INGOT)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_VENTIUM))
					 .save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.VENTIUM_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.VENTIUM_BLOCK)
					 .unlockedBy("has_raw", has(RerMaterials.RAW_VENTIUM))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, VENTIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.VENTIUM_INGOT.get(), 0.2f, 200, "ventium");
		  oreBlasting(recipeOutput, VENTIUM_SMELTABLES, RecipeCategory.MISC, RerMaterials.VENTIUM_INGOT.get(), 0.2f, 100, "ventium");
	 }
}
