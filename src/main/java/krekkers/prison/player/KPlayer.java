package krekkers.prison.player;

import krekkers.prison.cell.Cell;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class KPlayer {
    Player player;
    String name;
    Cell cell;
    ArrayList<ItemStack> bankItems = new ArrayList<>();
    public double behaviourScore;
    double balance;



    /**
     * @param player player class
     * @param name name of player
     * @param cell cannot be null else will default to lowest
     */
    public KPlayer(Player player, String name, Cell cell){
        this.player = player;
        this.name = name;
        this.cell = cell;
    }
    //get player
    public Player getPlayer() {
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

    public void movePlayerToCell(){
        player.teleport(cell.getSpawn());
    }
}
