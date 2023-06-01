package krekkers.prison.guard;

import org.bukkit.Location;
import org.bukkit.entity.Entity;

import java.util.List;

public class Guard {

    Entity guard;
    String name;
    int copID;

    Location spawn;
    private List<Location> destinationList;
    private boolean bribable;
    List<String> bribeItems;

    public Guard(){

    }

    void setPathDestination(){

    }

    public Entity getGuard() {
        return guard;
    }

    public void setGuard(Entity cop) {
        this.guard  = cop;
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
