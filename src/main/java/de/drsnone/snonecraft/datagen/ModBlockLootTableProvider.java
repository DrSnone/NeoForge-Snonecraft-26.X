package de.drsnone.snonecraft.datagen;

import de.drsnone.snonecraft.block.ModBlocks;
import de.drsnone.snonecraft.block.custom.PickleCropBlock;
import de.drsnone.snonecraft.item.ModItems;

import net.minecraft.advancements.criterion.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;

import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;


import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    public ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        var enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        dropSelf(ModBlocks.SNONIUM_BLOCK.get());
        dropSelf(ModBlocks.AMBER_BLOCK.get());
        dropSelf(ModBlocks.AMBER_BLOCK_STAIRS.get());
        add(ModBlocks.AMBER_BLOCK_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.AMBER_BRICK.get());
        dropSelf(ModBlocks.AMBER_BRICK_STAIRS.get());
        add(ModBlocks.AMBER_BRICK_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.DIOPSID_BLOCK.get());
        dropSelf(ModBlocks.MARBERITH_BLOCK.get());
        dropSelf(ModBlocks.RUBY_BLOCK.get());
        dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        dropSelf(ModBlocks.SMALL_STONE_BRICKS.get());
        dropSelf(ModBlocks.SNONIUM_BRICK.get());
        dropSelf(ModBlocks.SNONIUM_BRICK_STAIRS.get());
        add(ModBlocks.SNONIUM_BRICK_SLAB.get(), this::createSlabItemTable);


        dropSelf(ModBlocks.WHITE_MARBLE.get());
        dropSelf(ModBlocks.WHITE_POLISHED_MARBLE.get());
        dropSelf(ModBlocks.GREEN_MARBLE.get());
        dropSelf(ModBlocks.GREEN_POLISHED_MARBLE.get());
        dropSelf(ModBlocks.BROWN_MARBLE.get());
        dropSelf(ModBlocks.BROWN_POLISHED_MARBLE.get());
        dropSelf(ModBlocks.BLACK_MARBLE.get());
        dropSelf(ModBlocks.BLACK_POLISHED_MARBLE.get());

        dropSelf(ModBlocks.WHITE_MARBLE_STAIRS.get());
        dropSelf(ModBlocks.WHITE_POLISHED_MARBLE_STAIRS.get());
        dropSelf(ModBlocks.GREEN_MARBLE_STAIRS.get());
        dropSelf(ModBlocks.GREEN_POLISHED_MARBLE_STAIRS.get());
        dropSelf(ModBlocks.BROWN_MARBLE_STAIRS.get());
        dropSelf(ModBlocks.BROWN_POLISHED_MARBLE_STAIRS.get());
        dropSelf(ModBlocks.BLACK_MARBLE_STAIRS.get());
        dropSelf(ModBlocks.BLACK_POLISHED_MARBLE_STAIRS.get());

        dropSelf(ModBlocks.WHITE_MARBLE_WALL.get());
        dropSelf(ModBlocks.WHITE_POLISHED_MARBLE_WALL.get());
        dropSelf(ModBlocks.GREEN_MARBLE_WALL.get());
        dropSelf(ModBlocks.GREEN_POLISHED_MARBLE_WALL.get());
        dropSelf(ModBlocks.BROWN_MARBLE_WALL.get());
        dropSelf(ModBlocks.BROWN_POLISHED_MARBLE_WALL.get());
        dropSelf(ModBlocks.BLACK_MARBLE_WALL.get());
        dropSelf(ModBlocks.BLACK_POLISHED_MARBLE_WALL.get());

        add(ModBlocks.WHITE_MARBLE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.WHITE_POLISHED_MARBLE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.GREEN_MARBLE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.GREEN_POLISHED_MARBLE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.BROWN_MARBLE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.BROWN_POLISHED_MARBLE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.BLACK_MARBLE_SLAB.get(), this::createSlabItemTable);
        add(ModBlocks.BLACK_POLISHED_MARBLE_SLAB.get(), this::createSlabItemTable);

        dropSelf(ModBlocks.WHITE_MARBLE_BRICK.get());
        dropSelf(ModBlocks.WHITE_MARBLE_BRICK_STAIRS.get());
        add(ModBlocks.WHITE_MARBLE_BRICK_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.WHITE_MARBLE_BRICK_WALL.get());

        dropSelf(ModBlocks.WHITE_MARBLE_BRICK_SMALL.get());
        dropSelf(ModBlocks.WHITE_MARBLE_BRICK_SMALL_STAIRS.get());
        add(ModBlocks.WHITE_MARBLE_BRICK_SMALL_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.WHITE_MARBLE_BRICK_SMALL_WALL.get());

        dropSelf(ModBlocks.WHITE_MARBLE_FANCY.get());
        dropSelf(ModBlocks.WHITE_MARBLE_FANCY_STAIRS.get());
        add(ModBlocks.WHITE_MARBLE_FANCY_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.WHITE_MARBLE_FANCY_WALL.get());

        dropSelf(ModBlocks.WHITE_MARBLE_MOSAIK.get());
        dropSelf(ModBlocks.WHITE_MARBLE_MOSAIK_STAIRS.get());
        add(ModBlocks.WHITE_MARBLE_MOSAIK_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.WHITE_MARBLE_MOSAIK_WALL.get());

        dropSelf(ModBlocks.BLACK_MARBLE_BRICK.get());
        dropSelf(ModBlocks.BLACK_MARBLE_BRICK_STAIRS.get());
        add(ModBlocks.BLACK_MARBLE_BRICK_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.BLACK_MARBLE_BRICK_WALL.get());

        dropSelf(ModBlocks.BLACK_MARBLE_COBBLE.get());
        dropSelf(ModBlocks.BLACK_MARBLE_COBBLE_STAIRS.get());
        add(ModBlocks.BLACK_MARBLE_COBBLE_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.BLACK_MARBLE_COBBLE_WALL.get());

        dropSelf(ModBlocks.BLACK_MARBLE_FANCY.get());
        dropSelf(ModBlocks.BLACK_MARBLE_FANCY_STAIRS.get());
        add(ModBlocks.BLACK_MARBLE_FANCY_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.BLACK_MARBLE_FANCY_WALL.get());

        dropSelf(ModBlocks.WHITE_MARBLE.get());
        dropSelf(ModBlocks.WHITE_MARBLE_STAIRS.get());
        add(ModBlocks.WHITE_MARBLE_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.WHITE_MARBLE_WALL.get());

        dropSelf(ModBlocks.SANDSTONE_BRICK.get());
        dropSelf(ModBlocks.SANDSTONE_BRICK_STAIRS.get());
        add(ModBlocks.SANDSTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.SANDSTONE_BRICK_WALL.get());



        dropSelf(ModBlocks.HEMP_BLOCK.get());
        dropSelf(ModBlocks.HEMP_STAIRS.get());
        add(ModBlocks.HEMP_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.HEMP_WALL.get());

        dropSelf(ModBlocks.HEMP_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.HEMP_BUTTON.get());

        dropSelf(ModBlocks.HEMP_FENCE.get());
        dropSelf(ModBlocks.HEMP_FENCE_GATE.get());

        dropSelf(ModBlocks.HEMP_TRAPDOOR.get());
        add(ModBlocks.HEMP_DOOR.get(), this::createDoorTable);


        add(ModBlocks.SNONIUM_ORE.get(), block -> createOreDrop(block, ModItems.RAW_SNONIUM.get()));
        add(ModBlocks.DEEPSLATE_SNONIUM_ORE.get(), block -> createMultipleOreDrops(block, ModItems.RAW_SNONIUM.get(), 2, 5));
        add(ModBlocks.NETHER_SNONIUM_ORE.get(), block -> createMultipleOreDrops(block, ModItems.RAW_SNONIUM.get(), 4, 6));

        add(ModBlocks.MARBERITH_ORE.get(), block -> createOreDrop(block, ModItems.RAW_MARBERITH.get()));
        add(ModBlocks.DEEPSLATE_MARBERITH_ORE.get(), block -> createMultipleOreDrops(block, ModItems.RAW_MARBERITH.get(), 2, 5));
        add(ModBlocks.NETHER_MARBERITH_ORE.get(), block -> createMultipleOreDrops(block, ModItems.RAW_MARBERITH.get(), 4, 6));

        add(ModBlocks.RUBY_ORE.get(), block -> createOreDrop(block, ModItems.RAW_RUBY.get()));
        add(ModBlocks.DEEPSLATE_RUBY_ORE.get(), block -> createMultipleOreDrops(block, ModItems.RAW_RUBY.get(), 2, 5));

        add(ModBlocks.DIOPSID_ORE.get(), block -> createOreDrop(block, ModItems.RAW_DIOPSID.get()));
        add(ModBlocks.DEEPSLATE_DIOPSID_ORE.get(), block -> createMultipleOreDrops(block, ModItems.RAW_DIOPSID.get(), 2, 5));

        add(ModBlocks.SAPPHIRE_ORE.get(), block -> createOreDrop(block, ModItems.RAW_SAPPHIRE.get()));
        add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get(), block -> createMultipleOreDrops(block, ModItems.RAW_SAPPHIRE.get(), 2, 5));

        add(ModBlocks.AMBER_ORE.get(), block -> createOreDrop(block, ModItems.RAW_AMBER.get()));


        add(ModBlocks.PICKLE_CROP.get(), createCropDrops(ModBlocks.PICKLE_CROP.get(), ModItems.PICKLE.get(),
                ModItems.PICKLE_SEEDS.get(), LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.PICKLE_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PickleCropBlock.AGE, 5))));

        add(ModBlocks.ICE_LETTUCE_CROP.get(), createCropDrops(ModBlocks.ICE_LETTUCE_CROP.get(), ModItems.ICE_LETTUCE.get(),
                ModItems.ICE_LETTUCE_SEEDS.get(), LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.ICE_LETTUCE_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PickleCropBlock.AGE, 5))));

        add(ModBlocks.MEAT_TOMATO_CROP.get(), createCropDrops(ModBlocks.MEAT_TOMATO_CROP.get(), ModItems.MEAT_TOMATO.get(),
                ModItems.MEAT_TOMATO_SEEDS.get(), LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.MEAT_TOMATO_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PickleCropBlock.AGE, 5))));

        add(ModBlocks.RED_ONION_CROP.get(), createCropDrops(ModBlocks.RED_ONION_CROP.get(), ModItems.RED_ONION.get(),
                ModItems.RED_ONION_SEEDS.get(), LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.RED_ONION_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PickleCropBlock.AGE, 5))));

        add(ModBlocks.HEMP_CROP.get(), createCropDrops(ModBlocks.HEMP_CROP.get(), ModItems.HEMP.get(),
                ModItems.HEMP_SEEDS.get(), LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.HEMP_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PickleCropBlock.AGE, 5))));


        dropSelf(ModBlocks.VAMPIRE_LOG.get());
        dropSelf(ModBlocks.VAMPIRE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_VAMPIRE_LOG.get());
        dropSelf(ModBlocks.STRIPPED_VAMPIRE_WOOD.get());

        dropSelf(ModBlocks.VAMPIRE_PLANKS.get());
        dropSelf(ModBlocks.VAMPIRE_SAPLING.get());


        add(ModBlocks.POTTED_VAMPIRE_SAPLING.get(), createPotFlowerItemTable(ModBlocks.POTTED_VAMPIRE_SAPLING.get()));
        add(ModBlocks.VAMPIRE_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.VAMPIRE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));


        dropSelf(ModBlocks.VAMPIRE_STAIRS.get());
        add(ModBlocks.VAMPIRE_SLAB.get(), this::createSlabItemTable);

        dropSelf(ModBlocks.VAMPIRE_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.VAMPIRE_BUTTON.get());

        dropSelf(ModBlocks.VAMPIRE_FENCE.get());
        dropSelf(ModBlocks.VAMPIRE_FENCE_GATE.get());

        dropSelf(ModBlocks.VAMPIRE_TRAPDOOR.get());
        add(ModBlocks.VAMPIRE_DOOR.get(), this::createDoorTable);

    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(pBlock, this.applyExplosionDecay(pBlock,
                LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))));
       }


        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
        }
}
