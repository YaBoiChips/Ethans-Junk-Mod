package yaboichips.JunkMod.classes;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import yaboichips.JunkMod.JunkMod;
import yaboichips.JunkMod.lists.ItemList;
import yaboichips.JunkMod.registries.ItemRegistry;

@Mod.EventBusSubscriber(modid = JunkMod.JUNKMOD, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {

    @SubscribeEvent
    public static void playerHarvestEvent(BlockEvent.HarvestDropsEvent event) {
        if (event.getHarvester() != null) {
            if (event.getState() == Blocks.OAK_LOG.getDefaultState()) {
                event.setDropChance(100);
                event.getDrops().add(new ItemStack(ItemList.yellow_concrete_stair.getItem(), 1));
            }

        }
    }
}
