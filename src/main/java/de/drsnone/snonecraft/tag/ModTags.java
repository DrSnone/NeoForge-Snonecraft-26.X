package de.drsnone.snonecraft.tag;

import de.drsnone.snonecraft.Snonecraft;
import net.minecraft.resources.Identifier;

import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_SNONIUM_TOOL = createTag("incorrect_for_snonium_tool");
        public static final TagKey<Block> NEEDS_SNONIUM_TOOL = createTag("needs_snonium_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> SNONIUM_REPAIRABLES = createTag("snonium_repairables");
        public static final TagKey<Item> RUBY_REPAIRABLES = createTag("ruby_repairables");
        public static final TagKey<Item> DIOPSID_REPAIRABLES = createTag("diopsid_repairables");
        public static final TagKey<Item> SAPPHIRE_REPAIRABLES = createTag("sapphire_repairables");
        public static final TagKey<Item> MARBERITH_REPAIRABLES = createTag("marberith_repairables");
        public static final TagKey<Item> BAT_REPAIRABLES = createTag("bat_repairables");

        public static final TagKey<Item> VAMPIRE_LOGS = createTag("vampire_logs");


        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, name));
        }
    }
}
