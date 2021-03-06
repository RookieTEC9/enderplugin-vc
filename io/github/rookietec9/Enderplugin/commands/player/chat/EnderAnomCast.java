package io.github.rookietec9.EnderPlugin.commands.player.chat;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EnderAnomCast implements CommandExecutor {
    private EnderPlugin plugin;

    public EnderAnomCast(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderAnomCast")) {
            String PlugMsg = ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message"));
            String Error = PlugMsg + "§4Error: §c";
            String NoArgs = Error + "Not enough arguments.";
            if (args.length == 0) {
                sender.sendMessage(NoArgs);
            }

            String Message = StringUtils.join(args, ' ', 0, args.length);
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', Message));
        }

        return true;
    }
}