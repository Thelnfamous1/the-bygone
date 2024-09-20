package com.jamiedev.mod.client;


import com.jamiedev.mod.JamiesMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class JamiesModModelLayers {
    public static final EntityModelLayer DUCKIE =
            new EntityModelLayer(JamiesMod.getModId("duckie"), "main");
    public static final EntityModelLayer HOOK =
            new EntityModelLayer(JamiesMod.getModId("hook"), "main");

    public static final EntityModelLayer GLARE =
            new EntityModelLayer(JamiesMod.getModId("glare"), "main");

    public static final EntityModelLayer BIG_BEAK = new EntityModelLayer(JamiesMod.getModId("big_beak"), "main");
    public static final EntityModelLayer BIG_BEAK_SADDLE =  new EntityModelLayer(JamiesMod.getModId("big_beak"), "saddle");

}
