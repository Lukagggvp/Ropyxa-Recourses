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
	 }
}
