package krekkers.prison.debugger;

import org.bukkit.Bukkit;

import static krekkers.prison.Prison.config;

public class KrekksDebugger {
    /**
     * Created to debug in game and not in console.
     * Use Bukkit.getLogger.etc(); in combination or alone.
     */
    public KrekksDebugger(){

    }

    public void krekksError(String error){
        Bukkit.broadcast(config.error +  error, "krekks.admin");
    }
    public void krekksLotsOfError(String... errors){
        for(String str : errors){
            Bukkit.broadcast(config.error + str, "krekks.admin");
        }
    }
    public void krekksInfo(String info){
        Bukkit.broadcast(config.info + info, "krekks.admin");
    }
    public void krekksLotsOfInfo(String... infos){
        for(String str : infos){
            Bukkit.broadcast(config.info + str, "krekks.admin");
        }
    }



}
