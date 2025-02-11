package com.jamiedev.bygone.fabric.init;

import com.jamiedev.bygone.Bygone;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
public class JamiesModParticleTypes
{

    public static final ParticleType<SimpleParticleType> AMBER_DUST = simple();
    public static final ParticleType<SimpleParticleType> RAFFLESIA_SPORES = simple();
    public static final ParticleType<SimpleParticleType> ALGAE_BLOOM = simple();

    public static final ParticleType<SimpleParticleType> BLEMISH = simple();
    public static final ParticleType<SimpleParticleType> SHELF = simple();
    public static final ParticleType<SimpleParticleType> ANCIENT_LEAVES = simple();

    public static void init() {
        Registry.register(BuiltInRegistries.PARTICLE_TYPE, Bygone.getModId( "rafflesia_spores"), RAFFLESIA_SPORES);
        Registry.register(BuiltInRegistries.PARTICLE_TYPE, Bygone.getModId( "algae_bloom"), ALGAE_BLOOM);
        Registry.register(BuiltInRegistries.PARTICLE_TYPE, Bygone.getModId( "blemish_bubble"), BLEMISH);
        Registry.register(BuiltInRegistries.PARTICLE_TYPE, Bygone.getModId( "amber_dust"), AMBER_DUST);
        Registry.register(BuiltInRegistries.PARTICLE_TYPE, Bygone.getModId( "shelf"), SHELF);
        Registry.register(BuiltInRegistries.PARTICLE_TYPE, Bygone.getModId( "ancient_leaves"), ANCIENT_LEAVES);
    }

    public static SimpleParticleType simple() {
        return new SimpleParticleType(false) { };
    }

}
