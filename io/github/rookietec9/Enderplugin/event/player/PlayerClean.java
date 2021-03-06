package io.github.rookietec9.EnderPlugin.event.player;

import org.bukkit.Bukkit;
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
                String DamagedName = String.valueOf(p.getName());
                String DamagedNick = String.valueOf(p.getDisplayName());
                String DamageMax = String.valueOf(p.getMaxHealth());
                String LastDMG = String.valueOf(p.getLastDamage());
                String DamageKiller = String.valueOf(p.getKiller().getName());
                String DamagerGM = String.valueOf(p.getKiller().getGameMode());
                String DamagerFly = String.valueOf(p.getKiller().getAllowFlight());
                String GetWorld = String.valueOf(p.getWorld());
                String World = GetWorld.substring(16, GetWorld.length() - 1);
                if (p.getHealth() - event.getDamage() <= 0.0D) {
                    Bukkit.broadcastMessage(ChatColor.BOLD + "====Death Report====");
                    Bukkit.broadcastMessage(ChatColor.BOLD + "Death Log of " + DamagedNick);
                    Bukkit.broadcastMessage("Victim: " + DamagedNick + " or " + DamagedName);
                    Bukkit.broadcastMessage("Killer: " + DamageKiller);
                    Bukkit.broadcastMessage("Finishing Damage " + LastDMG);
                    Bukkit.broadcastMessage("Killer Flight enabled: " + DamagerFly);
                    Bukkit.broadcastMessage("Killer Gamemode: " + DamagerGM);
                    Bukkit.broadcastMessage("Max Damage: " + DamageMax);
                    Bukkit.broadcastMessage("World: " + World);
                    Bukkit.broadcastMessage("");
                    p.getKiller().sendTitle(ChatColor.RED + "You killed " + p.getName(), ChatColor.DARK_RED + "Nice.");
                    p.spigot().respawn();
                }
            }
        }

    }
}