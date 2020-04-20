package io.github.rookietec9.EnderPlugin;

import io.github.rookietec9.EnderPlugin.event.player.PlayerChat;
import io.github.rookietec9.EnderPlugin.event.player.PlayerDamage;
import org.bukkit.plugin.PluginManager;
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
        this.getCommand("EnderVersion").setExecutor(new EnderVersion(this));
        this.RegisterEvents();
    }

    public void RegisterEvents() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new PlayerChat(), this);
        pm.registerEvents(new PlayerDamage(), this);
    }

    public void onDisable() {
        this.getLogger().info("EnderPlugin by TEC9 has shut down.");
    }
}