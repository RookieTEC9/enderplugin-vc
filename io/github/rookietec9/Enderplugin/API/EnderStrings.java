package io.github.rookietec9.EnderPlugin.API;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.ChatColor;

public class EnderStrings {
    private static EnderPlugin plugin;
    public static String PlugMsg;
    public static String Error;
    public static String ConsoleNotAllowed;
    public static String PlayerNotAllowed;
    public static String BlockNotAllowed;
    public static String OnlyUser;
    public static String NoArgs;
    public static String MuchArgs;
    public static String NoPlayer;

    public EnderStrings(EnderPlugin enderPlugin) {
        plugin = enderPlugin;
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