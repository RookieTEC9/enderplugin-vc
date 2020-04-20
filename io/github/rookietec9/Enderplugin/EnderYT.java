package io.github.rookietec9.EnderPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderYT implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderYT(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("EnderYT")) {
            ;
        }

        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.DARK_RED + "This command can only be run by a player.");
            return true;
        } else {
            sender.sendMessage("" + ChatColor.BOLD + ChatColor.RED + "subscribe:");
            sender.sendMessage("" + ChatColor.BOLD + ChatColor.WHITE + "https://www.youtube.com/channel/UCPchALhSeAHEneiojMnNYEg?view_as=public");
            return true;
        }
    }
}