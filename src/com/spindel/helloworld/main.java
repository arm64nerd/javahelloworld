package com.spindel.helloworld;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

	@Override
	public void onEnable() {
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
	// /hello <name> <amount>
	// <-- hey how are you!
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args ) {
		//hello
		if (label.equalsIgnoreCase("hello")) {
			
		  if (sender instanceof Player) {
			  Player player = (Player) sender;
			  player.sendMessage(ChatColor.RED + "Hey u freakin nerd!" + ChatColor.DARK_AQUA + " What tf are you doing?");
		  }
		  
		}
		
		return false;
	}
} 
