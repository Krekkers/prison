package krekkers.prison.cell;

import org.bukkit.Location;

public class Cell {

    String name;
    double price;
    Location spawn;

    public Cell(String name, double price, Location spawn){
        this.name = name;
        this.price = price;
        this.spawn = spawn;
    }

    public String getName() {
        return name;
    }

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
