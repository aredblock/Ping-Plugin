/**
 * Copyright (c) 2022 aredblock 
 */
package main;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * 
 * @author aredblock
 */
public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command befehl, String befehlsname, String[] args) {
		if (sender instanceof Player) {
			if (befehlsname.equalsIgnoreCase("ping")) {
				Player p = (Player) sender;

				p.sendMessage("Your Ping is : " + p.getPing());
			}
			
			if (befehlsname.equalsIgnoreCase("search-ping")) {
				Player p = (Player) sender;
				try {
					p.sendMessage("The Ping from " + args[0] + " is " + Bukkit.getPlayer(args[0]).getPing());
				} catch (Exception e) {
					p.sendMessage("Player not exist!");
				}
			}
		}
		
		return true;
	}
}
