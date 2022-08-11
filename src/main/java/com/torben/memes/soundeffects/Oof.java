package com.torben.memes.soundeffects;

import com.torben.memes.Main;
import com.torben.memes.utils.ConfigManager;
import com.torben.memes.utils.ConfigMessage;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class Oof implements Listener {
    ConfigManager manager = new ConfigManager(new Main());

    @EventHandler
    public void onDeath(PlayerDeathEvent e){

        Player player = e.getEntity().getPlayer();

        e.setDeathMessage("\uE002" + player.getName() + manager.getMessage(ConfigMessage.OOF_DEATH_SFX) + "\uE002");
        player.playSound(player.getLocation(), "memes.oof", 10f, 1f);

    }

}
