package io.github.rookietec9.EnderPlugin.event.player;

import org.bukkit.ChatColor;
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
        if (Message.contains("rice")) {
            event.setCancelled(true);
            sender.sendMessage(ChatColor.DARK_RED + "Tasty");
        }

    }
}