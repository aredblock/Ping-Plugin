/**
 * Copyright (c) 2022 aredblock 
 */
package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * 
 * @author aredblock
 */
public class PingCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command command, String arg2, String[] args) {
		if (sender instanceof Player) {
			Player p = (Player) sender;

			// getPing
			var ping = p.getPing();

			p.sendMessage("§7Your ping is: §8" + ping);
		} else {
			return false;
		}
		return true;
	}

}
