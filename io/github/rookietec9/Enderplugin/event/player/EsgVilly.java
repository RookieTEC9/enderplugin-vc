package io.github.rookietec9.EnderPlugin.event.player;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class EsgVilly implements Listener {
    public EsgVilly() {
    }

    @EventHandler
    public void onPlayerInteractBlock(PlayerInteractEvent event) {
        Location Villager = new Location(Bukkit.getWorld("ESG_HUB"), 1.0D, 1.0D, 1.0D);
        if (event.getPlayer().getEyeLocation().equals(Villager)) {
            event.getPlayer().sendMessage("weed");
        }

    }
}