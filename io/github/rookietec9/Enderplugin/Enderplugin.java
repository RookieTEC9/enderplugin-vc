package io.github.rookietec9.EnderPlugin;

import io.github.rookietec9.EnderPlugin.commands.EnderReload;
import io.github.rookietec9.EnderPlugin.commands.player.chat.EnderAnon;
import io.github.rookietec9.EnderPlugin.commands.player.chat.EnderData;
import io.github.rookietec9.EnderPlugin.commands.player.chat.EnderFake;
import io.github.rookietec9.EnderPlugin.commands.player.chat.EnderHug;
import io.github.rookietec9.EnderPlugin.commands.player.chat.EnderRank;
import io.github.rookietec9.EnderPlugin.commands.player.damagable.EnderFinish;
import io.github.rookietec9.EnderPlugin.commands.player.damagable.EnderHeal;
import io.github.rookietec9.EnderPlugin.commands.player.damagable.EnderKill;
import io.github.rookietec9.EnderPlugin.commands.player.item.EnderCraft;
import io.github.rookietec9.EnderPlugin.commands.player.item.EnderEnchant;
import io.github.rookietec9.EnderPlugin.commands.player.item.EnderItem;
import io.github.rookietec9.EnderPlugin.commands.player.item.EnderRename;
import io.github.rookietec9.EnderPlugin.commands.player.menu.EnderESG;
import io.github.rookietec9.EnderPlugin.commands.player.menu.EnderTelly;
import io.github.rookietec9.EnderPlugin.commands.player.other.EnderTP;
import io.github.rookietec9.EnderPlugin.commands.text.EnderSchedule;
import io.github.rookietec9.EnderPlugin.commands.text.EnderVersion;
import io.github.rookietec9.EnderPlugin.commands.text.EnderYT;
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
        this.registerCommands();
        this.RegisterEvents();
        this.registerEntities();
        if (!(new File(this.getDataFolder(), "config.yml")).exists()) {
            this.saveDefaultConfig();
        }

    }

    public void registerEntities() {
        this.getCommand("EnderRank").setExecutor(new EnderRank(this));
    }

    public void registerCommands() {
        this.getCommand("EnderSchedule").setExecutor(new EnderSchedule(this));
        this.getCommand("EnderKill").setExecutor(new EnderKill(this));
        this.getCommand("EnderHeal").setExecutor(new EnderHeal(this));
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