mport org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderHug implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderHug(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("EnderHug")) {
            ;
        }

        if (args.length != 1) {
            return true;
        } else {
            Player target = sender.getServer().getPlayer(args[0]);
            if (!(sender instanceof Player)) {
                sender.sendMessage(EnderPlugin.EnderPlugin + ChatColor.DARK_RED + "This command can only be run by a player.");
                return true;
            } else if (target == null) {
                sender.sendMessage(EnderPlugin.EnderPlugin + ChatColor.DARK_RED + args[0] + " is not currently cool.");
                return true;
            } else {
                target.sendMessage(EnderPlugin.EnderPlugin + ChatColor.LIGHT_PURPLE + sender.getName() + " Hugged you. Return the favor with /enderkill");
                sender.sendMessage(EnderPlugin.EnderPlugin + ChatColor.AQUA + args[0] + " was successfully hugged. :D");
                Bukkit.broadcastMessage(EnderPlugin.EnderPlugin + ChatColor.LIGHT_PURPLE + sender.getName() + " Hugged " + target.getName());
                return true;
            }
        }
    }
}