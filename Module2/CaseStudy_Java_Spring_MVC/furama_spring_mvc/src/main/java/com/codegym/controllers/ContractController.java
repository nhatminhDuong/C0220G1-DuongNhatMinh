package com.codegym.controllers;

import com.codegym.models.Contract;
import com.codegym.models.Customer;
import com.codegym.models.Service;
import com.codegym.models.Staff;
import com.codegym.services.ContractService;
import com.codegym.services.CustomerService;
import com.codegym.services.ServiceService;
import com.codegym.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ContractController {
    @Autowired
    ContractService contractService;

    @Autowired
    StaffService staffService;

    @Autowired
    CustomerService customerService;

    @Autowired
    ServiceService serviceService;

    @ModelAttribute("staffList")
    public List<Staff> staffList() {
        return staffService.findAll();
    }

    @ModelAttribute("customerList")
    public List<Customer> customerList() {
        return customerService.findAll();
    }

    @ModelAttribute("serviceList")
    public List<Service> serviceList() {
        return serviceService.findAll();
    }

    @GetMapping("/add-contract")
    public String showAddContractPage(Model model) {
        model.addAttribute("contract", new Contract());
        return "contract/add";
    }

    @PostMapping("/add-contract")
    public String addContract(@ModelAttribute Contract contract, Model model) {
        contractService.save(contract);
        model.addAttribute("contract", contract);
        model.addAttribute("message", "Successfully addd new contract!");
        return "contract/details";
    }
}
