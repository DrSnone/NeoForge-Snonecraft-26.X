package de.drsnone.snonecraft.datagen;

import de.drsnone.snonecraft.Snonecraft;
import de.drsnone.snonecraft.block.ModBlocks;
import de.drsnone.snonecraft.item.ModItems;
import de.drsnone.snonecraft.tag.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;

import net.neoforged.neoforge.common.data.ItemTagsProvider;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends net.neoforged.neoforge.common.data.ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Snonecraft.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ModTags.Items.SNONIUM_REPAIRABLES)
                .add(ModItems.getRK(ModItems.SNONIUM_INGOT.get()));
        tag(ModTags.Items.MARBERITH_REPAIRABLES)
                .add(ModItems.getRK(ModItems.MARBERITH.get()));
        tag(ModTags.Items.DIOPSID_REPAIRABLES)
                .add(ModItems.getRK(ModItems.DIOPSID.get()));
        tag(ModTags.Items.SAPPHIRE_REPAIRABLES)
                .add(ModItems.getRK(ModItems.SAPPHIRE.get()));
        tag(ModTags.Items.RUBY_REPAIRABLES)
                .add(ModItems.getRK(ModItems.RUBY.get()));
        tag(ModTags.Items.BLOODIRON_REPAIRABLES)
                .add(ModItems.getRK(ModItems.BLOODIRON_BAR.get()));

        tag(ItemTags.SWORDS).add(ModItems.getRK(ModItems.SNONIUM_SWORD.get())).add(ModItems.getRK(ModItems.SAPPHIRE_SWORD.get())).add(ModItems.getRK(ModItems.DIOPSID_SWORD.get())).add(ModItems.getRK(ModItems.MARBERITH_SWORD.get()))
                .add(ModItems.getRK(ModItems.RUBY_SWORD.get())).add(ModItems.getRK(ModItems.VAMPIRE_SWORD.get()));
        tag(ItemTags.PICKAXES).add(ModItems.getRK(ModItems.SNONIUM_PICKAXE.get())).add(ModItems.getRK(ModItems.SNONIUM_HAMMER.get())).add(ModItems.getRK(ModItems.MARBERITH_PICKAXE.get()))
                .add(ModItems.getRK(ModItems.SAPPHIRE_PICKAXE.get())).add(ModItems.getRK(ModItems.SAPPHIRE_HAMMER.get())).add(ModItems.getRK(ModItems.DIOPSID_PICKAXE.get()))
                .add(ModItems.getRK(ModItems.DIOPSID_HAMMER.get())).add(ModItems.getRK(ModItems.RUBY_PICKAXE.get())).add(ModItems.getRK(ModItems.RUBY_HAMMER.get()));
        tag(ItemTags.SHOVELS).add(ModItems.getRK(ModItems.SNONIUM_SHOVEL.get())).add(ModItems.getRK(ModItems.SAPPHIRE_SHOVEL.get())).add(ModItems.getRK(ModItems.DIOPSID_SHOVEL.get()))
                .add(ModItems.getRK(ModItems.RUBY_SHOVEL.get())).add(ModItems.getRK(ModItems.MARBERITH_SHOVEL.get()));
        tag(ItemTags.AXES).add(ModItems.getRK(ModItems.SNONIUM_AXE.get())).add(ModItems.getRK(ModItems.MARBERITH_AXE.get())).add(ModItems.getRK(ModItems.SAPPHIRE_AXE.get()))
                .add(ModItems.getRK(ModItems.DIOPSID_AXE.get())).add(ModItems.getRK(ModItems.RUBY_AXE.get()));
        tag(ItemTags.HOES).add(ModItems.getRK(ModItems.SNONIUM_HOE.get())).add(ModItems.getRK(ModItems.MARBERITH_HOE.get())).add(ModItems.getRK(ModItems.SAPPHIRE_HOE.get()))
                .add(ModItems.getRK(ModItems.DIOPSID_HOE.get())).add(ModItems.getRK(ModItems.RUBY_HOE.get()));

        tag(ItemTags.HEAD_ARMOR).add(ModItems.getRK(ModItems.SNONIUM_HELMET.get())).add(ModItems.getRK(ModItems.MARBERITH_HELMET.get())).add(ModItems.getRK(ModItems.SAPPHIRE_HELMET.get()))
                .add(ModItems.getRK(ModItems.DIOPSID_HELMET.get())).add(ModItems.getRK(ModItems.RUBY_HELMET.get()));
        tag(ItemTags.CHEST_ARMOR).add(ModItems.getRK(ModItems.SNONIUM_CHESTPLATE.get())).add(ModItems.getRK(ModItems.MARBERITH_CHESTPLATE.get())).add(ModItems.getRK(ModItems.SAPPHIRE_CHESTPLATE.get()))
                .add(ModItems.getRK(ModItems.DIOPSID_CHESTPLATE.get())).add(ModItems.getRK(ModItems.RUBY_CHESTPLATE.get()));
        tag(ItemTags.LEG_ARMOR).add(ModItems.getRK(ModItems.SNONIUM_LEGGINGS.get())).add(ModItems.getRK(ModItems.MARBERITH_LEGGINGS.get())).add(ModItems.getRK(ModItems.SAPPHIRE_LEGGINGS.get()))
                .add(ModItems.getRK(ModItems.DIOPSID_LEGGINGS.get())).add(ModItems.getRK(ModItems.RUBY_LEGGINGS.get()));
        tag(ItemTags.FOOT_ARMOR).add(ModItems.getRK(ModItems.SNONIUM_BOOTS.get())).add(ModItems.getRK(ModItems.MARBERITH_BOOTS.get())).add(ModItems.getRK(ModItems.SAPPHIRE_BOOTS.get()))
                .add(ModItems.getRK(ModItems.DIOPSID_BOOTS.get())).add(ModItems.getRK(ModItems.RUBY_BOOTS.get()));


        tag(ItemTags.LOGS_THAT_BURN)
                .add(ModItems.getRK(ModBlocks.VAMPIRE_LOG.get().asItem()))
                .add(ModItems.getRK(ModBlocks.VAMPIRE_WOOD.get().asItem()))
                .add(ModItems.getRK(ModBlocks.STRIPPED_VAMPIRE_LOG.get().asItem()))
                .add(ModItems.getRK(ModBlocks.STRIPPED_VAMPIRE_WOOD.get().asItem()));

        tag(ItemTags.PLANKS)
                .add(ModItems.getRK(ModBlocks.VAMPIRE_PLANKS.get().asItem()));

        tag(ModTags.Items.VAMPIRE_LOGS)
                .add(ModItems.getRK(ModBlocks.VAMPIRE_LOG.asItem()))
                .add(ModItems.getRK(ModBlocks.VAMPIRE_WOOD.asItem()))
                .add(ModItems.getRK(ModBlocks.STRIPPED_VAMPIRE_LOG.asItem()))
                .add(ModItems.getRK(ModBlocks.STRIPPED_VAMPIRE_WOOD.asItem()));



    }
}
