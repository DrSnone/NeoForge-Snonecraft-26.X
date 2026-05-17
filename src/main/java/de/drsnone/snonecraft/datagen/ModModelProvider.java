package de.drsnone.snonecraft.datagen;

import de.drsnone.snonecraft.Snonecraft;
import de.drsnone.snonecraft.block.ModBlocks;
import de.drsnone.snonecraft.block.custom.*;
import de.drsnone.snonecraft.item.ModArmorMaterials;
import de.drsnone.snonecraft.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;


import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.function.Function;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, Snonecraft.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        /* ITEMS */
        itemModels.generateFlatItem(ModItems.SNONIUM_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_SNONIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_RUBY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.DIOPSID.get(),  ModelTemplates.FLAT_ITEM );
        itemModels.generateFlatItem(ModItems.RAW_DIOPSID.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SAPPHIRE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_SAPPHIRE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.AMBER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_AMBER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.MARBERITH.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_MARBERITH.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.PICKLE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ICE_LETTUCE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.MEAT_TOMATO.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RED_ONION.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.HEMP.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.HEMP_CLUMP.get(), ModelTemplates.FLAT_ITEM);




        itemModels.generateFlatItem(ModItems.FETA_CHEESE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.FLATBREAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.GRILLED_KEBAB_PIKE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.JAR_YOGU_SOUCE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.KEBAB_MEAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.QUARTER_FLATBREAD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_KEBAB_PIKE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SNOENER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.SNOENER_BOX.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_BAT_BEEF.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_BAT_PATTY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.GRILLED_BAT_PATTY.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BAT_BURGER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BAT_WING.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BAT_LEATHER.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.SNONIUM_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SNONIUM_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SNONIUM_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SNONIUM_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SNONIUM_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SNONIUM_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(ModItems.MARBERITH_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.MARBERITH_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.MARBERITH_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.MARBERITH_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.MARBERITH_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(ModItems.RUBY_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBY_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(ModItems.DIOPSID_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.DIOPSID_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.DIOPSID_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.DIOPSID_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.DIOPSID_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.DIOPSID_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(ModItems.SAPPHIRE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SAPPHIRE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SAPPHIRE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SAPPHIRE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SAPPHIRE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.SAPPHIRE_HAMMER.get(), ModelTemplates.FLAT_HANDHELD_ITEM);


        itemModels.generateTrimmableItem(ModItems.SNONIUM_HELMET.get(), ModArmorMaterials.SNONIUM_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(ModItems.SNONIUM_CHESTPLATE.get(), ModArmorMaterials.SNONIUM_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModels.generateTrimmableItem(ModItems.SNONIUM_LEGGINGS.get(), ModArmorMaterials.SNONIUM_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModels.generateTrimmableItem(ModItems.SNONIUM_BOOTS.get(), ModArmorMaterials.SNONIUM_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModels.generateTrimmableItem(ModItems.MARBERITH_HELMET.get(), ModArmorMaterials.MARBERITH_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(ModItems.MARBERITH_CHESTPLATE.get(), ModArmorMaterials.MARBERITH_KEY, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
        itemModels.generateTrimmableItem(ModItems.MARBERITH_LEGGINGS.get(), ModArmorMaterials.MARBERITH_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModels.generateTrimmableItem(ModItems.MARBERITH_BOOTS.get(), ModArmorMaterials.MARBERITH_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModels.generateTrimmableItem(ModItems.RUBY_HELMET.get(), ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(ModItems.RUBY_CHESTPLATE.get(), ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(ModItems.RUBY_LEGGINGS.get(), ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
        itemModels.generateTrimmableItem(ModItems.RUBY_BOOTS.get(), ModArmorMaterials.RUBY_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModels.generateTrimmableItem(ModItems.DIOPSID_HELMET.get(), ModArmorMaterials.DIOPSID_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(ModItems.DIOPSID_CHESTPLATE.get(), ModArmorMaterials.DIOPSID_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(ModItems.DIOPSID_LEGGINGS.get(), ModArmorMaterials.DIOPSID_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(ModItems.DIOPSID_BOOTS.get(), ModArmorMaterials.DIOPSID_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModels.generateTrimmableItem(ModItems.SAPPHIRE_HELMET.get(), ModArmorMaterials.SAPPHIRE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(ModItems.SAPPHIRE_CHESTPLATE.get(), ModArmorMaterials.SAPPHIRE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(ModItems.SAPPHIRE_LEGGINGS.get(), ModArmorMaterials.SAPPHIRE_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(ModItems.SAPPHIRE_BOOTS.get(), ModArmorMaterials.SAPPHIRE_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModels.generateTrimmableItem(ModItems.BAT_HELMET.get(), ModArmorMaterials.BAT_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(ModItems.BAT_CHESTPLATE.get(), ModArmorMaterials.BAT_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(ModItems.BAT_LEGGINGS.get(), ModArmorMaterials.BAT_KEY, ItemModelGenerators.TRIM_PREFIX_HELMET, false);
        itemModels.generateTrimmableItem(ModItems.BAT_BOOTS.get(), ModArmorMaterials.BAT_KEY, ItemModelGenerators.TRIM_PREFIX_BOOTS, false);

        itemModels.generateFlatItem(ModItems.VAMPIRE_BOAT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.VAMPIRE_CHEST_BOAT.get(), ModelTemplates.FLAT_ITEM);




        /*BLOCKS*/
        blockModels.createTrivialCube(ModBlocks.SNONIUM_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.SNONIUM_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_SNONIUM_ORE.get());
        blockModels.createTrivialCube(ModBlocks.NETHER_SNONIUM_ORE.get());

        blockModels.createTrivialCube(ModBlocks.MARBERITH_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.MARBERITH_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_MARBERITH_ORE.get());
        blockModels.createTrivialCube(ModBlocks.NETHER_MARBERITH_ORE.get());

        blockModels.createTrivialCube(ModBlocks.RUBY_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_RUBY_ORE.get());
        blockModels.createTrivialCube(ModBlocks.RUBY_BLOCK.get());

        blockModels.createTrivialCube(ModBlocks.DIOPSID_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_DIOPSID_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DIOPSID_BLOCK.get());

        blockModels.createTrivialCube(ModBlocks.SAPPHIRE_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
        blockModels.createTrivialCube(ModBlocks.SAPPHIRE_BLOCK.get());

        blockModels.createTrivialCube(ModBlocks.SMALL_STONE_BRICKS.get());

        blockModels.createTrivialCube(ModBlocks.AMBER_ORE.get());

        blockModels.family(ModBlocks.AMBER_BLOCK.get())
                .stairs(ModBlocks.AMBER_BLOCK_STAIRS.get())
                .slab(ModBlocks.AMBER_BLOCK_SLAB.get());

        blockModels.family(ModBlocks.AMBER_BRICK.get())
                .stairs(ModBlocks.AMBER_BRICK_STAIRS.get())
                .slab(ModBlocks.AMBER_BRICK_SLAB.get());

        blockModels.family(ModBlocks.SNONIUM_BRICK.get())
                .stairs(ModBlocks.SNONIUM_BRICK_STAIRS.get())
                .slab(ModBlocks.SNONIUM_BRICK_SLAB.get());

        blockModels.family(ModBlocks.WHITE_MARBLE.get())
                .stairs(ModBlocks.WHITE_MARBLE_STAIRS.get())
                .slab(ModBlocks.WHITE_MARBLE_SLAB.get())
                .wall(ModBlocks.WHITE_MARBLE_WALL.get());

        blockModels.family(ModBlocks.WHITE_POLISHED_MARBLE.get())
                .stairs(ModBlocks.WHITE_POLISHED_MARBLE_STAIRS.get())
                .slab(ModBlocks.WHITE_POLISHED_MARBLE_SLAB.get())
                .wall(ModBlocks.WHITE_POLISHED_MARBLE_WALL.get());

        blockModels.family(ModBlocks.GREEN_MARBLE.get())
                .stairs(ModBlocks.GREEN_MARBLE_STAIRS.get())
                .slab(ModBlocks.GREEN_MARBLE_SLAB.get())
                .wall(ModBlocks.GREEN_MARBLE_WALL.get());

        blockModels.family(ModBlocks.GREEN_POLISHED_MARBLE.get())
                .stairs(ModBlocks.GREEN_POLISHED_MARBLE_STAIRS.get())
                .slab(ModBlocks.GREEN_POLISHED_MARBLE_SLAB.get())
                .wall(ModBlocks.GREEN_POLISHED_MARBLE_WALL.get());

        blockModels.family(ModBlocks.BROWN_MARBLE.get())
                .stairs(ModBlocks.BROWN_MARBLE_STAIRS.get())
                .slab(ModBlocks.BROWN_MARBLE_SLAB.get())
                .wall(ModBlocks.BROWN_MARBLE_WALL.get());

        blockModels.family(ModBlocks.BROWN_POLISHED_MARBLE.get())
                .stairs(ModBlocks.BROWN_POLISHED_MARBLE_STAIRS.get())
                .slab(ModBlocks.BROWN_POLISHED_MARBLE_SLAB.get())
                .wall(ModBlocks.BROWN_POLISHED_MARBLE_WALL.get());

        blockModels.family(ModBlocks.BLACK_MARBLE.get())
                .stairs(ModBlocks.BLACK_MARBLE_STAIRS.get())
                .slab(ModBlocks.BLACK_MARBLE_SLAB.get())
                .wall(ModBlocks.BLACK_MARBLE_WALL.get());

        blockModels.family(ModBlocks.BLACK_POLISHED_MARBLE.get())
                .stairs(ModBlocks.BLACK_POLISHED_MARBLE_STAIRS.get())
                .slab(ModBlocks.BLACK_POLISHED_MARBLE_SLAB.get())
                .wall(ModBlocks.BLACK_POLISHED_MARBLE_WALL.get());

        blockModels.family(ModBlocks.WHITE_MARBLE_BRICK.get())
                .stairs(ModBlocks.WHITE_MARBLE_BRICK_STAIRS.get())
                .slab(ModBlocks.WHITE_MARBLE_BRICK_SLAB.get())
                .wall(ModBlocks.WHITE_MARBLE_BRICK_WALL.get());

        blockModels.family(ModBlocks.WHITE_MARBLE_BRICK_SMALL.get())
                .stairs(ModBlocks.WHITE_MARBLE_BRICK_SMALL_STAIRS.get())
                .slab(ModBlocks.WHITE_MARBLE_BRICK_SMALL_SLAB.get())
                .wall(ModBlocks.WHITE_MARBLE_BRICK_SMALL_WALL.get());

        blockModels.family(ModBlocks.WHITE_MARBLE_FANCY.get())
                .stairs(ModBlocks.WHITE_MARBLE_FANCY_STAIRS.get())
                .slab(ModBlocks.WHITE_MARBLE_FANCY_SLAB.get())
                .wall(ModBlocks.WHITE_MARBLE_FANCY_WALL.get());

        blockModels.family(ModBlocks.WHITE_MARBLE_MOSAIK.get())
                .stairs(ModBlocks.WHITE_MARBLE_MOSAIK_STAIRS.get())
                .slab(ModBlocks.WHITE_MARBLE_MOSAIK_SLAB.get())
                .wall(ModBlocks.WHITE_MARBLE_MOSAIK_WALL.get());

        blockModels.family(ModBlocks.BLACK_MARBLE_BRICK.get())
                .stairs(ModBlocks.BLACK_MARBLE_BRICK_STAIRS.get())
                .slab(ModBlocks.BLACK_MARBLE_BRICK_SLAB.get())
                .wall(ModBlocks.BLACK_MARBLE_BRICK_WALL.get());

        blockModels.family(ModBlocks.BLACK_MARBLE_COBBLE.get())
                .stairs(ModBlocks.BLACK_MARBLE_COBBLE_STAIRS.get())
                .slab(ModBlocks.BLACK_MARBLE_COBBLE_SLAB.get())
                .wall(ModBlocks.BLACK_MARBLE_COBBLE_WALL.get());

        blockModels.family(ModBlocks.BLACK_MARBLE_FANCY.get())
                .stairs(ModBlocks.BLACK_MARBLE_FANCY_STAIRS.get())
                .slab(ModBlocks.BLACK_MARBLE_FANCY_SLAB.get())
                .wall(ModBlocks.BLACK_MARBLE_FANCY_WALL.get());

        blockModels.family(ModBlocks.SANDSTONE_BRICK.get())
                .stairs(ModBlocks.SANDSTONE_BRICK_STAIRS.get())
                .slab(ModBlocks.SANDSTONE_BRICK_SLAB.get())
                .wall(ModBlocks.SANDSTONE_BRICK_WALL.get());

        blockModels.createCropBlock(ModBlocks.PICKLE_CROP.get(), PickleCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockModels.createCropBlock(ModBlocks.ICE_LETTUCE_CROP.get(), IceLettuceCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockModels.createCropBlock(ModBlocks.MEAT_TOMATO_CROP.get(), MeatTomatoCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockModels.createCropBlock(ModBlocks.RED_ONION_CROP.get(), RedOnionCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockModels.createCropBlock(ModBlocks.HEMP_CROP.get(), HempCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);



        blockModels.family(ModBlocks.VAMPIRE_PLANKS.get())
                .stairs(ModBlocks.VAMPIRE_STAIRS.get())
                .slab(ModBlocks.VAMPIRE_SLAB.get())
                .pressurePlate(ModBlocks.VAMPIRE_PRESSURE_PLATE.get())
                .button(ModBlocks.VAMPIRE_BUTTON.get())
                .fence(ModBlocks.VAMPIRE_FENCE.get())
                .fenceGate(ModBlocks.VAMPIRE_FENCE_GATE.get())
                .door(ModBlocks.VAMPIRE_DOOR.get())
                .trapdoor(ModBlocks.VAMPIRE_TRAPDOOR.get());

        blockModels.woodProvider(ModBlocks.VAMPIRE_LOG.get()).logWithHorizontal(ModBlocks.VAMPIRE_LOG.get()).wood(ModBlocks.VAMPIRE_WOOD.get());
        blockModels.woodProvider(ModBlocks.STRIPPED_VAMPIRE_LOG.get()).logWithHorizontal(ModBlocks.STRIPPED_VAMPIRE_LOG.get()).wood(ModBlocks.STRIPPED_VAMPIRE_WOOD.get());


        blockModels.createTintedLeaves(ModBlocks.VAMPIRE_LEAVES.get(), TexturedModel.LEAVES, -12012255);
        blockModels.createPlant(ModBlocks.VAMPIRE_SAPLING.get(), ModBlocks.POTTED_VAMPIRE_SAPLING.get(), BlockModelGenerators.PlantType.TINTED);



        //HEMP BLOCKS
        blockModels.family(ModBlocks.HEMP_BLOCK.get())
                .stairs(ModBlocks.HEMP_STAIRS.get())
                .slab(ModBlocks.HEMP_SLAB.get())
                .wall(ModBlocks.HEMP_WALL.get())
                .pressurePlate(ModBlocks.HEMP_PRESSURE_PLATE.get())
                .button(ModBlocks.HEMP_BUTTON.get())
                .fence(ModBlocks.HEMP_FENCE.get())
                .fenceGate(ModBlocks.HEMP_FENCE_GATE.get())
                .door(ModBlocks.HEMP_DOOR.get())
                .trapdoor(ModBlocks.HEMP_TRAPDOOR.get());




    }

















}
