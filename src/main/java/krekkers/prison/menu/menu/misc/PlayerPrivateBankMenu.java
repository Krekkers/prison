package krekkers.prison.menu.menu.misc;

import krekkers.prison.menu.Menu;
import krekkers.prison.menu.MenuUtility;
import krekkers.prison.player.KPlayer;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PlayerPrivateBankMenu extends Menu {
    KPlayer kPlayer;
    public PlayerPrivateBankMenu(MenuUtility utility) {
        super(utility);
    }

    @Override
    public String getMenuName() {
        return decoratedName("Your bank");
    }

    @Override
    public int getSlots() {
        return 27;
    }

    @Override
    public void setMenuItems() {
        addItemsToInventory(kPlayer.getBankItems());
    }
    /*
    Note: Dont make it dupe by common methods. Item adding / removing need to be on top priority to be finished.
    Rather the item is gone and no dupe than dupe and item.
     */
    @Override
    public void handleMenu(InventoryClickEvent e) {

    }
}
