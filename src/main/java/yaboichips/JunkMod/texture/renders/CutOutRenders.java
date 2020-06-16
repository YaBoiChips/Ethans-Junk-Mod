package yaboichips.JunkMod.texture.renders;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import yaboichips.JunkMod.lists.BlockList;

public class CutOutRenders {
    public void renderCutOuts(FMLClientSetupEvent e) {
        RenderTypeLookup.setRenderLayer(BlockList.perfectly_clear_glass.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockList.tinted_glass_block.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockList.blue_tinted_glass.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockList.green_tinted_glass.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockList.red_tinted_glass.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockList.yellow_tinted_glass.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BlockList.hardwood_sapling.getBlock(), RenderType.getCutoutMipped());
    }
}

//RenderType.getTranslucent()