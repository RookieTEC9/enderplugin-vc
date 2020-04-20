package io.github.rookietec9.EnderPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderAnon implements CommandExecutor { //added to plugin.yml
    private final EnderPlugin plugin;

    public EnderAnon(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target = sender.getServer().getPlayer(args[0]);
        if (command.getName().equalsIgnoreCase("enderAnon")) {
            if (args.length != 2) {
                sender.sendMessage(ChatColor.DARK_RED + "Command syntax: /endermessage <user> 'message'");
                return true;
            } else if (target == null) {
                sender.sendMessage(ChatColor.DARK_RED + args[0] + " is not currently cool.");
                return true;
            } else {
                target.sendMessage(args[1]);
                sender.sendMessage(ChatColor.AQUA + args[0] + " " + "was successfully messaged. :D");
                if (target == sender) {
                    Bukkit.broadcastMessage(ChatColor.DARK_BLUE + " Is so sad they must message themselves.");
                }

                return true;
            }
        } else {
            return true;
        }
    }
}