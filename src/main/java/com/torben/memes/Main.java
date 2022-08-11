package com.torben.memes;

import com.torben.memes.music.NBS.AllStarNBS;
import com.torben.memes.music.RickRoll;
import com.torben.memes.soundeffects.HelloThere;
import com.torben.memes.soundeffects.Oof;
import com.torben.memes.soundeffects.Sad;
import com.torben.memes.utils.ConfigManager;
import com.torben.memes.utils.ConfigMessage;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class  Main extends JavaPlugin {
    ConfigManager manager = new ConfigManager(this);

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        //if (!new AdvancedLicense(this.getConfig().getString("licence"), "https://tornadokspigotplugins.000webhostapp.com/verify.php", this).register()) { return; }
        saveResource("lang_en.yml", false );
        saveResource("lang_fr.yml", false );
        saveResource("lang_de.yml", false );
        saveResource("lang_es.yml", false );

        //int pluginId = 1234; // <-- Replace with the id of your plugin!
        // Metrics metrics = new Metrics(this, pluginId);

        // Optional: Add custom charts

        //metrics.addCustomChart(new Metrics.SimplePie("chart_id", () -> "My value"));

        getCommand("rick-roll").setExecutor(new RickRoll());
        getCommand("sad-sfx").setExecutor(new Sad());
        getCommand("all-star").setExecutor(new AllStarNBS());

        System.out.println(manager.getMessage(ConfigMessage.SERVER_ENABLED));
        Bukkit.getPluginManager().registerEvents(new Oof(), this);
        Bukkit.getPluginManager().registerEvents(new HelloThere(), this);

    }

    @Override
    public void onDisable() {
        System.out.println(manager.getMessage(ConfigMessage.SERVER_DISABLED));
    }
}
