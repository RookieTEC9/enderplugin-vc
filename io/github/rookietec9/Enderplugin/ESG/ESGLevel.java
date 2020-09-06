package io.github.rookietec9.EnderPlugin.ESG;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import java.io.File;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class ESGLevel implements CommandExecutor {
    private final EnderPlugin plugin;

    public ESGLevel(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("EnderCommand.OnlyUser");
            return true;
        } else if (args.length == 0) {
            sender.sendMessage("EnderCommand.NoArgs");
            return true;
        } else {
            if (args.length == 2) {
                if (!(sender instanceof Player)) {
                    sender.sendMessage("EnderCommand.OnlyUser");
                    return true;
                }

                Player player = (Player)sender;
                if (!(args[0].equalsIgnoreCase("Rabbit") | args[0].equalsIgnoreCase("Archer") | args[0].equalsIgnoreCase("Snow") | args[0].equalsIgnoreCase("Assasin") | args[0].equalsIgnoreCase("Enderman") | args[0].equalsIgnoreCase("Witch") | args[0].equalsIgnoreCase("Horse") | args[0].equalsIgnoreCase("Armor") | args[0].equalsIgnoreCase("Ninja") | args[0].equalsIgnoreCase("Lava") | args[0].equalsIgnoreCase("Farmer") | args[0].equalsIgnoreCase("Wolf"))) {
                    sender.sendMessage("EnderCommand.ErrorIncorrect class.");
                }

                if (args[0].equalsIgnoreCase("Rabbit") | args[0].equalsIgnoreCase("Archer") | args[0].equalsIgnoreCase("Snow") | args[0].equalsIgnoreCase("Assasin") | args[0].equalsIgnoreCase("Enderman") | args[0].equalsIgnoreCase("Witch") | args[0].equalsIgnoreCase("Horse") | args[0].equalsIgnoreCase("Armor") | args[0].equalsIgnoreCase("Ninja") | args[0].equalsIgnoreCase("Lava") | args[0].equalsIgnoreCase("Farmer") | args[0].equalsIgnoreCase("Wolf")) {
                    String Con = "ESG " + player.getName();
                    FileConfiguration Config = YamlConfiguration.loadConfiguration(new File(this.plugin.getDataFolder(), Con));
                    if (Config == null) {
                        new File(this.plugin.getDataFolder(), Con);
                    }

                    Double.parseDouble(Config.getString(args[0], args[1]));
                    if (args[0].equalsIgnoreCase("Rabbit")) {
                        Config.set(args[0], args[1]);
                        player.sendMessage("EnderCommand.PlugMsgSet Rabbit to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Archer")) {
                        Config.set(args[0], args[1]);
                        player.sendMessage("EnderCommand.PlugMsgSet Archer to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Snow")) {
                        Config.set(args[0], args[1]);
                        player.sendMessage("EnderCommand.PlugMsgSet SnowMan to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Assasin")) {
                        Config.set(args[0], args[1]);
                        player.sendMessage("EnderCommand.PlugMsgSet Assasin to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Enderman")) {
                        Config.set(args[0], args[1]);
                        player.sendMessage("EnderCommand.PlugMsgSet Enderman to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Witch")) {
                        Config.set(args[0], args[1]);
                        player.sendMessage("EnderCommand.PlugMsgSet Witch to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Horse")) {
                        Config.set(args[0], args[1]);
                        player.sendMessage("EnderCommand.PlugMsgSet HorseTamer to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Armor")) {
                        Config.set(args[0], args[1]);
                        player.sendMessage("EnderCommand.PlugMsgSet Armorer to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Ninja")) {
                        Config.set(args[0], args[1]);
                        player.sendMessage("EnderCommand.PlugMsgSet Ninja to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Lava")) {
                        Config.set(args[0], args[1]);
                        player.sendMessage("EnderCommand.PlugMsgSet Ninja to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Farmer")) {
                        Config.set(args[0], args[1]);
                        player.sendMessage("EnderCommand.PlugMsgSet Farmer to" + args[1]);
                        return true;
                    }

                    if (args[0].equalsIgnoreCase("Wolf")) {
                        Config.set(args[0], args[1]);
                        player.sendMessage("EnderCommand.PlugMsgSet Wolf to" + args[1]);
                        return true;
                    }
                }
            }

            return true;
        }
    }
}