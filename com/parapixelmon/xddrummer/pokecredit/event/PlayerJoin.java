package com.parapixelmon.xddrummer.pokecredit.event;

public class PlayerJoin implements Listener {

  PokeCredit plugin;

  @EventHandler
  public static void onPlayerJoin(PlayerJoinEvent e){
    
    Player p = e.getPlayer();
    
    if(!plugin.getConfig().contains("creditBal." + p.getUniqueId()){
     
    }
    
  }

}
