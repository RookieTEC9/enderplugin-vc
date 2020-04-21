public class EnderTelly implements CommandExecutor {
    public EnderTelly() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderTelly")) {
            Player Player = (Player)sender;
            Inventory inv = Bukkit.createInventory((InventoryHolder)null, 45, "Teleportation Device 2.0");
            ItemStack Booty = new ItemStack(Material.WOOD_SWORD);
            Booty.addUnsafeEnchantment(Enchantment.KNOCKBACK, 10);
            ItemMeta BootyMeta = Booty.getItemMeta();
            BootyMeta.setDisplayName(ChatColor.DARK_PURPLE + "Booty");
            ArrayList<String> lore = new ArrayList();
            lore.add(ChatColor.WHITE + "A bit of Parkour mixed with pvp.");
            BootyMeta.setLore(lore);
            Booty.setItemMeta(BootyMeta);
            inv.addItem(new ItemStack[]{Booty});
            Player.openInventory(inv);
            return true;
        } else {
            return false;
        }
    }
}