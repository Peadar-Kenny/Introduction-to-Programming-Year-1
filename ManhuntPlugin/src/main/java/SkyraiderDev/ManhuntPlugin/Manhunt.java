package SkyraiderDev.ManhuntPlugin;
import java.util.Collection;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Manhunt extends JavaPlugin{
	 @Override
	    public void onEnable() {
		 getLogger().info("onEnable has been invoked!");
	    }
	    
	    @Override
	    public void onDisable() {
			getLogger().info("onDisable has been invoked!");
	    }
	    @Override
	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    	if(cmd.getName().equalsIgnoreCase("broadcast")) {
	    		Collection<? extends Player> onlinePlayers = getServer().getOnlinePlayers();
	    		for(Player currPlayer : onlinePlayers) {
	    			getServer().broadcastMessage(currPlayer.getDisplayName() + "is currently at X: " + currPlayer.getLocation().getBlockX() 
	    					+ " Z: " +currPlayer.getLocation().getBlockZ() + " Y: " + currPlayer.getLocation().getBlockY());
	    		}
	    		return true;
	    	}
	    	return false;
	    }
	
}
