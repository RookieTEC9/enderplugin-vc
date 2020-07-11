package io.github.rookietec9.EnderPlugin;

import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderFake implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderFake(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String String, String[] args) {
        if (command.getName().equalsIgnoreCase("enderFake")) {
            if (args.length == 0) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")));
                return true;
            } else {
                Player target = sender.getServer().getPlayer(args[0]);
                String message = StringUtils.join(args, ' ', 1, args.length);
                String Name = target.getDisplayName();
                Bukkit.broadcastMessage("<" + Name + ">" + " " + ChatColor.translateAlternateColorCodes('&', message));
                return true;
            }
        } else {
            return true;
        }
    }
}