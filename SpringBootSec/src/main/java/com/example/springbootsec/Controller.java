package com.example.springbootsec;


import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/")
    String home(){
        return "home";
    }
}
