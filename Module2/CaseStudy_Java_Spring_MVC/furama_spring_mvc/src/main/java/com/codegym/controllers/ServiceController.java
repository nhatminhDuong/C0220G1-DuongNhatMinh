package com.codegym.controllers;

import com.codegym.models.Customer;
import com.codegym.models.RentType;
import com.codegym.models.Service;
import com.codegym.models.ServiceType;
import com.codegym.services.RentTypeService;
import com.codegym.services.ServiceService;
import com.codegym.services.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ServiceController {
    @Autowired
    ServiceService serviceService;

    @Autowired
    RentTypeService rentTypeService;

    @Autowired
    ServiceTypeService serviceTypeService;

    @ModelAttribute("rentTypeService")
    public RentTypeService rentTypeService() {
        return rentTypeService;
    }

    @ModelAttribute("serviceTypeService")
    public ServiceTypeService serviceTypeService() {
        return serviceTypeService;
    }

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

    @GetMapping("/list-service")
    public String showListServicePage(@ModelAttribute("message") String message,
                                       @PageableDefault(size = 5) Pageable pageable, Model model) {
        model.addAttribute("serviceList", serviceService.findAll(pageable));
        model.addAttribute("message", message);
        return "service/list";
    }

    @GetMapping("/edit-service/{id}")
    public String showEditServicePage(@PathVariable Integer id, Model model) {
        Service service = serviceService.findById(id);
        if (service != null) {
            model.addAttribute("service", service);
            return "/service/edit";
        } else {
            return "common/error404";
        }
    }

    @PostMapping("/edit-service")
    public String updateService(@ModelAttribute Service service, RedirectAttributes redirectAttributes) {
        serviceService.save(service);
        redirectAttributes.addFlashAttribute("message",
                "Successfully edited service (ID = " + service.getId() + ")!");
        return "redirect:/list-service";
    }

    @GetMapping("/remove-service/{id}")
    public String showRemoveServicePage(@PathVariable Integer id, Model model) {
        Service service = serviceService.findById(id);
        if (service != null) {
            model.addAttribute("service", service);
            return "service/remove";
        } else {
            return "common/error404";
        }
    }

    @PostMapping("/remove-service")
    public String removeService(@ModelAttribute Service service, RedirectAttributes redirectAttributes) {
        serviceService.delete(service.getId());
        redirectAttributes.addFlashAttribute("message",
                "Successfully removed service (ID = " + service.getId() + ")!");
        return "redirect:/list-service";
    }

    @GetMapping("/search-service")
    public String showSearchServicePage(@ModelAttribute String message) {
        return "service/search";
    }

}
