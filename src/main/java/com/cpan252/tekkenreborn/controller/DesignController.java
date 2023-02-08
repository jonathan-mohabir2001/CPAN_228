package com.cpan252.tekkenreborn.controller;

import java.util.EnumSet;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cpan252.tekkenreborn.model.Fighter;

import com.cpan252.tekkenreborn.model.Fighter.Anime;
import com.cpan252.tekkenreborn.repository.FighterRepository;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/design")

public class DesignController {

  @Autowired
  private FighterRepository fighterRepository;

  @GetMapping
  public String design() {
    return "design";
  }

  @ModelAttribute
  public void animes(Model model) {
    var animes = EnumSet.allOf(Anime.class).stream()
        .map(Anime::getTitle).collect(Collectors.toList());
    model.addAttribute("animes", animes);
    log.info("animes converted to string:  {}", animes);
  }

  @ModelAttribute
  public Fighter fighter() {
    return Fighter
        .builder()
        .build();
  }

  @PostMapping
  public String processDesign(Fighter fighter, BindingResult result) {
    if (result.hasErrors()) {
      return "design";
    }
    if (fighter.getHealth() <= 1000) {
      result.rejectValue("health", "fighter.health.invalid");
      return "design";
    }
    if (fighter.getDamagePerHit() >= 100) {
      result.rejectValue("damage", "fighter.damage.invalid");
      return "design";
    }
    if (fighter.getResistance() < 0 || fighter.getResistance() > 10 || fighter.getResistance() % 2 != 0) {
      result.rejectValue("resistance", "fighter.resistance.invalid");
      return "design";
    }

    fighterRepository.save(fighter);
    return "redirect:/design";
  }

}
// old merge code