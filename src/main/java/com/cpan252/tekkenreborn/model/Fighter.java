package com.cpan252.tekkenreborn.model;

import lombok.Builder;
import lombok.Data;

// The Data annotation from Lombok generates getters, setters, toString, hashCode, and equals methods for the class based on the fields
// The Builder annotation generates a Builder pattern class, which provides a more readable way of constructing objects.
@Data
@Builder
public class Fighter {
  // Fields for Fighter table in database

  // LAB-02 updates, the notblank annotation is used to validate that each field
  // is not blank
  @NotBlank
  private String name;

  @NotBlank
  private int damagePerHit;

  @NotBlank
  private int health;

  @NotBlank
  private double resistance;

  private Anime animeFrom;

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
