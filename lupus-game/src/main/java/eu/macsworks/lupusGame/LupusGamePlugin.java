package eu.macsworks.lupusGame;

import eu.macsworks.lupusGame.game.LupusGameManager;
import eu.macsworks.lupusGame.hooks.PlaceholderAPIHook;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

@Getter
public final class LupusGamePlugin extends JavaPlugin {

    @Getter //Thank you lombok for not generating getters for staticized variables!
    private static LupusGamePlugin instance = null;

    private LupusGameManager gameManager;


    @Override
    public void onEnable() {
        setInstance(this);

        gameManager = new LupusGameManager();

        registerListeners();
        registerCommands();

        registerPAPI();

        Bukkit.getLogger().info("lupus-game by Alice enabled!");
    }

    private void registerListeners(){
        List.of()
                .forEach(listener -> getServer().getPluginManager().registerEvents(listener, this));
    }

    private void registerCommands(){

    }

    private void registerPAPI(){
        new PlaceholderAPIHook();
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("lupus-game by Alice disabled!");
    }


    private static void setInstance(LupusGamePlugin instance){
        LupusGamePlugin.instance = instance;
    }
}
