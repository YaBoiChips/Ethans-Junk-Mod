package yaboichips.JunkMod.classes;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;
import yaboichips.JunkMod.JunkMod;
import yaboichips.JunkMod.lists.ItemList;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = JunkMod.JUNKMOD, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(JunkMod.JUNKMOD)
public class ItemClass {
    public static final Item flannel_helmet = null;
    public static final Item flannel_chestplate = null;
    public static final Item flannel_leggings = null;
    public static final Item flannel_boots = null;

    public static final Item blue_lightsaber = null;
    public static final Item green_lightsaber = null;
    public static final Item red_lightsaber = null;
    public static final Item purple_lightsaber = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(

                (new ArmorItem(Flannel.TEST, EquipmentSlotType.HEAD, new Item.Properties().group(JunkMod.JUNKTAB)).setRegistryName("flannel_helmet")),
                (new ArmorItem(Flannel.TEST, EquipmentSlotType.CHEST, new Item.Properties().group(JunkMod.JUNKTAB)).setRegistryName("flannel_chestplate")),
                (new ArmorItem(Flannel.TEST, EquipmentSlotType.LEGS, new Item.Properties().group(JunkMod.JUNKTAB)).setRegistryName("flannel_leggings")),
                (new ArmorItem(Flannel.TEST, EquipmentSlotType.FEET, new Item.Properties().group(JunkMod.JUNKTAB)).setRegistryName("flannel_boots")),

                ItemList.blue_lightsaber = (new LightsaberItem(ModItemTier.SABER_TIER, 9, -2.4f, new Item.Properties().group(JunkMod.JUNKTAB)).setRegistryName("blue_lightsaber")),
                ItemList.green_lightsaber = (new LightsaberItem(ModItemTier.SABER_TIER, 9, -2.4f, new Item.Properties().group(JunkMod.JUNKTAB)).setRegistryName("green_lightsaber")),
                ItemList.purple_lightsaber = (new LightsaberItem(ModItemTier.SABER_TIER, 9, -2.4f, new Item.Properties().group(JunkMod.JUNKTAB)).setRegistryName("purple_lightsaber")),
                ItemList.red_lightsaber = (new LightsaberItem(ModItemTier.SABER_TIER, 10, -2.4f, new Item.Properties().group(JunkMod.JUNKTAB)).setRegistryName("red_lightsaber")));
    }

    public enum ModItemTier implements IItemTier {
        SABER_TIER(4, -1, 0.1f, 3.0f, 66, () -> {
            return Ingredient.fromItems(ItemList.steel_ingot);
        });

        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int harvestLevel;
        private final int enchantability;
        private final LazyValue<Ingredient> repairMaterial;

        ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.attackDamage = attackDamage;
            this.efficiency = efficiency;
            this.enchantability = enchantability;
            this.repairMaterial = new LazyValue<>(repairMaterial);
        }

        @Override
        public int getMaxUses() {
            return this.maxUses;
        }

        @Override
        public float getEfficiency() {
            return this.efficiency;
        }

        @Override
        public float getAttackDamage() {
            return this.attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return this.harvestLevel;
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }
    }

    public enum Flannel implements IArmorMaterial {
        TEST(JunkMod.JUNKMOD + ":flannel", 5, new int[]{1, 2, 3, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0f, () -> {
            return Ingredient.fromItems(ItemList.flannel);
        });


        public static final int[] MAX_DAMAGE_ARRAY = new int[]{16, 16, 16, 16};
        private final String name;
        private final int maxDamageFactor;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final float toughness;
        private final LazyValue<Ingredient> repairMaterial;

        Flannel(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountArrayIn, int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn, Supplier<Ingredient> repairMaterialIn) {
            this.name = nameIn;
            this.maxDamageFactor = maxDamageFactorIn;
            this.damageReductionAmountArray = damageReductionAmountArrayIn;
            this.enchantability = enchantabilityIn;
            this.soundEvent = soundEventIn;
            this.toughness = toughnessIn;
            this.repairMaterial = new LazyValue<>(repairMaterialIn);
        }

        Flannel(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, LazyValue<Ingredient> repairMaterial) {
            this.name = name;
            this.maxDamageFactor = maxDamageFactor;
            this.damageReductionAmountArray = damageReductionAmountArray;
            this.enchantability = enchantability;
            this.soundEvent = soundEvent;
            this.toughness = toughness;
            this.repairMaterial = repairMaterial;
        }

        @Override
        public int getDurability(EquipmentSlotType slotIn) {
            return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType slotIn) {
            return this.damageReductionAmountArray[slotIn.getIndex()];
        }

        @Override
        public int getEnchantability() {
            return this.enchantability;
        }

        @Override
        public SoundEvent getSoundEvent() {
            return this.soundEvent;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return this.repairMaterial.getValue();
        }

        @OnlyIn(Dist.CLIENT)
        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public float getToughness() {
            return this.toughness;
        }
    }

}