package com.codegym.controllers;

import com.codegym.models.Customer;
import com.codegym.models.CustomerType;
import com.codegym.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @Autowired
    CustomerTypeService customerTypeService;

    @Autowired
    CustomerSearchingService customerSearchingService;

    @Autowired
    ServiceService serviceService;

    @Autowired
    ContractService contractService;

    @ModelAttribute("customerTypeService")
    public CustomerTypeService customerTypeService() {
        return customerTypeService;
    }

    @ModelAttribute("customerTypeList")
    public List<CustomerType> customerTypeList() {
        return customerTypeService.findAll();
    }

    @ModelAttribute("serviceService")
    public ServiceService serviceService() {
        return serviceService;
    }

    @ModelAttribute("customerService")
    public CustomerService customerService() {
        return customerService;
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
    public String showCustomerListPage(@ModelAttribute("message") String message,
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

    @GetMapping("/view-customer/{id}")
    public String showViewCustomerPage(@PathVariable Integer id, @RequestParam Integer page, Model model) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            model.addAttribute("customer", customer);
            model.addAttribute("page", page);
            return "/customer/view";
        } else {
            return "common/error404";
        }
    }

    @GetMapping("/search-customer")
    public String showSearchCustomerPage(@ModelAttribute String message) {
        return "customer/search";
    }

    @PostMapping("/search-customer")
    public String showResult(@RequestParam Integer customerTypeId,
                             @RequestParam String fullName,
                             @RequestParam String identityNumber,
                             @RequestParam String phoneNumber,
                             @RequestParam String email,
                             @RequestParam String address,
                             @PageableDefault(size = 5) Pageable pageable, Model model) {
        if (customerTypeId.equals(0) && fullName.equals("") && identityNumber.equals("") && phoneNumber.equals("")
                && email.equals("") && address.equals("")) {
            model.addAttribute("message", "Please enter information to search!");
            return "customer/search";
        }

        Page<Customer> customerList = null;
        if (!customerTypeId.equals(0)) {
            customerList = customerSearchingService.search(customerTypeId, fullName, identityNumber,
                    phoneNumber, email, address, pageable);
        } else {
            customerList = customerSearchingService.search(fullName, identityNumber, phoneNumber,
                    email, address, pageable);
        }

        model.addAttribute("customerList", customerList);

        model.addAttribute("customerTypeId", customerTypeId);
        model.addAttribute("fullName", fullName);
        model.addAttribute("identityNumber", identityNumber);
        model.addAttribute("phoneNumber", phoneNumber);
        model.addAttribute("email", email);
        model.addAttribute("address", address);

        return "customer/results";
    }

    @GetMapping("/current-customer")
    public String showCurrentCustomerListPage(@ModelAttribute("message") String message,
                                              @PageableDefault(size = 5) Pageable pageable, Model model) {
        model.addAttribute("contractInPeriodList", contractService.findContractsInPeriod(pageable));
        model.addAttribute("message", message);
        return "customer/current";
    }
}
