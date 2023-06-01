package krekkers.prison.hologram;

import org.bukkit.Location;
import org.bukkit.entity.Entity;

import java.util.ArrayList;
import java.util.List;

public class Hologram {

    List<HoloLine> lines = new ArrayList<>();
    Location location;
    double offset = -0.3;
    ArrayList<Entity> entities = new ArrayList<>();


    public Hologram(List<String> lines){
        Location lineLocation = location.clone();
        for(String s : lines){
            HoloLine line = new HoloLine(s, lineLocation.add(0, offset, 0));
            this.lines.add(line);
        }
    }

    public void spawnIntoWorld(){
        for(HoloLine line : lines){
            Entity entity = line.spawnLine();
            entities.add(entity);
        }
    }

    public void removeHologram(){
        for(HoloLine line : lines){
            line.removeLine();
        }
    }

    public void editLine(int id, String text){
        lines.get(id).setText(text);
    }


    /**
     * refreshes the hologram
     */
    public void refresh(){
        removeHologram();
        spawnIntoWorld();
    }


}
