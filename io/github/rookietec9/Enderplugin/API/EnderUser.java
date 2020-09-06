package io.github.rookietec9.EnderPlugin.API;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface EnderUser extends Player {
    default void AFK(boolean enable) {
        this.AFK(enable);
    }

    default void Kick(String KickMessage) {
        this.kickPlayer(KickMessage);
    }

    default void getTotalXP() {
        this.getTotalExperience();
    }

    default void Bann(String BannMessage) {
        this.Bann(BannMessage);
    }

    default void Kill() {
        this.setHealth(0.0D);
    }

    default void Heal() {
        this.setHealth(this.getMaxHealth());
    }

    default void FinishOff() {
        this.setHealth(1.0D);
    }

    default String getDisplayName() {
        return this.getName();
    }

    default void setTabName(String Name) {
        this.setPlayerListName(Name);
    }

    default void setCompassLoc(Location loc) {
        this.setCompassTarget(loc);
    }

    default void sudo(String command) {
        this.performCommand(command);
    }

    default void commpasEntityTarget(Player player) {
        this.setCompassTarget(player.getLocation());
    }
}