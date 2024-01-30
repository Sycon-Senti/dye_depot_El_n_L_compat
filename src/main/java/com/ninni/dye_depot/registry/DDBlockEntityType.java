package com.ninni.dye_depot.registry;

import com.ninni.dye_depot.DyeDepot;
import com.ninni.dye_depot.block.DDBannerBlockEntity;
import com.ninni.dye_depot.block.DDShulkerBoxBlockEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.ShulkerBoxBlockEntity;

public class DDBlockEntityType {

    public static final BlockEntityType<DDShulkerBoxBlockEntity> SHULKER_BOX = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            new ResourceLocation(DyeDepot.MOD_ID, "shulker_box"),
            BlockEntityType.Builder.of(DDShulkerBoxBlockEntity::new,
                    DDBlocks.MAROON_SHULKER_BOX,
                    DDBlocks.ROSE_SHULKER_BOX,
                    DDBlocks.CORAL_SHULKER_BOX,
                    DDBlocks.INDIGO_SHULKER_BOX,
                    DDBlocks.NAVY_SHULKER_BOX,
                    DDBlocks.SLATE_SHULKER_BOX,
                    DDBlocks.OLIVE_SHULKER_BOX,
                    DDBlocks.AMBER_SHULKER_BOX,
                    DDBlocks.BEIGE_SHULKER_BOX,
                    DDBlocks.TEAL_SHULKER_BOX,
                    DDBlocks.TURQUOISE_SHULKER_BOX,
                    DDBlocks.AQUA_SHULKER_BOX,
                    DDBlocks.VERDANT_SHULKER_BOX,
                    DDBlocks.FOREST_SHULKER_BOX,
                    DDBlocks.GINGER_SHULKER_BOX,
                    DDBlocks.TAN_SHULKER_BOX
            ).build(null)
    );
    
    public static final BlockEntityType<DDBannerBlockEntity> BANNER = Registry.register(
            BuiltInRegistries.BLOCK_ENTITY_TYPE,
            new ResourceLocation(DyeDepot.MOD_ID, "banner"),
            BlockEntityType.Builder.of(DDBannerBlockEntity::new,
                    DDBlocks.MAROON_BANNER,
                    DDBlocks.ROSE_BANNER,
                    DDBlocks.CORAL_BANNER,
                    DDBlocks.INDIGO_BANNER,
                    DDBlocks.NAVY_BANNER,
                    DDBlocks.SLATE_BANNER,
                    DDBlocks.OLIVE_BANNER,
                    DDBlocks.AMBER_BANNER,
                    DDBlocks.BEIGE_BANNER,
                    DDBlocks.TEAL_BANNER,
                    DDBlocks.TURQUOISE_BANNER,
                    DDBlocks.AQUA_BANNER,
                    DDBlocks.VERDANT_BANNER,
                    DDBlocks.FOREST_BANNER,
                    DDBlocks.GINGER_BANNER,
                    DDBlocks.TAN_BANNER,
                    DDBlocks.MAROON_WALL_BANNER,
                    DDBlocks.ROSE_WALL_BANNER,
                    DDBlocks.CORAL_WALL_BANNER,
                    DDBlocks.INDIGO_WALL_BANNER,
                    DDBlocks.NAVY_WALL_BANNER,
                    DDBlocks.SLATE_WALL_BANNER,
                    DDBlocks.OLIVE_WALL_BANNER,
                    DDBlocks.AMBER_WALL_BANNER,
                    DDBlocks.BEIGE_WALL_BANNER,
                    DDBlocks.TEAL_WALL_BANNER,
                    DDBlocks.TURQUOISE_WALL_BANNER,
                    DDBlocks.AQUA_WALL_BANNER,
                    DDBlocks.VERDANT_WALL_BANNER,
                    DDBlocks.FOREST_WALL_BANNER,
                    DDBlocks.GINGER_WALL_BANNER,
                    DDBlocks.TAN_WALL_BANNER
            ).build(null)
    );
}