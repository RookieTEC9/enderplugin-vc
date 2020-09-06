package io.github.rookietec9.EnderPlugin.commands.player.menu;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import io.github.rookietec9.EnderPlugin.ESG.PickClass;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

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
                Player.openInventory(PickClass.inv);
                return true;
            }
        } else {
            return true;
        }
    }
}