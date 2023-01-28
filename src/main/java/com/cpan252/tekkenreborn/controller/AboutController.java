package com.cpan252.tekkenreborn.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// Necessary imports for controllers and mapping




@Controller
// Annotation with Controller to tell Spring that this is a controller
public class AboutController {

  @GetMapping("/about")
  public String about() {
    return "about";
  }
  // new about controller for routing to about page

}
