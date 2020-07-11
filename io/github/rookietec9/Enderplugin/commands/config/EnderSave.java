package io.github.rookietec9.EnderPlugin.commands.config;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import io.github.rookietec9.EnderPlugin.Entities.CustomSkeleton;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_9_R2.CraftWorld;
import org.bukkit.entity.Player;

public class EnderSave implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderSave(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("EnderSave")) {
            this.plugin.saveConfig();
            Player player = (Player)sender;
            Location loc = player.getLocation();
            CustomSkeleton e = new CustomSkeleton((World)((CraftWorld)player.getWorld()).getHandle());
            e.setLocation((double)loc.getBlockX() + 0.5D, loc.getY(), (double)loc.getBlockZ() + 0.5D, loc.getYaw(), loc.getPitch());
            ((CraftWorld)player.getWorld()).getHandle().addEntity(e);
            return true;
        } else {
            return true;
        }
    }
}