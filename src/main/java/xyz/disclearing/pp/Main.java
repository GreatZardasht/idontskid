package xyz.disclearing.pp;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.disclearing.pp.commands.SkidCommand;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("skid").setExecutor(new SkidCommand());
    }
}
