package com.codegym.services.impl;

import com.codegym.services.TimeSorter;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class TimeSorterImpl implements TimeSorter {

    @Override
    public Pageable isSortedByNewestFirst(boolean isSortedByNewestFirst, Pageable pageable) {
        Pageable pageableSortByCreationTime;
        if (isSortedByNewestFirst) {
            pageableSortByCreationTime = PageRequest.of(pageable.getPageNumber(), 3,
                    Sort.by("creationTime").descending());
        } else {
            pageableSortByCreationTime = PageRequest.of(pageable.getPageNumber(), 3,
                    Sort.by("creationTime").ascending());
        }
        return pageableSortByCreationTime;
    }
}
