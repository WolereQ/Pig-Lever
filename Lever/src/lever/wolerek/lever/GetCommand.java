package test.wolerek.listeners.leaver;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GetCommand implements CommandExecutor{

	
	
	public boolean onCommand(CommandSender snd, Command cmd, String l, String[] args){
		
		
		
		if(cmd.getName().equalsIgnoreCase("lever")){
			
			
			
			Player p = (Player) snd;
			
			ItemStack is = new ItemStack(Material.LEVER, 1);
			ItemMeta m = is.getItemMeta();
			m.setDisplayName(ChatColor.GOLD + "Pig's lever");
			is.setItemMeta(m);
			
			p.getInventory().addItem(is);
			
			p.sendMessage(ChatColor.GOLD + "THIS IS YOUR MAGIC LEVER");
			
			
			
			
		}
		
		
		
		return true;
	}
}
