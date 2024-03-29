package author.example.item;

import author.example.Example;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

/**
 * Utility class for handling items in the Example mod. This class handles the instantiation of all items, all of which can be
 * retrieved as fields of this class, as well as registering all the items via the {@link #register(IEventBus)} method which
 * should be called in the {@link Example main} class's constructor with the given {@link IEventBus} from NeoForge.
 */
public class ExampleItems {

    /** The registry of all items in the Example mod. */
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Example.MODID);

	/**
	 * An example item in the mod. 
	 */
	public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.register("example_item", () -> new Item(new Item.Properties()));

    /** The registry of all creative tabs in the Example mod. */
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Example.MODID);

    /** The one and only creative tab for all items and blocks in the Example mod. */
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register(Example.MODID, () -> CreativeModeTab.builder()
        .title(Component.translatable("itemGroup." + Example.MODID))
        .icon(EXAMPLE_ITEM.get()::getDefaultInstance)
        .displayItems((parameters, output) -> {
            for (var item : ExampleItems.ITEMS.getEntries()) {
                output.accept(item.get().getDefaultInstance());
            }
        })
        .build());

    /**
     * Registers the item register with the given event bus, as well as the creative tab register.
     *
     * @param eventBus the event bus to register the items and creative tabs on
     */
    public static void register(IEventBus eventBus) {
        ExampleItems.ITEMS.register(eventBus);
        ExampleItems.CREATIVE_MODE_TABS.register(eventBus);
    }
}
