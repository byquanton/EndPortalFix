package me.byquanton.endportalfix;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class EndPortalFix extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this,this);
    }

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent event){
        if(event.getClickedBlock().getBlockData().getMaterial().equals(Material.END_PORTAL_FRAME)){
            if(event.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
                event.setCancelled(true);
            }
        }
    }
}
