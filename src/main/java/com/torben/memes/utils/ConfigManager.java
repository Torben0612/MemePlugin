package com.torben.memes.utils;

import com.torben.memes.Main;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.Locale;

public class ConfigManager {
    ConfigManager manager = new ConfigManager(new Main());
    private YamlConfiguration yamlConfiguration;

    public ConfigManager(Main main) {
        File file = new File(main.getDataFolder(), main.getConfig().getString("language") + ".yml");
        if (file.exists()){

        } else{
            System.out.println(manager.getMessage(ConfigMessage.ERROR_LOADING_LANG));
            
        }
    }

    public String getMessage(ConfigMessage message) {


        return yamlConfiguration.getString(message.name().toLowerCase());
    }


}
