package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class FormController {
    @Autowired
    UserService userService;

    @GetMapping("/")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            return "form";
        } else {
            userService.save(user);
            String message = "Successfully registered!";
            model.addAttribute("message", message);
            model.addAttribute("user", user);
            return "welcome";
        }
    }
}
