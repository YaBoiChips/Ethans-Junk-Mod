package yaboichips.modname.lists;

import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraftforge.common.IPlantable;

public class FeatureList {

    //trees
    public static final TreeFeatureConfig HARDWOOD_TREE_CONFIG = (new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(BlockList.hardwood_log.getDefaultState()),
            new SimpleBlockStateProvider(BlockList.cherry_leaves.getDefaultState()),
            new BlobFoliagePlacer(3, 0))).baseHeight(3).heightRandA(3).foliageHeight(2).ignoreVines()
            .setSapling((IPlantable) BlockList.hardwood_sapling).build();
}