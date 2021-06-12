package com.haksiu.core.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class heal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(!(sender instanceof Player)) {
            System.out.println("Tej komendy może użyć tylko gracz");
        }

        Player p = (Player) sender;
        if(p.hasPermission("op")) {
            p.setHealth(20);
            p.sendMessage(ChatColor.GREEN + "Zostałeś uleczony");
        } else {
            p.sendMessage("Nie masz permisji aby użyć tej komendy");
        }
        return true;
    }
}
