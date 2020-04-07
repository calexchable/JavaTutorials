package com.xochable.JavaTutorials.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class JSTutorialController {

    @RequestMapping(value = "intro")
    public String intro(Model model) {

        model.addAttribute("title", "Introduction");

        return "intro";
    }

    @RequestMapping(value = "where-to")
    public String whereTo(Model model) {

        model.addAttribute("title", "Where To");

        return "whereTo";
    }

    @RequestMapping(value = "output")
    public String output(Model model) {

        model.addAttribute("title", "Output");

        return "output";
    }

    @RequestMapping(value = "statement")
    public String statement(Model model) {

        model.addAttribute("title", "Statement");

        return "statements";
    }

    @RequestMapping(value = "syntax")
    public String syntax(Model model) {

        model.addAttribute("title", "Syntax");

        return "syntax";
    }

    @RequestMapping(value = "comments")
    public String comments(Model model) {

        model.addAttribute("title", "Comments");

        return "comments";
    }

    @RequestMapping(value = "variables")
    public String variables(Model model) {

        model.addAttribute("title", "Variables");

        return "variables";
    }

    @RequestMapping(value = "operators")
    public String operators(Model model) {

        model.addAttribute("title", "Operators");

        return "operators";
    }

    @RequestMapping(value = "arithmetic")
    public String arithmetic(Model model) {

        model.addAttribute("title", "Arithmetic");

        return "arithmetic";
    }

    @RequestMapping(value = "assignment")
    public String assignment(Model model) {

        model.addAttribute("title", "Assignment");

        return "assignment";
    }

    @RequestMapping(value = "datatypes")
    public String dataTypes(Model model) {

        model.addAttribute("title", "Data Types");

        return "dataTypes";
    }

    @RequestMapping(value = "functions")
    public String functions(Model model) {
        model.addAttribute("title", "Functions");

        return "functions";
    }

    @RequestMapping(value = "objects")
    public String objects(Model model) {
        model.addAttribute("title", "Objects");

        return "objects";
    }

    @RequestMapping(value = "events")
    public String events(Model model) {
        model.addAttribute("title", "Events");

        return "events";
    }

    @RequestMapping(value = "strings")
    public String strings(Model model) {
        model.addAttribute("title", "Strings");

        return "strings";
    }

    @RequestMapping(value = "stringMethods")
    public String stringMethods(Model model) {
        model.addAttribute("title", "String Methods");

        return "stringMethods";
    }
}
