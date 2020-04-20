package io.github.rookietec9.EnderPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class EnderPlugin extends JavaPlugin {
  public void onEnable() {
    getLogger().info("EnderPlugin by TEC9 has been successfully launched. :D");
    getCommand("EnderSchedule").setExecutor(new EnderSchedule(this));
    getCommand("EnderKill").setExecutor(new EnderKill(this));
    getCommand("EnderHeal").setExecutor(new EnderHeal(this));
    getCommand("EnderHug").setExecutor(new EnderHug(this));
    getCommand("EnderYT").setExecutor(new EnderYT(this));
    getCommand("EnderFinish").setExecutor(new EnderFinish(this));
  }
  
  public void onDisable() {
    getLogger().info("EnderPlugin by TEC9 has shut down.");
  }
}