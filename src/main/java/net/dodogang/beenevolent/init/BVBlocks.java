package net.dodogang.beenevolent.init;

import net.dodogang.beenevolent.Beenevolent;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BVBlocks {
    public static final Block HONEYED_TERRACOTTA = Premade.honeyedTerracotta(null, MaterialColor.BROWN_TERRACOTTA);

    public static final Block WHITE_HONEYED_TERRACOTTA = Premade.honeyedTerracotta("white", MaterialColor.WHITE_TERRACOTTA);
    public static final Block ORANGE_HONEYED_TERRACOTTA = Premade.honeyedTerracotta("orange", MaterialColor.ORANGE_TERRACOTTA);
    public static final Block MAGENTA_HONEYED_TERRACOTTA = Premade.honeyedTerracotta("magenta", MaterialColor.MAGENTA_TERRACOTTA);
    public static final Block LIGHT_BLUE_HONEYED_TERRACOTTA = Premade.honeyedTerracotta("light_blue", MaterialColor.LIGHT_BLUE_TERRACOTTA);
    public static final Block YELLOW_HONEYED_TERRACOTTA = Premade.honeyedTerracotta("yellow", MaterialColor.YELLOW_TERRACOTTA);
    public static final Block LIME_HONEYED_TERRACOTTA = Premade.honeyedTerracotta("lime", MaterialColor.LIME_TERRACOTTA);
    public static final Block PINK_HONEYED_TERRACOTTA = Premade.honeyedTerracotta("pink", MaterialColor.PINK_TERRACOTTA);
    public static final Block GRAY_HONEYED_TERRACOTTA = Premade.honeyedTerracotta("gray", MaterialColor.GRAY_TERRACOTTA);
    public static final Block LIGHT_GRAY_HONEYED_TERRACOTTA = Premade.honeyedTerracotta("light_gray", MaterialColor.LIGHT_GRAY_TERRACOTTA);
    public static final Block CYAN_HONEYED_TERRACOTTA = Premade.honeyedTerracotta("cyan", MaterialColor.CYAN_TERRACOTTA);
    public static final Block PURPLE_HONEYED_TERRACOTTA = Premade.honeyedTerracotta("purple", MaterialColor.PURPLE_TERRACOTTA);
    public static final Block BLUE_HONEYED_TERRACOTTA = Premade.honeyedTerracotta("blue", MaterialColor.BLUE_TERRACOTTA);
    public static final Block BROWN_HONEYED_TERRACOTTA = Premade.honeyedTerracotta("brown", MaterialColor.BROWN_TERRACOTTA);
    public static final Block GREEN_HONEYED_TERRACOTTA = Premade.honeyedTerracotta("green", MaterialColor.GREEN_TERRACOTTA);
    public static final Block RED_HONEYED_TERRACOTTA = Premade.honeyedTerracotta("red", MaterialColor.RED_TERRACOTTA);
    public static final Block BLACK_HONEYED_TERRACOTTA = Premade.honeyedTerracotta("black", MaterialColor.BLACK_TERRACOTTA);

    public BVBlocks() {}

    public static Block register(String id, Block block, boolean registerItem) {
        Identifier identifier = new Identifier(Beenevolent.MOD_ID, id);
        Block registeredBlock = Registry.register(Registry.BLOCK, identifier, block);

        if (registerItem) BVItems.register(id, new BlockItem(registeredBlock, new Item.Settings().maxCount(64).group(Beenevolent.ITEM_GROUP)));

        return registeredBlock;
    }
    public static Block register(String id, Block block) {
        return register(id, block, true);
    }

    protected static class Premade {
        private static Block honeyedTerracotta(String color, MaterialColor materialColor) {
            return register((color == null ? "" : color + "_") + "honeyed_terracotta", new Block(AbstractBlock.Settings.of(Material.STONE, materialColor).requiresTool().strength(1.25F, 4.2F)));
        }
    }
}
