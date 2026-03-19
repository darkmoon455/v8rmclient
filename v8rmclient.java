package com.myclient;

import net.fabricmc.api.ModInitializer;
import baritone.api.BaritoneAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyClient implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("myclient");

    @Override
    public void onInitialize() {
        LOGGER.info("MyClient с Baritone запущен!");
        
        // Настройки Baritone
        BaritoneAPI.getSettings().allowJump.value = true;
        BaritoneAPI.getSettings().allowParkour.value = true;
        BaritoneAPI.getSettings().allowSprint.value = true;
    }
}