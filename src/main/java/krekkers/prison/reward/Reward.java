package krekkers.prison.reward;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

import static krekkers.prison.Prison.config;

public class Reward {
    String id;
    List<ItemStack> itemRewards;
    int exp;

    public Reward(String id, List<ItemStack> itemRewards, int exp) {
        this.id = id;
        this.itemRewards = itemRewards;
        this.exp = exp;
    }

    public void giveRewards(Player p, String rewardType){
        p.giveExp(exp);
        if(p.getInventory().isEmpty()){
            for(ItemStack item : itemRewards){
                p.getInventory().addItem(item);
            }
            p.sendMessage(config.primary + "You got a " + rewardType + " Reward!");
        }else{
            //get KPlayer and add items to stash. If stash full Player is out of luck.
            p.sendMessage(config.primary + "You got a " + rewardType + " Reward!");
            p.sendMessage(config.secondary + "Items have been stored in your stash!");
        }



    }


}
