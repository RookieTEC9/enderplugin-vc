package io.github.rookietec9.EnderPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnderPlugin extends JavaPlugin {
  public void onEnable() {
    getLogger().info("EnderPlugin by TEC9 has been successfully launched. :D");
    getCommand("EnderSchedule").setExecutor(new EnderPluginCommandExecutor(this));
  }
  
  public void onDisable() {
    getLogger().info("EnderPlugin by TEC9 has shut down.");
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    Player target = sender.getServer().getPlayer(args[0]);
    if (cmd.getName().equalsIgnoreCase("enderHeal")) {
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
