package io.github.rookietec9.EnderPlugin;

import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderAnon implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderAnon(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderAnon")) {
            Player target = sender.getServer().getPlayer(args[0]);
            if (args.length < 2) {
                sender.sendMessage(this.plugin.getConfig().getString("Plug Message") + ChatColor.DARK_RED + "Command syntax: /endermessage <user> message");
                return true;
            }

            if (target == null) {
                sender.sendMessage(this.plugin.getConfig().getString("Plug Message") + ChatColor.DARK_RED + args[0] + " is not currently cool.");
                return true;
            }

            if (args.length >= 2) {
                String message = StringUtils.join(args, ' ', 1, args.length);
                target.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + message);
            }

            if (args.length == 2) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message") + args[1]));
                target.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message") + args[1]) + "You sent the message to " + sender.getName());
                if (target == sender) {
                    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + ChatColor.DARK_BLUE + target.getName() + " Is so sad they must message themselves.");
                }
            }
        }

        return true;
    }
}