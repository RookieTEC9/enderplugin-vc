package io.github.rookietec9.EnderPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderHeal implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderHeal(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player)sender;
        if (command.getName().equalsIgnoreCase("enderHeal")) {
            if (args.length == 0) {
                player.setHealth(20.0D);
                player.sendMessage("Healed");
                return true;
            }

            Player target = sender.getServer().getPlayer(args[0]);
            if (args.length > 1) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + ChatColor.DARK_RED + "WHO?");
            } else if (target == null) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + ChatColor.DARK_RED + args[0] + " is not currently cool.");
                return true;
            }
        }

        return true;
    }
}