package krekkers.prison;

import org.bukkit.configuration.file.FileConfiguration;

public class Config {

    final FileConfiguration config;
    final FileConfiguration copConfig;






    public Config(FileConfiguration config, FileConfiguration copConfig){
        this.config = config;
        this.copConfig = copConfig;

    }

    public FileConfiguration getConfig() {
        return config;
    }

    public FileConfiguration getCopConfig() {
        return copConfig;
    }
}
