package io.github.rookietec9.EnderPlugin;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderTP implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderTP(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("EnderTP")) {
            if (args.length != 3) {
                sender.sendMessage(this.plugin.getConfig().getString("Plug Message") + ChatColor.DARK_RED + "Please name 3 co-ordinates.");
                return true;
            }

            if (!(sender instanceof Player)) {
                sender.sendMessage(this.plugin.getConfig().getString("Plug Message") + ChatColor.DARK_RED + "This command can only be run by a player.");
                return true;
            }

            Player PlayerSender = (Player)sender;
            Double X = Double.parseDouble(args[0]);
            Double Y = Double.parseDouble(args[1]);
            Double Z = Double.parseDouble(args[2]);
            Location Loc = new Location(PlayerSender.getWorld(), X, Y, Z);
            PlayerSender.teleport(Loc);
        }

        return true;
    }
}