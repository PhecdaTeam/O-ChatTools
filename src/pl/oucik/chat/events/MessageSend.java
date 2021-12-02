package pl.oucik.chat.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import pl.oucik.chat.ChatHelper;
import pl.oucik.chat.Main;

public class MessageSend implements Listener {
    Main plugin;
    public MessageSend(Main plugin){
        this.plugin = plugin;
    }
    @EventHandler
    public void onMessage(AsyncPlayerChatEvent e){
        if(!this.plugin.getChatManager().isChatEnabled()){
            if(!e.getPlayer().hasPermission(this.plugin.PChatBypass)){
                e.getPlayer().sendMessage(ChatHelper.color(this.plugin.ChatBlocked));
                e.setCancelled(true);
                return;
            }
        }

        String[] splitted = e.getMessage().toLowerCase().split(" ");
        for (String s : splitted) {
            if (this.plugin.BlockedWords.contains(s)){
                e.setCancelled(true);
                e.getPlayer().sendMessage(ChatHelper.color(this.plugin.IllegalMessage));
            }
        }
    }
}
