package me.alexander.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

// By implementing Listener, we are defining that this class is an event/listener class
public class ExampleJoinEvent implements Listener {

    /**
     * @param event the call to obtain information about the event
     */

    @EventHandler
    public void PlayerJoin(PlayerLoginEvent event) {
        // Getting the player involved with the event
        Player player = event.getPlayer();
        // Sending a message to everyone on the server welcoming the player
        Bukkit.broadcastMessage(ChatColor.GREEN + "Welcome " + player.getDisplayName() + " to the server!");
    }
}
