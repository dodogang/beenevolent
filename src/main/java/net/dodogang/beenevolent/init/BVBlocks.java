package net.dodogang.beenevolent.init;

import net.dodogang.beenevolent.Beenevolent;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.SignBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BVBlocks {
    public static final Block DRIED_CLAY = register("dried_clay", new Block(AbstractBlock.Settings.of(Material.STONE, MaterialColor.RED_TERRACOTTA).requiresTool().strength(1.25F, 4.2F)));

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
