package com.cpan252.tekkenreborn.controller;

import org.springframework.stereotype.Controller;


//Controller for the home page
@Controller
public class HomeController {


    // Method to return the home page
    public String home() {
        return "home";
    }



    
}
