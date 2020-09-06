package io.github.rookietec9.EnderPlugin.commands.multiworld;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderWorldTP implements CommandExecutor {
    private EnderPlugin plugin;

    public EnderWorldTP(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String PlugMsg = ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message"));
        String Error = PlugMsg + "§4Error: §c";
        String ConsoleNotAllowed = PlugMsg + "Consoles cannot use this command.";
        String PlayerNotAllowed = PlugMsg + "Players cannot use this command.";
        String BlockNotAllowed = PlugMsg + "CommandBlocks cannot use this command";
        String OnlyUser = PlugMsg + "Only users can run this command.";
        String NoArgs = Error + "Not enough arguments.";
        String MuchArgs = Error + "Too many arguments.";
        String NoPlayer = Error + "The request player is offline";
        Player Args2;
        Location Loc;
        if (command.getName().equalsIgnoreCase("eWTP") && args.length == 1) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(OnlyUser);
                return true;
            } else {
                Args2 = (Player)sender;
                Loc = Bukkit.getWorld(args[0]).getSpawnLocation();
                World Woc = Bukkit.getWorld(args[0]);
                if (Loc == null) {
                    Args2.sendMessage(PlugMsg + "could not find that world.");
                    return true;
                } else {
                    Args2.teleport(Loc);
                    Args2.sendMessage(PlugMsg + "sent you to" + args[0]);
                    return true;
                }
            }
        } else if (args.length == 2) {
            Args2 = Bukkit.getServer().getPlayer(args[0]);
            Loc = Bukkit.getWorld(args[1]).getSpawnLocation();
            if (Loc == null) {
                Args2.sendMessage(PlugMsg + "could not find that world.");
                return true;
            } else {
                Args2.teleport(Loc);
                Args2.sendMessage(PlugMsg + "sent you to" + args[1]);
                return true;
            }
        } else {
            return true;
        }
    }
}