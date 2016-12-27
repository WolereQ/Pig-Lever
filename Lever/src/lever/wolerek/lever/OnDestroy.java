packet lever.wolerek.lever;

import java.util.Collection;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;


public class OnDestroy implements Listener{

	
	
	@EventHandler
	public void onBreak(BlockBreakEvent evt){
		
		
		if(evt.getBlock().getType() == Material.LEVER){

			int x = evt.getBlock().getX();
			int y = evt.getBlock().getY();
			int z = evt.getBlock().getZ();
			
			if(!evt.getBlock().getWorld().getBlockAt(x, y-1, z).isEmpty()){
				
		
					Collection<ArmorStand> e = Bukkit.getWorld("world").getEntitiesByClass(ArmorStand.class);
					
					if(!e.isEmpty()){
					
						for(ArmorStand e1 : e){
				
							if(e1.getCustomName().equals("PIG1")){
						
							
								e1.remove();
						
							
								OnPlace.i = 0;
								
								evt.getPlayer().sendMessage(ChatColor.GOLD + "YOU REMOVED THIS MAGIC LEVER :C");
								
						}
						
					}
					
					
				}
				
			
			}
			
		
			
		}
		
		
	}
}
