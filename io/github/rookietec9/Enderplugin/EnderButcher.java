package io.github.rookietec9.EnderPlugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.LivingEntity;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EnderButcher implements CommandExecutor {
    private static final Object target = null;
    private final EnderPlugin plugin;

    public EnderButcher(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Object String = target;
        LivingEntity target = sender.getServer().getPlayer(args[0]);
        if (command.getName().equalsIgnoreCase("enderButcher")) {
            if (target == null) {
                sender.sendMessage(ChatColor.DARK_RED + args[0] + " is not currently cool.");
                return true;
            } else {
                if (String == target) {
                    target.addPotionEffect(this.PotionEffect(PotionEffectType.HARM, 500, 10));
                }

                sender.sendMessage(ChatColor.AQUA + args[0] + " " + "was successfully injured. :D");
                return true;
            }
        } else {
            return true;
        }
    }

    private PotionEffect PotionEffect(PotionEffectType harm, int i, int j) {
        Bukkit.broadcastMessage(ChatColor.DARK_AQUA + "Action found");
        return null;
    }
}
