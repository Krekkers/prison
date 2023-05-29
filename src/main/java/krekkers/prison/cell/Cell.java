package krekkers.prison.cell;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.UUID;
/*
Maybe idea:
Just have 1 cell but players get turned invisable and make 0 noise?
 */
public class Cell {

    String name;
    double price;
    Location spawn;
    UUID cellID;

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


}
