package com.codegym.controllers;

import com.codegym.models.*;
import com.codegym.services.StaffDepartmentService;
import com.codegym.services.StaffPositionService;
import com.codegym.services.StaffQualificationService;
import com.codegym.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StaffController {
    @Autowired
    StaffService staffService;

    @Autowired
    StaffPositionService staffPositionService;

    @Autowired
    StaffQualificationService staffQualificationService;

    @Autowired
    StaffDepartmentService staffDepartmentService;

    @ModelAttribute("staffPositionList")
    public List<StaffPosition> staffPositionList() {
        return staffPositionService.findAll();
    }

    @ModelAttribute("staffQualificationList")
    public List<StaffQualification> staffQualificationList() {
        return staffQualificationService.findAll();
    }

    @ModelAttribute("staffDepartmentList")
    public List<StaffDepartment> staffDepartmentList() {
        return staffDepartmentService.findAll();
    }

    @GetMapping("/add-staff")
    public String showAddStaffPage(Model model) {
        model.addAttribute("staff", new Staff());
        return "staff/add";
    }

    @PostMapping("/add-staff")
    public String addStaff(@ModelAttribute Staff staff, Model model) {
        staffService.save(staff);
        model.addAttribute("staff", staff);
        model.addAttribute("message", "Successfully added new staff!");
        return "staff/details";
    }

}
