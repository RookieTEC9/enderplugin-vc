package io.github.rookietec9.EnderPlugin.ESG;

import java.util.ArrayList;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ESGInventory {
    static String menuTitle = "ESG MENU";
    static String menuBuy = "§aUpgrade kits";
    public static Inventory ESGMenu;

    public ESGInventory() {
    }

    static {
        ESGMenu = Bukkit.createInventory((InventoryHolder)null, 45, menuTitle);
        ItemStack buyMenu = new ItemStack(Material.EMERALD);
        ItemMeta buyMeta = buyMenu.getItemMeta();
        buyMeta.setDisplayName(menuBuy);
        ArrayList<String> buyLore = new ArrayList();
        String buyLoreString = "Buy new kits and upgrade existing ones.";
        buyLore.add(buyLoreString);
        buyMeta.setLore(buyLore);
        buyMenu.setItemMeta(buyMeta);
        ESGMenu.setItem(0, buyMenu);
        ESGMenu.setItem(0, buyMenu);
    }
}