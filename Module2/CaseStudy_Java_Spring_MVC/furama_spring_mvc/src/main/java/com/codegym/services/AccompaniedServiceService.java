package com.codegym.services;

import com.codegym.models.AccompaniedService;

import java.util.List;

public interface AccompaniedServiceService {
    List<AccompaniedService> findAll();

    AccompaniedService findById(Integer id);

    void save(AccompaniedService accompaniedService);

    void delete(Integer id);
}
