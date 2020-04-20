package io.github.rookietec9.EnderPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

class EnderHeal implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderHeal(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target = sender.getServer().getPlayer(args[0]);
        String SenderName = String.valueOf(sender.getName());
        if (command.getName().equalsIgnoreCase("enderHeal")) {
            if (args.length > 1) {
                sender.sendMessage(this.plugin.getConfig().getString("Plug Message") + ChatColor.DARK_RED + "WHO?");
                return true;
            } else if (target == null) {
                sender.sendMessage(this.plugin.getConfig().getString("Plug Message") + ChatColor.DARK_RED + args[0] + " is not currently cool.");
                return true;
            } else {
                target.setHealth(20.0D);
                sender.sendMessage(this.plugin.getConfig().getString("Plug Message") + ChatColor.AQUA + args[0] + " was successfully healed. :D");
                Bukkit.broadcastMessage(this.plugin.getConfig().getString("Plug Message") + ChatColor.LIGHT_PURPLE + SenderName + " healed " + target.getName());
                return true;
            }
        } else {
            sender.sendMessage(this.plugin.getConfig().getString("Plug Message") + ChatColor.AQUA + args[0] + " was successfully healed. :D");
            Bukkit.broadcastMessage(this.plugin.getConfig().getString("Plug Message") + ChatColor.LIGHT_PURPLE + SenderName + " healed " + target.getName());
            return true;
        }
    }
}