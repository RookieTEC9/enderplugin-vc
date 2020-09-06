package io.github.rookietec9.EnderPlugin.commands.player.item;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.PlayerInventory;

public class EnderClear implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderClear(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderClear")) {
            Player Sender = (Player)sender;
            PlayerInventory inv = Sender.getInventory();
            inv.clear();
            Sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + "Cleared Inventory");
            return true;
        } else {
            return true;
        }
    }
}