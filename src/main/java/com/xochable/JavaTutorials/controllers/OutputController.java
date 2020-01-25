package com.xochable.JavaTutorials.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class OutputController {

    @RequestMapping(value = "output")
    public String output(Model model) {

        model.addAttribute("title", "Output");

        return "output";

    }
}
