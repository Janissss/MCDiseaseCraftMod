package janis.moreores;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import lists.Itemlist;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod ("moreores")

public class moreores
{
	public static moreores instance;
	public static final String MODID = "moreores";
	
	private static final Logger LOGGER = (Logger) LogManager.getLogger(MODID);
	
	
	public moreores()
	{
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		MinecraftForge.EVENT_BUS.register(this);
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegisteries);
		
		
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
		
		LOGGER.info("setup funktioniert!");
	}
	private void clientRegisteries(final FMLCommonSetupEvent event)
	{
		LOGGER.info("ClientRegisteries funktioniert!");
	}
	
		@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
		public static class RegsitryEvent
		{
			@SubscribeEvent
			public static void registerItems(final RegistryEvent.Register<Item> event)
			{
				event.getRegistry().registerAll
				(
					Itemlist.titan_item = new Item(new Item.Properties().group(ItemGroup.COMBAT)).setRegistryName(location("titan_item")))
					;
				};
			}
		private static ResourceLocation location(String name)
		{
			return new ResourceLocation(MODID,name);
	
		}
		}

