package com.sk89q.wepif;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;


public final class PermissionsResolverManager {

    private static PermissionsResolverManager instance;

    private PermissionsResolverManager() {}

    public static void initialize(Plugin plugin) {
        if (instance == null) instance = new PermissionsResolverManager();
    }

    public static PermissionsResolverManager getInstance() {
        if (instance == null) instance = new PermissionsResolverManager();
        return instance;
    }

    public boolean hasPermission(String worldName, Player player, String permission) {
        return player != null && player.hasPermission(permission);
    }

    public boolean inGroup(OfflinePlayer player, String group) {
        return false;
    }

    public String[] getGroups(OfflinePlayer player) {
        return new String[0];
    }
}
