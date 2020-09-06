package io.github.rookietec9.EnderPlugin.commands.player.chat;

import io.github.rookietec9.EnderPlugin.EnderPlugin;
import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderCount implements CommandExecutor {
    EnderPlugin plugin = null;

    public EnderCount() {
    }

    public void Ender(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderCount")) {
            Bukkit.broadcastMessage("5");

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException var12) {
                var12.printStackTrace();
            }

            Bukkit.broadcastMessage("4");

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException var11) {
                var11.printStackTrace();
            }

            Bukkit.broadcastMessage("3");

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException var10) {
                var10.printStackTrace();
            }

            Bukkit.broadcastMessage("2");

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException var9) {
                var9.printStackTrace();
            }

            Bukkit.broadcastMessage("1");

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException var8) {
                var8.printStackTrace();
            }

            Bukkit.broadcastMessage("GO");

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException var7) {
                var7.printStackTrace();
            }

            Iterator var5 = Bukkit.getServer().getOnlinePlayers().iterator();

            while(var5.hasNext()) {
                Player player1 = (Player)var5.next();
                player1.sendTitle("GO", "It starts now");
            }
        }

        return false;
    }
}