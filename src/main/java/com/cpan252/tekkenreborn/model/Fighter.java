package com.cpan252.tekkenreborn.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Fighter {

  @NotBlank
  private String name;
  @NotBlank
  private int damagePerHit;
  @NotBlank
  private int health;
  @NotBlank
  private double resistance;
  @NotBlank
  private Anime animeFrom;

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

  public static Object builder() {
    return null;
  }
}
