package com.xochable.JavaTutorials.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class StatementController {

    @RequestMapping(value = "statement")
    public String statment(Model model) {

        model.addAttribute("title", "Statement");

        return "statements";
    }
}
