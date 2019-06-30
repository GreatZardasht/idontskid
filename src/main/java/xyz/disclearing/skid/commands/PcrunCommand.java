package xyz.disclearing.skid.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class PcrunCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        sender.sendMessage(ChatColor.RED + "I am not a SkidCommand");
        return false;
    }
}
