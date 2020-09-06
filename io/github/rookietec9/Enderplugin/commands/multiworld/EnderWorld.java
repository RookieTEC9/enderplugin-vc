package io.github.rookietec9.EnderPlugin.commands.multiworld;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.WorldCreator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderWorld implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderWorld(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderWorld")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("Only player");
                return true;
            }

            Player player = (Player)sender;
            if (args.length == 0) {
                sender.sendMessage("Huh?");
                return true;
            }

            if (args.length >= 5) {
                sender.sendMessage("Syntax:");
                sender.sendMessage("/enderworld [tp] world");
                sender.sendMessage("/enderworld [create] name");
                return true;
            }

            if (args[0].equalsIgnoreCase("create")) {
                if (args.length == 1) {
                    if (args[1] == null) {
                        sender.sendMessage("Please specify a world name");
                    }

                    this.plugin.getServer().createWorld(new WorldCreator(args[0]));
                    return true;
                }

                if (args[0].equalsIgnoreCase("tp")) {
                    if (args.length > 2) {
                        player.sendMessage("/enderworld tp world");
                        return true;
                    }

                    if (Bukkit.getWorld(args[1]) == null) {
                        player.sendMessage("Insert a valid name.");
                        return true;
                    }

                    Location loc = Bukkit.getWorld(args[1]).getSpawnLocation();
                    player.teleport(loc);
                }
            }
        }

        return true;
    }
}