package com.example.ch8_ex4;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController{

    @RequestMapping("/home/{color}")
    public String home(
            @PathVariable String color,
            Model page){
        page.addAttribute("username", "Jane");
        page.addAttribute("color", color);
        return "home.html";
    }
}