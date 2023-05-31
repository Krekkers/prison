package krekkers.prison.menu.menu.playerinfo;

import krekkers.prison.menu.Menu;
import krekkers.prison.menu.MenuUtility;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MyStatsMenu extends Menu {
    public MyStatsMenu(MenuUtility utility) {
        super(utility);
    }

    @Override
    public String getMenuName() {
        return "Your menu";
    }

    @Override
    public int getSlots() {
        return 9;
    }

    @Override
    public void setMenuItems() {
        
    }

    @Override
    public void handleMenu(InventoryClickEvent e) {

    }
}
