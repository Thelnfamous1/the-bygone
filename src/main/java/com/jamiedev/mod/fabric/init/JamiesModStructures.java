package com.jamiedev.mod.fabric.init;

import com.jamiedev.mod.fabric.JamiesModFabric;
import com.jamiedev.mod.common.worldgen.structure.*;
import java.util.Locale;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;

public class JamiesModStructures
{
    public static StructureType<AncientRootStructure> ANCIENT_ROOTS;
    public static StructurePieceType ANCIENT_ROOTS_PIECES = Registry.register(BuiltInRegistries.STRUCTURE_PIECE,
            JamiesModFabric.getModId("ancient_roots"),  AncientRootGenerator.Piece::new);

    public static StructureType<RuinStructure> BLEMISH_RUINS;
    public static StructureType<AmberRuinsStructure> AMBER_RUINS;

    public static StructureType<BygoneMineshaftStructure> BYGONE_MINESHAFT;
    public static StructurePieceType BYGONE_MINESHAFT_CORRIDOR = Registry.register(BuiltInRegistries.STRUCTURE_PIECE,
            JamiesModFabric.getModId("corr"), BygoneMineshaftGenerator.BygoneMineshaftCorridor::new);
    public static StructurePieceType BYGONE_MINESHAFT_CROSSING = Registry.register(BuiltInRegistries.STRUCTURE_PIECE,
            JamiesModFabric.getModId("cros"), BygoneMineshaftGenerator.BygoneMineshaftCrossing::new);

    public static  StructurePieceType BYGONE_MINESHAFT_ROOM = Registry.register(BuiltInRegistries.STRUCTURE_PIECE,
            JamiesModFabric.getModId("room"), BygoneMineshaftGenerator.BygoneMineshaftRoom::new);
    public static StructurePieceType BYGONE_MINESHAFT_STAIRS = Registry.register(BuiltInRegistries.STRUCTURE_PIECE,
            JamiesModFabric.getModId("star"), BygoneMineshaftGenerator.BygoneMineshaftStairs::new);

    public static StructureType<BygoneFossilStructure> BYGONE_FOSSIL;
    public static StructurePieceType FOSSIL_PIECES = Registry.register(BuiltInRegistries.STRUCTURE_PIECE,
            JamiesModFabric.getModId("bygone_fossil"), BygoneFossilGenerator.Piece::new);
    public static StructurePieceType AMBER_RUIN_PIECES = Registry.register(BuiltInRegistries.STRUCTURE_PIECE,
            JamiesModFabric.getModId("ruin"),  RuinGenerator.Piece::new);
    public static StructurePieceType RUIN_PIECES = Registry.register(BuiltInRegistries.STRUCTURE_PIECE,
            JamiesModFabric.getModId("amber_ruins"),  AmberRuinsGenerator.Piece::new);

    public static StructureType<TestRootStructure> TEST_ROOTS;

    public static StructureType<BygonePortalStructure> BYGONE_PORTAL;
    public static StructurePieceType PORTAL_PIECE = Registry.register(BuiltInRegistries.STRUCTURE_PIECE,
            JamiesModFabric.getModId("bygone_portal"), BygonePortalGenerator.Piece::new);

    private static StructurePieceType register(StructurePieceType type, String id) {
        return (StructurePieceType)Registry.register(BuiltInRegistries.STRUCTURE_PIECE, id.toLowerCase(Locale.ROOT), type);
    }

    private static StructurePieceType register(StructurePieceType.ContextlessType type, String id) {
        return register((StructurePieceType)type, id);
    }

    private static StructurePieceType register(StructurePieceType.StructureTemplateType type, String id) {
        return register((StructurePieceType)type, id);
    }

    public static void init()
    {
        ANCIENT_ROOTS = Registry.register(BuiltInRegistries.STRUCTURE_TYPE, ResourceLocation.fromNamespaceAndPath(JamiesModFabric.MOD_ID, "ancient_roots"), () -> AncientRootStructure.CODEC);
        BYGONE_FOSSIL = Registry.register(BuiltInRegistries.STRUCTURE_TYPE, ResourceLocation.fromNamespaceAndPath(JamiesModFabric.MOD_ID , "bygone_fossil"), () -> BygoneFossilStructure.CODEC);
        BYGONE_PORTAL = Registry.register(BuiltInRegistries.STRUCTURE_TYPE, ResourceLocation.fromNamespaceAndPath(JamiesModFabric.MOD_ID , "bygone_portal"), () -> BygonePortalStructure.CODEC);
        TEST_ROOTS = Registry.register(BuiltInRegistries.STRUCTURE_TYPE, ResourceLocation.fromNamespaceAndPath(JamiesModFabric.MOD_ID, "test_roots"), () -> TestRootStructure.CODEC);
        BLEMISH_RUINS = Registry.register(BuiltInRegistries.STRUCTURE_TYPE, ResourceLocation.fromNamespaceAndPath(JamiesModFabric.MOD_ID, "ruin"), () -> RuinStructure.CODEC);
        AMBER_RUINS = Registry.register(BuiltInRegistries.STRUCTURE_TYPE, ResourceLocation.fromNamespaceAndPath(JamiesModFabric.MOD_ID, "amber_ruins"), () -> AmberRuinsStructure.CODEC);
        BYGONE_MINESHAFT = Registry.register(BuiltInRegistries.STRUCTURE_TYPE, ResourceLocation.fromNamespaceAndPath(JamiesModFabric.MOD_ID, "bygone_mineshaft"), () -> BygoneMineshaftStructure.CODEC);
    }
}
