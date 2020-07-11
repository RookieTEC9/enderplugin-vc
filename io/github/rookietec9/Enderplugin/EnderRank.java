package io.github.rookietec9.EnderPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class EnderRank extends JavaPlugin implements CommandExecutor {
    private EnderPlugin plugin;

    public EnderRank(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only players can get nicknames!");
            return true;
        } else {
            Player p = (Player)sender;
            if (cmd.getName().equalsIgnoreCase("EnderRank")) {
                String value = p.getPlayerListName();
                p.setPlayerListName("Owner" + value);
                p.sendMessage("I");
            }

            return true;
        }
    }
}