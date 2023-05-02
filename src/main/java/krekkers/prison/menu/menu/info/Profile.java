package krekkers.prison.menu.menu.info;

import krekkers.prison.menu.Menu;
import krekkers.prison.menu.MenuUtility;
import krekkers.prison.player.KPlayer;
import org.bukkit.event.inventory.InventoryClickEvent;

public class Profile extends Menu {

    public KPlayer player;

    public Profile(MenuUtility utility) {
        super(utility);
    }

    @Override
    public String getMenuName() {
        return "Profile : " + player.getPlayer().getName();
    }

    @Override
    public int getSlots() {
        return 27;
    }

    @Override
    public void setMenuItems() {

    }

    @Override
    public void handleMenu(InventoryClickEvent e) {

    }
}
