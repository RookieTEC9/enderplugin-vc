package io.github.rookietec9.EnderPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderRank implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderRank(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("EnderRank")) {
        }

        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + ChatColor.DARK_RED + "This command can only be run by a player.");
            return true;
        } else {
            Bukkit.broadcastMessage("EH");
            Player player = (Player)sender;
            String string = player.getName();
            player.setPlayerListName("Testing" + string);
            return true;
        }
    }
}