package io.github.rookietec9.EnderPlugin;

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
        if (!command.getName().equalsIgnoreCase("enderAnon")) {
            return true;
        } else {
            Player target = sender.getServer().getPlayer(args[0]);
            if (args.length < 2) {
                sender.sendMessage(EnderPlugin.EnderPlugin + ChatColor.DARK_RED + "Command syntax: /endermessage <user> message");
                return true;
            } else if (target == null) {
                sender.sendMessage(ChatColor.GOLD + "[ENDERPLUGIN PRE]" + ChatColor.DARK_RED + args[0] + " is not currently cool.");
                return true;
            } else {
                if (args.length > 2) {
                    for(int i = 0; i < args.length; ++i) {
                        target.sendMessage(EnderPlugin.EnderPlugin + args[i]);
                        sender.sendMessage("You sent the message to " + target.getName());
                        if (target == sender) {
                            Bukkit.broadcastMessage(EnderPlugin.EnderPlugin + ChatColor.DARK_BLUE + sender.getName() + " Is so sad they must message themselves.");
                        }

                        if (args.length == 2) {
                            sender.sendMessage(EnderPlugin.EnderPlugin + args[1]);
                            target.sendMessage(EnderPlugin.EnderPlugin + "You sent the message to " + sender.getName());
                            if (target == sender) {
                                Bukkit.broadcastMessage(EnderPlugin.EnderPlugin + ChatColor.DARK_BLUE + target.getName() + " Is so sad they must message themselves.");
                            }
                        }
                    }
                }

                return true;
            }
        }
    }
}