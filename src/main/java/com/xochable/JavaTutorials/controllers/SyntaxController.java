package com.xochable.JavaTutorials.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class SyntaxController {

    @RequestMapping(value = "syntax")
    public String syntax(Model model) {

        model.addAttribute("title", "Syntax");

        return "syntax";
    }
}
