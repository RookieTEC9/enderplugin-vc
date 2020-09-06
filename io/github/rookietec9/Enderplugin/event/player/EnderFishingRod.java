package io.github.rookietec9.EnderPlugin.event.player;

import java.util.Set;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class EnderFishingRod implements Listener {
    public EnderFishingRod() {
    }

    @EventHandler
    public void onPlayerInteractBlock(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (player.getItemInHand().getType() == Material.FISHING_ROD) {
            player.getWorld().strikeLightning(player.getTargetBlock((Set)null, 200).getLocation());
            player.sendMessage(":-D");
        }

    }
}