package de.drsnone.snonecraft.datagen;

import de.drsnone.snonecraft.Snonecraft;
import de.drsnone.snonecraft.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockItemTags;
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
                .add(ModBlocks.getRK(ModBlocks.SNONIUM_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.SNONIUM_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_SNONIUM_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.NETHER_SNONIUM_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.SMALL_STONE_BRICKS.get()))
                .add(ModBlocks.getRK(ModBlocks.RUBY_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_RUBY_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.RUBY_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.DIOPSID_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_DIOPSID_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.DIOPSID_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.SAPPHIRE_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.SAPPHIRE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.AMBER_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.AMBER_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.AMBER_BLOCK_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.AMBER_BLOCK_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.AMBER_BRICK.get()))
                .add(ModBlocks.getRK(ModBlocks.AMBER_BRICK_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.AMBER_BRICK_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.SNONIUM_BRICK.get()))
                .add(ModBlocks.getRK(ModBlocks.SNONIUM_BRICK_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.SNONIUM_BRICK_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.MARBERITH_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_MARBERITH_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.NETHER_MARBERITH_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.MARBERITH_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_POLISHED_MARBLE.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_POLISHED_MARBLE_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_POLISHED_MARBLE_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.GREEN_MARBLE.get()))
                .add(ModBlocks.getRK(ModBlocks.GREEN_MARBLE_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.GREEN_MARBLE_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.GREEN_POLISHED_MARBLE.get()))
                .add(ModBlocks.getRK(ModBlocks.GREEN_POLISHED_MARBLE_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.GREEN_POLISHED_MARBLE_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.BROWN_MARBLE.get()))
                .add(ModBlocks.getRK(ModBlocks.BROWN_MARBLE_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.BROWN_MARBLE_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.BROWN_POLISHED_MARBLE.get()))
                .add(ModBlocks.getRK(ModBlocks.BROWN_POLISHED_MARBLE_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.BROWN_POLISHED_MARBLE_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_MARBLE.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_MARBLE_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_MARBLE_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_POLISHED_MARBLE.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_POLISHED_MARBLE_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_POLISHED_MARBLE_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_BRICK.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_BRICK_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_BRICK_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_BRICK_SMALL.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_BRICK_SMALL_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_BRICK_SMALL_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_FANCY.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_FANCY_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_FANCY_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_MOSAIK.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_MOSAIK_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_MOSAIK_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_MARBLE_BRICK.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_MARBLE_BRICK_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_MARBLE_BRICK_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_MARBLE_COBBLE.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_MARBLE_COBBLE_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_MARBLE_COBBLE_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_MARBLE_FANCY.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_MARBLE_FANCY_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.BLACK_MARBLE_FANCY_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.HEMP_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.HEMP_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.HEMP_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_BRICK_BIG.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_BRICK_BIG_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_BRICK_BIG_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_CHISELED.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_ENGRAVED.get()))
                .add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_RUNED.get()))
                .add(ModBlocks.getRK(ModBlocks.SANDSTONE_BRICK.get()))
                .add(ModBlocks.getRK(ModBlocks.SANDSTONE_BRICK_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.SANDSTONE_BRICK_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOODSTONE.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOODSTONE_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOODSTONE_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOODSTONEBRICK.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOODSTONEBRICK_STAIRS.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOODSTONEBRICK_SLAB.get()))
                .add(ModBlocks.getRK(ModBlocks.BLOODSTONESOCKET.get()));




        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.getRK(ModBlocks.SNONIUM_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.SNONIUM_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.DEEPSLATE_SNONIUM_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.NETHER_SNONIUM_ORE.get()));

        tag(BlockTags.FENCES).add(ModBlocks.getRK(ModBlocks.HEMP_FENCE.get()));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(ModBlocks.HEMP_FENCE_GATE.get()));

        tag(BlockTags.FENCES).add(ModBlocks.getRK(ModBlocks.VAMPIRE_FENCE.get()));
        tag(BlockTags.FENCE_GATES).add(ModBlocks.getRK(ModBlocks.VAMPIRE_FENCE_GATE.get()));

        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_WALL.get()));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_BRICK_BIG_WALL.get()));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.WHITE_POLISHED_MARBLE_WALL.get()));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.GREEN_MARBLE_WALL.get()));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.GREEN_POLISHED_MARBLE_WALL.get()));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.BROWN_MARBLE_WALL.get()));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.BROWN_POLISHED_MARBLE_WALL.get()));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.BLACK_MARBLE_WALL.get()));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.BLACK_POLISHED_MARBLE_WALL.get()));

        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_BRICK_WALL.get()));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_BRICK_SMALL_WALL.get()));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_FANCY_WALL.get()));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.WHITE_MARBLE_MOSAIK_WALL.get()));

        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.BLACK_MARBLE_BRICK_WALL.get()));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.BLACK_MARBLE_COBBLE_WALL.get()));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.BLACK_MARBLE_FANCY_WALL.get()));

        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.SANDSTONE_BRICK_WALL.get()));
        tag(BlockTags.WALLS).add(ModBlocks.getRK(ModBlocks.HEMP_WALL.get()));

        tag(BlockItemTags.LOGS_THAT_BURN.block())
                .add(ModBlocks.VAMPIRE_LOG.getKey())
                .add(ModBlocks.VAMPIRE_WOOD.getKey())
                .add(ModBlocks.STRIPPED_VAMPIRE_LOG.getKey())
                .add(ModBlocks.STRIPPED_VAMPIRE_WOOD.getKey());


        this.tag(ModBlocks.STEM_GROW_TAG)
                .add(ResourceKey.create(net.minecraft.core.registries.Registries.BLOCK, net.minecraft.resources.Identifier.parse("minecraft:farmland")));

        // 2. Dem Frucht-Spawn-Tag erlauben, den Kürbis auf den Vanilla-Böden zu platzieren
        this.tag(ModBlocks.FRUIT_SPAWN_TAG)
                .add(ResourceKey.create(net.minecraft.core.registries.Registries.BLOCK, net.minecraft.resources.Identifier.parse("minecraft:farmland")))
                .add(ResourceKey.create(net.minecraft.core.registries.Registries.BLOCK, net.minecraft.resources.Identifier.parse("minecraft:grass_block")))
                .add(ResourceKey.create(net.minecraft.core.registries.Registries.BLOCK, net.minecraft.resources.Identifier.parse("minecraft:dirt")))
                .add(ResourceKey.create(net.minecraft.core.registries.Registries.BLOCK, net.minecraft.resources.Identifier.parse("minecraft:coarse_dirt")));







    }
}
