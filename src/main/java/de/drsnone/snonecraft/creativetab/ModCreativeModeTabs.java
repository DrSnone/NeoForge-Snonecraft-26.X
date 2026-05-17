package de.drsnone.snonecraft.creativetab;

import de.drsnone.snonecraft.Snonecraft;
import de.drsnone.snonecraft.block.ModBlocks;
import de.drsnone.snonecraft.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Snonecraft.MOD_ID);

    public static final Supplier<CreativeModeTab> SNONECRAFT_ITEMS_TAB = CREATIVE_MODE_TAB.register("snonecraft_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SNONIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.snonecraft.snonium_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SNONIUM_INGOT);
                        output.accept(ModItems.RAW_SNONIUM);
                        output.accept(ModItems.RUBY);
                        output.accept(ModItems.RAW_RUBY);
                        output.accept(ModItems.DIOPSID);
                        output.accept(ModItems.RAW_DIOPSID);
                        output.accept(ModItems.SAPPHIRE);
                        output.accept(ModItems.RAW_SAPPHIRE);
                        output.accept(ModItems.AMBER);
                        output.accept(ModItems.RAW_AMBER);
                        output.accept(ModItems.MARBERITH);
                        output.accept(ModItems.RAW_MARBERITH);

                        output.accept(ModItems.SNONIUM_SWORD);
                        output.accept(ModItems.SNONIUM_AXE);
                        output.accept(ModItems.SNONIUM_PICKAXE);
                        output.accept(ModItems.SNONIUM_SHOVEL);
                        output.accept(ModItems.SNONIUM_HOE);
                        output.accept(ModItems.SNONIUM_HAMMER);

                        output.accept(ModItems.MARBERITH_SWORD);
                        output.accept(ModItems.MARBERITH_AXE);
                        output.accept(ModItems.MARBERITH_PICKAXE);
                        output.accept(ModItems.MARBERITH_SHOVEL);
                        output.accept(ModItems.MARBERITH_HOE);

                        output.accept(ModItems.RUBY_SWORD);
                        output.accept(ModItems.RUBY_AXE);
                        output.accept(ModItems.RUBY_PICKAXE);
                        output.accept(ModItems.RUBY_SHOVEL);
                        output.accept(ModItems.RUBY_HOE);
                        output.accept(ModItems.RUBY_HAMMER);

                        output.accept(ModItems.DIOPSID_SWORD);
                        output.accept(ModItems.DIOPSID_AXE);
                        output.accept(ModItems.DIOPSID_PICKAXE);
                        output.accept(ModItems.DIOPSID_SHOVEL);
                        output.accept(ModItems.DIOPSID_HOE);
                        output.accept(ModItems.DIOPSID_HAMMER);

                        output.accept(ModItems.SAPPHIRE_SWORD);
                        output.accept(ModItems.SAPPHIRE_AXE);
                        output.accept(ModItems.SAPPHIRE_PICKAXE);
                        output.accept(ModItems.SAPPHIRE_SHOVEL);
                        output.accept(ModItems.SAPPHIRE_HOE);
                        output.accept(ModItems.SAPPHIRE_HAMMER);

                        output.accept(ModItems.SNONIUM_HELMET);
                        output.accept(ModItems.SNONIUM_CHESTPLATE);
                        output.accept(ModItems.SNONIUM_LEGGINGS);
                        output.accept(ModItems.SNONIUM_BOOTS);

                        output.accept(ModItems.MARBERITH_HELMET);
                        output.accept(ModItems.MARBERITH_CHESTPLATE);
                        output.accept(ModItems.MARBERITH_LEGGINGS);
                        output.accept(ModItems.MARBERITH_BOOTS);

                        output.accept(ModItems.RUBY_HELMET);
                        output.accept(ModItems.RUBY_CHESTPLATE);
                        output.accept(ModItems.RUBY_LEGGINGS);
                        output.accept(ModItems.RUBY_BOOTS);

                        output.accept(ModItems.DIOPSID_HELMET);
                        output.accept(ModItems.DIOPSID_CHESTPLATE);
                        output.accept(ModItems.DIOPSID_LEGGINGS);
                        output.accept(ModItems.DIOPSID_BOOTS);

                        output.accept(ModItems.SAPPHIRE_HELMET);
                        output.accept(ModItems.SAPPHIRE_CHESTPLATE);
                        output.accept(ModItems.SAPPHIRE_LEGGINGS);
                        output.accept(ModItems.SAPPHIRE_BOOTS);


                        output.accept(ModItems.BAT_HELMET);
                        output.accept(ModItems.BAT_CHESTPLATE);
                        output.accept(ModItems.BAT_LEGGINGS);
                        output.accept(ModItems.BAT_BOOTS);

                        output.accept(ModItems.HEMP);
                        output.accept(ModItems.HEMP_CLUMP);
                        output.accept(ModItems.HEMP_SEEDS);
                        output.accept(ModItems.BAT_WING);
                        output.accept(ModItems.BAT_LEATHER);


                        output.accept(ModItems.PICKLE);
                        output.accept(ModItems.PICKLE_SEEDS);
                        output.accept(ModItems.ICE_LETTUCE);
                        output.accept(ModItems.ICE_LETTUCE_SEEDS);
                        output.accept(ModItems.MEAT_TOMATO);
                        output.accept(ModItems.MEAT_TOMATO_SEEDS);
                        output.accept(ModItems.RED_ONION);
                        output.accept(ModItems.RED_ONION_SEEDS);
                        output.accept(ModItems.FLATBREAD);
                        output.accept(ModItems.QUARTER_FLATBREAD);
                        output.accept(ModItems.FETA_CHEESE);
                        output.accept(ModItems.JAR_YOGU_SOUCE);
                        output.accept(ModItems.KEBAB_MEAT);
                        output.accept(ModItems.RAW_KEBAB_PIKE);
                        output.accept(ModItems.GRILLED_KEBAB_PIKE);
                        output.accept(ModItems.SNOENER);
                        output.accept(ModItems.SNOENER_BOX);
                        output.accept(ModItems.RAW_BAT_BEEF);
                        output.accept(ModItems.RAW_BAT_PATTY);
                        output.accept(ModItems.GRILLED_BAT_PATTY);
                        output.accept(ModItems.BAT_BURGER);

                        output.accept(ModItems.VAMPIRE_BOAT);
                        output.accept(ModItems.VAMPIRE_CHEST_BOAT);





                    }).build());


    public static final Supplier<CreativeModeTab> SNONECRAFT_BLOCK_TAB = CREATIVE_MODE_TAB.register("snonecraft_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SNONIUM_BLOCK))
                    .title(Component.translatable("creativetab.snonecraft.snonium_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.SNONIUM_BLOCK);
                        output.accept(ModBlocks.RUBY_BLOCK);
                        output.accept(ModBlocks.DIOPSID_BLOCK);
                        output.accept(ModBlocks.SAPPHIRE_BLOCK);
                        output.accept(ModBlocks.MARBERITH_BLOCK);

                        output.accept(ModBlocks.AMBER_BLOCK);
                        output.accept(ModBlocks.AMBER_BLOCK_STAIRS);
                        output.accept(ModBlocks.AMBER_BLOCK_SLAB);

                        output.accept(ModBlocks.AMBER_BRICK);
                        output.accept(ModBlocks.AMBER_BRICK_STAIRS);
                        output.accept(ModBlocks.AMBER_BRICK_SLAB);

                        output.accept(ModBlocks.SMALL_STONE_BRICKS);

                        output.accept(ModBlocks.SNONIUM_BRICK);
                        output.accept(ModBlocks.SNONIUM_BRICK_STAIRS);
                        output.accept(ModBlocks.SNONIUM_BRICK_SLAB);

                        output.accept(ModBlocks.SNONIUM_ORE);
                        output.accept(ModBlocks.DEEPSLATE_SNONIUM_ORE);
                        output.accept(ModBlocks.NETHER_SNONIUM_ORE);
                        output.accept(ModBlocks.MARBERITH_ORE);
                        output.accept(ModBlocks.DEEPSLATE_MARBERITH_ORE);
                        output.accept(ModBlocks.NETHER_MARBERITH_ORE);
                        output.accept(ModBlocks.RUBY_ORE);
                        output.accept(ModBlocks.DEEPSLATE_RUBY_ORE);
                        output.accept(ModBlocks.DIOPSID_ORE);
                        output.accept(ModBlocks.DEEPSLATE_DIOPSID_ORE);
                        output.accept(ModBlocks.SAPPHIRE_ORE);
                        output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                        output.accept(ModBlocks.AMBER_ORE);

                        output.accept(ModBlocks.HEMP_BLOCK);
                        output.accept(ModBlocks.HEMP_STAIRS);
                        output.accept(ModBlocks.HEMP_SLAB);
                        output.accept(ModBlocks.HEMP_BUTTON);
                        output.accept(ModBlocks.HEMP_FENCE);
                        output.accept(ModBlocks.HEMP_FENCE_GATE);
                        output.accept(ModBlocks.HEMP_PRESSURE_PLATE);
                        output.accept(ModBlocks.HEMP_DOOR);
                        output.accept(ModBlocks.HEMP_TRAPDOOR);


                        output.accept(ModBlocks.WHITE_MARBLE);
                        output.accept(ModBlocks.WHITE_MARBLE_STAIRS);
                        output.accept(ModBlocks.WHITE_MARBLE_SLAB);
                        output.accept(ModBlocks.WHITE_POLISHED_MARBLE);
                        output.accept(ModBlocks.WHITE_POLISHED_MARBLE_STAIRS);
                        output.accept(ModBlocks.WHITE_POLISHED_MARBLE_SLAB);
                        output.accept(ModBlocks.WHITE_MARBLE_WALL);
                        output.accept(ModBlocks.WHITE_POLISHED_MARBLE_WALL);

                        output.accept(ModBlocks.WHITE_MARBLE_BRICK);
                        output.accept(ModBlocks.WHITE_MARBLE_BRICK_STAIRS);
                        output.accept(ModBlocks.WHITE_MARBLE_BRICK_SLAB);
                        output.accept(ModBlocks.WHITE_MARBLE_BRICK_WALL);

                        output.accept(ModBlocks.WHITE_MARBLE_BRICK_SMALL);
                        output.accept(ModBlocks.WHITE_MARBLE_BRICK_SMALL_STAIRS);
                        output.accept(ModBlocks.WHITE_MARBLE_BRICK_SMALL_SLAB);
                        output.accept(ModBlocks.WHITE_MARBLE_BRICK_SMALL_WALL);

                        output.accept(ModBlocks.WHITE_MARBLE_FANCY);
                        output.accept(ModBlocks.WHITE_MARBLE_FANCY_STAIRS);
                        output.accept(ModBlocks.WHITE_MARBLE_FANCY_SLAB);
                        output.accept(ModBlocks.WHITE_MARBLE_FANCY_WALL);

                        output.accept(ModBlocks.WHITE_MARBLE_MOSAIK);
                        output.accept(ModBlocks.WHITE_MARBLE_MOSAIK_STAIRS);
                        output.accept(ModBlocks.WHITE_MARBLE_MOSAIK_SLAB);
                        output.accept(ModBlocks.WHITE_MARBLE_MOSAIK_WALL);

                        output.accept(ModBlocks.GREEN_MARBLE);
                        output.accept(ModBlocks.GREEN_MARBLE_STAIRS);
                        output.accept(ModBlocks.GREEN_MARBLE_SLAB);
                        output.accept(ModBlocks.GREEN_POLISHED_MARBLE);
                        output.accept(ModBlocks.GREEN_POLISHED_MARBLE_STAIRS);
                        output.accept(ModBlocks.GREEN_POLISHED_MARBLE_SLAB);
                        output.accept(ModBlocks.GREEN_MARBLE_WALL);
                        output.accept(ModBlocks.GREEN_POLISHED_MARBLE_WALL);

                        output.accept(ModBlocks.BROWN_MARBLE);
                        output.accept(ModBlocks.BROWN_MARBLE_STAIRS);
                        output.accept(ModBlocks.BROWN_MARBLE_SLAB);
                        output.accept(ModBlocks.BROWN_POLISHED_MARBLE);
                        output.accept(ModBlocks.BROWN_POLISHED_MARBLE_STAIRS);
                        output.accept(ModBlocks.BROWN_POLISHED_MARBLE_SLAB);
                        output.accept(ModBlocks.BROWN_MARBLE_WALL);
                        output.accept(ModBlocks.BROWN_POLISHED_MARBLE_WALL);

                        output.accept(ModBlocks.BLACK_MARBLE);
                        output.accept(ModBlocks.BLACK_MARBLE_STAIRS);
                        output.accept(ModBlocks.BLACK_MARBLE_SLAB);
                        output.accept(ModBlocks.BLACK_POLISHED_MARBLE);
                        output.accept(ModBlocks.BLACK_POLISHED_MARBLE_STAIRS);
                        output.accept(ModBlocks.BLACK_POLISHED_MARBLE_SLAB);
                        output.accept(ModBlocks.BLACK_MARBLE_WALL);
                        output.accept(ModBlocks.BLACK_POLISHED_MARBLE_WALL);
                        output.accept(ModBlocks.BLACK_MARBLE_BRICK);
                        output.accept(ModBlocks.BLACK_MARBLE_BRICK_STAIRS);
                        output.accept(ModBlocks.BLACK_MARBLE_BRICK_SLAB);
                        output.accept(ModBlocks.BLACK_MARBLE_BRICK_WALL);
                        output.accept(ModBlocks.BLACK_MARBLE_COBBLE);
                        output.accept(ModBlocks.BLACK_MARBLE_COBBLE_STAIRS);
                        output.accept(ModBlocks.BLACK_MARBLE_COBBLE_SLAB);
                        output.accept(ModBlocks.BLACK_MARBLE_COBBLE_WALL);
                        output.accept(ModBlocks.BLACK_MARBLE_FANCY);
                        output.accept(ModBlocks.BLACK_MARBLE_FANCY_STAIRS);
                        output.accept(ModBlocks.BLACK_MARBLE_FANCY_SLAB);
                        output.accept(ModBlocks.BLACK_MARBLE_FANCY_WALL);

                        output.accept(ModBlocks.SANDSTONE_BRICK);
                        output.accept(ModBlocks.SANDSTONE_BRICK_STAIRS);
                        output.accept(ModBlocks.SANDSTONE_BRICK_SLAB);
                        output.accept(ModBlocks.SANDSTONE_BRICK_WALL);


                        output.accept(ModBlocks.VAMPIRE_LOG);
                        output.accept(ModBlocks.VAMPIRE_WOOD);
                        output.accept(ModBlocks.STRIPPED_VAMPIRE_LOG);
                        output.accept(ModBlocks.STRIPPED_VAMPIRE_WOOD);
                        output.accept(ModBlocks.VAMPIRE_SAPLING);
                        output.accept(ModBlocks.VAMPIRE_PLANKS);
                        output.accept(ModBlocks.VAMPIRE_LEAVES);

                        output.accept(ModBlocks.VAMPIRE_STAIRS);
                        output.accept(ModBlocks.VAMPIRE_SLAB);
                        output.accept(ModBlocks.VAMPIRE_BUTTON);
                        output.accept(ModBlocks.VAMPIRE_FENCE);
                        output.accept(ModBlocks.VAMPIRE_FENCE_GATE);
                        output.accept(ModBlocks.VAMPIRE_PRESSURE_PLATE);
                        output.accept(ModBlocks.VAMPIRE_DOOR);
                        output.accept(ModBlocks.VAMPIRE_TRAPDOOR);



                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
