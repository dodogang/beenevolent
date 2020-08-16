package net.dodogang.beenevolent.block;

import static net.dodogang.beenevolent.init.BVBlocks.register;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;

public class HoneyedTerracottaBlocks {
    public static final Block BASE = createHoneyedTerracottaBlock(null, MaterialColor.BROWN_TERRACOTTA);

    public static final Block WHITE = createHoneyedTerracottaBlock("white", MaterialColor.WHITE_TERRACOTTA);
    public static final Block ORANGE = createHoneyedTerracottaBlock("orange", MaterialColor.ORANGE_TERRACOTTA);
    public static final Block MAGENTA = createHoneyedTerracottaBlock("magenta", MaterialColor.MAGENTA_TERRACOTTA);
    public static final Block LIGHT_BLUE = createHoneyedTerracottaBlock("light_blue", MaterialColor.LIGHT_BLUE_TERRACOTTA);
    public static final Block YELLOW = createHoneyedTerracottaBlock("yellow", MaterialColor.YELLOW_TERRACOTTA);
    public static final Block LIME = createHoneyedTerracottaBlock("lime", MaterialColor.LIME_TERRACOTTA);
    public static final Block PINK = createHoneyedTerracottaBlock("pink", MaterialColor.PINK_TERRACOTTA);
    public static final Block GRAY = createHoneyedTerracottaBlock("gray", MaterialColor.GRAY_TERRACOTTA);
    public static final Block LIGHT_GRAY = createHoneyedTerracottaBlock("light_gray", MaterialColor.LIGHT_GRAY_TERRACOTTA);
    public static final Block CYAN = createHoneyedTerracottaBlock("cyan", MaterialColor.CYAN_TERRACOTTA);
    public static final Block PURPLE = createHoneyedTerracottaBlock("purple", MaterialColor.PURPLE_TERRACOTTA);
    public static final Block BLUE = createHoneyedTerracottaBlock("blue", MaterialColor.BLUE_TERRACOTTA);
    public static final Block BROWN = createHoneyedTerracottaBlock("brown", MaterialColor.BROWN_TERRACOTTA);
    public static final Block GREEN = createHoneyedTerracottaBlock("green", MaterialColor.GREEN_TERRACOTTA);
    public static final Block RED = createHoneyedTerracottaBlock("red", MaterialColor.RED_TERRACOTTA);
    public static final Block BLACK = createHoneyedTerracottaBlock("black", MaterialColor.BLACK_TERRACOTTA);

    public HoneyedTerracottaBlocks() {};

    private static Block createHoneyedTerracottaBlock(String color, MaterialColor materialColor) {
        return register((color == null ? "" : color + "_") + "honeyed_terracotta", new Block(AbstractBlock.Settings.of(Material.STONE, materialColor).requiresTool().strength(1.25F, 4.2F)));
    }
}
