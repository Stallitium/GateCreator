package stellontium.gateCreator;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    FileConfiguration config;
    @Override
    public void onEnable() {
        config = getConfig();
        //ゲート
        Bukkit.getPluginCommand("gate").setExecutor(new GateCreator(this,config.getConfigurationSection("GateCreator")));
    }
}
