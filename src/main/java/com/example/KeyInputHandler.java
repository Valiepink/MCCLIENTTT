package com.example;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static KeyBinding menuKey;

        public static void register() {
                menuKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                            "Ouvrir Menu", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_J, "McClient"
                                    ));

                                            ClientTickEvents.END_CLIENT_TICK.register(client -> {
                                                        while (menuKey.wasPressed()) {
                                                                        client.setScreen(new MonMenuScreen(Text.literal("Menu")));
                                                                                    }
                                                                                            });
                                                                                                }
                                                                                                }