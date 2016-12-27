package test.wolerek;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

//import test.wolerek.listeners.Move;
import test.wolerek.listeners.leaver.GetCommand;
import test.wolerek.listeners.leaver.OnDestroy;
import test.wolerek.listeners.leaver.OnPlace;
import test.wolerek.listeners.leaver.OnUse;

public class Main extends JavaPlugin{

	private static Main inst;
	
	public void onEnable(){
		inst = this;
		
		//Bukkit.getPluginManager().registerEvents(new Move(), this);
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
