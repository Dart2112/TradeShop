package org.shanerx.tradeshop;

import org.bukkit.Bukkit;

import java.util.ArrayList;

public class Utils {

	final String plugin = "TradeShop";
	final String author = "Lori00";
	final String version = Bukkit.getPluginManager().getPlugin("TradeShop").getDescription().getVersion();
	final String website = null;
	
	final String PREFIX = "&a[&eTradeShop&a] ";

	public String getPluginName() {
		return plugin;
	}
	
	public String getVersion() {
		return version;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getWebsite() {
		return website;
	}
	
	public String getPrefix() {
		return PREFIX;
	}
	
	public ArrayList<String> admins = new ArrayList<String>();
}
