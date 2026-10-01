package de.leander.customgoditems.item;

import de.leander.customgoditems.CustomGodItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item GOTT_SCHWERT = registerItem("gott_schwert", new Item(new Item.Settings()));
    public static final Item GOTT_SPIZHACKE = registerItem("gott_spizhacke", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(CustomGodItems.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CustomGodItems.LOGGER.info("Registering Mod Items for" + CustomGodItems.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(GOTT_SCHWERT);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(GOTT_SPIZHACKE);
        });

    }};

