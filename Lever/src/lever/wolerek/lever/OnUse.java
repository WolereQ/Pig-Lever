package lever.wolerek.lever;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Pig;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class OnUse implements Listener{

	
	@EventHandler
	public void onUse(PlayerInteractEvent evt){
		
		if(evt.getClickedBlock() !=null){
			
			if(evt.getClickedBlock().getType() == Material.LEVER){
			double radius = 6D;
			
			
			List<Entity> near = evt.getClickedBlock().getWorld().getEntities();
			
			for(Entity e : near){
				
				if(e.getLocation().distance(evt.getPlayer().getLocation()) <= radius){
					
					if(e.getType() == EntityType.ARMOR_STAND){
						
						if(e.getCustomName().equals("PIG1")){
						
						Bukkit.getWorld("world").spawn(evt.getPlayer().getLocation(), Pig.class);
						
						}
						
						
					}
					
				}
				}
				
			}
			
		}else{ 
			return;
		}
		
		
	}
}
