package com.jamiedev.mod.init;

import com.jamiedev.mod.JamiesMod;
import com.jamiedev.mod.entities.projectile.HookEntity;
import net.fabricmc.fabric.api.attachment.v1.AttachmentRegistry;
import net.fabricmc.fabric.api.attachment.v1.AttachmentType;

@SuppressWarnings("UnstableApiUsage")
public class JamiesModAttatchments
{

    interface Attatchments
    {
        String GRAPPLING = "hook";
    }

    public static final AttachmentType<HookEntity> GRAPPLING = AttachmentRegistry.<HookEntity>builder()
            .buildAndRegister(JamiesMod.getModId(Attatchments.GRAPPLING));



}
