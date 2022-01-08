package me.krymz0n.lavadamagecommand;

import me.krymz0n.lavadamagecommand.listener.PlayerDamage;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        PluginManager pm = getServer().getPluginManager();

        pm.registerEvents(this, this);

        pm.registerEvents(new PlayerDamage(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
