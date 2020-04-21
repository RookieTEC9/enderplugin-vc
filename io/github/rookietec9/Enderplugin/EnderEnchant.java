package io.github.rookietec9.EnderPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class EnderEnchant implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderEnchant(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderEnchant")) {
            Player player = (Player)sender;
            PlayerInventory inv = player.getInventory();
            ItemStack Item = new ItemStack(inv.getHeldItemSlot());
            if (args[0] == "Sharpness") {
                Item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, Integer.parseInt(args[2]));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + "Enchanted Item.");
            }

            return true;
        } else {
            return true;
        }
    }
}