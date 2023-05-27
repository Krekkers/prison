package krekkers.prison.menu.menu.cop;

import krekkers.prison.cop.Cop;
import krekkers.prison.menu.Menu;
import krekkers.prison.menu.MenuUtility;
import org.bukkit.event.inventory.InventoryClickEvent;

public class Bribe extends Menu {
    Cop cop;
    public Bribe(MenuUtility utility) {
        super(utility);
    }

    @Override
    public String getMenuName() {
        return "Bribing";
    }

    @Override
    public int getSlots() {
        return 0;
    }

    @Override
    public void setMenuItems() {

    }

    @Override
    public void handleMenu(InventoryClickEvent e) {

    }

    private boolean isValidTradeItem(){

        return false;
    }


}
