package me.taylorkelly.mywarp.permissions;

import me.taylorkelly.mywarp.WarpSettings;
import me.taylorkelly.mywarp.data.WarpLimit;
import me.taylorkelly.mywarp.timer.Cooldown;
import me.taylorkelly.mywarp.timer.Warmup;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class WarpPermissions {
    private PermissionsHandler permissionsHandler;

    public WarpPermissions(Plugin plugin) {
        permissionsHandler = new PermissionsHandler(plugin);
    }

    public boolean hasPermission(Player player, final String node) {
        return permissionsHandler.hasPermission(player, node);
    }

    public boolean playerHasGroup(Player player, final String group) {
        return permissionsHandler.playerHasGroup(player, group);
    }

    public boolean canAccessAll(Player player) {
        return permissionsHandler.hasPermission(player,
                "mywarp.admin.accessall");
    }

    public boolean canModifyAll(Player player) {
        return permissionsHandler.hasPermission(player,
                "mywarp.admin.modifyall");
    }

    public boolean canWarpToWorld(Player player, String worldName) {
        return permissionsHandler.hasPermission(player, "mywarp.warp.world."
                + worldName);
    }

    public boolean canWarpInsideWorld(Player player) {
        return permissionsHandler.hasPermission(player,
                "mywarp.warp.world.currentworld");
    }

    public boolean createSignWarp(Player player) {
        return permissionsHandler.hasPermission(player,
                "mywarp.warp.sign.create");
    }

    public boolean signWarp(Player player) {
        return permissionsHandler
                .hasPermission(player, "mywarp.warp.sign.warp");
    }

    public boolean disobeyTotalLimit(Player player) {
        return permissionsHandler.hasPermission(player,
                "mywarp.limit.total.unlimited");
    }

    public boolean disobeyPrivateLimit(Player player) {
        return permissionsHandler.hasPermission(player,
                "mywarp.limit.private.unlimited");
    }

    public boolean disobeyPublicLimit(Player player) {
        return permissionsHandler.hasPermission(player,
                "mywarp.limit.public.unlimited");
    }

    public int maxTotalWarps(Player player) {
        for (WarpLimit warpLimit : WarpSettings.warpLimits) {
            if (permissionsHandler.hasPermission(player, "mywarp.limit."
                    + warpLimit.name)) {
                return warpLimit.maxTotal;
            }
        }
        return WarpSettings.defaultLimit.maxTotal;
    }

    public int maxPrivateWarps(Player player) {
        for (WarpLimit warpLimit : WarpSettings.warpLimits) {
            if (permissionsHandler.hasPermission(player, "mywarp.limit."
                    + warpLimit.name)) {
                return warpLimit.maxPrivate;
            }
        }
        return WarpSettings.defaultLimit.maxPrivate;
    }

    public int maxPublicWarps(Player player) {
        for (WarpLimit warpLimit : WarpSettings.warpLimits) {
            if (permissionsHandler.hasPermission(player, "mywarp.limit."
                    + warpLimit.name)) {
                return warpLimit.maxPublic;
            }
        }
        return WarpSettings.defaultLimit.maxPublic;
    }

    public boolean disobeyCooldown(Player player) {
        return permissionsHandler.hasPermission(player,
                "mywarp.cooldown.disobey");
    }

    public Cooldown getCooldown(Player player) {
        for (Cooldown cooldown : WarpSettings.warpCooldowns) {
            if (permissionsHandler.hasPermission(player, "mywarp.cooldown."
                    + cooldown.name)) {
                return cooldown;
            }
        }
        return WarpSettings.defaultCooldown;
    }

    public boolean disobeyWarmup(Player player) {
        return permissionsHandler
                .hasPermission(player, "mywarp.warmup.disobey");
    }

    public boolean disobeyWarmupMoveAbort(Player player) {
        return permissionsHandler.hasPermission(player,
                "mywarp.warmup.disobey.moveabort");
    }

    public boolean disobeyWarmupDmgAbort(Player player) {
        return permissionsHandler.hasPermission(player,
                "mywarp.warmup.disobey.dmgabort");
    }

    public Warmup getWarmup(Player player) {
        for (Warmup warmup : WarpSettings.warpWarmups) {
            if (permissionsHandler.hasPermission(player, "mywarp.warmup."
                    + warmup.name)) {
                return warmup;
            }
        }
        return WarpSettings.defaultWarmup;
    }
}