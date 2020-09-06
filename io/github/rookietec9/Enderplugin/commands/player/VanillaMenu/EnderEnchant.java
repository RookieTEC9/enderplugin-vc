package io.github.rookietec9.EnderPlugin.commands.player.VanillaMenu;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderEnchant implements CommandExecutor {
    public EnderEnchant() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("EnderCommand.OnlyUser");
        }

        Player player = (Player)sender;
        player.openEnchanting((Location)null, true);
        return true;
    }
}