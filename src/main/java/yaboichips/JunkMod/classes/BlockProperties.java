package yaboichips.JunkMod.classes;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

import static net.minecraft.block.material.Material.*;

public class BlockProperties {
    public static Object NeonBlock;

    public static class ConcreteStairs extends StairsBlock {
        public ConcreteStairs(String registryName) {
            super(Blocks.WHITE_CONCRETE.getDefaultState(), Block.Properties.from(Blocks.WHITE_CONCRETE)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(2.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class WoodenStairs extends StairsBlock {
        public WoodenStairs(String registryName) {
            super(Blocks.OAK_PLANKS.getDefaultState(), Block.Properties.from(Blocks.OAK_PLANKS)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class NeonBlock extends NeonBlocks {
        public NeonBlock(String registryName) {
            super(Block.Properties.create(Material.GLASS)
                    .sound(SoundType.GLASS)
                    .hardnessAndResistance(0.3F)
                    .lightValue(15)
            );
            setRegistryName(registryName);
        }
    }

    public static class TransparentBlock extends GlassBlock {
        public TransparentBlock(String regisrtyName) {
            super(Block.Properties.create(Material.GLASS)
                    .sound(SoundType.GLASS)
                    .hardnessAndResistance(0.3f)
                    .notSolid()
            );
            setRegistryName(regisrtyName);
        }
    }

    public static class TransparentBlocks extends TintedGlassBlock {
        public TransparentBlocks(String regisrtyName) {
            super(Block.Properties.create(Material.GLASS)
                    .sound(SoundType.GLASS)
                    .hardnessAndResistance(0.3f)
                    .notSolid()
            );
            setRegistryName(regisrtyName);
        }
    }

    public static class MetalBlocks extends MetalBlock {
        public MetalBlocks(String registryName) {
            super(Block.Properties.create(IRON)
                    .hardnessAndResistance(6.0f, 1.5f)
                    .sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE)
            );
            setRegistryName(registryName);
        }
    }


    public static class Lattice extends LeavesBlock {
        public Lattice(String registryName) {
            super(Block.Properties.create(BAMBOO)
                    .hardnessAndResistance(0.2f, 0.2f)
                    .sound(SoundType.SCAFFOLDING)
                    .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class ConcreteSlabBlocks extends Slab {
        public ConcreteSlabBlocks(String registryName) {
            super(Block.Properties.create(ROCK)
                    .hardnessAndResistance(1.0f, 0.2f)
                    .sound(SoundType.STONE)
                    .harvestTool(ToolType.PICKAXE)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class Doors extends Door {
        public Doors(String registryName) {
            super(Block.Properties.create(Material.BAMBOO)
                    .sound(SoundType.BAMBOO)
                    .hardnessAndResistance(0.1f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class Logs extends LogBlock {
        public Logs(String registryName) {
            super(MaterialColor.BROWN, Block.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(3.0f)
                    .harvestTool(ToolType.AXE)
            );
            setRegistryName(registryName);
        }
    }

    public static class SlabBlocks extends Slab {
        public SlabBlocks(String registryName) {
            super(Block.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(3.0f)
                    .harvestTool(ToolType.AXE)
                    .notSolid()
            );

            setRegistryName(registryName);
        }
    }


    public static class LeavesBlocks extends Leaves {
        public LeavesBlocks(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.1f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class RubberBlocks extends RubberBlock {
        public RubberBlocks(String registryName) {
            super(Block.Properties.create(CACTUS)
                    .sound(SoundType.SLIME)
                    .hardnessAndResistance(0.8f)
            );
            setRegistryName(registryName);
        }
    }

    public static class Grenade extends HolyHandGrenade {
        public Grenade(String registryName) {
            super(Block.Properties.create(TNT)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.2f)
            );
            setRegistryName(registryName);
        }
    }

    public static class KyberOre extends KyberOreBlock {
        public KyberOre(String registryName) {
            super(Block.Properties.create(ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(3.2f)
            );
            setRegistryName(registryName);
        }
    }

    public static class DrumStickCake extends ModdedCakeBlock {
        public DrumStickCake(String registryName) {
            super(Block.Properties.create(CAKE)
                    .hardnessAndResistance(1.0f, 1.5f)
                    .sound(SoundType.CLOTH)
            );
            setRegistryName(registryName);
        }
    }
}