package krekkers.prison.guard;
import org.bukkit.Location;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Zombie;


import java.util.List;

public class Guard{

    Zombie guard;
    String name;
    int copID;

    Location spawn;
    private List<Location> destinationList;
    private boolean bribable;
    List<String> bribeItems;

    public Guard(Location location){

    }


    public Entity getGuard() {
        return guard;
    }

    public void setGuard(Zombie guard) {
        this.guard  = guard;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getSpawn() {
        return spawn;
    }

    public void setSpawn(Location spawn) {
        this.spawn = spawn;
    }

    public List<Location> getDestinationList() {
        return destinationList;
    }

    public void setDestinationList(List<Location> destinationList) {
        this.destinationList = destinationList;
    }

    public boolean isBribable() {
        return bribable;
    }

    public void setBribable(boolean bribable) {
        this.bribable = bribable;
    }

    public List<String> getBribeItems() {
        return bribeItems;
    }

    public void setBribeItems(List<String> bribeItems) {
        this.bribeItems = bribeItems;
    }

}
