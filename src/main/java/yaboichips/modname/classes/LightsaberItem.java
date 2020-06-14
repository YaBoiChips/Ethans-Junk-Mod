package yaboichips.modname.classes;

import com.google.common.collect.Multimap;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.TickableSound;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import yaboichips.modname.ModName;
import yaboichips.modname.lists.ItemList;
import yaboichips.modname.lists.SoundList;

public class LightsaberItem extends TieredItem {
    private final float attackDamage;
    private final float attackSpeed;

    public LightsaberItem(IItemTier tier, int attackDamageIn, float attackSpeedIn, Item.Properties builder) {
        super(tier, builder);
        this.attackSpeed = attackSpeedIn;
        this.attackDamage = (float) attackDamageIn + tier.getAttackDamage();

    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public boolean canPlayerBreakBlockWhileHolding(BlockState state, World worldIn, BlockPos pos, PlayerEntity player) {
        return !player.isCreative();
    }

    public float getDestroySpeed(ItemStack stack, BlockState state) {
        Block block = state.getBlock();
        if (block == Blocks.COBWEB) {
            return 15.0F;
        } else {
            Material material = state.getMaterial();
            return material != Material.PLANTS && material != Material.TALL_PLANTS && material != Material.CORAL && !state.isIn(BlockTags.LEAVES) && material != Material.GOURD ? 1.0F : 1.5F;
        }
    }

    /**
     * Current implementations of this method in child classes do not use the entry argument beside ev. They just raise
     * the damage on the stack.
     */
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.setFire(10);
        stack.damageItem(1, attacker, (p_220045_0_) -> {
            p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
        });
        return true;
    }

    /**
     * Called when a Block is destroyed using this Item. Return true to trigger the "Use Item" statistic.
     */
    public ActionResultType onItemUse(ItemUseContext context) {
        PlayerEntity playerentity = context.getPlayer();
        IWorld iworld = context.getWorld();
        BlockPos blockpos = context.getPos();
        BlockState blockstate = iworld.getBlockState(blockpos);
        if (isUnlitCampfire(blockstate)) {
            iworld.playSound(playerentity, blockpos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, random.nextFloat() * 0.4F + 0.8F);
            iworld.setBlockState(blockpos, blockstate.with(BlockStateProperties.LIT, Boolean.valueOf(true)), 11);
            if (playerentity != null) {
                context.getItem().damageItem(1, playerentity, (p_219999_1_) -> {
                    p_219999_1_.sendBreakAnimation(context.getHand());
                });
            }

            return ActionResultType.SUCCESS;
        } else {
            BlockPos blockpos1 = blockpos.offset(context.getFace());
            if (canSetFire(iworld.getBlockState(blockpos1), iworld, blockpos1)) {
                iworld.playSound(playerentity, blockpos1, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, random.nextFloat() * 0.4F + 0.8F);
                BlockState blockstate1 = ((FireBlock) Blocks.FIRE).getStateForPlacement(iworld, blockpos1);
                iworld.setBlockState(blockpos1, blockstate1, 11);
                ItemStack itemstack = context.getItem();
                if (playerentity instanceof ServerPlayerEntity) {
                    CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayerEntity) playerentity, blockpos1, itemstack);
                    itemstack.damageItem(1, playerentity, (p_219998_1_) -> {
                        p_219998_1_.sendBreakAnimation(context.getHand());
                    });
                }

                return ActionResultType.SUCCESS;
            } else {
                return ActionResultType.FAIL;
            }
        }
    }


    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand handIn) {
        ItemStack item = player.getHeldItem(handIn);
        {
            if(world.isRemote)
            if (player.getHeldItemMainhand().getItem() == ItemList.blue_lightsaber) {
                player.inventory.removeStackFromSlot(player.inventory.getSlotFor(new ItemStack(ItemList.blue_lightsaber)));
                player.inventory.add(player.inventory.getSlotFor(new ItemStack(ItemList.blue_lightsaber)), new ItemStack(ItemList.blue_lightsaber_handle));
                player.playSound(SoundList.CLOSE, 5.0f, 1.0f);

            }
        }
        {
            if(world.isRemote)
            if (player.getHeldItemMainhand().getItem() == ItemList.green_lightsaber) {
                player.inventory.removeStackFromSlot(player.inventory.getSlotFor(new ItemStack(ItemList.green_lightsaber)));
                player.inventory.addItemStackToInventory(new ItemStack(ItemList.green_lightsaber_handle));
                player.playSound(SoundList.CLOSE, 5.0f, 1.0f);
            }
        }
        {
            if(world.isRemote)
            if (player.getHeldItemMainhand().getItem() == ItemList.red_lightsaber) {
                player.inventory.removeStackFromSlot(player.inventory.getSlotFor(new ItemStack(ItemList.red_lightsaber)));
                player.inventory.addItemStackToInventory(new ItemStack(ItemList.red_lightsaber_handle));
                player.playSound(SoundList.CLOSE, 5.0f, 1.0f);
            }
        }
        {
            if(world.isRemote)
            if (player.getHeldItemMainhand().getItem() == ItemList.purple_lightsaber) {
                player.inventory.removeStackFromSlot(player.inventory.getSlotFor(new ItemStack(ItemList.purple_lightsaber)));
                player.inventory.addItemStackToInventory(new ItemStack(ItemList.purple_lightsaber_handle));
                player.playSound(SoundList.CLOSE, 5.0f, 1.0f);
            }
        }
        return new ActionResult<ItemStack>(ActionResultType.SUCCESS, item);
    }



    public boolean onBlockDestroyed(ItemStack stack, World worldIn, BlockState state, BlockPos pos, LivingEntity entityLiving) {
        if (state.getBlockHardness(worldIn, pos) != 0.0F) {
            stack.damageItem(0, entityLiving, (p_220044_0_) -> {
                p_220044_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
            });
        }

        return true;
    }

    /**
     * Check whether this Item can harvest the given Block
     */
    public boolean canHarvestBlock(BlockState blockIn) {
        return blockIn.getBlock() == Blocks.COBWEB;
    }

    /**
     * Gets a map of item attribute modifiers, used by ItemSword to increase hit damage.
     */
    public Multimap<String, AttributeModifier> getAttributeModifiers(EquipmentSlotType equipmentSlot) {
        Multimap<String, AttributeModifier> multimap = super.getAttributeModifiers(equipmentSlot);
        if (equipmentSlot == EquipmentSlotType.MAINHAND) {
            multimap.put(SharedMonsterAttributes.ATTACK_DAMAGE.getName(), new AttributeModifier(ATTACK_DAMAGE_MODIFIER, "Weapon modifier", this.attackDamage, AttributeModifier.Operation.ADDITION));
            multimap.put(SharedMonsterAttributes.ATTACK_SPEED.getName(), new AttributeModifier(ATTACK_SPEED_MODIFIER, "Weapon modifier", this.attackSpeed, AttributeModifier.Operation.ADDITION));
        }

        return multimap;
    }
    public static boolean canSetFire(BlockState existingState, IWorld worldIn, BlockPos posIn) {
        BlockState blockstate = ((FireBlock)Blocks.FIRE).getStateForPlacement(worldIn, posIn);
        boolean flag = false;

        for(Direction direction : Direction.Plane.HORIZONTAL) {
            BlockPos framePos = posIn.offset(direction);
            if (worldIn.getBlockState(framePos).isPortalFrame(worldIn, framePos) && ((NetherPortalBlock)Blocks.NETHER_PORTAL).isPortal(worldIn, posIn) != null) {
                flag = true;
            }
        }

        return existingState.isAir() && (blockstate.isValidPosition(worldIn, posIn) || flag);
    }

    public static boolean isUnlitCampfire(BlockState state) {
        return state.getBlock() == Blocks.CAMPFIRE && !state.get(BlockStateProperties.WATERLOGGED) && !state.get(BlockStateProperties.LIT);
    }
}

