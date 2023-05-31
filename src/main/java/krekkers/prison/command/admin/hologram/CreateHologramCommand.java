package krekkers.prison.command.admin.hologram;

import krekkers.prison.hologram.Hologram;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class CreateHologramCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player))
            return false;

        Player player = (Player) sender;
        Location holoLocation = player.getLocation().clone();
        List<String> holoLines = null;
        holoLines.add(args[1]);
        Hologram hologram = new Hologram(holoLines);
        hologram.spawnIntoWorld();
        return false;
    }
}
