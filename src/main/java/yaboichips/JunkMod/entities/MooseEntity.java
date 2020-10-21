package yaboichips.JunkMod.entities;


import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import yaboichips.JunkMod.lists.SoundList;


@SuppressWarnings("EntityConstructor")
public class MooseEntity extends SpiderEntity {
    private EatGrassGoal eatGrassGoal;
    private float headLean;
    private float prevHeadLean;

    public MooseEntity(EntityType<? extends SpiderEntity> type, World world) {
        super(type, world);
    }


    protected void registerGoals() {
        this.eatGrassGoal = new EatGrassGoal(this);
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.1D, Ingredient.fromItems(Items.WHEAT), false));
        this.goalSelector.addGoal(5, this.eatGrassGoal);
        this.goalSelector.addGoal(4, new MooseEntity.AttackGoal(this));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(7, new LookAtGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(8, new LookRandomlyGoal(this));
    }


    @OnlyIn(Dist.CLIENT)
    public float getGrassEatingAmount(float f) {
        return MathHelper.lerp(f, this.prevHeadLean, this.headLean);
    }

    protected SoundEvent getAmbientSound() {
        return SoundList.AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundList.HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundList.DEATH;
    }

    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.ENTITY_SHEEP_STEP, 0.15F, 1.0F);
    }

    protected void registerAttributes() {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(12.0D);
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3F);
    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {
        if (source.getImmediateSource() instanceof Entity) {
            source.getImmediateSource().setFire(10);
        }
            return super.attackEntityFrom(source, amount);
        }


    protected double getAttackReachSqr(LivingEntity attackTarget) {
        return 4.0F + attackTarget.getWidth();
    }

    static class AttackGoal extends MeleeAttackGoal {
        public AttackGoal(MooseEntity moose) {
            super(moose, 1.0D, true);
        }
    }
}


