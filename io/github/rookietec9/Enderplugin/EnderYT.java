package io.github.rookietec9.EnderPlugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.CommandExecutor;

public class EnderYT implements CommandExecutor
{
    private final EnderPlugin plugin;
    
    public EnderYT(final EnderPlugin plugin) {
        this.plugin = plugin;
    }
    
    public boolean onCommand(final CommandSender sender, final Command command, final String label, final String[] args) {
        if (command.getName().equalsIgnoreCase("EnderYT")) {}
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.DARK_RED + "This command can only be run by a player.");
            return true;
        }
        sender.sendMessage(new StringBuilder().append(ChatColor.BOLD).append(ChatColor.RED).append("subscribe:").toString());
        sender.sendMessage(new StringBuilder().append(ChatColor.BOLD).append(ChatColor.WHITE).append("https://www.youtube.com/channel/UCPchALhSeAHEneiojMnNYEg?view_as=public").toString());
        return true;
    }
}