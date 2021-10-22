package me.bigtallahasee.com.admintools;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class AdminTools extends JavaPlugin {



    Logger logger = Logger.getLogger(AdminTools.class.getName());



    @Override
    public void onEnable() {
        System.out.println("AdminTools has been enabled!");







        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        System.out.println("AdiminTools has been disabled!");
    }
}
