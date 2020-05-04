package me.alexander.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

// By implementing CommandExecutor, we are defining that this class is a command class
public class ExampleCommand implements CommandExecutor {

    /**
     *
     * @param commandSender the person who sent the command (console or player)
     * @param command the call when the command is ran
     * @param s a string
     * @param strings an array of strings
     * @return
     */
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        //Checking if the commandSender is a player
        if(commandSender instanceof Player) {
            //Defining what "player" will represent
            Player player = (Player) commandSender;

            //Sending a message upon successful command
            player.sendMessage("Your command works!");
        }
        // If the player (or console) runs the command correctly, we can return true
        return true;
    }
}
