package de.drsnone.snonecraft.worldgen;

import de.drsnone.snonecraft.Snonecraft;
import de.drsnone.snonecraft.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;

import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SNONIUM_ORE_KEY = registerKey("snonium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SNONIUM_ORE_KEY = registerKey("nether_snonium_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_DIOPSID_ORE_KEY = registerKey("diopsid_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_AMBER_ORE_KEY = registerKey("amber_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_MARBERITH_ORE_KEY = registerKey("marberith_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_MARBERITH_ORE_KEY = registerKey("nether_marberith_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_WHITE_MARBLE_KEY = registerKey("white_marble");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_GREEN_MARBLE_KEY = registerKey("green_marble");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BROWN_MARBLE_KEY = registerKey("brown_marble");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_BLACK_MARBLE_KEY = registerKey("black_marble");

    public static final ResourceKey<ConfiguredFeature<?, ?>> VAMPIRE_KEY = registerKey("vampire");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);

        List<OreConfiguration.TargetBlockState> overworldSnoniumOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.SNONIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SNONIUM_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldDiopsidOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.DIOPSID_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_DIOPSID_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldRubyOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.RUBY_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldSapphireOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.SAPPHIRE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldAmberOres = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.AMBER_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldMarberithOres = List.of(OreConfiguration.target(stoneReplaceable,
                        ModBlocks.MARBERITH_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_MARBERITH_ORE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldWhiteMarble = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.WHITE_MARBLE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldGreenMarble = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.GREEN_MARBLE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldBrownMarble = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.BROWN_MARBLE.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldBlackMarble = List.of(OreConfiguration.target(stoneReplaceable,
                ModBlocks.BLACK_MARBLE.get().defaultBlockState()));

        register(context, OVERWORLD_SNONIUM_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSnoniumOres, 9));
        register(context, NETHER_SNONIUM_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.NETHER_SNONIUM_ORE.get().defaultBlockState(), 9));
        register(context, OVERWORLD_DIOPSID_ORE_KEY, Feature.ORE, new OreConfiguration(overworldDiopsidOres, 9));
        register(context, OVERWORLD_RUBY_ORE_KEY, Feature.ORE, new OreConfiguration(overworldRubyOres, 9));
        register(context, OVERWORLD_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(overworldSapphireOres, 9));
        register(context, OVERWORLD_AMBER_ORE_KEY, Feature.ORE, new OreConfiguration(overworldAmberOres, 9));

        register(context, OVERWORLD_MARBERITH_ORE_KEY, Feature.ORE, new OreConfiguration(overworldMarberithOres, 9));
        register(context, NETHER_MARBERITH_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplaceables,
                ModBlocks.NETHER_MARBERITH_ORE.get().defaultBlockState(), 9));

        register(context, OVERWORLD_WHITE_MARBLE_KEY, Feature.ORE, new OreConfiguration(overworldWhiteMarble, 48));
        register(context, OVERWORLD_GREEN_MARBLE_KEY, Feature.ORE, new OreConfiguration(overworldGreenMarble, 24));
        register(context, OVERWORLD_BROWN_MARBLE_KEY, Feature.ORE, new OreConfiguration(overworldBrownMarble, 24));
        register(context, OVERWORLD_BLACK_MARBLE_KEY, Feature.ORE, new OreConfiguration(overworldBlackMarble, 24));

        register(context, VAMPIRE_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(ModBlocks.VAMPIRE_LOG.get()),
                new StraightTrunkPlacer(3, 2, 1),

                BlockStateProvider.simple(ModBlocks.VAMPIRE_LEAVES.get()),
                new BlobFoliagePlacer(ConstantInt.of(3), ConstantInt.of(2), 3),

                new TwoLayersFeatureSize(1, 0, 2)).build());

    }



    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Identifier.fromNamespaceAndPath(Snonecraft.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
