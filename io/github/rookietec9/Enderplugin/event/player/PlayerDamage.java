package io.github.rookietec9.EnderPlugin.event.player;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class PlayerDamage implements Listener {
    public PlayerDamage() {
    }

    @EventHandler
    public void ondeath(EntityDamageByEntityEvent event) {
        if (event.getEntity().getType() == EntityType.PLAYER && event.getDamager().getType() == EntityType.PLAYER) {
            Player p = (Player)event.getEntity();
            String Damage = String.valueOf(event.getDamage());
            if (p.getHealth() - event.getDamage() <= 0.0D) {
                Bukkit.broadcastMessage(p + "Finishing Damage:" + Damage);
            }
        }

    }
}