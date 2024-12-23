package com.ninni.dye_depot.registry;

import com.google.common.collect.ImmutableMap;
import com.ninni.dye_depot.DyeDepot;
import com.ninni.dye_depot.client.particles.PoofParticle;
import com.ninni.dye_depot.client.renderer.DDBannerRenderer;
import com.ninni.dye_depot.client.renderer.DDBedRenderer;
import com.ninni.dye_depot.client.renderer.DDShulkerBoxRenderer;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.entries.LootItem;

public class DDVanillaIntegration {

    public static void serverInit() {
        addResourcePacks();
        registerLootTableAdditions();
        registerVillagerTrades();
    }

    //server methods
    public static void addResourcePacks() {
        ModContainer modContainer = FabricLoader.getInstance().getModContainer(DyeDepot.MOD_ID).orElseThrow(() -> new IllegalStateException("Dye Depot's ModContainer couldn't be found!"));
        ResourceManagerHelper.registerBuiltinResourcePack(new ResourceLocation(DyeDepot.MOD_ID, "dye_override"), modContainer, "Dye Override", ResourcePackActivationType.DEFAULT_ENABLED);
    }

    private static void registerLootTableAdditions() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if (id.equals(BuiltInLootTables.SHEPHERD_GIFT)) tableBuilder.modifyPools(builder -> builder.add(LootItem.lootTableItem(DDItems.SCARLET_WOOL)).add(LootItem.lootTableItem(DDItems.ROSE_WOOL)).add(LootItem.lootTableItem(DDItems.CORAL_WOOL)).add(LootItem.lootTableItem(DDItems.ROYAL_WOOL)).add(LootItem.lootTableItem(DDItems.PHTHALO_WOOL)).add(LootItem.lootTableItem(DDItems.SLATE_WOOL)).add(LootItem.lootTableItem(DDItems.OLIVE_WOOL)).add(LootItem.lootTableItem(DDItems.GOLDEN_WOOL)).add(LootItem.lootTableItem(DDItems.BEIGE_WOOL)).add(LootItem.lootTableItem(DDItems.TEAL_WOOL)).add(LootItem.lootTableItem(DDItems.TURQUOISE_WOOL)).add(LootItem.lootTableItem(DDItems.AQUA_WOOL)).add(LootItem.lootTableItem(DDItems.VERDANT_WOOL)).add(LootItem.lootTableItem(DDItems.FOREST_WOOL)).add(LootItem.lootTableItem(DDItems.GINGER_WOOL)).add(LootItem.lootTableItem(DDItems.TAN_WOOL)));
            if (id.equals(BuiltInLootTables.DESERT_PYRAMID_ARCHAEOLOGY)) tableBuilder.modifyPools(builder -> builder.add(LootItem.lootTableItem(DDItems.BEIGE_DYE).setWeight(2)));
            if (id.equals(BuiltInLootTables.OCEAN_RUIN_COLD_ARCHAEOLOGY)) tableBuilder.modifyPools(builder -> builder.add(LootItem.lootTableItem(DDItems.VERDANT_DYE).setWeight(3)));
        });
    }

    private static void registerVillagerTrades() {

        //Cartographer additions
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.SCARLET_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.ROSE_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.CORAL_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.ROYAL_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.PHTHALO_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.SLATE_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.OLIVE_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.GOLDEN_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.BEIGE_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.TEAL_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.TURQUOISE_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.AQUA_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.VERDANT_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.FOREST_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.GINGER_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.TAN_BANNER), 12, 15, 0.05f)));

        //Mason additions
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.SCARLET_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.ROSE_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.CORAL_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.ROYAL_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.PHTHALO_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.SLATE_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.OLIVE_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.GOLDEN_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.BEIGE_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.TEAL_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.TURQUOISE_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.AQUA_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.VERDANT_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.FOREST_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.GINGER_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.TAN_TERRACOTTA), 12, 15, 0.05f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.SCARLET_GLAZED_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.ROSE_GLAZED_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.CORAL_GLAZED_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.ROYAL_GLAZED_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.PHTHALO_GLAZED_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.SLATE_GLAZED_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.OLIVE_GLAZED_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.GOLDEN_GLAZED_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.BEIGE_GLAZED_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.TEAL_GLAZED_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.TURQUOISE_GLAZED_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.AQUA_GLAZED_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.VERDANT_GLAZED_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.FOREST_GLAZED_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.GINGER_GLAZED_TERRACOTTA), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.TAN_GLAZED_TERRACOTTA), 12, 15, 0.05f)));

        //Shepherd additions
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(DDItems.TAN_DYE, 12), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 16, 30, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(DDItems.AQUA_DYE, 12), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 16, 30, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(DDItems.CORAL_DYE, 12), ItemStack.EMPTY, new ItemStack(Items.EMERALD),16, 30, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(DDItems.BEIGE_DYE, 12), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 16, 30, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(DDItems.GOLDEN_DYE, 12), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 16, 30, 0.05f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.SCARLET_WOOL), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.ROSE_WOOL), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.CORAL_WOOL),16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.ROYAL_WOOL), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.PHTHALO_WOOL), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.SLATE_WOOL),16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.OLIVE_WOOL),16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.GOLDEN_WOOL),16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.BEIGE_WOOL),16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.TEAL_WOOL), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.TURQUOISE_WOOL), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.AQUA_WOOL), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.VERDANT_WOOL),16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.FOREST_WOOL), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.GINGER_WOOL), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.TAN_WOOL), 16, 5, 0.05f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.SCARLET_CARPET, 4), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.ROSE_CARPET, 4), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.CORAL_CARPET, 4), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.ROYAL_CARPET, 4), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.PHTHALO_CARPET, 4), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.SLATE_CARPET, 4), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.OLIVE_CARPET, 4), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.GOLDEN_CARPET, 4), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.BEIGE_CARPET, 4), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.TEAL_CARPET, 4), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.TURQUOISE_CARPET, 4), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.AQUA_CARPET, 4), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.VERDANT_CARPET, 4), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.FOREST_CARPET, 4), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.GINGER_CARPET, 4), 16, 5, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 2, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.TAN_CARPET, 4), 16, 5, 0.05f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(DDItems.ROSE_DYE, 12), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 16, 30, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(DDItems.SLATE_DYE, 12), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 16, 30, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(DDItems.TURQUOISE_DYE, 12), ItemStack.EMPTY, new ItemStack(Items.EMERALD),16, 30, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(DDItems.FOREST_DYE, 12), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 16, 30, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(DDItems.GINGER_DYE, 12), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 16, 30, 0.05f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.SCARLET_BED), 12, 10, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.ROSE_BED), 12, 10, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.CORAL_BED), 12, 10, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.ROYAL_BED), 12, 10, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.PHTHALO_BED), 12, 10, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.SLATE_BED), 12, 10, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.OLIVE_BED), 12, 10, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.GOLDEN_BED), 12, 10, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.BEIGE_BED), 12, 10, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.TEAL_BED), 12, 10, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.TURQUOISE_BED), 12, 10, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.AQUA_BED), 12, 10, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.VERDANT_BED), 12, 10, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.FOREST_BED), 12, 10, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.GINGER_BED), 12, 10, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 3, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.TAN_BED), 12, 10, 0.05f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(DDItems.SCARLET_DYE, 12), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 16, 30, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(DDItems.ROYAL_DYE, 12), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 16, 30, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(DDItems.TEAL_DYE, 12), ItemStack.EMPTY, new ItemStack(Items.EMERALD),16, 30, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(DDItems.VERDANT_DYE, 12), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 16, 30, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(DDItems.PHTHALO_DYE, 12), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 16, 30, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(DDItems.OLIVE_DYE, 12), ItemStack.EMPTY, new ItemStack(Items.EMERALD), 16, 30, 0.05f)));

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.SCARLET_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.ROSE_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.CORAL_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.ROYAL_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.PHTHALO_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.SLATE_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.OLIVE_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.GOLDEN_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.BEIGE_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.TEAL_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.TURQUOISE_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.AQUA_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.VERDANT_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.FOREST_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.GINGER_BANNER), 12, 15, 0.05f)));
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 4, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 3), ItemStack.EMPTY, new ItemStack(DDItems.TAN_BANNER), 12, 15, 0.05f)));

        //Wandering Trader additions
        TradeOfferHelper.registerWanderingTraderOffers( 1, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.SCARLET_DYE, 3), 12, 1, 0.05f)));
        TradeOfferHelper.registerWanderingTraderOffers( 1, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.ROSE_DYE, 3), 12, 1, 0.05f)));
        TradeOfferHelper.registerWanderingTraderOffers( 1, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.CORAL_DYE, 3), 12, 1, 0.05f)));
        TradeOfferHelper.registerWanderingTraderOffers( 1, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.ROYAL_DYE, 3), 12, 1, 0.05f)));
        TradeOfferHelper.registerWanderingTraderOffers( 1, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.PHTHALO_DYE, 3), 12, 1, 0.05f)));
        TradeOfferHelper.registerWanderingTraderOffers( 1, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.SLATE_DYE, 3), 12, 1, 0.05f)));
        TradeOfferHelper.registerWanderingTraderOffers( 1, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.OLIVE_DYE, 3), 12, 1, 0.05f)));
        TradeOfferHelper.registerWanderingTraderOffers( 1, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.GOLDEN_DYE, 3), 12, 1, 0.05f)));
        TradeOfferHelper.registerWanderingTraderOffers( 1, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.BEIGE_DYE, 3), 12, 1, 0.05f)));
        TradeOfferHelper.registerWanderingTraderOffers( 1, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.TEAL_DYE, 3), 12, 1, 0.05f)));
        TradeOfferHelper.registerWanderingTraderOffers( 1, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.TURQUOISE_DYE, 3), 12, 1, 0.05f)));
        TradeOfferHelper.registerWanderingTraderOffers( 1, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.AQUA_DYE, 3), 12, 1, 0.05f)));
        TradeOfferHelper.registerWanderingTraderOffers( 1, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.VERDANT_DYE, 3), 12, 1, 0.05f)));
        TradeOfferHelper.registerWanderingTraderOffers( 1, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.FOREST_DYE, 3), 12, 1, 0.05f)));
        TradeOfferHelper.registerWanderingTraderOffers( 1, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.GINGER_DYE, 3), 12, 1, 0.05f)));
        TradeOfferHelper.registerWanderingTraderOffers( 1, factories -> factories.add((entity, randomSource) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), ItemStack.EMPTY, new ItemStack(DDItems.TAN_DYE, 3), 12, 1, 0.05f)));
    }

    private static Int2ObjectMap<VillagerTrades.ItemListing[]> toIntMap(ImmutableMap<Integer, VillagerTrades.ItemListing[]> immutableMap) {
        return new Int2ObjectOpenHashMap<>(immutableMap);
    }

    @Environment(EnvType.CLIENT)
    public static class Client {

        public static void clientInit() {
            registerModelLayers();
            registerBlockRenderLayers();
            registerParticles();
        }

        //client methods
        private static void registerModelLayers() {
            BlockEntityRendererRegistry.INSTANCE.register(DDBlockEntityType.SHULKER_BOX, DDShulkerBoxRenderer::new);
            BlockEntityRendererRegistry.INSTANCE.register(DDBlockEntityType.BED, DDBedRenderer::new);
            BlockEntityRendererRegistry.INSTANCE.register(DDBlockEntityType.BANNER, DDBannerRenderer::new);
        }

        private static void registerParticles() {
            ParticleFactoryRegistry.getInstance().register(DDParticles.DYE_POOF, PoofParticle.Provider::new);
        }

        private static void registerBlockRenderLayers() {
            BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.translucent(),
                    DDBlocks.SCARLET_STAINED_GLASS,
                    DDBlocks.ROSE_STAINED_GLASS,
                    DDBlocks.CORAL_STAINED_GLASS,
                    DDBlocks.ROYAL_STAINED_GLASS,
                    DDBlocks.PHTHALO_STAINED_GLASS,
                    DDBlocks.SLATE_STAINED_GLASS,
                    DDBlocks.OLIVE_STAINED_GLASS,
                    DDBlocks.GOLDEN_STAINED_GLASS,
                    DDBlocks.BEIGE_STAINED_GLASS,
                    DDBlocks.TEAL_STAINED_GLASS,
                    DDBlocks.TURQUOISE_STAINED_GLASS,
                    DDBlocks.AQUA_STAINED_GLASS,
                    DDBlocks.VERDANT_STAINED_GLASS,
                    DDBlocks.FOREST_STAINED_GLASS,
                    DDBlocks.GINGER_STAINED_GLASS,
                    DDBlocks.TAN_STAINED_GLASS,
                    DDBlocks.SCARLET_STAINED_GLASS_PANE,
                    DDBlocks.ROSE_STAINED_GLASS_PANE,
                    DDBlocks.CORAL_STAINED_GLASS_PANE,
                    DDBlocks.ROYAL_STAINED_GLASS_PANE,
                    DDBlocks.PHTHALO_STAINED_GLASS_PANE,
                    DDBlocks.SLATE_STAINED_GLASS_PANE,
                    DDBlocks.OLIVE_STAINED_GLASS_PANE,
                    DDBlocks.GOLDEN_STAINED_GLASS_PANE,
                    DDBlocks.BEIGE_STAINED_GLASS_PANE,
                    DDBlocks.TEAL_STAINED_GLASS_PANE,
                    DDBlocks.TURQUOISE_STAINED_GLASS_PANE,
                    DDBlocks.AQUA_STAINED_GLASS_PANE,
                    DDBlocks.VERDANT_STAINED_GLASS_PANE,
                    DDBlocks.FOREST_STAINED_GLASS_PANE,
                    DDBlocks.GINGER_STAINED_GLASS_PANE,
                    DDBlocks.TAN_STAINED_GLASS_PANE
            );
        }
    }
}
