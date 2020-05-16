package com.codegym.controllers;

import com.codegym.model.Sandwich;
import com.codegym.services.SandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CondimentsController {
    @Autowired
    SandwichService sandwichService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String chooseCondiments(Model model) {
        model.addAttribute("sandwich", new Sandwich());
        return "choose";
    }

    @PostMapping("/choose")
    public String displayCondiments(@ModelAttribute Sandwich sandwich, Model model) {
        String addedCondiments = sandwichService.showAddedCondiments(sandwich);
        model.addAttribute("addedCondiments", addedCondiments);
        return "display";
    }
}
