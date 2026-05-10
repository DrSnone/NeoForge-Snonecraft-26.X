package de.drsnone.snonecraft.datagen;

import de.drsnone.snonecraft.block.ModBlocks;
import de.drsnone.snonecraft.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Strippable;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    public ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider) {


        builder(NeoForgeDataMaps.COMPOSTABLES)
                .add(ModItems.PICKLE_SEEDS.getId(), new Compostable(0.3f), false)
                .add(ModItems.PICKLE.getId(), new Compostable(0.65f), false)
                .add(ModItems.ICE_LETTUCE_SEEDS.getId(), new Compostable(0.3f), false)
                .add(ModItems.ICE_LETTUCE.getId(), new Compostable(0.65f), false)
                .add(ModItems.MEAT_TOMATO_SEEDS.getId(), new Compostable(0.3f), false)
                .add(ModItems.MEAT_TOMATO.getId(), new Compostable(0.65f), false)
                .add(ModItems.RED_ONION_SEEDS.getId(), new Compostable(0.3f), false)
                .add(ModItems.RED_ONION.getId(), new Compostable(0.65f), false)
                .add(ModItems.HEMP_SEEDS.getId(), new Compostable(0.3f), false)
                .add(ModItems.HEMP.getId(), new Compostable(0.65f), false);

        builder(NeoForgeDataMaps.STRIPPABLES)
                .add(ModBlocks.VAMPIRE_LOG, new Strippable(ModBlocks.STRIPPED_VAMPIRE_LOG.get()), false)
                .add(ModBlocks.VAMPIRE_WOOD, new Strippable(ModBlocks.STRIPPED_VAMPIRE_WOOD.get()), false);
    }
}
