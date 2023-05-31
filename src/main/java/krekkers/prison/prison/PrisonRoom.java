package krekkers.prison.prison;

import org.bukkit.Location;
import org.bukkit.Material;

import java.util.List;

public class PrisonRoom {
    String roomName;
    List<String> description;
    Location spawn;
    Material displayMaterial;
    boolean isPlayerAllowed;

    /**
     * This class is used to order rooms.
     * @param roomName Display name of the room. Acts like a type of sort
     * @param description A description of the room
     * @param spawn Spawn loaction of the room
     * @param displayMaterial For menu's
     * @param isPlayerAllowed If a player is allowed in there.
     */
    public PrisonRoom(String roomName, List<String> description, Location spawn, Material displayMaterial, boolean isPlayerAllowed) {
        this.roomName = roomName;
        this.description = description;
        this.spawn = spawn;
        this.displayMaterial = displayMaterial;
        this.isPlayerAllowed = isPlayerAllowed;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
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
