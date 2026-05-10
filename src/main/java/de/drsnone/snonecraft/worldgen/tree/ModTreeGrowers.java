package de.drsnone.snonecraft.worldgen.tree;

import de.drsnone.snonecraft.Snonecraft;
import de.drsnone.snonecraft.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower VAMPIRE = new TreeGrower(Snonecraft.MOD_ID + ":vampire",
            Optional.empty(), Optional.of(ModConfiguredFeatures.VAMPIRE_KEY), Optional.empty());
}
