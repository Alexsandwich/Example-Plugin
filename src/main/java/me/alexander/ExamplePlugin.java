package me.alexander;

import me.alexander.commands.ExampleCommand;
import org.bukkit.plugin.java.JavaPlugin;

// By extending "JavaPlugin" we are defining that this class is the main class
public class ExamplePlugin extends JavaPlugin {

    private static ExamplePlugin instance;

    public ExamplePlugin() {
        ExamplePlugin.instance = this;
    }

    @Override
    // Anything in this onEnable statement will run upon server start or plugin enable
    public void onEnable() {
        this.getCommand("test").setExecutor(new ExampleCommand());
    }

    @Override
    // Anything in this onDisable statement will run upon server stop or plugin disable
    public void onDisable() {

    }
}
