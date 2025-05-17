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
					 RerMaterialsBlocks.DEEPSLATE_TIN_ORE);

		  List<ItemLike> APATITE_SMELTABLES = List.of(
					 RerMaterials.APATITE_CLUSTER_SHARD,
					 RerMaterialsBlocks.APATITE_ORE,
					 RerMaterialsBlocks.NETHERRACK_APATITE_ORE,
					 RerMaterialsBlocks.END_STONE_APATITE_ORE,
					 RerMaterialsBlocks.DEEPSLATE_APATITE_ORE);

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

		  oreSmelting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, RerMaterials.TIN_INGOT.get(), 0.2f, 200, "tin");
		  oreBlasting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, RerMaterials.TIN_INGOT.get(), 0.2f, 100, "tin");
		  oreSmelting(recipeOutput, APATITE_SMELTABLES, RecipeCategory.MISC, RerMaterials.APATITE_GEM.get(), 0.2f, 200, "apatite");
		  oreBlasting(recipeOutput, APATITE_SMELTABLES, RecipeCategory.MISC, RerMaterials.APATITE_GEM.get(), 0.2f, 100, "apatite");
	 }
}
