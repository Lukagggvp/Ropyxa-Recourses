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
	 }
}
