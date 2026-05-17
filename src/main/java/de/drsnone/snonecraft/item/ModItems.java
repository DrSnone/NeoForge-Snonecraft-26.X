package de.drsnone.snonecraft.item;

import de.drsnone.snonecraft.Snonecraft;
import de.drsnone.snonecraft.block.ModBlocks;
import de.drsnone.snonecraft.entity.ModEntities;
import de.drsnone.snonecraft.food.ModFoodProperties;
import de.drsnone.snonecraft.item.custom.HammerItem;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Properties;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Snonecraft.MOD_ID);

    public static final DeferredItem<Item> SNONIUM_INGOT =
            ITEMS.registerSimpleItem("snonium_ingot", properties -> properties);
    public static final DeferredItem<Item> RAW_SNONIUM =
            ITEMS.registerSimpleItem("raw_snonium", properties -> properties);

    public static final DeferredItem<Item> RUBY =
            ITEMS.registerSimpleItem("ruby", properties -> properties);
    public static final DeferredItem<Item> RAW_RUBY =
            ITEMS.registerSimpleItem("raw_ruby", properties -> properties);

    public static final DeferredItem<Item> DIOPSID =
            ITEMS.registerSimpleItem("diopsid", properties -> properties);
    public static final DeferredItem<Item> RAW_DIOPSID =
            ITEMS.registerSimpleItem("raw_diopsid", properties -> properties);

    public static final DeferredItem<Item> SAPPHIRE =
            ITEMS.registerSimpleItem("sapphire", properties -> properties);
    public static final DeferredItem<Item> RAW_SAPPHIRE =
            ITEMS.registerSimpleItem("raw_sapphire", properties -> properties);

    public static final DeferredItem<Item> AMBER =
            ITEMS.registerSimpleItem("amber", properties -> properties);
    public static final DeferredItem<Item> RAW_AMBER =
            ITEMS.registerSimpleItem("raw_amber", properties -> properties);

    public static final DeferredItem<Item> MARBERITH =
            ITEMS.registerSimpleItem("marberith", properties -> properties);
    public static final DeferredItem<Item> RAW_MARBERITH =
            ITEMS.registerSimpleItem("raw_marberith", properties -> properties);

    public static final DeferredItem<Item> HEMP =
            ITEMS.registerSimpleItem("hemp", properties -> properties);

    public static final DeferredItem<Item> HEMP_CLUMP =
            ITEMS.registerSimpleItem("hemp_clump", properties -> properties);

    //SNONIUM TOOLS
    public static final DeferredItem<Item> SNONIUM_SWORD = ITEMS.registerItem("snonium_sword",
            properties -> new Item(properties.sword(ModToolMaterials.SNONIUM, 4, -2.4f)));
    public static final DeferredItem<Item> SNONIUM_PICKAXE = ITEMS.registerItem("snonium_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolMaterials.SNONIUM, 1f, -2.8f)));
    public static final DeferredItem<Item> SNONIUM_SHOVEL = ITEMS.registerItem("snonium_shovel",
            properties -> new ShovelItem(ModToolMaterials.SNONIUM, 1.5f, -3f, properties));
    public static final DeferredItem<Item> SNONIUM_AXE = ITEMS.registerItem("snonium_axe",
            properties -> new AxeItem(ModToolMaterials.SNONIUM, 6f, -3.2f, properties));
    public static final DeferredItem<Item> SNONIUM_HOE = ITEMS.registerItem("snonium_hoe",
            properties -> new HoeItem(ModToolMaterials.SNONIUM, 0f, -3f, properties));
    public static final DeferredItem<Item> SNONIUM_HAMMER = ITEMS.registerItem("snonium_hammer",
            properties -> new HammerItem(properties.pickaxe(ModToolMaterials.SNONIUM, 7f, -3.4f)));

    //SNONIUM ARMOR
    public static final DeferredItem<Item> SNONIUM_HELMET = ITEMS.registerItem("snonium_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SNONIUM_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> SNONIUM_CHESTPLATE = ITEMS.registerItem("snonium_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SNONIUM_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> SNONIUM_LEGGINGS = ITEMS.registerItem("snonium_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SNONIUM_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> SNONIUM_BOOTS = ITEMS.registerItem("snonium_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SNONIUM_ARMOR_MATERIAL, ArmorType.BOOTS)));

    //MARBERITH TOOLS
    public static final DeferredItem<Item> MARBERITH_SWORD = ITEMS.registerItem("marberith_sword",
            properties -> new Item(properties.sword(ModToolMaterials.MARBERITH, 4, -2.4f)));
    public static final DeferredItem<Item> MARBERITH_PICKAXE = ITEMS.registerItem("marberith_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolMaterials.MARBERITH, 1f, -2.8f)));
    public static final DeferredItem<Item> MARBERITH_SHOVEL = ITEMS.registerItem("marberith_shovel",
            properties -> new ShovelItem(ModToolMaterials.MARBERITH, 1.5f, -3f, properties));
    public static final DeferredItem<Item> MARBERITH_AXE = ITEMS.registerItem("marberith_axe",
            properties -> new AxeItem(ModToolMaterials.MARBERITH, 6f, -3.2f, properties));
    public static final DeferredItem<Item> MARBERITH_HOE = ITEMS.registerItem("marberith_hoe",
            properties -> new HoeItem(ModToolMaterials.MARBERITH, 0f, -3f, properties));

    //MARBERITH ARMOR
    public static final DeferredItem<Item> MARBERITH_HELMET = ITEMS.registerItem("marberith_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.MARBERITH_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> MARBERITH_CHESTPLATE = ITEMS.registerItem("marberith_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.MARBERITH_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> MARBERITH_LEGGINGS = ITEMS.registerItem("marberith_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.MARBERITH_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> MARBERITH_BOOTS = ITEMS.registerItem("marberith_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.MARBERITH_ARMOR_MATERIAL, ArmorType.BOOTS)));

    //RUBY TOOLS
    public static final DeferredItem<Item> RUBY_SWORD = ITEMS.registerItem("ruby_sword",
            properties -> new Item(properties.sword(ModToolMaterials.RUBY, 4, -2.4f)));
    public static final DeferredItem<Item> RUBY_PICKAXE = ITEMS.registerItem("ruby_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolMaterials.RUBY, 1f, -2.8f)));
    public static final DeferredItem<Item> RUBY_SHOVEL = ITEMS.registerItem("ruby_shovel",
            properties -> new ShovelItem(ModToolMaterials.RUBY, 1.5f, -3f, properties));
    public static final DeferredItem<Item> RUBY_AXE = ITEMS.registerItem("ruby_axe",
            properties -> new AxeItem(ModToolMaterials.RUBY, 6f, -3.2f, properties));
    public static final DeferredItem<Item> RUBY_HOE = ITEMS.registerItem("ruby_hoe",
            properties -> new HoeItem(ModToolMaterials.RUBY, 0f, -3f, properties));
    public static final DeferredItem<Item> RUBY_HAMMER = ITEMS.registerItem("ruby_hammer",
            properties -> new HammerItem(properties.pickaxe(ModToolMaterials.RUBY, 7f, -3.4f)));

    //RUBY ARMOR
    public static final DeferredItem<Item> RUBY_HELMET = ITEMS.registerItem("ruby_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> RUBY_CHESTPLATE = ITEMS.registerItem("ruby_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> RUBY_LEGGINGS = ITEMS.registerItem("ruby_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> RUBY_BOOTS = ITEMS.registerItem("ruby_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.RUBY_ARMOR_MATERIAL, ArmorType.BOOTS)));

    //DIOPSID TOOLS
    public static final DeferredItem<Item> DIOPSID_SWORD = ITEMS.registerItem("diopsid_sword",
            properties -> new Item(properties.sword(ModToolMaterials.DIOPSID, 4, -2.4f)));
    public static final DeferredItem<Item> DIOPSID_PICKAXE = ITEMS.registerItem("diopsid_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolMaterials.DIOPSID, 1f, -2.8f)));
    public static final DeferredItem<Item> DIOPSID_SHOVEL = ITEMS.registerItem("diopsid_shovel",
            properties -> new ShovelItem(ModToolMaterials.DIOPSID, 1.5f, -3f, properties));
    public static final DeferredItem<Item> DIOPSID_AXE = ITEMS.registerItem("diopsid_axe",
            properties -> new AxeItem(ModToolMaterials.DIOPSID, 6f, -3.2f, properties));
    public static final DeferredItem<Item> DIOPSID_HOE = ITEMS.registerItem("diopsid_hoe",
            properties -> new HoeItem(ModToolMaterials.DIOPSID, 0f, -3f, properties));
    public static final DeferredItem<Item> DIOPSID_HAMMER = ITEMS.registerItem("diopsid_hammer",
            properties -> new HammerItem(properties.pickaxe(ModToolMaterials.DIOPSID, 7f, -3.4f)));

    //DIOPSID ARMOR
    public static final DeferredItem<Item> DIOPSID_HELMET = ITEMS.registerItem("diopsid_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.DIOPSID_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> DIOPSID_CHESTPLATE = ITEMS.registerItem("diopsid_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.DIOPSID_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> DIOPSID_LEGGINGS = ITEMS.registerItem("diopsid_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.DIOPSID_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> DIOPSID_BOOTS = ITEMS.registerItem("diopsid_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.DIOPSID_ARMOR_MATERIAL, ArmorType.BOOTS)));

    //SAPPHIRE TOOLS
    public static final DeferredItem<Item> SAPPHIRE_SWORD = ITEMS.registerItem("sapphire_sword",
            properties -> new Item(properties.sword(ModToolMaterials.SAPPHIRE, 4, -2.4f)));
    public static final DeferredItem<Item> SAPPHIRE_PICKAXE = ITEMS.registerItem("sapphire_pickaxe",
            properties -> new Item(properties.pickaxe(ModToolMaterials.SAPPHIRE, 1f, -2.8f)));
    public static final DeferredItem<Item> SAPPHIRE_SHOVEL = ITEMS.registerItem("sapphire_shovel",
            properties -> new ShovelItem(ModToolMaterials.SAPPHIRE, 1.5f, -3f, properties));
    public static final DeferredItem<Item> SAPPHIRE_AXE = ITEMS.registerItem("sapphire_axe",
            properties -> new AxeItem(ModToolMaterials.SAPPHIRE, 6f, -3.2f, properties));
    public static final DeferredItem<Item> SAPPHIRE_HOE = ITEMS.registerItem("sapphire_hoe",
            properties -> new HoeItem(ModToolMaterials.SAPPHIRE, 0f, -3f, properties));
    public static final DeferredItem<Item> SAPPHIRE_HAMMER = ITEMS.registerItem("sapphire_hammer",
            properties -> new HammerItem(properties.pickaxe(ModToolMaterials.SAPPHIRE, 7f, -3.4f)));

    //SAPPHIRE ARMOR
    public static final DeferredItem<Item> SAPPHIRE_HELMET = ITEMS.registerItem("sapphire_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> SAPPHIRE_CHESTPLATE = ITEMS.registerItem("sapphire_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> SAPPHIRE_LEGGINGS = ITEMS.registerItem("sapphire_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> SAPPHIRE_BOOTS = ITEMS.registerItem("sapphire_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.SAPPHIRE_ARMOR_MATERIAL, ArmorType.BOOTS)));

    //BAT ARMOR
    public static final DeferredItem<Item> BAT_HELMET = ITEMS.registerItem("bat_helmet",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.BAT_ARMOR_MATERIAL, ArmorType.HELMET)));
    public static final DeferredItem<Item> BAT_CHESTPLATE = ITEMS.registerItem("bat_chestplate",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.BAT_ARMOR_MATERIAL, ArmorType.CHESTPLATE)));
    public static final DeferredItem<Item> BAT_LEGGINGS = ITEMS.registerItem("bat_leggings",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.BAT_ARMOR_MATERIAL, ArmorType.LEGGINGS)));
    public static final DeferredItem<Item> BAT_BOOTS = ITEMS.registerItem("bat_boots",
            properties -> new Item(properties.humanoidArmor(ModArmorMaterials.BAT_ARMOR_MATERIAL, ArmorType.BOOTS)));

    //FOODS
    public static final DeferredItem<Item> PICKLE = ITEMS.registerItem("pickle",
            properties -> new Item(properties.food(ModFoodProperties.PICKLE, ModFoodProperties.PICKLE_EFFECT)));


    public static final DeferredItem<Item> ICE_LETTUCE = ITEMS.registerItem("ice_lettuce",
            properties -> new Item(properties.food(ModFoodProperties.ICE_LETTUCE, ModFoodProperties.ICE_LETTUCE_EFFECT)));
    public static final DeferredItem<Item> MEAT_TOMATO = ITEMS.registerItem("meat_tomato",
            properties -> new Item(properties.food(ModFoodProperties.MEAT_TOMATO, ModFoodProperties.MEAT_TOMATO_EFFECT)));
    public static final DeferredItem<Item> RED_ONION = ITEMS.registerItem("red_onion",
            properties -> new Item(properties.food(ModFoodProperties.RED_ONION, ModFoodProperties.RED_ONION_EFFECT)));
    public static final DeferredItem<Item> FLATBREAD = ITEMS.registerItem("flatbread",
            properties -> new Item(properties.food(ModFoodProperties.FLATBREAD, ModFoodProperties.FLATBREAD_EFFECT)));
    public static final DeferredItem<Item> QUARTER_FLATBREAD = ITEMS.registerItem("quarter_flatbread",
            properties -> new Item(properties.food(ModFoodProperties.QUARTER_FLATBREAD, ModFoodProperties.QUARTER_FLATBREAD_EFFECT)));
    public static final DeferredItem<Item> FETA_CHEESE = ITEMS.registerItem("feta_cheese",
            properties -> new Item(properties.food(ModFoodProperties.FETA_CHEESE, ModFoodProperties.FETA_CHEESE_EFFECT)));
    public static final DeferredItem<Item> JAR_YOGU_SOUCE = ITEMS.registerItem("jar_yogu_souce",
            properties -> new Item(properties.food(ModFoodProperties.JAR_YOGU_SOUCE, ModFoodProperties.JAR_YOGU_SOUCE_EFFECT)));
    public static final DeferredItem<Item> KEBAB_MEAT = ITEMS.registerItem("kebab_meat",
            properties -> new Item(properties.food(ModFoodProperties.KEBAB_MEAT, ModFoodProperties.KEBAB_MEAT_EFFECT)));
    public static final DeferredItem<Item> RAW_KEBAB_PIKE = ITEMS.registerItem("raw_kebab_pike",
            properties -> new Item(properties.food(ModFoodProperties.RAW_KEBAB_PIKE, ModFoodProperties.RAW_KEBAB_PIKE_EFFECT)));
    public static final DeferredItem<Item> GRILLED_KEBAB_PIKE = ITEMS.registerItem("grilled_kebab_pike",
            properties -> new Item(properties.food(ModFoodProperties.GRILLED_KEBAB_PIKE, ModFoodProperties.GRILLED_KEBAB_PIKE_EFFECT)));
    public static final DeferredItem<Item> SNOENER = ITEMS.registerItem("snoener",
            properties -> new Item(properties.food(ModFoodProperties.SNOENER, ModFoodProperties.SNOENER_EFFECT)));
    public static final DeferredItem<Item> SNOENER_BOX = ITEMS.registerItem("snoener_box",
            properties -> new Item(properties.food(ModFoodProperties.SNOENER_BOX, ModFoodProperties.SNOENER_BOX_EFFECT)));

    //BAT DROPS and FOOD
    public static final DeferredItem<Item> BAT_WING =
            ITEMS.registerSimpleItem("bat_wing", properties -> properties);
    public static final DeferredItem<Item> BAT_LEATHER =
            ITEMS.registerSimpleItem("bat_leather", properties -> properties);

    public static final DeferredItem<Item> RAW_BAT_BEEF = ITEMS.registerItem("raw_bat_beef",
            properties -> new Item(properties.food(ModFoodProperties.RAW_BAT_BEEF, ModFoodProperties.RAW_BAT_BEEF_EFFECT)));
    public static final DeferredItem<Item> RAW_BAT_PATTY = ITEMS.registerItem("raw_bat_patty",
            properties -> new Item(properties.food(ModFoodProperties.RAW_BAT_PATTY, ModFoodProperties.RAW_BAT_PATTY_EFFECT)));
    public static final DeferredItem<Item> GRILLED_BAT_PATTY = ITEMS.registerItem("grilled_bat_patty",
            properties -> new Item(properties.food(ModFoodProperties.GRILLED_BAT_PATTY, ModFoodProperties.GRILLED_BAT_PATTY_EFFECT)));
    public static final DeferredItem<Item> BAT_BURGER = ITEMS.registerItem("bat_burger",
            properties -> new Item(properties.food(ModFoodProperties.BAT_BURGER, ModFoodProperties.BAT_BURGER_EFFECT)));

    //SEEDS
    public static final DeferredItem<Item> PICKLE_SEEDS = ITEMS.registerItem("pickle_seeds",
            properties -> new BlockItem(ModBlocks.PICKLE_CROP.get(), properties.useItemDescriptionPrefix()));
    public static final DeferredItem<Item> ICE_LETTUCE_SEEDS = ITEMS.registerItem("ice_lettuce_seeds",
            properties -> new BlockItem(ModBlocks.ICE_LETTUCE_CROP.get(), properties.useItemDescriptionPrefix()));
    public static final DeferredItem<Item> MEAT_TOMATO_SEEDS = ITEMS.registerItem("meat_tomato_seeds",
            properties -> new BlockItem(ModBlocks.MEAT_TOMATO_CROP.get(), properties.useItemDescriptionPrefix()));

    public static final DeferredItem<Item> RED_ONION_SEEDS = ITEMS.registerItem("red_onion_seeds",
            properties -> new BlockItem(ModBlocks.RED_ONION_CROP.get(), properties.useItemDescriptionPrefix()));
    public static final DeferredItem<Item> HEMP_SEEDS = ITEMS.registerItem("hemp_seeds",
            properties -> new BlockItem(ModBlocks.HEMP_CROP.get(), properties.useItemDescriptionPrefix()));

    public static final DeferredItem<Item> VAMPIRE_BOAT = ITEMS.registerItem("vampire_boat",
            properties -> new BoatItem(ModEntities.VAMPIRE_BOAT.get(), properties.stacksTo(1)));
    public static final DeferredItem<Item> VAMPIRE_CHEST_BOAT = ITEMS.registerItem("vampire_chest_boat",
            properties -> new BoatItem(ModEntities.VAMPIRE_CHEST_BOAT.get(), properties.stacksTo(1)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
