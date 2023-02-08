package com.cpan252.tekkenreborn.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

@Table
public class Fighter {
  @Id
  private Long id;
  // new field for the fighters id.
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
