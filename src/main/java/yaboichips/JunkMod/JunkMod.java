package yaboichips.JunkMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.SpriteRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import yaboichips.JunkMod.classes.ModEntityTypes;
import yaboichips.JunkMod.classes.ModEvents;
import yaboichips.JunkMod.classes.MooseEntityEvents;
import yaboichips.JunkMod.client.entity.render.MooseRender;
import yaboichips.JunkMod.lists.BlockList;
import yaboichips.JunkMod.lists.ItemList;
import yaboichips.JunkMod.texture.renders.CutOutRenders;
import yaboichips.JunkMod.world.feature.trees.treegenerator.TreeGenerator;
import yaboichips.JunkMod.world.oregenerator.OreGenerator;

@Mod("junkmod")
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class JunkMod {
    public static final String JUNKMOD = "junkmod";
    public static Logger LOGGER = LogManager.getLogger();

    public JunkMod() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(cutoutRenders::renderCutOuts);
        ModEntityTypes.ENTITY_TYPES.register(modEventBus);
    }

    public static void register() {
        LOGGER.info("JunkMod: register");
        Minecraft minecraftClient = Minecraft.getInstance();
    }

    private void commonSetup(FMLCommonSetupEvent e) {
        LOGGER.debug("Ethan's Junk Mod: Common Setup event starting...");
        OreGenerator.addFeatures();
        TreeGenerator.addFeatures();
        MooseEntityEvents.registerEntityWorldSpawns();
        LOGGER.info("Ethan's Junk Mod: Common Setup event finished.");
    }

    private void clientSetup(FMLClientSetupEvent e) {
        LOGGER.debug("Ethan's Junk Mod: Client Setup event starting...");
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MOOSE_ENTITY, MooseRender::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.PEBBLE, new IRenderFactory<Entity>()

        {
            @Override
            public EntityRenderer<? super Entity> createRenderFor(EntityRendererManager manager)
            {
                return new SpriteRenderer(manager, Minecraft.getInstance().getItemRenderer());
            }
        });
        LOGGER.info("Ethan's Junk Mod: Client Setup event finished.");
    }


    public static final CutOutRenders cutoutRenders = new CutOutRenders();
    public static final ItemGroup JUNKTAB = new ItemGroup("junkTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(BlockList.flannel.getBlock());
        }
    };
}