package com.jamiedev.mod.fabric.init;

import com.jamiedev.mod.common.blocks.entity.CopperbugNestBlockEntity;
import com.jamiedev.mod.fabric.JamiesModFabric;
import java.util.List;
import java.util.function.UnaryOperator;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BeehiveBlockEntity;

public class JamiesModDataComponentTypes
{
   public static final DataComponentType<List<CopperbugNestBlockEntity.CopperbugData>> COPPERBUGS = register("copperbugs", (builder) -> {
     return builder.persistent(CopperbugNestBlockEntity.CopperbugData.LIST_CODEC).networkSynchronized(
               CopperbugNestBlockEntity.CopperbugData.PACKET_CODEC.apply(ByteBufCodecs.list())).cacheEncoding();
   });
    public static final DataComponentType<List<BeehiveBlockEntity.Occupant>> BEES = register("bees", (builder) -> {
        return builder.persistent(BeehiveBlockEntity.Occupant.LIST_CODEC).networkSynchronized(BeehiveBlockEntity.Occupant.STREAM_CODEC.apply(ByteBufCodecs.list())).cacheEncoding();
    });

    public static final DataComponentType<CopperbugNestBlockEntity.CopperbugData> COPPERBUG_1 = Registry.register(
            BuiltInRegistries.DATA_COMPONENT_TYPE,
            ResourceLocation.fromNamespaceAndPath(JamiesModFabric.MOD_ID, "copperbugs"),
            DataComponentType.<CopperbugNestBlockEntity.CopperbugData>builder().persistent(null).build()
    );

  //  public static final ComponentMap DEFAULT_ITEM_COMPONENTS;

    public JamiesModDataComponentTypes() {
    }


    private static <T> DataComponentType<T> register(String id, UnaryOperator<DataComponentType.Builder<T>> builderOperator) {

        return (DataComponentType)Registry.register(BuiltInRegistries.DATA_COMPONENT_TYPE, JamiesModFabric.getModId(id), ((DataComponentType.Builder)builderOperator.apply(DataComponentType.builder())).build());
    }

    static {
  //      DEFAULT_ITEM_COMPONENTS = ComponentMap.builder().add(MAX_STACK_SIZE, 64).add(LORE, LoreComponent.DEFAULT).add(ENCHANTMENTS, ItemEnchantmentsComponent.DEFAULT).add(REPAIR_COST, 0).add(ATTRIBUTE_MODIFIERS, AttributeModifiersComponent.DEFAULT).add(RARITY, Rarity.COMMON).build();
    }

    protected static void init() {
        JamiesModFabric.LOGGER.info("Registering {} components", JamiesModFabric.MOD_ID);

    }
}
