package com.codegym.services;

import com.codegym.models.Province;

import java.util.List;

public interface ProvinceService {
    List<Province> findAll();

    Province findById(Long id);

    void save(Province province);

    void delete(Long id);
}