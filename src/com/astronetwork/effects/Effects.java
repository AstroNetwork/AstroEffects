package com.astronetwork.effects;
 
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
 
public class Effects extends JavaPlugin {
		
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
	    if ((sender instanceof ConsoleCommandSender)) {
	    	sender.sendMessage("Only players can run commands.");
	    	return true;
	    }
		Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("speed")) {
			if (!sender instanceof Player) {
				sender.sendMessage(ChatColor.RED + "The console is not allowed to run this command!")
			} else {
			if (!p.hasPermission("astroeffects.speed")) {
				p.sendMessage(ChatColor.RED + "Just_Niico says: YOU DO NOT HAVE PERMISSION!");
			} else {
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 3000, 1));
				p.sendMessage(ChatColor.GREEN + "The great Just_Niico and Lexxus have gave you the Speed to fight!");
				p.sendMessage(ChatColor.GREEN + "LONG LIVE JUST_NIICO AND LEXXUS!");
				p.sendMessage(ChatColor.LIGHT_PURPLE + "We all love them really <3 Rectoph loves them the most." + ChatColor.RED + "BUT YOU LOVE MARK OR BAN");
				return true;
		}
		}
		}
			if (cmd.getName().equalsIgnoreCase("strength")) {
							if (!sender instanceof Player) {
				sender.sendMessage(ChatColor.RED + "The console is not allowed to run this command!")
			}
			else {
				if (!p.hasPermission("astroeffects.strength")) {
					p.sendMessage(ChatColor.RED + "Just_Niico says: YOU DO NOT HAVE PERMISSION!");
				} else {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 3000, 1));
					p.sendMessage(ChatColor.GREEN + "The great Just_Niico and Lexxus have gave you the Strength to fight!");
					p.sendMessage(ChatColor.GREEN + "LONG LIVE JUST_NIICO AND LEXXUS!");
					p.sendMessage(ChatColor.LIGHT_PURPLE + "We all love them really <3 Rectoph loves them the most." + ChatColor.RED + "BUT YOU LOVE MARK OR BAN");
					return true;
				}
			}
			}
			if (cmd.getName().equalsIgnoreCase("invis")) {
				if (!sender instanceof Player) {
					sender.sendMessage("The console isn't allowed to run this command!")
				}
				else {
				if (!p.hasPermission("astroeffects.invis")) {
				p.sendMessage(ChatColor.RED + "Just_Niico says: YOU DO NOT HAVE PERMISSION!");	
				} else {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 3000, 1));
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 3000, 1));
					p.sendMessage(ChatColor.GREEN + "The great Just_Niico and Lexxus have made you Invisible!");
					p.sendMessage(ChatColor.GREEN + "LONG LIVE JUST_NIICO AND LEXXUS!");
					p.sendMessage(ChatColor.LIGHT_PURPLE + "We all love them really <3 Rectoph loves them the most." + ChatColor.RED + "BUT YOU LOVE MARK OR BAN");
					return true;
				}
			}
			}
			return true;
	}
		
	
}
