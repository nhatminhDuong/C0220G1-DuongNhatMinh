package com.codegym.controllers;

import com.codegym.models.Customer;
import com.codegym.models.CustomerType;
import com.codegym.services.CustomerService;
import com.codegym.services.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerTypeService customerTypeService;

    @ModelAttribute("customerTypeList")
    public List<CustomerType> customerTypeList() {
        return customerTypeService.findAll();
    }

    @GetMapping("/add-customer")
    public String showAddCustomerPage(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer/add";
    }

    @PostMapping("/add-customer")
    public String addCustomer(@ModelAttribute Customer customer, Model model) {
        customerService.save(customer);
        model.addAttribute("customer", customer);
        model.addAttribute("message", "Successfully added new customer!");
        return "customer/details";
    }

    @GetMapping("/list-customer")
    public String showListCustomerPage() {
        return "customer/list";
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
