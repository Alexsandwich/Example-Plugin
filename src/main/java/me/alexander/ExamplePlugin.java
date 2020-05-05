package me.alexander;

import me.alexander.commands.ExampleCommand;
import me.alexander.events.ExampleJoinEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

// By extending "JavaPlugin" we are defining that this class is the main class
public class ExamplePlugin extends JavaPlugin {

    // Getting the plugin description
    PluginDescriptionFile plugin = this.getDescription();

    // Defining that this class is an instance
    private static ExamplePlugin instance;
    // Defining the "plugin manager"
    PluginManager pm = Bukkit.getPluginManager();

    // Defining that to call this instance, you use "this"
    public ExamplePlugin() {
        ExamplePlugin.instance = this;
    }

    @Override
    // Anything in this onEnable statement will run upon server start or plugin enable
    public void onEnable() {
        // Sending a message to console to state certain information on plugin start
        getLogger().info(plugin.getFullName() + "Version: " + plugin.getVersion() + " has been enabled");
        // Stating the command name and the class for the command
        this.getCommand("test").setExecutor(new ExampleCommand());
        // Stating the event and the class
        pm.registerEvents(new ExampleJoinEvent(), this);
    }

    @Override
    // Anything in this onDisable statement will run upon server stop or plugin disable
    public void onDisable() {
        // Sending a message to console to say that the plugin has been disabled
        getLogger().info(plugin.getFullName() + " version: " + plugin.getVersion() + " has been disabled.");
    }
}
