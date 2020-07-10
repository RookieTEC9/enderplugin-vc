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
            Inventory inv = Bukkit.createInventory(null, 45, "Choose Your Kit");
            HashMap<Player, Double> hm = new HashMap();
            hm.put(Player, Double.valueOf(args[0]));
            ItemStack Booty = new ItemStack(Material.MONSTER_EGG, 1, (short)100);
            ItemMeta BootyMeta = Booty.getItemMeta();
            BootyMeta.setDisplayName(ChatColor.GOLD + "HorseTamer " + hm.get(Player.getName()));
            ArrayList<String> lore = new ArrayList();
            lore.add(ChatColor.GRAY + "A bit of Parkour mixed with pvp.");
            BootyMeta.setLore(lore);
            Booty.setItemMeta(BootyMeta);
            inv.addItem(new ItemStack[]{Booty});
            Player.openInventory(inv);
            return true;
        } else {
            return true;
        }
    }
}