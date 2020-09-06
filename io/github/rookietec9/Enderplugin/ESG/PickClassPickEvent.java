package io.github.rookietec9.EnderPlugin.ESG;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class PickClassPickEvent implements Listener {
    public PickClassPickEvent() {
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        Inventory inv = event.getInventory();
        if (inv.getTitle().equals("Choose Your Kit")) {
            if (event.getWhoClicked() instanceof Player) {
                Player player = (Player)event.getWhoClicked();
                ItemStack Item = event.getCurrentItem();
                if (Item.getType() == Material.RABBIT_FOOT) {
                    player.sendMessage("You choose kit §aRabbit Null ");
                    event.setCancelled(true);
                    player.closeInventory();
                } else if (Item.getType() == Material.BOW) {
                    player.sendMessage("You choose kit §cArcher Null ");
                    event.setCancelled(true);
                    player.closeInventory();
                } else {
                    event.setCancelled(true);
                    player.closeInventory();
                }
            }
        }
    }
}