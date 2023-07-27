package com.seosin.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    
    @GetMapping("/")
    public String home(Model model) {

        System.out.println("This is - HomeController.home");
        model.addAttribute("seosin", "서신");

        return "index";

    }
}
