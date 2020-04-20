package io.github.rookietec9.EnderPlugin;

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
    if (cmd.getName().equalsIgnoreCase("EnderSchedule"));
    sender.sendMessage(ChatColor.DARK_PURPLE + "Server schedule as follows:");
    sender.sendMessage(ChatColor.BLUE + ChatColor.BOLD + "REGULAR DAYS");
    sender.sendMessage(ChatColor.BLUE + "WEEKDAYS:" + ChatColor.AQUA + "3PM-9PM");
    sender.sendMessage(ChatColor.BLUE + "WEEKENDS:" + ChatColor.AQUA + "10AM-9PM");
    sender.sendMessage(ChatColor.BLUE + "SATURDAYS:" + ChatColor.AQUA + "5PM-10PM");
    sender.sendMessage("message");
    return true;
  }
}