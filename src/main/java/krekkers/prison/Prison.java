package krekkers.prison;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Prison extends JavaPlugin {

    public static Plugin PLUGIN;
    public PluginManager PLUGINMANAGER;
    private FileConfiguration defaultConfig = null;

    public static Config config;

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Launching prison");
        //plugin manager
        PLUGINMANAGER = Bukkit.getPluginManager();
        //config
        PLUGIN.saveDefaultConfig();
        defaultConfig = PLUGIN.getConfig();
        config = new Config(defaultConfig,defaultConfig);
        //register commands and events
        registerCommands();
        registerEvents();
        //other stuff
    }
    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Disabling prison");
    }

    public void registerCommands(){

    }

    public void registerEvents(){

    }


}
