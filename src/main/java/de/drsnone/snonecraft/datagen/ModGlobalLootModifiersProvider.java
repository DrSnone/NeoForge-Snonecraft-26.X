package de.drsnone.snonecraft.datagen;

import de.drsnone.snonecraft.Snonecraft;
import de.drsnone.snonecraft.item.ModItems;

import de.drsnone.snonecraft.loot.AddItemStackModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;

import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Snonecraft.MOD_ID);
    }

    @Override
    protected void start() {
        add("pickle_seed_to_short_grass",
                new AddItemStackModifier(new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.SHORT_GRASS).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build() }, new ItemStackTemplate(ModItems.PICKLE_SEEDS.get(), 2)));
        add("pickle_seed_to_tall_grass",
                new AddItemStackModifier(new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.TALL_GRASS).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build() }, new ItemStackTemplate(ModItems.PICKLE_SEEDS.get(), 2)));

        add("meat_tomato_seed_to_short_grass",
                new AddItemStackModifier(new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.SHORT_GRASS).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build() }, new ItemStackTemplate(ModItems.MEAT_TOMATO_SEEDS.get(), 2)));
        add("meat_tomato_seed_to_tall_grass",
                new AddItemStackModifier(new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.TALL_GRASS).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build() }, new ItemStackTemplate(ModItems.MEAT_TOMATO_SEEDS.get(), 2)));

        add("ice_lettuce_seed_to_short_grass",
                new AddItemStackModifier(new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.SHORT_GRASS).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build() }, new ItemStackTemplate(ModItems.ICE_LETTUCE_SEEDS.get(), 2)));
        add("ice_lettuce_seed_to_tall_grass",
                new AddItemStackModifier(new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.TALL_GRASS).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build() }, new ItemStackTemplate(ModItems.ICE_LETTUCE_SEEDS.get(), 2)));

        add("red_onion_seed_to_short_grass",
                new AddItemStackModifier(new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.SHORT_GRASS).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build() }, new ItemStackTemplate(ModItems.RED_ONION_SEEDS.get(), 2)));
        add("red_onion_seed_to_tall_grass",
                new AddItemStackModifier(new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.TALL_GRASS).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build() }, new ItemStackTemplate(ModItems.RED_ONION_SEEDS.get(), 2)));

        add("hemp_seed_to_short_grass",
                new AddItemStackModifier(new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.SHORT_GRASS).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build() }, new ItemStackTemplate(ModItems.HEMP_SEEDS.get(), 2)));
        add("hemp_seed_to_tall_grass",
                new AddItemStackModifier(new LootItemCondition[]{
                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.TALL_GRASS).build(),
                        LootItemRandomChanceCondition.randomChance(0.25f).build() }, new ItemStackTemplate(ModItems.HEMP_SEEDS.get(), 2)));

        add("bat_wing_to_bat",
                new AddItemStackModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(Identifier.withDefaultNamespace("entities/bat")).build() },
                        new ItemStackTemplate(ModItems.BAT_WING.get())));

        add("raw_bat_beef_to_bat",
                new AddItemStackModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(Identifier.withDefaultNamespace("entities/bat")).build() },
                        new ItemStackTemplate(ModItems.RAW_BAT_BEEF.get())));





    }
}
