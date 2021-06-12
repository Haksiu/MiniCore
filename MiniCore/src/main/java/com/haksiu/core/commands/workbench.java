package com.haksiu.core.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class workbench implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player p = (Player) sender;
            Location loc = p.getPlayer().getLocation();
            p.openWorkbench(loc, true);
        }else {
            System.out.println("Tej komendy może użyć tylko gracz");
        }

        return true;
    }
}
