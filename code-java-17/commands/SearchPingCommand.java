/**
 * Copyright (c) 2022 aredblock 
 */
package commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * 
 * @author aredblock
 */
public class SearchPingCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String arg2, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;

			if (args[0] != null) {
				try {
					Player object = Bukkit.getPlayer(args[0]);
					int ping = object.getPing();

					p.sendMessage("§7 The ping from the player: §8" + object.getName() + "§7 is §8" + ping);// The ping
																											// from the
																											// player:
																											// "" is ""
				} catch (Exception e) {
					p.sendMessage("The player is not online or does not exist!");
				}
			}
		} else {
			return false;
		}
		return true;
	}

}
