package com.codegym.controllers;

import com.codegym.models.Customer;
import com.codegym.models.RentType;
import com.codegym.models.Service;
import com.codegym.models.ServiceType;
import com.codegym.services.RentTypeService;
import com.codegym.services.ServiceService;
import com.codegym.services.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ServiceController {
    @Autowired
    ServiceService serviceService;

    @Autowired
    RentTypeService rentTypeService;

    @Autowired
    ServiceTypeService serviceTypeService;

    @ModelAttribute("rentTypeList")
    public List<RentType> rentTypeList() {
        return rentTypeService.findAll();
    }

    @ModelAttribute("serviceTypeList")
    public List<ServiceType> serviceTypeList() {
        return serviceTypeService.findAll();
    }

    @GetMapping("/add-service")
    public String showAddServicePage(Model model) {
        model.addAttribute("service", new Service());
        return "/service/add";
    }

    @PostMapping("/add-service")
    public String addService(@ModelAttribute Service service, Model model) {
        serviceService.save(service);
        model.addAttribute("service", service);
        model.addAttribute("message", "Successfully added new service!");
        return "service/details";
    }
}
