package com.torben.memes.soundeffects;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpeedRun implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;

            player.sendMessage(ChatColor.GREEN + "Speed Run Started!");
            player.playSound(player.getLocation(), "music.speed_run", 1000f, 1f);

        }
        return false;

    }
}
