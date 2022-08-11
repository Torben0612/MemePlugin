package com.torben.memes.soundeffects;

import com.torben.memes.Main;
import com.torben.memes.utils.ConfigManager;
import com.torben.memes.utils.ConfigMessage;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Sad implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        ConfigManager manager = new ConfigManager(new Main());

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (((Player) sender).isSneaking()) {

            player.sendMessage(manager.getMessage(ConfigMessage.SAD_SFX));
            player.playSound(player.getLocation(), "memes.sad", 10000f, 1f);

            }

        }
        return false;
    }
}
