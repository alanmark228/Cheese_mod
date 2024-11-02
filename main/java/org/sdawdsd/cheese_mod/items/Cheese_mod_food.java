package org.sdawdsd.cheese_mod.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class Cheese_mod_food {
    public static final FoodProperties CHEEESE_FOOD= new FoodProperties.Builder()
            .nutrition(6)
            .effect(()->new MobEffectInstance(MobEffects.SATURATION,60),0.1f)
            .build();

}
