package com.codegym.controllers;

import com.codegym.models.Customer;
import com.codegym.models.CustomerType;
import com.codegym.services.CustomerService;
import com.codegym.services.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerTypeService customerTypeService;

    @ModelAttribute("customerTypeService")
    public CustomerTypeService customerTypeService() {
        return customerTypeService;
    }

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
    public String showListCustomerPage(@ModelAttribute("message") String message,
                                       @PageableDefault(size = 5) Pageable pageable, Model model) {
        model.addAttribute("customerList", customerService.findAll(pageable));
        model.addAttribute("message", message);
        return "customer/list";
    }

    @GetMapping("/edit-customer/{id}")
    public String showEditCustomerPage(@PathVariable Integer id, Model model) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            model.addAttribute("customer", customer);
            return "/customer/edit";
        } else {
            return "common/error404";
        }
    }

    @PostMapping("/edit-customer")
    public String updateCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("message",
                "Successfully edited customer (ID = " + customer.getId() + ")!");
        return "redirect:/list-customer";
    }

    @GetMapping("/remove-customer/{id}")
    public String showRemoveCustomerPage(@PathVariable Integer id, Model model) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            model.addAttribute("customer", customer);
            return "/customer/remove";
        } else {
            return "common/error404";
        }
    }

    @PostMapping("/remove-customer")
    public String removeCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {
        customerService.delete(customer.getId());
        redirectAttributes.addFlashAttribute("message",
                "Successfully removed customer (ID = " + customer.getId() + ")!");
        return "redirect:/list-customer";
    }

    @GetMapping("/search-customer")
    public String showSearchCustomerPage() {
        return "customer/search";
    }
}
