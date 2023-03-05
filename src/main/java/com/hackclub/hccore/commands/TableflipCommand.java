package com.hackclub.hccore.commands;

import com.hackclub.hccore.HCCorePlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TableflipCommand implements CommandExecutor {

  private static final String TABLEFLIP = "(╯°□°）╯︵ ┻━┻";

  public TableflipCommand(HCCorePlugin plugin) {
  }

  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String alias, String[] args) {
    if (!(sender instanceof Player player)) {
      sender.sendMessage(ChatColor.RED + "You must be a player to use this");
      return true;
    }

    if (args.length == 0) {
      player.chat(TableflipCommand.TABLEFLIP);
    } else {
      player.chat(String.join(" ", args) + " " + TableflipCommand.TABLEFLIP);
    }

    return true;
  }
}
