package io.github.rookietec9.EnderPlugin.event.player;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChatNick {
    private final EnderPlugin plugin;

    public PlayerChatNick(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e) {
        if (this.plugin.getConfig().getString(e.getPlayer().getName()) != null) {
            e.getPlayer().setDisplayName(this.plugin.getConfig().getString(e.getPlayer().getName()) + ChatColor.RESET);
        }

    }
}