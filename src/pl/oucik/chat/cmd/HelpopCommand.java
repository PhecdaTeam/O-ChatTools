package pl.oucik.chat.cmd;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import pl.oucik.chat.ChatHelper;
import pl.oucik.chat.Main;
public class HelpopCommand implements CommandExecutor {
    Main plugin;
    public HelpopCommand(Main plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (args.length<1){
            sender.sendMessage(ChatHelper.color(this.plugin.HelpOpEmpty));
            return true;
        }
        String msg = "";
        for (int i = 0; i < args.length; i++) {
            msg = msg + args[i] + " ";
        }
        Bukkit.broadcast(ChatHelper.color(((this.plugin.HelpOp).replace("%player%", sender.getName())  + msg)), this.plugin.PHelpOpSee);
        sender.sendMessage(ChatHelper.color(this.plugin.HelpOpSent));
        return true;
    }
}
