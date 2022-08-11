package com.torben.memes.music;

import com.torben.memes.Main;
import com.torben.memes.utils.ConfigManager;
import com.torben.memes.utils.ConfigMessage;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RickRoll implements CommandExecutor {

    ConfigManager manager = new ConfigManager(new Main());
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){

            Player player = (Player) sender;
            player.playSound(player.getLocation(), "memes.rick_roll", 1000f, 1f);

            player.sendMessage(manager.getMessage(ConfigMessage.RICK_ROLL_TEXT));

        }

        return false;
    }
}
