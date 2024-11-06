package com.jamiedev.mod.init;

import com.jamiedev.mod.JamiesMod;
import com.jamiedev.mod.items.ExoticArrowItem;
import com.jamiedev.mod.items.HookItem;
import com.jamiedev.mod.items.JamiesModItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;

public class JamiesModItems
{
    public static Item registerItem(String id, Item item){
        return Registry.register(Registries.ITEM, JamiesMod.getModId(id), item);
    }

    Items items;

   // public static final Item JAMIES_ITEM = registerItem("jamies_item", new Item(new Item.Settings().fireproof()));
    public static final Item HOOK = registerItem("hook", new HookItem(new Item.Settings().maxCount(1).maxDamage(100)));

    public static final Item ANCIENT_SIGN = registerItem("ancient_sign",
            new SignItem(new Item.Settings().maxCount(16), JamiesModBlocks.ANCIENT_SIGN, JamiesModBlocks.ANCIENT_WALL_SIGN));

    public static final Item ANCIENT_HANGING_SIGN = registerItem("ancient_hanging_sign",
            new HangingSignItem(JamiesModBlocks.ANCIENT_HANGING_SIGN, JamiesModBlocks.ANCIENT_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));

    public static final Item SCALE = registerItem("scale", new Item(new Item.Settings().fireproof()));


    public static final Item ANCIENT_BOAT = registerItem("ancient_boat", (Item)(new BoatItem(false, net.minecraft.entity.vehicle.BoatEntity.Type.OAK, (new Item.Settings()).maxCount(1))));
    public static final Item ANCIENT_CHEST_BOAT = registerItem("ancient_chest_boat", (Item)(new BoatItem(true, net.minecraft.entity.vehicle.BoatEntity.Type.OAK, (new Item.Settings()).maxCount(1))));

    public static final Item GOURD_ON_A_STICK =  registerItem("gourd_on_a_stick", (Item)(new OnAStickItem((new Item.Settings()).maxDamage(100), JamiesModEntityTypes.BRUNGLE, 1)));
    public static final Item GOURD_FLESH = registerItem("gourd_flesh", new Item((new Item.Settings()).food(FoodComponents.GOLDEN_CARROT)));
   // public static final Item GOURD_SEEDS = registerItem("gourd_seeds", (Item)(new AliasedBlockItem(JamiesModBlocks.GOURD_LANTERN_VERDANT, new Item.Settings())));

    public static final Item COELECANTH = registerItem("coelacanth", new Item(new Item.Settings().food(FoodComponents.CHICKEN)));
    public static final Item COELECANTH_COOKED = registerItem("cooked_coelacanth", new Item(new Item.Settings().food(FoodComponents.PUFFERFISH)));
    public static final Item EXOTIC_ARROW = registerItem("exotic_arrow", new ExoticArrowItem(new Item.Settings().fireproof()));
    public static final Item EXOTIC_PLUMAGE = registerItem("exotic_plumage", new Item(new Item.Settings().fireproof()));
    public static final Item GLOW_CHITIN = registerItem("glow_chitin", new Item(new Item.Settings().fireproof()));
    public static final Item SCUTTLE_SPIKE = registerItem("scuttle_spike", new Item(new Item.Settings().fireproof()));
    ArmorMaterials mat;

    public static final Item BEIGE_SLICE = registerItem("glow_gourd_beige_slice", new Item(new Item.Settings().food(FoodComponents.GOLDEN_CARROT)));
    public static final Item MUAVE_SLICE = registerItem("glow_gourd_muave_slice", new Item(new Item.Settings().food(FoodComponents.GOLDEN_CARROT)));
    public static final Item VERDANT_SLICE = registerItem("glow_gourd_verdant_slice", new Item(new Item.Settings().food(FoodComponents.GOLDEN_CARROT)));

    public static final Item SCALE_HELMET = registerItem("scale_helmet",
            new ArmorItem(JamiesModArmorMaterials.SCALE, ArmorItem.Type.HELMET,
                    new Item.Settings().fireproof()));
    public static final Item SCALE_CHESTPLATE = registerItem("scale_chestplate",
            new ArmorItem(JamiesModArmorMaterials.SCALE, ArmorItem.Type.CHESTPLATE,
                    new Item.Settings().fireproof()));
    public static final Item SCALE_LEGGINGS = registerItem("scale_leggings",
            new ArmorItem(JamiesModArmorMaterials.SCALE, ArmorItem.Type.LEGGINGS,
                    new Item.Settings().fireproof()));
    public static final Item SCALE_BOOTS = registerItem("scale_boots",
            new ArmorItem(JamiesModArmorMaterials.SCALE, ArmorItem.Type.BOOTS,
                    new Item.Settings().fireproof()));
    public static final Item DIAMOND_BIG_BEAK_ARMOR = registerItem("diamond_beak_armor", (Item)(new AnimalArmorItem(ArmorMaterials.DIAMOND, net.minecraft.item.AnimalArmorItem.Type.EQUESTRIAN, false, (new Item.Settings()).maxCount(1))));
    public static final Item BIG_BEAK_SPAWN_EGG = registerItem("big_beak_spawn_egg", (Item)(new SpawnEggItem(JamiesModEntityTypes.BIG_BEAK, 8767242, 16756224, new Item.Settings())));
    public static final Item COELACANTH_SPAWN_EGG = registerItem("coelacanth_spawn_egg", (Item)(new SpawnEggItem(JamiesModEntityTypes.COELACANTH, 2517624, 2327369, new Item.Settings())));
    //public static final Item MOOBOO_SPAWN_EGG = registerItem("mooboo_spawn_egg", (Item)(new SpawnEggItem(JamiesModEntityTypes.MOOBOO, 6022120, 11716552, new Item.Settings())));
    public static final Item SCUTTLE_SPAWN_EGG = registerItem("scuttle_spawn_egg", (Item)(new SpawnEggItem(JamiesModEntityTypes.SCUTTLE, 2574194, 15380531, new Item.Settings())));
    public static final Item TRILOBITE_SPAWN_EGG = registerItem("trilobite_spawn_egg", (Item)(new SpawnEggItem(JamiesModEntityTypes.TRILOBITE, 2309206, 1352874, new Item.Settings())));

    public static void addItemsToItemGroup() {

       // addToItemGroup(JamiesModItemGroup.JAMIES_MOD, JAMIES_ITEM);
        addToItemGroup(JamiesModItemGroup.JAMIES_MOD, ANCIENT_SIGN);
        addToItemGroup(JamiesModItemGroup.JAMIES_MOD, ANCIENT_HANGING_SIGN);
        addToItemGroup(JamiesModItemGroup.JAMIES_MOD, HOOK);
        addToItemGroup(JamiesModItemGroup.JAMIES_MOD, SCALE);
        addToItemGroup(JamiesModItemGroup.JAMIES_MOD, EXOTIC_ARROW);
        addToItemGroup(JamiesModItemGroup.JAMIES_MOD, EXOTIC_PLUMAGE);
        addToItemGroup(JamiesModItemGroup.JAMIES_MOD, COELECANTH);
        addToItemGroup(JamiesModItemGroup.JAMIES_MOD, COELECANTH_COOKED);
        addToItemGroup(JamiesModItemGroup.JAMIES_MOD, BEIGE_SLICE);
        addToItemGroup(JamiesModItemGroup.JAMIES_MOD, MUAVE_SLICE);
        addToItemGroup(JamiesModItemGroup.JAMIES_MOD, VERDANT_SLICE);
        addToItemGroup(JamiesModItemGroup.JAMIES_MOD, BIG_BEAK_SPAWN_EGG);
        addToItemGroup(JamiesModItemGroup.JAMIES_MOD, COELACANTH_SPAWN_EGG);
        addToItemGroup(JamiesModItemGroup.JAMIES_MOD, SCUTTLE_SPAWN_EGG);
        addToItemGroup(JamiesModItemGroup.JAMIES_MOD, TRILOBITE_SPAWN_EGG);
    }


    private static void addToItemGroup(RegistryKey<ItemGroup> group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add((item)));
    }

    public static void init(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {

        });


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(JamiesModBlocks.JAMIES_BLOCK.asItem());

        });

        addItemsToItemGroup();
    }
}
