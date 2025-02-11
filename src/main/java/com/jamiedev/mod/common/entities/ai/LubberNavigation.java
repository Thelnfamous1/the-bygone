package com.jamiedev.mod.common.entities.ai;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.navigation.GroundPathNavigation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.pathfinder.Path;
import org.jetbrains.annotations.Nullable;

public class LubberNavigation  extends GroundPathNavigation {
    @Nullable
    private BlockPos targetPos;

    public LubberNavigation(Mob mobEntity, Level world) {
        super(mobEntity, world);
    }

    public Path createPath(BlockPos target, int distance) {
        this.targetPos = target;
        return super.createPath(target, distance);
    }

    public Path createPath(Entity entity, int distance) {
        this.targetPos = entity.blockPosition();
        return super.createPath(entity, distance);
    }

    public boolean moveTo(Entity entity, double speed) {
        Path path = this.createPath((Entity)entity, 0);
        if (path != null) {
            return this.moveTo(path, speed);
        } else {
            this.targetPos = entity.blockPosition();
            this.speedModifier = speed;
            return true;
        }
    }

    public void tick() {
        if (!this.isDone()) {
            super.tick();
        } else {
            if (this.targetPos != null) {
                if (!this.targetPos.closerToCenterThan(this.mob.position(), (double)this.mob.getBbWidth()) && (!(this.mob.getY() > (double)this.targetPos.getY()) || !BlockPos.containing((double)this.targetPos.getX(), this.mob.getY(), (double)this.targetPos.getZ()).closerToCenterThan(this.mob.position(), (double)this.mob.getBbWidth()))) {
                    this.mob.getMoveControl().setWantedPosition((double)this.targetPos.getX(), (double)this.targetPos.getY(), (double)this.targetPos.getZ(), this.speedModifier);
                } else {
                    this.targetPos = null;
                }
            }

        }
    }
}
