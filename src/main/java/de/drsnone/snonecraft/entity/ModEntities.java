package de.drsnone.snonecraft.entity;

import de.drsnone.snonecraft.Snonecraft;
import de.drsnone.snonecraft.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.createEntities(Snonecraft.MOD_ID);

    public static final ResourceKey<EntityType<?>> VAMPIRE_BOAT_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "vampire_boat"));
    public static final ResourceKey<EntityType<?>> VAMPIRE_CHEST_BOAT_KEY = ResourceKey.create(Registries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "vampire_chest_boat"));

    public static final Supplier<EntityType<Boat>> VAMPIRE_BOAT = ENTITY_TYPES.register("vampire_boat",
            () -> EntityType.Builder.<Boat>of((entityType, level) -> new Boat(entityType, level, ModItems.VAMPIRE_BOAT),
                            MobCategory.MISC).eyeHeight(0.5625f).clientTrackingRange(10).noLootTable()
                    .sized(1.375f, 0.5625f).build(VAMPIRE_BOAT_KEY));
    public static final Supplier<EntityType<ChestBoat>> VAMPIRE_CHEST_BOAT = ENTITY_TYPES.register("vampire_chest_boat",
            () -> EntityType.Builder.<ChestBoat>of((entityType, level) -> new ChestBoat(entityType, level, ModItems.VAMPIRE_CHEST_BOAT),
                            MobCategory.MISC).eyeHeight(0.5625f).clientTrackingRange(10).noLootTable()
                    .sized(1.375f, 0.5625f).build(VAMPIRE_CHEST_BOAT_KEY));





    public static void register(IEventBus eventBus) { ENTITY_TYPES.register(eventBus); }
}
