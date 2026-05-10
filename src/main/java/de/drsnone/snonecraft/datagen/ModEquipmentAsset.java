package de.drsnone.snonecraft.datagen;

import de.drsnone.snonecraft.Snonecraft;
import de.drsnone.snonecraft.item.ModArmorMaterials;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ModEquipmentAsset implements DataProvider {
    private final PackOutput.PathProvider pathProvider;

    public ModEquipmentAsset(PackOutput output) {
        this.pathProvider = output.createPathProvider(PackOutput.Target.RESOURCE_PACK, "equipment");
    }



    private static void bootstrap(BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> output) {
        output.accept(ModArmorMaterials.SNONIUM_KEY, EquipmentClientInfo.builder()
                .addHumanoidLayers(Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "zircon"), false)
                .addLayers(EquipmentClientInfo.LayerType.HUMANOID,
                        new EquipmentClientInfo.Layer(Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "snonium"))).build());
// second one
        output.accept(ModArmorMaterials.MARBERITH_KEY, EquipmentClientInfo.builder()
                .addHumanoidLayers(Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "marberith"), false)
                .addLayers(EquipmentClientInfo.LayerType.HUMANOID,
                        new EquipmentClientInfo.Layer(Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "marberith"))).build());

        output.accept(ModArmorMaterials.DIOPSID_KEY, EquipmentClientInfo.builder()
                .addHumanoidLayers(Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "diopsid"), false)
                .addLayers(EquipmentClientInfo.LayerType.HUMANOID,
                        new EquipmentClientInfo.Layer(Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "diopsid"))).build());

        output.accept(ModArmorMaterials.RUBY_KEY, EquipmentClientInfo.builder()
                .addHumanoidLayers(Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "ruby"), false)
                .addLayers(EquipmentClientInfo.LayerType.HUMANOID,
                        new EquipmentClientInfo.Layer(Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "ruby"))).build());

    }



    @Override
    public CompletableFuture<?> run(CachedOutput cache) {
        Map<ResourceKey<EquipmentAsset>, EquipmentClientInfo> equipmentAssets = new HashMap<>();
        bootstrap((id, asset) -> {
            if (equipmentAssets.putIfAbsent(id, asset) != null) {
                throw new IllegalStateException("Tried to register equipment asset twice for id: " + id);
            }
        });
        return DataProvider.saveAll(cache, EquipmentClientInfo.CODEC, this.pathProvider::json, equipmentAssets);
    }



    @Override
    public String getName() {
        return "Snonecraft Equipment Definitions";
    }
}
