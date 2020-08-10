package io.github.rookietec9.EnderPlugin.commands.player.damagable;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;

public class EnderKill implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderKill(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target = sender.getServer().getPlayer(args[0]);
        if (command.getName().equalsIgnoreCase("enderKill")) {
            if (args.length != 1) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + ChatColor.DARK_RED + "One person at a time.");
                return true;
            }

            if (target == null) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + ChatColor.DARK_RED + args[0] + " is not currently cool.");
                return true;
            }

            target.setHealth(0.0D);
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + ChatColor.AQUA + args[0] + " " + "was successfully injured. :D");
            if (target == sender) {
                Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + ChatColor.DARK_BLUE + "Some loser commited suicide.");
            }

            ((Damageable)sender).setHealth(0.0D);
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + ChatColor.DARK_BLUE + "Some loser commited suicide.");
        }

        return true;
    }
}