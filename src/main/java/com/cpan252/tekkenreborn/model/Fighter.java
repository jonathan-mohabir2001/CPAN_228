package com.cpan252.tekkenreborn.model;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class Fighter {

<<<<<<< HEAD
  // LAB-02 updates, the notblank annotation is used to validate that each field
  // is not blank

=======
  @NotBlank
>>>>>>> oldSnapShot
  private String name;

  private int damagePerHit;

  private int health;

  private double resistance;

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
