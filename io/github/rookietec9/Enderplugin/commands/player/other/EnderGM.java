package io.github.rookietec9.EnderPlugin.commands.player.other;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderGM implements CommandExecutor {
    private EnderPlugin plugin;
    String PlugMsg;
    String Error;
    String ConsoleNotAllowed;
    String PlayerNotAllowed;
    String BlockNotAllowed;
    String OnlyUser;
    String NoArgs;
    String MuchArgs;
    String NoPlayer;

    public EnderGM(EnderPlugin enderPlugin) {
        this.PlugMsg = ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message"));
        this.Error = this.PlugMsg + "§4Error: §c";
        this.ConsoleNotAllowed = this.PlugMsg + "Consoles cannot use this command.";
        this.PlayerNotAllowed = this.PlugMsg + "Players cannot use this command.";
        this.BlockNotAllowed = this.PlugMsg + "CommandBlocks cannot use this command";
        this.OnlyUser = this.PlugMsg + "Only users can run this command.";
        this.NoArgs = this.Error + "Not enough arguments.";
        this.MuchArgs = this.Error + "Too many arguments.";
        this.NoPlayer = this.Error + "The request player is offline";
        this.plugin = enderPlugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("EnderGM")) {
            Player target;
            if (args.length == 1) {
                if (!(args[0].equalsIgnoreCase("A") | args[0].equalsIgnoreCase("S") | args[0].equalsIgnoreCase("C") | args[0].equalsIgnoreCase("SP") | args[0].equalsIgnoreCase("0") | args[0].equalsIgnoreCase("1") | args[0].equalsIgnoreCase("2") | args[0].equalsIgnoreCase("3"))) {
                    sender.sendMessage("Please enter either A S C SP 0 1 2 3");
                    return true;
                }

                if (args[0].equalsIgnoreCase("A") | args[0].equalsIgnoreCase("S") | args[0].equalsIgnoreCase("C") | args[0].equalsIgnoreCase("SP") | args[0].equalsIgnoreCase("0") | args[0].equalsIgnoreCase("1") | args[0].equalsIgnoreCase("2") | args[0].equalsIgnoreCase("3")) {
                    target = (Player)sender;
                    if (args[0].equalsIgnoreCase("A") | args[0].equalsIgnoreCase("2")) {
                        target.setGameMode(GameMode.ADVENTURE);
                        target.sendMessage(this.PlugMsg + "Gamemode set to 2/A");
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("S") | args[0].equalsIgnoreCase("0")) {
                        target.setGameMode(GameMode.SURVIVAL);
                        target.sendMessage(this.PlugMsg + "Gamemode set to 0/S");
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("C") | args[0].equalsIgnoreCase("1")) {
                        target.setGameMode(GameMode.CREATIVE);
                        target.sendMessage(this.PlugMsg + "Gamemode set to 1/C");
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("SP") | args[0].equalsIgnoreCase("3")) {
                        target.setGameMode(GameMode.SPECTATOR);
                        target.sendMessage(this.PlugMsg + "Gamemode set to 3/SP");
                        return true;
                    }
                }

                return true;
            }

            if (args.length == 2) {
                target = this.plugin.getServer().getPlayer(args[0]);
                if (target == null) {
                    sender.sendMessage(this.NoPlayer);
                    return true;
                }

                if (!(args[1].equalsIgnoreCase("A") | args[1].equalsIgnoreCase("S") | args[1].equalsIgnoreCase("C") | args[1].equalsIgnoreCase("SP") | args[1].equalsIgnoreCase("0") | args[1].equalsIgnoreCase("1") | args[1].equalsIgnoreCase("2") | args[1].equalsIgnoreCase("3"))) {
                    sender.sendMessage(this.PlugMsg + "Please enter either A S C SP 0 1 2 3");
                    return true;
                }

                if (args[1].equalsIgnoreCase("A") | args[1].equalsIgnoreCase("S") | args[1].equalsIgnoreCase("C") | args[1].equalsIgnoreCase("SP") | args[1].equalsIgnoreCase("0") | args[1].equalsIgnoreCase("1") | args[1].equalsIgnoreCase("2") | args[1].equalsIgnoreCase("3")) {
                    if (args[1].equalsIgnoreCase("A") | args[1].equalsIgnoreCase("2")) {
                        target.setGameMode(GameMode.ADVENTURE);
                        target.sendMessage(this.PlugMsg + "Gamemode set to 2/A");
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("S") | args[1].equalsIgnoreCase("0")) {
                        target.setGameMode(GameMode.SURVIVAL);
                        target.sendMessage(this.PlugMsg + "Gamemode set to 0/S");
                        return true;
                    }

                    if (args[1].equalsIgnoreCase("C") | args[1].equalsIgnoreCase("1")) {
                        target.setGameMode(GameMode.CREATIVE);
                        target.sendMessage(this.PlugMsg + "Gamemode set to 1/C");
                        return true;
                    }

                    if (args[1].equalsIgnoreCase("SP") | args[1].equalsIgnoreCase("3")) {
                        target.setGameMode(GameMode.SPECTATOR);
                        target.sendMessage(this.PlugMsg + "Gamemode set to 3/SP");
                        return true;
                    }
                }
            }
        }

        return true;
    }
}