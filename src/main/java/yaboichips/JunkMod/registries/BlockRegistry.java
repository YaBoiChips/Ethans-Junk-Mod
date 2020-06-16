package yaboichips.JunkMod.registries;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import yaboichips.JunkMod.JunkMod;
import yaboichips.JunkMod.classes.BlockProperties;
import yaboichips.JunkMod.classes.Saplings;
import yaboichips.JunkMod.lists.BlockList;
import yaboichips.JunkMod.world.feature.trees.hardwood.HardwoodTree;

import static net.minecraft.block.Block.Properties.create;
import static net.minecraft.block.material.Material.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockRegistry {
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(

                BlockList.marble = new Block(create(ROCK).hardnessAndResistance(6.0f, 1.5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("marble"),
                BlockList.white_concrete_stair = new BlockProperties.ConcreteStairs("white_concrete_stair"),
                BlockList.black_concrete_stair = new BlockProperties.ConcreteStairs("black_concrete_stair"),
                BlockList.orange_concrete_stair = new BlockProperties.ConcreteStairs("orange_concrete_stair"),
                BlockList.blue_concrete_stair = new BlockProperties.ConcreteStairs("blue_concrete_stair"),
                BlockList.light_blue_concrete_stair = new BlockProperties.ConcreteStairs("light_blue_concrete_stair"),
                BlockList.lime_concrete_stair = new BlockProperties.ConcreteStairs("lime_concrete_stair"),
                BlockList.red_concrete_stair = new BlockProperties.ConcreteStairs("red_concrete_stair"),
                BlockList.green_concrete_stair = new BlockProperties.ConcreteStairs("green_concrete_stair"),
                BlockList.yellow_concrete_stair = new BlockProperties.ConcreteStairs("yellow_concrete_stair"),
                BlockList.gray_concrete_stair = new BlockProperties.ConcreteStairs("gray_concrete_stair"),
                BlockList.pink_concrete_stair = new BlockProperties.ConcreteStairs("pink_concrete_stair"),
                BlockList.light_gray_concrete_stair = new BlockProperties.ConcreteStairs("light_gray_concrete_stair"),
                BlockList.purple_concrete_stair = new BlockProperties.ConcreteStairs("purple_concrete_stair"),
                BlockList.brown_concrete_stair = new BlockProperties.ConcreteStairs("brown_concrete_stair"),
                BlockList.magenta_concrete_stair = new BlockProperties.ConcreteStairs("magenta_concrete_stair"),
                BlockList.cyan_concrete_stair = new BlockProperties.ConcreteStairs("cyan_concrete_stair"),
                BlockList.perfectly_clear_glass = new BlockProperties.TransparentBlock("perfectly_clear_glass"),
                BlockList.white_neon_block = new BlockProperties.NeonBlock("white_neon_block"),
                BlockList.red_neon_block = new BlockProperties.NeonBlock("red_neon_block"),
                BlockList.blue_neon_block = new BlockProperties.NeonBlock("blue_neon_block"),
                BlockList.green_neon_block = new BlockProperties.NeonBlock("green_neon_block"),
                BlockList.funny_neon_block = new BlockProperties.NeonBlock("funny_neon_block"),
                BlockList.pink_neon_block = new BlockProperties.NeonBlock("pink_neon_block"),
                BlockList.purple_neon_block = new BlockProperties.NeonBlock("purple_neon_block"),
                BlockList.light_blue_neon_block = new BlockProperties.NeonBlock("light_blue_neon_block"),
                BlockList.yellow_neon_block = new BlockProperties.NeonBlock("yellow_neon_block"),
                BlockList.asphalt = new Block(create(ROCK).hardnessAndResistance(6.0f, 1.5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("asphalt"),
                BlockList.steel_block = new BlockProperties.MetalBlocks("steel_block"),
                BlockList.lattice = new BlockProperties.Lattice("lattice"),
                BlockList.blue_tinted_glass = new BlockProperties.TransparentBlocks("blue_tinted_glass"),
                BlockList.green_tinted_glass = new BlockProperties.TransparentBlocks("green_tinted_glass"),
                BlockList.red_tinted_glass = new BlockProperties.TransparentBlocks("red_tinted_glass"),
                BlockList.yellow_tinted_glass = new BlockProperties.TransparentBlocks("yellow_tinted_glass"),
                BlockList.tinted_glass_block = new BlockProperties.TransparentBlocks("tinted_glass_block"),
                BlockList.flannel = new Block(create(WOOL).hardnessAndResistance(1.5f, 1.5f).sound(SoundType.CLOTH).harvestTool(ToolType.AXE)).setRegistryName("flannel"),
                BlockList.white_concrete_slab = new BlockProperties.ConcreteSlabBlocks("white_concrete_slabs"),
                BlockList.hardwood_planks = new Block(create(WOOD).hardnessAndResistance(3.0f, 1.5f).sound(SoundType.WOOD).harvestTool(ToolType.AXE)).setRegistryName("hardwood_planks"),
                BlockList.hardwood_slab = new BlockProperties.SlabBlocks("hardwood_slab"),
                BlockList.holy_hand_grenade = new BlockProperties.Grenade("holy_hand_grenade"),
                BlockList.hardwood_log = new BlockProperties.Logs("hardwood_log"),
                BlockList.shoji_door = new BlockProperties.Doors("shoji_door"),
                BlockList.rubber_block = new BlockProperties.RubberBlocks("rubber_block"),
                BlockList.cherry_leaves = new BlockProperties.LeavesBlocks("cherry_leaves"),
                BlockList.shoji = new Block(create(WOOD).hardnessAndResistance(3.0f, 1.5f).notSolid().sound(SoundType.WOOD).harvestTool(ToolType.AXE)).setRegistryName("shoji"),
                BlockList.cinder_bricks = new Block(create(ROCK).hardnessAndResistance(6.0f, 1.5f).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)).setRegistryName("cinder_bricks"),
                BlockList.hardwood_stairs = new BlockProperties.WoodenStairs("hardwood_stairs"),
                BlockList.green_kyber_ore = new BlockProperties.KyberOre("green_kyber_ore"),
                BlockList.blue_kyber_ore = new BlockProperties.KyberOre("blue_kyber_ore"),
                BlockList.purple_kyber_ore = new BlockProperties.KyberOre("purple_kyber_ore"),
                BlockList.marthas_drumstick_cake = new BlockProperties.DrumStickCake("marthas_drumstick_cake"),
                BlockList.hardwood_sapling = new Saplings((() -> new HardwoodTree()), Block.Properties.from(Blocks.OAK_SAPLING)).setRegistryName("hardwood_sapling"),
                BlockList.orange_neon_block = new BlockProperties.NeonBlock("orange_neon_block"));

        JunkMod.LOGGER.info("Blocks registered");
    }
}