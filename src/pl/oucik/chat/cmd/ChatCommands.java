package pl.oucik.chat.cmd;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.oucik.chat.ChatHelper;
import pl.oucik.chat.Main;

public class ChatCommands implements CommandExecutor {

    Main plugin;
    public ChatCommands(Main plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(!sender.hasPermission(this.plugin.PChatManage)){
            sender.sendMessage(ChatHelper.color(this.plugin.ChatPerm));
            return true;
        }
        if(args.length<1){
            sender.sendMessage(ChatHelper.color(this.plugin.ChatEmpty));
            return true;
        }
        switch (args[0]){
            case "on":
                if (this.plugin.getChatManager().isChatEnabled()){
                    sender.sendMessage(ChatHelper.color(this.plugin.ChatIsOn));
                    return true;
                }
                this.plugin.getChatManager().setChatEnabled(true);
                Bukkit.broadcastMessage(" ");
                Bukkit.broadcastMessage(ChatHelper.color(this.plugin.ChatOn).replace("%player%", sender.getName()));
                Bukkit.broadcastMessage(" ");
                return true;

            case "off":
                if (!this.plugin.getChatManager().isChatEnabled()){
                    sender.sendMessage(ChatHelper.color(this.plugin.ChatIsOff));
                    return true;
                }
                this.plugin.getChatManager().setChatEnabled(false);
                Bukkit.broadcastMessage(" ");
                Bukkit.broadcastMessage(ChatHelper.color(this.plugin.ChatOff).replace("%player%", sender.getName()));
                Bukkit.broadcastMessage(" ");
                return true;
            case "cc":
                for(int i = 0; i<256; i++){
                    Bukkit.broadcastMessage(" ");
                }
                Bukkit.broadcastMessage(ChatHelper.color(this.plugin.ChatClear).replace("%player%", sender.getName()));
                Bukkit.broadcastMessage(" ");

        }



        return true;
    }
}
