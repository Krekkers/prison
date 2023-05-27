package krekkers.prison.hologram;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

public class HoloLine {

    String text;
    Location location;
    Entity line;


    public HoloLine(String text, Location location){
        this.text = text;
        this.location = location;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        line.setCustomName(ChatColor.translateAlternateColorCodes('&',text));
    }

    public Entity getLine() {
        return line;
    }
    public void setLine(Entity line) {
        this.line = line;
    }

    /**
     * Spawns the line as an entity
     * @return Entity
     */
    public Entity spawnLine(){
        ArmorStand armorStand = (ArmorStand) location.getWorld().spawnEntity(location, EntityType.ARMOR_STAND); //Spawn the ArmorStand
        armorStand.setGravity(false); //Make sure it doesn't fall
        armorStand.setCanPickupItems(false); //Might as well
        armorStand.setCustomName(ChatColor.translateAlternateColorCodes('&', text)); //Set this to the text you want
        armorStand.setCustomNameVisible(true); //This makes the text appear no matter if your looking at the entity or not
        armorStand.setVisible(false); //Makes the ArmorStand invisible
        this.line = armorStand;
        return armorStand;
    }
    //removes the entity!
    public void removeLine(){
        this.line.remove();
    }



}
