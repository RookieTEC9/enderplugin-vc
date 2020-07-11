package io.github.rookietec9.EnderPlugin;

import io.github.rookietec9.EnderPlugin.event.inventory.InventoryClick;
import io.github.rookietec9.EnderPlugin.event.player.PlayerChat;
import io.github.rookietec9.EnderPlugin.event.player.PlayerDamage;
import io.github.rookietec9.EnderPlugin.event.player.PlayerDeath;
import io.github.rookietec9.EnderPlugin.event.player.PlayerJoin;
import java.io.File;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnderPlugin extends JavaPlugin {
    public static String EnderNotPlayer = "§4This command can only be run be a player ";
    public static String EnderOffline = "§4The requested player is not online. ";

    public EnderPlugin() {
    }

    public void onEnable() {
        this.getLogger().info("EnderPlugin by TEC9 has been successfully launched. :D");
        this.getCommand("EnderSchedule").setExecutor(new EnderSchedule(this));
        this.getLogger().info("EnderSchedule activated");
        this.getCommand("EnderKill").setExecutor(new EnderKill(this));
        this.getLogger().info("EnderKill activated");
        this.getCommand("EnderHeal").setExecutor(new EnderHeal(this));
        this.getLogger().info("Enderheal activated");
        this.getCommand("EnderHug").setExecutor(new EnderHug(this));
        this.getCommand("EnderYT").setExecutor(new EnderYT(this));
        this.getCommand("EnderFinish").setExecutor(new EnderFinish(this));
        this.getCommand("EnderTP").setExecutor(new EnderTP(this));
        this.getCommand("EnderVersion").setExecutor(new EnderVersion(this));
        this.getCommand("EnderAnon").setExecutor(new EnderAnon(this));
        this.getCommand("EnderData").setExecutor(new EnderData(this));
        this.getCommand("EnderCraft").setExecutor(new EnderCraft(this));
        this.getCommand("EnderReload").setExecutor(new EnderReload(this));
        this.getCommand("EnderItem").setExecutor(new EnderItem(this));
        this.getCommand("EnderEnchant").setExecutor(new EnderEnchant(this));
        this.getCommand("EnderTelly").setExecutor(new EnderTelly());
        this.getCommand("EnderRename").setExecutor(new EnderRename(this));
        this.getCommand("EnderESG").setExecutor(new EnderESG());
        this.getCommand("EnderFake").setExecutor(new EnderFake(this));
        this.getCommand("EnderRank").setExecutor(new EnderRank(this));
        this.RegisterEvents();
        registerEntities();
        if (!(new File(this.getDataFolder(), "config.yml")).exists()) {
            this.saveDefaultConfig();
        }

    }

    public static void registerEntities() {
    }

    public void RegisterEvents() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new PlayerChat(), this);
        pm.registerEvents(new PlayerDeath(), this);
        pm.registerEvents(new PlayerDamage(), this);
        pm.registerEvents(new PlayerJoin(this), this);
        pm.registerEvents(new InventoryClick(), this);
    }

    public void onDisable() {
        this.getLogger().info("EnderPlugin by TEC9 has shut down.");
    }
}