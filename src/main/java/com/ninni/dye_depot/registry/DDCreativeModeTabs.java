package com.ninni.dye_depot.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;

import static com.ninni.dye_depot.registry.DDItems.*;
import static net.minecraft.world.item.Items.*;

public class DDCreativeModeTabs {
    static {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> {

            entries.addBefore(RED_DYE, SCARLET_DYE, ROSE_DYE);
            entries.addAfter(RED_DYE, CORAL_DYE);
            entries.addBefore(ORANGE_DYE, GINGER_DYE);
            entries.addAfter(ORANGE_DYE, TAN_DYE);
            entries.addBefore(YELLOW_DYE, BEIGE_DYE);
            entries.addAfter(YELLOW_DYE, GOLDEN_DYE, OLIVE_DYE);
            entries.addBefore(GREEN_DYE, FOREST_DYE);
            entries.addAfter(GREEN_DYE, VERDANT_DYE);
            entries.addBefore(RED_DYE, SCARLET_DYE, ROSE_DYE);
            entries.addAfter(RED_DYE, CORAL_DYE);
            entries.addBefore(CYAN_DYE, TEAL_DYE);
            entries.addAfter(CYAN_DYE, TURQUOISE_DYE, AQUA_DYE);
            entries.addAfter(BLUE_DYE, SLATE_DYE, PHTHALO_DYE);
            entries.addBefore(PURPLE_DYE, ROYAL_DYE);
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(entries -> {

            entries.addBefore(WHITE_WOOL,
                    WHITE_DYE_BASKET,
                    LIGHT_GRAY_DYE_BASKET,
                    GRAY_DYE_BASKET,
                    BLACK_DYE_BASKET,
                    BROWN_DYE_BASKET,
                    SCARLET_DYE_BASKET,
                    ROSE_DYE_BASKET,
                    RED_DYE_BASKET,
                    CORAL_DYE_BASKET,
                    GINGER_DYE_BASKET,
                    ORANGE_DYE_BASKET,
                    TAN_DYE_BASKET,
                    BEIGE_DYE_BASKET,
                    YELLOW_DYE_BASKET,
                    GOLDEN_DYE_BASKET,
                    OLIVE_DYE_BASKET,
                    LIME_DYE_BASKET,
                    FOREST_DYE_BASKET,
                    GREEN_DYE_BASKET,
                    VERDANT_DYE_BASKET,
                    TEAL_DYE_BASKET,
                    CYAN_DYE_BASKET,
                    TURQUOISE_DYE_BASKET,
                    AQUA_DYE_BASKET,
                    LIGHT_BLUE_DYE_BASKET,
                    BLUE_DYE_BASKET,
                    SLATE_DYE_BASKET,
                    PHTHALO_DYE_BASKET,
                    ROYAL_DYE_BASKET,
                    PURPLE_DYE_BASKET,
                    MAGENTA_DYE_BASKET,
                    PINK_DYE_BASKET
            );

            entries.addBefore(RED_WOOL, SCARLET_WOOL, ROSE_WOOL);
            entries.addAfter(RED_WOOL, CORAL_WOOL);
            entries.addBefore(ORANGE_WOOL, GINGER_WOOL);
            entries.addAfter(ORANGE_WOOL, TAN_WOOL);
            entries.addBefore(YELLOW_WOOL, BEIGE_WOOL);
            entries.addAfter(YELLOW_WOOL, GOLDEN_WOOL, OLIVE_WOOL);
            entries.addBefore(GREEN_WOOL, FOREST_WOOL);
            entries.addAfter(GREEN_WOOL, VERDANT_WOOL);
            entries.addBefore(RED_WOOL, SCARLET_WOOL, ROSE_WOOL);
            entries.addAfter(RED_WOOL, CORAL_WOOL);
            entries.addBefore(CYAN_WOOL, TEAL_WOOL);
            entries.addAfter(CYAN_WOOL, TURQUOISE_WOOL, AQUA_WOOL);
            entries.addAfter(BLUE_WOOL, SLATE_WOOL, PHTHALO_WOOL);
            entries.addBefore(PURPLE_WOOL, ROYAL_WOOL);

            entries.addBefore(RED_CARPET, SCARLET_CARPET, ROSE_CARPET);
            entries.addAfter(RED_CARPET, CORAL_CARPET);
            entries.addBefore(ORANGE_CARPET, GINGER_CARPET);
            entries.addAfter(ORANGE_CARPET, TAN_CARPET);
            entries.addBefore(YELLOW_CARPET, BEIGE_CARPET);
            entries.addAfter(YELLOW_CARPET, GOLDEN_CARPET, OLIVE_CARPET);
            entries.addBefore(GREEN_CARPET, FOREST_CARPET);
            entries.addAfter(GREEN_CARPET, VERDANT_CARPET);
            entries.addBefore(RED_CARPET, SCARLET_CARPET, ROSE_CARPET);
            entries.addAfter(RED_CARPET, CORAL_CARPET);
            entries.addBefore(CYAN_CARPET, TEAL_CARPET);
            entries.addAfter(CYAN_CARPET, TURQUOISE_CARPET, AQUA_CARPET);
            entries.addAfter(BLUE_CARPET, SLATE_CARPET, PHTHALO_CARPET);
            entries.addBefore(PURPLE_CARPET, ROYAL_CARPET);

            entries.addBefore(RED_TERRACOTTA, SCARLET_TERRACOTTA, ROSE_TERRACOTTA);
            entries.addAfter(RED_TERRACOTTA, CORAL_TERRACOTTA);
            entries.addBefore(ORANGE_TERRACOTTA, GINGER_TERRACOTTA);
            entries.addAfter(ORANGE_TERRACOTTA, TAN_TERRACOTTA);
            entries.addBefore(YELLOW_TERRACOTTA, BEIGE_TERRACOTTA);
            entries.addAfter(YELLOW_TERRACOTTA, GOLDEN_TERRACOTTA, OLIVE_TERRACOTTA);
            entries.addBefore(GREEN_TERRACOTTA, FOREST_TERRACOTTA);
            entries.addAfter(GREEN_TERRACOTTA, VERDANT_TERRACOTTA);
            entries.addBefore(RED_TERRACOTTA, SCARLET_TERRACOTTA, ROSE_TERRACOTTA);
            entries.addAfter(RED_TERRACOTTA, CORAL_TERRACOTTA);
            entries.addBefore(CYAN_TERRACOTTA, TEAL_TERRACOTTA);
            entries.addAfter(CYAN_TERRACOTTA, TURQUOISE_TERRACOTTA, AQUA_TERRACOTTA);
            entries.addAfter(BLUE_TERRACOTTA, SLATE_TERRACOTTA, PHTHALO_TERRACOTTA);
            entries.addBefore(PURPLE_TERRACOTTA, ROYAL_TERRACOTTA);

            entries.addBefore(RED_CONCRETE, SCARLET_CONCRETE, ROSE_CONCRETE);
            entries.addAfter(RED_CONCRETE, CORAL_CONCRETE);
            entries.addBefore(ORANGE_CONCRETE, GINGER_CONCRETE);
            entries.addAfter(ORANGE_CONCRETE, TAN_CONCRETE);
            entries.addBefore(YELLOW_CONCRETE, BEIGE_CONCRETE);
            entries.addAfter(YELLOW_CONCRETE, GOLDEN_CONCRETE, OLIVE_CONCRETE);
            entries.addBefore(GREEN_CONCRETE, FOREST_CONCRETE);
            entries.addAfter(GREEN_CONCRETE, VERDANT_CONCRETE);
            entries.addBefore(RED_CONCRETE, SCARLET_CONCRETE, ROSE_CONCRETE);
            entries.addAfter(RED_CONCRETE, CORAL_CONCRETE);
            entries.addBefore(CYAN_CONCRETE, TEAL_CONCRETE);
            entries.addAfter(CYAN_CONCRETE, TURQUOISE_CONCRETE, AQUA_CONCRETE);
            entries.addAfter(BLUE_CONCRETE, SLATE_CONCRETE, PHTHALO_CONCRETE);
            entries.addBefore(PURPLE_CONCRETE, ROYAL_CONCRETE);

            entries.addBefore(RED_CONCRETE_POWDER, SCARLET_CONCRETE_POWDER, ROSE_CONCRETE_POWDER);
            entries.addAfter(RED_CONCRETE_POWDER, CORAL_CONCRETE_POWDER);
            entries.addBefore(ORANGE_CONCRETE_POWDER, GINGER_CONCRETE_POWDER);
            entries.addAfter(ORANGE_CONCRETE_POWDER, TAN_CONCRETE_POWDER);
            entries.addBefore(YELLOW_CONCRETE_POWDER, BEIGE_CONCRETE_POWDER);
            entries.addAfter(YELLOW_CONCRETE_POWDER, GOLDEN_CONCRETE_POWDER, OLIVE_CONCRETE_POWDER);
            entries.addBefore(GREEN_CONCRETE_POWDER, FOREST_CONCRETE_POWDER);
            entries.addAfter(GREEN_CONCRETE_POWDER, VERDANT_CONCRETE_POWDER);
            entries.addBefore(RED_CONCRETE_POWDER, SCARLET_CONCRETE_POWDER, ROSE_CONCRETE_POWDER);
            entries.addAfter(RED_CONCRETE_POWDER, CORAL_CONCRETE_POWDER);
            entries.addBefore(CYAN_CONCRETE_POWDER, TEAL_CONCRETE_POWDER);
            entries.addAfter(CYAN_CONCRETE_POWDER, TURQUOISE_CONCRETE_POWDER, AQUA_CONCRETE_POWDER);
            entries.addAfter(BLUE_CONCRETE_POWDER, SLATE_CONCRETE_POWDER, PHTHALO_CONCRETE_POWDER);
            entries.addBefore(PURPLE_CONCRETE_POWDER, ROYAL_CONCRETE_POWDER);

            entries.addBefore(RED_GLAZED_TERRACOTTA, SCARLET_GLAZED_TERRACOTTA, ROSE_GLAZED_TERRACOTTA);
            entries.addAfter(RED_GLAZED_TERRACOTTA, CORAL_GLAZED_TERRACOTTA);
            entries.addBefore(ORANGE_GLAZED_TERRACOTTA, GINGER_GLAZED_TERRACOTTA);
            entries.addAfter(ORANGE_GLAZED_TERRACOTTA, TAN_GLAZED_TERRACOTTA);
            entries.addBefore(YELLOW_GLAZED_TERRACOTTA, BEIGE_GLAZED_TERRACOTTA);
            entries.addAfter(YELLOW_GLAZED_TERRACOTTA, GOLDEN_GLAZED_TERRACOTTA, OLIVE_GLAZED_TERRACOTTA);
            entries.addBefore(GREEN_GLAZED_TERRACOTTA, FOREST_GLAZED_TERRACOTTA);
            entries.addAfter(GREEN_GLAZED_TERRACOTTA, VERDANT_GLAZED_TERRACOTTA);
            entries.addBefore(RED_GLAZED_TERRACOTTA, SCARLET_GLAZED_TERRACOTTA, ROSE_GLAZED_TERRACOTTA);
            entries.addAfter(RED_GLAZED_TERRACOTTA, CORAL_GLAZED_TERRACOTTA);
            entries.addBefore(CYAN_GLAZED_TERRACOTTA, TEAL_GLAZED_TERRACOTTA);
            entries.addAfter(CYAN_GLAZED_TERRACOTTA, TURQUOISE_GLAZED_TERRACOTTA, AQUA_GLAZED_TERRACOTTA);
            entries.addAfter(BLUE_GLAZED_TERRACOTTA, SLATE_GLAZED_TERRACOTTA, PHTHALO_GLAZED_TERRACOTTA);
            entries.addBefore(PURPLE_GLAZED_TERRACOTTA, ROYAL_GLAZED_TERRACOTTA);

            entries.addBefore(RED_STAINED_GLASS, SCARLET_STAINED_GLASS, ROSE_STAINED_GLASS);
            entries.addAfter(RED_STAINED_GLASS, CORAL_STAINED_GLASS);
            entries.addBefore(ORANGE_STAINED_GLASS, GINGER_STAINED_GLASS);
            entries.addAfter(ORANGE_STAINED_GLASS, TAN_STAINED_GLASS);
            entries.addBefore(YELLOW_STAINED_GLASS, BEIGE_STAINED_GLASS);
            entries.addAfter(YELLOW_STAINED_GLASS, GOLDEN_STAINED_GLASS, OLIVE_STAINED_GLASS);
            entries.addBefore(GREEN_STAINED_GLASS, FOREST_STAINED_GLASS);
            entries.addAfter(GREEN_STAINED_GLASS, VERDANT_STAINED_GLASS);
            entries.addBefore(RED_STAINED_GLASS, SCARLET_STAINED_GLASS, ROSE_STAINED_GLASS);
            entries.addAfter(RED_STAINED_GLASS, CORAL_STAINED_GLASS);
            entries.addBefore(CYAN_STAINED_GLASS, TEAL_STAINED_GLASS);
            entries.addAfter(CYAN_STAINED_GLASS, TURQUOISE_STAINED_GLASS, AQUA_STAINED_GLASS);
            entries.addAfter(BLUE_STAINED_GLASS, SLATE_STAINED_GLASS, PHTHALO_STAINED_GLASS);
            entries.addBefore(PURPLE_STAINED_GLASS, ROYAL_STAINED_GLASS);

            entries.addBefore(RED_STAINED_GLASS_PANE, SCARLET_STAINED_GLASS_PANE, ROSE_STAINED_GLASS_PANE);
            entries.addAfter(RED_STAINED_GLASS_PANE, CORAL_STAINED_GLASS_PANE);
            entries.addBefore(ORANGE_STAINED_GLASS_PANE, GINGER_STAINED_GLASS_PANE);
            entries.addAfter(ORANGE_STAINED_GLASS_PANE, TAN_STAINED_GLASS_PANE);
            entries.addBefore(YELLOW_STAINED_GLASS_PANE, BEIGE_STAINED_GLASS_PANE);
            entries.addAfter(YELLOW_STAINED_GLASS_PANE, GOLDEN_STAINED_GLASS_PANE, OLIVE_STAINED_GLASS_PANE);
            entries.addBefore(GREEN_STAINED_GLASS_PANE, FOREST_STAINED_GLASS_PANE);
            entries.addAfter(GREEN_STAINED_GLASS_PANE, VERDANT_STAINED_GLASS_PANE);
            entries.addBefore(RED_STAINED_GLASS_PANE, SCARLET_STAINED_GLASS_PANE, ROSE_STAINED_GLASS_PANE);
            entries.addAfter(RED_STAINED_GLASS_PANE, CORAL_STAINED_GLASS_PANE);
            entries.addBefore(CYAN_STAINED_GLASS_PANE, TEAL_STAINED_GLASS_PANE);
            entries.addAfter(CYAN_STAINED_GLASS_PANE, TURQUOISE_STAINED_GLASS_PANE, AQUA_STAINED_GLASS_PANE);
            entries.addAfter(BLUE_STAINED_GLASS_PANE, SLATE_STAINED_GLASS_PANE, PHTHALO_STAINED_GLASS_PANE);
            entries.addBefore(PURPLE_STAINED_GLASS_PANE, ROYAL_STAINED_GLASS_PANE);

            entries.addBefore(RED_SHULKER_BOX, SCARLET_SHULKER_BOX, ROSE_SHULKER_BOX);
            entries.addAfter(RED_SHULKER_BOX, CORAL_SHULKER_BOX);
            entries.addBefore(ORANGE_SHULKER_BOX, GINGER_SHULKER_BOX);
            entries.addAfter(ORANGE_SHULKER_BOX, TAN_SHULKER_BOX);
            entries.addBefore(YELLOW_SHULKER_BOX, BEIGE_SHULKER_BOX);
            entries.addAfter(YELLOW_SHULKER_BOX, GOLDEN_SHULKER_BOX, OLIVE_SHULKER_BOX);
            entries.addBefore(GREEN_SHULKER_BOX, FOREST_SHULKER_BOX);
            entries.addAfter(GREEN_SHULKER_BOX, VERDANT_SHULKER_BOX);
            entries.addBefore(RED_SHULKER_BOX, SCARLET_SHULKER_BOX, ROSE_SHULKER_BOX);
            entries.addAfter(RED_SHULKER_BOX, CORAL_SHULKER_BOX);
            entries.addBefore(CYAN_SHULKER_BOX, TEAL_SHULKER_BOX);
            entries.addAfter(CYAN_SHULKER_BOX, TURQUOISE_SHULKER_BOX, AQUA_SHULKER_BOX);
            entries.addAfter(BLUE_SHULKER_BOX, SLATE_SHULKER_BOX, PHTHALO_SHULKER_BOX);
            entries.addBefore(PURPLE_SHULKER_BOX, ROYAL_SHULKER_BOX);

            entries.addBefore(RED_BED, SCARLET_BED, ROSE_BED);
            entries.addAfter(RED_BED, CORAL_BED);
            entries.addBefore(ORANGE_BED, GINGER_BED);
            entries.addAfter(ORANGE_BED, TAN_BED);
            entries.addBefore(YELLOW_BED, BEIGE_BED);
            entries.addAfter(YELLOW_BED, GOLDEN_BED, OLIVE_BED);
            entries.addBefore(GREEN_BED, FOREST_BED);
            entries.addAfter(GREEN_BED, VERDANT_BED);
            entries.addBefore(RED_BED, SCARLET_BED, ROSE_BED);
            entries.addAfter(RED_BED, CORAL_BED);
            entries.addBefore(CYAN_BED, TEAL_BED);
            entries.addAfter(CYAN_BED, TURQUOISE_BED, AQUA_BED);
            entries.addAfter(BLUE_BED, SLATE_BED, PHTHALO_BED);
            entries.addBefore(PURPLE_BED, ROYAL_BED);

            entries.addBefore(RED_CANDLE, SCARLET_CANDLE, ROSE_CANDLE);
            entries.addAfter(RED_CANDLE, CORAL_CANDLE);
            entries.addBefore(ORANGE_CANDLE, GINGER_CANDLE);
            entries.addAfter(ORANGE_CANDLE, TAN_CANDLE);
            entries.addBefore(YELLOW_CANDLE, BEIGE_CANDLE);
            entries.addAfter(YELLOW_CANDLE, GOLDEN_CANDLE, OLIVE_CANDLE);
            entries.addBefore(GREEN_CANDLE, FOREST_CANDLE);
            entries.addAfter(GREEN_CANDLE, VERDANT_CANDLE);
            entries.addBefore(RED_CANDLE, SCARLET_CANDLE, ROSE_CANDLE);
            entries.addAfter(RED_CANDLE, CORAL_CANDLE);
            entries.addBefore(CYAN_CANDLE, TEAL_CANDLE);
            entries.addAfter(CYAN_CANDLE, TURQUOISE_CANDLE, AQUA_CANDLE);
            entries.addAfter(BLUE_CANDLE, SLATE_CANDLE, PHTHALO_CANDLE);
            entries.addBefore(PURPLE_CANDLE, ROYAL_CANDLE);

            entries.addBefore(RED_BANNER, SCARLET_BANNER, ROSE_BANNER);
            entries.addAfter(RED_BANNER, CORAL_BANNER);
            entries.addBefore(ORANGE_BANNER, GINGER_BANNER);
            entries.addAfter(ORANGE_BANNER, TAN_BANNER);
            entries.addBefore(YELLOW_BANNER, BEIGE_BANNER);
            entries.addAfter(YELLOW_BANNER, GOLDEN_BANNER, OLIVE_BANNER);
            entries.addBefore(GREEN_BANNER, FOREST_BANNER);
            entries.addAfter(GREEN_BANNER, VERDANT_BANNER);
            entries.addBefore(RED_BANNER, SCARLET_BANNER, ROSE_BANNER);
            entries.addAfter(RED_BANNER, CORAL_BANNER);
            entries.addBefore(CYAN_BANNER, TEAL_BANNER);
            entries.addAfter(CYAN_BANNER, TURQUOISE_BANNER, AQUA_BANNER);
            entries.addAfter(BLUE_BANNER, SLATE_BANNER, PHTHALO_BANNER);
            entries.addBefore(PURPLE_BANNER, ROYAL_BANNER);
        });


        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> {

            entries.addBefore(RED_SHULKER_BOX, SCARLET_SHULKER_BOX, ROSE_SHULKER_BOX);
            entries.addAfter(RED_SHULKER_BOX, CORAL_SHULKER_BOX);
            entries.addBefore(ORANGE_SHULKER_BOX, GINGER_SHULKER_BOX);
            entries.addAfter(ORANGE_SHULKER_BOX, TAN_SHULKER_BOX);
            entries.addBefore(YELLOW_SHULKER_BOX, BEIGE_SHULKER_BOX);
            entries.addAfter(YELLOW_SHULKER_BOX, GOLDEN_SHULKER_BOX, OLIVE_SHULKER_BOX);
            entries.addBefore(GREEN_SHULKER_BOX, FOREST_SHULKER_BOX);
            entries.addAfter(GREEN_SHULKER_BOX, VERDANT_SHULKER_BOX);
            entries.addBefore(RED_SHULKER_BOX, SCARLET_SHULKER_BOX, ROSE_SHULKER_BOX);
            entries.addAfter(RED_SHULKER_BOX, CORAL_SHULKER_BOX);
            entries.addBefore(CYAN_SHULKER_BOX, TEAL_SHULKER_BOX);
            entries.addAfter(CYAN_SHULKER_BOX, TURQUOISE_SHULKER_BOX, AQUA_SHULKER_BOX);
            entries.addAfter(BLUE_SHULKER_BOX, SLATE_SHULKER_BOX, PHTHALO_SHULKER_BOX);
            entries.addBefore(PURPLE_SHULKER_BOX, ROYAL_SHULKER_BOX);

            entries.addBefore(RED_BED, SCARLET_BED, ROSE_BED);
            entries.addAfter(RED_BED, CORAL_BED);
            entries.addBefore(ORANGE_BED, GINGER_BED);
            entries.addAfter(ORANGE_BED, TAN_BED);
            entries.addBefore(YELLOW_BED, BEIGE_BED);
            entries.addAfter(YELLOW_BED, GOLDEN_BED, OLIVE_BED);
            entries.addBefore(GREEN_BED, FOREST_BED);
            entries.addAfter(GREEN_BED, VERDANT_BED);
            entries.addBefore(RED_BED, SCARLET_BED, ROSE_BED);
            entries.addAfter(RED_BED, CORAL_BED);
            entries.addBefore(CYAN_BED, TEAL_BED);
            entries.addAfter(CYAN_BED, TURQUOISE_BED, AQUA_BED);
            entries.addAfter(BLUE_BED, SLATE_BED, PHTHALO_BED);
            entries.addBefore(PURPLE_BED, ROYAL_BED);

            entries.addBefore(RED_CANDLE, SCARLET_CANDLE, ROSE_CANDLE);
            entries.addAfter(RED_CANDLE, CORAL_CANDLE);
            entries.addBefore(ORANGE_CANDLE, GINGER_CANDLE);
            entries.addAfter(ORANGE_CANDLE, TAN_CANDLE);
            entries.addBefore(YELLOW_CANDLE, BEIGE_CANDLE);
            entries.addAfter(YELLOW_CANDLE, GOLDEN_CANDLE, OLIVE_CANDLE);
            entries.addBefore(GREEN_CANDLE, FOREST_CANDLE);
            entries.addAfter(GREEN_CANDLE, VERDANT_CANDLE);
            entries.addBefore(RED_CANDLE, SCARLET_CANDLE, ROSE_CANDLE);
            entries.addAfter(RED_CANDLE, CORAL_CANDLE);
            entries.addBefore(CYAN_CANDLE, TEAL_CANDLE);
            entries.addAfter(CYAN_CANDLE, TURQUOISE_CANDLE, AQUA_CANDLE);
            entries.addAfter(BLUE_CANDLE, SLATE_CANDLE, PHTHALO_CANDLE);
            entries.addBefore(PURPLE_CANDLE, ROYAL_CANDLE);

            entries.addBefore(RED_BANNER, SCARLET_BANNER, ROSE_BANNER);
            entries.addAfter(RED_BANNER, CORAL_BANNER);
            entries.addBefore(ORANGE_BANNER, GINGER_BANNER);
            entries.addAfter(ORANGE_BANNER, TAN_BANNER);
            entries.addBefore(YELLOW_BANNER, BEIGE_BANNER);
            entries.addAfter(YELLOW_BANNER, GOLDEN_BANNER, OLIVE_BANNER);
            entries.addBefore(GREEN_BANNER, FOREST_BANNER);
            entries.addAfter(GREEN_BANNER, VERDANT_BANNER);
            entries.addBefore(RED_BANNER, SCARLET_BANNER, ROSE_BANNER);
            entries.addAfter(RED_BANNER, CORAL_BANNER);
            entries.addBefore(CYAN_BANNER, TEAL_BANNER);
            entries.addAfter(CYAN_BANNER, TURQUOISE_BANNER, AQUA_BANNER);
            entries.addAfter(BLUE_BANNER, SLATE_BANNER, PHTHALO_BANNER);
            entries.addBefore(PURPLE_BANNER, ROYAL_BANNER);
        });
    }
}
