package yaboichips.modname.world.feature.biomefeatures;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import yaboichips.modname.world.feature.trees.util.TreeFeature;

public class FeaturesInVanilla {
    public void addFeatures(FMLCommonSetupEvent e) {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.TAIGA || biome == Biomes.TAIGA_HILLS || biome == Biomes.TAIGA_MOUNTAINS || biome == Biomes.SNOWY_TAIGA || biome == Biomes.SNOWY_TAIGA_HILLS || biome == Biomes.SNOWY_TAIGA_MOUNTAINS) {
                TreeFeature.addHardwoodTree(Biomes.TAIGA);
                TreeFeature.addHardwoodTree(Biomes.TAIGA_HILLS);
                TreeFeature.addHardwoodTree(Biomes.TAIGA_MOUNTAINS);
                TreeFeature.addHardwoodTree(Biomes.SNOWY_TAIGA_MOUNTAINS);
                TreeFeature.addHardwoodTree(Biomes.SNOWY_TAIGA_HILLS);
                TreeFeature.addHardwoodTree(Biomes.SNOWY_TAIGA);
            }
        }
    }
}