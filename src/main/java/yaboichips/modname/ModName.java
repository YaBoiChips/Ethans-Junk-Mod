package yaboichips.modname;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import yaboichips.modname.classes.ModEntityTypes;
import yaboichips.modname.classes.SaberBuzzEvent;
import yaboichips.modname.client.entity.render.MooseRender;
import yaboichips.modname.lists.BlockList;
import yaboichips.modname.texture.renders.CutOutRenders;
import yaboichips.modname.world.feature.trees.treegenerator.TreeGenerator;
import yaboichips.modname.world.oregenerator.OreGenerator;

@Mod("modname")
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModName {
    public static final String MODID = "modname";
    public static Logger LOGGER = LogManager.getLogger();

    public ModName() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(cutoutRenders::renderCutOuts);
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);
//        MinecraftForge.EVENT_BUS.register(new ModSoundEvent());

    }

    public static void register() {
        LOGGER.info("JunkMod: register");
        Minecraft minecraftClient = Minecraft.getInstance();
    }

    private void commonSetup(FMLCommonSetupEvent e) {
        LOGGER.debug("E&B Modded Junk: Common Setup event starting...");
        OreGenerator.addFeatures();
        TreeGenerator.addFeatures();
        LOGGER.info("E&B Modded Junk: Common Setup event finished.");
    }

    private void clientSetup(FMLClientSetupEvent e) {
        LOGGER.debug("E&B Modded Junk: Client Setup event starting...");
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MOOSE_ENTITY, MooseRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.PEBBLE, new IRenderFactory<Entity>()
        {
            @Override
            public EntityRenderer<? super Entity> createRenderFor(EntityRendererManager manager)
            {
                return new SpriteRenderer(manager, Minecraft.getInstance().getItemRenderer());
            }
        });
        LOGGER.info("E&B Modded Junk: Client Setup event finished.");
    }


    public static final CutOutRenders cutoutRenders = new CutOutRenders();
    public static final ItemGroup JUNKTAB = new ItemGroup("junkTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockList.flannel.getBlock());
        }
    };
}