package krekkers.prison.menu.menu.info;

import krekkers.prison.cell.Cell;
import krekkers.prison.menu.Menu;
import krekkers.prison.menu.MenuUtility;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class CellMenu extends Menu {
    Cell cell;

    public CellMenu(MenuUtility utility, Cell cell) {
        super(utility);
        this.cell = cell;
    }

    //start item list
    private ItemStack menuButton1 = newItem("test", Material.SKELETON_SKULL, "t", "test2");

    //end item list

    @Override
    public String getMenuName() {
        return "Cell Info : " + cell.getOwner().getDisplayName();
    }

    @Override
    public int getSlots() {
        return 9;
    }

    @Override
    public void setMenuItems() {

        setItem(1, menuButton1);
        fillInventoryWith(menuButton1);
    }

    @Override
    public void handleMenu(InventoryClickEvent e) {

    }
}
