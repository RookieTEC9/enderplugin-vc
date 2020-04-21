package io.github.rookietec9.EnderPlugin;

import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EnderTelly implements CommandExecutor {
    public EnderTelly() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderTelly")) {
            Player Player = (Player)sender;
            Inventory inv = Bukkit.createInventory((InventoryHolder)null, 45, "Teleportation Device 2.0");
            ItemStack Booty = new ItemStack(Material.WOOD_SWORD);
            ItemMeta BootyMeta = Booty.getItemMeta();
            Booty.addUnsafeEnchantment(Enchantment.KNOCKBACK, 10);
            BootyMeta.setDisplayName(ChatColor.DARK_PURPLE + "Booty");
            ArrayList<String> lore = new ArrayList();
            lore.add(ChatColor.WHITE + "A bit of Parkour mixed with pvp.");
            BootyMeta.setLore(lore);
            inv.addItem(new ItemStack[]{Booty});
            Player.openInventory(inv);
            return true;
        } else {
            return false;
        }
    }
}