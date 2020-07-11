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
        Player Mem = (Player)this.plugin.getConfig().getStringList("Members");
        Player Co = (Player)this.plugin.getConfig().getStringList("Co");
        Player Owner = (Player)this.plugin.getConfig().getStringList("Owner");
        String Name = Player.getName();
        String customName = Player.getDisplayName();
        Mem.setPlayerListName("§f[§7§lMEMBER§r] " + Name);
        Mem.setCustomName("§f[§7§lMEMBER§r] " + customName);
        Co.setPlayerListName("§f[§1§lCO§r] " + Name);
        Co.setCustomName("§f[§1§lCO§r] " + customName);
        Owner.setPlayerListName("§f[§e§lOWNER§r] " + Name);
        Owner.setCustomName("§f[§e§lOWNER§r]" + customName);
    }
}