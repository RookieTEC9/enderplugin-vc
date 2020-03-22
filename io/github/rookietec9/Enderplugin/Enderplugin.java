package io.github.rookietec9.EnderPlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnderPlugin extends JavaPlugin {
  public void onEnable() {
    getLogger().info("EnderPlugin by TEC9 has been successfully launched. :D");
  }
  
  public void onDisable() {
    getLogger().info("EnderPlugin by TEC9 has shut down.");
  }
  
  public boolean onCommand(CommandSender paramCommandSender, Command paramCommand, String paramString, String[] paramArrayOfString) {
    throw new Error("Unresolved compilation problem: \n\tThis method must return a result of type boolean\n");
  }
