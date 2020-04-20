package io.github.rookietec9.EnderPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderFinish implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderFinish(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target = sender.getServer().getPlayer(args[0]);
        if (command.getName().equalsIgnoreCase("enderFinish")) {
            if (args.length != 1) {
                sender.sendMessage(this.plugin.getConfig().getString("Plug Message") + ChatColor.DARK_RED + "One person at a time.");
                return true;
            } else if (target == null) {
                sender.sendMessage(this.plugin.getConfig().getString("Plug Message") + ChatColor.DARK_RED + args[0] + " is not currently cool.");
                return true;
            } else {
                target.setHealth(1.0D);
                sender.sendMessage(this.plugin.getConfig().getString("Plug Message") + ChatColor.AQUA + args[0] + " " + "was successfully injured. :D");
                if (target == sender) {
                    Bukkit.broadcastMessage(this.plugin.getConfig().getString("Plug Message") + ChatColor.DARK_BLUE + "Some loser attempted injury.");
                }

                return true;
            }
        } else {
            return true;
        }
    }
}