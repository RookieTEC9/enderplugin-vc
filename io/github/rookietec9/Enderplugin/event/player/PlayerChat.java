package io.github.rookietec9.EnderPlugin.event.player;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class PlayerChat implements Listener {
    public PlayerChat() {
    }

    @EventHandler
    public void OnPlayerChat(AsyncPlayerChatEvent event) {
        Player sender = event.getPlayer();
        String Message = event.getMessage().toLowerCase();
        if (Message.contains("Rice")) {
            sender.sendTitle(ChatColor.DARK_RED + "Tasty", ChatColor.RED + "YUMMY");
        }

    }
}