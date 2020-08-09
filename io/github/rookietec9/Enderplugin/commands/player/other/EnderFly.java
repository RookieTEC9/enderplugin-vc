package io.github.rookietec9.EnderPlugin.commands.player.other;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.ChatColor;
import org.bukkit.block.CommandBlock;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderFly implements CommandExecutor {
    private EnderPlugin plugin;

    public EnderFly(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderFly")) {
            if (sender instanceof CommandBlock) {
                sender.sendMessage("Up and Up and away!");
                return true;
            }

            if (!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("NotPlayer")));
                return true;
            }

            Player player = (Player)sender;
            if (args.length >= 2) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + ChatColor.RED + "Syntax: ");
            }

            if (args.length == 0) {
                if (player.getAllowFlight()) {
                    player.setAllowFlight(false);
                }

                if (!player.getAllowFlight()) {
                    player.setAllowFlight(true);
                }
            }

            if (args.length == 1) {
                if (args[1] == "on") {
                    player.setAllowFlight(true);
                }

                if (args[1] == "off") {
                    player.setAllowFlight(false);
                }

                return true;
            }

            if (args.length == 2) {
                Player target = sender.getServer().getPlayer(args[1]);
                if (target == null) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + "Requested player is not online.");
                    return true;
                }

                if (args[2] == "on") {
                    player.setAllowFlight(true);
                }

                if (args[2] == "off") {
                    player.setAllowFlight(false);
                }

                return true;
            }
        }

        return true;
    }
}