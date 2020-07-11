package io.github.rookietec9.EnderPlugin.commands.player.item;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class EnderOld implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderOld(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderOld")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("NotPlayer")));
                return true;
            } else {
                Player playerSender = (Player)sender;
                ItemStack itemHand = playerSender.getItemInHand();
                if (itemHand.getType() == Material.DIAMOND_AXE) {
                    playerSender.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(16.0D);
                    playerSender.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(16.0D);
                    return true;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }
}