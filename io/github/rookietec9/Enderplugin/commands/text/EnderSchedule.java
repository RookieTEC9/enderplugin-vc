package io.github.rookietec9.EnderPlugin.commands.text;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EnderSchedule implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderSchedule(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("EnderSchedule")) {
        }

        sender.sendMessage(ChatColor.DARK_PURPLE + "Server schedule as follows:");
        sender.sendMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "REGULAR DAYS");
        sender.sendMessage(ChatColor.BLUE + "WEEKDAYS:" + ChatColor.AQUA + "3PM-10PM");
        sender.sendMessage(ChatColor.BLUE + "SATURDAYS:" + ChatColor.AQUA + "3PM-11PM");
        sender.sendMessage(ChatColor.BLUE + "SUNDAYS:" + ChatColor.AQUA + "2PM-10PM");
        sender.sendMessage(ChatColor.WHITE + "Server will be shut down after the end of school due to the fact on vacation.");
        return true;
    }
}