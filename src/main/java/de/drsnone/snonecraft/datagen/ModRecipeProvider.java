package de.drsnone.snonecraft.datagen;

import de.drsnone.snonecraft.Snonecraft;
import de.drsnone.snonecraft.block.ModBlocks;
import de.drsnone.snonecraft.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;


import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {
        List<ItemLike> SNONIUM_SMELTABLES = List.of(ModItems.RAW_SNONIUM,
                ModBlocks.SNONIUM_ORE, ModBlocks.DEEPSLATE_SNONIUM_ORE, ModBlocks.NETHER_SNONIUM_ORE);

        List<ItemLike> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY,
                ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE);

        List<ItemLike> DIOPSID_SMELTABLES = List.of(ModItems.RAW_DIOPSID,
                ModBlocks.DIOPSID_ORE, ModBlocks.DEEPSLATE_DIOPSID_ORE);

        List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModItems.RAW_SAPPHIRE,
                ModBlocks.SAPPHIRE_ORE, ModBlocks.DEEPSLATE_SAPPHIRE_ORE);

        List<ItemLike> AMBER_SMELTABLES = List.of(ModItems.RAW_AMBER,
                ModBlocks.AMBER_ORE);

        List<ItemLike> MARBERITH_SMELTABLES = List.of(ModItems.RAW_MARBERITH,
                ModBlocks.MARBERITH_ORE, ModBlocks.DEEPSLATE_MARBERITH_ORE, ModBlocks.NETHER_MARBERITH_ORE);

        List<ItemLike> KEBAB_SMELTABLES = List.of(ModItems.RAW_KEBAB_PIKE);

        List<ItemLike> HEMP_SMELTABLES = List.of(ModItems.HEMP);

        List<ItemLike> BAT_SMELTABLES = List.of(ModItems.RAW_BAT_PATTY);

        oreSmelting(SNONIUM_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.SNONIUM_INGOT.get(), 0.25f, 200, "snonium_ingot");
        oreBlasting(SNONIUM_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.SNONIUM_INGOT.get(), 0.25f, 100, "snonium_ingot");

        oreSmelting(MARBERITH_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.MARBERITH.get(), 0.25f, 200, "marberith");
        oreBlasting(MARBERITH_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.MARBERITH.get(), 0.25f, 100, "marberith");

        oreSmelting(RUBY_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.RUBY.get(), 0.25f, 200, "ruby");
        oreBlasting(RUBY_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.RUBY.get(), 0.25f, 100, "ruby");

        oreSmelting(DIOPSID_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.DIOPSID.get(), 0.25f, 200, "diopsid");
        oreBlasting(DIOPSID_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.DIOPSID.get(), 0.25f, 100, "diopsid");

        oreSmelting(SAPPHIRE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.SAPPHIRE.get(), 0.25f, 200, "sapphire");
        oreBlasting(SAPPHIRE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.SAPPHIRE.get(), 0.25f, 100, "sapphire");

        oreSmelting(AMBER_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.AMBER.get(), 0.25f, 200, "amber");
        oreBlasting(AMBER_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.AMBER.get(), 0.25f, 100, "amber");

        oreSmelting(KEBAB_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.FOOD, ModItems.GRILLED_KEBAB_PIKE.get(), 0.25f, 200, "grilled_kebab_pike");

        oreSmelting(HEMP_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, ModItems.HEMP_CLUMP.get(), 0.25f, 200, "hemp_clump");

        oreSmelting(BAT_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.FOOD, ModItems.GRILLED_BAT_PATTY.get(), 0.25f, 200, "grilled_bat_patty");


        //SNONIUM RECIPES
        shaped(RecipeCategory.MISC, ModBlocks.SNONIUM_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.SNONIUM_INGOT.get())
                .unlockedBy("has_block_snonium", has(ModItems.SNONIUM_INGOT.get()))
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.SNONIUM_INGOT.get(), 9)
                .requires(ModBlocks.SNONIUM_BLOCK.get())
                .unlockedBy("has_snonium_block", has(ModBlocks.SNONIUM_BLOCK.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.SNONIUM_SWORD.get())
                .pattern("A")
                .pattern("A")
                .pattern("I")
                .define('A', ModItems.SNONIUM_INGOT.get())
                .define('I', Items.STICK)
                .unlockedBy("has_snonium_ingot", has(ModItems.SNONIUM_INGOT.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.SNONIUM_PICKAXE.get())
                .pattern("AAA")
                .pattern(" I ")
                .pattern(" I ")
                .define('A', ModItems.SNONIUM_INGOT.get())
                .define('I', Items.STICK)
                .unlockedBy("has_snonium_ingot", has(ModItems.SNONIUM_INGOT.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.SNONIUM_AXE.get())
                .pattern("AA ")
                .pattern("AI ")
                .pattern(" I ")
                .define('A', ModItems.SNONIUM_INGOT.get())
                .define('I', Items.STICK)
                .unlockedBy("has_snonium_ingot", has(ModItems.SNONIUM_INGOT.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.SNONIUM_SHOVEL.get())
                .pattern("A")
                .pattern("I")
                .pattern("I")
                .define('A', ModItems.SNONIUM_INGOT.get())
                .define('I', Items.STICK)
                .unlockedBy("has_snonium_ingot", has(ModItems.SNONIUM_INGOT.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.SNONIUM_HOE.get())
                .pattern("AA")
                .pattern(" I")
                .pattern(" I")
                .define('A', ModItems.SNONIUM_INGOT.get())
                .define('I', Items.STICK)
                .unlockedBy("has_snonium_ingot", has(ModItems.SNONIUM_INGOT.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.SNONIUM_HAMMER.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern(" I ")
                .define('A', ModItems.SNONIUM_INGOT.get())
                .define('I', Items.STICK)
                .unlockedBy("has_snonium_ingot", has(ModItems.SNONIUM_INGOT.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SNONIUM_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .define('A', ModItems.SNONIUM_INGOT.get())
                .unlockedBy("has_snonium_ingot", has(ModItems.SNONIUM_INGOT.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SNONIUM_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SNONIUM_INGOT.get())
                .unlockedBy("has_snonium_ingot", has(ModItems.SNONIUM_INGOT.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SNONIUM_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.SNONIUM_INGOT.get())
                .unlockedBy("has_snonium_ingot", has(ModItems.SNONIUM_INGOT.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SNONIUM_BOOTS.get())
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.SNONIUM_INGOT.get())
                .unlockedBy("has_snonium_ingot", has(ModItems.SNONIUM_INGOT.get()))
                .save(output);


        //MARBERITH RECIPES
        shaped(RecipeCategory.MISC, ModBlocks.MARBERITH_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.MARBERITH.get())
                .unlockedBy("has_block_marberith", has(ModItems.MARBERITH.get()))
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.MARBERITH.get(), 9)
                .requires(ModBlocks.MARBERITH_BLOCK.get())
                .unlockedBy("has_marberith_block", has(ModBlocks.MARBERITH_BLOCK.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.MARBERITH_SWORD.get())
                .pattern("A")
                .pattern("A")
                .pattern("I")
                .define('A', ModItems.MARBERITH.get())
                .define('I', Items.STICK)
                .unlockedBy("has_marberith", has(ModItems.MARBERITH.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.MARBERITH_PICKAXE.get())
                .pattern("AAA")
                .pattern(" I ")
                .pattern(" I ")
                .define('A', ModItems.MARBERITH.get())
                .define('I', Items.STICK)
                .unlockedBy("has_marberith", has(ModItems.MARBERITH.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.MARBERITH_AXE.get())
                .pattern("AA ")
                .pattern("AI ")
                .pattern(" I ")
                .define('A', ModItems.MARBERITH.get())
                .define('I', Items.STICK)
                .unlockedBy("has_marberith", has(ModItems.MARBERITH.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.MARBERITH_SHOVEL.get())
                .pattern("A")
                .pattern("I")
                .pattern("I")
                .define('A', ModItems.MARBERITH.get())
                .define('I', Items.STICK)
                .unlockedBy("has_marberith", has(ModItems.MARBERITH.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.MARBERITH_HOE.get())
                .pattern("AA")
                .pattern(" I")
                .pattern(" I")
                .define('A', ModItems.MARBERITH.get())
                .define('I', Items.STICK)
                .unlockedBy("has_marberith", has(ModItems.MARBERITH.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.MARBERITH_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .define('A', ModItems.MARBERITH.get())
                .unlockedBy("has_marberith", has(ModItems.MARBERITH.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.MARBERITH_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.MARBERITH.get())
                .unlockedBy("has_marberith", has(ModItems.MARBERITH.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.MARBERITH_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.MARBERITH.get())
                .unlockedBy("has_marberith", has(ModItems.MARBERITH.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.MARBERITH_BOOTS.get())
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.MARBERITH.get())
                .unlockedBy("has_marberith", has(ModItems.MARBERITH.get()))
                .save(output);


        //RUBY RECIPES
        shaped(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.RUBY.get())
                .unlockedBy("has_block_ruby", has(ModItems.RUBY.get()))
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.RUBY.get(), 9)
                .requires(ModBlocks.RUBY_BLOCK.get())
                .unlockedBy("has_ruby_block", has(ModBlocks.RUBY_BLOCK.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.RUBY_SWORD.get())
                .pattern("A")
                .pattern("A")
                .pattern("I")
                .define('A', ModItems.RUBY.get())
                .define('I', Items.STICK)
                .unlockedBy("has_ruby", has(ModItems.RUBY.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.RUBY_PICKAXE.get())
                .pattern("AAA")
                .pattern(" I ")
                .pattern(" I ")
                .define('A', ModItems.RUBY.get())
                .define('I', Items.STICK)
                .unlockedBy("has_ruby", has(ModItems.RUBY.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.RUBY_AXE.get())
                .pattern("AA ")
                .pattern("AI ")
                .pattern(" I ")
                .define('A', ModItems.RUBY.get())
                .define('I', Items.STICK)
                .unlockedBy("has_ruby", has(ModItems.RUBY.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.RUBY_SHOVEL.get())
                .pattern("A")
                .pattern("I")
                .pattern("I")
                .define('A', ModItems.RUBY.get())
                .define('I', Items.STICK)
                .unlockedBy("has_ruby", has(ModItems.RUBY.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.RUBY_HOE.get())
                .pattern("AA")
                .pattern(" I")
                .pattern(" I")
                .define('A', ModItems.RUBY.get())
                .define('I', Items.STICK)
                .unlockedBy("has_ruby", has(ModItems.RUBY.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.RUBY_HAMMER.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern(" I ")
                .define('A', ModItems.RUBY.get())
                .define('I', Items.STICK)
                .unlockedBy("has_ruby", has(ModItems.RUBY.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.RUBY_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .define('A', ModItems.RUBY.get())
                .unlockedBy("has_ruby", has(ModItems.RUBY.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.RUBY_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RUBY.get())
                .unlockedBy("has_ruby", has(ModItems.RUBY.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.RUBY_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.RUBY.get())
                .unlockedBy("has_ruby", has(ModItems.RUBY.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.RUBY_BOOTS.get())
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.RUBY.get())
                .unlockedBy("has_ruby", has(ModItems.RUBY.get()))
                .save(output);


        //DIOPSID RECIPES
        shaped(RecipeCategory.MISC, ModBlocks.DIOPSID_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.DIOPSID.get())
                .unlockedBy("has_block_diopsid", has(ModItems.DIOPSID.get()))
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.DIOPSID.get(), 9)
                .requires(ModBlocks.DIOPSID_BLOCK.get())
                .unlockedBy("has_diopsid_block", has(ModBlocks.DIOPSID_BLOCK.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.DIOPSID_SWORD.get())
                .pattern("A")
                .pattern("A")
                .pattern("I")
                .define('A', ModItems.DIOPSID.get())
                .define('I', Items.STICK)
                .unlockedBy("has_diopsid", has(ModItems.DIOPSID.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.DIOPSID_PICKAXE.get())
                .pattern("AAA")
                .pattern(" I ")
                .pattern(" I ")
                .define('A', ModItems.DIOPSID.get())
                .define('I', Items.STICK)
                .unlockedBy("has_diopsid", has(ModItems.DIOPSID.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.DIOPSID_AXE.get())
                .pattern("AA ")
                .pattern("AI ")
                .pattern(" I ")
                .define('A', ModItems.DIOPSID.get())
                .define('I', Items.STICK)
                .unlockedBy("has_diopsid", has(ModItems.DIOPSID.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.DIOPSID_SHOVEL.get())
                .pattern("A")
                .pattern("I")
                .pattern("I")
                .define('A', ModItems.DIOPSID.get())
                .define('I', Items.STICK)
                .unlockedBy("has_diopsid", has(ModItems.DIOPSID.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.DIOPSID_HOE.get())
                .pattern("AA")
                .pattern(" I")
                .pattern(" I")
                .define('A', ModItems.DIOPSID.get())
                .define('I', Items.STICK)
                .unlockedBy("has_diopsid", has(ModItems.DIOPSID.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.DIOPSID_HAMMER.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern(" I ")
                .define('A', ModItems.DIOPSID.get())
                .define('I', Items.STICK)
                .unlockedBy("has_diopsid", has(ModItems.DIOPSID.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.DIOPSID_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .define('A', ModItems.DIOPSID.get())
                .unlockedBy("has_diopsid", has(ModItems.DIOPSID.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.DIOPSID_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.DIOPSID.get())
                .unlockedBy("has_diopsid", has(ModItems.DIOPSID.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.DIOPSID_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.DIOPSID.get())
                .unlockedBy("has_diopsid", has(ModItems.DIOPSID.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.DIOPSID_BOOTS.get())
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.DIOPSID.get())
                .unlockedBy("has_diopsid", has(ModItems.DIOPSID.get()))
                .save(output);


        //SAPPHIRE RECIPES
        shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.SAPPHIRE.get())
                .unlockedBy("has_block_sapphire", has(ModItems.SAPPHIRE.get()))
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy("has_sapphire_block", has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_SWORD.get())
                .pattern("A")
                .pattern("A")
                .pattern("I")
                .define('A', ModItems.SAPPHIRE.get())
                .define('I', Items.STICK)
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_PICKAXE.get())
                .pattern("AAA")
                .pattern(" I ")
                .pattern(" I ")
                .define('A', ModItems.SAPPHIRE.get())
                .define('I', Items.STICK)
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_AXE.get())
                .pattern("AA ")
                .pattern("AI ")
                .pattern(" I ")
                .define('A', ModItems.SAPPHIRE.get())
                .define('I', Items.STICK)
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_SHOVEL.get())
                .pattern("A")
                .pattern("I")
                .pattern("I")
                .define('A', ModItems.SAPPHIRE.get())
                .define('I', Items.STICK)
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_HOE.get())
                .pattern("AA")
                .pattern(" I")
                .pattern(" I")
                .define('A', ModItems.SAPPHIRE.get())
                .define('I', Items.STICK)
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.SAPPHIRE_HAMMER.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern(" I ")
                .define('A', ModItems.SAPPHIRE.get())
                .define('I', Items.STICK)
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .define('A', ModItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.SAPPHIRE_BOOTS.get())
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.SAPPHIRE.get())
                .unlockedBy("has_sapphire", has(ModItems.SAPPHIRE.get()))
                .save(output);


        //AMBER RECIPES
        shaped(RecipeCategory.MISC, ModBlocks.AMBER_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.AMBER.get())
                .unlockedBy("has_block_amber", has(ModItems.AMBER.get()))
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.AMBER.get(), 9)
                .requires(ModBlocks.AMBER_BLOCK.get())
                .unlockedBy("has_amber_block", has(ModBlocks.AMBER_BLOCK.get()))
                .save(output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMBER_BRICK.get(), 4)
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.AMBER_BLOCK.get())
                .unlockedBy("has_amber_block", has(ModBlocks.AMBER_BLOCK.get()))
                .save(output);

        stairBuilder(ModBlocks.AMBER_BLOCK_STAIRS.get(), Ingredient.of(ModBlocks.AMBER_BLOCK.get())).group("amber_block")
                .unlockedBy("has_amber_block", has(ModBlocks.AMBER_BLOCK.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMBER_BLOCK_SLAB.get(), ModBlocks.AMBER_BLOCK);

        stairBuilder(ModBlocks.AMBER_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.AMBER_BRICK.get())).group("amber_brick")
                .unlockedBy("has_amber_brick", has(ModBlocks.AMBER_BRICK.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMBER_BRICK_SLAB.get(), ModBlocks.AMBER_BRICK);


        //Food Recipes
        shaped(RecipeCategory.MISC, ModItems.FETA_CHEESE.get())
                .pattern("MMS")
                .define('M', Items.MILK_BUCKET.asItem())
                .define('S', Items.SUGAR.asItem())
                .unlockedBy(getHasName(Items.MILK_BUCKET.asItem()), has(Items.SUGAR.asItem()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.FLATBREAD.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("SSS")
                .define('S', Items.WHEAT.asItem())
                .unlockedBy(getHasName(Items.WHEAT.asItem()), has(Items.WHEAT.asItem()))
                .save(output);


        shapeless(RecipeCategory.FOOD, ModItems.JAR_YOGU_SOUCE.get())
                .requires(Items.MILK_BUCKET)
                .requires(Items.SUGAR)
                .requires(Items.SUGAR)
                .requires(Items.GLASS_BOTTLE)
                .unlockedBy("has_milk_bucket", has(Items.MILK_BUCKET))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.RAW_KEBAB_PIKE.get())
                .pattern("ABA")
                .pattern("ABA")
                .pattern("ABA")
                .define('A', Items.BEEF.asItem())
                .define('B', Items.STICK.asItem())
                .unlockedBy(getHasName(Items.BEEF.asItem()), has(Items.STICK.asItem()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.KEBAB_MEAT.get(), 6)
                .pattern("#")
                .define('#', ModItems.GRILLED_KEBAB_PIKE.asItem())
                .unlockedBy(getHasName(ModItems.GRILLED_KEBAB_PIKE.asItem()), has(ModItems.GRILLED_KEBAB_PIKE.asItem()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.QUARTER_FLATBREAD.get(), 4)
                .pattern("#")
                .define('#', ModItems.FLATBREAD.asItem())
                .unlockedBy(getHasName(ModItems.FLATBREAD.asItem()), has(ModItems.FLATBREAD.asItem()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.SNOENER.get(), 1)
                .pattern("GHB")
                .pattern("E F")
                .pattern("AIC")
                .define('A', ModItems.KEBAB_MEAT.asItem())
                .define('B', ModItems.MEAT_TOMATO.asItem())
                .define('C', ModItems.RED_ONION.asItem())
                .define('E', ModItems.JAR_YOGU_SOUCE.asItem())
                .define('F', ModItems.ICE_LETTUCE.asItem())
                .define('G', ModItems.FETA_CHEESE.asItem())
                .define('H', ModItems.PICKLE.asItem())
                .define('I', ModItems.QUARTER_FLATBREAD.asItem())
                .unlockedBy(getHasName(ModItems.KEBAB_MEAT.asItem()), has(ModItems.QUARTER_FLATBREAD.asItem()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.SNOENER_BOX.get(), 1)
                .pattern("GHB")
                .pattern("E F")
                .pattern("AIC")
                .define('A', ModItems.KEBAB_MEAT.asItem())
                .define('B', ModItems.MEAT_TOMATO.asItem())
                .define('C', ModItems.RED_ONION.asItem())
                .define('E', ModItems.JAR_YOGU_SOUCE.asItem())
                .define('F', ModItems.ICE_LETTUCE.asItem())
                .define('G', ModItems.FETA_CHEESE.asItem())
                .define('H', ModItems.PICKLE.asItem())
                .define('I', Items.PAPER.asItem())
                .unlockedBy(getHasName(ModItems.KEBAB_MEAT.asItem()), has(Items.PAPER.asItem()))
                .save(output);


        //BAT RECIPES
        shaped(RecipeCategory.MISC, ModItems.RAW_BAT_PATTY.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.RAW_BAT_BEEF.get())
                .unlockedBy(getHasName(ModItems.RAW_BAT_BEEF.get()), has(ModItems.RAW_BAT_BEEF.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.BAT_LEATHER.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.BAT_WING.get())
                .unlockedBy(getHasName(ModItems.BAT_WING.get()), has(ModItems.BAT_WING.get()))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.BAT_BURGER.get())
                .pattern("WWW")
                .pattern("RTG")
                .pattern("I  ")
                .define('W', Items.WHEAT.asItem())
                .define('R', ModItems.GRILLED_BAT_PATTY.get())
                .define('T', ModItems.MEAT_TOMATO.get())
                .define('G', ModItems.PICKLE.get())
                .define('I', ModItems.ICE_LETTUCE.get())
                .unlockedBy(getHasName(ModItems.GRILLED_BAT_PATTY.get()), has(Items.WHEAT.asItem()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.BAT_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .define('A', ModItems.BAT_LEATHER.get())
                .unlockedBy("has_bat_leather", has(ModItems.BAT_LEATHER.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.BAT_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BAT_LEATHER.get())
                .unlockedBy("has_bat_leather", has(ModItems.BAT_LEATHER.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.BAT_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.BAT_LEATHER.get())
                .unlockedBy("has_bat_leather", has(ModItems.BAT_LEATHER.get()))
                .save(output);

        shaped(RecipeCategory.COMBAT, ModItems.BAT_BOOTS.get())
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.BAT_LEATHER.get())
                .unlockedBy("has_bat_leather", has(ModItems.BAT_LEATHER.get()))
                .save(output);


        //DIVERSE
        shaped(RecipeCategory.MISC, ModBlocks.SMALL_STONE_BRICKS.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', Items.STONE_BRICKS.asItem())
                .unlockedBy(getHasName(Items.STONE_BRICKS.asItem()), has(Items.STONE_BRICKS.asItem()))
                .save(output);

        shaped(RecipeCategory.MISC, ModBlocks.SNONIUM_BRICK.get(), 4)
                .pattern("##")
                .pattern("##")
                .define('#', ModBlocks.SNONIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SNONIUM_BLOCK.get()), has(ModBlocks.SNONIUM_BLOCK.get()))
                .save(output);

        stairBuilder(ModBlocks.SNONIUM_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.SNONIUM_BRICK.get())).group("snonium_brick")
                .unlockedBy("has_snonium_brick", has(ModBlocks.SNONIUM_BRICK.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNONIUM_BRICK_SLAB.get(), ModBlocks.SNONIUM_BRICK);


        //White Marble Recipes
        shaped(RecipeCategory.MISC, ModBlocks.WHITE_POLISHED_MARBLE.get())
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.WHITE_MARBLE.get())
                .unlockedBy(getHasName(ModBlocks.WHITE_MARBLE.get()), has(ModBlocks.WHITE_MARBLE.get()))
                .save(output);

        stairBuilder(ModBlocks.WHITE_MARBLE_STAIRS.get(), Ingredient.of(ModBlocks.WHITE_MARBLE.get())).group("white_marble")
                .unlockedBy("has_white_marble", has(ModBlocks.WHITE_MARBLE.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_MARBLE_SLAB.get(), ModBlocks.WHITE_MARBLE);

        stairBuilder(ModBlocks.WHITE_POLISHED_MARBLE_STAIRS.get(), Ingredient.of(ModBlocks.WHITE_POLISHED_MARBLE.get())).group("white_polished_marble")
                .unlockedBy("has_white_polished_marble", has(ModBlocks.WHITE_POLISHED_MARBLE.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_POLISHED_MARBLE_SLAB.get(), ModBlocks.WHITE_POLISHED_MARBLE);

        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_MARBLE_WALL.get(), ModBlocks.WHITE_MARBLE.get());
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_POLISHED_MARBLE_WALL.get(), ModBlocks.WHITE_POLISHED_MARBLE.get());

        shaped(RecipeCategory.MISC, ModBlocks.WHITE_MARBLE_BRICK.get())
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.WHITE_POLISHED_MARBLE.get())
                .unlockedBy(getHasName(ModBlocks.WHITE_POLISHED_MARBLE.get()), has(ModBlocks.WHITE_POLISHED_MARBLE.get()))
                .save(output);

        stairBuilder(ModBlocks.WHITE_MARBLE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.WHITE_MARBLE_BRICK.get())).group("white_marble_brick")
                .unlockedBy("has_white_marble_brick", has(ModBlocks.WHITE_MARBLE_BRICK.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_MARBLE_BRICK_SLAB.get(), ModBlocks.WHITE_MARBLE_BRICK);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_MARBLE_BRICK_WALL.get(), ModBlocks.WHITE_MARBLE_BRICK.get());

        shaped(RecipeCategory.MISC, ModBlocks.WHITE_MARBLE_BRICK_SMALL.get())
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.WHITE_MARBLE_BRICK.get())
                .unlockedBy(getHasName(ModBlocks.WHITE_MARBLE_BRICK.get()), has(ModBlocks.WHITE_MARBLE_BRICK.get()))
                .save(output);

        stairBuilder(ModBlocks.WHITE_MARBLE_BRICK_SMALL_STAIRS.get(), Ingredient.of(ModBlocks.WHITE_MARBLE_BRICK_SMALL.get())).group("white_marble_brick_small")
                .unlockedBy("has_white_marble_brick_small", has(ModBlocks.WHITE_MARBLE_BRICK.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_MARBLE_BRICK_SMALL_SLAB.get(), ModBlocks.WHITE_MARBLE_BRICK_SMALL);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_MARBLE_BRICK_SMALL_WALL.get(), ModBlocks.WHITE_MARBLE_BRICK_SMALL.get());

        shaped(RecipeCategory.MISC, ModBlocks.WHITE_MARBLE_FANCY.get())
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.WHITE_MARBLE_BRICK_SMALL.get())
                .unlockedBy(getHasName(ModBlocks.WHITE_MARBLE_BRICK_SMALL.get()), has(ModBlocks.WHITE_MARBLE_BRICK_SMALL.get()))
                .save(output);

        stairBuilder(ModBlocks.WHITE_MARBLE_FANCY_STAIRS.get(), Ingredient.of(ModBlocks.WHITE_MARBLE_FANCY.get())).group("white_marble_fancy")
                .unlockedBy("has_white_marble_fancy", has(ModBlocks.WHITE_MARBLE_FANCY.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_MARBLE_FANCY_SLAB.get(), ModBlocks.WHITE_MARBLE_FANCY);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_MARBLE_FANCY_WALL.get(), ModBlocks.WHITE_MARBLE_FANCY.get());

        shaped(RecipeCategory.MISC, ModBlocks.WHITE_MARBLE_MOSAIK.get())
                .pattern("AB")
                .pattern("BA")
                .define('A', ModBlocks.WHITE_POLISHED_MARBLE.get())
                .define('B', ModBlocks.BLACK_POLISHED_MARBLE.get())
                .unlockedBy(getHasName(ModBlocks.WHITE_POLISHED_MARBLE.get()), has(ModBlocks.BLACK_POLISHED_MARBLE.get()))
                .save(output);

        stairBuilder(ModBlocks.WHITE_MARBLE_MOSAIK_STAIRS.get(), Ingredient.of(ModBlocks.WHITE_MARBLE_MOSAIK.get())).group("white_marble_mosaik")
                .unlockedBy("has_white_marble_mosaik", has(ModBlocks.WHITE_MARBLE_MOSAIK.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_MARBLE_MOSAIK_SLAB.get(), ModBlocks.WHITE_MARBLE_MOSAIK);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_MARBLE_MOSAIK_WALL.get(), ModBlocks.WHITE_MARBLE_MOSAIK.get());


        shaped(RecipeCategory.MISC, ModBlocks.BLACK_MARBLE_BRICK.get())
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.BLACK_POLISHED_MARBLE.get())
                .unlockedBy(getHasName(ModBlocks.BLACK_POLISHED_MARBLE.get()), has(ModBlocks.BLACK_POLISHED_MARBLE.get()))
                .save(output);

        stairBuilder(ModBlocks.BLACK_MARBLE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.BLACK_MARBLE_BRICK.get())).group("black_marble_brick")
                .unlockedBy("has_black_marble_brick", has(ModBlocks.BLACK_MARBLE_BRICK.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_MARBLE_BRICK_SLAB.get(), ModBlocks.BLACK_MARBLE_BRICK);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_MARBLE_BRICK_WALL.get(), ModBlocks.BLACK_MARBLE_BRICK.get());

        shaped(RecipeCategory.MISC, ModBlocks.BLACK_MARBLE_COBBLE.get())
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.BLACK_MARBLE_BRICK.get())
                .unlockedBy(getHasName(ModBlocks.BLACK_MARBLE_BRICK.get()), has(ModBlocks.BLACK_MARBLE_BRICK.get()))
                .save(output);

        stairBuilder(ModBlocks.BLACK_MARBLE_COBBLE_STAIRS.get(), Ingredient.of(ModBlocks.BLACK_MARBLE_COBBLE.get())).group("black_marble_cobble")
                .unlockedBy("has_black_marble_cobble", has(ModBlocks.BLACK_MARBLE_COBBLE.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_MARBLE_COBBLE_SLAB.get(), ModBlocks.BLACK_MARBLE_COBBLE);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_MARBLE_COBBLE_WALL.get(), ModBlocks.BLACK_MARBLE_COBBLE.get());

        shaped(RecipeCategory.MISC, ModBlocks.BLACK_MARBLE_FANCY.get())
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.BLACK_MARBLE_COBBLE.get())
                .unlockedBy(getHasName(ModBlocks.BLACK_MARBLE_COBBLE.get()), has(ModBlocks.BLACK_MARBLE_COBBLE.get()))
                .save(output);

        stairBuilder(ModBlocks.BLACK_MARBLE_FANCY_STAIRS.get(), Ingredient.of(ModBlocks.BLACK_MARBLE_FANCY.get())).group("black_marble_fancy")
                .unlockedBy("has_black_marble_fancy", has(ModBlocks.BLACK_MARBLE_FANCY.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_MARBLE_FANCY_SLAB.get(), ModBlocks.BLACK_MARBLE_FANCY);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_MARBLE_FANCY_WALL.get(), ModBlocks.BLACK_MARBLE_FANCY.get());


        //Green Marble Recipes
        shaped(RecipeCategory.MISC, ModBlocks.GREEN_POLISHED_MARBLE.get())
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.GREEN_MARBLE.get())
                .unlockedBy(getHasName(ModBlocks.GREEN_MARBLE.get()), has(ModBlocks.GREEN_MARBLE.get()))
                .save(output);

        stairBuilder(ModBlocks.GREEN_MARBLE_STAIRS.get(), Ingredient.of(ModBlocks.GREEN_MARBLE.get())).group("green_marble")
                .unlockedBy("has_green_marble", has(ModBlocks.GREEN_MARBLE.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_MARBLE_SLAB.get(), ModBlocks.GREEN_MARBLE);

        stairBuilder(ModBlocks.GREEN_POLISHED_MARBLE_STAIRS.get(), Ingredient.of(ModBlocks.GREEN_POLISHED_MARBLE.get())).group("green_polished_marble")
                .unlockedBy("has_green_polished_marble", has(ModBlocks.GREEN_POLISHED_MARBLE.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_POLISHED_MARBLE_SLAB.get(), ModBlocks.GREEN_POLISHED_MARBLE);

        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_MARBLE_WALL.get(), ModBlocks.GREEN_MARBLE.get());
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_POLISHED_MARBLE_WALL.get(), ModBlocks.GREEN_POLISHED_MARBLE.get());


        //Brown Marble Recipes
        shaped(RecipeCategory.MISC, ModBlocks.BROWN_POLISHED_MARBLE.get())
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.BROWN_MARBLE.get())
                .unlockedBy(getHasName(ModBlocks.BROWN_MARBLE.get()), has(ModBlocks.BROWN_MARBLE.get()))
                .save(output);

        stairBuilder(ModBlocks.BROWN_MARBLE_STAIRS.get(), Ingredient.of(ModBlocks.BROWN_MARBLE.get())).group("brown_marble")
                .unlockedBy("has_brown_marble", has(ModBlocks.BROWN_MARBLE.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_MARBLE_SLAB.get(), ModBlocks.BROWN_MARBLE);

        stairBuilder(ModBlocks.BROWN_POLISHED_MARBLE_STAIRS.get(), Ingredient.of(ModBlocks.BROWN_POLISHED_MARBLE.get())).group("brown_polished_marble")
                .unlockedBy("has_brown_polished_marble", has(ModBlocks.BROWN_POLISHED_MARBLE.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_POLISHED_MARBLE_SLAB.get(), ModBlocks.BROWN_POLISHED_MARBLE);

        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_MARBLE_WALL.get(), ModBlocks.BROWN_MARBLE.get());
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_POLISHED_MARBLE_WALL.get(), ModBlocks.BROWN_POLISHED_MARBLE.get());


        //Black Marble Recipes
        shaped(RecipeCategory.MISC, ModBlocks.BLACK_POLISHED_MARBLE.get())
                .pattern("SS")
                .pattern("SS")
                .define('S', ModBlocks.BLACK_MARBLE.get())
                .unlockedBy(getHasName(ModBlocks.BLACK_MARBLE.get()), has(ModBlocks.BLACK_MARBLE.get()))
                .save(output);

        stairBuilder(ModBlocks.BLACK_MARBLE_STAIRS.get(), Ingredient.of(ModBlocks.BLACK_MARBLE.get())).group("black_marble")
                .unlockedBy("has_black_marble", has(ModBlocks.BLACK_MARBLE.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_MARBLE_SLAB.get(), ModBlocks.BLACK_MARBLE);

        stairBuilder(ModBlocks.BLACK_POLISHED_MARBLE_STAIRS.get(), Ingredient.of(ModBlocks.BLACK_POLISHED_MARBLE.get())).group("black_polished_marble")
                .unlockedBy("has_black_polished_marble", has(ModBlocks.BLACK_POLISHED_MARBLE.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_POLISHED_MARBLE_SLAB.get(), ModBlocks.BLACK_POLISHED_MARBLE);

        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_MARBLE_WALL.get(), ModBlocks.BLACK_MARBLE.get());
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_POLISHED_MARBLE_WALL.get(), ModBlocks.BLACK_POLISHED_MARBLE.get());

        //HEMP RECIPES
        shaped(RecipeCategory.MISC, ModBlocks.HEMP_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.HEMP_CLUMP.get())
                .unlockedBy("has_hemp_block", has(ModItems.HEMP_CLUMP.get()))
                .save(output);

        shapeless(RecipeCategory.MISC, ModItems.HEMP_CLUMP.get(), 9)
                .requires(ModBlocks.HEMP_BLOCK.get())
                .unlockedBy("has_hemp_block", has(ModBlocks.HEMP_BLOCK.get()))
                .save(output);

        stairBuilder(ModBlocks.HEMP_STAIRS.get(), Ingredient.of(ModBlocks.HEMP_BLOCK.get())).group("hemp_block")
                .unlockedBy("has_hemp_block", has(ModBlocks.HEMP_BLOCK.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HEMP_SLAB.get(), ModBlocks.HEMP_BLOCK.get());

        pressurePlate(ModBlocks.HEMP_PRESSURE_PLATE.get(), ModBlocks.HEMP_BLOCK.get());
        buttonBuilder(ModBlocks.HEMP_BUTTON.get(), Ingredient.of(ModBlocks.HEMP_BLOCK.get())).group("hemp_block")
                .group("hemp")
                .unlockedBy("has_hemp_block", has(ModBlocks.HEMP_BLOCK.get()))
                .save(output);

        fenceBuilder(ModBlocks.HEMP_FENCE.get(), Ingredient.of(ModBlocks.HEMP_BLOCK.get())).group("hemp_block")
                .group("hemp")
                .unlockedBy("has_hemp_block", has(ModBlocks.HEMP_BLOCK.get()))
                .save(output);
        fenceGateBuilder(ModBlocks.HEMP_FENCE_GATE.get(), Ingredient.of(ModBlocks.HEMP_BLOCK.get())).group("hemp_block")
                .group("hemp")
                .unlockedBy("has_hemp_block", has(ModBlocks.HEMP_BLOCK.get()))
                .save(output);

        doorBuilder(ModBlocks.HEMP_DOOR.get(), Ingredient.of(ModBlocks.HEMP_BLOCK.get())).group("hemp_block")
                .group("hemp")
                .unlockedBy("has_hemp_block", has(ModBlocks.HEMP_BLOCK.get()))
                .save(output);
        trapdoorBuilder(ModBlocks.HEMP_TRAPDOOR.get(), Ingredient.of(ModBlocks.HEMP_BLOCK.get())).group("hemp_block")
                .group("hemp")
                .unlockedBy("has_hemp_block", has(ModBlocks.HEMP_BLOCK.get()))
                .save(output);


        //SANDSTONE BRICK RECIPES
        shaped(RecipeCategory.MISC, ModBlocks.SANDSTONE_BRICK.get())
                .pattern("SS")
                .pattern("SS")
                .define('S', Blocks.CUT_SANDSTONE)
                .unlockedBy(getHasName(Blocks.CUT_SANDSTONE), has(Blocks.CUT_SANDSTONE))
                .save(output);

        stairBuilder(ModBlocks.SANDSTONE_BRICK_STAIRS.get(), Ingredient.of(ModBlocks.SANDSTONE_BRICK.get())).group("sandstone_brick")
                .unlockedBy("has_sandstone_brick", has(ModBlocks.SANDSTONE_BRICK.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_SLAB.get(), ModBlocks.SANDSTONE_BRICK);
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_BRICK_WALL.get(), ModBlocks.SANDSTONE_BRICK.get());


        //VAMPIRE RECIPES
        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VAMPIRE_PLANKS, 4)
                .requires(ModBlocks.VAMPIRE_LOG)
                .group("planks")
                .unlockedBy("has_log", has(ModBlocks.VAMPIRE_LOG))
                .save(output);

        stairBuilder(ModBlocks.VAMPIRE_STAIRS.get(), Ingredient.of(ModBlocks.VAMPIRE_PLANKS.get())).group("vampire_planks")
                .unlockedBy("has_vampire_planks", has(ModBlocks.VAMPIRE_PLANKS.get()))
                .save(output);
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VAMPIRE_SLAB.get(), ModBlocks.VAMPIRE_PLANKS.get());

        pressurePlate(ModBlocks.VAMPIRE_PRESSURE_PLATE.get(), ModBlocks.VAMPIRE_PLANKS.get());
        buttonBuilder(ModBlocks.VAMPIRE_BUTTON.get(), Ingredient.of(ModBlocks.VAMPIRE_PLANKS.get())).group("vampire_planks")
                .group("vampire")
                .unlockedBy("has_vampire_planks", has(ModBlocks.VAMPIRE_PLANKS.get()))
                .save(output);

        fenceBuilder(ModBlocks.VAMPIRE_FENCE.get(), Ingredient.of(ModBlocks.VAMPIRE_PLANKS.get())).group("vampire_planks")
                .group("vampire")
                .unlockedBy("has_vampire_planks", has(ModBlocks.VAMPIRE_PLANKS.get()))
                .save(output);
        fenceGateBuilder(ModBlocks.VAMPIRE_FENCE_GATE.get(), Ingredient.of(ModBlocks.VAMPIRE_PLANKS.get())).group("vampire_planks")
                .group("vampire")
                .unlockedBy("has_vampire_planks", has(ModBlocks.VAMPIRE_PLANKS.get()))
                .save(output);

        doorBuilder(ModBlocks.VAMPIRE_DOOR.get(), Ingredient.of(ModBlocks.VAMPIRE_PLANKS.get())).group("vampire_planks")
                .group("vampire")
                .unlockedBy("has_vampire_planks", has(ModBlocks.VAMPIRE_PLANKS.get()))
                .save(output);
        trapdoorBuilder(ModBlocks.VAMPIRE_TRAPDOOR.get(), Ingredient.of(ModBlocks.VAMPIRE_PLANKS.get())).group("vampire_planks")
                .group("vampire")
                .unlockedBy("has_vampire_planks", has(ModBlocks.VAMPIRE_PLANKS.get()))
                .save(output);


    }


    @Override
    protected <T extends AbstractCookingRecipe> void oreCooking(AbstractCookingRecipe.Factory<T> factory, List<ItemLike> smeltables,
                                                                RecipeCategory craftingCategory, CookingBookCategory cookingCategory,
                                                                ItemLike result, float experience, int cookingTime, String group, String fromDesc) {
        for (ItemLike item : smeltables) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(item), craftingCategory, cookingCategory, result, experience, cookingTime, factory)
                    .group(group)
                    .unlockedBy(getHasName(item), this.has(item))
                    .save(this.output, Snonecraft.MOD_ID + ":" + getItemName(result) + fromDesc + "_" + getItemName(item));
        }

    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new ModRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "Snonecraft Recipes";
        }
    }
}
