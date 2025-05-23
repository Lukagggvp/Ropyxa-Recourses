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
