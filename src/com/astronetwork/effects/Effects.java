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
			if (!p.hasPermission("astroeffects.speed")) {
				p.sendMessage(ChatColor.RED + "Just_Niico says: YOU DO NOT HAVE PERMISSION!");
			} else {
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 3000, 1));
				p.sendMessage(ChatColor.GREEN + "The great Just_Niico and Lexxus have gave you the Speed to fight!");
				p.sendMessage(ChatColor.GREEN + "LONG LIVE JUST_NIICO AND LEXUSS!");
				p.sendMessage(ChatColor.LIGHT_PURPLE + "We all love them really <3 Rectoph loves them the most." + ChatColor.RED + "BUT YOU LOVE MARK OR BAN");
				return true;
		}
		}
			if (cmd.getName().equalsIgnoreCase("strength")) {
				if (!p.hasPermission("astroeffects.strength")) {
					p.sendMessage(ChatColor.RED + "Just_Niico says: YOU DO NOT HAVE PERMISSION!");
				} else {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 3000, 1));
					p.sendMessage(ChatColor.GREEN + "The great Just_Niico and Lexxus have gave you the Strength to fight!");
					p.sendMessage(ChatColor.GREEN + "LONG LIVE JUST_NIICO AND LEXUSS!");
					p.sendMessage(ChatColor.LIGHT_PURPLE + "We all love them really <3 Rectoph loves them the most." + ChatColor.RED + "BUT YOU LOVE MARK OR BAN");
					return true;
				}
			}
			if (cmd.getName().equalsIgnoreCase("invis")) {
				if (!p.hasPermission("astroeffects.invis")) {
				p.sendMessage(ChatColor.RED + "Just_Niico says: YOU DO NOT HAVE PERMISSION!");	
				} else {
					p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 3000, 1));
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 3000, 1));
					p.sendMessage(ChatColor.GREEN + "The great Just_Niico and Lexxus have made you Invisible!");
					p.sendMessage(ChatColor.GREEN + "LONG LIVE JUST_NIICO AND LEXUSS!");
					p.sendMessage(ChatColor.LIGHT_PURPLE + "We all love them really <3 Rectoph loves them the most." + ChatColor.RED + "BUT YOU LOVE MARK OR BAN");
					return true;
				}
			}
			if (cmd.getName().equalsIgnoreCase("haste")) {
				if (!p.hasPermission("astroeffects.haste")) {
					p.sendMessage(ChatColor.RED + "Just_Niico says: YOU DO NOT HAVE PERMISSION!");
				}
				p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 3000, 1));
				p.sendMessage(ChatColor.GREEN + "The great Just_Niico and Lexuss gave you the Haste to dig faster than anyone!");
				p.sendMessage(ChatColor.GREEN + "LONG LIVE JUST_NIICO AND LEXUSS!");
				p.sendMessage(ChatColor.LIGHT_PURPLE + "We all love them really <3 Rectoph loves them the most." + ChatColor.RED + "BUT YOU LOVE MARK OR BAN");
				return true;
			}
			if (cmd.getName().equalsIgnoreCase("regen")) {
				if (!p.hasPermission("astroeffects.regen")) {
					p.sendMessage(ChatColor.RED + "Just_Niico says: YOU DO NOT HAVE PERMISSION!");
				}
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 3000, 1));
				p.sendMessage(ChatColor.GREEN + "The great Just_Niico and Lexuss gave you the Regen to gain more hearts!");
				p.sendMessage(ChatColor.GREEN + "LONG LIVE JUST_NIICO AND LEXUSS!");
				p.sendMessage(ChatColor.LIGHT_PURPLE + "We all love them really <3 Rectoph loves them the most." + ChatColor.RED + "BUT YOU LOVE MARK OR BAN");
				return true;
			}
			if (cmd.getName().equalsIgnoreCase("jump")) {
				if (!p.hasPermission("astroeffects.jumpboost")) {
					p.sendMessage(ChatColor.RED + "Just_Niico says: YOU DO NOT HAVE PERMISSION!");
				}
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 3000, 1));
				p.sendMessage(ChatColor.GREEN + "The great Just_Niico and Lexuss gave you the Jump boost to jump higher!");
				p.sendMessage(ChatColor.GREEN + "LONG LIVE JUST_NIICO AND LEXUSS!");
				p.sendMessage(ChatColor.LIGHT_PURPLE + "We all love them really <3 Rectoph loves them the most." + ChatColor.RED + "BUT YOU LOVE MARK OR BAN");
				return true;
			}
			if (cmd.getName().equalsIgnoreCase("nv")) {
				if (!p.hasPermission("astroeffects.nightvision")) {
					p.sendMessage(ChatColor.RED + "Just_Niico says: YOU DO NOT HAVE PERMISSION!");
				}
				p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 3000, 1));
				p.sendMessage(ChatColor.GREEN + "The great Just_Niico and Lexuss gave you the night vision to see in the dark!");
				p.sendMessage(ChatColor.GREEN + "LONG LIVE JUST_NIICO AND LEXUSS!");
				p.sendMessage(ChatColor.LIGHT_PURPLE + "We all love them really <3 Rectoph loves them the most." + ChatColor.RED + "BUT YOU LOVE MARK OR BAN");
				return true;
			}
			return true;
	}
		
	
}
