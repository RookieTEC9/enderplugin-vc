package io.github.rookietec9.EnderPlugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class EnderPlugin extends JavaPlugin {
    public EnderPlugin() {
    }

    public void onEnable() {
        this.getLogger().info("EnderPlugin by TEC9 has been successfully launched. :D");
        this.getCommand("EnderSchedule").setExecutor(new EnderSchedule(this));
        this.getCommand("EnderKill").setExecutor(new EnderKill(this));
        this.getCommand("EnderHeal").setExecutor(new EnderHeal(this));
        this.getCommand("EnderHug").setExecutor(new EnderHug(this));
        this.getCommand("EnderYT").setExecutor(new EnderYT(this));
        this.getCommand("EnderFinish").setExecutor(new EnderFinish(this));
        this.getCommand("EnderTP").setExecutor(new EnderTP(this));
    }

    public void onDisable() {
        this.getLogger().info("EnderPlugin by TEC9 has shut down.");
    }
}