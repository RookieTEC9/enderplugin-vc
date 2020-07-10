package io.github.rookietec9.EnderPlugin.event.player;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class PlayerClean implements Listener {
    public PlayerClean() {
    }

    @EventHandler
    public void onDeath(EntityDamageByEntityEvent event) {
        if (event.getEntity().getType() == EntityType.PLAYER && event.getDamager().getType() == EntityType.PLAYER) {
            Player p = (Player)event.getEntity();
            if (p.getHealth() - event.getDamage() <= 0.0D) {
                p.getKiller().sendTitle(ChatColor.RED + "You killed " + p.getName(), ChatColor.DARK_RED + "Nice.");
            }
        }

    }
}