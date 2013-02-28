package me.taylorkelly.mywarp.commands;

import java.util.HashMap;
import java.util.Map.Entry;

import me.taylorkelly.mywarp.LanguageManager;
import me.taylorkelly.mywarp.MyWarp;
import me.taylorkelly.mywarp.data.Warp;
import me.taylorkelly.mywarp.dataconnections.ConnectionManager;
import me.taylorkelly.mywarp.dataconnections.DataConnectionException;

import org.bukkit.command.CommandSender;

public class ImportCommand extends BasicCommand implements Command {
    private MyWarp plugin;

    public ImportCommand(MyWarp plugin) {
        super("import");
        this.plugin = plugin;
        setDescription(LanguageManager.getString("help.description.import"));
        setUsage("/warp import §9<SQLite|MySQL>");
        setArgumentRange(1, 1);
        setIdentifiers("import");
        setPermission("mywarp.admin.import");
    }

    @Override
    public void execute(CommandSender sender, String identifier,
            String[] args) throws CommandException {
        boolean importMySQL;

        if (args[0].equalsIgnoreCase("mysql")) {
            importMySQL = true;
        } else if (args[0].equalsIgnoreCase("sqlite")) {
            importMySQL = false;
        } else {
            throw new CommandException(LanguageManager.getString("error.import.invalid").replaceAll("%query%", args[0]));
        }

        try {
            int counter = 0;
            ConnectionManager importConnection = new ConnectionManager(
                    importMySQL, false, true, plugin);
            HashMap<String, Warp> importedWarps = importConnection.getMap();

            for (Entry<String, Warp> importedWarpEntry : importedWarps
                    .entrySet()) {
                String name = importedWarpEntry.getKey();
                Warp importedWarp = importedWarpEntry.getValue();

                if (plugin.getWarpList().warpExists(name)) {
                    sender.sendMessage(LanguageManager.getString(
                            "error.import.exists").replaceAll("%warp%", name));
                } else {
                    plugin.getWarpList().addWarp(name, importedWarp);
                    counter++;
                }
            }
            sender.sendMessage(counter + " warps were imported sucessfully.");
        } catch (DataConnectionException ex) {
            sender.sendMessage(LanguageManager
                    .getString("error.import.noConnection") + ex.getMessage());
        }
    }
}
