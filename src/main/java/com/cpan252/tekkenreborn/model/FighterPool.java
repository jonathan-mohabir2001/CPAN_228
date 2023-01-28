package com.cpan252.tekkenreborn.model;

/*
 * This clas is a representation of the FighterPool table in the database. 
 * Each user will have a fighter pool that will be stored in the database. 
 * Fighter Model previously created will be used to create a list of fighters
 */
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
// Anotate across this class with the Data annotation
public class FighterPool {
  // a list of fighters
  private List<Fighter> fighters;
  // ArrayList is a class that implements the List interface

  public FighterPool() {
    this.fighters = new ArrayList<>();
  }
  // This is a constructor for the FighterPool class

  public void addFighter(Fighter fighter) {
    this.fighters.add(fighter);
  }
  // This is a method that adds a fighter to the list of fighters

}