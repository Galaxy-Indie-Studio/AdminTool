package me.bigtallahasee.com.admintools.commands;

import me.bigtallahasee.com.admintools.AdminTools;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.List;

public class StaffCommands implements TabExecutor {
    Plugin plugin = AdminTools.getPlugin(AdminTools.class);



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(player.isOp() || player.hasPermission("admintool.admin"))
        {
            if(args.length >= 0)
            {
                if(args[0].equalsIgnoreCase(""))
                {
                    if(args[1].equalsIgnoreCase(""))
                    {

                    }
                }
                if(args[0].equalsIgnoreCase(""))
                {

                }
            }
        }
        if(args.length >= 0)
        {
         if(args[0].equalsIgnoreCase("staff"))
         {
             if(args[1].equalsIgnoreCase("report"))
             {
                 
             }
         }
        }else{
            player.sendMessage(ChatColor.RED +"You don't have proper permission to");
            player.sendMessage(ChatColor.RED +"execute this command!");
            player.sendMessage(ChatColor.RED +"Required permission (admintool.admin)");
        }






        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {








        return null;
    }
}
