package com.cpan252.tekkenreborn.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
// again this provides us boilerplate. 
public class FighterPool {
  
  // a list of fighters 

  private List<Fighter> fighters;
  
  public FighterPool(){
    this.fighters = new ArrayList<>();
    
  }

  public void addFighter(Fighter fighter) {
    this.fighters.add(fighter);
  }


}
