package com.jamiedev.mod.common.client.renderer;

import com.jamiedev.mod.fabric.init.JamiesModDimension;
import com.mojang.blaze3d.shaders.FogShape;
import java.util.function.Consumer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.DimensionSpecialEffects;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.Vec3;

public class BygoneDimensionEffects extends DimensionSpecialEffects
{

    public static final BygoneDimensionEffects INSTANCE = new BygoneDimensionEffects(Float.NaN, false, SkyType.NORMAL, false, true);
    private final Minecraft minecraft = Minecraft.getInstance();
    private int rainSoundTime;

    public BygoneDimensionEffects(float cloudsHeight, boolean alternateSkyColor, SkyType skyType, boolean brightenLighting, boolean darkened) {
        super(cloudsHeight, true, SkyType.NORMAL, false, false);
    }

    public Vec3 getFogColor() {
        float colorFactor = 0.75f;

        colorFactor *= (float) (100d / 100);


        return new Vec3((int)(Math.min(Math.min(0.54f * colorFactor, 0.65f + 0)*255, 255)),
                ((int)(Math.min(Math.max(Math.min(0.3f * colorFactor, 0.87f) - 0 * 0.6f, 0)*255, 255))),
                ((int)(Math.min(Math.max(Math.min((0.001f * colorFactor) * (colorFactor * colorFactor), 0.9f) - 0 * 1.9f, 0)*255, 255))));
    }

    @Override
    public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
        return color;
    }

    @Override
    public boolean isFoggyAt(int camX, int camY) {
        Player player = Minecraft.getInstance().player;

        //if (player != null) {
        //
       // }

        return true;
    }

    public static boolean fogThicknessAdjustments(
            LocalPlayer player,
            float renderDistance,
            boolean thickFog,
            FogRenderer.FogMode fogType,
            Consumer<Float> setFogStart,
            Consumer<Float> setFogEnd,
            Consumer<FogShape> setFogShape)
    {
        if (
                fogType == FogRenderer.FogMode.FOG_TERRAIN &&
                thickFog &&
                player != null &&
                player.level().dimension() == JamiesModDimension.BYGONE_LEVEL_KEY)
        {


            float distanceRationAdjuster = 1;
            if (renderDistance > 352) {
                distanceRationAdjuster = Math.min(renderDistance / 352, 1.25F);
            } else if (renderDistance < 126) {
                distanceRationAdjuster = Math.max(renderDistance / 126, 0.75F);
            }
            float fogStart = (float) (renderDistance / ((4D * distanceRationAdjuster * 0.3f) + 0.00001D));
            setFogStart.accept(Math.min(renderDistance, fogStart));
            setFogEnd.accept(Math.max(renderDistance, fogStart));
            setFogShape.accept(FogShape.CYLINDER);
            return true;
        }

        return false;
    }
}
