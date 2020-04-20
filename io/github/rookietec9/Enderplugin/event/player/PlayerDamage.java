package io.github.rookietec9.EnderPlugin.event.player;

import org.bukkit.ChatColor;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class PlayerDamage implements Listener {
    public PlayerDamage() {
    }

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof LivingEntity && event.getEntity() instanceof Player) {
            Player Damaged = (Player)event.getEntity();
            String DamageName = String.valueOf(Damaged.getName());
            Player Damager = (Player)event.getDamager();
            String DamageTooken = String.valueOf(Damaged.getLastDamage());
            String DamageMax = String.valueOf(Damaged.getMaxHealth());
            String DamageCurrent = String.valueOf(Damaged.getHealth());
            Damager.sendMessage(ChatColor.RED + "You hit " + DamageName + " For " + DamageTooken);
            Damager.sendMessage(DamageName + ": " + ChatColor.YELLOW + DamageCurrent + ChatColor.GOLD + "/" + ChatColor.YELLOW + DamageMax);
            Damaged.getHealth();
            event.getDamage();
        }

    }
}