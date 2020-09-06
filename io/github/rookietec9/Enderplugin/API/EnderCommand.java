package io.github.rookietec9.EnderPlugin.API;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public abstract class EnderCommand {
    public static Exception notPlayer;
    protected static EnderPlugin plugin;
    protected static String PlugMsg;
    protected static String Error;
    protected static String ConsoleNotAllowed;
    protected static String PlayerNotAllowed;
    protected static String BlockNotAllowed;
    protected static String OnlyUser;
    protected static String NoArgs;
    protected static String MuchArgs;
    protected static String NoPlayer;

    public EnderCommand() {
    }

    public void Ender(EnderPlugin plugin) {
    }

    public abstract boolean onCommand(CommandSender var1, Command var2, String[] var3);

    protected Player getPlayer(Server server, String[] args, Player player) {
        return null;
    }

    static {
        PlugMsg = ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("Plug Message"));
        Error = PlugMsg + "§4Error: §c";
        ConsoleNotAllowed = PlugMsg + "Consoles cannot use this command.";
        PlayerNotAllowed = PlugMsg + "Players cannot use this command.";
        BlockNotAllowed = PlugMsg + "CommandBlocks cannot use this command";
        OnlyUser = PlugMsg + "Only users can run this command.";
        NoArgs = Error + "Not enough arguments.";
        MuchArgs = Error + "Too many arguments.";
        NoPlayer = Error + "The request player is offline";
    }
}