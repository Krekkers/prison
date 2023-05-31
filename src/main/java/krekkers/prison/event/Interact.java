package krekkers.prison.event;

import krekkers.prison.menu.Menu;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.InventoryHolder;


public class Interact implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent e) {
        InventoryHolder holder = e.getInventory().getHolder();
        if (holder instanceof Menu menu) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null) { return; }
            menu.handleMenu(e);
        }
    }

    /**
     * When the player interacts with a special door play minigame.
     */
    @EventHandler
    public void onClickDoorLockPick(PlayerInteractEvent event){


    }

}
