package com.cpan252.tekkenreborn.model;

//This Java class is a representation of the Fighter table in the database. 

/*
 * Comparing to Mongoose, this woiuld be the "schema" for the Fighter table
 */

// Necessary annotations: Builder, Data

import lombok.Builder;
import lombok.Data;

@Data
@Builder
// annotate across this class to tell Spring that this is a model.
public class Fighter {

  /*
   * This is the representation of the Fighter table in the database.
   * Relating back to mongoose, this would be the "schema" for the Fighter table
   * Considering this being java, types must be specified.
   * 
   */
  private String name;
  private int damagePerHit;
  private int health;
  private double resistance;
  private Anime animeFrom;
  // this Anime enum was changed to correct spelling of from.

  public enum Anime {
    NARUTO("Naruto"), BLEACH("Bleach"), ONE_PIECE("One Piece"), TEKKEN("Tekken");

    private String title;

    private Anime(String title) {
      this.title = title;
    }

    public String getTitle() {
      return title;
    }
  }
}
