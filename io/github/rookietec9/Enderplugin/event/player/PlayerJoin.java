package io.github.rookietec9.EnderPlugin.event.player;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerJoin implements Listener {
    private final EnderPlugin plugin;

    public PlayerJoin(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void PlayerJoinEvent(Player playerJoined, String joinMessage) {
        playerJoined.sendTitle(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Welcome Title")), ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Welcome Subtitle")));
    }
}