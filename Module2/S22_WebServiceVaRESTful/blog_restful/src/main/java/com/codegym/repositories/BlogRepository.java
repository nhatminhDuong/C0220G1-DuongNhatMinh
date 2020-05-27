package com.codegym.repositories;

import com.codegym.models.Blog;
import com.codegym.models.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
    List<Blog> findAllBy();

    Page<Blog> findAllByCategory(Category category, Pageable pageable);

    Page<Blog> findAllByOrderByCreationTimeAsc(Pageable pageable);

    Page<Blog> findAllByOrderByCreationTimeDesc(Pageable pageable);

    Page<Blog> findAllByTitleContaining(String keyword, Pageable pageable);

    List<Blog> findAllByCategory(Category category);
}
