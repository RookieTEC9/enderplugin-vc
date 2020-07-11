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
                if (args.length == 0) {
                    p.sendMessage(ChatColor.RED + "You did not specify a nickname!");
                    return true;
                }

                if (args[0] == "1") {
                    sender.sendMessage("F");
                }

                String Mod = "";
                Mod = "&f[&cMOD&f]".substring(0, "&f[&cMOD&f]".length());
                p.sendMessage(ChatColor.GREEN + "You have changed your nickname to " + Mod);
                this.getConfig().set(p.getName(), Mod);
                this.saveConfig();
            }

            return true;
        }
    }
}