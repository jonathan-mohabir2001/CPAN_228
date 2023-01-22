/*.
 *Code Base for Tekken Reborn Application.
  Jonathan Mohabir
 
  *New code written on test Branch, then merged on MASTER. 
  Refer to comments to see what code is being written, for 
  each lab. 
 */
package com.cpan252.tekkenreborn.controller;
//neccessary imports for the controller class.
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  // this is the controller class.
  @GetMapping("/")
  public String home() {
    return "home";
  }
// ROUTE FOR / PAGE which shows the home html page.



}