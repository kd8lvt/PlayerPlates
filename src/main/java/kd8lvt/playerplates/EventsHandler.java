package kd8lvt.playerplates;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityInteractEvent;

public class EventsHandler implements Listener {
    @EventHandler
    public void PlayerPlate (EntityInteractEvent ev) {
        if (ev.getBlock().getType() == Material.HEAVY_WEIGHTED_PRESSURE_PLATE) {
            if (ev.getBlock().getRelative(BlockFace.DOWN).getType() == Material.CLAY) {
                if (ev.getEntityType() != EntityType.PLAYER) {
                    ev.setCancelled(true);
                }
            }
        }
    }
}
