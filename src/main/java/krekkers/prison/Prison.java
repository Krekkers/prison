package krekkers.prison;

import krekkers.prison.command.admin.hologram.CreateHologramCommand;
import krekkers.prison.debugger.KrekksDebugger;
import krekkers.prison.event.ConnectEvent;
import krekkers.prison.event.Interact;
import krekkers.prison.event.Move;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public final class Prison extends JavaPlugin {

    public static Plugin PLUGIN;
    public PluginManager PLUGINMANAGER;
    private FileConfiguration defaultConfig = null;
    public static KrekksDebugger debugger = new KrekksDebugger();

    public static Config config;

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Launching prison");
        //plugin manager
        PLUGINMANAGER = Bukkit.getPluginManager();
        //config
        PLUGIN.saveDefaultConfig();
        defaultConfig = PLUGIN.getConfig();
        config = new Config(defaultConfig,defaultConfig,defaultConfig);
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
        //hologram Commands
        getCommand("holocreate").setExecutor(new CreateHologramCommand());
        getCommand("holopanic").setExecutor(new CreateHologramCommand());
        getCommand("holoaddline").setExecutor(new CreateHologramCommand());
        getCommand("holoremoveline").setExecutor(new CreateHologramCommand());
        //Cell Commands
        //Prison Commands
        //Guard Commands
    }

    public void registerEvents(){
        PLUGINMANAGER.registerEvents(new Interact(), this);
        PLUGINMANAGER.registerEvents(new Move(), this);
        PLUGINMANAGER.registerEvents(new ConnectEvent(), this);
    }

    public void copConfigInit(){
        Configuration configuration;
        configuration = YamlConfiguration.loadConfiguration(new File(getDataFolder(), "cops.yml"));
    }

    public void craftingRecipies(){
        /*
        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(this,"flyStew"), fsmanp);
        recipe.shape("   ", " X ", " Y ");
        recipe.setIngredient('X', Material.NETHERITE_SCRAP);
        recipe.setIngredient('Y', Material.MUSHROOM_STEW);

        Bukkit.addRecipe(recipe);
         */
    }




}
