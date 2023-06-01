package krekkers.prison.guard;


import org.bukkit.entity.Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GuardManager {

    ArrayList<Guard> guardMap;
    //Something to keep track of the entities.

    public GuardManager(){

    }

    public List<Entity> guardEntityList(){
        List<Entity> entities = new ArrayList<>();
        for(Guard guard : guardMap){
            entities.add(guard.getGuard());
        }
        return entities;
    }

    public void despawnAllGuards(){
        for(Entity entity : guardEntityList()){
            entity.remove();
        }
    }

    public Guard getGuard(int id){
        return guardMap.get(id);
    }

    public void spawnGuard(int id){
        getGuard(id);
    }








}
