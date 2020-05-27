package com.codegym.services;

import org.springframework.data.domain.Pageable;

public interface TimeSorter {
    Pageable isSortedByNewestFirst(boolean isSortedByNewestFirst, Pageable pageable);
}
