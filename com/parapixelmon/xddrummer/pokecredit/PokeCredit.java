package com.parapixelmon.xddrummer.pokecredit;

public class PokeCredit extends JavaPlugin{
  
  Logger log = Bukkit.getLogger();
  
  @Override
  public void onEnable(){
    log.info("Enabling PokeCredit Plugin..");
    saveDefaultConfig();
  }
  
  @Override
  public void onDisable(){
    log.info("Disabling PokeCredit Plugin..");
  }
  
}
