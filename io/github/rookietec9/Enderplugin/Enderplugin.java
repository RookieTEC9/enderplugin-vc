package io.github.rookietec9.EnderPlugin;

import io.github.rookietec9.EnderPlugin.ESG.ESGLevel;
import io.github.rookietec9.EnderPlugin.ESG.PickClassOpenEvent;
import io.github.rookietec9.EnderPlugin.ESG.PickClassPickEvent;
import io.github.rookietec9.EnderPlugin.commands.config.EnderReload;
import io.github.rookietec9.EnderPlugin.commands.config.EnderSave;
import io.github.rookietec9.EnderPlugin.commands.multiworld.EnderWorldTP;
import io.github.rookietec9.EnderPlugin.commands.player.VanillaMenu.EnderCraft;
import io.github.rookietec9.EnderPlugin.commands.player.VanillaMenu.EnderEnchant;
import io.github.rookietec9.EnderPlugin.commands.player.chat.EnderAnomCast;
import io.github.rookietec9.EnderPlugin.commands.player.chat.EnderAnon;
import io.github.rookietec9.EnderPlugin.commands.player.chat.EnderCount;
import io.github.rookietec9.EnderPlugin.commands.player.chat.EnderData;
import io.github.rookietec9.EnderPlugin.commands.player.chat.EnderFake;
import io.github.rookietec9.EnderPlugin.commands.player.chat.EnderHug;
import io.github.rookietec9.EnderPlugin.commands.player.chat.EnderRank;
import io.github.rookietec9.EnderPlugin.commands.player.damagable.EnderFinish;
import io.github.rookietec9.EnderPlugin.commands.player.damagable.EnderHeal;
import io.github.rookietec9.EnderPlugin.commands.player.damagable.EnderKill;
import io.github.rookietec9.EnderPlugin.commands.player.item.EnderClear;
import io.github.rookietec9.EnderPlugin.commands.player.item.EnderItem;
import io.github.rookietec9.EnderPlugin.commands.player.item.EnderRename;
import io.github.rookietec9.EnderPlugin.commands.player.management.EnderKick;
import io.github.rookietec9.EnderPlugin.commands.player.menu.EnderESG;
import io.github.rookietec9.EnderPlugin.commands.player.menu.EnderTelly;
import io.github.rookietec9.EnderPlugin.commands.player.other.EnderFly;
import io.github.rookietec9.EnderPlugin.commands.player.other.EnderTP;
import io.github.rookietec9.EnderPlugin.commands.player.other.EnderTwerk;
import io.github.rookietec9.EnderPlugin.commands.text.EnderChatClear;
import io.github.rookietec9.EnderPlugin.commands.text.EnderColors;
import io.github.rookietec9.EnderPlugin.commands.text.EnderList;
import io.github.rookietec9.EnderPlugin.commands.text.EnderSchedule;
import io.github.rookietec9.EnderPlugin.commands.text.EnderVersion;
import io.github.rookietec9.EnderPlugin.commands.text.EnderYT;
import io.github.rookietec9.EnderPlugin.event.inventory.AnvilRename;
import io.github.rookietec9.EnderPlugin.event.inventory.InventoryClick;
import io.github.rookietec9.EnderPlugin.event.player.EnderChatEggs;
import io.github.rookietec9.EnderPlugin.event.player.EnderFishingRod;
import io.github.rookietec9.EnderPlugin.event.player.PlayerDamage;
import io.github.rookietec9.EnderPlugin.event.player.PlayerDeath;
import io.github.rookietec9.EnderPlugin.event.player.PlayerJoin;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnderPlugin extends JavaPlugin {
    public EnderPlugin() {
    }

    public void onEnable() {
        this.registerCommands();
        this.getLogger().info("Registering void : registerEvents");
        this.getLogger().info(ChatColor.DARK_RED + "If you see this message, this means that events are registering. However, if you see no further messages, this" + "means that the events are not working. Please report this to the author.");
        this.registerEvents();
    }

    public void registerCommands() {
        this.getCommand("EnderSave").setExecutor(new EnderSave(this));
        this.getCommand("EnderReload").setExecutor(new EnderReload(this));
        this.getCommand("EWTP").setExecutor(new EnderWorldTP(this));
        this.getCommand("EnderAnomCast").setExecutor(new EnderAnomCast(this));
        this.getCommand("EnderAnon").setExecutor(new EnderAnon(this));
        this.getCommand("EnderCount").setExecutor(new EnderCount());
        this.getCommand("EnderData").setExecutor(new EnderData(this));
        this.getCommand("EnderFake").setExecutor(new EnderFake(this));
        this.getCommand("EnderHug").setExecutor(new EnderHug(this));
        this.getCommand("EnderRank").setExecutor(new EnderRank(this));
        this.getCommand("EnderFinish").setExecutor(new EnderFinish(this));
        this.getCommand("EnderHeal").setExecutor(new EnderHeal(this));
        this.getCommand("EnderKill").setExecutor(new EnderKill(this));
        this.getCommand("EnderClear").setExecutor(new EnderClear(this));
        this.getCommand("EnderItem").setExecutor(new EnderItem(this));
        this.getCommand("EnderKick").setExecutor(new EnderKick(this));
        this.getCommand("EnderESG").setExecutor(new EnderESG(this));
        this.getCommand("EnderTelly").setExecutor(new EnderTelly());
        this.getCommand("EnderFly").setExecutor(new EnderFly(this));
        this.getCommand("EnderTP").setExecutor(new EnderTP(this));
        this.getCommand("EnderSchedule").setExecutor(new EnderSchedule(this));
        this.getCommand("EnderTwerk").setExecutor(new EnderTwerk(this));
        this.getCommand("EnderYT").setExecutor(new EnderYT(this));
        this.getCommand("enderEnchant").setExecutor(new EnderEnchant());
        this.getCommand("EnderCraft").setExecutor(new EnderCraft(this));
        this.getCommand("EnderChatClear").setExecutor(new EnderChatClear());
        this.getCommand("EnderColors").setExecutor(new EnderColors(this));
        this.getCommand("EnderVersion").setExecutor(new EnderVersion(this));
        this.getCommand("Rename").setExecutor(new EnderRename(this));
        this.getCommand("ESGLevel").setExecutor(new ESGLevel(this));
        this.getCommand("EnderList").setExecutor(new EnderList(this));
        this.getCommand("EnderAnomCast").setExecutor(new EnderAnomCast(this));
    }

    public void registerEvents() {
        PluginManager pm = this.getServer().getPluginManager();
        this.getLogger().info("Registering Event : PlayerChat.class");
        pm.registerEvents(new EnderChatEggs(), this);
        this.getLogger().info("Registering Event : PlayerDeath.class");
        pm.registerEvents(new PlayerDeath(), this);
        this.getLogger().info("Registering Event : PlayerDamage.class");
        pm.registerEvents(new PlayerDamage(), this);
        this.getLogger().info("Registering Event : PlayerJoin.class");
        pm.registerEvents(new PlayerJoin(this), this);
        this.getLogger().info("Registering Event : InventoryClick.class");
        pm.registerEvents(new InventoryClick(), this);
        this.getLogger().info("Registering Event : PlayerInteract.class");
        pm.registerEvents(new EnderFishingRod(), this);
        this.getLogger().info("Registering Event : AnvilRename.class");
        pm.registerEvents(new AnvilRename(), this);
        this.getLogger().info("Registering ESG Event : PickClassOpenEvent");
        pm.registerEvents(new PickClassOpenEvent(), this);
        this.getLogger().info("Registering ESG Event : PickClassOpenEvent");
        pm.registerEvents(new PickClassPickEvent(), this);
    }

    public void onDisable() {
        this.getLogger().info("EnderPlugin by TEC9 has shut down. :D");
    }
}