package io.github.rookietec9.EnderPlugin.commands.player.management;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderKick implements CommandExecutor {
    private EnderPlugin plugin;

    public EnderKick(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String PlugMsg = ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message"));
        String Error = PlugMsg + "§4Error: §c";
        String NoArgs = Error + "Not enough arguments.";
        if (command.getName().equalsIgnoreCase("enderKick")) {
            if (args.length < 1) {
                sender.sendMessage(NoArgs);
                return true;
            }

            Player player = Bukkit.getServer().getPlayer(args[0]);
            if (args.length == 1) {
                player.kickPlayer(sender.getName() + " had nothing else to do.");
                return true;
            }

            String message = StringUtils.join(args, ' ', 1, args.length);
            player.kickPlayer(message);
        }

        return true;
    }
}