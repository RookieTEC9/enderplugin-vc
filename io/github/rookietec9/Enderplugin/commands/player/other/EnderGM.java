package io.github.rookietec9.EnderPlugin.commands.player.other;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import io.github.rookietec9.EnderPlugin.API.EnderCommand;
import io.github.rookietec9.EnderPlugin.API.EnderCommand.Static;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderGM extends EnderCommand {
    public EnderGM() {
    }

    public void Ender(EnderPlugin plugin) {
    }

    public boolean onCommand(CommandSender sender, Command command, String[] args) {
        if (command.getName().equalsIgnoreCase("EnderGM")) {
            Player target;
            if (args.length == 1) {
                if (!(args[0].equalsIgnoreCase("A") | args[0].equalsIgnoreCase("S") | args[0].equalsIgnoreCase("C") | args[0].equalsIgnoreCase("SP") | args[0].equalsIgnoreCase("0") | args[0].equalsIgnoreCase("1") | args[0].equalsIgnoreCase("2") | args[0].equalsIgnoreCase("3"))) {
                    sender.sendMessage(Static.PlugMsg + "Please enter either A S C SP 0 1 2 3");
                    return true;
                }

                if (args[0].equalsIgnoreCase("A") | args[0].equalsIgnoreCase("S") | args[0].equalsIgnoreCase("C") | args[0].equalsIgnoreCase("SP") | args[0].equalsIgnoreCase("0") | args[0].equalsIgnoreCase("1") | args[0].equalsIgnoreCase("2") | args[0].equalsIgnoreCase("3")) {
                    target = (Player)sender;
                    if (args[0].equalsIgnoreCase("A") | args[0].equalsIgnoreCase("2")) {
                        target.setGameMode(GameMode.ADVENTURE);
                        target.sendMessage(Static.PlugMsg + "Gamemode set to 2/A");
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("S") | args[0].equalsIgnoreCase("0")) {
                        target.setGameMode(GameMode.SURVIVAL);
                        target.sendMessage(Static.PlugMsg + "Gamemode set to 0/S");
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("C") | args[0].equalsIgnoreCase("1")) {
                        target.setGameMode(GameMode.CREATIVE);
                        target.sendMessage(Static.PlugMsg + "Gamemode set to 1/C");
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("SP") | args[0].equalsIgnoreCase("3")) {
                        target.setGameMode(GameMode.SPECTATOR);
                        target.sendMessage(Static.PlugMsg + "Gamemode set to 3/SP");
                        return true;
                    }
                }

                return true;
            }

            if (args.length == 2) {
                target = plugin.getServer().getPlayer(args[0]);
                if (target == null) {
                    sender.sendMessage(Static.NoPlayer);
                    return true;
                }

                if (!(args[1].equalsIgnoreCase("A") | args[1].equalsIgnoreCase("S") | args[1].equalsIgnoreCase("C") | args[1].equalsIgnoreCase("SP") | args[1].equalsIgnoreCase("0") | args[1].equalsIgnoreCase("1") | args[1].equalsIgnoreCase("2") | args[1].equalsIgnoreCase("3"))) {
                    sender.sendMessage(Static.PlugMsg + "Please enter either A S C SP 0 1 2 3");
                    return true;
                }

                if (args[1].equalsIgnoreCase("A") | args[1].equalsIgnoreCase("S") | args[1].equalsIgnoreCase("C") | args[1].equalsIgnoreCase("SP") | args[1].equalsIgnoreCase("0") | args[1].equalsIgnoreCase("1") | args[1].equalsIgnoreCase("2") | args[1].equalsIgnoreCase("3")) {
                    if (args[1].equalsIgnoreCase("A") | args[1].equalsIgnoreCase("2")) {
                        target.setGameMode(GameMode.ADVENTURE);
                        target.sendMessage(Static.PlugMsg + "Gamemode set to 2/A");
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("S") | args[1].equalsIgnoreCase("0")) {
                        target.setGameMode(GameMode.SURVIVAL);
                        target.sendMessage(Static.PlugMsg + "Gamemode set to 0/S");
                        return true;
                    }

                    if (args[1].equalsIgnoreCase("C") | args[1].equalsIgnoreCase("1")) {
                        target.setGameMode(GameMode.CREATIVE);
                        target.sendMessage(Static.PlugMsg + "Gamemode set to 1/C");
                        return true;
                    }

                    if (args[1].equalsIgnoreCase("SP") | args[1].equalsIgnoreCase("3")) {
                        target.setGameMode(GameMode.SPECTATOR);
                        target.sendMessage(Static.PlugMsg + "Gamemode set to 3/SP");
                        return true;
                    }
                }
            }
        }

        return true;
    }
}