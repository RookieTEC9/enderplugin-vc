package io.github.rookietec9.EnderPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderHeal implements CommandExecutor {
  private final EnderPlugin plugin;
  
  public EnderHeal(EnderPlugin plugin) {
    this.plugin = plugin;
  }
  
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    Player target = sender.getServer().getPlayer(args[0]);
    if (command.getName().equalsIgnoreCase("enderHeal")) {
      if (args.length < 1) {
        sender.sendMessage(ChatColor.DARK_RED + "WHO?");
        return false;
      } 
      if (target == null) {
        sender.sendMessage(ChatColor.DARK_RED + args[0] + " is not currently cool.");
        return true;
      } 
      target.setHealth(20.0D);
      sender.sendMessage(ChatColor.AQUA + args[0] + " " + "was successfully healed. :D");
      return true;
    } 
    return true;
  }
}