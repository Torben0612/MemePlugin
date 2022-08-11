package com.torben.memes.soundeffects;

import com.torben.memes.Main;
import com.torben.memes.utils.ConfigManager;
import com.torben.memes.utils.ConfigMessage;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class HelloThere implements Listener {
    ConfigManager manager = new ConfigManager(new Main());

    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Player player = e.getPlayer();

        player.playSound(e.getPlayer().getLocation(), "meme.hello_there", 1000f, 1f);
        player.sendTitle(
                "\uE003",
                ChatColor.RED + manager.getMessage(ConfigMessage.HELLO_THERE_TITLE), 
                20,
                200,
                20
        );



    }


}
