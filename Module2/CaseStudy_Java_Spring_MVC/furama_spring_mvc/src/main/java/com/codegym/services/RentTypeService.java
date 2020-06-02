package com.codegym.services;

import com.codegym.models.RentType;

import java.util.List;

public interface RentTypeService {
    List<RentType> findAll();

    RentType findById(Integer id);

    void save(RentType rentType);

    void delete(Integer id);
}
