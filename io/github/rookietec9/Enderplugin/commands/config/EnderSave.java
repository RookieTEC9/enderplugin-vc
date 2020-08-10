package io.github.rookietec9.EnderPlugin.commands.config;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EnderSave implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderSave(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("EnderSave")) {
            this.plugin.saveConfig();
            return true;
        } else {
            return true;
        }
    }
}