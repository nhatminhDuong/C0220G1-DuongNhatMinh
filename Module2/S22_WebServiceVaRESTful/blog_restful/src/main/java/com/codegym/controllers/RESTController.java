package com.codegym.controllers;

import com.codegym.models.Blog;
import com.codegym.models.Category;
import com.codegym.services.BlogService;
import com.codegym.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RESTController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    BlogService blogService;

    @GetMapping("/getCategoryList")
//    @RequestMapping(value = "/getCategoryList", method = RequestMethod.GET)
    public ResponseEntity<List<Category>> getCategoryList() {
        List<Category> categoryList = categoryService.findAll();

        return new ResponseEntity<List<Category>>(categoryList, HttpStatus.OK);
    }

    @GetMapping("/getBlogList")
    public ResponseEntity<List<Blog>> getBlogList() {
        List<Blog> blogList = blogService.findAll();

        return new ResponseEntity<List<Blog>>(blogList, HttpStatus.OK);
    }

    @GetMapping("/getCategory/{id}")
    public ResponseEntity<List<Blog>> getCategory(@PathVariable Integer id) {
        List<Blog> blogList = blogService.findAllByCategory(categoryService.findById(id));
        return new ResponseEntity<List<Blog>>(blogList, HttpStatus.OK);
    }

    @GetMapping("/getBlog/{id}")
    public ResponseEntity<Blog> getBlog(@PathVariable Integer id) {
        Blog blog = blogService.findById(id);
        return new ResponseEntity<Blog>(blog, HttpStatus.OK);
    }
}
