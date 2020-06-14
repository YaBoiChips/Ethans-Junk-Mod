package yaboichips.modname.registries;

import net.minecraft.entity.EntityType;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import yaboichips.modname.ModName;
import yaboichips.modname.classes.LightsaberHandleClass;
import yaboichips.modname.classes.ModEntityTypes;
import yaboichips.modname.classes.PebbleItem;
import yaboichips.modname.entities.MooseEntity;
import yaboichips.modname.lists.BlockList;
import yaboichips.modname.lists.ItemList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ItemRegistry {
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(

                ItemList.marble = new BlockItem(BlockList.marble, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.marble.getRegistryName()),
                ItemList.white_concrete_stair = new BlockItem(BlockList.white_concrete_stair, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.white_concrete_stair.getRegistryName()),
                ItemList.black_concrete_stair = new BlockItem(BlockList.black_concrete_stair, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.black_concrete_stair.getRegistryName()),
                ItemList.cyan_concrete_stair = new BlockItem(BlockList.cyan_concrete_stair, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.cyan_concrete_stair.getRegistryName()),
                ItemList.orange_concrete_stair = new BlockItem(BlockList.orange_concrete_stair, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.orange_concrete_stair.getRegistryName()),
                ItemList.perfectly_clear_glass = new BlockItem(BlockList.perfectly_clear_glass, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.perfectly_clear_glass.getRegistryName()),
                ItemList.white_neon_block = new BlockItem(BlockList.white_neon_block, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.white_neon_block.getRegistryName()),
                ItemList.red_neon_block = new BlockItem(BlockList.red_neon_block, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.red_neon_block.getRegistryName()),
                ItemList.blue_neon_block = new BlockItem(BlockList.blue_neon_block, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.blue_neon_block.getRegistryName()),
                ItemList.green_neon_block = new BlockItem(BlockList.green_neon_block, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.green_neon_block.getRegistryName()),
                ItemList.funny_neon_block = new BlockItem(BlockList.funny_neon_block, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.funny_neon_block.getRegistryName()),
                ItemList.pink_neon_block = new BlockItem(BlockList.pink_neon_block, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.pink_neon_block.getRegistryName()),
                ItemList.purple_neon_block = new BlockItem(BlockList.purple_neon_block, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.purple_neon_block.getRegistryName()),
                ItemList.light_blue_neon_block = new BlockItem(BlockList.light_blue_neon_block, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.light_blue_neon_block.getRegistryName()),
                ItemList.orange_neon_block = new BlockItem(BlockList.orange_neon_block, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.orange_neon_block.getRegistryName()),
                ItemList.yellow_neon_block = new BlockItem(BlockList.yellow_neon_block, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.yellow_neon_block.getRegistryName()),
                ItemList.asphalt = new BlockItem(BlockList.asphalt, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.asphalt.getRegistryName()),
                ItemList.lattice = new BlockItem(BlockList.lattice, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.lattice.getRegistryName()),
                ItemList.shoji = new BlockItem(BlockList.shoji, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.shoji.getRegistryName()),
                ItemList.shoji_door = new BlockItem(BlockList.shoji_door, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.shoji_door.getRegistryName()),
                ItemList.rubber_block = new BlockItem(BlockList.rubber_block, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.rubber_block.getRegistryName()),
                ItemList.holy_hand_grenade = new BlockItem(BlockList.holy_hand_grenade, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.holy_hand_grenade.getRegistryName()),
                ItemList.hardwood_planks = new BlockItem(BlockList.hardwood_planks, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.hardwood_planks.getRegistryName()),
                ItemList.cherry_leaves = new BlockItem(BlockList.cherry_leaves, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.cherry_leaves.getRegistryName()),
                ItemList.hardwood_slab = new BlockItem(BlockList.hardwood_slab, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.hardwood_slab.getRegistryName()),
                ItemList.hardwood_log = new BlockItem(BlockList.hardwood_log, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.hardwood_log.getRegistryName()),
                ItemList.hardwood_stairs = new BlockItem(BlockList.hardwood_stairs, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.hardwood_stairs.getRegistryName()),
                ItemList.cinder_bricks = new BlockItem(BlockList.cinder_bricks, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.cinder_bricks.getRegistryName()),
                ItemList.red_tinted_glass = new BlockItem(BlockList.blue_tinted_glass, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.blue_tinted_glass.getRegistryName()),
                ItemList.blue_tinted_glass = new BlockItem(BlockList.red_tinted_glass, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.red_tinted_glass.getRegistryName()),
                ItemList.green_tinted_glass = new BlockItem(BlockList.green_tinted_glass, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.green_tinted_glass.getRegistryName()),
                ItemList.green_kyber_ore = new BlockItem(BlockList.green_kyber_ore, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.green_kyber_ore.getRegistryName()),
                ItemList.blue_kyber_ore = new BlockItem(BlockList.blue_kyber_ore, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.blue_kyber_ore.getRegistryName()),
                ItemList.purple_kyber_ore = new BlockItem(BlockList.purple_kyber_ore, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.purple_kyber_ore.getRegistryName()),
                ItemList.tinted_glass_block = new BlockItem(BlockList.tinted_glass_block, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.tinted_glass_block.getRegistryName()),
                ItemList.yellow_tinted_glass = new BlockItem(BlockList.yellow_tinted_glass, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.yellow_tinted_glass.getRegistryName()),
                ItemList.steel_block = new BlockItem(BlockList.steel_block, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.steel_block.getRegistryName()),
                ItemList.marthas_drumstick_cake = new BlockItem(BlockList.marthas_drumstick_cake, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.marthas_drumstick_cake.getRegistryName()),
                ItemList.white_concrete_slab = new BlockItem(BlockList.white_concrete_slab, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.white_concrete_slab.getRegistryName()),
                ItemList.hardwood_sapling = new BlockItem(BlockList.hardwood_sapling, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.hardwood_sapling.getRegistryName()),
                ItemList.steel_ingot = new Item(new Item.Properties().group(ModName.JUNKTAB)).setRegistryName("steel_ingot"),
                ItemList.blue_kyber_crystal = new Item(new Item.Properties().group(ModName.JUNKTAB)).setRegistryName("blue_kyber_crystal"),
                ItemList.green_kyber_crystal = new Item(new Item.Properties().group(ModName.JUNKTAB)).setRegistryName("green_kyber_crystal"),
                ItemList.purple_kyber_crystal = new Item(new Item.Properties().group(ModName.JUNKTAB)).setRegistryName("purple_kyber_crystal"),
                ItemList.red_kyber_crystal = new Item(new Item.Properties().group(ModName.JUNKTAB)).setRegistryName("red_kyber_crystal"),
                ItemList.blue_kyber_crystal_shard = new Item(new Item.Properties().group(ModName.JUNKTAB)).setRegistryName("blue_kyber_crystal_shard"),
                ItemList.green_kyber_crystal_shard = new Item(new Item.Properties().group(ModName.JUNKTAB)).setRegistryName("green_kyber_crystal_shard"),
                ItemList.purple_kyber_crystal_shard = new Item(new Item.Properties().group(ModName.JUNKTAB)).setRegistryName("purple_kyber_crystal_shard"),
                ItemList.emitter = new Item(new Item.Properties().group(ModName.JUNKTAB)).setRegistryName("emitter"),
                ItemList.handle = new Item(new Item.Properties().group(ModName.JUNKTAB)).setRegistryName("handle"),
                ItemList.pommel = new Item(new Item.Properties().group(ModName.JUNKTAB)).setRegistryName("pommel"),
                ItemList.hilt = new Item(new Item.Properties().group(ModName.JUNKTAB)).setRegistryName("hilt"),
                ItemList.pebble = new PebbleItem(new Item.Properties().group(ModName.JUNKTAB)).setRegistryName("pebble"),
                ItemList.blue_lightsaber_handle = new LightsaberHandleClass(new Item.Properties().group(ModName.JUNKTAB)).setRegistryName("blue_lightsaber_handle"),
                ItemList.green_lightsaber_handle = new LightsaberHandleClass(new Item.Properties().group(ModName.JUNKTAB)).setRegistryName("green_lightsaber_handle"),
                ItemList.red_lightsaber_handle = new LightsaberHandleClass(new Item.Properties().group(ModName.JUNKTAB)).setRegistryName("red_lightsaber_handle"),
                ItemList.purple_lightsaber_handle = new LightsaberHandleClass(new Item.Properties().group(ModName.JUNKTAB)).setRegistryName("purple_lightsaber_handle"),
                ItemList.moose_spawn_egg = new SpawnEggItem(ModEntityTypes.MOOSE_ENTITY, 1769984, 4400155, (new Item.Properties()).group(ModName.JUNKTAB)).setRegistryName("moose_spawn_egg"),
                ItemList.flannel = new BlockItem(BlockList.flannel, new Item.Properties().group(ModName.JUNKTAB)).setRegistryName(BlockList.flannel.getRegistryName()));
    }
}