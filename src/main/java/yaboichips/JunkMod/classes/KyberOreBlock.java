package yaboichips.JunkMod.classes;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import yaboichips.JunkMod.lists.BlockList;

import java.util.Random;

public class KyberOreBlock extends Block {
    public KyberOreBlock(Block.Properties properties) {
        super(properties);
    }

    protected int getExperience(Random rand) {
        if (this == BlockList.green_kyber_ore) {
            return MathHelper.nextInt(rand, 3, 7);
        } else if (this == BlockList.blue_kyber_ore) {
            return MathHelper.nextInt(rand, 3, 7);
        } else if (this == BlockList.purple_kyber_ore) {
            return MathHelper.nextInt(rand, 3, 7);
        }
        return 0;
    }


    /**
     * Perform side-effects from block dropping, such as creating silverfish
     */
    public void spawnAdditionalDrops(BlockState state, World worldIn, BlockPos pos, ItemStack stack) {
        super.spawnAdditionalDrops(state, worldIn, pos, stack);
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.getExperience(RANDOM) : 0;
    }
}