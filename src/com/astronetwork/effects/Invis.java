package com.astronetwork.effects;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
 
public class Invis extends JavaPlugin {
  
	public  ArrayList<Player> cooldown = new ArrayList<Player>();
 
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		final Player player = (Player)sender;
 
		String white = ChatColor.WHITE.toString();
		String green = ChatColor.GREEN.toString();
		String dblue = ChatColor.DARK_BLUE.toString();
		String blue = ChatColor.BLUE.toString();
		String red = ChatColor.RED.toString();
 
		if ((cmd.getName().equalsIgnoreCase("invisibility")) || (cmd.getName().equalsIgnoreCase("invis"))) {
			if (this.cooldown.contains(player)) {
				player.sendMessage(dblue + "[" + blue + "AstroEffects" + dblue + "] " + red + "Please wait" + red + ChatColor.ITALIC + " one minute" + red + " before using this command again!");
				return true;
			}
			if (!sender.hasPermission("AstroEffects.invis")) {
				sender.sendMessage(red + "You do not have permission!"); } else {
					if (args.length == 0) {
						player.sendMessage(dblue + "[" + blue + "AstroEffects" + dblue + "]" + green + " You now have a" + white + " SPEED 1 " + green + "buff for 5 minutes!");
						player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 3000, 1));
						this.cooldown.add(player);
						Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable() {
        	  public void run() {
        		  Invis.this.cooldown.remove(player);
        	  }
						}
						, 1200L);
						return true;
					}if (args.length == 1) {
						@SuppressWarnings("deprecation")
						Player targetPlayer = player.getServer().getPlayer(args[0]);
						targetPlayer.sendMessage(dblue + "[" + blue + "AstroEffects" + dblue + "]" + green + " You now have a" + white + " SPEED 1 " + green + "buff!");
						targetPlayer.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 3000, 1));
					}
				}
			}
		return false;
	}
}
