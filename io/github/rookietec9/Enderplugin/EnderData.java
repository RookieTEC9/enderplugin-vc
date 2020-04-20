package io.github.rookietec9.EnderPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderData implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderData(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target = sender.getServer().getPlayer(args[0]);
        if (command.getName().equalsIgnoreCase("enderData")) {
            if (!sender.hasPermission("End.enderData")) {
                sender.sendMessage("Invalid permissions");
                return true;
            } else if (args.length != 1) {
                sender.sendMessage(EnderPlugin.EnderPlugin + ChatColor.DARK_RED + "One person at a time.");
                return true;
            } else if (target == null) {
                sender.sendMessage(EnderPlugin.EnderPlugin + ChatColor.DARK_RED + args[0] + EnderPlugin.EnderOffline);
                return true;
            } else {
                String WalkSpeed = String.valueOf(target.getWalkSpeed());
                String AllowFlight = String.valueOf(target.getAllowFlight());
                String Adress = String.valueOf(target.getAddress());
                String TotalXP = String.valueOf(target.getTotalExperience());
                String BedLocation = String.valueOf(target.getBedSpawnLocation());
                String FirstPlayed = String.valueOf(target.getFirstPlayed());
                String FlySpeed = String.valueOf(target.getFlySpeed());
                String NickName = String.valueOf(target.getDisplayName());
                String FoodLevel = String.valueOf(target.getFoodLevel());
                String Health = String.valueOf(target.getHealth());
                String MaxHealth = String.valueOf(target.getMaxHealth());
                sender.sendMessage(EnderPlugin.EnderPlugin + "Creating report log for " + args[0]);
                sender.sendMessage("Walk Speed: " + WalkSpeed);
                sender.sendMessage("Fly Speed: " + FlySpeed);
                sender.sendMessage("Health: " + Health + " / " + MaxHealth);
                sender.sendMessage("AllowFlight: " + AllowFlight);
                sender.sendMessage("XP:" + TotalXP);
                sender.sendMessage("IP: " + Adress);
                sender.sendMessage("Spawn: " + BedLocation);
                sender.sendMessage("Nickname: " + NickName);
                sender.sendMessage("First Played: " + FirstPlayed);
                sender.sendMessage("Hunger:" + FoodLevel);
                return true;
            }
        } else {
            return true;
        }
    }
}