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
            Iterator var5 = Bukkit.getServer().getOnlinePlayers().iterator();

            while(var5.hasNext()) {
                Player five = (Player)var5.next();
                five.sendTitle("5", "Its starting... Get Ready");
                five.sendMessage("[5] seconds until start. ");

                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException var15) {
                    var15.printStackTrace();
                }

                Iterator var7 = Bukkit.getServer().getOnlinePlayers().iterator();

                while(var7.hasNext()) {
                    Player four = (Player)var7.next();
                    four.sendTitle("4", "Its starting... Get Ready");
                    four.sendMessage("[4] seconds until start. ");

                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException var14) {
                        var14.printStackTrace();
                    }

                    Iterator var9 = Bukkit.getServer().getOnlinePlayers().iterator();

                    Player player;
                    while(var9.hasNext()) {
                        player = (Player)var9.next();
                        player.sendTitle("3", "Its starting... Get Ready");
                        player.sendMessage("[3] seconds until start. ");
                    }

                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException var13) {
                        var13.printStackTrace();
                    }

                    var9 = Bukkit.getServer().getOnlinePlayers().iterator();

                    while(var9.hasNext()) {
                        player = (Player)var9.next();
                        player.sendTitle("2", "Its starting... Get Ready");
                        player.sendMessage("[2] seconds until start. ");
                    }

                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException var12) {
                        var12.printStackTrace();
                    }

                    var9 = Bukkit.getServer().getOnlinePlayers().iterator();

                    while(var9.hasNext()) {
                        player = (Player)var9.next();
                        player.sendTitle("1", "Its starting... Get Ready");
                        player.sendMessage("[1] seconds until start. ");
                    }

                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException var11) {
                        var11.printStackTrace();
                    }

                    var9 = Bukkit.getServer().getOnlinePlayers().iterator();

                    while(var9.hasNext()) {
                        player = (Player)var9.next();
                        player.sendTitle("GO", "It starts now");
                        player.sendMessage("What are you waiting for?");
                    }
                }
            }
        }

        return true;
    }
}