public class EnderData implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderData(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target = sender.getServer().getPlayer(args[0]);
        if (command.getName().equalsIgnoreCase("enderData")) {
            if (!sender.hasPermission("End.enderData")) {
                sender.sendMessage("Invalid permissions");
                return true;
            } else if (args.length != 1) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message") + args[1]) + ChatColor.DARK_RED + "One person at a time.");
                return true;
            } else if (target == null) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message") + args[1]) + ChatColor.DARK_RED + args[0] + "Player is not online.");
                return true;
            } else {
                String WalkSpeed = String.valueOf(target.getWalkSpeed());
                String AllowFlight = String.valueOf(target.getAllowFlight());
                String Adress = String.valueOf(target.getAddress());
                String TotalXP = String.valueOf(target.getTotalExperience());
                String FlySpeed = String.valueOf(target.getFlySpeed());
                String NickName = String.valueOf(target.getDisplayName());
                String FoodLevel = String.valueOf(target.getFoodLevel());
                String GetWorld = String.valueOf(target.getWorld());
                String Health = String.valueOf(target.getHealth());
                String MaxHealth = String.valueOf(target.getMaxHealth());
                String World = GetWorld.substring(16, GetWorld.length() - 1);
                sender.sendMessage(String.valueOf(ChatColor.translateAlternateColorCodes('&', this.plugin.getConfig().getString("Plug Message"))) + "Creating report log for " + args[0]);
                sender.sendMessage("Walk Speed: " + WalkSpeed);
                sender.sendMessage("Fly Speed: " + FlySpeed);
                sender.sendMessage("Health: " + Health + " / " + MaxHealth);
                sender.sendMessage("AllowFlight: " + AllowFlight);
                sender.sendMessage("XP:" + TotalXP);
                sender.sendMessage("IP: " + Adress);
                sender.sendMessage("Nickname: " + NickName);
                sender.sendMessage("World: " + World);
                sender.sendMessage("Hunger: " + FoodLevel);
                return true;
            }
        } else {
            return true;
        }
    }
}