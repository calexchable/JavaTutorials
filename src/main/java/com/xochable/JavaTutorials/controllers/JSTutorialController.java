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

    @RequestMapping(value = "numbers")
    public String numbers(Model model) {
        model.addAttribute("title", "Numbers");

        return "number";
    }

    @RequestMapping(value = "numberMethods")
    public String numberMethods(Model model) {
        model.addAttribute("title", "Number Methods");

        return "numberMethods";
    }

    @RequestMapping(value = "arrays")
    public String arrays(Model model) {
        model.addAttribute("title", "Arrays");

        return "arrays";
    }

    @RequestMapping(value = "arrayMethods")
    public String arrayMethods(Model model) {
        model.addAttribute("title", "Array Methods");

        return "arrayMethods";
    }

    @RequestMapping(value = "arraySort")
    public String arraySort(Model model) {
        model.addAttribute("title", "Array Sort");

        return "arraySort";
    }

    @RequestMapping(value = "arrayIteration")
    public String arrayIteration(Model model) {
        model.addAttribute("title", "Array Iteration");

        return "arrayIteration";
    }

    @RequestMapping(value = "dates")
    public String dates(Model model) {
        model.addAttribute("title", "Dates");

        return "dates";
    }

    @RequestMapping(value = "dateFormats")
    public String dateFormats(Model model) {
        model.addAttribute("title", "Date Formats");

        return "dateFormats";
    }

    @RequestMapping(value = "dateGetMethods")
    public String dateGetMethods(Model model) {
        model.addAttribute("title", "Date Get Methods");

        return "dateGetMethods";
    }

    @RequestMapping(value = "dateSetMethods")
    public String dateSetMethods(Model model) {
        model.addAttribute("title", "Date Set Methods");

        return "dateSetMethods";
    }

    @RequestMapping(value = "math")
    public String math(Model model) {
        model.addAttribute("title", "Math");

        return "math";
    }

    @RequestMapping(value = "random")
    public String random(Model model) {
        model.addAttribute("title", "Random");

        return "random";
    }

    @RequestMapping(value = "booleans")
    public String booleans(Model model) {
        model.addAttribute("title", "Booleans");

        return "booleans";
    }

    @RequestMapping(value = "comparisons")
    public String comparisons(Model model) {
        model.addAttribute("title", "Comparisons");

        return "comparisons";
    }

    @RequestMapping(value = "conditions")
    public String conditions(Model model) {
        model.addAttribute("title", "Conditions");

        return "conditions";
    }

    @RequestMapping(value = "switch")
    public String switchJavaScript(Model model) {
        model.addAttribute("title", "Switch");

        return "switch";
    }

    @RequestMapping(value = "loopFor")
    public String loopFor(Model model) {
        model.addAttribute("title", "For Loop");

        return "loopFor";
    }

    @RequestMapping(value = "loopWhile")
    public String loopWhile(Model model) {
        model.addAttribute("title", "While Loop");

        return "loopWhile";
    }
}
