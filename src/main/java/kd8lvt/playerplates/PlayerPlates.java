package kd8lvt.playerplates;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerPlates extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(new EventsHandler(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
