package xyz.disclearing.pp.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SkidCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] arguments) {
        sender.sendMessage(ChatColor.RED + "I am not a SkidCommand");
        return true;
    }
}