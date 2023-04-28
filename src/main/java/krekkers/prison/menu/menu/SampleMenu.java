package krekkers.prison.menu.menu;

import krekkers.prison.menu.Menu;
import krekkers.prison.menu.MenuUtility;
import org.bukkit.event.inventory.InventoryClickEvent;

public class SampleMenu extends Menu {
    public SampleMenu(MenuUtility utility) {
        super(utility);
    }

    @Override
    public String getMenuName() {
        return "null";
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
