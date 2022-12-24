package main;

import org.bukkit.plugin.java.JavaPlugin;

import commands.PingCommand;
import commands.SearchPingCommand;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		setCommand();
	}
	
	private void setCommand() {
		getCommand("ping").setExecutor(new PingCommand());
		getCommand("search-ping").setExecutor(new SearchPingCommand());
	}
}
