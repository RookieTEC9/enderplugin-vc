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
        String Name = Player.getName();
        String customName = Player.getDisplayName();
        Player.sendTitle(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Welcome Title")), ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Welcome Subtitle")));
        if (this.plugin.getConfig().get(Event.getPlayer().getName(), "Owner") != null) {
            Event.getPlayer().setPlayerListName("§f[§e§lOWNER§r] " + Name);
            Event.getPlayer().setCustomName("§f[§e§lOWNER§r]" + customName);
        } else if (this.plugin.getConfig().get(Event.getPlayer().getName(), "Co") != null) {
            Event.getPlayer().setPlayerListName("§f[§1§lCO§r] " + Name);
            Event.getPlayer().setCustomName("§f[§1§lCO§r] " + customName);
        } else if (this.plugin.getConfig().get(Event.getPlayer().getName(), "Members") != null) {
            Event.getPlayer().setPlayerListName("§f[§7§lMEMBER§r] " + Name);
            Event.getPlayer().setCustomName("§f[§7§lMEMBER§r] " + customName);
        }
    }
}