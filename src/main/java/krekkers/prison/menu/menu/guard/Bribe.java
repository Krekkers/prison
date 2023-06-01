package krekkers.prison.menu.menu.guard;

import krekkers.prison.guard.Guard;
import krekkers.prison.menu.Menu;
import krekkers.prison.menu.MenuUtility;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class Bribe extends Menu {
    Guard cop;
    /*
     The plan:
        - Player can add a item to a slot and if it's the right item the cop can get bribed.
     */
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

    private boolean isValidTradeItem(ItemStack inputItem){
        for(String item : cop.getBribeItems()){
            if(item.equals(inputItem.getItemMeta().getDisplayName())) {
                return true;
            }
        }
        return false;
    }


}
