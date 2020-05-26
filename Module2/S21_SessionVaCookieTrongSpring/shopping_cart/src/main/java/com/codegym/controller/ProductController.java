package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.security.PermitAll;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    ProductService productService;

    @ModelAttribute("cart")
    public Cart setUpCart() {
        return new Cart();
    }

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("products", productService.findAll());
        return "product/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("product", new Product());
        return "product/create";
    }

    @PostMapping("/save")
    public String save(Product product, RedirectAttributes redirectAttributes) {
        product.setId((int) (Math.random() * 10000));
        productService.save(product);
        redirectAttributes.addFlashAttribute("successMessage", "Successfully added new product!");
        return "redirect:/";
    }

    @GetMapping("{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "product/edit";
    }

    @PostMapping("/update")
    public String update(Product product, RedirectAttributes redirectAttributes) {
        productService.update(product.getId(), product);
        redirectAttributes.addFlashAttribute("successMessage", "Successfully modified product!");
        return "redirect:/";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "product/delete";
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirectAttributes) {
        productService.delete(product.getId());
        redirectAttributes.addFlashAttribute("successMessage", "Successfully removed product!");
        return "redirect:/";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "product/view";
    }

    @GetMapping("/shopping")
    public String shopping(Model model) {
        model.addAttribute("products", productService.findAll());
        return "product/shopping";
    }

    @PostMapping("/choose")
    public String choose(@ModelAttribute("cart") Cart cart,
                         @ModelAttribute("product") Product product, RedirectAttributes redirectAttributes) {
        cart.addProduct(product);
        redirectAttributes.addFlashAttribute("successMessage", "Successfully added!");
        return "redirect:/shopping";
    }

    @GetMapping("/{id}/remove")
    public String removeProduct(@PathVariable Integer id, @ModelAttribute("cart") Cart cart,
                                RedirectAttributes redirectAttributes) {
        cart.removeProduct(id);
        redirectAttributes.addFlashAttribute("successMessage", "Successfully removed product!");
        return ("redirect:/cart");
    }

    @GetMapping("/removeAll")
    public String removeAll(@ModelAttribute("cart") Cart cart,
                            RedirectAttributes redirectAttributes) {
        cart.removeAll();
        redirectAttributes.addFlashAttribute("successMessage", "Successfully removed all products!");
        return ("redirect:/cart");
    }
}
