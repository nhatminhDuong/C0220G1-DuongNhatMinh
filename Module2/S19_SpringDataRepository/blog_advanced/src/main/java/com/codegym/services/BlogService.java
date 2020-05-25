package com.codegym.services;

import com.codegym.models.Blog;
import com.codegym.models.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findAllSortByNewestFirst(Pageable pageable);

    Page<Blog> findAllSortByOldestFirst(Pageable pageable);

    Blog findById(Integer id);

    void save(Blog blog);

    void delete(Integer id);

    Page<Blog> findAllByCategory(Category category, Pageable pageable);

    Page<Blog> findAllByTitleContaining(String keyword, Pageable pageable);
}