package com.xochable.JavaTutorials.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class HomeController {
    public String index(Model model) {

        model.addAttribute("title", "Java Tutorials");
    }
}
