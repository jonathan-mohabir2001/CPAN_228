package com.cpan252.tekkenreborn.model;

import lombok.Builder;
import lombok.Data;
// import statement for lombok library
// POM contains this depency


@Data
// import the lombok library to generate getters and setters
@Builder



public class Fighter {

  private String name;
  private int damagePerHit;
  private int health;
  private double resistance;
  private Anime animeForm;

  public enum Anime {
    NARUTO("Naruto"), BLEACH("Bleach"), ONE_PIECE("One Piece"), TEKKEN("Tekken");

    private String title;

    private Anime(String title) {
      this.title= title;
    }

    public String getTitle() {
      return title;
    }
  }
}
