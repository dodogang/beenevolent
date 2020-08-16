package net.dodogang.beenevolent.block;

import static net.dodogang.beenevolent.init.BVBlocks.register;

// import net.dodogang.beenevolent.Beenevolent;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
// import net.minecraft.block.entity.BeehiveBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
// import net.minecraft.datafixer.TypeReferences;
import net.minecraft.sound.BlockSoundGroup;
// import net.minecraft.util.Identifier;
// import net.minecraft.util.Util;
// import net.minecraft.util.registry.Registry;

public class ExtendedHiveBlocks {
    public static final Block TERRACOTTA = createTerracottaHiveBlock(null, MaterialColor.BROWN_TERRACOTTA);

    public static final Block WHITE_TERRACOTTA = createTerracottaHiveBlock("white", MaterialColor.WHITE_TERRACOTTA);
    public static final Block ORANGE_TERRACOTTA = createTerracottaHiveBlock("orange", MaterialColor.ORANGE_TERRACOTTA);
    public static final Block MAGENTA_TERRACOTTA = createTerracottaHiveBlock("magenta", MaterialColor.MAGENTA_TERRACOTTA);
    public static final Block LIGHT_BLUE_TERRACOTTA = createTerracottaHiveBlock("light_blue", MaterialColor.LIGHT_BLUE_TERRACOTTA);
    public static final Block YELLOW_TERRACOTTA = createTerracottaHiveBlock("yellow", MaterialColor.YELLOW_TERRACOTTA);
    public static final Block LIME_TERRACOTTA = createTerracottaHiveBlock("lime", MaterialColor.LIME_TERRACOTTA);
    public static final Block PINK_TERRACOTTA = createTerracottaHiveBlock("pink", MaterialColor.PINK_TERRACOTTA);
    public static final Block GRAY_TERRACOTTA = createTerracottaHiveBlock("gray", MaterialColor.GRAY_TERRACOTTA);
    public static final Block LIGHT_GRAY_TERRACOTTA = createTerracottaHiveBlock("light_gray", MaterialColor.LIGHT_GRAY_TERRACOTTA);
    public static final Block CYAN_TERRACOTTA = createTerracottaHiveBlock("cyan", MaterialColor.CYAN_TERRACOTTA);
    public static final Block PURPLE_TERRACOTTA = createTerracottaHiveBlock("purple", MaterialColor.PURPLE_TERRACOTTA);
    public static final Block BLUE_TERRACOTTA = createTerracottaHiveBlock("blue", MaterialColor.BLUE_TERRACOTTA);
    public static final Block BROWN_TERRACOTTA = createTerracottaHiveBlock("brown", MaterialColor.BROWN_TERRACOTTA);
    public static final Block GREEN_TERRACOTTA = createTerracottaHiveBlock("green", MaterialColor.GREEN_TERRACOTTA);
    public static final Block RED_TERRACOTTA = createTerracottaHiveBlock("red", MaterialColor.RED_TERRACOTTA);
    public static final Block BLACK_TERRACOTTA = createTerracottaHiveBlock("black", MaterialColor.BLACK_TERRACOTTA);

    public static final Block SPRUCE = createWoodenHiveBlock("spruce", MaterialColor.SPRUCE);
    public static final Block BIRCH = createWoodenHiveBlock("birch", MaterialColor.SAND);
    public static final Block JUNGLE = createWoodenHiveBlock("jungle", MaterialColor.DIRT);
    public static final Block ACACIA = createWoodenHiveBlock("acacia", MaterialColor.ORANGE);
    public static final Block DARK_OAK = createWoodenHiveBlock("dark_oak", MaterialColor.BROWN);
    public static final Block CRIMSON = createWoodenHiveBlock("crimson", MaterialColor.field_25703);
    public static final Block WARPED = createWoodenHiveBlock("warped", MaterialColor.field_25706);

    public static BlockEntityType<?> BLOCK_ENTITY;

    public ExtendedHiveBlocks() {
        // Block[] hiveBlocks = new Block[] { TERRACOTTA, WHITE_TERRACOTTA, ORANGE_TERRACOTTA, MAGENTA_TERRACOTTA, LIGHT_BLUE_TERRACOTTA, YELLOW_TERRACOTTA, LIME_TERRACOTTA, PINK_TERRACOTTA, GRAY_TERRACOTTA, LIGHT_GRAY_TERRACOTTA, CYAN_TERRACOTTA, PURPLE_TERRACOTTA, BLUE_TERRACOTTA, BROWN_TERRACOTTA, GREEN_TERRACOTTA, RED_TERRACOTTA, BLACK_TERRACOTTA, SPRUCE, BIRCH, JUNGLE, ACACIA, DARK_OAK, CRIMSON, WARPED };

        // Identifier identifier = new Identifier(Beenevolent.MOD_ID, "beehive");
        // BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, identifier, BlockEntityType.Builder.create(BeehiveBlockEntity::new, hiveBlocks).build(Util.method_29187(TypeReferences.BLOCK_ENTITY, identifier.getPath())));
    };

    private static Block createTerracottaHiveBlock(String color, MaterialColor materialColor) {
       return register((color == null ? "" : color + "_") + "terracotta_hive", new BeehiveBlock(AbstractBlock.Settings.of(Material.STONE, materialColor).requiresTool().strength(1.25F, 4.2F)));
    }
    private static Block createWoodenHiveBlock(String type, MaterialColor materialColor) {
       return register(type + "_hive", new BeehiveBlock(AbstractBlock.Settings.of(Material.WOOD, materialColor).strength(0.6F).sounds(BlockSoundGroup.WOOD)));
    }
}
