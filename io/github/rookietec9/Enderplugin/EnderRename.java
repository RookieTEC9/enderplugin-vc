package io.github.rookietec9.EnderPlugin;

import net.md_5.bungee.api.ChatColor;
import org.apache.commons.lang.StringUtils;
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
                sender.sendMessage("This command can only be run by a player.");
                return true;
            }

            if (args.length == 0) {
                sender.sendMessage("Please write a name");
                return true;
            }

            String Name = StringUtils.join(args, ' ', 0, args.length);
            Player player = (Player)sender;
            ItemStack Current = player.getItemInHand();
            ItemMeta CurrentMeta = Current.getItemMeta();
            CurrentMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', Name));
            if (Current.getType() == null) {
                sender.sendMessage("Please hold something");
            }

            Current.setItemMeta(CurrentMeta);
            sender.sendMessage("Renamed Item.");
        }

        return false;
    }
}