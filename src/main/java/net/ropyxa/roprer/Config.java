package net.ropyxa.roprer;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@EventBusSubscriber(modid = RopRer.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.IntValue MIN_Y_OVERWORLD = BUILDER
            .comment("Ropyxa Recourses CONFIG\nORE CONFIG\nOVERWORLD\nminY level for ore generation in overworld(All ores have the same minY value)")
            .defineInRange("minYoverworld", -64, -64, 320);

    public static final ModConfigSpec.IntValue MAX_Y_OVERWORLD = BUILDER
            .comment("maxY level for ore generation in overworld(All ores have the same maxY value)")
            .defineInRange("maxYoverworld", 320, -64, 320);

    public static final ModConfigSpec.IntValue VEINS_PER_CHUNK_OVERWORLD = BUILDER
            .comment("Number of veins per chunk in overworld")
            .defineInRange("veinsPerChunkOverworld", 24, 1, 256);


    public static final ModConfigSpec.IntValue MIN_Y_NETHER = BUILDER
            .comment("\nNETHER\nminY level for ore generation in overworld(All ores have the same minY value)")
            .defineInRange("minYnether", -64, -64, 320);

    public static final ModConfigSpec.IntValue MAX_Y_NETHER = BUILDER
            .comment("maxY level for ore generation in overworld(All ores have the same maxY value)")
            .defineInRange("maxYnether", 80, -64, 320);

    public static final ModConfigSpec.IntValue VEINS_PER_CHUNK_NETHER = BUILDER
            .comment("Number of veins per chunk in overworld")
            .defineInRange("veinsPerChunkNether", 6, 1, 256);


    public static final ModConfigSpec.IntValue MIN_Y_END = BUILDER
            .comment("\nEND\nminY level for ore generation in overworld(All ores have the same minY value)")
            .defineInRange("minYend", -64, -64, 320);

    public static final ModConfigSpec.IntValue MAX_Y_END = BUILDER
            .comment("maxY level for ore generation in overworld(All ores have the same maxY value)")
            .defineInRange("maxYend", 80, -64, 320);

    public static final ModConfigSpec.IntValue VEINS_PER_CHUNK_END = BUILDER
            .comment("Number of veins per chunk in overworld")
            .defineInRange("veinsPerChunkEnd", 6, 1, 256);

    static final ModConfigSpec SPEC = BUILDER.build();

    private static boolean validateItemName(final Object obj)
    {
        return obj instanceof String itemName && BuiltInRegistries.ITEM.containsKey(ResourceLocation.parse(itemName));
    }

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event)
    {
    }
}