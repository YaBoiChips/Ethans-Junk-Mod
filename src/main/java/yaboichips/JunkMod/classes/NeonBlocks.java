package yaboichips.JunkMod.classes;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneTorchBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import javax.annotation.Nullable;
import java.util.Random;


public class NeonBlocks extends Block {
    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;

    public NeonBlocks(Block.Properties properties) {
        super(properties);
        this.setDefaultState(this.getDefaultState().with(LIT, Boolean.valueOf(false)));
    }

    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (worldIn.isRemote) {
            BlockState blockstate1 = state.cycle(LIT);
            if (blockstate1.get(LIT)) {
            }

            return ActionResultType.SUCCESS;
        } else {
            BlockState blockstate = this.func_226939_d_(state, worldIn, pos);
            float f = blockstate.get(LIT) ? 0.6F : 0.5F;
            worldIn.playSound(null, pos, SoundEvents.BLOCK_LEVER_CLICK, SoundCategory.BLOCKS, 0.3F, f);
            return ActionResultType.SUCCESS;
        }
    }

    public BlockState func_226939_d_(BlockState p_226939_1_, World p_226939_2_, BlockPos p_226939_3_) {
        p_226939_1_ = p_226939_1_.cycle(LIT);
        p_226939_2_.setBlockState(p_226939_3_, p_226939_1_, 3);
        return p_226939_1_;
    }

    public int getLightValue(BlockState state) {
        return state.get(LIT) ? super.getLightValue(state) : 0;
    }

    public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onBlockAdded(state, worldIn, pos, oldState, isMoving);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(LIT, Boolean.valueOf(context.getWorld().isBlockPowered(context.getPos())));
    }


    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        if (state.get(LIT) && !worldIn.isBlockPowered(pos)) {
            worldIn.setBlockState(pos, state.cycle(LIT), 2);
            boolean flag = state.get(LIT);
            if (!flag) {
                worldIn.setBlockState(pos, state.with(LIT, Boolean.valueOf(true)), 2);

            }
        }

    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(LIT);

    }

    public boolean canEntitySpawn(BlockState state, IBlockReader worldIn, BlockPos pos, EntityType<?> type) {
        return true;
    }
}