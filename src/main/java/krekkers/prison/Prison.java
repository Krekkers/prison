package krekkers.prison;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Prison extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Launching prison");
    }
    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Disabling prison");
    }
}
