package test.wolerek.listeners.leaver;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class OnPlace implements Listener{

	public static int i = 0;
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlace(BlockPlaceEvent evt){
		
		ItemStack is = new ItemStack(Material.LEVER, 1);
		ItemMeta m = is.getItemMeta();
		m.setDisplayName(ChatColor.GOLD + "Pig's lever");
		is.setItemMeta(m);
		
		
		
		if(evt.getPlayer().getItemInHand().isSimilar(is)){
			
			if(i >= 1){
				evt.getPlayer().sendMessage(ChatColor.DARK_RED + "ON THIS WORLD CAN BE ONLY ONE MAGIC LEVER!!");
				evt.setCancelled(true);
				return;
			}
			
			int x = evt.getBlockPlaced().getX();
			int y = evt.getBlockPlaced().getY();
			int z = evt.getBlockPlaced().getZ();
			
			ArmorStand as = Bukkit.getWorld("world").spawn(new Location(Bukkit.getWorld("world"), x+0.5, y-1, z+0.5), ArmorStand.class);
			
			as.setCollidable(false);
			as.setCustomName("PIG1");
			as.setCustomNameVisible(false);
			as.setVisible(false);
			as.setSmall(true);
			as.setAI(false);
			as.setGravity(false);
			as.setHealth(20);
			as.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, Integer.MAX_VALUE, Integer.MAX_VALUE));
			as.setNoDamageTicks(Integer.MAX_VALUE);

			i = 1;
			
			evt.getPlayer().sendMessage(ChatColor.GOLD + "MESSAGE :DD");
		}
		
		
	}
}
