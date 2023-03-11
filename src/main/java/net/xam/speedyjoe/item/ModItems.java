package net.xam.speedyjoe.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xam.speedyjoe.SpeedyJoe;

public class ModItems {
    public static final Item SPEEDY_INGOT = registerItem("speedy_ingot", new Item(new FabricItemSettings()));

    public static final Item RAW_SPEEDY = registerItem("raw_speedy", new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SpeedyJoe.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemsGroup(ItemGroups.INGREDIENTS, SPEEDY_INGOT);

        addToItemsGroup(ItemGroups.INGREDIENTS, RAW_SPEEDY);

    }

    private static void addToItemsGroup (ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }


    public static void registerModItems() {
        SpeedyJoe.LOGGER.info("Registering Mod items for" + SpeedyJoe.MOD_ID);

        addItemsToItemGroup();
    }


}