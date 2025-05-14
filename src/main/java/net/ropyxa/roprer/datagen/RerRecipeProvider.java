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

		  //ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RerMaterialsBlocks.RAW_TIN_BLOCK.get())
					 //.pattern("AAA")
					 //.pattern("AAA")
					 //.pattern("AAA")
					 //.define('A', RerMaterials.RAW_TIN.get())
					 //.unlockedBy("has_raw", has(RerMaterials.RAW_TIN))
					 //.save(recipeOutput);

		  ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RerMaterials.TIN_INGOT.get(), 9)
					 .requires(RerMaterialsBlocks.TIN_BLOCK)
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
					 .unlockedBy("has_tin", has(RerMaterials.RAW_TIN))
					 .save(recipeOutput);

		  oreSmelting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, RerMaterials.TIN_INGOT.get(), 0.2f, 200, "tin");
		  oreBlasting(recipeOutput, TIN_SMELTABLES, RecipeCategory.MISC, RerMaterials.TIN_INGOT.get(), 0.2f, 100, "tin");
	 }
}
