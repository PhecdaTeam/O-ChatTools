package pl.oucik.chat;

import org.bukkit.plugin.java.JavaPlugin;
import pl.oucik.chat.cmd.ChatCommands;
import pl.oucik.chat.cmd.HelpopCommand;
import pl.oucik.chat.events.ChatManager;
import pl.oucik.chat.events.MessageSend;

import java.util.List;

public class Main extends JavaPlugin {
    private ChatManager chatManager;

    @Override
    public void onEnable() {
        this.getLogger().info("O-Chat Loading...");
        this.saveDefaultConfig();
        this.chatManager = new ChatManager();
        this.getChatManager().setChatEnabled(true);
        this.getCommand("chat").setExecutor(new ChatCommands(this));
        this.getCommand("helpop").setExecutor(new HelpopCommand(this));
        this.getServer().getPluginManager().registerEvents(new MessageSend(this), this);
        this.getLogger().info("O-Chat Successfully loaded!");
    }

    public ChatManager getChatManager() {
        return this.chatManager;
    }

    public String PChatManage = this.getConfig().getString("ChatManage");
    public String PHelpOpSee =  this.getConfig().getString("HelpOpSee");
    public String ChatIsOff =  this.getConfig().getString("ChatIsOff");
    public String ChatIsOn =  this.getConfig().getString("ChatIsOn");
    public String PChatBypass=  this.getConfig().getString("ChatBypass");
    public String ChatOff = this.getConfig().getString("ChatOff");
    public String ChatClear = this.getConfig().getString("ChatClear");
    public String HelpOpSent = this.getConfig().getString("HelpOpSent");
    public String ChatPerm = this.getConfig().getString("ChatPerm");
    public String ChatEmpty = this.getConfig().getString("ChatEmpty");
    public String ChatOn = this.getConfig().getString("ChatOn");
    public String ChatBlocked = this.getConfig().getString("ChatBlocked");
    public String HelpOp = this.getConfig().getString("HelpOp");
    public String HelpOpEmpty = this.getConfig().getString("HelpOpEmpty");
    public String IllegalMessage = this.getConfig().getString("IllegalMessage");
    public List<String> BlockedWords = this.getConfig().getStringList("BlockedWords");

}
