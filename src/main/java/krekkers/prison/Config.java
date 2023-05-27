package krekkers.prison;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

public class Config {

    final FileConfiguration config;
    final FileConfiguration copConfig;
    final FileConfiguration cellConfig;
    //colors
    public ChatColor primary;
    public ChatColor secondary;
    public ChatColor gray;
    public ChatColor info;
    public ChatColor error;

    public Config(FileConfiguration config, FileConfiguration copConfig, FileConfiguration cellConfig){
        this.config = config;
        this.copConfig = copConfig;
        this.cellConfig = cellConfig;
        //colors
        this.primary = ChatColor.valueOf(config.getString("settings.colors.primary"));
        this.secondary = ChatColor.valueOf(config.getString("settings.colors.secondary"));
        this.gray = ChatColor.valueOf(config.getString("settings.colors.secondary"));
        this.info = ChatColor.valueOf(config.getString("settings.colors.info"));
        this.error = ChatColor.valueOf(config.getString("settings.colors.error"));
    }

    public FileConfiguration getConfig() {
        return config;
    }

    public FileConfiguration getCopConfig() {
        return copConfig;
    }


}
