package io.github.rookietec9.EnderPlugin.event.player;

import net.md_5.bungee.api.ChatColor;
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
        if (event.getEntity().getType() == EntityType.PLAYER && event.getDamager().getType() == EntityType.ZOMBIE) {
            Player p = (Player)event.getEntity();
            String DamagedName = String.valueOf(p.getName());
            String DamageTooken = String.valueOf(p.getLastDamage());
            String DamageMax = String.valueOf(p.getMaxHealth());
            if (p.getHealth() - event.getDamage() <= 0.0D) {
                Bukkit.broadcastMessage(DamagedName + " Finishing Damage:" + DamageTooken);
                Bukkit.broadcastMessage(ChatColor.RED + "Max health:" + ChatColor.RESET + DamageMax);
            }
        }

    }
}