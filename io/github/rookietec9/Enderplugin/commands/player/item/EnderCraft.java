package io.github.rookietec9.EnderPlugin.commands.player.item;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderCraft implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderCraft(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player Target = (Player)sender;
        Target.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + "Opening Crafting Table...");
        Target.openWorkbench((Location)null, true);
        return true;
    }
}