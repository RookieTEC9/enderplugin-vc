package io.github.rookietec9.EnderPlugin.commands.text;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class EnderChatClear implements CommandExecutor {
    public EnderChatClear() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("enderChatClear")) {
            String[] CC;
            int var8;
            if (args.length == 0) {
                String[] CC = new String[]{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
                CC = CC;
                int var12 = CC.length;

                for(var8 = 0; var8 < var12; ++var8) {
                    String S = CC[var8];
                    Bukkit.broadcastMessage(S);
                }

                Bukkit.broadcastMessage("EnderClear.PlugMsgCleared Chat.");
                return true;
            }

            if (args.length == 1) {
                Player serv = Bukkit.getServer().getPlayer(args[1]);
                if (serv == null) {
                    sender.sendMessage(args[0] = " is offline.");
                    return true;
                }

                CC = new String[]{" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " "};
                String[] var7 = CC;
                var8 = CC.length;

                for(int var9 = 0; var9 < var8; ++var9) {
                    String S = var7[var9];
                    serv.sendMessage(S);
                }

                sender.sendMessage("Cleared" + args[1] + "'s chat");
                return true;
            }
        }

        return true;
    }
}