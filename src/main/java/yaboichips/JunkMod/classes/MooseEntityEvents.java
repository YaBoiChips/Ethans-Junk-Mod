package yaboichips.JunkMod.classes;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.fml.common.Mod;
import yaboichips.JunkMod.JunkMod;

@Mod.EventBusSubscriber(modid = JunkMod.JUNKMOD, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MooseEntityEvents {



    public static void registerEntityWorldSpawns()
    {
        registerEntityWorldSpawn(ModEntityTypes.MOOSE_ENTITY, EntityClassification.AMBIENT, Biomes.PLAINS, Biomes.TAIGA, Biomes.FOREST);
    }


    public static void registerEntityWorldSpawn(EntityType entity, EntityClassification classification, Biome... biomes)
    {
        for(Biome biome: biomes)
        {
            if (biome !=null)
            {
                biome.getSpawns(classification).add(new Biome.SpawnListEntry(entity,1000,9,10));
            }
        }
    }
}
