package de.drsnone.snonecraft;

import de.drsnone.snonecraft.block.ModBlocks;
import de.drsnone.snonecraft.creativetab.ModCreativeModeTabs;
import de.drsnone.snonecraft.entity.ModEntities;
import de.drsnone.snonecraft.item.ModItems;
import de.drsnone.snonecraft.loot.ModLootModifiers;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.FlowerPotBlock;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;


import net.minecraft.world.item.CreativeModeTabs;

import net.minecraft.world.level.block.Blocks;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;


// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Snonecraft.MOD_ID)
public class Snonecraft {
    public static final String MOD_ID = "snonecraft";
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public Snonecraft(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading

        modEventBus.addListener(this::commonSetup);


        ModBlocks.register(modEventBus);

        ModItems.register(modEventBus);

        ModCreativeModeTabs.register(modEventBus);

        ModLootModifiers.register(modEventBus);

        ModEntities.register(modEventBus);






        NeoForge.EVENT_BUS.register(this);


        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        net.neoforged.neoforge.common.NeoForge.EVENT_BUS.register(new Object() {
            @net.neoforged.bus.api.SubscribeEvent
            public void onRightClick(net.neoforged.neoforge.event.entity.player.PlayerInteractEvent.RightClickBlock event) {
                if (event.getItemStack().is(ModItems.VAMPIRE_PUMPKIN_SEEDS.get())) {
                    net.minecraft.world.level.block.state.BlockState targetState = event.getLevel().getBlockState(event.getPos());

                    // Prüft, ob der Spieler auf Ackerboden (Farmland) klickt
                    if (targetState.is(net.minecraft.world.level.block.Blocks.FARMLAND) && event.getLevel().getBlockState(event.getPos().above()).isAir()) {
                        event.getLevel().setBlockAndUpdate(event.getPos().above(), ModBlocks.VAMPIRE_PUMPKIN_STEM.get().defaultBlockState());
                        event.getLevel().playSound(null, event.getPos().above(), net.minecraft.sounds.SoundEvents.CROP_PLANTED, net.minecraft.sounds.SoundSource.BLOCKS, 1.0F, 1.0F);

                        if (!event.getEntity().isCreative()) {
                            event.getItemStack().shrink(1);
                        }
                        event.setCancellationResult(net.minecraft.world.InteractionResult.SUCCESS);
                        event.setCanceled(true);
                    }
                }
            }
        });





        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.VAMPIRE_SAPLING.getId(), ModBlocks.POTTED_VAMPIRE_SAPLING);


        });

    }



    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.SNONIUM_INGOT);
            event.accept(ModItems.RAW_SNONIUM);
        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
