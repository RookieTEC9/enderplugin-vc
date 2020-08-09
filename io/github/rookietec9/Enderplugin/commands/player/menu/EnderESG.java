package io.github.rookietec9.EnderPlugin.commands.player.menu;

import java.util.ArrayList;
import java.util.HashMap;
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
    public EnderESG() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderESG")) {
            Player Player = (Player)sender;
            Inventory inv = Bukkit.createInventory((InventoryHolder)null, 45, "Choose Your Kit");
            HashMap<Player, Double> hm = new HashMap();
            hm.put(Player, Double.valueOf(args[0]));
            ItemStack HorseTamer = (new MonsterEggs(383, (byte)100)).toItemStack();
            ItemMeta HorseMeta = HorseTamer.getItemMeta();
            HorseMeta.setDisplayName(ChatColor.GOLD + "HorseTamer " + String.valueOf(hm.get(Player)).substring(0, String.valueOf(hm.get(Player)).length() - 2));
            ArrayList<String> HorseLore = new ArrayList();
            HorseLore.add(ChatColor.GRAY + "One who rides the horse survives.");
            HorseMeta.setLore(HorseLore);
            HorseTamer.setItemMeta(HorseMeta);
            ItemStack Knight = new ItemStack(Material.SHIELD);
            ItemMeta KnightMeta = Knight.getItemMeta();
            KnightMeta.setDisplayName("§9Knight " + String.valueOf(hm.get(Player)).substring(0, String.valueOf(hm.get(Player)).length() - 2));
            ArrayList<String> KnightLore = new ArrayList();
            KnightLore.add(ChatColor.GRAY + "Brave and strong until the end.");
            ItemStack Archer = new ItemStack(Material.BOW, 1);
            ItemMeta ArcherMeta = Archer.getItemMeta();
            ArcherMeta.setDisplayName(ChatColor.RED + "Archer " + String.valueOf(hm.get(Player)).substring(0, String.valueOf(hm.get(Player)).length() - 2));
            ArrayList<String> ArcherLore = new ArrayList();
            ArcherLore.add(ChatColor.GRAY + "Shotee!");
            ItemStack Rabbit = new ItemStack(Material.RABBIT_FOOT, 1);
            ItemMeta RabbitMeta = Rabbit.getItemMeta();
            RabbitMeta.setDisplayName(ChatColor.GREEN + "Rabbit " + String.valueOf(hm.get(Player)).substring(0, String.valueOf(hm.get(Player)).length() - 2));
            ArrayList<String> RabbitLore = new ArrayList();
            RabbitLore.add(ChatColor.GRAY + "Hop Hop Hop!");
            ItemStack Snow = new ItemStack(Material.SNOW_BALL, 1);
            ItemMeta SnowMeta = Snow.getItemMeta();
            SnowMeta.setDisplayName("§bSnowMan " + String.valueOf(hm.get(Player)).substring(0, String.valueOf(hm.get(Player)).length() - 2));
            ArrayList<String> SnowLore = new ArrayList();
            SnowLore.add(ChatColor.GRAY + "And then Jeff died from fall damage. All due to a snowball.");
            ItemStack Witch = new ItemStack(Material.BREWING_STAND_ITEM, 1);
            ItemMeta WitchMeta = Witch.getItemMeta();
            WitchMeta.setDisplayName("§8Witch " + String.valueOf(hm.get(Player)).substring(0, String.valueOf(hm.get(Player)).length() - 2));
            ArrayList<String> WitchLore = new ArrayList();
            WitchLore.add(ChatColor.GRAY + "Because nobody likes slowness.");
            ItemStack Assassin = new ItemStack(Material.DIAMOND_AXE, 1);
            ItemMeta AssassinMeta = Assassin.getItemMeta();
            AssassinMeta.setDisplayName(ChatColor.DARK_RED + "Assassin  " + String.valueOf(hm.get(Player)).substring(0, String.valueOf(hm.get(Player)).length() - 2));
            ArrayList<String> AssassinLore = new ArrayList();
            AssassinLore.add(ChatColor.GRAY + "These gloves? Oh, thats just ketchup...");
            ItemStack Enderman = new ItemStack(Material.ENDER_PEARL, 1);
            ItemMeta EnderMeta = Enderman.getItemMeta();
            EnderMeta.setDisplayName(ChatColor.DARK_BLUE + "Enderman " + String.valueOf(hm.get(Player)).substring(0, String.valueOf(hm.get(Player)).length() - 2));
            ArrayList<String> EnderLore = new ArrayList();
            EnderLore.add(ChatColor.GRAY + "So long.");
            ItemStack Armorer = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
            ItemMeta ArmorerMeta = Armorer.getItemMeta();
            ArmorerMeta.setDisplayName(ChatColor.DARK_PURPLE + "Armorer " + String.valueOf(hm.get(Player)).substring(0, String.valueOf(hm.get(Player)).length() - 2));
            ArrayList<String> ArmorerLore = new ArrayList();
            ArmorerLore.add(ChatColor.GRAY + "Better than a Tank!");
            ItemStack Ninja = new ItemStack(Material.IRON_SWORD, 1);
            ItemMeta NinjaMeta = Ninja.getItemMeta();
            NinjaMeta.setDisplayName(ChatColor.WHITE + "Ninja " + String.valueOf(hm.get(Player)).substring(0, String.valueOf(hm.get(Player)).length() - 2));
            ArrayList<String> NinjaLore = new ArrayList();
            NinjaLore.add(ChatColor.GRAY + "Quick but silent. Unless in a Skype chat.");
            ItemStack Lava = (new MonsterEggs(62)).toItemStack();
            ItemMeta LavaMeta = Lava.getItemMeta();
            LavaMeta.setDisplayName(ChatColor.DARK_RED + "Fury Slime " + String.valueOf(hm.get(Player)).substring(0, String.valueOf(hm.get(Player)).length() - 2));
            ArrayList<String> LavaLore = new ArrayList();
            LavaLore.add(ChatColor.GRAY + "Bouncy. Fury.");
            HorseMeta.setLore(HorseLore);
            HorseTamer.setItemMeta(HorseMeta);
            ArcherMeta.setLore(ArcherLore);
            Archer.setItemMeta(ArcherMeta);
            KnightMeta.setLore(KnightLore);
            Knight.setItemMeta(KnightMeta);
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
            inv.addItem(Knight);
            inv.addItem(Armorer);
            inv.addItem(Ninja);
            inv.addItem(Lava);
            Player.openInventory(inv);
            return true;
        } else {
            return true;
        }
    }
}