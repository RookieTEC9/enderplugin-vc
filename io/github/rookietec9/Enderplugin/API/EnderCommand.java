package io.github.rookietec9.EnderPlugin.API;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public interface EnderCommand {
    EnderPlugin plugin = null;
    String PlugMsg = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("Plug Message"));
    String ConsoleNotAllowed = PlugMsg + "Consoles cannot use this command.";
    String PlayerNotAllowed = PlugMsg + "Players cannot use this command.";
    String BlockNotAllowed = PlugMsg + "CommandBlocks cannot use this command";
    String OnlyUser = PlugMsg + "Only users can run this command.";
    String NoArgs = PlugMsg + "Not enough arguments.";
    String MuchArgs = PlugMsg + "Too many arguments.";
    String NoPlayer = PlugMsg + "The request player is offline";

    void Ender(EnderPlugin var1);

    boolean onCommand(CommandSender var1, Command var2, String[] var3);
}