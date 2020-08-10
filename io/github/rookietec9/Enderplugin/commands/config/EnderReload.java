package io.github.rookietec9.EnderPlugin.commands.config;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EnderReload implements CommandExecutor {
    private EnderPlugin plugin;

    public EnderReload(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderReload")) {
            this.plugin.reloadConfig();
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + "Reloaded EnderPlugin.");
            return true;
        } else {
            return true;
        }
    }
}