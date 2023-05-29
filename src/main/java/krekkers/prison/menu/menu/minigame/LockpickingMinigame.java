package krekkers.prison.menu.menu.minigame;

import krekkers.prison.menu.Menu;
import krekkers.prison.menu.MenuUtility;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class LockpickingMinigame extends Menu {
    /*
        The plan :
        - Create 3 pillars with random heights.
        - Player clicks a pillar at a random elivation.
        - Player gets to know if they are correct.
        - When wrong the lockpick gets broken a little.
        - Too many wrong attempts and a guard spawns and "handles" the player.
        - Having it right allows you access to the thing you where going after.
     */
    ItemStack pick;

    public LockpickingMinigame(MenuUtility utility, ItemStack pick) {
        super(utility);
        this.pick = pick;
    }

    // x y and z will be our pin heights
    int x = 2;
    int y = 1;
    int z = 3;



    @Override
    public String getMenuName() {
        return decoratedName("Lockpicking Minigame");
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

