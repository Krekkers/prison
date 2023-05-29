package krekkers.prison.menu.menu.misc;

import krekkers.prison.menu.Menu;
import krekkers.prison.menu.MenuUtility;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import static krekkers.prison.Prison.config;

public class USureMenu extends Menu {

    public Menu redirectMenu;
    public Menu originMenu;

    public USureMenu(MenuUtility utility) {
        super(utility);
    }

    @Override
    public String getMenuName() {
        return decoratedName(config.error + "Are you sure?");
    }

    @Override
    public int getSlots() {
        return 27;
    }

    @Override
    public void setMenuItems() {
        setItem(12, newItem("&aYes",Material.GREEN_WOOL));

        setItem(14, newItem("&cNo",Material.RED_WOOL));

        fillInventoryWith(new ItemStack(Material.BLACK_STAINED_GLASS_PANE));
    }

    @Override
    public void handleMenu(InventoryClickEvent e) {
        if(e.getCurrentItem().getType() == Material.GREEN_WOOL){
            redirectMenu.openMenu();
        }
        if(e.getCurrentItem().getType() == Material.RED_WOOL){
            originMenu.openMenu();
        }
    }
}
