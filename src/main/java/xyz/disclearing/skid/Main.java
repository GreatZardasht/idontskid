package xyz.disclearing.skid;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.disclearing.skid.Events.SkidEvent;
import xyz.disclearing.skid.commands.SkidCommand;

public class Main extends JavaPlugin{

    @Override
    public void onEnable(){
        // Loads Skid Command
        this.getCommand("skid").setExecutor(new SkidCommand());
        //Loads Event
        getServer().getPluginManager().registerEvents(new SkidEvent(),this);
        // Loads Config
        loadConfig();
    }

    /// this does nothing just loads the config and copy whats inside
    public void loadConfig(){
        getConfig().options().copyDefaults();
        saveConfig();
    }

}
