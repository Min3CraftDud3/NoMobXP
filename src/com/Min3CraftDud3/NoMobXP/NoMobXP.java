package com.Min3CraftDud3.NoMobXP;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class NoMobXP extends JavaPlugin	implements Listener{
	public void onEnable(){
		getServer().getPluginManager().registerEvents(this,this);
	}
	@EventHandler
	public void onDeath(EntityDeathEvent e){
		e.setDroppedExp(0);
	}
}
