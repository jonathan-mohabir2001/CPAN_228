/*
LAB 03 commits: 

 * Fighter Model updated to include a unique identifier for each fighter, and a timestamp for when created in the database.
 * JDBC implementations. 
 */

package com.cpan252.tekkenreborn.model;
import java.util.Date;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class Fighter {

  private Long id; 
  // lab 03 distinction: this is a Long instead of a String because it is a unique identifier
  // this data field gives a unique identifier to each fighter for the database
  @NotBlank
  private String name;

  @NotBlank
  private int damagePerHit;

  @NotBlank
  private int health;

  @NotBlank
  private double resistance;

  private Anime animeFrom;

  private final Date createdAt = new Date(); 
  // timestamp when a new fighter is created for resolving conflicts in the database. 
  //lab 03 addition. 

  public enum Anime {
    // Enum representing different anime series that fighters can belong to
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
