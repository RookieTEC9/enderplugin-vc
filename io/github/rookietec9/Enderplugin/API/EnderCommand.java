package io.github.rookietec9.EnderPlugin.API;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public interface EnderCommand {
    EnderPlugin plugin = null;
    String PlugMsg = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("Plug Message"));
    String Error = PlugMsg + "§4Error: §c";
    String ConsoleNotAllowed = PlugMsg + "Consoles cannot use this command.";
    String PlayerNotAllowed = PlugMsg + "Players cannot use this command.";
    String BlockNotAllowed = PlugMsg + "CommandBlocks cannot use this command";
    String OnlyUser = PlugMsg + "Only users can run this command.";
    String NoArgs = Error + "Not enough arguments.";
    String MuchArgs = Error + "Too many arguments.";
    String NoPlayer = Error + "The request player is offline";

    void Ender(EnderPlugin var1);

    boolean onCommand(CommandSender var1, Command var2, String[] var3);
}