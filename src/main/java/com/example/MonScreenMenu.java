package com.example;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;

public class MonMenuScreen extends Screen {
    public MonMenuScreen(Text title) {
            super(title);
                }

                    @Override
                        public void render(DrawContext context, int mouseX, int mouseY, float delta) {
                                // Cette ligne assombrit le fond du jeu derrière le menu
                                        this.renderBackground(context); 
                                                
                                                        // Affiche le titre au centre de l'écran
                                                                context.drawCenteredTextWithShadow(this.textRenderer, "--- McClientBETA ---", this.width / 2, 40, 0x00FFFF);
                                                                        
                                                                                super.render(context, mouseX, mouseY, delta);
                                                                                    }
                                                                                    }