package com.example;

import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;

public class HudRenderHandler implements HudRenderCallback {
    @Override
        public void onHudRender(DrawContext context, float tickDelta) {
                // Affiche le texte en haut à gauche (10, 10)
                        context.drawText(MinecraftClient.getInstance().textRenderer, 
                                    "§b§lMON CLIENT V1", 10, 10, 0xFFFFFF, true);
                                        }
                                        }