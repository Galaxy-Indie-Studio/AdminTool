package me.bigtallahasee.com.admintools.commands;

import me.bigtallahasee.com.admintools.AdminTools;
import org.bukkit.BanEntry;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import sun.tools.jconsole.AboutDialog;

import java.util.List;

import static org.bukkit.Bukkit.getServer;

public class BanCommands implements TabExecutor {
    Plugin plugin = AdminTools.getPlugin(AdminTools.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Player target = getServer().getPlayer(args[1]);
        if(player.isOp() || player.hasPermission("admintools.admin"))
        {
            if(args.length >= 0)
            {
                if(args[0].equalsIgnoreCase("ban"))
                {

                }
            }
        }

        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {







        return null;
    }
}
