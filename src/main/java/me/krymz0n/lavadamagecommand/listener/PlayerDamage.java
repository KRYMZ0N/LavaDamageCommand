package me.krymz0n.lavadamagecommand.listener;

import me.krymz0n.lavadamagecommand.Main;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class PlayerDamage implements Listener {
    private final Main plugin;

    public PlayerDamage(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerDamageEvent(EntityDamageEvent evt) {
        if (evt.getEntity() instanceof Player) {
            Player p = (Player) evt.getEntity();

            if (evt.getCause() == EntityDamageEvent.DamageCause.LAVA) {
                p.performCommand("warp event");
            }
        }
    }
}
