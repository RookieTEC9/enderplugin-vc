package io.github.rookietec9.EnderPlugin.commands.player.chat;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderRank implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderRank(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player)sender;
        String string = player.getName();
        String customName = player.getDisplayName();
        if (command.getName().equalsIgnoreCase("EnderRank")) {
        }

        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + ChatColor.DARK_RED + "This command can only be run by a player.");
            return true;
        } else if (args.length == 0) {
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + "§4Error: §cNo rank provided.");
            return true;
        } else {
            if (!args[0].equalsIgnoreCase("Owner") && !args[0].equalsIgnoreCase("CO") && !args[0].equalsIgnoreCase("MEMBER")) {
                player.sendMessage("§4Error: §cTry OWNER CO or MEMBER");
            } else if (args[0].equalsIgnoreCase("Owner") || args[0].equalsIgnoreCase("CO") || args[0].equalsIgnoreCase("MEMBER")) {
                if (args[0].equalsIgnoreCase("OWNER")) {
                    player.setPlayerListName("§f[§e§lOWNER§r] " + string);
                    this.plugin.getConfig().set(sender.getName(), "&f[&e&lOWNER&r] " + sender.getName());
                    player.setCustomName("§§f[§e§lOWNER§r] " + customName);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + "Registered Rank.");
                    this.plugin.saveConfig();
                    this.plugin.reloadConfig();
                    return true;
                }

                if (args[0].equalsIgnoreCase("CO")) {
                    player.setPlayerListName("§f[§1§lCO§r] " + string);
                    this.plugin.getConfig().set(sender.getName(), "&r[&1&lCO&r] " + sender.getName());
                    player.setCustomName("§f[§1§lCO§r] " + customName);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + "Registered Rank.");
                    this.plugin.saveConfig();
                    this.plugin.reloadConfig();
                    return true;
                }

                if (args[0].equalsIgnoreCase("MEMBER")) {
                    List<String> Members = new ArrayList();
                    Members.add(String.valueOf(sender.getName()));
                    this.plugin.getConfig().set(sender.getName(), "&f[§7&lMEMBER&r] " + sender.getName());
                    player.setCustomName("§f[§7§lMEMBER§r] " + customName);
                    player.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + "Registered Rank.");
                    this.plugin.saveConfig();
                    this.plugin.reloadConfig();
                    return true;
                }

                return true;
            }

            return true;
        }
    }
}