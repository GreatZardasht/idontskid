package xyz.disclearing.pp;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.disclearing.pp.commands.SkidCommand;

public class main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("skid").setExecutor((CommandExecutor)new SkidCommand());
    }


    @Override
    public void onDisable() {
    }
}
