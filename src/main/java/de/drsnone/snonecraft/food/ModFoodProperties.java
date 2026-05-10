package de.drsnone.snonecraft.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModFoodProperties {
    public static final FoodProperties PICKLE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).build();
    public static final Consumable PICKLE_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100), 0.45f)).build();

    public static final FoodProperties ICE_LETTUCE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final Consumable ICE_LETTUCE_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100), 0.45f)).build();

    public static final FoodProperties MEAT_TOMATO = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final Consumable MEAT_TOMATO_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100), 0.45f)).build();

    public static final FoodProperties RED_ONION = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final Consumable RED_ONION_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100), 0.45f)).build();

    public static final FoodProperties FLATBREAD = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final Consumable FLATBREAD_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 200), 0.45f)).build();

    public static final FoodProperties QUARTER_FLATBREAD = new FoodProperties.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final Consumable QUARTER_FLATBREAD_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 150), 0.45f)).build();

    public static final FoodProperties FETA_CHEESE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3f).build();
    public static final Consumable FETA_CHEESE_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100), 0.45f)).build();

    public static final FoodProperties JAR_YOGU_SOUCE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.3f).build();
    public static final Consumable JAR_YOGU_SOUCE_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100), 0.45f)).build();

    public static final FoodProperties KEBAB_MEAT = new FoodProperties.Builder().saturationModifier(0.5f).build();
    public static final Consumable KEBAB_MEAT_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100), 0.45f)).build();

    public static final FoodProperties RAW_KEBAB_PIKE = new FoodProperties.Builder().saturationModifier(0.2f).build();
    public static final Consumable RAW_KEBAB_PIKE_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100), 0.45f)).build();

    public static final FoodProperties GRILLED_KEBAB_PIKE = new FoodProperties.Builder().saturationModifier(0.5f).build();
    public static final Consumable GRILLED_KEBAB_PIKE_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100), 0.45f)).build();

    public static final FoodProperties SNOENER = new FoodProperties.Builder().saturationModifier(0.8f).build();
    public static final Consumable SNOENER_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.45f)).build();

    public static final FoodProperties SNOENER_BOX = new FoodProperties.Builder().saturationModifier(0.8f).build();
    public static final Consumable SNOENER_BOX_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.45f)).build();

    public static final FoodProperties RAW_BAT_BEEF = new FoodProperties.Builder().saturationModifier(0.5f).build();
    public static final Consumable RAW_BAT_BEEF_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100), 0.45f)).build();

    public static final FoodProperties RAW_BAT_PATTY = new FoodProperties.Builder().saturationModifier(0.5f).build();
    public static final Consumable RAW_BAT_PATTY_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100), 0.45f)).build();

    public static final FoodProperties GRILLED_BAT_PATTY = new FoodProperties.Builder().saturationModifier(0.5f).build();
    public static final Consumable GRILLED_BAT_PATTY_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100), 0.45f)).build();

    public static final FoodProperties BAT_BURGER = new FoodProperties.Builder().saturationModifier(0.5f).build();
    public static final Consumable BAT_BURGER_EFFECT = Consumables.defaultFood().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 350), 0.45f)).build();
}
