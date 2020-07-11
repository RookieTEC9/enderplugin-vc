package io.github.rookietec9.EnderPlugin.commands.text;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EnderColors implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderColors(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("EnderColors")) {
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + "§00 §11 §22 §33 §44 §55 §66 §77 §88 §99 §AA §BB §CC §DD §EE §FF §RR [RESET] §r§LBOLD §r§mm §r§nn §r§oo ");
            return true;
        } else {
            return false;
        }
    }
}