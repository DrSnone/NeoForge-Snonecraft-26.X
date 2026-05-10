package de.drsnone.snonecraft.block;

import de.drsnone.snonecraft.Snonecraft;
import de.drsnone.snonecraft.block.custom.*;
import de.drsnone.snonecraft.item.ModItems;
import de.drsnone.snonecraft.worldgen.tree.ModTreeGrowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Snonecraft.MOD_ID);

    public static final DeferredBlock<Block> SNONIUM_BLOCK = registerBlock("snonium_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));

    public static final DeferredBlock<Block> RUBY_BLOCK = registerBlock("ruby_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> DIOPSID_BLOCK = registerBlock("diopsid_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> MARBERITH_BLOCK = registerBlock("marberith_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> SMALL_STONE_BRICKS = registerBlock("small_stone_bricks",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));


    public static final DeferredBlock<Block> SNONIUM_BRICK = registerBlock("snonium_brick",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> SNONIUM_BRICK_STAIRS = registerBlock("snonium_brick_stairs",
            properties -> new StairBlock(ModBlocks.SNONIUM_BRICK.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SNONIUM_BRICK_SLAB = registerBlock("snonium_brick_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));



    //AMBER BLOCKS
    public static final DeferredBlock<Block> AMBER_BLOCK = registerBlock("amber_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> AMBER_BLOCK_STAIRS = registerBlock("amber_block_stairs",
            properties -> new StairBlock(ModBlocks.AMBER_BLOCK.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> AMBER_BLOCK_SLAB = registerBlock("amber_block_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> AMBER_BRICK = registerBlock("amber_brick",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> AMBER_BRICK_STAIRS = registerBlock("amber_brick_stairs",
            properties -> new StairBlock(ModBlocks.AMBER_BRICK.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> AMBER_BRICK_SLAB = registerBlock("amber_brick_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));



    //MARBLE BLOCKS
    public static final DeferredBlock<Block> WHITE_MARBLE = registerBlock("white_marble",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> WHITE_POLISHED_MARBLE = registerBlock("white_polished_marble",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));


    public static final DeferredBlock<Block> WHITE_MARBLE_BRICK = registerBlock("white_marble_brick",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> WHITE_MARBLE_BRICK_STAIRS = registerBlock("white_marble_brick_stairs",
            properties -> new StairBlock(ModBlocks.WHITE_MARBLE_BRICK.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITE_MARBLE_BRICK_SLAB = registerBlock("white_marble_brick_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITE_MARBLE_BRICK_WALL = registerBlock("white_marble_brick_wall",
            properties -> new WallBlock(properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn()));


    public static final DeferredBlock<Block> WHITE_MARBLE_BRICK_SMALL = registerBlock("white_marble_brick_small",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> WHITE_MARBLE_BRICK_SMALL_STAIRS = registerBlock("white_marble_brick_small_stairs",
            properties -> new StairBlock(ModBlocks.WHITE_MARBLE_BRICK_SMALL.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITE_MARBLE_BRICK_SMALL_SLAB = registerBlock("white_marble_brick_small_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITE_MARBLE_BRICK_SMALL_WALL = registerBlock("white_marble_brick_small_wall",
            properties -> new WallBlock(properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn()));


    public static final DeferredBlock<Block> WHITE_MARBLE_FANCY = registerBlock("white_marble_fancy",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> WHITE_MARBLE_FANCY_STAIRS = registerBlock("white_marble_fancy_stairs",
            properties -> new StairBlock(ModBlocks.WHITE_MARBLE_FANCY.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITE_MARBLE_FANCY_SLAB = registerBlock("white_marble_fancy_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITE_MARBLE_FANCY_WALL = registerBlock("white_marble_fancy_wall",
            properties -> new WallBlock(properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn()));


    public static final DeferredBlock<Block> WHITE_MARBLE_MOSAIK = registerBlock("white_marble_mosaik",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> WHITE_MARBLE_MOSAIK_STAIRS = registerBlock("white_marble_mosaik_stairs",
            properties -> new StairBlock(ModBlocks.WHITE_MARBLE_MOSAIK.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITE_MARBLE_MOSAIK_SLAB = registerBlock("white_marble_mosaik_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITE_MARBLE_MOSAIK_WALL = registerBlock("white_marble_mosaik_wall",
            properties -> new WallBlock(properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn()));


    public static final DeferredBlock<Block> GREEN_MARBLE = registerBlock("green_marble",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> GREEN_POLISHED_MARBLE = registerBlock("green_polished_marble",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> BROWN_MARBLE = registerBlock("brown_marble",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> BROWN_POLISHED_MARBLE = registerBlock("brown_polished_marble",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));


    public static final DeferredBlock<Block> BLACK_MARBLE = registerBlock("black_marble",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> BLACK_POLISHED_MARBLE = registerBlock("black_polished_marble",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));


    public static final DeferredBlock<Block> BLACK_MARBLE_BRICK = registerBlock("black_marble_brick",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> BLACK_MARBLE_BRICK_STAIRS = registerBlock("black_marble_brick_stairs",
            properties -> new StairBlock(ModBlocks.BLACK_MARBLE_BRICK.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_MARBLE_BRICK_SLAB = registerBlock("black_marble_brick_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_MARBLE_BRICK_WALL = registerBlock("black_marble_brick_wall",
            properties -> new WallBlock(properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn()));


    public static final DeferredBlock<Block> BLACK_MARBLE_COBBLE = registerBlock("black_marble_cobble",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> BLACK_MARBLE_COBBLE_STAIRS = registerBlock("black_marble_cobble_stairs",
            properties -> new StairBlock(ModBlocks.BLACK_MARBLE_COBBLE.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_MARBLE_COBBLE_SLAB = registerBlock("black_marble_cobble_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_MARBLE_COBBLE_WALL = registerBlock("black_marble_cobble_wall",
            properties -> new WallBlock(properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn()));


    public static final DeferredBlock<Block> BLACK_MARBLE_FANCY = registerBlock("black_marble_fancy",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> BLACK_MARBLE_FANCY_STAIRS = registerBlock("black_marble_fancy_stairs",
            properties -> new StairBlock(ModBlocks.BLACK_MARBLE_FANCY.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_MARBLE_FANCY_SLAB = registerBlock("black_marble_fancy_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_MARBLE_FANCY_WALL = registerBlock("black_marble_fancy_wall",
            properties -> new WallBlock(properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn()));




    public static final DeferredBlock<Block> WHITE_MARBLE_STAIRS = registerBlock("white_marble_stairs",
            properties -> new StairBlock(ModBlocks.WHITE_MARBLE.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITE_POLISHED_MARBLE_STAIRS = registerBlock("white_polished_marble_stairs",
            properties -> new StairBlock(ModBlocks.WHITE_POLISHED_MARBLE.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GREEN_MARBLE_STAIRS = registerBlock("green_marble_stairs",
            properties -> new StairBlock(ModBlocks.GREEN_MARBLE.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GREEN_POLISHED_MARBLE_STAIRS = registerBlock("green_polished_marble_stairs",
            properties -> new StairBlock(ModBlocks.GREEN_POLISHED_MARBLE.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BROWN_MARBLE_STAIRS = registerBlock("brown_marble_stairs",
            properties -> new StairBlock(ModBlocks.BROWN_MARBLE.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BROWN_POLISHED_MARBLE_STAIRS = registerBlock("brown_polished_marble_stairs",
            properties -> new StairBlock(ModBlocks.BROWN_POLISHED_MARBLE.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_MARBLE_STAIRS = registerBlock("black_marble_stairs",
            properties -> new StairBlock(ModBlocks.BLACK_MARBLE.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_POLISHED_MARBLE_STAIRS = registerBlock("black_polished_marble_stairs",
            properties -> new StairBlock(ModBlocks.BLACK_POLISHED_MARBLE.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));


    public static final DeferredBlock<Block> WHITE_MARBLE_SLAB = registerBlock("white_marble_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> WHITE_POLISHED_MARBLE_SLAB = registerBlock("white_polished_marble_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GREEN_MARBLE_SLAB = registerBlock("green_marble_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> GREEN_POLISHED_MARBLE_SLAB = registerBlock("green_polished_marble_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BROWN_MARBLE_SLAB = registerBlock("brown_marble_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BROWN_POLISHED_MARBLE_SLAB = registerBlock("brown_polished_marble_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_MARBLE_SLAB = registerBlock("black_marble_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> BLACK_POLISHED_MARBLE_SLAB = registerBlock("black_polished_marble_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));


    public static final DeferredBlock<Block> WHITE_MARBLE_WALL = registerBlock("white_marble_wall",
            properties -> new WallBlock(properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn()));
    public static final DeferredBlock<Block> WHITE_POLISHED_MARBLE_WALL = registerBlock("white_polished_marble_wall",
            properties -> new WallBlock(properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn()));
    public static final DeferredBlock<Block> GREEN_MARBLE_WALL = registerBlock("green_marble_wall",
            properties -> new WallBlock(properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn()));
    public static final DeferredBlock<Block> GREEN_POLISHED_MARBLE_WALL = registerBlock("green_polished_marble_wall",
            properties -> new WallBlock(properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn()));
    public static final DeferredBlock<Block> BROWN_MARBLE_WALL = registerBlock("brown_marble_wall",
            properties -> new WallBlock(properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn()));
    public static final DeferredBlock<Block> BROWN_POLISHED_MARBLE_WALL = registerBlock("brown_polished_marble_wall",
            properties -> new WallBlock(properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn()));
    public static final DeferredBlock<Block> BLACK_MARBLE_WALL = registerBlock("black_marble_wall",
            properties -> new WallBlock(properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn()));
    public static final DeferredBlock<Block> BLACK_POLISHED_MARBLE_WALL = registerBlock("black_polished_marble_wall",
            properties -> new WallBlock(properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn()));


    public static final DeferredBlock<Block> SANDSTONE_BRICK = registerBlock("sandstone_brick",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.METAL)));
    public static final DeferredBlock<Block> SANDSTONE_BRICK_STAIRS = registerBlock("sandstone_brick_stairs",
            properties -> new StairBlock(ModBlocks.SANDSTONE_BRICK.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SANDSTONE_BRICK_SLAB = registerBlock("sandstone_brick_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SANDSTONE_BRICK_WALL = registerBlock("sandstone_brick_wall",
            properties -> new WallBlock(properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn()));


    //ORE BLOCKS
    public static final DeferredBlock<Block> SNONIUM_ORE = registerBlock("snonium_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 4),
                    properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_SNONIUM_ORE = registerBlock("deepslate_snonium_ore",
            properties -> new DropExperienceBlock(UniformInt.of(4, 6),
                    properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> NETHER_SNONIUM_ORE = registerBlock("nether_snonium_ore",
            properties -> new DropExperienceBlock(UniformInt.of(6, 7),
                    properties.strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));



    public static final DeferredBlock<Block> MARBERITH_ORE = registerBlock("marberith_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 4),
                    properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_MARBERITH_ORE = registerBlock("deepslate_marberith_ore",
            properties -> new DropExperienceBlock(UniformInt.of(4, 6),
                    properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final DeferredBlock<Block> NETHER_MARBERITH_ORE = registerBlock("nether_marberith_ore",
            properties -> new DropExperienceBlock(UniformInt.of(6, 7),
                    properties.strength(3.5f).requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));


    public static final DeferredBlock<Block> RUBY_ORE = registerBlock("ruby_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 4),
                    properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            properties -> new DropExperienceBlock(UniformInt.of(4, 6),
                    properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));


    public static final DeferredBlock<Block> DIOPSID_ORE = registerBlock("diopsid_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 4),
                    properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_DIOPSID_ORE = registerBlock("deepslate_diopsid_ore",
            properties -> new DropExperienceBlock(UniformInt.of(4, 6),
                    properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));


    public static final DeferredBlock<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 4),
                    properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            properties -> new DropExperienceBlock(UniformInt.of(4, 6),
                    properties.strength(4f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));


    public static final DeferredBlock<Block> AMBER_ORE = registerBlock("amber_ore",
            properties -> new DropExperienceBlock(UniformInt.of(2, 4),
                    properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));



    //CROP BLOCKS
    public static final DeferredBlock<Block> PICKLE_CROP = BLOCKS.registerBlock("pickle_crop",
            properties -> new PickleCropBlock(properties.mapColor(MapColor.PLANT)
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> ICE_LETTUCE_CROP = BLOCKS.registerBlock("ice_lettuce_crop",
            properties -> new IceLettuceCropBlock(properties.mapColor(MapColor.PLANT)
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> MEAT_TOMATO_CROP = BLOCKS.registerBlock("meat_tomato_crop",
            properties -> new MeatTomatoCropBlock(properties.mapColor(MapColor.PLANT)
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> RED_ONION_CROP = BLOCKS.registerBlock("red_onion_crop",
            properties -> new RedOnionCropBlock(properties.mapColor(MapColor.PLANT)
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> HEMP_CROP = BLOCKS.registerBlock("hemp_crop",
            properties -> new HempCropBlock(properties.mapColor(MapColor.PLANT)
                    .noCollision().randomTicks().instabreak().sound(SoundType.CROP).pushReaction(PushReaction.DESTROY)));


    //HEMP BLOCKS
    public static final DeferredBlock<Block> HEMP_BLOCK = registerBlock("hemp_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.WOOD)));

    public static final DeferredBlock<Block> HEMP_STAIRS = registerBlock("hemp_stairs",
            properties -> new StairBlock(ModBlocks.HEMP_BLOCK.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> HEMP_SLAB = registerBlock("hemp_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> HEMP_PRESSURE_PLATE = registerBlock("hemp_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.IRON,
                    properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn().noCollision().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> HEMP_BUTTON = registerBlock("hemp_button",
            properties -> new ButtonBlock(BlockSetType.IRON, 20,
                    properties.strength(2f).requiresCorrectToolForDrops().noCollision().pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> HEMP_FENCE = registerBlock("hemp_fence",
            properties -> new FenceBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> HEMP_FENCE_GATE = registerBlock("hemp_fence_gate",
            properties -> new FenceGateBlock(WoodType.ACACIA, properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> HEMP_WALL = registerBlock("hemp_wall",
            properties -> new WallBlock(properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn()));

    public static final DeferredBlock<Block> HEMP_DOOR = registerBlock("hemp_door",
            properties -> new DoorBlock(BlockSetType.STONE, properties.strength(2f)
                    .requiresCorrectToolForDrops().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> HEMP_TRAPDOOR = registerBlock("hemp_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.STONE, properties.strength(2f)
                    .requiresCorrectToolForDrops().noOcclusion().isValidSpawn(Blocks::never)));

    //VAMPIRE BLOCKS
    public static final DeferredBlock<Block> VAMPIRE_LOG = registerBlock("vampire_log",
            properties -> new ModFlammableRotatedPillarBlock(properties.sound(SoundType.WOOD).strength(2f)
                    .ignitedByLava()));
    public static final DeferredBlock<Block> VAMPIRE_WOOD = registerBlock("vampire_wood",
            properties -> new ModFlammableRotatedPillarBlock(properties.sound(SoundType.WOOD).strength(2f)
                    .ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_VAMPIRE_LOG = registerBlock("stripped_vampire_log",
            properties -> new ModFlammableRotatedPillarBlock(properties.sound(SoundType.WOOD).strength(2f)
                    .ignitedByLava()));
    public static final DeferredBlock<Block> STRIPPED_VAMPIRE_WOOD = registerBlock("stripped_vampire_wood",
            properties -> new ModFlammableRotatedPillarBlock(properties.sound(SoundType.WOOD).strength(2f)
                    .ignitedByLava()));



    public static final DeferredBlock<Block> VAMPIRE_PLANKS = registerBlock("vampire_planks",
            properties -> new Block(properties.sound(SoundType.WOOD).strength(2f).ignitedByLava()) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });



    public static final DeferredBlock<Block> VAMPIRE_LEAVES = registerBlock("vampire_leaves",
            properties -> new UntintedParticleLeavesBlock(0f, ParticleTypes.CHERRY_LEAVES,
                    properties.mapColor(MapColor.PLANT).strength(0.2F)
                            .randomTicks().sound(SoundType.CHERRY_LEAVES)
                            .noOcclusion().isValidSpawn(Blocks::ocelotOrParrot)
                            .isSuffocating((state, level, pos) -> false)
                            .isViewBlocking((state, level, pos) -> false)
                            .ignitedByLava().pushReaction(PushReaction.DESTROY)
                            .isRedstoneConductor((state, level, pos) -> false)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });



    public static final DeferredBlock<Block> VAMPIRE_SAPLING = registerBlock("vampire_sapling",
            properties -> new SaplingBlock(ModTreeGrowers.VAMPIRE, properties.mapColor(MapColor.PLANT).noCollision()
                    .randomTicks().instabreak().sound(SoundType.GRASS).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> POTTED_VAMPIRE_SAPLING = BLOCKS.registerBlock("potted_vampire_sapling",
            properties -> new FlowerPotBlock(() -> (FlowerPotBlock) Blocks.FLOWER_POT, VAMPIRE_SAPLING,
                    properties.noOcclusion().instabreak().pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> VAMPIRE_STAIRS = registerBlock("vampire_stairs",
            properties -> new StairBlock(ModBlocks.VAMPIRE_PLANKS.get().defaultBlockState(),
                    properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> VAMPIRE_SLAB = registerBlock("vampire_slab",
            properties -> new SlabBlock(properties.strength(2f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> VAMPIRE_PRESSURE_PLATE = registerBlock("vampire_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.ACACIA,
                    properties.strength(2f).requiresCorrectToolForDrops().forceSolidOn().noCollision().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> VAMPIRE_BUTTON = registerBlock("vampire_button",
            properties -> new ButtonBlock(BlockSetType.ACACIA, 20,
                    properties.strength(2f).requiresCorrectToolForDrops().noCollision().pushReaction(PushReaction.DESTROY)));

    public static final DeferredBlock<Block> VAMPIRE_FENCE = registerBlock("vampire_fence",
            properties -> new FenceBlock(properties.strength(2f).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> VAMPIRE_FENCE_GATE = registerBlock("vampire_fence_gate",
            properties -> new FenceGateBlock(WoodType.ACACIA, properties.strength(2f).requiresCorrectToolForDrops()));


    public static final DeferredBlock<Block> VAMPIRE_DOOR = registerBlock("vampire_door",
            properties -> new DoorBlock(BlockSetType.ACACIA, properties.strength(2f)
                    .requiresCorrectToolForDrops().noOcclusion().pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> VAMPIRE_TRAPDOOR = registerBlock("vampire_trapdoor",
            properties -> new TrapDoorBlock(BlockSetType.ACACIA, properties.strength(2f)
                    .requiresCorrectToolForDrops().noOcclusion().isValidSpawn(Blocks::never)));






    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
