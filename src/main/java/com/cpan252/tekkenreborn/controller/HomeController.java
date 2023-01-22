/*.
 *Code Base for Tekken Reborn Application.
  Jonathan Mohabir
 
  *New code written on test Branch, then merged on MASTER. 
  Refer to comments to see what code is being written, for 
  each lab. 
 */
package com.cpan252.tekkenreborn.controller;
import org.springframework.stereotype.Controller;
// ensure the controller component is imported. 
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  // this is the controller class.
  @GetMapping("/")
  public String home() {
    return "home";
  }
  //this method returns a home page with the message Home.
}

/*
 * The controller acts as a dispatcher for the application. 
 * Endpoint is the URL that the user will type in to access the application.
 */
