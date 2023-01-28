package com.cpan252.tekkenreborn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// this is an annotation, this module is imported from SpringFrameWork.

public class HomeController {
  // now,this controller will create a route to return a home page.

  @GetMapping("/")
  public String home() {
    return "home";
  }
  // public method of String type to return a home page. notice, its just passed
  // as a string statement.
}
// a new plain java Class is created.
