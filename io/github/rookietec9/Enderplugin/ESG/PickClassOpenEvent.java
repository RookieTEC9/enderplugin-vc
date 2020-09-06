package io.github.rookietec9.EnderPlugin.ESG;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.meta.ItemMeta;

public class PickClassOpenEvent implements Listener {
    public PickClassOpenEvent() {
    }

    @EventHandler
    public void Open(InventoryOpenEvent event) {
        Inventory inv = event.getInventory();
        ItemMeta itemMeta = inv.getItem(0).getItemMeta();
        itemMeta.setDisplayName("[LOL]" + itemMeta.getDisplayName());
        inv.getItem(0).setItemMeta(itemMeta);
    }
}