package test.wolerek.listeners.leaver;

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
	
			Bukkit.broadcastMessage("1");
			int x = evt.getBlock().getX();
			int y = evt.getBlock().getY();
			int z = evt.getBlock().getZ();
			
			if(!evt.getBlock().getWorld().getBlockAt(x, y-1, z).isEmpty()){
			
				
				Bukkit.broadcastMessage("2");
			//Entity[] e = evt.getBlock().getWorld().getBlockAt(x, y-1, z).getChunk().getEntities();
				
				//for(Entity e1 : e){
				//	Bukkit.broadcastMessage("3");
				//	if(e1.getLocation() == new Location(Bukkit.getWorld("world"), x, y-1, z)){
				//		Bukkit.broadcastMessage("4");
				//		if(e1.getType() == EntityType.ARMOR_STAND){
				//			Bukkit.broadcastMessage("5");
							//			e1.remove();
				//		Bukkit.broadcastMessage("6");
				//	}
			//	
				//}				
				//}
				
		
					Collection<ArmorStand> e = Bukkit.getWorld("world").getEntitiesByClass(ArmorStand.class);
					
					if(!e.isEmpty()){
						Bukkit.broadcastMessage("3");
						for(ArmorStand e1 : e){
							Bukkit.broadcastMessage("4");
							if(e1.getCustomName().equals("PIG1")){
								Bukkit.broadcastMessage("5");
							
								e1.remove();
						
								Bukkit.broadcastMessage("6");
								OnPlace.i = 0;
								
								evt.getPlayer().sendMessage(ChatColor.GOLD + "YOU REMOVED THIS MAGIC LEVER :C");
								
						}
						
					}
					
					
				}
				
			
			}
			
		
			
		}
		
		
	}
}
