package com.rinko1231.va11halla;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;


public class VHFoodValues {

    public static final FoodProperties SOFT_DRINKS = (new FoodProperties.Builder())
            .nutrition(5).saturationMod(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 210, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 210, 0), 1.0F)
            .build();
    public static final FoodProperties HARD_DRINKS = (new FoodProperties.Builder())
            .nutrition(5).saturationMod(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 160, 0), 0.33F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 210, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 320, 0), 1.0F)
            .build();
    public static final FoodProperties HARDER_DRINKS = (new FoodProperties.Builder())
            .nutrition(6).saturationMod(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 160, 0), 0.6F)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 200, 0), 0.5F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 210, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 320, 1), 1.0F)
            .build();
    public static final FoodProperties HARDEST_DRINKS = (new FoodProperties.Builder())
            .nutrition(7).saturationMod(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 160, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 200, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 240, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300, 0), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 320, 2), 1.0F)
            .build();
    public static final FoodProperties JUNK = (new FoodProperties.Builder())
            .nutrition(3).saturationMod(1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 320, 0), 0.5F)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 320, 0), 0.33F)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 320, 0), 0.33F)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 320, 0), 0.33F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 320, 0), 0.33F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 320, 0), 0.33F)
            .effect(() -> new MobEffectInstance(MobEffects.DARKNESS, 320, 0), 0.33F)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 320, 0), 0.33F)
            .build();

}