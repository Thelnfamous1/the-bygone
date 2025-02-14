package com.jamiedev.bygone.client;

import com.jamiedev.bygone.Bygone;
import com.jamiedev.bygone.PlayerWithHook;
import com.jamiedev.bygone.client.models.*;
import com.jamiedev.bygone.client.renderer.*;
import com.jamiedev.bygone.init.JamiesModBlocks;
import com.jamiedev.bygone.init.JamiesModEntityTypes;
import com.jamiedev.bygone.init.JamiesModItems;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class BygoneClient {


    public static void registerRenderLayers(BiConsumer<Block, RenderType> consumer) {
        consumer.accept(JamiesModBlocks.AMBER, RenderType.translucent());
        consumer.accept(JamiesModBlocks.CLOUD, RenderType.translucent());
        consumer.accept(JamiesModBlocks.BYGONE_PORTAL, RenderType.translucent());

        consumer.accept(JamiesModBlocks.ANCIENT_LEAVES, RenderType.cutout());
        consumer.accept(JamiesModBlocks.ANCIENT_ROOTS, RenderType.cutout());
        consumer.accept(JamiesModBlocks.ANCIENT_SAPLING, RenderType.cutout());
        consumer.accept(JamiesModBlocks.ANCIENT_VINE, RenderType.cutout());
        consumer.accept(JamiesModBlocks.CHARNIA, RenderType.cutout());
        consumer.accept(JamiesModBlocks.GOURD_LANTERN_BEIGE, RenderType.cutout());
        consumer.accept(JamiesModBlocks.GOURD_LANTERN_MUAVE, RenderType.cutout());
        consumer.accept(JamiesModBlocks.GOURD_LANTERN_VERDANT, RenderType.cutout());
        consumer.accept(JamiesModBlocks.GOURD_DANGO, RenderType.cutout());
        consumer.accept(JamiesModBlocks.GOURD_DANGO_WALL, RenderType.cutout());
        consumer.accept(JamiesModBlocks.GOURD_VINE, RenderType.cutout());
        consumer.accept(JamiesModBlocks.BIG_WHIRLIWEED, RenderType.cutout());
        consumer.accept(JamiesModBlocks.WHIRLIWEED, RenderType.cutout());
        consumer.accept(JamiesModBlocks.RAFFLESIA, RenderType.cutout());
        consumer.accept(JamiesModBlocks.CAVE_VINES, RenderType.cutout());
        consumer.accept(JamiesModBlocks.CAVE_VINES_PLANT, RenderType.cutout());
        consumer.accept(JamiesModBlocks.MONTSECHIA, RenderType.cutout());
        consumer.accept(JamiesModBlocks.SAGARIA, RenderType.cutout());
        consumer.accept(JamiesModBlocks.ANCIENT_DOOR, RenderType.cutout());
        consumer.accept(JamiesModBlocks.ANCIENT_TRAPDOOR, RenderType.cutout());
        consumer.accept(JamiesModBlocks.POTTED_MONTSECHIA, RenderType.cutout());
        consumer.accept(JamiesModBlocks.POTTED_SAGARIA, RenderType.cutout());
        consumer.accept(JamiesModBlocks.SHORT_GRASS, RenderType.cutout());
        consumer.accept(JamiesModBlocks.TALL_GRASS, RenderType.cutout());
        consumer.accept(JamiesModBlocks.BLUE_ALGAE, RenderType.cutout());
        consumer.accept(JamiesModBlocks.MALACHITE_DOOR, RenderType.cutout());

        consumer.accept(JamiesModBlocks.BLEMISH_VEIN, RenderType.cutoutMipped());

        consumer.accept(JamiesModBlocks.CRINOID, RenderType.cutout());
        consumer.accept(JamiesModBlocks.PRIMORDIAL_URCHIN, RenderType.cutout());
        consumer.accept(JamiesModBlocks.PRIMORDIAL_VENT, RenderType.cutout());

        consumer.accept(JamiesModBlocks.DEAD_ORANGE_CORAL, RenderType.cutout());
        consumer.accept(JamiesModBlocks.DEAD_ORANGE_CORAL_WALL_FAN, RenderType.cutout());
        consumer.accept(JamiesModBlocks.DEAD_ORANGE_CORAL_FAN, RenderType.cutout());
        consumer.accept(JamiesModBlocks.ORANGE_CORAL, RenderType.cutout());
        consumer.accept(JamiesModBlocks.ORANGE_CORAL_FAN, RenderType.cutout());
        consumer.accept(JamiesModBlocks.ORANGE_CORAL_WALL_FAN, RenderType.cutout());
        consumer.accept(JamiesModBlocks.DEAD_BLUE_CORAL, RenderType.cutout());
        consumer.accept(JamiesModBlocks.DEAD_BLUE_CORAL_WALL_FAN, RenderType.cutout());
        consumer.accept(JamiesModBlocks.DEAD_BLUE_CORAL_FAN, RenderType.cutout());
        consumer.accept(JamiesModBlocks.BLUE_CORAL, RenderType.cutout());
        consumer.accept(JamiesModBlocks.BLUE_CORAL_FAN, RenderType.cutout());
        consumer.accept(JamiesModBlocks.BLUE_CORAL_WALL_FAN, RenderType.cutout());
        consumer.accept(JamiesModBlocks.BELLADONNA, RenderType.cutout());
        consumer.accept(JamiesModBlocks.COLEUS, RenderType.cutout());

        consumer.accept(JamiesModBlocks.SHELF_FUNGUS, RenderType.cutout());
        consumer.accept(JamiesModBlocks.SHELF_ROOTS, RenderType.cutout());
        consumer.accept(JamiesModBlocks.SHELF_SPROUTS, RenderType.cutout());
        consumer.accept(JamiesModBlocks.SHELF_MOLD, RenderType.cutout());
        consumer.accept(JamiesModBlocks.ORANGE_FUNGI_VINES, RenderType.cutout());
        consumer.accept(JamiesModBlocks.ORANGE_FUNGI_PLANT, RenderType.cutout());
        consumer.accept(JamiesModBlocks.PINK_FUNGI_VINES, RenderType.cutout());
        consumer.accept(JamiesModBlocks.PINK_FUNGI_VINES_PLANT, RenderType.cutout());
        consumer.accept(JamiesModBlocks.PURPLE_FUNGI_VINES, RenderType.cutout());
        consumer.accept(JamiesModBlocks.PURPLE_FUNGI_VINES_PLANT, RenderType.cutout());

        // consumer.accept(JamiesModBlocks.ORANGE_FUNGI_FAN, RenderLayer.getCutout());
        //consumer.accept(JamiesModBlocks.ORANGE_FUNGI_WALL_FAN, RenderLayer.getCutout());
        // consumer.accept(JamiesModBlocks.PINK_FUNGI_FAN, RenderLayer.getCutout());
        // consumer.accept(JamiesModBlocks.PINK_FUNGI_WALL_FAN, RenderLayer.getCutout());
        // consumer.accept(JamiesModBlocks.PURPLE_FUNGI_FAN, RenderLayer.getCutout());
        // consumer.accept(JamiesModBlocks.PURPLE_FUNGI_WALL_FAN, RenderLayer.getCutout());

        consumer.accept(JamiesModBlocks.CLAYSTONE_FARMLAND, RenderType.cutout());
        consumer.accept(JamiesModBlocks.AMARANTH_CROP, RenderType.cutout());
        consumer.accept(JamiesModBlocks.SPRINKER, RenderType.cutout());

        consumer.accept(JamiesModBlocks.POINTED_AMBER, RenderType.cutout());
        consumer.accept(JamiesModBlocks.CREOSOTE, RenderType.cutout());
        consumer.accept(JamiesModBlocks.CREOSOTE_SPROUTS, RenderType.cutout());
    }

    public static void createEntityRenderers() {
        EntityRenderers.register(JamiesModEntityTypes.GLARE, GlareRenderer::new);
        EntityRenderers.register(JamiesModEntityTypes.COELACANTH, CoelacanthRenderer::new);
        EntityRenderers.register(JamiesModEntityTypes.DUCK, DuckieRenderer::new);
        EntityRenderers.register(JamiesModEntityTypes.SCUTTLE, ScuttleRenderer::new);
        EntityRenderers.register(JamiesModEntityTypes.COPPERBUG, CopperbugRenderer::new);
        EntityRenderers.register(JamiesModEntityTypes.HOOK, HookRenderer::new);
        EntityRenderers.register(JamiesModEntityTypes.EXOTIC_ARROW, ExoticArrowRenderer::new);
        EntityRenderers.register(JamiesModEntityTypes.SCUTTLE_SPIKE, ScuttleSpikeRenderer::new);
        EntityRenderers.register(JamiesModEntityTypes.TRILOBITE, TrilobiteRenderer::new);
        EntityRenderers.register(JamiesModEntityTypes.MOOBOO, MoobooRenderer::new);
        EntityRenderers.register(JamiesModEntityTypes.FUNGAL_PARENT, FungalParentRenderer::new);
        EntityRenderers.register(JamiesModEntityTypes.BIG_BEAK, BigBeakRenderer::new);
    }
    
    public static void createModelLayers(BiConsumer<ModelLayerLocation, Supplier<LayerDefinition>> consumer) {
        consumer.accept(JamiesModModelLayers.SCUTTLE_SPIKE, ScuttleSpikeModel::getTexturedModelData);
        consumer.accept(JamiesModModelLayers.COELACANTH, CoelacanthModel::getTexturedModelData);
        consumer.accept(JamiesModModelLayers.DUCKIE, DuckieModel::getTexturedModelData);
        consumer.accept(JamiesModModelLayers.GLARE, GlareModel::getTexturedModelData);
        consumer.accept(JamiesModModelLayers.SCUTTLE, ScuttleModel::getTexturedModelData);
        consumer.accept(JamiesModModelLayers.COPPERBUG, CopperbugModel::getTexturedModelData);
        consumer.accept(JamiesModModelLayers.TRILOBITE, TrilobiteModel::getTexturedModelData);
        consumer.accept(JamiesModModelLayers.MOOBOO, MoobooModel::getTexturedModelData);
        consumer.accept(JamiesModModelLayers.FUNGALPARENT, FungalParentModel::getTexturedModelData);
        consumer.accept(JamiesModModelLayers.BIG_BEAK, BigBeakModel::getTexturedModelData);
        consumer.accept(JamiesModModelLayers.BIG_BEAK_SADDLE, BigBeakModel::getTexturedModelData);
        consumer.accept(JamiesModModelLayers.BIG_BEAK_ARMOR, BigBeakModel::getTexturedModelData);
    }

    public static void registerModelPredicateProviders() {
        ItemProperties.register(JamiesModItems.HOOK, Bygone.id("deployed"), (itemStack, clientWorld, livingEntity, seed) -> {
            if (livingEntity instanceof Player) {
                for (InteractionHand value : InteractionHand.values())
                {
                    ItemStack heldStack = livingEntity.getItemInHand(value);

                    if (heldStack == itemStack && (((PlayerWithHook)livingEntity).bygone$getHook() != null && !((PlayerWithHook)livingEntity).bygone$getHook().isRemoved()))
                    {
                        return 1;
                    }
                }
            }

            if (livingEntity == null) return 0.0F;
            return 0;
        });

        ItemProperties.register(JamiesModItems.VERDIGRIS_BLADE, Bygone.id("blocking"),
                (itemStack, clientWorld, livingEntity, seed) -> {
                    if (livingEntity == null) return 0;
                    if (livingEntity instanceof Player && livingEntity.isBlocking()) return 1;
                    return 0;
                }
        );
    }
}
