package io.github.rookietec9.EnderPlugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EnderLog implements CommandExecutor {
    private final EnderPlugin plugin;

    public EnderLog(EnderPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("EnderVersion")) {
            ;
        }

        sender.sendMessage("Do you want to view the full list (l) or (not yet) pick a verision (p) ?");
        sender.sendMessage("Do /enderlog l-1 for the first page, 1-2 for second and on");
        sender.sendMessage(ChatColor.MAGIC + "To pick a version, type P-002 for 0.0.2, P-003 for 0.0.3 and onwards");
        if (String.valueOf(args[0]) == "l-1") {
            sender.sendMessage(ChatColor.BLUE + "Versions 0.0.2 to 0.1.0" + "PRE 0.0.2 ---- 4/01/16 09:40PM ----" + "PRE 0.0.3 ---- 4/03/16 04:40PM ----" + "PRE 0.0.4 ---- 4/03/16 11:13PM ----" + "PRE 0.0.5 ---- 4/08/16 05:51PM ----" + "PRE 0.0.6 ---- 4/08/16 10:04PM ----" + "PRE 0.0.7 ---- 5/29/16 12:06PM ----" + "PRE 0.0.8 ---- 6/11/16 06:47PM ----" + "PRE 0.0.9 ---- X/XX/XX XX:XXXX ----" + "PRE 0.1.0 ---- 6/11/16 10:41PM ----" + "To view the next page, type /enderlog l-2");
        }

        if (String.valueOf(args[0]) == "l-2") {
            sender.sendMessage(ChatColor.BLUE + "Versions 0.1.1 to 0.2.0" + "PRE 0.1.1 ---- 6/11/16 10:46PM ----" + "PRE 0.1.2 ---- 6/11/16 10:49PM ----" + "PRE 0.1.3 ---- 6/11/16 10:53PM ----" + "PRE 0.1.4 ---- 6/11/16 11:07PM ----" + "PRE 0.1.5 ---- 6/11/16 11:15PM ----" + "PRE 0.1.6 ---- 6/13/16 07:05PM ----" + "PRE 0.1.7 ---- 6/13/16 09:03PM ----" + "PRE 0.1.8 ---- 6/13/16 10:33PM ----" + "PRE 0.1.9 ---- 6/13/16 10:39PM ----" + "PRE 0.2.0 ---- 6/13/16 10:57PM ----" + "To view the next page, type /enderlog l-3");
        }

        if (String.valueOf(args[0]) == "l-3") {
            sender.sendMessage("PRE 0.2.1 ---- 6/13/16 11:18PM ----PRE 0.2.2 ---- 6/13/16 11:23PM ----PRE 0.2.3 ---- 6/13/16 11:34PM ----PRE 0.2.4 ---- 6/13/16 11:42PM ----PRE 0.2.5 ---- 6/14/16 05:24PM ----");
        }

        return true;
    }
}