package com.codegym.repositories;

import com.codegym.models.Blog;
import com.codegym.models.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findAllByCategory(Category category, Pageable pageable);

    Page<Blog> findAllByOrderByCreationTimeAsc(Pageable pageable);

    Page<Blog> findAllByOrderByCreationTimeDesc(Pageable pageable);

    Page<Blog> findAllByTitleContaining(String keyword, Pageable pageable);
}
