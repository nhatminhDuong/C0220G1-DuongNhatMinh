package com.codegym.controllers;

import com.codegym.models.AccompaniedService;
import com.codegym.models.Contract;
import com.codegym.models.DetailContract;
import com.codegym.services.AccompaniedServiceService;
import com.codegym.services.ContractService;
import com.codegym.services.DetailContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DetailContractController {
    @Autowired
    DetailContractService detailContractService;

    @Autowired
    ContractService contractService;

    @Autowired
    AccompaniedServiceService accompaniedServiceService;

    @ModelAttribute("contractList")
    public List<Contract> contractList() {
        return contractService.findAll();
    }

    @ModelAttribute("accompaniedServiceList")
    public List<AccompaniedService> accompaniedServiceList() {
        return accompaniedServiceService.findAll();
    }

    @GetMapping("/add-detail-contract")
    public String showAddDetailContractPage(Model model) {
        model.addAttribute("detailContract", new DetailContract());
        return "detail_contract/add";
    }

    @PostMapping("/add-detail-contract")
    public String addDetailContract(@ModelAttribute DetailContract detailContract, Model model) {
        detailContractService.save(detailContract);
        model.addAttribute("detailContract", detailContract);
        model.addAttribute("message", "Successfully added detail contract!");
        return "detail_contract/details";
    }
}
