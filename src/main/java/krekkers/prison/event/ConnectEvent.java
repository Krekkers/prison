package krekkers.prison.event;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ConnectEvent implements Listener {

    public void join(PlayerJoinEvent event){
        Bukkit.getLogger().info("Player : " + event.getPlayer().getDisplayName() + " Has joined!");
    }

    public void disconnect(PlayerQuitEvent event){
        Bukkit.getLogger().info("Player : " + event.getPlayer().getDisplayName() + " Has disconnected!");
    }
}
