package com.jamiedev.bygone.client.models.animations;// Save this class in your mod and generate all required imports

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
public class GlareAnimations {

	public static final AnimationDefinition GLARE_FACE_IDLE = AnimationDefinition.Builder.withLength(5f).looping()
			.addAnimation("neutral",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.05f, KeyframeAnimations.posVec(0f, 0f, 0.05f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.4f, KeyframeAnimations.posVec(0f, 0f, 0.05f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.45f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(5f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("angry",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0.05f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("closed",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0.1f, KeyframeAnimations.posVec(0f, 0f, 0.05f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.15f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.3f, KeyframeAnimations.posVec(0f, 0f, 0.05f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("tired",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0.05f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.05f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.1f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.15f, KeyframeAnimations.posVec(0f, 0f, 0.05f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 0f, 0.05f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.3f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.4f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.45f, KeyframeAnimations.posVec(0f, 0f, 0.05f),
									AnimationChannel.Interpolations.LINEAR))).build();
	public static final AnimationDefinition GLARE_BODY_IDLE = AnimationDefinition.Builder.withLength(3f).looping()
			.addAnimation("root",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.5f, KeyframeAnimations.posVec(0f, 0.25f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(3f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("root",
					new AnimationChannel(AnimationChannel.Targets.SCALE,
							new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.08343333f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.16766666f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.25f, KeyframeAnimations.scaleVec(1f, 1.01f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.3433333f, KeyframeAnimations.scaleVec(1f, 1.01f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.41676663f, KeyframeAnimations.scaleVec(1f, 1.02f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.49999999999999994f, KeyframeAnimations.scaleVec(1f, 1.02f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.5834333f, KeyframeAnimations.scaleVec(1f, 1.02f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.6766666f, KeyframeAnimations.scaleVec(1f, 1.02f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.75f, KeyframeAnimations.scaleVec(1f, 1.03f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.8343334f, KeyframeAnimations.scaleVec(1f, 1.02f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(0.9167667f, KeyframeAnimations.scaleVec(1f, 1.02f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1f, KeyframeAnimations.scaleVec(1f, 1.02f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.0834333f, KeyframeAnimations.scaleVec(1f, 1.02f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.1676665f, KeyframeAnimations.scaleVec(1f, 1.01f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.2499999999999998f, KeyframeAnimations.scaleVec(1f, 1.01f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.343333f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.4167663f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.5834328f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.676666f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.7499999999999993f, KeyframeAnimations.scaleVec(1f, 1.01f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.8343326f, KeyframeAnimations.scaleVec(1f, 1.01f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.9167659f, KeyframeAnimations.scaleVec(1f, 1.02f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.9999999999999991f, KeyframeAnimations.scaleVec(1f, 1.02f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.0834326f, KeyframeAnimations.scaleVec(1f, 1.02f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.167666f, KeyframeAnimations.scaleVec(1f, 1.02f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.25f, KeyframeAnimations.scaleVec(1f, 1.03f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.343333f, KeyframeAnimations.scaleVec(1f, 1.02f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.4167665f, KeyframeAnimations.scaleVec(1f, 1.02f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5f, KeyframeAnimations.scaleVec(1f, 1.02f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5834335f, KeyframeAnimations.scaleVec(1f, 1.02f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.676667f, KeyframeAnimations.scaleVec(1f, 1.01f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.7500000000000004f, KeyframeAnimations.scaleVec(1f, 1.01f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.834334f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.9167674f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
									AnimationChannel.Interpolations.LINEAR),
							new Keyframe(3f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("Head",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(2.5f, 0f, -2.5f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1f, KeyframeAnimations.degreeVec(2.5f, 0f, 2.5f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(2.5f, 0f, 2.5f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(2.5f, KeyframeAnimations.degreeVec(2.5f, 0f, -2.5f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(3f, KeyframeAnimations.degreeVec(2.5f, 0f, -2.5f),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("Body",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5834334f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.5f, KeyframeAnimations.degreeVec(0f, 0f, 2.5f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(2.0834335f, KeyframeAnimations.degreeVec(0f, 0f, 2.5f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(3f, KeyframeAnimations.degreeVec(0f, 0f, -2.5f),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("Body",
					new AnimationChannel(AnimationChannel.Targets.SCALE,
							new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.75f, KeyframeAnimations.scaleVec(1f, 0.95f, 1f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.5f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(2.25f, KeyframeAnimations.scaleVec(1f, 0.95f, 1f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(3f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
									AnimationChannel.Interpolations.CATMULLROM))).build();
	public static final AnimationDefinition GLARE_FACE_ANGRY = AnimationDefinition.Builder.withLength(1f).looping()
			.addAnimation("neutral",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 1f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("angry",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, -0.05f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("closed",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 1f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("tired",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 1f),
									AnimationChannel.Interpolations.LINEAR))).build();
	public static final AnimationDefinition GLARE_BODY_ANGRY = AnimationDefinition.Builder.withLength(1f).looping()
			.addAnimation("root",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.25f, KeyframeAnimations.posVec(0f, 1f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.75f, KeyframeAnimations.posVec(0f, 1f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("root",
					new AnimationChannel(AnimationChannel.Targets.SCALE,
							new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1.05f, 1f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.16766666f, KeyframeAnimations.scaleVec(1f, 0.98f, 1f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.3433333f, KeyframeAnimations.scaleVec(1f, 1.05f, 1f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5f, KeyframeAnimations.scaleVec(1f, 0.98f, 1f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.6766666f, KeyframeAnimations.scaleVec(1f, 1.05f, 1f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.8343334f, KeyframeAnimations.scaleVec(1f, 0.98f, 1f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1f, KeyframeAnimations.scaleVec(1f, 1.05f, 1f),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("Head",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("Body",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.16766666f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.3433333f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.6766666f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.8343334f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1f, KeyframeAnimations.degreeVec(-2.5f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM))).build();
	public static final AnimationDefinition GLARE_BODY_MOVE = AnimationDefinition.Builder.withLength(1f).looping()
			.addAnimation("root",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0f, 0.25f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1f, KeyframeAnimations.posVec(0f, 0.25f, 0f),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("root",
					new AnimationChannel(AnimationChannel.Targets.SCALE,
							new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1.05f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("Head",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(2.5f, 0f, 0f),
									AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("Body",
					new AnimationChannel(AnimationChannel.Targets.POSITION,
							new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5f, KeyframeAnimations.posVec(0f, 0.25f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("Body",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0f, KeyframeAnimations.degreeVec(12.5f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5f, KeyframeAnimations.degreeVec(15f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1f, KeyframeAnimations.degreeVec(12.5f, 0f, 0f),
									AnimationChannel.Interpolations.CATMULLROM))).build();
}