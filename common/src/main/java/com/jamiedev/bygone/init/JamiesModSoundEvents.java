package com.jamiedev.bygone.init;

import com.jamiedev.bygone.Bygone;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
public class JamiesModSoundEvents
{
    public static final ResourceLocation AMBIENT_ANCIENTFOREST_ADDITIONS = Bygone.id("ambient.underhang.additions");
    public static final ResourceLocation AMBIENT_AMBERDESERT_ADDITIONS = Bygone.id("ambient.amber_desert.additions");
    public static final ResourceLocation AMBIENT_PRIMORDIALOCEAN_ADDITIONS = Bygone.id("ambient.primordial_ocean.additions");
    public static final ResourceLocation MUSIC_ANCIENTFOREST_ADDITIONS = Bygone.id("music.bygone.underhang");
    public static final ResourceLocation MUSIC_PRIMORDIALOCEAN_ADDITIONS = Bygone.id("music.bygone.primordial_ocean");
    public static final ResourceLocation AMBIENT_SHELFHOLLOW_ADDITIONS = Bygone.id("ambient.shelfhollow.additions");
    public static final ResourceLocation ENTITY_BIGBEAK_AMBIENT = Bygone.id("entity.bigbeak.ambient");
    public static final ResourceLocation ENTITY_BIGBEAK_HURT = Bygone.id("entity.bigbeak.hurt");
    public static final ResourceLocation ENTITY_BIGBEAK_DEATH = Bygone.id("entity.bigbeak.death");
    public static final ResourceLocation ENTITY_BIGBEAK_JUMP = Bygone.id("entity.bigbeak.jump");
    public static final ResourceLocation ENTITY_BIGBEAK_STEP = Bygone.id("entity.bigbeak.step");
    public static final ResourceLocation ENTITY_BIGBEAK_STEP_WOOD = Bygone.id("entity.bigbeak.step_wood");
    public static final ResourceLocation ENTITY_BIGBEAK_GALLOP = Bygone.id("entity.bigbeak.gallop");

    public static final ResourceLocation ENTITY_MOOBOO_AMBIENT = Bygone.id("entity.mooboo.ambient");
    public static final ResourceLocation ENTITY_MOOBOO_HURT = Bygone.id("entity.mooboo.hurt");
    public static final ResourceLocation ENTITY_MOOBOO_DEATH = Bygone.id("entity.mooboo.death");

    public static final ResourceLocation ENTITY_FUNGUSPARENT_AMBIENT = Bygone.id("entity.fungus_parent.ambient");
    public static final ResourceLocation ENTITY_FUNGUSPARENT_BABY_AMBIENT = Bygone.id("entity.fungus_parent.ambient_baby");
    public static final ResourceLocation ENTITY_FUNGUSPARENT_HURT = Bygone.id("entity.fungus_parent.hurt");
    public static final ResourceLocation ENTITY_FUNGUSPARENT_DEATH = Bygone.id("entity.fungus_parent.death");
    
    public static SoundEvent AMBIENT_ANCIENTFOREST_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(AMBIENT_ANCIENTFOREST_ADDITIONS);
    public static SoundEvent AMBIENT_AMBERDESERT_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(AMBIENT_AMBERDESERT_ADDITIONS);
    public static SoundEvent AMBIENT_PRIMORDIALOCEAN_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(AMBIENT_PRIMORDIALOCEAN_ADDITIONS);
    public static SoundEvent MUSIC_ANCIENTFOREST_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(MUSIC_ANCIENTFOREST_ADDITIONS);
    public static SoundEvent AMBIENT_SHELFHOLLOW_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(AMBIENT_SHELFHOLLOW_ADDITIONS);
    public static SoundEvent MUSIC_PRIMORDIALOCEAN_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(MUSIC_PRIMORDIALOCEAN_ADDITIONS);

    public static SoundEvent BIGBEAK_AMBIENT_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(ENTITY_BIGBEAK_AMBIENT);
    public static SoundEvent BIGBEAK_HURT_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(ENTITY_BIGBEAK_HURT);
    public static SoundEvent BIGBEAK_DEATH_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(ENTITY_BIGBEAK_DEATH);
    public static SoundEvent BIGBEAK_JUMP_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(ENTITY_BIGBEAK_JUMP);
    public static SoundEvent BIGBEAK_STEP_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(ENTITY_BIGBEAK_STEP);
    public static SoundEvent BIGBEAK_STEP_WOOD_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(ENTITY_BIGBEAK_STEP_WOOD);
    public static SoundEvent BIGBEAK_GALLOP_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(ENTITY_BIGBEAK_GALLOP);

    public static SoundEvent MOOBOO_AMBIENT_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(ENTITY_MOOBOO_AMBIENT);
    public static SoundEvent MOOBOO_HURT_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(ENTITY_MOOBOO_HURT);
    public static SoundEvent MOOBOO_DEATH_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(ENTITY_MOOBOO_DEATH);

    public static SoundEvent FUNGUSPARENT_AMBIENT_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(ENTITY_FUNGUSPARENT_AMBIENT);
    public static SoundEvent FUNGUSPARENT_AMBIENT_BABY_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(ENTITY_FUNGUSPARENT_BABY_AMBIENT);
    public static SoundEvent FUNGUSPARENT_HURT_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(ENTITY_FUNGUSPARENT_HURT);
    public static SoundEvent FUNGUSPARENT_DEATH_ADDITIONS_EVENT = SoundEvent.createVariableRangeEvent(ENTITY_FUNGUSPARENT_DEATH);


    private static SoundEvent register(String id) {
        return Registry.register(BuiltInRegistries.SOUND_EVENT, Bygone.id(id), SoundEvent.createVariableRangeEvent(Bygone.id(id)));
    }

    private static Holder.Reference<SoundEvent> registerReference(String id) {
        return registerReference(Bygone.id(id), Bygone.id(id));
    }

    private static Holder.Reference<SoundEvent> registerReference(ResourceLocation id, ResourceLocation soundId) {
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(soundId));
    }

    public static void init()
    {
        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.AMBIENT_ANCIENTFOREST_ADDITIONS, JamiesModSoundEvents.AMBIENT_ANCIENTFOREST_ADDITIONS_EVENT);
        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.AMBIENT_AMBERDESERT_ADDITIONS, JamiesModSoundEvents.AMBIENT_AMBERDESERT_ADDITIONS_EVENT);
        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.AMBIENT_PRIMORDIALOCEAN_ADDITIONS, JamiesModSoundEvents.AMBIENT_PRIMORDIALOCEAN_ADDITIONS_EVENT);
        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.AMBIENT_SHELFHOLLOW_ADDITIONS, JamiesModSoundEvents.AMBIENT_SHELFHOLLOW_ADDITIONS_EVENT);
        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.MUSIC_ANCIENTFOREST_ADDITIONS, JamiesModSoundEvents.MUSIC_ANCIENTFOREST_ADDITIONS_EVENT);
        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.MUSIC_PRIMORDIALOCEAN_ADDITIONS, JamiesModSoundEvents.MUSIC_PRIMORDIALOCEAN_ADDITIONS_EVENT);

        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.ENTITY_BIGBEAK_AMBIENT, JamiesModSoundEvents.BIGBEAK_AMBIENT_ADDITIONS_EVENT);
        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.ENTITY_BIGBEAK_HURT, JamiesModSoundEvents.BIGBEAK_HURT_ADDITIONS_EVENT);
        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.ENTITY_BIGBEAK_DEATH, JamiesModSoundEvents.BIGBEAK_DEATH_ADDITIONS_EVENT);
        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.ENTITY_BIGBEAK_JUMP, JamiesModSoundEvents.BIGBEAK_JUMP_ADDITIONS_EVENT);
        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.ENTITY_BIGBEAK_STEP, JamiesModSoundEvents.BIGBEAK_STEP_ADDITIONS_EVENT);
        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.ENTITY_BIGBEAK_STEP_WOOD, JamiesModSoundEvents.BIGBEAK_STEP_WOOD_ADDITIONS_EVENT);
        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.ENTITY_BIGBEAK_GALLOP, JamiesModSoundEvents.BIGBEAK_GALLOP_ADDITIONS_EVENT);

        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.ENTITY_MOOBOO_AMBIENT, JamiesModSoundEvents.MOOBOO_AMBIENT_ADDITIONS_EVENT);
        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.ENTITY_MOOBOO_HURT, JamiesModSoundEvents.MOOBOO_HURT_ADDITIONS_EVENT);
        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.ENTITY_MOOBOO_DEATH, JamiesModSoundEvents.MOOBOO_DEATH_ADDITIONS_EVENT);
        
        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.ENTITY_FUNGUSPARENT_AMBIENT, JamiesModSoundEvents.FUNGUSPARENT_AMBIENT_ADDITIONS_EVENT);
        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.ENTITY_FUNGUSPARENT_HURT, JamiesModSoundEvents.FUNGUSPARENT_HURT_ADDITIONS_EVENT);
        Registry.register(BuiltInRegistries.SOUND_EVENT, JamiesModSoundEvents.ENTITY_FUNGUSPARENT_DEATH, JamiesModSoundEvents.FUNGUSPARENT_DEATH_ADDITIONS_EVENT);

    }
}
