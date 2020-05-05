package me.alexander.commands;

import org.bukkit.ChatColor;
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
     * @param label a string
     * @param strings an array of strings
     * @return
     */

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] strings) {
        // To Check if the command sender is a player
        if (!(commandSender instanceof Player)) {
            // Sending a message to the command sender
            commandSender.sendMessage("You are not a player!");
            return true;
        } else {
            // Defining what "player" will represent
            Player player = (Player) commandSender;
            // Checking if the player has a permission
            if (player.hasPermission("plugin.permission")) {
                // Send a message to the player if they have permission
                player.sendMessage(ChatColor.GREEN + "You are a player and had permission to use this admin section.");
                return true;
            } else {
                // Sending a message to the player if they don't have the permission
                player.sendMessage(ChatColor.GREEN + "You are a default and were able to use this command.");
                player.sendMessage("You do not have permission");
                return true;
            }
        }
    }
}