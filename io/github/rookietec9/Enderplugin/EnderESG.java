package io.github.rookietec9.EnderPlugin;

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

public class EnderESG implements CommandExecutor {
    public EnderESG() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderESG")) {
            Player Player = (Player)sender;
            Inventory inv = Bukkit.createInventory((InventoryHolder)null, 45, "Choose Your Kit");
            HashMap<Player, Double> hm = new HashMap();
            hm.put(Player, Double.valueOf(args[0]));
            ItemStack HorseTamer = new ItemStack(Material.MONSTER_EGG, 1, (short)100);
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
            ItemStack Archer = new ItemStack(Material.BOW, 1, (short)100);
            ItemMeta ArcherMeta = Archer.getItemMeta();
            ArcherMeta.setDisplayName(ChatColor.RED + "Archer " + String.valueOf(hm.get(Player)).substring(0, String.valueOf(hm.get(Player)).length() - 2));
            ArrayList<String> ArcherLore = new ArrayList();
            ArcherLore.add(ChatColor.GRAY + "Shotee!");
            HorseMeta.setLore(HorseLore);
            HorseTamer.setItemMeta(HorseMeta);
            ArcherMeta.setLore(ArcherLore);
            Archer.setItemMeta(ArcherMeta);
            KnightMeta.setLore(KnightLore);
            Knight.setItemMeta(KnightMeta);
            inv.addItem(new ItemStack[]{HorseTamer});
            inv.addItem(new ItemStack[]{Knight});
            inv.addItem(new ItemStack[]{Archer});
            Player.openInventory(inv);
            return true;
        } else {
            return true;
        }
    }
}