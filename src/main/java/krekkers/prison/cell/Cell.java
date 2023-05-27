package krekkers.prison.cell;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.UUID;

public class Cell {

    String name;
    double price;
    Location spawn;
    int cellID;
    UUID cellOwnerUUID;

    public Cell(String name, double price, Location spawn){
        this.name = name;
        this.price = price;
        this.spawn = spawn;
    }

    public String getName() {
        return name;
    }
    /**
     * Set cell name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Location getSpawn() {
        return spawn;
    }

    public void setSpawn(Location spawn) {
        this.spawn = spawn;
    }

    /**
     * Sends player to cell
     * @param player
     * @return if player owns cell true else false
     */
    public boolean sendPlayerToCell(Player player){
        if(player.getUniqueId() == cellOwnerUUID)
            player.teleport(getSpawn());
        else
            return false;
        return true;
    }


}
