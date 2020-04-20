public class EnderAnon implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderAnon(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player target = sender.getServer().getPlayer(args[0]);
        if (!command.getName().equalsIgnoreCase("enderAnon")) {
            return true;
        } else if (args.length <= 2) {
            sender.sendMessage(ChatColor.GOLD + "[ENDERPLUGIN PRE]" + ChatColor.DARK_RED + "Command syntax: /endermessage <user> message");
            return true;
        } else if (target == null) {
            sender.sendMessage(ChatColor.GOLD + "[ENDERPLUGIN PRE]" + ChatColor.DARK_RED + args[0] + " is not currently cool.");
            return true;
        } else {
            if (args.length >= 2) {
                for(int i = 0; i < args.length; ++i) {
                    sender.sendMessage(ChatColor.GOLD + "[ENDERPLUGIN PRE]" + args[i]);
                    target.sendMessage("You sent the message to " + sender.getName());
                    if (target == sender) {
                        Bukkit.broadcastMessage(ChatColor.DARK_BLUE + target.getName() + " Is so sad they must message themselves.");
                    } else {
                        sender.sendMessage(ChatColor.GOLD + "[ENDERPLUGIN PRE]" + args[0]);
                    }

                    target.sendMessage("You sent the message to " + sender.getName());
                    if (target == sender) {
                        Bukkit.broadcastMessage(ChatColor.GOLD + "[ENDERPLUGIN PRE]" + ChatColor.DARK_BLUE + target.getName() + " Is so sad they must message themselves.");
                    }
                }
            }

            return true;
        }
    }
}