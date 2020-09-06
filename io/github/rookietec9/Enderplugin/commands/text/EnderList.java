package io.github.rookietec9.EnderPlugin.commands.text;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import java.util.Iterator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderList implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderList(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderList")) {
            sender.sendMessage("Max Players: " + String.valueOf(this.plugin.getServer().getMaxPlayers()));
            Iterator var5 = this.plugin.getServer().getOnlinePlayers().iterator();

            while(var5.hasNext()) {
                Player s = (Player)var5.next();
                sender.sendMessage("Online Players:" + s.getName());
            }
        }

        return true;
    }
}