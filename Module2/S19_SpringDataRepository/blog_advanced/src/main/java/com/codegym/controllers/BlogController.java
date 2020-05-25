package com.codegym.controllers;

import com.codegym.models.Blog;
import com.codegym.models.Category;
import com.codegym.services.BlogService;
import com.codegym.services.CategoryService;
import com.codegym.services.TimeGenerationService;
import com.codegym.services.TimeSorter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    TimeGenerationService timeGenerationService;

    @Autowired
    TimeSorter timeSorter;

    static Boolean currentSortedStatus = true;

    @ModelAttribute("categories")
    public List<Category> categories() {
        return categoryService.findAll();
    }

    @GetMapping("/create-blog")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping("/create-blog")
    public ModelAndView saveBlog(@ModelAttribute("blog") Blog blog) {
        blog.setCreationTime(timeGenerationService.autoGenerate());
        blogService.save(blog);
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        modelAndView.addObject("message", "Successfully created new Blog!");
        return modelAndView;
    }

    @GetMapping("/blogs")
    public ModelAndView listBlogs(@RequestParam("keyword") Optional<String> keyword,
                                  @PageableDefault(size = 3) Pageable pageable,
                                  @ModelAttribute("message") String message) {
        Pageable pageableSortByCreationTime = timeSorter.isSortedByNewestFirst(currentSortedStatus, pageable);

        String lastKeyWord = null;
        Page<Blog> blogs = null;
        if (keyword.isPresent()) {
            lastKeyWord = keyword.get();
            blogs = blogService.findAllByTitleContaining(lastKeyWord, pageableSortByCreationTime);
        } else {
            blogs = blogService.findAll(pageableSortByCreationTime);
        }
        ModelAndView modelAndView = new ModelAndView("/blog/list");
        modelAndView.addObject("blogs", blogs);
        modelAndView.addObject("message", message);
        currentSortedStatus = !currentSortedStatus;
        modelAndView.addObject("newStatus", currentSortedStatus);
        modelAndView.addObject("keyword", lastKeyWord);
        return modelAndView;
    }

    @GetMapping("/edit-blog/{id}")
    public ModelAndView showEditForm(@PathVariable Integer id) {
        Blog blog = blogService.findById(id);
        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/edit");
            modelAndView.addObject("blog", blog);
            return modelAndView;
        } else {
            return new ModelAndView("/error404");
        }
    }

    @PostMapping("/edit-blog")
    public String updateBlog(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes) {
        blog.setCreationTime(timeGenerationService.autoGenerate());
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("message", "Successfully edited!");
        return "redirect:/blogs";
    }

    @GetMapping("/delete-blog/{id}")
    public ModelAndView showDeleteForm(@PathVariable Integer id) {
        Blog blog = blogService.findById(id);
        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/delete");
            modelAndView.addObject("blog", blog);
            return modelAndView;
        } else {
            return new ModelAndView("/error404");
        }
    }

    @PostMapping("/delete-blog")
    public String deleteBlog(@ModelAttribute("blog") Blog blog, RedirectAttributes redirectAttributes) {
        blogService.delete(blog.getId());
        redirectAttributes.addFlashAttribute("message", "Successfully deleted!");
        return "redirect:/blogs";
    }

    @GetMapping("/view-blog/{id}")
    public ModelAndView showViewForm(@PathVariable Integer id) {
        Blog blog = blogService.findById(id);
        if (blog != null) {
            ModelAndView modelAndView = new ModelAndView("/blog/view");
            modelAndView.addObject("blog", blog);
            return modelAndView;
        } else {
            return new ModelAndView("/error404");
        }
    }
}
