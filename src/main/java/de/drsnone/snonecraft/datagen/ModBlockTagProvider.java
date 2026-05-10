package de.drsnone.snonecraft.datagen;

import de.drsnone.snonecraft.Snonecraft;
import de.drsnone.snonecraft.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;



import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Snonecraft.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.SNONIUM_BLOCK.get())
                .add(ModBlocks.SNONIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_SNONIUM_ORE.get())
                .add(ModBlocks.NETHER_SNONIUM_ORE.get())
                .add(ModBlocks.SMALL_STONE_BRICKS.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.DEEPSLATE_RUBY_ORE.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.DIOPSID_ORE.get())
                .add(ModBlocks.DEEPSLATE_DIOPSID_ORE.get())
                .add(ModBlocks.DIOPSID_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.AMBER_ORE.get())
                .add(ModBlocks.AMBER_BLOCK.get())
                .add(ModBlocks.AMBER_BLOCK_STAIRS.get())
                .add(ModBlocks.AMBER_BLOCK_SLAB.get())
                .add(ModBlocks.AMBER_BRICK.get())
                .add(ModBlocks.AMBER_BRICK_STAIRS.get())
                .add(ModBlocks.AMBER_BRICK_SLAB.get())
                .add(ModBlocks.SNONIUM_BRICK.get())
                .add(ModBlocks.SNONIUM_BRICK_STAIRS.get())
                .add(ModBlocks.SNONIUM_BRICK_SLAB.get())
                .add(ModBlocks.MARBERITH_ORE.get())
                .add(ModBlocks.DEEPSLATE_MARBERITH_ORE.get())
                .add(ModBlocks.NETHER_MARBERITH_ORE.get())
                .add(ModBlocks.MARBERITH_BLOCK.get())
                .add(ModBlocks.WHITE_MARBLE.get())
                .add(ModBlocks.WHITE_MARBLE_STAIRS.get())
                .add(ModBlocks.WHITE_MARBLE_SLAB.get())
                .add(ModBlocks.WHITE_POLISHED_MARBLE.get())
                .add(ModBlocks.WHITE_POLISHED_MARBLE_STAIRS.get())
                .add(ModBlocks.WHITE_POLISHED_MARBLE_SLAB.get())
                .add(ModBlocks.GREEN_MARBLE.get())
                .add(ModBlocks.GREEN_MARBLE_STAIRS.get())
                .add(ModBlocks.GREEN_MARBLE_SLAB.get())
                .add(ModBlocks.GREEN_POLISHED_MARBLE.get())
                .add(ModBlocks.GREEN_POLISHED_MARBLE_STAIRS.get())
                .add(ModBlocks.GREEN_POLISHED_MARBLE_SLAB.get())
                .add(ModBlocks.BROWN_MARBLE.get())
                .add(ModBlocks.BROWN_MARBLE_STAIRS.get())
                .add(ModBlocks.BROWN_MARBLE_SLAB.get())
                .add(ModBlocks.BROWN_POLISHED_MARBLE.get())
                .add(ModBlocks.BROWN_POLISHED_MARBLE_STAIRS.get())
                .add(ModBlocks.BROWN_POLISHED_MARBLE_SLAB.get())
                .add(ModBlocks.BLACK_MARBLE.get())
                .add(ModBlocks.BLACK_MARBLE_STAIRS.get())
                .add(ModBlocks.BLACK_MARBLE_SLAB.get())
                .add(ModBlocks.BLACK_POLISHED_MARBLE.get())
                .add(ModBlocks.BLACK_POLISHED_MARBLE_STAIRS.get())
                .add(ModBlocks.BLACK_POLISHED_MARBLE_SLAB.get())
                .add(ModBlocks.WHITE_MARBLE_BRICK.get())
                .add(ModBlocks.WHITE_MARBLE_BRICK_STAIRS.get())
                .add(ModBlocks.WHITE_MARBLE_BRICK_SLAB.get())
                .add(ModBlocks.WHITE_MARBLE_BRICK_SMALL.get())
                .add(ModBlocks.WHITE_MARBLE_BRICK_SMALL_STAIRS.get())
                .add(ModBlocks.WHITE_MARBLE_BRICK_SMALL_SLAB.get())
                .add(ModBlocks.WHITE_MARBLE_FANCY.get())
                .add(ModBlocks.WHITE_MARBLE_FANCY_STAIRS.get())
                .add(ModBlocks.WHITE_MARBLE_FANCY_SLAB.get())
                .add(ModBlocks.WHITE_MARBLE_MOSAIK.get())
                .add(ModBlocks.WHITE_MARBLE_MOSAIK_STAIRS.get())
                .add(ModBlocks.WHITE_MARBLE_MOSAIK_SLAB.get())
                .add(ModBlocks.BLACK_MARBLE_BRICK.get())
                .add(ModBlocks.BLACK_MARBLE_BRICK_STAIRS.get())
                .add(ModBlocks.BLACK_MARBLE_BRICK_SLAB.get())
                .add(ModBlocks.BLACK_MARBLE_COBBLE.get())
                .add(ModBlocks.BLACK_MARBLE_COBBLE_STAIRS.get())
                .add(ModBlocks.BLACK_MARBLE_COBBLE_SLAB.get())
                .add(ModBlocks.BLACK_MARBLE_FANCY.get())
                .add(ModBlocks.BLACK_MARBLE_FANCY_STAIRS.get())
                .add(ModBlocks.BLACK_MARBLE_FANCY_SLAB.get())
                .add(ModBlocks.HEMP_BLOCK.get())
                .add(ModBlocks.HEMP_STAIRS.get())
                .add(ModBlocks.HEMP_SLAB.get())
                .add(ModBlocks.SANDSTONE_BRICK.get())
                .add(ModBlocks.SANDSTONE_BRICK_STAIRS.get())
                .add(ModBlocks.SANDSTONE_BRICK_SLAB.get());




        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SNONIUM_BLOCK.get())
                .add(ModBlocks.SNONIUM_ORE.get())
                .add(ModBlocks.DEEPSLATE_SNONIUM_ORE.get())
                .add(ModBlocks.NETHER_SNONIUM_ORE.get());

        tag(BlockTags.FENCES).add(ModBlocks.HEMP_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.HEMP_FENCE_GATE.get());

        tag(BlockTags.FENCES).add(ModBlocks.VAMPIRE_FENCE.get());
        tag(BlockTags.FENCE_GATES).add(ModBlocks.VAMPIRE_FENCE_GATE.get());

        tag(BlockTags.WALLS).add(ModBlocks.WHITE_MARBLE_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.WHITE_POLISHED_MARBLE_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.GREEN_MARBLE_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.GREEN_POLISHED_MARBLE_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.BROWN_MARBLE_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.BROWN_POLISHED_MARBLE_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.BLACK_MARBLE_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.BLACK_POLISHED_MARBLE_WALL.get());

        tag(BlockTags.WALLS).add(ModBlocks.WHITE_MARBLE_BRICK_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.WHITE_MARBLE_BRICK_SMALL_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.WHITE_MARBLE_FANCY_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.WHITE_MARBLE_MOSAIK_WALL.get());

        tag(BlockTags.WALLS).add(ModBlocks.BLACK_MARBLE_BRICK_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.BLACK_MARBLE_COBBLE_WALL.get());
        tag(BlockTags.WALLS).add(ModBlocks.BLACK_MARBLE_FANCY_WALL.get());

        tag(BlockTags.WALLS).add(ModBlocks.SANDSTONE_BRICK_WALL.get());

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.VAMPIRE_LOG.get())
                .add(ModBlocks.VAMPIRE_WOOD.get())
                .add(ModBlocks.STRIPPED_VAMPIRE_LOG.get())
                .add(ModBlocks.STRIPPED_VAMPIRE_WOOD.get());



    }
}
