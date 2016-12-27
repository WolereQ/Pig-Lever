package lever.wolerek;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


import lever.wolerek.lever.GetCommand;
import lever.wolerek.lever.OnDestroy;
import lever.wolerek.lever.OnPlace;
import lever.wolerek.lever.OnUse;

public class Main extends JavaPlugin{

	private static Main inst;
	
	public void onEnable(){
		inst = this;
		

		Bukkit.getPluginManager().registerEvents(new OnPlace(), this);
		Bukkit.getPluginManager().registerEvents(new OnDestroy(), this);
		Bukkit.getPluginManager().registerEvents(new OnUse(), this);
		getCommand("lever").setExecutor(new GetCommand());
		
	}
	
	
	public void onDisable(){
		inst = null;
	}
	
	
	
	public static Main getInst(){
		return inst;
	}
}
