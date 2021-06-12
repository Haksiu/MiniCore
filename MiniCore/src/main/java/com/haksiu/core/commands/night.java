package com.haksiu.core.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class night implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if(!(sender instanceof Player)) {
            System.out.println("Tej komendy może użyć tylko gracz");
        }

        Player p = (Player) sender;

        p.getWorld().setTime(13000);
        p.sendMessage("Ustawiłeś noc na serwerze");
        return true;
    }
}
