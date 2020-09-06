package io.github.rookietec9.EnderPlugin.commands.player.menu;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MonsterEggs;

public class EnderESG implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderESG(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderESG")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("NotPlayer")));
                return true;
            } else {
                Player Player = (Player)sender;
                Inventory inv = Bukkit.createInventory(null, 45, "Choose Your Kit");
                ItemStack HorseTamer = new ItemStack(Material.SADDLE);
                HorseTamer.setAmount(1);
                ItemMeta HorseMeta = HorseTamer.getItemMeta();
                HorseMeta.setDisplayName(ChatColor.GOLD + "HorseTamer " + this.plugin.getConfig().getString("Horse"));
                ArrayList<String> HorseLore = new ArrayList();
                HorseLore.add(ChatColor.GRAY + "One who rides the horse survives.");
                HorseMeta.setLore(HorseLore);
                HorseTamer.setItemMeta(HorseMeta);
                ItemStack Archer = new ItemStack(Material.BOW, 1);
                ItemMeta ArcherMeta = Archer.getItemMeta();
                ArcherMeta.setDisplayName(ChatColor.RED + "Archer " + this.plugin.getConfig().getString("Archer"));
                ArrayList<String> ArcherLore = new ArrayList();
                ArcherLore.add(ChatColor.GRAY + "Shotee!");
                ItemStack Rabbit = new ItemStack(Material.RABBIT_FOOT, 1);
                ItemMeta RabbitMeta = Rabbit.getItemMeta();
                RabbitMeta.setDisplayName(ChatColor.GREEN + "Rabbit " + this.plugin.getConfig().getString("Rabbit"));
                ArrayList<String> RabbitLore = new ArrayList();
                RabbitLore.add(ChatColor.GRAY + "Hop Hop Hop!");
                ItemStack Snow = new ItemStack(Material.SNOW_BALL, 1);
                ItemMeta SnowMeta = Snow.getItemMeta();
                SnowMeta.setDisplayName("§bSnowMan " + this.plugin.getConfig().getString("Snow"));
                ArrayList<String> SnowLore = new ArrayList();
                SnowLore.add(ChatColor.GRAY + "And then Jeff died from fall damage. All due to a snowball.");
                ItemStack Witch = new ItemStack(Material.BREWING_STAND_ITEM, 1);
                ItemMeta WitchMeta = Witch.getItemMeta();
                WitchMeta.setDisplayName("§8Witch " + this.plugin.getConfig().getString("Witch"));
                ArrayList<String> WitchLore = new ArrayList();
                WitchLore.add(ChatColor.GRAY + "Because nobody likes slowness.");
                ItemStack Assassin = new ItemStack(Material.DIAMOND_AXE, 1);
                ItemMeta AssassinMeta = Assassin.getItemMeta();
                AssassinMeta.setDisplayName(ChatColor.DARK_RED + "Assassin  " + this.plugin.getConfig().getString("Assasin"));
                ArrayList<String> AssassinLore = new ArrayList();
                AssassinLore.add(ChatColor.GRAY + "These gloves? Oh, thats just ketchup...");
                ItemStack Enderman = new ItemStack(Material.ENDER_PEARL, 1);
                ItemMeta EnderMeta = Enderman.getItemMeta();
                EnderMeta.setDisplayName(ChatColor.DARK_BLUE + "Enderman " + this.plugin.getConfig().getString("Enderman"));
                ArrayList<String> EnderLore = new ArrayList();
                EnderLore.add(ChatColor.GRAY + "So long.");
                ItemStack Armorer = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
                ItemMeta ArmorerMeta = Armorer.getItemMeta();
                ArmorerMeta.setDisplayName(ChatColor.DARK_PURPLE + "Armorer " + this.plugin.getConfig().getString("Armor"));
                ArrayList<String> ArmorerLore = new ArrayList();
                ArmorerLore.add(ChatColor.GRAY + "Better than a Tank!");
                ItemStack Ninja = new ItemStack(Material.IRON_SWORD, 1);
                ItemMeta NinjaMeta = Ninja.getItemMeta();
                NinjaMeta.setDisplayName(ChatColor.WHITE + "Ninja " + this.plugin.getConfig().getString("Ninja"));
                ArrayList<String> NinjaLore = new ArrayList();
                NinjaLore.add(ChatColor.GRAY + "Quick but silent. Unless in a Skype chat.");
                ItemStack Lava = (new MonsterEggs(383, (byte)62)).toItemStack();
                Lava.setAmount(1);
                ItemMeta LavaMeta = Lava.getItemMeta();
                LavaMeta.setDisplayName(ChatColor.DARK_RED + "Fury Slime " + this.plugin.getConfig().getString("Lava"));
                ArrayList<String> LavaLore = new ArrayList();
                LavaLore.add(ChatColor.GRAY + "Bouncy. Furious.");
                HorseMeta.setLore(HorseLore);
                HorseTamer.setItemMeta(HorseMeta);
                ArcherMeta.setLore(ArcherLore);
                Archer.setItemMeta(ArcherMeta);
                RabbitMeta.setLore(RabbitLore);
                Rabbit.setItemMeta(RabbitMeta);
                SnowMeta.setLore(SnowLore);
                Snow.setItemMeta(SnowMeta);
                WitchMeta.setLore(WitchLore);
                Witch.setItemMeta(WitchMeta);
                AssassinMeta.setLore(AssassinLore);
                Assassin.setItemMeta(AssassinMeta);
                EnderMeta.setLore(EnderLore);
                Enderman.setItemMeta(EnderMeta);
                ArmorerMeta.setLore(ArmorerLore);
                Armorer.setItemMeta(ArmorerMeta);
                NinjaMeta.setLore(NinjaLore);
                Ninja.setItemMeta(NinjaMeta);
                LavaMeta.setLore(LavaLore);
                Lava.setItemMeta(LavaMeta);
                inv.addItem(Rabbit);
                inv.addItem(Archer);
                inv.addItem(Snow);
                inv.addItem(Assassin);
                inv.addItem(Enderman);
                inv.addItem(Witch);
                inv.addItem(HorseTamer);
                inv.addItem(Armorer);
                inv.addItem(Ninja);
                inv.addItem(Lava);
                Player.openInventory(inv);
                return true;
            }
        } else {
            return true;
        }
    }
}