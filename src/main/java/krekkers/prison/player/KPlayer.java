package krekkers.prison.player;

import krekkers.prison.cell.Cell;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class KPlayer {
    KPlayer player;
    String name;
    Cell cell;
    ArrayList<ItemStack> bankItems = new ArrayList<>();

    public KPlayer(KPlayer player, String name, Cell cell){
        this.player = player;
        this.name = name;
        this.cell = cell;
    }
    //get player
    public KPlayer getPlayer() {
        return player;
    }
    //get name
    public String getName() {
        return name;
    }
    //set name
    public void setName(String name) {
        this.name = name;
    }
    //get cell
    public Cell getCell() {
        return cell;
    }
    //set cell
    public void setCell(Cell newCell){
        cell = newCell;
    }
    public ArrayList<ItemStack> getBankItems(){
        return this.bankItems;
    }

}
