package com.codegym.formatters;

import com.codegym.models.Category;
import com.codegym.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class CategoryFormatter implements Formatter<Category> {

    private CategoryService categoryService;

    @Autowired
    public CategoryFormatter(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public Category parse(String text, Locale locale) throws ParseException {
        return categoryService.findById(Integer.parseInt(text));
    }

    @Override
    public String print(Category object, Locale locale) {
        return "[" + object.getId() + ", " + object.getName() + "]";
    }
}