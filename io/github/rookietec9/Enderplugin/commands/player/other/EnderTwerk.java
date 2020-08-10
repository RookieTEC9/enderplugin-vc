package io.github.rookietec9.EnderPlugin.commands.player.other;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderTwerk implements CommandExecutor {
    private EnderPlugin Plugin;

    public EnderTwerk(EnderPlugin enderPlugin) {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderTwerk")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("Only Players can have fun!");
                return true;
            }

            Player player = (Player)sender;
            Double O = 0.0D;
            if (args[0] == "True") {
                O = 1.0D;
            }

            if (args[0] == "False") {
                O = 0.0D;
            }

            while(O == 1.0D) {
                player.setSneaking(true);
                player.setSneaking(false);
            }

            if (O == 0.0D) {
                player.setSneaking(false);
            }
        }

        return true;
    }
}