package net.ropyxa.roprer;

import net.ropyxa.roprer.block.RerMaterialsBlocks;
import net.ropyxa.roprer.item.RerMaterials;
import net.ropyxa.roprer.misc.RerCrativeModeTabs;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(RopRer.MOD_ID)
public class RopRer {
	 public static final String MOD_ID = "roprer";
	 private static final Logger LOGGER = LogUtils.getLogger();

	 public RopRer(IEventBus modEventBus, ModContainer modContainer) {
		  modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
		  NeoForge.EVENT_BUS.register(this);

		  modEventBus.addListener(this::commonSetup);

		  RerCrativeModeTabs.register(modEventBus);

		  RerMaterials.register(modEventBus);
		  RerMaterialsBlocks.register(modEventBus);
	 }

	 private void commonSetup(final FMLCommonSetupEvent event) {
	 }

	 @SubscribeEvent
	 public void onServerStarting(ServerStartingEvent event) {
	 }

	 @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	 public static class ClientModEvents {
		  @SubscribeEvent
		  public static void onClientSetup(FMLClientSetupEvent event) {
		  }
	 }
}