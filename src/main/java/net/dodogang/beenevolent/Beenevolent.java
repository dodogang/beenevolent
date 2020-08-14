package net.dodogang.beenevolent;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Beenevolent implements ModInitializer {
    public static final String MOD_ID   = "beenevolent";
    public static final String MOD_NAME = "Beenevolent";
    public static       Logger LOGGER   = LogManager.getLogger();

    @Override
    public void onInitialize() {
        log("Initializing");
    }

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
    public static void log(String message) {
        log(Level.INFO, message);
    }
}
