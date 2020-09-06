package io.github.rookietec9.EnderPlugin.API;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public interface EnderUser extends Player {
    default void AFK(boolean enable) {
        enable = true;
        if (true) {
            Bukkit.broadcastMessage(this.getDisplayName() + " Is now [§7AFK§r]");
        } else {
            enable = false;
            if (false) {
                Bukkit.broadcastMessage(this.getDisplayName() + " Is not longer AFK");
            }
        }

    }

    default void Kick(String KickMessage) {
        this.kickPlayer(KickMessage);
    }

    default void getTotalXP() {
        this.getTotalExperience();
    }
}