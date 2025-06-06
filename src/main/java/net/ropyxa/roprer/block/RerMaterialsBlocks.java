package net.ropyxa.roprer.block;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.ropyxa.roprer.RopRer;
import net.ropyxa.roprer.item.RerMaterials;

import java.util.List;
import java.util.function.Supplier;

public class RerMaterialsBlocks {
	 public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(RopRer.MOD_ID);

	 public static final DeferredBlock<Block> TIN_BLOCK = registerBlock("tin_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.RAW_IRON_BLOCK)));

	 public static final DeferredBlock<Block> TIN_ORE = registerBlock("tin_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
	 });

	 public static final DeferredBlock<Block> NETHERRACK_TIN_ORE = registerBlock("netherrack_tin_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)){
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
	 });

	 public static final DeferredBlock<Block> END_STONE_TIN_ORE = registerBlock("end_stone_tin_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)){
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
	 });

	 public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)){
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
	 });

	 public static final DeferredBlock<Block> COBALT_BLOCK = registerBlock("cobalt_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_COBALT_BLOCK = registerBlock("raw_cobalt_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> COBALT_ORE = registerBlock("cobalt_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_COBALT_ORE = registerBlock("netherrack_cobalt_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_COBALT_ORE = registerBlock("end_stone_cobalt_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_COBALT_ORE = registerBlock("deepslate_cobalt_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> APATITE_BLOCK = registerBlock("apatite_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> APATITE_CLUSTER_BLOCK = registerBlock("apatite_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> APATITE_ORE = registerBlock("apatite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_APATITE_ORE = registerBlock("netherrack_apatite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)){
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_APATITE_ORE = registerBlock("end_stone_apatite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)){
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_APATITE_ORE = registerBlock("deepslate_apatite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)){
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> CINNABAR_BLOCK = registerBlock("cinnabar_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> CINNABAR_CLUSTER_BLOCK = registerBlock("cinnabar_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> CINNABAR_ORE = registerBlock("cinnabar_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_CINNABAR_ORE = registerBlock("netherrack_cinnabar_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_CINNABAR_ORE = registerBlock("end_stone_cinnabar_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_CINNABAR_ORE = registerBlock("deepslate_cinnabar_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_ALUMINUM_BLOCK = registerBlock("raw_aluminum_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> ALUMINUM_ORE = registerBlock("aluminum_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_ALUMINUM_ORE = registerBlock("netherrack_aluminum_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_ALUMINUM_ORE = registerBlock("end_stone_aluminum_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_ALUMINUM_ORE = registerBlock("deepslate_aluminum_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> AQUITE_BLOCK = registerBlock("aquite_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> AQUITE_CLUSTER_BLOCK = registerBlock("aquite_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> AQUITE_ORE = registerBlock("aquite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_AQUITE_ORE = registerBlock("netherrack_aquite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_AQUITE_ORE = registerBlock("end_stone_aquite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_AQUITE_ORE = registerBlock("deepslate_aquite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> BITUMEN_BLOCK = registerBlock("bitumen_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> BITUMEN_CLUSTER_BLOCK = registerBlock("bitumen_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> BITUMEN_ORE = registerBlock("bitumen_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_BITUMEN_ORE = registerBlock("netherrack_bitumen_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_BITUMEN_ORE = registerBlock("end_stone_bitumen_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_BITUMEN_ORE = registerBlock("deepslate_bitumen_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> ARCANE_BLOCK = registerBlock("arcane_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> ARCANE_CLUSTER_BLOCK = registerBlock("arcane_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> ARCANE_ORE = registerBlock("arcane_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_ARCANE_ORE = registerBlock("netherrack_arcane_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_ARCANE_ORE = registerBlock("end_stone_arcane_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_ARCANE_ORE = registerBlock("deepslate_arcane_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> IRIDIUM_BLOCK = registerBlock("iridium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_IRIDIUM_BLOCK = registerBlock("raw_iridium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> IRIDIUM_ORE = registerBlock("iridium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_IRIDIUM_ORE = registerBlock("netherrack_iridium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_IRIDIUM_ORE = registerBlock("end_stone_iridium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_IRIDIUM_ORE = registerBlock("deepslate_iridium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> LEAD_BLOCK = registerBlock("lead_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> LEAD_ORE = registerBlock("lead_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_LEAD_ORE = registerBlock("netherrack_lead_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_LEAD_ORE = registerBlock("end_stone_lead_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NICKEL_BLOCK = registerBlock("nickel_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_NICKEL_BLOCK = registerBlock("raw_nickel_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> NICKEL_ORE = registerBlock("nickel_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_NICKEL_ORE = registerBlock("netherrack_nickel_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_NICKEL_ORE = registerBlock("end_stone_nickel_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_NICKEL_ORE = registerBlock("deepslate_nickel_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> OSMIUM_BLOCK = registerBlock("osmium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_OSMIUM_BLOCK = registerBlock("raw_osmium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> OSMIUM_ORE = registerBlock("osmium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_OSMIUM_ORE = registerBlock("netherrack_osmium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_OSMIUM_ORE = registerBlock("end_stone_osmium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_OSMIUM_ORE = registerBlock("deepslate_osmium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> CARMINITE_BLOCK = registerBlock("carminite_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> CARMINITE_CLUSTER_BLOCK = registerBlock("carminite_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> CARMINITE_ORE = registerBlock("carminite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_CARMINITE_ORE = registerBlock("netherrack_carminite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_CARMINITE_ORE = registerBlock("end_stone_carminite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_CARMINITE_ORE = registerBlock("deepslate_carminite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> CERTUS_QUARTZ_BLOCK = registerBlock("certus_quartz_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> CERTUS_QUARTZ_CLUSTER_BLOCK = registerBlock("certus_quartz_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> CERTUS_QUARTZ_ORE = registerBlock("certus_quartz_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_CERTUS_QUARTZ_ORE = registerBlock("netherrack_certus_quartz_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_CERTUS_QUARTZ_ORE = registerBlock("end_stone_certus_quartz_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_CERTUS_QUARTZ_ORE = registerBlock("deepslate_certus_quartz_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> CHARGED_CERTUS_QUARTZ_BLOCK = registerBlock("charged_certus_quartz_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> CHARGED_CERTUS_QUARTZ_CLUSTER_BLOCK = registerBlock("charged_certus_quartz_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> CHARGED_CERTUS_QUARTZ_ORE = registerBlock("charged_certus_quartz_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_CHARGED_CERTUS_QUARTZ_ORE = registerBlock("netherrack_charged_certus_quartz_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_CHARGED_CERTUS_QUARTZ_ORE = registerBlock("end_stone_charged_certus_quartz_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_CHARGED_CERTUS_QUARTZ_ORE = registerBlock("deepslate_charged_certus_quartz_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> CHAROITE_BLOCK = registerBlock("charoite_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> CHAROITE_CLUSTER_BLOCK = registerBlock("charoite_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> CHAROITE_ORE = registerBlock("charoite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_CHAROITE_ORE = registerBlock("netherrack_charoite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_CHAROITE_ORE = registerBlock("end_stone_charoite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_CHAROITE_ORE = registerBlock("deepslate_charoite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> UTHERIUM_BLOCK = registerBlock("utherium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_UTHERIUM_BLOCK = registerBlock("raw_utherium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> UTHERIUM_ORE = registerBlock("utherium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_UTHERIUM_ORE = registerBlock("netherrack_utherium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_UTHERIUM_ORE = registerBlock("end_stone_utherium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_UTHERIUM_ORE = registerBlock("deepslate_utherium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> THALLASIUM_BLOCK = registerBlock("thallasium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_THALLASIUM_BLOCK = registerBlock("raw_thallasium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> THALLASIUM_ORE = registerBlock("thallasium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_THALLASIUM_ORE = registerBlock("netherrack_thallasium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_THALLASIUM_ORE = registerBlock("end_stone_thallasium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_THALLASIUM_ORE = registerBlock("deepslate_thallasium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NEBU_BLOCK = registerBlock("nebu_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_NEBU_BLOCK = registerBlock("raw_nebu_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> NEBU_ORE = registerBlock("nebu_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_NEBU_ORE = registerBlock("netherrack_nebu_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_NEBU_ORE = registerBlock("end_stone_nebu_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_NEBU_ORE = registerBlock("deepslate_nebu_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> REGALIUM_BLOCK = registerBlock("regalium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_REGALIUM_BLOCK = registerBlock("raw_regalium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> REGALIUM_ORE = registerBlock("regalium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_REGALIUM_ORE = registerBlock("netherrack_regalium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_REGALIUM_ORE = registerBlock("end_stone_regalium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_REGALIUM_ORE = registerBlock("deepslate_regalium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> FROSTSTEEL_BLOCK = registerBlock("froststeel_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_FROSTSTEEL_BLOCK = registerBlock("raw_froststeel_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> FROSTSTEEL_ORE = registerBlock("froststeel_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_FROSTSTEEL_ORE = registerBlock("netherrack_froststeel_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_FROSTSTEEL_ORE = registerBlock("end_stone_froststeel_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_FROSTSTEEL_ORE = registerBlock("deepslate_froststeel_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> FALSITE_BLOCK = registerBlock("falsite_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_FALSITE_BLOCK = registerBlock("raw_falsite_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> FALSITE_ORE = registerBlock("falsite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_FALSITE_ORE = registerBlock("netherrack_falsite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_FALSITE_ORE = registerBlock("end_stone_falsite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_FALSITE_ORE = registerBlock("deepslate_falsite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> HORIZONITE_BLOCK = registerBlock("horizonite_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_HORIZONITE_BLOCK = registerBlock("raw_horizonite_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> HORIZONITE_ORE = registerBlock("horizonite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_HORIZONITE_ORE = registerBlock("netherrack_horizonite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_HORIZONITE_ORE = registerBlock("end_stone_horizonite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_HORIZONITE_ORE = registerBlock("deepslate_horizonite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> IESNIUM_BLOCK = registerBlock("iesnium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_IESNIUM_BLOCK = registerBlock("raw_iesnium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> IESNIUM_ORE = registerBlock("iesnium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_IESNIUM_ORE = registerBlock("netherrack_iesnium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_IESNIUM_ORE = registerBlock("end_stone_iesnium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_IESNIUM_ORE = registerBlock("deepslate_iesnium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_TUNGSTEN_BLOCK = registerBlock("raw_tungsten_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> TUNGSTEN_ORE = registerBlock("tungsten_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_TUNGSTEN_ORE = registerBlock("netherrack_tungsten_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_TUNGSTEN_ORE = registerBlock("end_stone_tungsten_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> VENTIUM_BLOCK = registerBlock("ventium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_VENTIUM_BLOCK = registerBlock("raw_ventium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> VENTIUM_ORE = registerBlock("ventium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_VENTIUM_ORE = registerBlock("netherrack_ventium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_VENTIUM_ORE = registerBlock("end_stone_ventium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_VENTIUM_ORE = registerBlock("deepslate_ventium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> PLATINUM_BLOCK = registerBlock("platinum_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> PLATINUM_ORE = registerBlock("platinum_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_PLATINUM_ORE = registerBlock("netherrack_platinum_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_PLATINUM_ORE = registerBlock("end_stone_platinum_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> URANIUM_BLOCK = registerBlock("uranium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_URANIUM_BLOCK = registerBlock("raw_uranium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> URANIUM_ORE = registerBlock("uranium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_URANIUM_ORE = registerBlock("netherrack_uranium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_URANIUM_ORE = registerBlock("end_stone_uranium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_URANIUM_ORE = registerBlock("deepslate_uranium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> SILVER_BLOCK = registerBlock("silver_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> SILVER_ORE = registerBlock("silver_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_SILVER_ORE = registerBlock("netherrack_silver_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_SILVER_ORE = registerBlock("end_stone_silver_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_TITANIUM_BLOCK = registerBlock("raw_titanium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> TITANIUM_ORE = registerBlock("titanium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_TITANIUM_ORE = registerBlock("netherrack_titanium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_TITANIUM_ORE = registerBlock("end_stone_titanium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> ZINC_BLOCK = registerBlock("zinc_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_ZINC_BLOCK = registerBlock("raw_zinc_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> ZINC_ORE = registerBlock("zinc_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_ZINC_ORE = registerBlock("netherrack_zinc_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_ZINC_ORE = registerBlock("end_stone_zinc_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_ZINC_ORE = registerBlock("deepslate_zinc_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> SAPPHIRE_CLUSTER_BLOCK = registerBlock("sapphire_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_SAPPHIRE_ORE = registerBlock("netherrack_sapphire_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_SAPPHIRE_ORE = registerBlock("end_stone_sapphire_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DIMENSIONAL_BLOCK = registerBlock("dimensional_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> DIMENSIONAL_CLUSTER_BLOCK = registerBlock("dimensional_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> DIMENSIONAL_ORE = registerBlock("dimensional_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_DIMENSIONAL_ORE = registerBlock("netherrack_dimensional_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_DIMENSIONAL_ORE = registerBlock("end_stone_dimensional_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_DIMENSIONAL_ORE = registerBlock("deepslate_dimensional_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> MOONSTONE_BLOCK = registerBlock("moonstone_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> MOONSTONE_CLUSTER_BLOCK = registerBlock("moonstone_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> MOONSTONE_ORE = registerBlock("moonstone_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_MOONSTONE_ORE = registerBlock("netherrack_moonstone_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_MOONSTONE_ORE = registerBlock("end_stone_moonstone_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_MOONSTONE_ORE = registerBlock("deepslate_moonstone_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> PERIDOT_BLOCK = registerBlock("peridot_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> PERIDOT_CLUSTER_BLOCK = registerBlock("peridot_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> PERIDOT_ORE = registerBlock("peridot_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_PERIDOT_ORE = registerBlock("netherrack_peridot_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_PERIDOT_ORE = registerBlock("end_stone_peridot_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_PERIDOT_ORE = registerBlock("deepslate_peridot_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> PYROPE_BLOCK = registerBlock("pyrope_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> PYROPE_CLUSTER_BLOCK = registerBlock("pyrope_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> PYROPE_ORE = registerBlock("pyrope_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_PYROPE_ORE = registerBlock("netherrack_pyrope_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_PYROPE_ORE = registerBlock("end_stone_pyrope_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_PYROPE_ORE = registerBlock("deepslate_pyrope_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DIOPSIDE_BLOCK = registerBlock("diopside_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> DIOPSIDE_CLUSTER_BLOCK = registerBlock("diopside_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> DIOPSIDE_ORE = registerBlock("diopside_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_DIOPSIDE_ORE = registerBlock("netherrack_diopside_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_DIOPSIDE_ORE = registerBlock("end_stone_diopside_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_DIOPSIDE_ORE = registerBlock("deepslate_diopside_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> SULFUR_BLOCK = registerBlock("sulfur_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> SULFUR_CLUSTER_BLOCK = registerBlock("sulfur_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> SULFUR_ORE = registerBlock("sulfur_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_SULFUR_ORE = registerBlock("netherrack_sulfur_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_SULFUR_ORE = registerBlock("end_stone_sulfur_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_SULFUR_ORE = registerBlock("deepslate_sulfur_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> RUBY_BLOCK = registerBlock("ruby_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RUBY_CLUSTER_BLOCK = registerBlock("ruby_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> RUBY_ORE = registerBlock("ruby_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_RUBY_ORE = registerBlock("netherrack_ruby_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_RUBY_ORE = registerBlock("end_stone_ruby_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> POTASSIUM_NITRATE_BLOCK = registerBlock("potassium_nitrate_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> POTASSIUM_NITRATE_CLUSTER_BLOCK = registerBlock("potassium_nitrate_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> POTASSIUM_NITRATE_ORE = registerBlock("potassium_nitrate_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_POTASSIUM_NITRATE_ORE = registerBlock("netherrack_potassium_nitrate_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_POTASSIUM_NITRATE_ORE = registerBlock("end_stone_potassium_nitrate_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_POTASSIUM_NITRATE_ORE = registerBlock("deepslate_potassium_nitrate_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> FLUORITE_BLOCK = registerBlock("fluorite_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> FLUORITE_CLUSTER_BLOCK = registerBlock("fluorite_cluster_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> FLUORITE_ORE = registerBlock("fluorite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_FLUORITE_ORE = registerBlock("netherrack_fluorite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_FLUORITE_ORE = registerBlock("end_stone_fluorite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> DEEPSLATE_FLUORITE_ORE = registerBlock("deepslate_fluorite_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> CLOGGRUM_BLOCK = registerBlock("cloggrum_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> RAW_CLOGGRUM_BLOCK = registerBlock("raw_cloggrum_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)));

	 public static final DeferredBlock<Block> CLOGGRUM_ORE = registerBlock("cloggrum_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.stone")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context,
								tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> NETHERRACK_CLOGGRUM_ORE = registerBlock("netherrack_cloggrum_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.netherrack_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> END_STONE_CLOGGRUM_ORE = registerBlock("end_stone_cloggrum_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.end_stone_metal_ore_coordinates")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag); }
				});

	 public static final DeferredBlock<Block> DEEPSLATE_CLOGGRUM_ORE = registerBlock("deepslate_cloggrum_ore",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DEEPSLATE_IRON_ORE)) {
					 @Override public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) { if(Screen.hasShiftDown()) {tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate_metal_ore_coordinates")); tooltipComponents.add(Component.translatable("tooltip.roprer.deepslate")); } else {tooltipComponents.add(Component.translatable("tooltip.roprer.shift_down")); } super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);}
				});

	 public static final DeferredBlock<Block> BRASS_BLOCK = registerBlock("brass_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> BRONZE_BLOCK = registerBlock("bronze_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> CAST_IRON_BLOCK = registerBlock("cast_iron_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> SOUL_STEEL_BLOCK = registerBlock("soul_steel_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> STEEL_BLOCK = registerBlock("steel_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> ENDERIUM_BLOCK = registerBlock("enderium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> ELECTRUM_BLOCK = registerBlock("electrum_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> LUMIUM_BLOCK = registerBlock("lumium_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> FIERY_BLOCK = registerBlock("fiery_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> SIGNALUM_BLOCK = registerBlock("signalum_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> INVAR_BLOCK = registerBlock("invar_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> GRAPHITE_BLOCK = registerBlock("graphite_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> CONSTANTAN_BLOCK = registerBlock("constantan_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> REFINED_OBSIDIAN_BLOCK = registerBlock("refined_obsidian_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> REFINED_GLOWSTONE_BLOCK = registerBlock("refined_glowstone_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> ORICHALCUM_BLOCK = registerBlock("orichalcum_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> ROSE_GOLD_BLOCK = registerBlock("rose_gold_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> KNIGHTMETAL_BLOCK = registerBlock("knightmetal_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> SKY_BLOCK = registerBlock("sky_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> IRONWOOD_BLOCK = registerBlock("ironwood_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> TAINED_GOLD_BLOCK = registerBlock("tained_gold_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 public static final DeferredBlock<Block> INFUSED_IRON_BLOCK = registerBlock("infused_iron_block",
				() -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)));

	 private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
		  DeferredBlock<T> toReturn = BLOCKS.register(name, block);
		  registerBlockItem(name, toReturn);
		  return toReturn;
	 }

	 private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
		  RerMaterials.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	 }

	 public static void register (IEventBus eventBus) {
		  BLOCKS.register(eventBus);
	 }
}
