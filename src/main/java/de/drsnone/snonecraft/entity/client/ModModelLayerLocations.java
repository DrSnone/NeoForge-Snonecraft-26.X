package de.drsnone.snonecraft.entity.client;

import de.drsnone.snonecraft.Snonecraft;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.Identifier;

public class ModModelLayerLocations {

    public static final ModelLayerLocation VAMPIRE_BOAT =
            new ModelLayerLocation(Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "boat/vampire_boat"), "main");
    public static final ModelLayerLocation VAMPIRE_CHEST_BOAT =
            new ModelLayerLocation(Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, "chest_boat/vampire_boat"), "main");
}
