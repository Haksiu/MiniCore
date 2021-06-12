package com.haksiu.core.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class enderchest implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;
            Inventory ec = p.getEnderChest();
            p.openInventory(ec);
            p.sendMessage("Otworzyłeś enderchest");
        }else {
            System.out.println("Tej komendy może użyć tylko gracz");
        }
        return true;
    }
}
