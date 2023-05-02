package krekkers.prison.command.admin.cell;

import krekkers.prison.menu.MenuUtility;
import krekkers.prison.menu.menu.info.CellMenu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static krekkers.prison.menu.MenuManager.getMenuUtility;

public class CellInfoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player))
            return false;
        Player p = (Player) sender;
        CellMenu cellMenu = new CellMenu(getMenuUtility(p));
        cellMenu.openMenu();
        return false;
    }
}
