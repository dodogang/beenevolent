package net.dodogang.beenevolent.init;

import net.dodogang.beenevolent.Beenevolent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BVItems {
    public BVItems() {}

    public static Item register(String id, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Beenevolent.MOD_ID, id), item);
    }
}
