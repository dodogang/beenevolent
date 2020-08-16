package net.dodogang.beenevolent.init;

import net.dodogang.beenevolent.Beenevolent;
import net.dodogang.beenevolent.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.SignBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BVBlocks {
    public static final HoneyedTerracottaBlocks HONEYED_TERRACOTTA = new HoneyedTerracottaBlocks();
    public static final ExtendedHiveBlocks EXTENDED_HIVES = new ExtendedHiveBlocks();

    public BVBlocks() {}

    public static Block register(String id, Block block, boolean registerItem) {
        Identifier identifier = new Identifier(Beenevolent.MOD_ID, id);
        Block registeredBlock = Registry.register(Registry.BLOCK, identifier, block);

        if (registerItem) {
            int maxCount = 64;
            if (block instanceof SignBlock)
                maxCount = 16;

            BVItems.register(id, new BlockItem(registeredBlock, new Item.Settings().maxCount(maxCount).group(Beenevolent.ITEM_GROUP)));
        }

        return registeredBlock;
    }
    public static Block register(String id, Block block) {
        return register(id, block, true);
    }
}
