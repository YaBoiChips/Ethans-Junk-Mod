package yaboichips.JunkMod.entities;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.IPacket;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ItemParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.network.NetworkHooks;
import yaboichips.JunkMod.classes.ModEntityTypes;
import yaboichips.JunkMod.lists.ItemList;

import javax.annotation.Nonnull;

public class PebbleEntity extends ProjectileItemEntity {
    public PebbleEntity(EntityType<? extends PebbleEntity> p_i50159_1_, World p_i50159_2_) {
        super(p_i50159_1_, p_i50159_2_);
    }

    public PebbleEntity(World worldIn, LivingEntity throwerIn) {
        super(ModEntityTypes.PEBBLE, throwerIn, worldIn);
    }

    public PebbleEntity(World worldIn, double x, double y, double z) {
        super(ModEntityTypes.PEBBLE, x, y, z, worldIn);
    }


    protected Item getDefaultItem() {
        return ItemList.wood_shard;
    }

    @OnlyIn(Dist.CLIENT)
    private IParticleData makeParticle() {
        ItemStack itemstack = this.func_213882_k();
        return itemstack.isEmpty() ? ParticleTypes.CRIT : new ItemParticleData(ParticleTypes.ITEM, itemstack);
    }

    /**
     * Handler for {@link World#setEntityState}
     */
    @OnlyIn(Dist.CLIENT)
    public void handleStatusUpdate(byte id) {
        if (id == 3) {
            IParticleData iparticledata = this.makeParticle();

            for(int i = 0; i < 8; ++i) {
                this.world.addParticle(iparticledata, this.getPosX(), this.getPosY(), this.getPosZ(), 0.0D, 0.0D, 0.0D);
            }
        }

    }
    @Override
    @Nonnull
    public IPacket createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(RayTraceResult result) {
        if (result.getType() == RayTraceResult.Type.ENTITY) {
            Entity entity = ((EntityRayTraceResult)result).getEntity();
            int i = entity instanceof Entity ? 1 : 0;
            entity.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)i);
        }

        if (!this.world.isRemote) {
            this.world.setEntityState(this, (byte)3);
            this.remove();
        }

    }
}
