package io.github.rookietec9.EnderPlugin.commands.player.chat;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.apache.commons.lang.StringUtils;
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
            if (args.length < 2) {
                sender.sendMessage(this.plugin.getConfig().getString("Plug Message") + ChatColor.DARK_RED + "Command syntax: /endermessage <user> message");
                return true;
            }

            Player target = sender.getServer().getPlayer(args[0]);
            if (target == null) {
                sender.sendMessage(this.plugin.getConfig().getString("Plug Message") + ChatColor.DARK_RED + args[0] + " is not currently cool.");
                return true;
            }

            if (args.length >= 2) {
                String message = StringUtils.join(args, ' ', 1, args.length);
                target.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + message);
            }
        }

        return true;
    }
}