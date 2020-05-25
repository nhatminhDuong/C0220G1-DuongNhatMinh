package com.codegym.services;

import com.codegym.models.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TimeSorter {
    Pageable isSortedByNewestFirst(boolean isSortedByNewestFirst, Pageable pageable);
}
