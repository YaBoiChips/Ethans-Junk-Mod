package yaboichips.modname.classes;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import yaboichips.modname.ModName;
import yaboichips.modname.entities.MooseEntity;
import yaboichips.modname.entities.PebbleEntity;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, ModName.MODID);

    public static final EntityType<MooseEntity> MOOSE_ENTITY = register("moose_entity", EntityType.Builder.create(MooseEntity::new, EntityClassification.CREATURE).size(0.6f, 0.5f));
    public static final EntityType<PebbleEntity> PEBBLE = register("pebble", EntityType.Builder.<PebbleEntity>create(PebbleEntity::new, EntityClassification.MISC).size(0.25F, 0.25F));
    private static <T extends Entity> EntityType<T> register(String key, EntityType.Builder<T> builder) {
        return Registry.register(Registry.ENTITY_TYPE, key, builder.build(key));
    }
}