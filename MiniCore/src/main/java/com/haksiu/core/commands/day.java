package com.haksiu.core.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class day implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
           Player p = (Player) sender;

           p.getWorld().setTime(1000);
           p.sendMessage("Ustawiłeś dzień na serwerze");
        }else {
            System.out.println("Tej komendy może użyć tylko gracz");
        }


        return true;
    }
}
