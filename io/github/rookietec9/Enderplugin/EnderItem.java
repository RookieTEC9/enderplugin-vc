package io.github.rookietec9.EnderPlugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class EnderItem implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderItem(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderItem")) {
            Player player = (Player)sender;
            PlayerInventory inv = player.getInventory();
            ItemStack Item = new ItemStack(Material.getMaterial(args[0].toUpperCase()), Integer.parseInt(args[1]));
            inv.addItem(new ItemStack[]{Item});
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + "Added Item.");
            return true;
        } else {
            return true;
        }
    }
}