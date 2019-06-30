package xyz.disclearing.skid.Events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

public class SkidEvent implements Listener {

    public void OnMove(PlayerMoveEvent event){
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.AQUA + "Oh look its a player move event sorry PcrunCommand I can code");
        player.setWalkSpeed(10);
    }
}
