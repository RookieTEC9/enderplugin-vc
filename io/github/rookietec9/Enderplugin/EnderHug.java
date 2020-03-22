package io.github.rookietec9.EnderPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderHug implements CommandExecutor {
  private final EnderPlugin plugin;
  
  public EnderHug(EnderPlugin plugin) {
    this.plugin = plugin;
  }
  
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    if (command.getName().equalsIgnoreCase("EnderHug"));
    Player target = sender.getServer().getPlayer(args[0]);
    if (!(sender instanceof Player)) {
      sender.sendMessage(ChatColor.DARK_RED + "This command can only be run by a player.");
      return true;
    } 
    if (target == null) {
      sender.sendMessage(ChatColor.DARK_RED + args[0] + " is not currently cool.");
      return true;
    } 
    target.sendMessage(ChatColor.LIGHT_PURPLE + sender.getName() + " Hugged you. Return the favor with /enderkill");
    sender.sendMessage(ChatColor.AQUA + args[0] + " was successfully hugged. :D");
    return true;
  }
}