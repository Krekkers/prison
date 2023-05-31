package krekkers.prison.prison;

import org.bukkit.Location;
import org.bukkit.Material;

public class PrisonRoom {
    String roomName;
    String description;
    Location spawn;
    Material displayMaterial;

    public PrisonRoom(String roomName, String description, Location spawn, Material displayMaterial) {
        this.roomName = roomName;
        this.description = description;
        this.spawn = spawn;
        this.displayMaterial = displayMaterial;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location getSpawn() {
        return spawn;
    }

    public void setSpawn(Location spawn) {
        this.spawn = spawn;
    }

    public Material getDisplayMaterial() {
        return displayMaterial;
    }

    public void setDisplayMaterial(Material displayMaterial) {
        this.displayMaterial = displayMaterial;
    }
}
