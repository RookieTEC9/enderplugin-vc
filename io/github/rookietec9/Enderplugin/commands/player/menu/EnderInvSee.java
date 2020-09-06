package io.github.rookietec9.EnderPlugin.commands.player.menu;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EnderInvSee implements CommandExecutor {
    public EnderInvSee() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderInvSee")) {
        }

        return true;
    }
}