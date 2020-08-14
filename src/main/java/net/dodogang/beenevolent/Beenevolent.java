package net.dodogang.beenevolent;

import net.dodogang.beenevolent.init.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Beenevolent implements ModInitializer {
    public static final String MOD_ID = "beenevolent";
    public static final String MOD_NAME = "Beenevolent";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
        new Identifier(MOD_ID, "item_group"),
        () -> new ItemStack(BVBlocks.DRIED_CLAY)
    );

    public static Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        log("Initializing");

        new BVBlocks();
        new BVItems();

        log("Initialized");
    }

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
    public static void log(String message) {
        log(Level.INFO, message);
    }
}
