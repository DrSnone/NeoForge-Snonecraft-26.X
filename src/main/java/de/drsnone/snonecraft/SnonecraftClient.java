package de.drsnone.snonecraft;

import de.drsnone.snonecraft.block.ModBlocks;
import de.drsnone.snonecraft.entity.ModEntities;
import de.drsnone.snonecraft.entity.client.ModModelLayerLocations;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.object.boat.BoatModel;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = Snonecraft.MOD_ID, dist = Dist.CLIENT)
// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
@EventBusSubscriber(modid = Snonecraft.MOD_ID, value = Dist.CLIENT)
public class SnonecraftClient {
    public SnonecraftClient(ModContainer container) {
        // Allows NeoForge to create a config screen for this mod's configs.
        // The config screen is accessed by going to the Mods screen > clicking on your mod > clicking on config.
        // Do not forget to add translations for your config options to the en_us.json file.
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        EntityRenderers.register(ModEntities.VAMPIRE_BOAT.get(), context -> new BoatRenderer(context, ModModelLayerLocations.VAMPIRE_BOAT));
        EntityRenderers.register(ModEntities.VAMPIRE_CHEST_BOAT.get(), context -> new BoatRenderer(context, ModModelLayerLocations.VAMPIRE_CHEST_BOAT));

    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {


        event.registerLayerDefinition(ModModelLayerLocations.VAMPIRE_BOAT, BoatModel::createBoatModel);
        event.registerLayerDefinition(ModModelLayerLocations.VAMPIRE_CHEST_BOAT, BoatModel::createChestBoatModel);
    }


}
