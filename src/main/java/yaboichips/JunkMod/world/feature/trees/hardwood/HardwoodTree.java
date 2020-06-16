package yaboichips.JunkMod.world.feature.trees.hardwood;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import java.util.Random;

import static yaboichips.JunkMod.lists.FeatureList.HARDWOOD_TREE_CONFIG;


public class HardwoodTree extends Tree {

    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean b) {
        return Feature.NORMAL_TREE.withConfiguration(HARDWOOD_TREE_CONFIG);
    }

}