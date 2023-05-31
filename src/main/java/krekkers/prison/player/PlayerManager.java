package krekkers.prison.player;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class PlayerManager {

    HashMap<UUID, KPlayer> KPlayerMap;

    public PlayerManager(){

    }

    public KPlayer getPlayer(UUID uuid){
        return KPlayerMap.get(uuid);
    }
    //adds player to playermap.
    public void addPlayerToMap(Player player){
        //test data
        KPlayerMap.put(player.getUniqueId(), new KPlayer(player,"test", null));
    }

}
