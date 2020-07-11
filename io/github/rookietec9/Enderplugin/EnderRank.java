package io.github.rookietec9.EnderPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderRank implements CommandExecutor {
    private EnderPlugin plugin;

    public EnderRank(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("EnderRank")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + "This command can only be run by a player.");
                return true;
            } else {
                Player playerSender = (Player)sender;
                Player target = sender.getServer().getPlayer(args[0]);
                String Name = String.valueOf(playerSender.getDisplayName());
                String realName = String.valueOf(playerSender.getName());
                String Owner = "§f[§EOWNER§f] ";
                String RankCo = "§f[§cCO-OWNER§f] ";
                String RankMember = "§f[§7SCRUB§F] ";
                String ownerName = "";
                ownerName = Owner.substring(0, ownerName.length());
                String CoName = "";
                CoName = RankCo.substring(0, ownerName.length());
                String MemName = "";
                MemName = RankMember.substring(0, ownerName.length());
                if (args.length > 2) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + "Syntax: /enderRank User Level");
                    return true;
                } else if (!playerSender.isOp() && target != playerSender) {
                    playerSender.sendMessage("You cannot put a rank on this player.");
                    return true;
                } else if (args.length == 1) {
                    if (args[0].toUpperCase() == "OWNER") {
                        playerSender.setDisplayName(ownerName + Name);
                        playerSender.setPlayerListName(ownerName + realName);
                        return true;
                    } else if (args[0].toUpperCase() == "CO") {
                        playerSender.setDisplayName(CoName + Name);
                        playerSender.setPlayerListName(CoName + realName);
                        return true;
                    } else if (args[0].toUpperCase() == "MEMBER") {
                        playerSender.setDisplayName(MemName + Name);
                        playerSender.setPlayerListName(MemName + realName);
                        return true;
                    } else if (args[0].toUpperCase() == "MEMBER" && args[0] != "CO" && args[0] != "OWNER") {
                        return true;
                    } else {
                        sender.sendMessage("Please enter either " + ChatColor.YELLOW + "OWNER " + ChatColor.DARK_BLUE + "CO §7MEMBER");
                        return true;
                    }
                } else if (target == null) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + "Request Player is not online.");
                    return true;
                } else if (args[1].toUpperCase() == "OWNER") {
                    target.setDisplayName(ownerName + Name);
                    playerSender.setPlayerListName(ownerName + realName);
                    return true;
                } else if (args[1].toUpperCase() == "C0") {
                    target.setDisplayName(CoName + Name);
                    playerSender.setPlayerListName(CoName + realName);
                    return true;
                } else if (args[1].toUpperCase() == "MEMBER") {
                    target.setDisplayName(MemName + Name);
                    playerSender.setPlayerListName(MemName + realName);
                    return true;
                } else {
                    sender.sendMessage("Please enter either " + ChatColor.YELLOW + "OWNER " + ChatColor.DARK_BLUE + "CO §7MEMBER");
                    return true;
                }
            }
        } else {
            return true;
        }
    }
}