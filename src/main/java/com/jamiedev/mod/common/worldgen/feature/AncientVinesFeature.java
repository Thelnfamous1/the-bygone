package com.jamiedev.mod.common.worldgen.feature;

import com.jamiedev.mod.fabric.init.JamiesModBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.VineBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class AncientVinesFeature extends Feature<NoneFeatureConfiguration> {
    public AncientVinesFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel structureWorldAccess = context.level();
        BlockPos blockPos = context.origin();
        context.config();
        if (!structureWorldAccess.isEmptyBlock(blockPos)) {
            return false;
        } else {
            Direction[] var4 = Direction.values();
            int var5 = var4.length;

            for (Direction direction : var4) {
                if (direction != Direction.DOWN && VineBlock.isAcceptableNeighbour(structureWorldAccess, blockPos.relative(direction), direction)) {
                    structureWorldAccess.setBlock(blockPos, (BlockState) JamiesModBlocks.ANCIENT_VINE.defaultBlockState().setValue(VineBlock.getPropertyForFace(direction), true), 2);
                    return true;
                }
            }

            return false;
        }
    }
}
