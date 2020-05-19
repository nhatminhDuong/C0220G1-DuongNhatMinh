package com.codegym.controllers;

import com.codegym.models.Operands;
import com.codegym.services.CalculatingService;
import com.codegym.services.DivisionByZeroException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CalculatorController {
    @Autowired
    CalculatingService calculatingService;

    @GetMapping("/")
    public String calculate(Model model) {
        model.addAttribute("operands", new Operands());
        return "index";
    }

    @PostMapping("/addition")
    public String sum(@ModelAttribute Operands operands, Model model) {
        double sum = calculatingService.getSum(operands);
        String result = "Result: sum = " + sum;
        model.addAttribute("result", result);
        return "index";
    }

    @PostMapping("/subtraction")
    public String difference(@ModelAttribute Operands operands, Model model) {
        double difference = calculatingService.getDifference(operands);
        String result = "Result: difference = " + difference;
        model.addAttribute("result", result);
        return "index";
    }

    @PostMapping("/multiplication")
    public String product(@ModelAttribute Operands operands, Model model) {
        double product = calculatingService.getProduct(operands);
        String result = "Result: product = " + product;
        model.addAttribute("result", result);
        return "index";
    }

    @PostMapping("/division")
    public String division(@ModelAttribute Operands operands, Model model) {
        String result;
        try {
            double quotient = calculatingService.getQuotient(operands);
            result = "Result: quotient = " + quotient;
        } catch (DivisionByZeroException e) {
            result = e.getMessage();
        }
        model.addAttribute("result", result);
        return "index";
    }
}
