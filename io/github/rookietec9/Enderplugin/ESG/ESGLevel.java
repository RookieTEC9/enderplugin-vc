package io.github.rookietec9.EnderPlugin.ESG;

import io.github.rookietec9.EnderPlugin.API.EnderCommand;
import java.util.HashMap;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ESGLevel implements CommandExecutor {
    public static HashMap<Player, Double> hmRabbit = new HashMap();
    public static HashMap<Player, Double> hmArcher = new HashMap();
    public static HashMap<Player, Double> hmSnow = new HashMap();
    public static HashMap<Player, Double> hmAssasin = new HashMap();
    public static HashMap<Player, Double> hmEnderMan = new HashMap();
    public static HashMap<Player, Double> hmWitch = new HashMap();
    public static HashMap<Player, Double> hmHorse = new HashMap();
    public static HashMap<Player, Double> hmArmor = new HashMap();
    public static HashMap<Player, Double> hmNinja = new HashMap();
    public static HashMap<Player, Double> hmLava = new HashMap();
    public static HashMap<Player, Double> hmFarmer = new HashMap();
    public static HashMap<Player, Double> hmWolf = new HashMap();

    public ESGLevel() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            sender.sendMessage(EnderCommand.NoArgs);
            return true;
        } else {
            if (args.length == 2) {
                if (!(sender instanceof Player)) {
                    sender.sendMessage(EnderCommand.OnlyUser);
                    return true;
                }

                Player player = (Player)sender;
                if (!(args[0].equalsIgnoreCase("Rabbit") | args[0].equalsIgnoreCase("Archer") | args[0].equalsIgnoreCase("Snow") | args[0].equalsIgnoreCase("Assasin") | args[0].equalsIgnoreCase("Enderman") | args[0].equalsIgnoreCase("Witch") | args[0].equalsIgnoreCase("Horse") | args[0].equalsIgnoreCase("Armor") | args[0].equalsIgnoreCase("Ninja") | args[0].equalsIgnoreCase("Lava") | args[0].equalsIgnoreCase("Farmer") | args[0].equalsIgnoreCase("Wolf"))) {
                    sender.sendMessage(EnderCommand.Error + "Incorrect class.");
                }

                if (args[0].equalsIgnoreCase("Rabbit") | args[0].equalsIgnoreCase("Archer") | args[0].equalsIgnoreCase("Snow") | args[0].equalsIgnoreCase("Assasin") | args[0].equalsIgnoreCase("Enderman") | args[0].equalsIgnoreCase("Witch") | args[0].equalsIgnoreCase("Horse") | args[0].equalsIgnoreCase("Armor") | args[0].equalsIgnoreCase("Ninja") | args[0].equalsIgnoreCase("Lava") | args[0].equalsIgnoreCase("Farmer") | args[0].equalsIgnoreCase("Wolf")) {
                    if (args[0].equalsIgnoreCase("Rabbit")) {
                        hmRabbit.put(player, Double.parseDouble(args[1]));
                        player.sendMessage(EnderCommand.PlugMsg + "Set Rabbit to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Archer")) {
                        hmArcher.put(player, Double.parseDouble(args[1]));
                        player.sendMessage(EnderCommand.PlugMsg + "Set Archer to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Snow")) {
                        hmSnow.put(player, Double.parseDouble(args[1]));
                        player.sendMessage(EnderCommand.PlugMsg + "Set SnowMan to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Assasin")) {
                        hmAssasin.put(player, Double.parseDouble(args[1]));
                        player.sendMessage(EnderCommand.PlugMsg + "Set Assasin to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Enderman")) {
                        hmEnderMan.put(player, Double.parseDouble(args[1]));
                        player.sendMessage(EnderCommand.PlugMsg + "Set Enderman to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Witch")) {
                        hmWitch.put(player, Double.parseDouble(args[1]));
                        player.sendMessage(EnderCommand.PlugMsg + "Set Witch to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Horse")) {
                        hmHorse.put(player, Double.parseDouble(args[1]));
                        player.sendMessage(EnderCommand.PlugMsg + "Set HorseTamer to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Armor")) {
                        hmArmor.put(player, Double.parseDouble(args[1]));
                        player.sendMessage(EnderCommand.PlugMsg + "Set Armorer to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Ninja")) {
                        hmNinja.put(player, Double.parseDouble(args[1]));
                        player.sendMessage(EnderCommand.PlugMsg + "Set Ninja to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Lava")) {
                        hmLava.put(player, Double.parseDouble(args[1]));
                        player.sendMessage(EnderCommand.PlugMsg + "Set Ninja to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Famer")) {
                        hmFarmer.put(player, Double.parseDouble(args[1]));
                        player.sendMessage(EnderCommand.PlugMsg + "Set Farmer to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Wolf")) {
                        hmWolf.put(player, Double.parseDouble(args[1]));
                        player.sendMessage(EnderCommand.PlugMsg + "Set Wolf to" + args[1]);
                        return true;
                    }
                }
            }

            return true;
        }
    }
}