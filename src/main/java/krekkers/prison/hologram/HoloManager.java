package krekkers.prison.hologram;

import java.util.HashMap;

public class HoloManager {

    HashMap<Integer, Hologram> holoList;

    public HoloManager(){

    }

    /**
     * removes hologram with id
     * @param id
     */
    public void removeHologram(int id){
        Hologram hologram = holoList.get(id);
        hologram.removeHologram();
        holoList.remove(id);
    }





    public void refreshAllHologram(){
        //create a bukkit task that loops every hour or so to refresh the holograms.
    }


}
