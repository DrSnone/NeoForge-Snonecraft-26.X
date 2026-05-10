package de.drsnone.snonecraft.item;

import com.google.common.collect.Maps;
import de.drsnone.snonecraft.Snonecraft;
import de.drsnone.snonecraft.tag.ModTags;


import net.minecraft.core.Registry;

import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;

import net.minecraft.sounds.SoundEvents;



import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;



import java.util.Map;

public class ModArmorMaterials {
    public static ResourceKey<? extends Registry<EquipmentAsset>> ROOT_ID =
            ResourceKey.createRegistryKey(Identifier.withDefaultNamespace("equipment_asset"));
    public static ResourceKey<EquipmentAsset> SNONIUM_KEY = ResourceKey.create(ROOT_ID,
            Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "snonium"));

    public static final ArmorMaterial SNONIUM_ARMOR_MATERIAL = new ArmorMaterial(39,
            makeDefense(5, 7, 9, 5, 15), 18, SoundEvents.ARMOR_EQUIP_NETHERITE,
            2f, 0.1f, ModTags.Items.SNONIUM_REPAIRABLES, SNONIUM_KEY);

    public static ResourceKey<EquipmentAsset> MARBERITH_KEY = ResourceKey.create(ROOT_ID,
            Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "marberith"));

    public static final ArmorMaterial MARBERITH_ARMOR_MATERIAL = new ArmorMaterial(29,
            makeDefense(2, 4, 6, 2, 9), 18, SoundEvents.ARMOR_EQUIP_NETHERITE,
            2f, 0.1f, ModTags.Items.MARBERITH_REPAIRABLES, MARBERITH_KEY);

    public static ResourceKey<EquipmentAsset> DIOPSID_KEY = ResourceKey.create(ROOT_ID,
            Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "diopsid"));

    public static final ArmorMaterial DIOPSID_ARMOR_MATERIAL = new ArmorMaterial(29,
            makeDefense(2, 4, 6, 2, 5), 18, SoundEvents.ARMOR_EQUIP_NETHERITE,
            2f, 0.1f, ModTags.Items.DIOPSID_REPAIRABLES, DIOPSID_KEY);

    public static ResourceKey<EquipmentAsset> RUBY_KEY = ResourceKey.create(ROOT_ID,
            Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "ruby"));

    public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new ArmorMaterial(29,
            makeDefense(2, 4, 6, 2, 5), 18, SoundEvents.ARMOR_EQUIP_NETHERITE,
            2f, 0.1f, ModTags.Items.RUBY_REPAIRABLES, RUBY_KEY);

    public static ResourceKey<EquipmentAsset> SAPPHIRE_KEY = ResourceKey.create(ROOT_ID,
            Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "sapphire"));

    public static final ArmorMaterial SAPPHIRE_ARMOR_MATERIAL = new ArmorMaterial(29,
            makeDefense(2, 4, 6, 2, 5), 18, SoundEvents.ARMOR_EQUIP_NETHERITE,
            2f, 0.1f, ModTags.Items.SAPPHIRE_REPAIRABLES, SAPPHIRE_KEY);

    public static ResourceKey<EquipmentAsset> BAT_KEY = ResourceKey.create(ROOT_ID,
            Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "bat"));

    public static final ArmorMaterial BAT_ARMOR_MATERIAL = new ArmorMaterial(29,
            makeDefense(2, 4, 6, 2, 5), 18, SoundEvents.ARMOR_EQUIP_LEATHER,
            2f, 0.1f, ModTags.Items.BAT_REPAIRABLES, BAT_KEY);


    private static Map<ArmorType, Integer> makeDefense(int boots, int legs, int chest, int helm, int body) {
        return Maps.newEnumMap(
                Map.of(ArmorType.BOOTS, boots, ArmorType.LEGGINGS, legs, ArmorType.CHESTPLATE, chest, ArmorType.HELMET, helm, ArmorType.BODY, body)
        );








    }
}
