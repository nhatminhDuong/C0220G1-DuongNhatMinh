package com.codegym.services.impl;

import com.codegym.models.Blog;
import com.codegym.models.Category;
import com.codegym.repositories.BlogRepository;
import com.codegym.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Page<Blog> findAllSortByNewestFirst(Pageable pageable) {
        return blogRepository.findAllByOrderByCreationTimeDesc(pageable);
    }

    @Override
    public Page<Blog> findAllSortByOldestFirst(Pageable pageable) {
        return blogRepository.findAllByOrderByCreationTimeAsc(pageable);
    }

    @Override
    public Blog findById(Integer id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void delete(Integer id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> findAllByCategory(Category category, Pageable pageable) {
        return blogRepository.findAllByCategory(category, pageable);
    }

    @Override
    public Page<Blog> findAllByTitleContaining(String keyword, Pageable pageable) {
        return blogRepository.findAllByTitleContaining(keyword, pageable);
    }
}
