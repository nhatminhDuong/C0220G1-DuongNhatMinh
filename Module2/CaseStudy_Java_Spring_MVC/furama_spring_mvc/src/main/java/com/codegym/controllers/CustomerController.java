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

    @GetMapping("/add-customer")
    public String showAddCustomerPage() {
        return "customer/add";
    }

    @GetMapping("/view-customer")
    public String showViewCustomerPage() {
        return "customer/view";
    }

    @GetMapping("/edit-customer")
    public String showEditCustomerPage() {
        return "customer/edit";
    }

    @GetMapping("/remove-customer")
    public String showRemoveCustomerForm() {
        return "customer/remove";
    }
}
