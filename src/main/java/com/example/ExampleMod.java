package com.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class ExampleMod implements ModInitializer {
    @Override
        public void onInitialize() {
                // Enregistre les fonctionnalités
                        KeyInputHandler.register();
                                HudRenderCallback.EVENT.register(new HudRenderHandler());
                                    }
                                    } 