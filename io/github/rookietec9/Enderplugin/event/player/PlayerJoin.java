package io.github.rookietec9.EnderPlugin.event.player;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    private final EnderPlugin plugin;

    public PlayerJoin(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void PlayerJoinEvent(PlayerJoinEvent Event) {
        Player Player = Event.getPlayer();
        Player.sendTitle(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Welcome Title")), ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Welcome Subtitle")));
    }
}