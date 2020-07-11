public class EnderVersion implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderVersion(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("EnderVersion")) {
        }

        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message")) + ChatColor.BOLD + "EnderPlugin");
        sender.sendMessage(ChatColor.BLUE + "Version Cycle:" + ChatColor.BOLD + " PRE");
        sender.sendMessage(ChatColor.DARK_BLUE + "Version:" + ChatColor.BOLD + this.plugin.getConfig().getString("Version"));
        sender.sendMessage(ChatColor.DARK_AQUA + "Compiled:" + ChatColor.BOLD + " June");
        return true;
    }
}