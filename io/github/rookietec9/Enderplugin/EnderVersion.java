package io.github.rookietec9.EnderPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EnderVersion implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderVersion(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("EnderVersion")) {
            ;
        }

        sender.sendMessage(this.plugin.getConfig().getString("Plug Message") + ChatColor.BOLD + "EnderPlugin");
        sender.sendMessage(ChatColor.BLUE + "Version Cycle:" + ChatColor.BOLD + " PRE");
        sender.sendMessage(ChatColor.DARK_BLUE + "Version:" + ChatColor.BOLD + " 0.4.X");
        sender.sendMessage(ChatColor.DARK_AQUA + "Compiled:" + ChatColor.BOLD + " June");
        return true;
    }
}