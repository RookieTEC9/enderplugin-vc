package io.github.rookietec9.EnderPlugin;

import net.md_5.bungee.api.ChatColor;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EnderRename implements CommandExecutor {
    private EnderPlugin plugin;

    public EnderRename(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderRename")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + "This command can only be run by a player.");
                return true;
            }

            if (args.length == 0) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + "Please write a name");
                return true;
            }

            String Name = StringUtils.join(args, ' ', 0, args.length);
            Player player = (Player)sender;
            ItemStack Current = player.getItemInHand();
            if (Current.getType() == Material.AIR) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + "Please hold something");
                return true;
            }

            ItemMeta CurrentMeta = Current.getItemMeta();
            CurrentMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', Name));
            Current.setItemMeta(CurrentMeta);
            sender.sendMessage("Renamed Item.");
        }

        return false;
    }
}