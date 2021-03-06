package com.mccraftaholics.warpportals.commands;

import java.util.HashMap;

import org.bukkit.command.CommandSender;

import com.mccraftaholics.warpportals.bukkit.CommandHandler;
import com.mccraftaholics.warpportals.bukkit.CommandHandler.CommandHandlerObject;
import com.mccraftaholics.warpportals.objects.CoordsPY;

public class CmdLoad extends CommandHandlerObject {

	public static boolean handle(CommandSender sender, String[] args, CommandHandler main) {
		if (sender.hasPermission("warpportals.admin.op.load")) {
			main.mPortalManager.mPortalDataManager.clearPortalMap();
			main.mPortalManager.mPortalDestManager.mPortalDestMap = new HashMap<String, CoordsPY>();
			main.mPortalManager.loadData();
			sender.sendMessage(main.mCC + "Portal data loaded from portals.yml.");
		}
		return true;
	}

}
