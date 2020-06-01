package com.codegym.controllers;

import com.codegym.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public String goHome() {
        return "/common/index";
    }

    @GetMapping("/create-customer")
    public String showCreatCustomerForm() {
        return "customer/create";
    }
}
