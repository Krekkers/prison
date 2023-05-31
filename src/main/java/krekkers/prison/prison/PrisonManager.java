package krekkers.prison.prison;

import krekkers.prison.cell.Cell;
import krekkers.prison.player.KPlayer;
import krekkers.prison.player.PlayerManager;
import krekkers.prison.reward.Reward;
import krekkers.prison.reward.RewardManager;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class PrisonManager {

    PlayerManager playerManager = new PlayerManager();
    RewardManager rewardManager = new RewardManager();

    //String = name
    HashMap<String, Cell> cellMap;

    public PrisonManager(){

    }
    //moves players to area's
    public void movePlayer(){

    }


    public int getCellBlockCount(){
        return 0;
    }

    public void updatePrisonInfo(){
        //updates data to a database for the website to use.
    }


    public Cell getCell(String name){
        return cellMap.get(name);
    }

}
