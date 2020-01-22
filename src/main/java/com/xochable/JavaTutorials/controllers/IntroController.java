package com.xochable.JavaTutorials.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class IntroController {

    @RequestMapping(value = "intro")
    public String intro(Model model) {

        model.addAttribute("title", "Introduction");

        return "intro";
    }
}
