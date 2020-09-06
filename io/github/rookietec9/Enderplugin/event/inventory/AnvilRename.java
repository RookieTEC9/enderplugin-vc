package io.github.rookietec9.EnderPlugin.event.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.permissions.Permissible;

public class AnvilRename implements Listener {
    private String colors = "0123456789abcdefklmnor";

    public AnvilRename() {
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (!event.isCancelled()) {
            if (event.getInventory().getType() == InventoryType.ANVIL) {
                if (event.getSlotType() == SlotType.RESULT) {
                    ItemMeta meta = event.getCurrentItem().getItemMeta();
                    String name = this.translateColors(event.getWhoClicked(), meta.getDisplayName());
                    meta.setDisplayName(name);
                    event.getCurrentItem().setItemMeta(meta);
                }
            }
        }
    }

    private String translateColors(Permissible p, String text) {
        String coloredText = "";

        for(int i = 0; i < text.length(); ++i) {
            char c = text.charAt(i);
            boolean succsess = false;
            if (c == '&') {
                char color = text.charAt(i + 1);
                if (this.colors.contains(String.valueOf(color))) {
                    coloredText = coloredText + "§" + color;
                    succsess = true;
                    ++i;
                }
            }

            if (!succsess) {
                coloredText = coloredText + c;
            }
        }

        return coloredText;
    }
}