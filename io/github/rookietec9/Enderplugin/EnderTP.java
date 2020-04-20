package io.github.rookietec9.EnderPlugin;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderTP implements CommandExecutor {
    public EnderTP(EnderPlugin var1) {
        throw new Error("Unresolved compilation problem: \n\tplugin cannot be resolved or is not a field\n");
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("EnderTP")) {
            if (args.length != 3) {
                sender.sendMessage(ChatColor.DARK_RED + "Please name 3 co-ordinates.");
                return true;
            }

            Player PlayerSender = (Player)sender;
            Double X = Double.parseDouble(args[0]);
            Location Loc = new Location(PlayerSender.getWorld(), X, 0.0D, 0.0D);
            PlayerSender.teleport(Loc);
        }

        return false;
    }
}