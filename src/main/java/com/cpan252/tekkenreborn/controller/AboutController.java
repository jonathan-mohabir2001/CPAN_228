/*
 * 
 * LAB 01 - Creating a new Controller Class for the About Page.
 */

package com.cpan252.tekkenreborn.controller;

//neccessary imports for the controller class.
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {
  // this is the controller class.
  @GetMapping("/about")
  // route at "/about"

  public String about() {

    return "about";
    // return the about.html file.
  }
}
