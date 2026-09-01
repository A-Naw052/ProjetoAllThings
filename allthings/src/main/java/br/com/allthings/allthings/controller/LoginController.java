package br.com.allthings.allthings.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {
    
     @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    
}
