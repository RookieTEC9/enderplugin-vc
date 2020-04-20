package io.github.rookietec9.EnderPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderData {
    public EnderData() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target = sender.getServer().getPlayer(args[0]);
        if (command.getName().equalsIgnoreCase("enderData")) {
            if (args.length != 1) {
                sender.sendMessage(EnderPlugin.EnderPlugin + ChatColor.DARK_RED + "One person at a time.");
                return true;
            } else if (target == null) {
                sender.sendMessage(EnderPlugin.EnderPlugin + ChatColor.DARK_RED + args[0] + " is not currently cool.");
                return true;
            } else {
                target.getWalkSpeed();
                target.getAllowFlight();
                target.getAddress();
                target.getTotalExperience();
                target.getBedSpawnLocation();
                target.getFirstPlayed();
                target.getFlySpeed();
                target.getDisplayName();
                target.getFoodLevel();
                target.getGameMode();
                target.getWalkSpeed();
                target.getHealth();
                target.getMaxHealth();
                sender.sendMessage(EnderPlugin.EnderPlugin + "Creating report log for " + args[0]);
                if (target == sender) {
                    Bukkit.broadcastMessage(EnderPlugin.EnderPlugin + ChatColor.DARK_BLUE + "Some loser attempted injury.");
                }

                return true;
            }
        } else {
            return true;
        }
    }
}