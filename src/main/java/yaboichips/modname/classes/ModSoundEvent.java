
//package yaboichips.modname.classes;
//
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.audio.TickableSound;
//import net.minecraft.util.SoundCategory;
//import net.minecraft.util.SoundEvent;
//import net.minecraft.util.SoundEvents;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//import net.minecraftforge.event.TickEvent;
//import net.minecraftforge.eventbus.api.Event;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import org.apache.http.concurrent.Cancellable;
//import yaboichips.modname.lists.ItemList;
//import yaboichips.modname.lists.SoundList;
//
//public class ModSoundEvent {
//
//    @SubscribeEvent
//
//    public void soundEvent(TickEvent.PlayerTickEvent event) {
//        {
//            if (event.player.getHeldItemMainhand().getItem() == ItemList.blue_lightsaber) {
//                event.player.playSound(SoundList.BUZZ, 0.1f, 1.0f);
//            }
//        }
//        {
//            if (event.player.getHeldItemMainhand().getItem() == ItemList.red_lightsaber) {
//                event.player.playSound(SoundList.BUZZ, 0.1f, 1.0f);
//            }
//        }
//        {
//            if (event.player.getHeldItemMainhand().getItem() == ItemList.green_lightsaber) {
//                event.player.playSound(SoundList.BUZZ, 0.1f, 1.0f);
//            }
//        }
//        {
//            if (event.player.getHeldItemMainhand().getItem() == ItemList.purple_lightsaber) {
//                event.player.playSound(SoundList.BUZZ, 0.1f, 1.0f);
//            }
//        }
//    }
//}
