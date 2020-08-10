package io.github.rookietec9.EnderPlugin;

import io.github.rookietec9.EnderPlugin.commands.config.EnderReload;
import io.github.rookietec9.EnderPlugin.commands.config.EnderSave;
import io.github.rookietec9.EnderPlugin.commands.multiworld.EnderWorld;
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
import io.github.rookietec9.EnderPlugin.commands.player.other.EnderFly;
import io.github.rookietec9.EnderPlugin.commands.player.other.EnderTP;
import io.github.rookietec9.EnderPlugin.commands.player.other.EnderTwerk;
import io.github.rookietec9.EnderPlugin.commands.text.EnderColors;
import io.github.rookietec9.EnderPlugin.commands.text.EnderSchedule;
import io.github.rookietec9.EnderPlugin.commands.text.EnderVersion;
import io.github.rookietec9.EnderPlugin.commands.text.EnderYT;
import io.github.rookietec9.EnderPlugin.event.inventory.InventoryClick;
import io.github.rookietec9.EnderPlugin.event.inventory.esgClick;
import io.github.rookietec9.EnderPlugin.event.player.PlayerChat;
import io.github.rookietec9.EnderPlugin.event.player.PlayerDamage;
import io.github.rookietec9.EnderPlugin.event.player.PlayerDeath;
import io.github.rookietec9.EnderPlugin.event.player.PlayerJoin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnderPlugin extends JavaPlugin {
    public EnderPlugin() {
    }

    public void onEnable() {
        this.registerCommands();
        this.RegisterEvents();
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
        this.getCommand("Rename").setExecutor(new EnderRename(this));
        this.getCommand("EnderESG").setExecutor(new EnderESG(this));
        this.getCommand("EnderFake").setExecutor(new EnderFake(this));
        this.getCommand("EnderRank").setExecutor(new EnderRank(this));
        this.getCommand("EnderColors").setExecutor(new EnderColors(this));
        this.getCommand("EnderSave").setExecutor(new EnderSave(this));
        this.getCommand("EnderFly").setExecutor(new EnderFly(this));
        this.getCommand("EnderTwerk").setExecutor(new EnderTwerk(this));
        this.getCommand("EnderWorld").setExecutor(new EnderWorld(this));
    }

    public void RegisterEvents() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new PlayerChat(), this);
        pm.registerEvents(new PlayerDeath(), this);
        pm.registerEvents(new PlayerDamage(), this);
        pm.registerEvents(new PlayerJoin(this), this);
        pm.registerEvents(new InventoryClick(), this);
        pm.registerEvents(new esgClick(), this);
    }

    public void onDisable() {
        this.getLogger().info("EnderPlugin by TEC9 has shut down.");
    }
}