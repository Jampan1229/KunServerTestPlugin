package com.gmail.abcqqqwpvp2.kunservertestplugin;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class KunServerTestPlugin extends JavaPlugin implements Listener {
    //JavaPlugin抽象

    @Override
    public void onEnable() {
        //Plugin起動時の処理
        getLogger().info("KunServerTestPluginを有効化しました。");
        getServer().getPluginManager().registerEvents(this,this);

    }

    @Override
    public void onDisable() {
        //Plugin終了時の処理
        getLogger().info("KunServerTestPluginを無効化しました。");

    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        e.setJoinMessage(ChatColor.GOLD + p.getName() + "がサーバーに参加しました。");

    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        e.setQuitMessage(ChatColor.BLUE + p.getName() + "がサ－バ－を切断しました。");
    }
}