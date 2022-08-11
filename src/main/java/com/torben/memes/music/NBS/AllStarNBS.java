package com.torben.memes.music.NBS;

import com.torben.memes.Main;
import com.torben.memes.utils.ConfigManager;
import com.torben.memes.utils.ConfigMessage;
import com.xxmicloxx.NoteBlockAPI.songplayer.RadioSongPlayer;
import com.xxmicloxx.NoteBlockAPI.utils.NBSDecoder;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.File;

public class AllStarNBS implements CommandExecutor {
    ConfigManager manager = new ConfigManager(new Main());

    private Main main;

    public AllStarNBS(){
        this.main = main;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){
            Player player = (Player) sender;

            RadioSongPlayer rsp = new RadioSongPlayer(NBSDecoder.parse(new File(main.getDataFolder(), "AllStar.nbs")));
            rsp.addPlayer(player);
            rsp.setPlaying(true);
            player.sendMessage(manager.getMessage(ConfigMessage.ALL_STAR_NBS));
        }

        return false;
    }
}
