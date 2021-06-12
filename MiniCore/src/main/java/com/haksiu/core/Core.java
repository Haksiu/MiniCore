package com.haksiu.core;

import com.haksiu.core.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("heal").setExecutor(new heal());
        getCommand("feed").setExecutor(new feed());
        getCommand("workbench").setExecutor(new workbench());
        getCommand("enderchest").setExecutor(new enderchest());
        getCommand("day").setExecutor(new day());
        getCommand("night").setExecutor(new night());

        System.out.println("MiniCore by Haksiu uruchamia się");
    }

    @Override
    public void onDisable() {
        System.out.println("MiniCore by Haksiu wylacza sie");
    }
}
