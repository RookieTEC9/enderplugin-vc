package io.github.rookietec9.EnderPlugin.event.inventory;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryClick implements Listener {
    public InventoryClick() {
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Inventory inv = event.getInventory();
        if (inv.getTitle().equals("Teleportation Device 2.0")) {
            if (event.getWhoClicked() instanceof Player) {
                Player player = (Player)event.getWhoClicked();
                ItemStack Item = event.getCurrentItem();
                if (Item.getType() == Material.WOOD_SWORD) {
                    player.teleport(Bukkit.getWorld("booty").getSpawnLocation());
                    event.setCancelled(true);
                    player.closeInventory();
                    player.getWorld().playEffect(player.getLocation(), Effect.COLOURED_DUST, 1);
                } else {
                    event.setCancelled(true);
                    player.closeInventory();
                }

            }
        }
    }
}